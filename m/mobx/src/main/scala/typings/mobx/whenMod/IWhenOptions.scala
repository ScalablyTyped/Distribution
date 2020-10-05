package typings.mobx.whenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWhenOptions extends js.Object {
  var name: js.UndefOr[String] = js.native
  var onError: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.native
  /**
    * Experimental.
    * Warns if the view doesn't track observables
    */
  var requiresObservable: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object IWhenOptions {
  @scala.inline
  def apply(): IWhenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWhenOptions]
  }
  @scala.inline
  implicit class IWhenOptionsOps[Self <: IWhenOptions] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnError(value: /* error */ js.Any => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setRequiresObservable(value: Boolean): Self = this.set("requiresObservable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiresObservable: Self = this.set("requiresObservable", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

