package typings.onfidoSdkUi

import typings.onfidoSdkUi.mod.BiometricsLiveness
import typings.onfidoSdkUi.mod.ChallengePayload
import typings.onfidoSdkUi.mod.DeviceIntelligence
import typings.onfidoSdkUi.mod.DocumentCapture
import typings.onfidoSdkUi.mod.DocumentTypeConfig
import typings.onfidoSdkUi.mod.ExperimentalFeatures
import typings.onfidoSdkUi.mod.SdkConfigurationValidations
import typings.onfidoSdkUi.mod.SdkFeatures
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Addressenabled extends StObject {
    
    var address_enabled: js.UndefOr[Boolean] = js.undefined
    
    var country_residence_enabled: js.UndefOr[Boolean] = js.undefined
    
    var dob_enabled: js.UndefOr[Boolean] = js.undefined
    
    var email_enabled: js.UndefOr[Boolean] = js.undefined
    
    var first_name_enabled: js.UndefOr[Boolean] = js.undefined
    
    var last_name_enabled: js.UndefOr[Boolean] = js.undefined
    
    var nationality_enabled: js.UndefOr[Boolean] = js.undefined
    
    var pan_enabled: js.UndefOr[Boolean] = js.undefined
    
    var phone_number_enabled: js.UndefOr[Boolean] = js.undefined
    
    var ssn_enabled: js.UndefOr[Boolean] = js.undefined
  }
  object Addressenabled {
    
    inline def apply(): Addressenabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Addressenabled]
    }
    
    extension [Self <: Addressenabled](x: Self) {
      
      inline def setAddress_enabled(value: Boolean): Self = StObject.set(x, "address_enabled", value.asInstanceOf[js.Any])
      
      inline def setAddress_enabledUndefined: Self = StObject.set(x, "address_enabled", js.undefined)
      
      inline def setCountry_residence_enabled(value: Boolean): Self = StObject.set(x, "country_residence_enabled", value.asInstanceOf[js.Any])
      
      inline def setCountry_residence_enabledUndefined: Self = StObject.set(x, "country_residence_enabled", js.undefined)
      
      inline def setDob_enabled(value: Boolean): Self = StObject.set(x, "dob_enabled", value.asInstanceOf[js.Any])
      
      inline def setDob_enabledUndefined: Self = StObject.set(x, "dob_enabled", js.undefined)
      
      inline def setEmail_enabled(value: Boolean): Self = StObject.set(x, "email_enabled", value.asInstanceOf[js.Any])
      
      inline def setEmail_enabledUndefined: Self = StObject.set(x, "email_enabled", js.undefined)
      
      inline def setFirst_name_enabled(value: Boolean): Self = StObject.set(x, "first_name_enabled", value.asInstanceOf[js.Any])
      
      inline def setFirst_name_enabledUndefined: Self = StObject.set(x, "first_name_enabled", js.undefined)
      
      inline def setLast_name_enabled(value: Boolean): Self = StObject.set(x, "last_name_enabled", value.asInstanceOf[js.Any])
      
      inline def setLast_name_enabledUndefined: Self = StObject.set(x, "last_name_enabled", js.undefined)
      
      inline def setNationality_enabled(value: Boolean): Self = StObject.set(x, "nationality_enabled", value.asInstanceOf[js.Any])
      
      inline def setNationality_enabledUndefined: Self = StObject.set(x, "nationality_enabled", js.undefined)
      
      inline def setPan_enabled(value: Boolean): Self = StObject.set(x, "pan_enabled", value.asInstanceOf[js.Any])
      
      inline def setPan_enabledUndefined: Self = StObject.set(x, "pan_enabled", js.undefined)
      
      inline def setPhone_number_enabled(value: Boolean): Self = StObject.set(x, "phone_number_enabled", value.asInstanceOf[js.Any])
      
      inline def setPhone_number_enabledUndefined: Self = StObject.set(x, "phone_number_enabled", js.undefined)
      
      inline def setSsn_enabled(value: Boolean): Self = StObject.set(x, "ssn_enabled", value.asInstanceOf[js.Any])
      
      inline def setSsn_enabledUndefined: Self = StObject.set(x, "ssn_enabled", js.undefined)
    }
  }
  
  trait Buttontitle extends StObject {
    
    var button_title: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var headline: js.UndefOr[String] = js.undefined
  }
  object Buttontitle {
    
    inline def apply(): Buttontitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Buttontitle]
    }
    
    extension [Self <: Buttontitle](x: Self) {
      
      inline def setButton_title(value: String): Self = StObject.set(x, "button_title", value.asInstanceOf[js.Any])
      
      inline def setButton_titleUndefined: Self = StObject.set(x, "button_title", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
      
      inline def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
    }
  }
  
  trait Country extends StObject {
    
    var country: js.UndefOr[String] = js.undefined
    
    var line1: js.UndefOr[String] = js.undefined
    
    var line2: js.UndefOr[String] = js.undefined
    
    var line3: js.UndefOr[String] = js.undefined
    
    var postcode: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var town: js.UndefOr[String] = js.undefined
  }
  object Country {
    
    inline def apply(): Country = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Country]
    }
    
    extension [Self <: Country](x: Self) {
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setLine1(value: String): Self = StObject.set(x, "line1", value.asInstanceOf[js.Any])
      
      inline def setLine1Undefined: Self = StObject.set(x, "line1", js.undefined)
      
      inline def setLine2(value: String): Self = StObject.set(x, "line2", value.asInstanceOf[js.Any])
      
      inline def setLine2Undefined: Self = StObject.set(x, "line2", js.undefined)
      
      inline def setLine3(value: String): Self = StObject.set(x, "line3", value.asInstanceOf[js.Any])
      
      inline def setLine3Undefined: Self = StObject.set(x, "line3", js.undefined)
      
      inline def setPostcode(value: String): Self = StObject.set(x, "postcode", value.asInstanceOf[js.Any])
      
      inline def setPostcodeUndefined: Self = StObject.set(x, "postcode", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTown(value: String): Self = StObject.set(x, "town", value.asInstanceOf[js.Any])
      
      inline def setTownUndefined: Self = StObject.set(x, "town", js.undefined)
    }
  }
  
  trait Enabled extends StObject {
    
    var enabled: Boolean
  }
  object Enabled {
    
    inline def apply(enabled: Boolean): Enabled = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enabled]
    }
    
    extension [Self <: Enabled](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Record<onfido-sdk-ui.onfido-sdk-ui.DocumentTypes, onfido-sdk-ui.onfido-sdk-ui.DocumentTypeConfig>> */
  trait PartialRecordDocumentType extends StObject {
    
    var driving_licence: js.UndefOr[DocumentTypeConfig] = js.undefined
    
    var national_identity_card: js.UndefOr[DocumentTypeConfig] = js.undefined
    
    var passport: js.UndefOr[DocumentTypeConfig] = js.undefined
    
    var residence_permit: js.UndefOr[DocumentTypeConfig] = js.undefined
  }
  object PartialRecordDocumentType {
    
    inline def apply(): PartialRecordDocumentType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordDocumentType]
    }
    
    extension [Self <: PartialRecordDocumentType](x: Self) {
      
      inline def setDriving_licence(value: DocumentTypeConfig): Self = StObject.set(x, "driving_licence", value.asInstanceOf[js.Any])
      
      inline def setDriving_licenceUndefined: Self = StObject.set(x, "driving_licence", js.undefined)
      
      inline def setNational_identity_card(value: DocumentTypeConfig): Self = StObject.set(x, "national_identity_card", value.asInstanceOf[js.Any])
      
      inline def setNational_identity_cardUndefined: Self = StObject.set(x, "national_identity_card", js.undefined)
      
      inline def setPassport(value: DocumentTypeConfig): Self = StObject.set(x, "passport", value.asInstanceOf[js.Any])
      
      inline def setPassportUndefined: Self = StObject.set(x, "passport", js.undefined)
      
      inline def setResidence_permit(value: DocumentTypeConfig): Self = StObject.set(x, "residence_permit", value.asInstanceOf[js.Any])
      
      inline def setResidence_permitUndefined: Self = StObject.set(x, "residence_permit", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Record<onfido-sdk-ui.onfido-sdk-ui.PoaTypes, boolean>> */
  trait PartialRecordPoaTypesbool extends StObject {
    
    var bank_building_society_statement: js.UndefOr[Boolean] = js.undefined
    
    var benefit_letters: js.UndefOr[Boolean] = js.undefined
    
    var council_tax: js.UndefOr[Boolean] = js.undefined
    
    var government_letter: js.UndefOr[Boolean] = js.undefined
    
    var utility_bill: js.UndefOr[Boolean] = js.undefined
  }
  object PartialRecordPoaTypesbool {
    
    inline def apply(): PartialRecordPoaTypesbool = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordPoaTypesbool]
    }
    
    extension [Self <: PartialRecordPoaTypesbool](x: Self) {
      
      inline def setBank_building_society_statement(value: Boolean): Self = StObject.set(x, "bank_building_society_statement", value.asInstanceOf[js.Any])
      
      inline def setBank_building_society_statementUndefined: Self = StObject.set(x, "bank_building_society_statement", js.undefined)
      
      inline def setBenefit_letters(value: Boolean): Self = StObject.set(x, "benefit_letters", value.asInstanceOf[js.Any])
      
      inline def setBenefit_lettersUndefined: Self = StObject.set(x, "benefit_letters", js.undefined)
      
      inline def setCouncil_tax(value: Boolean): Self = StObject.set(x, "council_tax", value.asInstanceOf[js.Any])
      
      inline def setCouncil_taxUndefined: Self = StObject.set(x, "council_tax", js.undefined)
      
      inline def setGovernment_letter(value: Boolean): Self = StObject.set(x, "government_letter", value.asInstanceOf[js.Any])
      
      inline def setGovernment_letterUndefined: Self = StObject.set(x, "government_letter", js.undefined)
      
      inline def setUtility_bill(value: Boolean): Self = StObject.set(x, "utility_bill", value.asInstanceOf[js.Any])
      
      inline def setUtility_billUndefined: Self = StObject.set(x, "utility_bill", js.undefined)
    }
  }
  
  /* Inlined std.Partial<onfido-sdk-ui.onfido-sdk-ui.SdkConfiguration> */
  trait PartialSdkConfiguration extends StObject {
    
    var biometrics_liveness: js.UndefOr[BiometricsLiveness] = js.undefined
    
    var device_intelligence: js.UndefOr[DeviceIntelligence] = js.undefined
    
    var document_capture: js.UndefOr[DocumentCapture] = js.undefined
    
    var experimental_features: js.UndefOr[ExperimentalFeatures] = js.undefined
    
    var sdk_features: js.UndefOr[SdkFeatures] = js.undefined
    
    var validations: js.UndefOr[SdkConfigurationValidations] = js.undefined
  }
  object PartialSdkConfiguration {
    
    inline def apply(): PartialSdkConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSdkConfiguration]
    }
    
    extension [Self <: PartialSdkConfiguration](x: Self) {
      
      inline def setBiometrics_liveness(value: BiometricsLiveness): Self = StObject.set(x, "biometrics_liveness", value.asInstanceOf[js.Any])
      
      inline def setBiometrics_livenessUndefined: Self = StObject.set(x, "biometrics_liveness", js.undefined)
      
      inline def setDevice_intelligence(value: DeviceIntelligence): Self = StObject.set(x, "device_intelligence", value.asInstanceOf[js.Any])
      
      inline def setDevice_intelligenceUndefined: Self = StObject.set(x, "device_intelligence", js.undefined)
      
      inline def setDocument_capture(value: DocumentCapture): Self = StObject.set(x, "document_capture", value.asInstanceOf[js.Any])
      
      inline def setDocument_captureUndefined: Self = StObject.set(x, "document_capture", js.undefined)
      
      inline def setExperimental_features(value: ExperimentalFeatures): Self = StObject.set(x, "experimental_features", value.asInstanceOf[js.Any])
      
      inline def setExperimental_featuresUndefined: Self = StObject.set(x, "experimental_features", js.undefined)
      
      inline def setSdk_features(value: SdkFeatures): Self = StObject.set(x, "sdk_features", value.asInstanceOf[js.Any])
      
      inline def setSdk_featuresUndefined: Self = StObject.set(x, "sdk_features", js.undefined)
      
      inline def setValidations(value: SdkConfigurationValidations): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
      
      inline def setValidationsUndefined: Self = StObject.set(x, "validations", js.undefined)
    }
  }
  
  trait Query
    extends StObject
       with ChallengePayload {
    
    var query: js.Array[Double]
    
    var `type`: /* "recite" */ String
  }
  object Query {
    
    inline def apply(query: js.Array[Double], `type`: /* "recite" */ String): Query = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Query]
    }
    
    extension [Self <: Query](x: Self) {
      
      inline def setQuery(value: js.Array[Double]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryVarargs(value: Double*): Self = StObject.set(x, "query", js.Array(value*))
      
      inline def setType(value: /* "recite" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SmsNumber extends StObject {
    
    var smsNumber: js.UndefOr[String] = js.undefined
  }
  object SmsNumber {
    
    inline def apply(): SmsNumber = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmsNumber]
    }
    
    extension [Self <: SmsNumber](x: Self) {
      
      inline def setSmsNumber(value: String): Self = StObject.set(x, "smsNumber", value.asInstanceOf[js.Any])
      
      inline def setSmsNumberUndefined: Self = StObject.set(x, "smsNumber", js.undefined)
    }
  }
  
  trait Type
    extends StObject
       with ChallengePayload {
    
    var query: String
    
    var `type`: /* "movement" */ String
  }
  object Type {
    
    inline def apply(query: String, `type`: /* "movement" */ String): Type = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "movement" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Valid extends StObject {
    
    var valid: Boolean
  }
  object Valid {
    
    inline def apply(valid: Boolean): Valid = {
      val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Valid]
    }
    
    extension [Self <: Valid](x: Self) {
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
}
