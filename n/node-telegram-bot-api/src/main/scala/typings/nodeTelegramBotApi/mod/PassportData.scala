package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PassportData extends StObject {
  
  var credentials: EncryptedCredentials
  
  var data: js.Array[EncryptedPassportElement]
}
object PassportData {
  
  inline def apply(credentials: EncryptedCredentials, data: js.Array[EncryptedPassportElement]): PassportData = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassportData]
  }
  
  extension [Self <: PassportData](x: Self) {
    
    inline def setCredentials(value: EncryptedCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[EncryptedPassportElement]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: EncryptedPassportElement*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
