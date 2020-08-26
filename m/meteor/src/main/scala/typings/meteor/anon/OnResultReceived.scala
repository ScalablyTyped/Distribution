package typings.meteor.anon

import typings.meteor.EJSONable
import typings.meteor.EJSONableProperty
import typings.meteor.meteorMod.globalError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnResultReceived[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */] extends js.Object {
  var onResultReceived: js.UndefOr[
    js.Function2[
      /* error */ js.UndefOr[globalError | typings.meteor.meteorMod.Meteor.Error], 
      /* result */ js.UndefOr[Result], 
      Unit
    ]
  ] = js.native
  var returnStubValue: js.UndefOr[Boolean] = js.native
  var throwStubExceptions: js.UndefOr[Boolean] = js.native
  @JSName("wait")
  var wait_FOnResultReceived: js.UndefOr[Boolean] = js.native
}

object OnResultReceived {
  @scala.inline
  def apply[/* <: typings.meteor.EJSONable | (js.Array[typings.meteor.EJSONable | typings.meteor.EJSONableProperty]) | typings.meteor.EJSONableProperty */ Result](): OnResultReceived[Result] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnResultReceived[Result]]
  }
  @scala.inline
  implicit class OnResultReceivedOps[Self <: OnResultReceived[_], /* <: typings.meteor.EJSONable | (js.Array[typings.meteor.EJSONable | typings.meteor.EJSONableProperty]) | typings.meteor.EJSONableProperty */ Result] (val x: Self with OnResultReceived[Result]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnResultReceived(
      value: (/* error */ js.UndefOr[globalError | typings.meteor.meteorMod.Meteor.Error], /* result */ js.UndefOr[Result]) => Unit
    ): Self = this.set("onResultReceived", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnResultReceived: Self = this.set("onResultReceived", js.undefined)
    @scala.inline
    def setReturnStubValue(value: Boolean): Self = this.set("returnStubValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnStubValue: Self = this.set("returnStubValue", js.undefined)
    @scala.inline
    def setThrowStubExceptions(value: Boolean): Self = this.set("throwStubExceptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowStubExceptions: Self = this.set("throwStubExceptions", js.undefined)
    @scala.inline
    def setWait(value: Boolean): Self = this.set("wait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
  }
  
}

