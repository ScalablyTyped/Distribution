package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsInformationProtectionDataRecoveryCertificate extends StObject {
  
  // Data recovery Certificate
  var certificate: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Data recovery Certificate description
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Data recovery Certificate expiration datetime
  var expirationDateTime: js.UndefOr[String] = js.undefined
  
  // Data recovery Certificate subject name
  var subjectName: js.UndefOr[NullableOption[String]] = js.undefined
}
object WindowsInformationProtectionDataRecoveryCertificate {
  
  inline def apply(): WindowsInformationProtectionDataRecoveryCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionDataRecoveryCertificate]
  }
  
  extension [Self <: WindowsInformationProtectionDataRecoveryCertificate](x: Self) {
    
    inline def setCertificate(value: NullableOption[String]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateNull: Self = StObject.set(x, "certificate", null)
    
    inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpirationDateTime(value: String): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    inline def setSubjectName(value: NullableOption[String]): Self = StObject.set(x, "subjectName", value.asInstanceOf[js.Any])
    
    inline def setSubjectNameNull: Self = StObject.set(x, "subjectName", null)
    
    inline def setSubjectNameUndefined: Self = StObject.set(x, "subjectName", js.undefined)
  }
}
