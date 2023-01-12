package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonParentteamid extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Parentteamid
}
object ApplicationjsonParentteamid {
  
  inline def apply(applicationSlashjson: Parentteamid): ApplicationjsonParentteamid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonParentteamid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonParentteamid] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Parentteamid): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
