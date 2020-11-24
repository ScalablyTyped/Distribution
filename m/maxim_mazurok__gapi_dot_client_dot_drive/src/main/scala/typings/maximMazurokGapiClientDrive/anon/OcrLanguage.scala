package typings.maximMazurokGapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OcrLanguage extends js.Object {
  
  /** A comma-separated list of parent IDs to add. */
  var addParents: js.UndefOr[String] = js.native
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  
  /** Deprecated. Adding files to multiple folders is no longer supported. Use shortcuts instead. */
  var enforceSingleParent: js.UndefOr[Boolean] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** The ID of the file. */
  var fileId: String = js.native
  
  /** Specifies which additional view's permissions to include in the response. Only 'published' is supported. */
  var includePermissionsForView: js.UndefOr[String] = js.native
  
  /**
    * Whether to set the 'keepForever' field in the new head revision. This is only applicable to files with binary content in Google Drive. Only 200 revisions for the file can be
    * kept forever. If the limit is reached, try deleting pinned revisions.
    */
  var keepRevisionForever: js.UndefOr[Boolean] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** A language hint for OCR processing during image import (ISO 639-1 code). */
  var ocrLanguage: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** A comma-separated list of parent IDs to remove. */
  var removeParents: js.UndefOr[String] = js.native
  
  /** Whether the requesting application supports both My Drives and shared drives. */
  var supportsAllDrives: js.UndefOr[Boolean] = js.native
  
  /** Deprecated use supportsAllDrives instead. */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  
  /** Whether to use the uploaded content as indexable text. */
  var useContentAsIndexableText: js.UndefOr[Boolean] = js.native
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.native
}
object OcrLanguage {
  
  @scala.inline
  def apply(fileId: String): OcrLanguage = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OcrLanguage]
  }
  
  @scala.inline
  implicit class OcrLanguageOps[Self <: OcrLanguage] (val x: Self) extends AnyVal {
    
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
    def setFileId(value: String): Self = this.set("fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddParents(value: String): Self = this.set("addParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddParents: Self = this.set("addParents", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setEnforceSingleParent(value: Boolean): Self = this.set("enforceSingleParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceSingleParent: Self = this.set("enforceSingleParent", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setIncludePermissionsForView(value: String): Self = this.set("includePermissionsForView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludePermissionsForView: Self = this.set("includePermissionsForView", js.undefined)
    
    @scala.inline
    def setKeepRevisionForever(value: Boolean): Self = this.set("keepRevisionForever", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepRevisionForever: Self = this.set("keepRevisionForever", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    
    @scala.inline
    def setOcrLanguage(value: String): Self = this.set("ocrLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOcrLanguage: Self = this.set("ocrLanguage", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    
    @scala.inline
    def setRemoveParents(value: String): Self = this.set("removeParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveParents: Self = this.set("removeParents", js.undefined)
    
    @scala.inline
    def setSupportsAllDrives(value: Boolean): Self = this.set("supportsAllDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsAllDrives: Self = this.set("supportsAllDrives", js.undefined)
    
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = this.set("supportsTeamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsTeamDrives: Self = this.set("supportsTeamDrives", js.undefined)
    
    @scala.inline
    def setUseContentAsIndexableText(value: Boolean): Self = this.set("useContentAsIndexableText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseContentAsIndexableText: Self = this.set("useContentAsIndexableText", js.undefined)
    
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
}
