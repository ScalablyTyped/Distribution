package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonExcludemetadata extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Excludemetadata
}
object ApplicationjsonExcludemetadata {
  
  inline def apply(applicationSlashjson: Excludemetadata): ApplicationjsonExcludemetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonExcludemetadata]
  }
  
  extension [Self <: ApplicationjsonExcludemetadata](x: Self) {
    
    inline def setApplicationSlashjson(value: Excludemetadata): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
