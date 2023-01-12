package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonJob extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Job
}
object ApplicationjsonJob {
  
  inline def apply(applicationSlashjson: Job): ApplicationjsonJob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonJob] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Job): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
