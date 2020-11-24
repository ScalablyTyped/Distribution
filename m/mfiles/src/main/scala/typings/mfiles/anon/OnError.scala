package typings.mfiles.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnError extends js.Object {
  
  var Finally: js.UndefOr[js.Function0[Unit]] = js.native
  
  var OnError: js.UndefOr[
    js.Function3[/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String, Unit]
  ] = js.native
  
  var OnSuccess: js.UndefOr[js.Function0[Unit]] = js.native
}
object OnError {
  
  @scala.inline
  def apply(): OnError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnError]
  }
  
  @scala.inline
  implicit class OnErrorOps[Self <: OnError] (val x: Self) extends AnyVal {
    
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
    def setFinally(value: () => Unit): Self = this.set("Finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFinally: Self = this.set("Finally", js.undefined)
    
    @scala.inline
    def setOnError(value: (/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String) => Unit): Self = this.set("OnError", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("OnError", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: () => Unit): Self = this.set("OnSuccess", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSuccess: Self = this.set("OnSuccess", js.undefined)
  }
}
