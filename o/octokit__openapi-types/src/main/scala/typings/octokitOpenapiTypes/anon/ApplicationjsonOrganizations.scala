package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonOrganizations extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Organizations
}
object ApplicationjsonOrganizations {
  
  inline def apply(applicationSlashjson: Organizations): ApplicationjsonOrganizations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonOrganizations]
  }
  
  extension [Self <: ApplicationjsonOrganizations](x: Self) {
    
    inline def setApplicationSlashjson(value: Organizations): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
