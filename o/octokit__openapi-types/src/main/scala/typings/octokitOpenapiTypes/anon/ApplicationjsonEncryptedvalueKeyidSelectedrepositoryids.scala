package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEncryptedvalueKeyidSelectedrepositoryids extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: EncryptedvalueKeyidSelectedrepositoryids
}
object ApplicationjsonEncryptedvalueKeyidSelectedrepositoryids {
  
  inline def apply(applicationSlashjson: EncryptedvalueKeyidSelectedrepositoryids): ApplicationjsonEncryptedvalueKeyidSelectedrepositoryids = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEncryptedvalueKeyidSelectedrepositoryids]
  }
  
  extension [Self <: ApplicationjsonEncryptedvalueKeyidSelectedrepositoryids](x: Self) {
    
    inline def setApplicationSlashjson(value: EncryptedvalueKeyidSelectedrepositoryids): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
