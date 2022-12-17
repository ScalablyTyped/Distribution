package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonExcludeownerprojects extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Excludeownerprojects
}
object ApplicationjsonExcludeownerprojects {
  
  inline def apply(applicationSlashjson: Excludeownerprojects): ApplicationjsonExcludeownerprojects = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonExcludeownerprojects]
  }
  
  extension [Self <: ApplicationjsonExcludeownerprojects](x: Self) {
    
    inline def setApplicationSlashjson(value: Excludeownerprojects): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
