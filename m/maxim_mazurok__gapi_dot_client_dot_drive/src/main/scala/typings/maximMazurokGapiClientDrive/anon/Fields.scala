package typings.maximMazurokGapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fields extends js.Object {
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  
  /** The shared drive from which changes are returned. If specified the change IDs will be reflective of the shared drive; use the combined drive ID and change ID as an identifier. */
  var driveId: js.UndefOr[String] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * Whether changes should include the file resource if the file is still accessible by the user at the time of the request, even when a file was removed from the list of changes
    * and there will be no further change entries for this file.
    */
  var includeCorpusRemovals: js.UndefOr[Boolean] = js.native
  
  /** Whether both My Drive and shared drive items should be included in results. */
  var includeItemsFromAllDrives: js.UndefOr[Boolean] = js.native
  
  /** Specifies which additional view's permissions to include in the response. Only 'published' is supported. */
  var includePermissionsForView: js.UndefOr[String] = js.native
  
  /** Whether to include changes indicating that items have been removed from the list of changes, for example by deletion or loss of access. */
  var includeRemoved: js.UndefOr[Boolean] = js.native
  
  /** Deprecated use includeItemsFromAllDrives instead. */
  var includeTeamDriveItems: js.UndefOr[Boolean] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** The maximum number of changes to return per page. */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response or to the response from the
    * getStartPageToken method.
    */
  var pageToken: String = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /**
    * Whether to restrict the results to changes inside the My Drive hierarchy. This omits changes to files such as those in the Application Data folder or shared files which have not
    * been added to My Drive.
    */
  var restrictToMyDrive: js.UndefOr[Boolean] = js.native
  
  /** A comma-separated list of spaces to query within the user corpus. Supported values are 'drive', 'appDataFolder' and 'photos'. */
  var spaces: js.UndefOr[String] = js.native
  
  /** Whether the requesting application supports both My Drives and shared drives. */
  var supportsAllDrives: js.UndefOr[Boolean] = js.native
  
  /** Deprecated use supportsAllDrives instead. */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  
  /** Deprecated use driveId instead. */
  var teamDriveId: js.UndefOr[String] = js.native
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.native
}
object Fields {
  
  @scala.inline
  def apply(pageToken: String): Fields = {
    val __obj = js.Dynamic.literal(pageToken = pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
  
  @scala.inline
  implicit class FieldsOps[Self <: Fields] (val x: Self) extends AnyVal {
    
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
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setDriveId(value: String): Self = this.set("driveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveId: Self = this.set("driveId", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setIncludeCorpusRemovals(value: Boolean): Self = this.set("includeCorpusRemovals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeCorpusRemovals: Self = this.set("includeCorpusRemovals", js.undefined)
    
    @scala.inline
    def setIncludeItemsFromAllDrives(value: Boolean): Self = this.set("includeItemsFromAllDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeItemsFromAllDrives: Self = this.set("includeItemsFromAllDrives", js.undefined)
    
    @scala.inline
    def setIncludePermissionsForView(value: String): Self = this.set("includePermissionsForView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludePermissionsForView: Self = this.set("includePermissionsForView", js.undefined)
    
    @scala.inline
    def setIncludeRemoved(value: Boolean): Self = this.set("includeRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeRemoved: Self = this.set("includeRemoved", js.undefined)
    
    @scala.inline
    def setIncludeTeamDriveItems(value: Boolean): Self = this.set("includeTeamDriveItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeTeamDriveItems: Self = this.set("includeTeamDriveItems", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    
    @scala.inline
    def setRestrictToMyDrive(value: Boolean): Self = this.set("restrictToMyDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictToMyDrive: Self = this.set("restrictToMyDrive", js.undefined)
    
    @scala.inline
    def setSpaces(value: String): Self = this.set("spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaces: Self = this.set("spaces", js.undefined)
    
    @scala.inline
    def setSupportsAllDrives(value: Boolean): Self = this.set("supportsAllDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsAllDrives: Self = this.set("supportsAllDrives", js.undefined)
    
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = this.set("supportsTeamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsTeamDrives: Self = this.set("supportsTeamDrives", js.undefined)
    
    @scala.inline
    def setTeamDriveId(value: String): Self = this.set("teamDriveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamDriveId: Self = this.set("teamDriveId", js.undefined)
    
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
}
