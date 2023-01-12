package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonName extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Name
}
object ApplicationjsonName {
  
  inline def apply(applicationSlashjson: Name): ApplicationjsonName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonName] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Name): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
