package typings.nextAuth.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextProviderProps extends js.Object {
  
  var options: js.UndefOr[SetOptionsParams] = js.native
  
  var session: js.UndefOr[Session_ | Null] = js.native
}
object ContextProviderProps {
  
  @scala.inline
  def apply(): ContextProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextProviderProps]
  }
  
  @scala.inline
  implicit class ContextProviderPropsOps[Self <: ContextProviderProps] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: SetOptionsParams): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setSession(value: Session_): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setSessionNull: Self = this.set("session", null)
  }
}
