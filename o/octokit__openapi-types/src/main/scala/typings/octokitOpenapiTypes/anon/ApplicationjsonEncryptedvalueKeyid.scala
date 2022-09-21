package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEncryptedvalueKeyid extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: EncryptedvalueKeyid
}
object ApplicationjsonEncryptedvalueKeyid {
  
  inline def apply(applicationSlashjson: EncryptedvalueKeyid): ApplicationjsonEncryptedvalueKeyid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEncryptedvalueKeyid]
  }
  
  extension [Self <: ApplicationjsonEncryptedvalueKeyid](x: Self) {
    
    inline def setApplicationSlashjson(value: EncryptedvalueKeyid): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
