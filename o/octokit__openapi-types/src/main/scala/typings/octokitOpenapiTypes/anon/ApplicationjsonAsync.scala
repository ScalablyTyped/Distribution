package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAsync extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Async
}
object ApplicationjsonAsync {
  
  inline def apply(applicationSlashjson: Async): ApplicationjsonAsync = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAsync]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAsync] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Async): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
