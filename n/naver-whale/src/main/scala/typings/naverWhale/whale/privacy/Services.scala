package typings.naverWhale.whale.privacy

import typings.chrome.chrome.types.ChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Services extends js.Object {
  var alternateErrorPagesEnabled: ChromeSetting = js.native
  /** @since Chrome 70. */
  var autofillAddressEnabled: ChromeSetting = js.native
  /** @since Chrome 70. */
  var autofillCreditCardEnabled: ChromeSetting = js.native
  /** @deprecated since Chrome 70. Please use privacy.services.autofillAddressEnabled and privacy.services.autofillCreditCardEnabled. */
  var autofillEnabled: ChromeSetting = js.native
  /** @since Chrome 42. */
  var hotwordSearchEnabled: ChromeSetting = js.native
  var instantEnabled: ChromeSetting = js.native
  /** @since Chrome 38. */
  var passwordSavingEnabled: ChromeSetting = js.native
  var safeBrowsingEnabled: ChromeSetting = js.native
  /** @since Chrome 42. */
  var safeBrowsingExtendedReportingEnabled: ChromeSetting = js.native
  var searchSuggestEnabled: ChromeSetting = js.native
  /** since Chrome 20. */
  var spellingServiceEnabled: ChromeSetting = js.native
  var translationServiceEnabled: ChromeSetting = js.native
}

object Services {
  @scala.inline
  def apply(
    alternateErrorPagesEnabled: ChromeSetting,
    autofillAddressEnabled: ChromeSetting,
    autofillCreditCardEnabled: ChromeSetting,
    autofillEnabled: ChromeSetting,
    hotwordSearchEnabled: ChromeSetting,
    instantEnabled: ChromeSetting,
    passwordSavingEnabled: ChromeSetting,
    safeBrowsingEnabled: ChromeSetting,
    safeBrowsingExtendedReportingEnabled: ChromeSetting,
    searchSuggestEnabled: ChromeSetting,
    spellingServiceEnabled: ChromeSetting,
    translationServiceEnabled: ChromeSetting
  ): Services = {
    val __obj = js.Dynamic.literal(alternateErrorPagesEnabled = alternateErrorPagesEnabled.asInstanceOf[js.Any], autofillAddressEnabled = autofillAddressEnabled.asInstanceOf[js.Any], autofillCreditCardEnabled = autofillCreditCardEnabled.asInstanceOf[js.Any], autofillEnabled = autofillEnabled.asInstanceOf[js.Any], hotwordSearchEnabled = hotwordSearchEnabled.asInstanceOf[js.Any], instantEnabled = instantEnabled.asInstanceOf[js.Any], passwordSavingEnabled = passwordSavingEnabled.asInstanceOf[js.Any], safeBrowsingEnabled = safeBrowsingEnabled.asInstanceOf[js.Any], safeBrowsingExtendedReportingEnabled = safeBrowsingExtendedReportingEnabled.asInstanceOf[js.Any], searchSuggestEnabled = searchSuggestEnabled.asInstanceOf[js.Any], spellingServiceEnabled = spellingServiceEnabled.asInstanceOf[js.Any], translationServiceEnabled = translationServiceEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Services]
  }
  @scala.inline
  implicit class ServicesOps[Self <: Services] (val x: Self) extends AnyVal {
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
    def setAlternateErrorPagesEnabled(value: ChromeSetting): Self = this.set("alternateErrorPagesEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutofillAddressEnabled(value: ChromeSetting): Self = this.set("autofillAddressEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutofillCreditCardEnabled(value: ChromeSetting): Self = this.set("autofillCreditCardEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutofillEnabled(value: ChromeSetting): Self = this.set("autofillEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setHotwordSearchEnabled(value: ChromeSetting): Self = this.set("hotwordSearchEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstantEnabled(value: ChromeSetting): Self = this.set("instantEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setPasswordSavingEnabled(value: ChromeSetting): Self = this.set("passwordSavingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setSafeBrowsingEnabled(value: ChromeSetting): Self = this.set("safeBrowsingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setSafeBrowsingExtendedReportingEnabled(value: ChromeSetting): Self = this.set("safeBrowsingExtendedReportingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchSuggestEnabled(value: ChromeSetting): Self = this.set("searchSuggestEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpellingServiceEnabled(value: ChromeSetting): Self = this.set("spellingServiceEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslationServiceEnabled(value: ChromeSetting): Self = this.set("translationServiceEnabled", value.asInstanceOf[js.Any])
  }
  
}

