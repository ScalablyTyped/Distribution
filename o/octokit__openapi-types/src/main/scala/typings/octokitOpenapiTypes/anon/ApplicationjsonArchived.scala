package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonArchived extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Archived
}
object ApplicationjsonArchived {
  
  inline def apply(applicationSlashjson: Archived): ApplicationjsonArchived = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonArchived]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonArchived] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Archived): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
