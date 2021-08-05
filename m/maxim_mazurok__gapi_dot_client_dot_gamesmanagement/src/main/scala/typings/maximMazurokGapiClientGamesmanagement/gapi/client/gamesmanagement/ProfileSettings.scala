package typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileSettings extends StObject {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#profileSettings`. */
  var kind: js.UndefOr[String] = js.undefined
  
  var profileVisible: js.UndefOr[Boolean] = js.undefined
}
object ProfileSettings {
  
  inline def apply(): ProfileSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileSettings]
  }
  
  extension [Self <: ProfileSettings](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProfileVisible(value: Boolean): Self = StObject.set(x, "profileVisible", value.asInstanceOf[js.Any])
    
    inline def setProfileVisibleUndefined: Self = StObject.set(x, "profileVisible", js.undefined)
  }
}
