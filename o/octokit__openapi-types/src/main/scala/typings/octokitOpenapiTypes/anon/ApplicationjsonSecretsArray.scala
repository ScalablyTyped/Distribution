package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSecretsArray extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: SecretsArray
}
object ApplicationjsonSecretsArray {
  
  inline def apply(applicationSlashjson: SecretsArray): ApplicationjsonSecretsArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSecretsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonSecretsArray] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: SecretsArray): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
