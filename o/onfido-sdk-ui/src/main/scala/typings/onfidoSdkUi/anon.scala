package typings.onfidoSdkUi

import typings.onfidoSdkUi.onfidoSdkUiBooleans.`false`
import typings.onfidoSdkUi.onfidoSdkUiStrings.standard
import typings.onfidoSdkUi.onfidoSdkUiStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bankbuildingsocietystatement extends StObject {
    
    var bank_building_society_statement: js.UndefOr[Boolean] = js.undefined
    
    // GBR only
    var benefit_letters: js.UndefOr[Boolean] = js.undefined
    
    var council_tax: js.UndefOr[Boolean] = js.undefined
    
    var driving_licence: js.UndefOr[Boolean] = js.undefined
    
    // GBR only
    var government_letter: js.UndefOr[Boolean] = js.undefined
    
    var national_identity_card: js.UndefOr[Boolean] = js.undefined
    
    var passport: js.UndefOr[Boolean] = js.undefined
    
    var utility_bill: js.UndefOr[Boolean] = js.undefined
  }
  object Bankbuildingsocietystatement {
    
    inline def apply(): Bankbuildingsocietystatement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bankbuildingsocietystatement]
    }
    
    extension [Self <: Bankbuildingsocietystatement](x: Self) {
      
      inline def setBank_building_society_statement(value: Boolean): Self = StObject.set(x, "bank_building_society_statement", value.asInstanceOf[js.Any])
      
      inline def setBank_building_society_statementUndefined: Self = StObject.set(x, "bank_building_society_statement", js.undefined)
      
      inline def setBenefit_letters(value: Boolean): Self = StObject.set(x, "benefit_letters", value.asInstanceOf[js.Any])
      
      inline def setBenefit_lettersUndefined: Self = StObject.set(x, "benefit_letters", js.undefined)
      
      inline def setCouncil_tax(value: Boolean): Self = StObject.set(x, "council_tax", value.asInstanceOf[js.Any])
      
      inline def setCouncil_taxUndefined: Self = StObject.set(x, "council_tax", js.undefined)
      
      inline def setDriving_licence(value: Boolean): Self = StObject.set(x, "driving_licence", value.asInstanceOf[js.Any])
      
      inline def setDriving_licenceUndefined: Self = StObject.set(x, "driving_licence", js.undefined)
      
      inline def setGovernment_letter(value: Boolean): Self = StObject.set(x, "government_letter", value.asInstanceOf[js.Any])
      
      inline def setGovernment_letterUndefined: Self = StObject.set(x, "government_letter", js.undefined)
      
      inline def setNational_identity_card(value: Boolean): Self = StObject.set(x, "national_identity_card", value.asInstanceOf[js.Any])
      
      inline def setNational_identity_cardUndefined: Self = StObject.set(x, "national_identity_card", js.undefined)
      
      inline def setPassport(value: Boolean): Self = StObject.set(x, "passport", value.asInstanceOf[js.Any])
      
      inline def setPassportUndefined: Self = StObject.set(x, "passport", js.undefined)
      
      inline def setUtility_bill(value: Boolean): Self = StObject.set(x, "utility_bill", value.asInstanceOf[js.Any])
      
      inline def setUtility_billUndefined: Self = StObject.set(x, "utility_bill", js.undefined)
    }
  }
  
  trait Country extends StObject {
    
    var country: js.UndefOr[String] = js.undefined
    
    var descriptions: js.UndefOr[js.Array[String]] = js.undefined
    
    var documentTypes: js.UndefOr[Bankbuildingsocietystatement] = js.undefined
    
    var forceCrossDevice: js.UndefOr[Boolean] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var nextButton: js.UndefOr[String] = js.undefined
    
    var requestedVariant: js.UndefOr[standard | video] = js.undefined
    
    var submessage: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var uploadFallback: js.UndefOr[`false`] = js.undefined
  }
  object Country {
    
    inline def apply(): Country = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Country]
    }
    
    extension [Self <: Country](x: Self) {
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setDescriptions(value: js.Array[String]): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
      
      inline def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
      
      inline def setDescriptionsVarargs(value: String*): Self = StObject.set(x, "descriptions", js.Array(value :_*))
      
      inline def setDocumentTypes(value: Bankbuildingsocietystatement): Self = StObject.set(x, "documentTypes", value.asInstanceOf[js.Any])
      
      inline def setDocumentTypesUndefined: Self = StObject.set(x, "documentTypes", js.undefined)
      
      inline def setForceCrossDevice(value: Boolean): Self = StObject.set(x, "forceCrossDevice", value.asInstanceOf[js.Any])
      
      inline def setForceCrossDeviceUndefined: Self = StObject.set(x, "forceCrossDevice", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setNextButton(value: String): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
      
      inline def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
      
      inline def setRequestedVariant(value: standard | video): Self = StObject.set(x, "requestedVariant", value.asInstanceOf[js.Any])
      
      inline def setRequestedVariantUndefined: Self = StObject.set(x, "requestedVariant", js.undefined)
      
      inline def setSubmessage(value: String): Self = StObject.set(x, "submessage", value.asInstanceOf[js.Any])
      
      inline def setSubmessageUndefined: Self = StObject.set(x, "submessage", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUploadFallback(value: `false`): Self = StObject.set(x, "uploadFallback", value.asInstanceOf[js.Any])
      
      inline def setUploadFallbackUndefined: Self = StObject.set(x, "uploadFallback", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var side: String
    
    var `type`: String
  }
  object Id {
    
    inline def apply(id: String, side: String, `type`: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var options: Country
    
    var `type`: String
  }
  object Options {
    
    inline def apply(options: Country, `type`: String): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOptions(value: Country): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Variant extends StObject {
    
    var id: String
    
    var variant: String
  }
  object Variant {
    
    inline def apply(id: String, variant: String): Variant = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
      __obj.asInstanceOf[Variant]
    }
    
    extension [Self <: Variant](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    }
  }
}
