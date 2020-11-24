package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Wait
  extends /* key */ StringDictionary[js.Any] {
  
  var error: js.UndefOr[
    js.Function3[/* model */ this.type, /* xhr */ js.Any, /* options */ js.Object, Unit]
  ] = js.native
  
  var success: js.UndefOr[
    js.Function3[/* model */ this.type, /* response */ js.Any, /* options */ js.Object, Unit]
  ] = js.native
  
  @JSName("wait")
  var wait_FWait: js.UndefOr[Boolean] = js.native
}
object Wait {
  
  @scala.inline
  def apply(): Wait = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Wait]
  }
  
  @scala.inline
  implicit class WaitOps[Self <: Wait] (val x: Self) extends AnyVal {
    
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
    def setError(value: (Wait, /* xhr */ js.Any, /* options */ js.Object) => Unit): Self = this.set("error", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setSuccess(value: (Wait, /* response */ js.Any, /* options */ js.Object) => Unit): Self = this.set("success", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setWait(value: Boolean): Self = this.set("wait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
  }
}
