package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Windows10SecureAssessmentConfiguration extends DeviceConfiguration {
  // Indicates whether or not to allow the app from printing during the test.
  var allowPrinting: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow screen capture capability during a test.
  var allowScreenCapture: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow text suggestions during the test.
  var allowTextSuggestion: js.UndefOr[Boolean] = js.native
  /**
    * The account used to configure the Windows device for taking the test. The user can be a domain account (domain/user),
    * an AAD account (username@tenant.com) or a local account (username).
    */
  var configurationAccount: js.UndefOr[String] = js.native
  /**
    * Url link to an assessment that's automatically loaded when the secure assessment browser is launched. It has to be a
    * valid Url (http[s]://msdn.microsoft.com/).
    */
  var launchUri: js.UndefOr[String] = js.native
}

object Windows10SecureAssessmentConfiguration {
  @scala.inline
  def apply(): Windows10SecureAssessmentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10SecureAssessmentConfiguration]
  }
  @scala.inline
  implicit class Windows10SecureAssessmentConfigurationOps[Self <: Windows10SecureAssessmentConfiguration] (val x: Self) extends AnyVal {
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
    def setAllowPrinting(value: Boolean): Self = this.set("allowPrinting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowPrinting: Self = this.set("allowPrinting", js.undefined)
    @scala.inline
    def setAllowScreenCapture(value: Boolean): Self = this.set("allowScreenCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowScreenCapture: Self = this.set("allowScreenCapture", js.undefined)
    @scala.inline
    def setAllowTextSuggestion(value: Boolean): Self = this.set("allowTextSuggestion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTextSuggestion: Self = this.set("allowTextSuggestion", js.undefined)
    @scala.inline
    def setConfigurationAccount(value: String): Self = this.set("configurationAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationAccount: Self = this.set("configurationAccount", js.undefined)
    @scala.inline
    def setLaunchUri(value: String): Self = this.set("launchUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchUri: Self = this.set("launchUri", js.undefined)
  }
  
}

