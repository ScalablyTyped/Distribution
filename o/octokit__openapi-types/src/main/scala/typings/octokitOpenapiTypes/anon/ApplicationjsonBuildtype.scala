package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBuildtype extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Buildtype
}
object ApplicationjsonBuildtype {
  
  inline def apply(applicationSlashjson: Buildtype): ApplicationjsonBuildtype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBuildtype]
  }
  
  extension [Self <: ApplicationjsonBuildtype](x: Self) {
    
    inline def setApplicationSlashjson(value: Buildtype): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
