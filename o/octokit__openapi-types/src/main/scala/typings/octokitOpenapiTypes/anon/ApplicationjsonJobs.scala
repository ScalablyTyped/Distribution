package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonJobs extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Jobs
}
object ApplicationjsonJobs {
  
  inline def apply(applicationSlashjson: Jobs): ApplicationjsonJobs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonJobs]
  }
  
  extension [Self <: ApplicationjsonJobs](x: Self) {
    
    inline def setApplicationSlashjson(value: Jobs): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
