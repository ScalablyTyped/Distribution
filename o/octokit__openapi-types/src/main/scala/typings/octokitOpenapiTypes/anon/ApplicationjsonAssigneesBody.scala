package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAssigneesBody extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: AssigneesBody
}
object ApplicationjsonAssigneesBody {
  
  inline def apply(applicationSlashjson: AssigneesBody): ApplicationjsonAssigneesBody = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAssigneesBody]
  }
  
  extension [Self <: ApplicationjsonAssigneesBody](x: Self) {
    
    inline def setApplicationSlashjson(value: AssigneesBody): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
