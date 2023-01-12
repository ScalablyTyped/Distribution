package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAddedby extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Addedby
}
object ApplicationjsonAddedby {
  
  inline def apply(applicationSlashjson: Addedby): ApplicationjsonAddedby = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAddedby]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAddedby] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Addedby): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
