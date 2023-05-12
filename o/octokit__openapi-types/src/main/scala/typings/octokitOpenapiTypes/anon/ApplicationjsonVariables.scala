package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonVariables extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Variables
}
object ApplicationjsonVariables {
  
  inline def apply(applicationSlashjson: Variables): ApplicationjsonVariables = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonVariables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonVariables] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Variables): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
