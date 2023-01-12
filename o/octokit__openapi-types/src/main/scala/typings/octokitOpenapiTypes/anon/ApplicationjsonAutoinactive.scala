package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAutoinactive extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Autoinactive
}
object ApplicationjsonAutoinactive {
  
  inline def apply(applicationSlashjson: Autoinactive): ApplicationjsonAutoinactive = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAutoinactive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAutoinactive] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Autoinactive): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
