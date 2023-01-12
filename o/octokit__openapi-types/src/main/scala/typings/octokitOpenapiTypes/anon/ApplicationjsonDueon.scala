package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDueon extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Dueon
}
object ApplicationjsonDueon {
  
  inline def apply(applicationSlashjson: Dueon): ApplicationjsonDueon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDueon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonDueon] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Dueon): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
