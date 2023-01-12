package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBodyNameString extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BodyNameString
}
object ApplicationjsonBodyNameString {
  
  inline def apply(applicationSlashjson: BodyNameString): ApplicationjsonBodyNameString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBodyNameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonBodyNameString] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: BodyNameString): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
