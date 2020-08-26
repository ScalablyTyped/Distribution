package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options to determine which event handler or handlers are removed.
  */
@js.native
trait RemoveHandlerOptions extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
  /**
    * The handler to be removed. If not specified all handlers for the specified event type are removed.
    */
  var handler: js.UndefOr[String] = js.native
}

object RemoveHandlerOptions {
  @scala.inline
  def apply(): RemoveHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveHandlerOptions]
  }
  @scala.inline
  implicit class RemoveHandlerOptionsOps[Self <: RemoveHandlerOptions] (val x: Self) extends AnyVal {
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
    def setAsyncContext(value: js.Any): Self = this.set("asyncContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncContext: Self = this.set("asyncContext", js.undefined)
    @scala.inline
    def setHandler(value: String): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
  }
  
}

