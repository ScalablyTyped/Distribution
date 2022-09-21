package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonPrerelease extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Prerelease
}
object ApplicationjsonPrerelease {
  
  inline def apply(applicationSlashjson: Prerelease): ApplicationjsonPrerelease = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonPrerelease]
  }
  
  extension [Self <: ApplicationjsonPrerelease](x: Self) {
    
    inline def setApplicationSlashjson(value: Prerelease): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
