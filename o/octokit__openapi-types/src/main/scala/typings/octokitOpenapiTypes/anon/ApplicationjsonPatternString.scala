package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonPatternString extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: PatternString
}
object ApplicationjsonPatternString {
  
  inline def apply(applicationSlashjson: PatternString): ApplicationjsonPatternString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonPatternString]
  }
  
  extension [Self <: ApplicationjsonPatternString](x: Self) {
    
    inline def setApplicationSlashjson(value: PatternString): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
