package typings.maximMazurokGapiClientIap.gapi.client.iap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Brand extends js.Object {
  
  /** Application name displayed on OAuth consent screen. */
  var applicationTitle: js.UndefOr[String] = js.native
  
  /** Output only. Identifier of the brand. NOTE: GCP project number achieves the same brand identification purpose as only one brand per project can be created. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. Whether the brand is only intended for usage inside the G Suite organization only. */
  var orgInternalOnly: js.UndefOr[Boolean] = js.native
  
  /** Support email displayed on the OAuth consent screen. */
  var supportEmail: js.UndefOr[String] = js.native
}
object Brand {
  
  @scala.inline
  def apply(): Brand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Brand]
  }
  
  @scala.inline
  implicit class BrandOps[Self <: Brand] (val x: Self) extends AnyVal {
    
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
    def setApplicationTitle(value: String): Self = this.set("applicationTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationTitle: Self = this.set("applicationTitle", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrgInternalOnly(value: Boolean): Self = this.set("orgInternalOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrgInternalOnly: Self = this.set("orgInternalOnly", js.undefined)
    
    @scala.inline
    def setSupportEmail(value: String): Self = this.set("supportEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportEmail: Self = this.set("supportEmail", js.undefined)
  }
}
