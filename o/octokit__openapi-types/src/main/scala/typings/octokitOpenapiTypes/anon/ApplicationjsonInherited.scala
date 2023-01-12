package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonInherited extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Inherited
}
object ApplicationjsonInherited {
  
  inline def apply(applicationSlashjson: Inherited): ApplicationjsonInherited = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonInherited]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonInherited] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Inherited): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
