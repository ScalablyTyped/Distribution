package typings.mrz.mod

import typings.mrz.mrzStrings.female
import typings.mrz.mrzStrings.male
import typings.mrz.mrzStrings.nonspecified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultFields extends js.Object {
  
  // french national id only
  var administrativeCode: js.UndefOr[String] = js.native
  
  var administrativeCode2: js.UndefOr[String] = js.native
  
  var birthDate: String | Null = js.native
  
  var birthDateCheckDigit: String | Null = js.native
  
  var compositeCheckDigit: String | Null = js.native
  
  var documentCode: String | Null = js.native
  
  var documentNumber: String | Null = js.native
  
  var documentNumberCheckDigit: String | Null = js.native
  
  var expirationDate: String | Null = js.native
  
  var expirationDateCheckDigit: String | Null = js.native
  
  var firstName: String | Null = js.native
  
  var issueDate: String | Null = js.native
  
  var issuingState: String | Null = js.native
  
  // swiss driving license only
  var languageCode: js.UndefOr[String] = js.native
  
  var lastName: String | Null = js.native
  
  var nationality: String | Null = js.native
  
  // td2 only
  var optional: js.UndefOr[String] = js.native
  
  // td1 only
  var optional1: js.UndefOr[String] = js.native
  
  var optional2: js.UndefOr[String] = js.native
  
  // td3 only
  var personalNumber: js.UndefOr[String] = js.native
  
  var personalNumberCheckDigit: js.UndefOr[String] = js.native
  
  var pinCode: js.UndefOr[String] = js.native
  
  var sex: male | female | nonspecified | Null = js.native
  
  var versionNumber: js.UndefOr[String] = js.native
}
object ResultFields {
  
  @scala.inline
  def apply(): ResultFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultFields]
  }
  
  @scala.inline
  implicit class ResultFieldsOps[Self <: ResultFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdministrativeCode(value: String): Self = this.set("administrativeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdministrativeCode: Self = this.set("administrativeCode", js.undefined)
    
    @scala.inline
    def setAdministrativeCode2(value: String): Self = this.set("administrativeCode2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdministrativeCode2: Self = this.set("administrativeCode2", js.undefined)
    
    @scala.inline
    def setBirthDate(value: String): Self = this.set("birthDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBirthDateNull: Self = this.set("birthDate", null)
    
    @scala.inline
    def setBirthDateCheckDigit(value: String): Self = this.set("birthDateCheckDigit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBirthDateCheckDigitNull: Self = this.set("birthDateCheckDigit", null)
    
    @scala.inline
    def setCompositeCheckDigit(value: String): Self = this.set("compositeCheckDigit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeCheckDigitNull: Self = this.set("compositeCheckDigit", null)
    
    @scala.inline
    def setDocumentCode(value: String): Self = this.set("documentCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentCodeNull: Self = this.set("documentCode", null)
    
    @scala.inline
    def setDocumentNumber(value: String): Self = this.set("documentNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentNumberNull: Self = this.set("documentNumber", null)
    
    @scala.inline
    def setDocumentNumberCheckDigit(value: String): Self = this.set("documentNumberCheckDigit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentNumberCheckDigitNull: Self = this.set("documentNumberCheckDigit", null)
    
    @scala.inline
    def setExpirationDate(value: String): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateNull: Self = this.set("expirationDate", null)
    
    @scala.inline
    def setExpirationDateCheckDigit(value: String): Self = this.set("expirationDateCheckDigit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateCheckDigitNull: Self = this.set("expirationDateCheckDigit", null)
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNameNull: Self = this.set("firstName", null)
    
    @scala.inline
    def setIssueDate(value: String): Self = this.set("issueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssueDateNull: Self = this.set("issueDate", null)
    
    @scala.inline
    def setIssuingState(value: String): Self = this.set("issuingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuingStateNull: Self = this.set("issuingState", null)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNameNull: Self = this.set("lastName", null)
    
    @scala.inline
    def setNationality(value: String): Self = this.set("nationality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNationalityNull: Self = this.set("nationality", null)
    
    @scala.inline
    def setOptional(value: String): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
    
    @scala.inline
    def setOptional1(value: String): Self = this.set("optional1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptional1: Self = this.set("optional1", js.undefined)
    
    @scala.inline
    def setOptional2(value: String): Self = this.set("optional2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptional2: Self = this.set("optional2", js.undefined)
    
    @scala.inline
    def setPersonalNumber(value: String): Self = this.set("personalNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonalNumber: Self = this.set("personalNumber", js.undefined)
    
    @scala.inline
    def setPersonalNumberCheckDigit(value: String): Self = this.set("personalNumberCheckDigit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonalNumberCheckDigit: Self = this.set("personalNumberCheckDigit", js.undefined)
    
    @scala.inline
    def setPinCode(value: String): Self = this.set("pinCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinCode: Self = this.set("pinCode", js.undefined)
    
    @scala.inline
    def setSex(value: male | female | nonspecified): Self = this.set("sex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSexNull: Self = this.set("sex", null)
    
    @scala.inline
    def setVersionNumber(value: String): Self = this.set("versionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionNumber: Self = this.set("versionNumber", js.undefined)
  }
}
