package typings.mfiles

import typings.mfiles.MFiles.MFServerConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAuthenticationResultServerFinal extends js.Object {
  
  val ServerConnection: MFServerConnection = js.native
}
object IAuthenticationResultServerFinal {
  
  @scala.inline
  def apply(ServerConnection: MFServerConnection): IAuthenticationResultServerFinal = {
    val __obj = js.Dynamic.literal(ServerConnection = ServerConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthenticationResultServerFinal]
  }
  
  @scala.inline
  implicit class IAuthenticationResultServerFinalOps[Self <: IAuthenticationResultServerFinal] (val x: Self) extends AnyVal {
    
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
    def setServerConnection(value: MFServerConnection): Self = this.set("ServerConnection", value.asInstanceOf[js.Any])
  }
}
