package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSelectedworkflows extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Selectedworkflows
}
object ApplicationjsonSelectedworkflows {
  
  inline def apply(applicationSlashjson: Selectedworkflows): ApplicationjsonSelectedworkflows = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSelectedworkflows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonSelectedworkflows] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Selectedworkflows): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
