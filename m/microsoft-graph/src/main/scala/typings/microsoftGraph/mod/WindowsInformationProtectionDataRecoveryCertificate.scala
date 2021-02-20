package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsInformationProtectionDataRecoveryCertificate extends StObject {
  
  // Data recovery Certificate
  var certificate: js.UndefOr[NullableOption[Double]] = js.native
  
  // Data recovery Certificate description
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Data recovery Certificate expiration datetime
  var expirationDateTime: js.UndefOr[String] = js.native
  
  // Data recovery Certificate subject name
  var subjectName: js.UndefOr[NullableOption[String]] = js.native
}
object WindowsInformationProtectionDataRecoveryCertificate {
  
  @scala.inline
  def apply(): WindowsInformationProtectionDataRecoveryCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionDataRecoveryCertificate]
  }
  
  @scala.inline
  implicit class WindowsInformationProtectionDataRecoveryCertificateMutableBuilder[Self <: WindowsInformationProtectionDataRecoveryCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: NullableOption[Double]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateNull: Self = StObject.set(x, "certificate", null)
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExpirationDateTime(value: String): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    @scala.inline
    def setSubjectName(value: NullableOption[String]): Self = StObject.set(x, "subjectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectNameNull: Self = StObject.set(x, "subjectName", null)
    
    @scala.inline
    def setSubjectNameUndefined: Self = StObject.set(x, "subjectName", js.undefined)
  }
}
