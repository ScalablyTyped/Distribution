package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonProductionenvironment extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Productionenvironment
}
object ApplicationjsonProductionenvironment {
  
  inline def apply(applicationSlashjson: Productionenvironment): ApplicationjsonProductionenvironment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonProductionenvironment]
  }
  
  extension [Self <: ApplicationjsonProductionenvironment](x: Self) {
    
    inline def setApplicationSlashjson(value: Productionenvironment): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
