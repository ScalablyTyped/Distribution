package typings.passportAzureAd.oidcStrategyMod

import typings.passportAzureAd.anon.FamilyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProfile extends js.Object {
  
  var _json: js.UndefOr[js.Any] = js.native
  
  var _raw: js.UndefOr[String] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var emails: js.UndefOr[js.Any] = js.native
  
  var name: js.UndefOr[FamilyName] = js.native
  
  var oid: js.UndefOr[String] = js.native
  
  var sub: js.UndefOr[String] = js.native
  
  var upn: js.UndefOr[String] = js.native
}
object IProfile {
  
  @scala.inline
  def apply(): IProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProfile]
  }
  
  @scala.inline
  implicit class IProfileOps[Self <: IProfile] (val x: Self) extends AnyVal {
    
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
    def set_json(value: js.Any): Self = this.set("_json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_json: Self = this.set("_json", js.undefined)
    
    @scala.inline
    def set_raw(value: String): Self = this.set("_raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_raw: Self = this.set("_raw", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEmails(value: js.Any): Self = this.set("emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmails: Self = this.set("emails", js.undefined)
    
    @scala.inline
    def setName(value: FamilyName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOid(value: String): Self = this.set("oid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOid: Self = this.set("oid", js.undefined)
    
    @scala.inline
    def setSub(value: String): Self = this.set("sub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSub: Self = this.set("sub", js.undefined)
    
    @scala.inline
    def setUpn(value: String): Self = this.set("upn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpn: Self = this.set("upn", js.undefined)
  }
}
