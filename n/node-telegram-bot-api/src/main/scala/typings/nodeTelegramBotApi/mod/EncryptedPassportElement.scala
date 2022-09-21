package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptedPassportElement extends StObject {
  
  var data: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var files: js.UndefOr[js.Array[PassportFile]] = js.undefined
  
  var front_side: js.UndefOr[PassportFile] = js.undefined
  
  var hash: String
  
  var phone_number: js.UndefOr[String] = js.undefined
  
  var reverse_side: js.UndefOr[PassportFile] = js.undefined
  
  var selfie: js.UndefOr[PassportFile] = js.undefined
  
  var translation: js.UndefOr[js.Array[PassportFile]] = js.undefined
  
  var `type`: String
}
object EncryptedPassportElement {
  
  inline def apply(hash: String, `type`: String): EncryptedPassportElement = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedPassportElement]
  }
  
  extension [Self <: EncryptedPassportElement](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFiles(value: js.Array[PassportFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: PassportFile*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setFront_side(value: PassportFile): Self = StObject.set(x, "front_side", value.asInstanceOf[js.Any])
    
    inline def setFront_sideUndefined: Self = StObject.set(x, "front_side", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    inline def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
    
    inline def setReverse_side(value: PassportFile): Self = StObject.set(x, "reverse_side", value.asInstanceOf[js.Any])
    
    inline def setReverse_sideUndefined: Self = StObject.set(x, "reverse_side", js.undefined)
    
    inline def setSelfie(value: PassportFile): Self = StObject.set(x, "selfie", value.asInstanceOf[js.Any])
    
    inline def setSelfieUndefined: Self = StObject.set(x, "selfie", js.undefined)
    
    inline def setTranslation(value: js.Array[PassportFile]): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
    
    inline def setTranslationUndefined: Self = StObject.set(x, "translation", js.undefined)
    
    inline def setTranslationVarargs(value: PassportFile*): Self = StObject.set(x, "translation", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
