package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCodespacesTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CodespacesTotalcount
}
object ApplicationjsonCodespacesTotalcount {
  
  inline def apply(applicationSlashjson: CodespacesTotalcount): ApplicationjsonCodespacesTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCodespacesTotalcount]
  }
  
  extension [Self <: ApplicationjsonCodespacesTotalcount](x: Self) {
    
    inline def setApplicationSlashjson(value: CodespacesTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
