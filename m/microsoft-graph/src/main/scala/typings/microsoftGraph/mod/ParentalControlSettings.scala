package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentalControlSettings extends StObject {
  
  /**
    * Specifies the two-letter ISO country codes. Access to the application will be blocked for minors from the countries
    * specified in this list.
    */
  var countriesBlockedForMinors: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  /**
    * Specifies the legal age group rule that applies to users of the app. Can be set to one of the following values:
    * ValueDescriptionAllowDefault. Enforces the legal minimum. This means parental consent is required for minors in the
    * European Union and Korea.RequireConsentForPrivacyServicesEnforces the user to specify date of birth to comply with
    * COPPA rules. RequireConsentForMinorsRequires parental consent for ages below 18, regardless of country minor
    * rules.RequireConsentForKidsRequires parental consent for ages below 14, regardless of country minor
    * rules.BlockMinorsBlocks minors from using the app.
    */
  var legalAgeGroupRule: js.UndefOr[NullableOption[String]] = js.native
}
object ParentalControlSettings {
  
  @scala.inline
  def apply(): ParentalControlSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentalControlSettings]
  }
  
  @scala.inline
  implicit class ParentalControlSettingsMutableBuilder[Self <: ParentalControlSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountriesBlockedForMinors(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "countriesBlockedForMinors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountriesBlockedForMinorsNull: Self = StObject.set(x, "countriesBlockedForMinors", null)
    
    @scala.inline
    def setCountriesBlockedForMinorsUndefined: Self = StObject.set(x, "countriesBlockedForMinors", js.undefined)
    
    @scala.inline
    def setCountriesBlockedForMinorsVarargs(value: String*): Self = StObject.set(x, "countriesBlockedForMinors", js.Array(value :_*))
    
    @scala.inline
    def setLegalAgeGroupRule(value: NullableOption[String]): Self = StObject.set(x, "legalAgeGroupRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalAgeGroupRuleNull: Self = StObject.set(x, "legalAgeGroupRule", null)
    
    @scala.inline
    def setLegalAgeGroupRuleUndefined: Self = StObject.set(x, "legalAgeGroupRule", js.undefined)
  }
}
