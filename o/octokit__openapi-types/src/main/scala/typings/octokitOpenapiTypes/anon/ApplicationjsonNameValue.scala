package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonNameValue extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: NameValue
}
object ApplicationjsonNameValue {
  
  inline def apply(applicationSlashjson: NameValue): ApplicationjsonNameValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonNameValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonNameValue] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: NameValue): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
