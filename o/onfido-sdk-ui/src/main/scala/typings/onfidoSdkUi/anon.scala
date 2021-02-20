package typings.onfidoSdkUi

import typings.onfidoSdkUi.onfidoSdkUiBooleans.`false`
import typings.onfidoSdkUi.onfidoSdkUiStrings.standard
import typings.onfidoSdkUi.onfidoSdkUiStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bankbuildingsocietystatement extends StObject {
    
    var bank_building_society_statement: js.UndefOr[Boolean] = js.native
    
    // GBR only
    var benefit_letters: js.UndefOr[Boolean] = js.native
    
    var council_tax: js.UndefOr[Boolean] = js.native
    
    var driving_licence: js.UndefOr[Boolean] = js.native
    
    // GBR only
    var government_letter: js.UndefOr[Boolean] = js.native
    
    var national_identity_card: js.UndefOr[Boolean] = js.native
    
    var passport: js.UndefOr[Boolean] = js.native
    
    var utility_bill: js.UndefOr[Boolean] = js.native
  }
  object Bankbuildingsocietystatement {
    
    @scala.inline
    def apply(): Bankbuildingsocietystatement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bankbuildingsocietystatement]
    }
    
    @scala.inline
    implicit class BankbuildingsocietystatementMutableBuilder[Self <: Bankbuildingsocietystatement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBank_building_society_statement(value: Boolean): Self = StObject.set(x, "bank_building_society_statement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBank_building_society_statementUndefined: Self = StObject.set(x, "bank_building_society_statement", js.undefined)
      
      @scala.inline
      def setBenefit_letters(value: Boolean): Self = StObject.set(x, "benefit_letters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBenefit_lettersUndefined: Self = StObject.set(x, "benefit_letters", js.undefined)
      
      @scala.inline
      def setCouncil_tax(value: Boolean): Self = StObject.set(x, "council_tax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCouncil_taxUndefined: Self = StObject.set(x, "council_tax", js.undefined)
      
      @scala.inline
      def setDriving_licence(value: Boolean): Self = StObject.set(x, "driving_licence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriving_licenceUndefined: Self = StObject.set(x, "driving_licence", js.undefined)
      
      @scala.inline
      def setGovernment_letter(value: Boolean): Self = StObject.set(x, "government_letter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGovernment_letterUndefined: Self = StObject.set(x, "government_letter", js.undefined)
      
      @scala.inline
      def setNational_identity_card(value: Boolean): Self = StObject.set(x, "national_identity_card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNational_identity_cardUndefined: Self = StObject.set(x, "national_identity_card", js.undefined)
      
      @scala.inline
      def setPassport(value: Boolean): Self = StObject.set(x, "passport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassportUndefined: Self = StObject.set(x, "passport", js.undefined)
      
      @scala.inline
      def setUtility_bill(value: Boolean): Self = StObject.set(x, "utility_bill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtility_billUndefined: Self = StObject.set(x, "utility_bill", js.undefined)
    }
  }
  
  @js.native
  trait Country extends StObject {
    
    var country: js.UndefOr[String] = js.native
    
    var descriptions: js.UndefOr[js.Array[String]] = js.native
    
    var documentTypes: js.UndefOr[Bankbuildingsocietystatement] = js.native
    
    var forceCrossDevice: js.UndefOr[Boolean] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var nextButton: js.UndefOr[String] = js.native
    
    var requestedVariant: js.UndefOr[standard | video] = js.native
    
    var submessage: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var uploadFallback: js.UndefOr[`false`] = js.native
  }
  object Country {
    
    @scala.inline
    def apply(): Country = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Country]
    }
    
    @scala.inline
    implicit class CountryMutableBuilder[Self <: Country] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setDescriptions(value: js.Array[String]): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
      
      @scala.inline
      def setDescriptionsVarargs(value: String*): Self = StObject.set(x, "descriptions", js.Array(value :_*))
      
      @scala.inline
      def setDocumentTypes(value: Bankbuildingsocietystatement): Self = StObject.set(x, "documentTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentTypesUndefined: Self = StObject.set(x, "documentTypes", js.undefined)
      
      @scala.inline
      def setForceCrossDevice(value: Boolean): Self = StObject.set(x, "forceCrossDevice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceCrossDeviceUndefined: Self = StObject.set(x, "forceCrossDevice", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setNextButton(value: String): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
      
      @scala.inline
      def setRequestedVariant(value: standard | video): Self = StObject.set(x, "requestedVariant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestedVariantUndefined: Self = StObject.set(x, "requestedVariant", js.undefined)
      
      @scala.inline
      def setSubmessage(value: String): Self = StObject.set(x, "submessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmessageUndefined: Self = StObject.set(x, "submessage", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUploadFallback(value: `false`): Self = StObject.set(x, "uploadFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadFallbackUndefined: Self = StObject.set(x, "uploadFallback", js.undefined)
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
    
    var side: String = js.native
    
    var `type`: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String, side: String, `type`: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var options: Country = js.native
    
    var `type`: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(options: Country, `type`: String): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: Country): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Variant extends StObject {
    
    var id: String = js.native
    
    var variant: String = js.native
  }
  object Variant {
    
    @scala.inline
    def apply(id: String, variant: String): Variant = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
      __obj.asInstanceOf[Variant]
    }
    
    @scala.inline
    implicit class VariantMutableBuilder[Self <: Variant] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    }
  }
}
