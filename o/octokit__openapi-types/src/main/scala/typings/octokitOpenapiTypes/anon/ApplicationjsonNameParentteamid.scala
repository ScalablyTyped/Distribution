package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonNameParentteamid extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: NameParentteamid
}
object ApplicationjsonNameParentteamid {
  
  inline def apply(applicationSlashjson: NameParentteamid): ApplicationjsonNameParentteamid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonNameParentteamid]
  }
  
  extension [Self <: ApplicationjsonNameParentteamid](x: Self) {
    
    inline def setApplicationSlashjson(value: NameParentteamid): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
