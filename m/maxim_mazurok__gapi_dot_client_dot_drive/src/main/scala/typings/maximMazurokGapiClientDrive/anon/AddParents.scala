package typings.maximMazurokGapiClientDrive.anon

import typings.maximMazurokGapiClientDrive.gapi.client.drive.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddParents extends StObject {
  
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
  
  /** Request body */
  var resource: File = js.native
  
  /** Whether the requesting application supports both My Drives and shared drives. */
  var supportsAllDrives: js.UndefOr[Boolean] = js.native
  
  /** Deprecated use supportsAllDrives instead. */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  
  /** Whether to use the uploaded content as indexable text. */
  var useContentAsIndexableText: js.UndefOr[Boolean] = js.native
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.native
}
object AddParents {
  
  @scala.inline
  def apply(fileId: String, resource: File): AddParents = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddParents]
  }
  
  @scala.inline
  implicit class AddParentsMutableBuilder[Self <: AddParents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddParents(value: String): Self = StObject.set(x, "addParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddParentsUndefined: Self = StObject.set(x, "addParents", js.undefined)
    
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
    def setRemoveParents(value: String): Self = StObject.set(x, "removeParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveParentsUndefined: Self = StObject.set(x, "removeParents", js.undefined)
    
    @scala.inline
    def setResource(value: File): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsAllDrives(value: Boolean): Self = StObject.set(x, "supportsAllDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsAllDrivesUndefined: Self = StObject.set(x, "supportsAllDrives", js.undefined)
    
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
    
    @scala.inline
    def setUseContentAsIndexableText(value: Boolean): Self = StObject.set(x, "useContentAsIndexableText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseContentAsIndexableTextUndefined: Self = StObject.set(x, "useContentAsIndexableText", js.undefined)
    
    @scala.inline
    def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
  }
}
