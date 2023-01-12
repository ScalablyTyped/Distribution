package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDescription extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Description
}
object ApplicationjsonDescription {
  
  inline def apply(applicationSlashjson: Description): ApplicationjsonDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonDescription] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Description): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
