package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSelectedusernamesArray extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: SelectedusernamesArray
}
object ApplicationjsonSelectedusernamesArray {
  
  inline def apply(applicationSlashjson: SelectedusernamesArray): ApplicationjsonSelectedusernamesArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSelectedusernamesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonSelectedusernamesArray] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: SelectedusernamesArray): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
