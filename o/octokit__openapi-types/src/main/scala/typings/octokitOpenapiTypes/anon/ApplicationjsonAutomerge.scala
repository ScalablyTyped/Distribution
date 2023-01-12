package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAutomerge extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Automerge
}
object ApplicationjsonAutomerge {
  
  inline def apply(applicationSlashjson: Automerge): ApplicationjsonAutomerge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAutomerge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAutomerge] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Automerge): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
