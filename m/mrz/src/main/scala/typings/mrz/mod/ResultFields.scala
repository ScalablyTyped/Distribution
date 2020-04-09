package typings.mrz.mod

import typings.mrz.mrzStrings.female
import typings.mrz.mrzStrings.male
import typings.mrz.mrzStrings.nonspecified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultFields extends js.Object {
  // french national id only
  var administrativeCode: js.UndefOr[String] = js.undefined
  var administrativeCode2: js.UndefOr[String] = js.undefined
  var birthDate: String | Null
  var birthDateCheckDigit: String | Null
  var compositeCheckDigit: String | Null
  var documentCode: String | Null
  var documentNumber: String | Null
  var documentNumberCheckDigit: String | Null
  var expirationDate: String | Null
  var expirationDateCheckDigit: String | Null
  var firstName: String | Null
  var issueDate: String | Null
  var issuingState: String | Null
  // swiss driving license only
  var languageCode: js.UndefOr[String] = js.undefined
  var lastName: String | Null
  var nationality: String | Null
  // td2 only
  var optional: js.UndefOr[String] = js.undefined
  // td1 only
  var optional1: js.UndefOr[String] = js.undefined
  var optional2: js.UndefOr[String] = js.undefined
  // td3 only
  var personalNumber: js.UndefOr[String] = js.undefined
  var personalNumberCheckDigit: js.UndefOr[String] = js.undefined
  var pinCode: js.UndefOr[String] = js.undefined
  var sex: male | female | nonspecified | Null
  var versionNumber: js.UndefOr[String] = js.undefined
}

object ResultFields {
  @scala.inline
  def apply(
    administrativeCode: String = null,
    administrativeCode2: String = null,
    birthDate: String = null,
    birthDateCheckDigit: String = null,
    compositeCheckDigit: String = null,
    documentCode: String = null,
    documentNumber: String = null,
    documentNumberCheckDigit: String = null,
    expirationDate: String = null,
    expirationDateCheckDigit: String = null,
    firstName: String = null,
    issueDate: String = null,
    issuingState: String = null,
    languageCode: String = null,
    lastName: String = null,
    nationality: String = null,
    optional: String = null,
    optional1: String = null,
    optional2: String = null,
    personalNumber: String = null,
    personalNumberCheckDigit: String = null,
    pinCode: String = null,
    sex: male | female | nonspecified = null,
    versionNumber: String = null
  ): ResultFields = {
    val __obj = js.Dynamic.literal()
    if (administrativeCode != null) __obj.updateDynamic("administrativeCode")(administrativeCode.asInstanceOf[js.Any])
    if (administrativeCode2 != null) __obj.updateDynamic("administrativeCode2")(administrativeCode2.asInstanceOf[js.Any])
    if (birthDate != null) __obj.updateDynamic("birthDate")(birthDate.asInstanceOf[js.Any])
    if (birthDateCheckDigit != null) __obj.updateDynamic("birthDateCheckDigit")(birthDateCheckDigit.asInstanceOf[js.Any])
    if (compositeCheckDigit != null) __obj.updateDynamic("compositeCheckDigit")(compositeCheckDigit.asInstanceOf[js.Any])
    if (documentCode != null) __obj.updateDynamic("documentCode")(documentCode.asInstanceOf[js.Any])
    if (documentNumber != null) __obj.updateDynamic("documentNumber")(documentNumber.asInstanceOf[js.Any])
    if (documentNumberCheckDigit != null) __obj.updateDynamic("documentNumberCheckDigit")(documentNumberCheckDigit.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (expirationDateCheckDigit != null) __obj.updateDynamic("expirationDateCheckDigit")(expirationDateCheckDigit.asInstanceOf[js.Any])
    if (firstName != null) __obj.updateDynamic("firstName")(firstName.asInstanceOf[js.Any])
    if (issueDate != null) __obj.updateDynamic("issueDate")(issueDate.asInstanceOf[js.Any])
    if (issuingState != null) __obj.updateDynamic("issuingState")(issuingState.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (lastName != null) __obj.updateDynamic("lastName")(lastName.asInstanceOf[js.Any])
    if (nationality != null) __obj.updateDynamic("nationality")(nationality.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (optional1 != null) __obj.updateDynamic("optional1")(optional1.asInstanceOf[js.Any])
    if (optional2 != null) __obj.updateDynamic("optional2")(optional2.asInstanceOf[js.Any])
    if (personalNumber != null) __obj.updateDynamic("personalNumber")(personalNumber.asInstanceOf[js.Any])
    if (personalNumberCheckDigit != null) __obj.updateDynamic("personalNumberCheckDigit")(personalNumberCheckDigit.asInstanceOf[js.Any])
    if (pinCode != null) __obj.updateDynamic("pinCode")(pinCode.asInstanceOf[js.Any])
    if (sex != null) __obj.updateDynamic("sex")(sex.asInstanceOf[js.Any])
    if (versionNumber != null) __obj.updateDynamic("versionNumber")(versionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultFields]
  }
}

