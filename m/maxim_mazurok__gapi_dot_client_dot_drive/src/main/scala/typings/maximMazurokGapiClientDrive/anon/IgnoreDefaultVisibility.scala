package typings.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreDefaultVisibility extends StObject {
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /** Deprecated. Copying files into multiple folders is no longer supported. Use shortcuts instead. */
  var enforceSingleParent: js.UndefOr[Boolean] = js.undefined
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /** The ID of the file. */
  var fileId: String
  
  /**
    * Whether to ignore the domain's default visibility settings for the created file. Domain administrators can choose to make all uploaded files visible to the domain by default;
    * this parameter bypasses that behavior for the request. Permissions are still inherited from parent folders.
    */
  var ignoreDefaultVisibility: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies which additional view's permissions to include in the response. Only 'published' is supported. */
  var includePermissionsForView: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to set the 'keepForever' field in the new head revision. This is only applicable to files with binary content in Google Drive. Only 200 revisions for the file can be
    * kept forever. If the limit is reached, try deleting pinned revisions.
    */
  var keepRevisionForever: js.UndefOr[Boolean] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /** A language hint for OCR processing during image import (ISO 639-1 code). */
  var ocrLanguage: js.UndefOr[String] = js.undefined
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /** Whether the requesting application supports both My Drives and shared drives. */
  var supportsAllDrives: js.UndefOr[Boolean] = js.undefined
  
  /** Deprecated use supportsAllDrives instead. */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.undefined
}
object IgnoreDefaultVisibility {
  
  @scala.inline
  def apply(fileId: String): IgnoreDefaultVisibility = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreDefaultVisibility]
  }
  
  @scala.inline
  implicit class IgnoreDefaultVisibilityMutableBuilder[Self <: IgnoreDefaultVisibility] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setEnforceSingleParent(value: Boolean): Self = StObject.set(x, "enforceSingleParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceSingleParentUndefined: Self = StObject.set(x, "enforceSingleParent", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreDefaultVisibility(value: Boolean): Self = StObject.set(x, "ignoreDefaultVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreDefaultVisibilityUndefined: Self = StObject.set(x, "ignoreDefaultVisibility", js.undefined)
    
    @scala.inline
    def setIncludePermissionsForView(value: String): Self = StObject.set(x, "includePermissionsForView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludePermissionsForViewUndefined: Self = StObject.set(x, "includePermissionsForView", js.undefined)
    
    @scala.inline
    def setKeepRevisionForever(value: Boolean): Self = StObject.set(x, "keepRevisionForever", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepRevisionForeverUndefined: Self = StObject.set(x, "keepRevisionForever", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    @scala.inline
    def setOcrLanguage(value: String): Self = StObject.set(x, "ocrLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcrLanguageUndefined: Self = StObject.set(x, "ocrLanguage", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    @scala.inline
    def setSupportsAllDrives(value: Boolean): Self = StObject.set(x, "supportsAllDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsAllDrivesUndefined: Self = StObject.set(x, "supportsAllDrives", js.undefined)
    
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
    
    @scala.inline
    def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
  }
}
