package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonExcludeattachments extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Excludeattachments
}
object ApplicationjsonExcludeattachments {
  
  inline def apply(applicationSlashjson: Excludeattachments): ApplicationjsonExcludeattachments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonExcludeattachments]
  }
  
  extension [Self <: ApplicationjsonExcludeattachments](x: Self) {
    
    inline def setApplicationSlashjson(value: Excludeattachments): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
