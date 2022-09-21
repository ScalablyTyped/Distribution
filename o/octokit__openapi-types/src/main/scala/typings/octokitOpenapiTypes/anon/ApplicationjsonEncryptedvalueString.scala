package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEncryptedvalueString extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: EncryptedvalueString
}
object ApplicationjsonEncryptedvalueString {
  
  inline def apply(applicationSlashjson: EncryptedvalueString): ApplicationjsonEncryptedvalueString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEncryptedvalueString]
  }
  
  extension [Self <: ApplicationjsonEncryptedvalueString](x: Self) {
    
    inline def setApplicationSlashjson(value: EncryptedvalueString): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
