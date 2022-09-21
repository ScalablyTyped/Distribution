package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSarif_ extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Sarif
}
object ApplicationjsonSarif_ {
  
  inline def apply(applicationSlashjson: Sarif): ApplicationjsonSarif_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSarif_]
  }
  
  extension [Self <: ApplicationjsonSarif_](x: Self) {
    
    inline def setApplicationSlashjson(value: Sarif): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
