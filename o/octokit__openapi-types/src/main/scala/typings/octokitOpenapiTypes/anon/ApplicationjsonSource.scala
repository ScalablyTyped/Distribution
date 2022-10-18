package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSource extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Source
}
object ApplicationjsonSource {
  
  inline def apply(applicationSlashjson: Source): ApplicationjsonSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSource]
  }
  
  extension [Self <: ApplicationjsonSource](x: Self) {
    
    inline def setApplicationSlashjson(value: Source): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
