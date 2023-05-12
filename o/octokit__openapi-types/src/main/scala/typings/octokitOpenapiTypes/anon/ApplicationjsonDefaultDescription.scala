package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDefaultDescription extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DefaultDescription
}
object ApplicationjsonDefaultDescription {
  
  inline def apply(applicationSlashjson: DefaultDescription): ApplicationjsonDefaultDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDefaultDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonDefaultDescription] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: DefaultDescription): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
