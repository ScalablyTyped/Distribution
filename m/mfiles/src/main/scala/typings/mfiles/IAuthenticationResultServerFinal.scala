package typings.mfiles

import typings.mfiles.MFiles.MFServerConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAuthenticationResultServerFinal extends StObject {
  
  val ServerConnection: MFServerConnection
}
object IAuthenticationResultServerFinal {
  
  inline def apply(ServerConnection: MFServerConnection): IAuthenticationResultServerFinal = {
    val __obj = js.Dynamic.literal(ServerConnection = ServerConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthenticationResultServerFinal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAuthenticationResultServerFinal] (val x: Self) extends AnyVal {
    
    inline def setServerConnection(value: MFServerConnection): Self = StObject.set(x, "ServerConnection", value.asInstanceOf[js.Any])
  }
}
