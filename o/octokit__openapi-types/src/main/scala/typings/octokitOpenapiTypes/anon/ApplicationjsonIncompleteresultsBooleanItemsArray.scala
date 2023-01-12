package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonIncompleteresultsBooleanItemsArray extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: IncompleteresultsBooleanItemsArray
}
object ApplicationjsonIncompleteresultsBooleanItemsArray {
  
  inline def apply(applicationSlashjson: IncompleteresultsBooleanItemsArray): ApplicationjsonIncompleteresultsBooleanItemsArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonIncompleteresultsBooleanItemsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonIncompleteresultsBooleanItemsArray] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: IncompleteresultsBooleanItemsArray): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
