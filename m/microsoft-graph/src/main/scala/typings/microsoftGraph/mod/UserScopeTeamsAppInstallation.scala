package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserScopeTeamsAppInstallation
  extends StObject
     with TeamsAppInstallation {
  
  var chat: js.UndefOr[NullableOption[Chat]] = js.undefined
}
object UserScopeTeamsAppInstallation {
  
  inline def apply(): UserScopeTeamsAppInstallation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserScopeTeamsAppInstallation]
  }
  
  extension [Self <: UserScopeTeamsAppInstallation](x: Self) {
    
    inline def setChat(value: NullableOption[Chat]): Self = StObject.set(x, "chat", value.asInstanceOf[js.Any])
    
    inline def setChatNull: Self = StObject.set(x, "chat", null)
    
    inline def setChatUndefined: Self = StObject.set(x, "chat", js.undefined)
  }
}
