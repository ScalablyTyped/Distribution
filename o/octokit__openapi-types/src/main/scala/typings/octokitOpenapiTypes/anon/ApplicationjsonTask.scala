package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonTask extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Task
}
object ApplicationjsonTask {
  
  inline def apply(applicationSlashjson: Task): ApplicationjsonTask = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonTask] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Task): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
