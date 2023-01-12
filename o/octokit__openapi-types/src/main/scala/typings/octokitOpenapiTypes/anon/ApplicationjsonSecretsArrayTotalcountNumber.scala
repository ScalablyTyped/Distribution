package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSecretsArrayTotalcountNumber extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: SecretsArrayTotalcountNumber
}
object ApplicationjsonSecretsArrayTotalcountNumber {
  
  inline def apply(applicationSlashjson: SecretsArrayTotalcountNumber): ApplicationjsonSecretsArrayTotalcountNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSecretsArrayTotalcountNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonSecretsArrayTotalcountNumber] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: SecretsArrayTotalcountNumber): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
