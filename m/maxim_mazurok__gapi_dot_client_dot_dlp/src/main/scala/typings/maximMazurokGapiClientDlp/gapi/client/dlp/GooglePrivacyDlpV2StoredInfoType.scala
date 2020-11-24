package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2StoredInfoType extends js.Object {
  
  /** Current version of the stored info type. */
  var currentVersion: js.UndefOr[GooglePrivacyDlpV2StoredInfoTypeVersion] = js.native
  
  /** Resource name. */
  var name: js.UndefOr[String] = js.native
  
  /** Pending versions of the stored info type. Empty if no versions are pending. */
  var pendingVersions: js.UndefOr[js.Array[GooglePrivacyDlpV2StoredInfoTypeVersion]] = js.native
}
object GooglePrivacyDlpV2StoredInfoType {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2StoredInfoType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2StoredInfoType]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2StoredInfoTypeOps[Self <: GooglePrivacyDlpV2StoredInfoType] (val x: Self) extends AnyVal {
    
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
    def setCurrentVersion(value: GooglePrivacyDlpV2StoredInfoTypeVersion): Self = this.set("currentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentVersion: Self = this.set("currentVersion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPendingVersionsVarargs(value: GooglePrivacyDlpV2StoredInfoTypeVersion*): Self = this.set("pendingVersions", js.Array(value :_*))
    
    @scala.inline
    def setPendingVersions(value: js.Array[GooglePrivacyDlpV2StoredInfoTypeVersion]): Self = this.set("pendingVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingVersions: Self = this.set("pendingVersions", js.undefined)
  }
}
