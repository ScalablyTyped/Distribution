package typings.mfiles.anon

import typings.mfiles.IObjectVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnSuccess extends js.Object {
  
  var Finally: js.UndefOr[js.Function0[Unit]] = js.native
  
  var OnError: js.UndefOr[
    js.Function3[/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String, Unit]
  ] = js.native
  
  var OnSuccess: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.native
}
object OnSuccess {
  
  @scala.inline
  def apply(): OnSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnSuccess]
  }
  
  @scala.inline
  implicit class OnSuccessOps[Self <: OnSuccess] (val x: Self) extends AnyVal {
    
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
    def setOnSuccess(value: /* objectVersion */ IObjectVersion => Unit): Self = this.set("OnSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSuccess: Self = this.set("OnSuccess", js.undefined)
  }
}
