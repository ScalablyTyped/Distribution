package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentalControlSettings extends js.Object {
  /**
    * Specifies the two-letter ISO country codes. Access to the application will be blocked for minors from the countries
    * specified in this list.
    */
  var countriesBlockedForMinors: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies the legal age group rule that applies to users of the app. Can be set to one of the following values:
    * ValueDescriptionAllowDefault. Enforces the legal minimum. This means parental consent is required for minors in the
    * European Union and Korea.RequireConsentForPrivacyServicesEnforces the user to specify date of birth to comply with
    * COPPA rules. RequireConsentForMinorsRequires parental consent for ages below 18, regardless of country minor
    * rules.RequireConsentForKidsRequires parental consent for ages below 14, regardless of country minor
    * rules.BlockMinorsBlocks minors from using the app.
    */
  var legalAgeGroupRule: js.UndefOr[String] = js.native
}

object ParentalControlSettings {
  @scala.inline
  def apply(): ParentalControlSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentalControlSettings]
  }
  @scala.inline
  implicit class ParentalControlSettingsOps[Self <: ParentalControlSettings] (val x: Self) extends AnyVal {
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
    def setCountriesBlockedForMinorsVarargs(value: String*): Self = this.set("countriesBlockedForMinors", js.Array(value :_*))
    @scala.inline
    def setCountriesBlockedForMinors(value: js.Array[String]): Self = this.set("countriesBlockedForMinors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountriesBlockedForMinors: Self = this.set("countriesBlockedForMinors", js.undefined)
    @scala.inline
    def setLegalAgeGroupRule(value: String): Self = this.set("legalAgeGroupRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegalAgeGroupRule: Self = this.set("legalAgeGroupRule", js.undefined)
  }
  
}

