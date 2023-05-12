package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCustomdeploymentprotectionrulesTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CustomdeploymentprotectionrulesTotalcount
}
object ApplicationjsonCustomdeploymentprotectionrulesTotalcount {
  
  inline def apply(applicationSlashjson: CustomdeploymentprotectionrulesTotalcount): ApplicationjsonCustomdeploymentprotectionrulesTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCustomdeploymentprotectionrulesTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonCustomdeploymentprotectionrulesTotalcount] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: CustomdeploymentprotectionrulesTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
