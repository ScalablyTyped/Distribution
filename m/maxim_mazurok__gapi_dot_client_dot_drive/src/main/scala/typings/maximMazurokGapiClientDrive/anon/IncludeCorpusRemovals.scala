package typings.maximMazurokGapiClientDrive.anon

import typings.maximMazurokGapiClientDrive.gapi.client.drive.Channel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeCorpusRemovals extends StObject {
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /** The shared drive from which changes are returned. If specified the change IDs will be reflective of the shared drive; use the combined drive ID and change ID as an identifier. */
  var driveId: js.UndefOr[String] = js.undefined
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /**
    * Whether changes should include the file resource if the file is still accessible by the user at the time of the request, even when a file was removed from the list of changes
    * and there will be no further change entries for this file.
    */
  var includeCorpusRemovals: js.UndefOr[Boolean] = js.undefined
  
  /** Whether both My Drive and shared drive items should be included in results. */
  var includeItemsFromAllDrives: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies which additional view's permissions to include in the response. Only 'published' is supported. */
  var includePermissionsForView: js.UndefOr[String] = js.undefined
  
  /** Whether to include changes indicating that items have been removed from the list of changes, for example by deletion or loss of access. */
  var includeRemoved: js.UndefOr[Boolean] = js.undefined
  
  /** Deprecated use includeItemsFromAllDrives instead. */
  var includeTeamDriveItems: js.UndefOr[Boolean] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /** The maximum number of changes to return per page. */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response or to the response from the
    * getStartPageToken method.
    */
  var pageToken: String
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /** Request body */
  var resource: Channel
  
  /**
    * Whether to restrict the results to changes inside the My Drive hierarchy. This omits changes to files such as those in the Application Data folder or shared files which have not
    * been added to My Drive.
    */
  var restrictToMyDrive: js.UndefOr[Boolean] = js.undefined
  
  /** A comma-separated list of spaces to query within the user corpus. Supported values are 'drive', 'appDataFolder' and 'photos'. */
  var spaces: js.UndefOr[String] = js.undefined
  
  /** Whether the requesting application supports both My Drives and shared drives. */
  var supportsAllDrives: js.UndefOr[Boolean] = js.undefined
  
  /** Deprecated use supportsAllDrives instead. */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  
  /** Deprecated use driveId instead. */
  var teamDriveId: js.UndefOr[String] = js.undefined
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.undefined
}
object IncludeCorpusRemovals {
  
  @scala.inline
  def apply(pageToken: String, resource: Channel): IncludeCorpusRemovals = {
    val __obj = js.Dynamic.literal(pageToken = pageToken.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeCorpusRemovals]
  }
  
  @scala.inline
  implicit class IncludeCorpusRemovalsMutableBuilder[Self <: IncludeCorpusRemovals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setDriveId(value: String): Self = StObject.set(x, "driveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveIdUndefined: Self = StObject.set(x, "driveId", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setIncludeCorpusRemovals(value: Boolean): Self = StObject.set(x, "includeCorpusRemovals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCorpusRemovalsUndefined: Self = StObject.set(x, "includeCorpusRemovals", js.undefined)
    
    @scala.inline
    def setIncludeItemsFromAllDrives(value: Boolean): Self = StObject.set(x, "includeItemsFromAllDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeItemsFromAllDrivesUndefined: Self = StObject.set(x, "includeItemsFromAllDrives", js.undefined)
    
    @scala.inline
    def setIncludePermissionsForView(value: String): Self = StObject.set(x, "includePermissionsForView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludePermissionsForViewUndefined: Self = StObject.set(x, "includePermissionsForView", js.undefined)
    
    @scala.inline
    def setIncludeRemoved(value: Boolean): Self = StObject.set(x, "includeRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeRemovedUndefined: Self = StObject.set(x, "includeRemoved", js.undefined)
    
    @scala.inline
    def setIncludeTeamDriveItems(value: Boolean): Self = StObject.set(x, "includeTeamDriveItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTeamDriveItemsUndefined: Self = StObject.set(x, "includeTeamDriveItems", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    @scala.inline
    def setResource(value: Channel): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictToMyDrive(value: Boolean): Self = StObject.set(x, "restrictToMyDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictToMyDriveUndefined: Self = StObject.set(x, "restrictToMyDrive", js.undefined)
    
    @scala.inline
    def setSpaces(value: String): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
    
    @scala.inline
    def setSupportsAllDrives(value: Boolean): Self = StObject.set(x, "supportsAllDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsAllDrivesUndefined: Self = StObject.set(x, "supportsAllDrives", js.undefined)
    
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
    
    @scala.inline
    def setTeamDriveId(value: String): Self = StObject.set(x, "teamDriveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDriveIdUndefined: Self = StObject.set(x, "teamDriveId", js.undefined)
    
    @scala.inline
    def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
  }
}
