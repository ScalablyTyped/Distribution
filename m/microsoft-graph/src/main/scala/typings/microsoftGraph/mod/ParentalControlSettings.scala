package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentalControlSettings extends StObject {
  
  /**
    * Specifies the two-letter ISO country codes. Access to the application will be blocked for minors from the countries
    * specified in this list.
    */
  var countriesBlockedForMinors: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * Specifies the legal age group rule that applies to users of the app. Can be set to one of the following values:
    * ValueDescriptionAllowDefault. Enforces the legal minimum. This means parental consent is required for minors in the
    * European Union and Korea.RequireConsentForPrivacyServicesEnforces the user to specify date of birth to comply with
    * COPPA rules. RequireConsentForMinorsRequires parental consent for ages below 18, regardless of country minor
    * rules.RequireConsentForKidsRequires parental consent for ages below 14, regardless of country minor
    * rules.BlockMinorsBlocks minors from using the app.
    */
  var legalAgeGroupRule: js.UndefOr[NullableOption[String]] = js.undefined
}
object ParentalControlSettings {
  
  inline def apply(): ParentalControlSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentalControlSettings]
  }
  
  extension [Self <: ParentalControlSettings](x: Self) {
    
    inline def setCountriesBlockedForMinors(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "countriesBlockedForMinors", value.asInstanceOf[js.Any])
    
    inline def setCountriesBlockedForMinorsNull: Self = StObject.set(x, "countriesBlockedForMinors", null)
    
    inline def setCountriesBlockedForMinorsUndefined: Self = StObject.set(x, "countriesBlockedForMinors", js.undefined)
    
    inline def setCountriesBlockedForMinorsVarargs(value: String*): Self = StObject.set(x, "countriesBlockedForMinors", js.Array(value*))
    
    inline def setLegalAgeGroupRule(value: NullableOption[String]): Self = StObject.set(x, "legalAgeGroupRule", value.asInstanceOf[js.Any])
    
    inline def setLegalAgeGroupRuleNull: Self = StObject.set(x, "legalAgeGroupRule", null)
    
    inline def setLegalAgeGroupRuleUndefined: Self = StObject.set(x, "legalAgeGroupRule", js.undefined)
  }
}
