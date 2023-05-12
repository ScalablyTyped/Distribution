package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonImplementation extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Implementation
}
object ApplicationjsonImplementation {
  
  inline def apply(applicationSlashjson: Implementation): ApplicationjsonImplementation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonImplementation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonImplementation] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Implementation): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
