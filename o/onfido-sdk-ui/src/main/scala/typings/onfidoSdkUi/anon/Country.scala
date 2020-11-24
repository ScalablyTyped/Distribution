package typings.onfidoSdkUi.anon

import typings.onfidoSdkUi.onfidoSdkUiBooleans.`false`
import typings.onfidoSdkUi.onfidoSdkUiStrings.standard
import typings.onfidoSdkUi.onfidoSdkUiStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Country extends js.Object {
  
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
  implicit class CountryOps[Self <: Country] (val x: Self) extends AnyVal {
    
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setDescriptionsVarargs(value: String*): Self = this.set("descriptions", js.Array(value :_*))
    
    @scala.inline
    def setDescriptions(value: js.Array[String]): Self = this.set("descriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptions: Self = this.set("descriptions", js.undefined)
    
    @scala.inline
    def setDocumentTypes(value: Bankbuildingsocietystatement): Self = this.set("documentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentTypes: Self = this.set("documentTypes", js.undefined)
    
    @scala.inline
    def setForceCrossDevice(value: Boolean): Self = this.set("forceCrossDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceCrossDevice: Self = this.set("forceCrossDevice", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setNextButton(value: String): Self = this.set("nextButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextButton: Self = this.set("nextButton", js.undefined)
    
    @scala.inline
    def setRequestedVariant(value: standard | video): Self = this.set("requestedVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedVariant: Self = this.set("requestedVariant", js.undefined)
    
    @scala.inline
    def setSubmessage(value: String): Self = this.set("submessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmessage: Self = this.set("submessage", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUploadFallback(value: `false`): Self = this.set("uploadFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadFallback: Self = this.set("uploadFallback", js.undefined)
  }
}
