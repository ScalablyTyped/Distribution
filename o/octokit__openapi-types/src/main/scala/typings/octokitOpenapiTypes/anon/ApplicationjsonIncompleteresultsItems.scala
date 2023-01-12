package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonIncompleteresultsItems extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: IncompleteresultsItems
}
object ApplicationjsonIncompleteresultsItems {
  
  inline def apply(applicationSlashjson: IncompleteresultsItems): ApplicationjsonIncompleteresultsItems = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonIncompleteresultsItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonIncompleteresultsItems] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: IncompleteresultsItems): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
