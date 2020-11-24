package typings.maximMazurokGapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.TopLevel
import typings.maximMazurokGapiClientDrive.anon.Aperture
import typings.maximMazurokGapiClientDrive.anon.CanAddFolderFromAnotherDrive
import typings.maximMazurokGapiClientDrive.anon.DurationMillis
import typings.maximMazurokGapiClientDrive.anon.IndexableText
import typings.maximMazurokGapiClientDrive.anon.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends js.Object {
  
  /**
    * A collection of arbitrary key-value pairs which are private to the requesting app.
    * Entries with null values are cleared in update and copy requests.
    */
  var appProperties: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDrive.maximMazurokGapiClientDriveStrings.File with TopLevel[js.Any]
  ] = js.native
  
  /** Capabilities the current user has on this file. Each capability corresponds to a fine-grained action that a user may take. */
  var capabilities: js.UndefOr[CanAddFolderFromAnotherDrive] = js.native
  
  /** Additional information about the content of the file. These fields are never populated in responses. */
  var contentHints: js.UndefOr[IndexableText] = js.native
  
  /** Restrictions for accessing the content of the file. Only populated if such a restriction exists. */
  var contentRestrictions: js.UndefOr[js.Array[ContentRestriction]] = js.native
  
  /** Whether the options to copy, print, or download this file, should be disabled for readers and commenters. */
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.native
  
  /** The time at which the file was created (RFC 3339 date-time). */
  var createdTime: js.UndefOr[String] = js.native
  
  /** A short description of the file. */
  var description: js.UndefOr[String] = js.native
  
  /** ID of the shared drive the file resides in. Only populated for items in shared drives. */
  var driveId: js.UndefOr[String] = js.native
  
  /** Whether the file has been explicitly trashed, as opposed to recursively trashed from a parent folder. */
  var explicitlyTrashed: js.UndefOr[Boolean] = js.native
  
  /** Links for exporting Docs Editors files to specific formats. */
  var exportLinks: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDrive.maximMazurokGapiClientDriveStrings.File with TopLevel[js.Any]
  ] = js.native
  
  /** The final component of fullFileExtension. This is only available for files with binary content in Google Drive. */
  var fileExtension: js.UndefOr[String] = js.native
  
  /**
    * The color for a folder as an RGB hex string. The supported colors are published in the folderColorPalette field of the About resource.
    * If an unsupported color is specified, the closest color in the palette will be used instead.
    */
  var folderColorRgb: js.UndefOr[String] = js.native
  
  /**
    * The full file extension extracted from the name field. May contain multiple concatenated extensions, such as "tar.gz". This is only available for files with binary content in Google
    * Drive.
    * This is automatically updated when the name field changes, however it is not cleared if the new name does not contain a valid extension.
    */
  var fullFileExtension: js.UndefOr[String] = js.native
  
  /** Whether there are permissions directly on this file. This field is only populated for items in shared drives. */
  var hasAugmentedPermissions: js.UndefOr[Boolean] = js.native
  
  /** Whether this file has a thumbnail. This does not indicate whether the requesting app has access to the thumbnail. To check access, look for the presence of the thumbnailLink field. */
  var hasThumbnail: js.UndefOr[Boolean] = js.native
  
  /** The ID of the file's head revision. This is currently only available for files with binary content in Google Drive. */
  var headRevisionId: js.UndefOr[String] = js.native
  
  /** A static, unauthenticated link to the file's icon. */
  var iconLink: js.UndefOr[String] = js.native
  
  /** The ID of the file. */
  var id: js.UndefOr[String] = js.native
  
  /** Additional metadata about image media, if available. */
  var imageMediaMetadata: js.UndefOr[Aperture] = js.native
  
  /** Whether the file was created or opened by the requesting app. */
  var isAppAuthorized: js.UndefOr[Boolean] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "drive#file". */
  var kind: js.UndefOr[String] = js.native
  
  /** The last user to modify the file. */
  var lastModifyingUser: js.UndefOr[User] = js.native
  
  /** The MD5 checksum for the content of the file. This is only applicable to files with binary content in Google Drive. */
  var md5Checksum: js.UndefOr[String] = js.native
  
  /**
    * The MIME type of the file.
    * Google Drive will attempt to automatically detect an appropriate value from uploaded content if no value is provided. The value cannot be changed unless a new revision is uploaded.
    * If a file is created with a Google Doc MIME type, the uploaded content will be imported if possible. The supported import formats are published in the About resource.
    */
  var mimeType: js.UndefOr[String] = js.native
  
  /** Whether the file has been modified by this user. */
  var modifiedByMe: js.UndefOr[Boolean] = js.native
  
  /** The last time the file was modified by the user (RFC 3339 date-time). */
  var modifiedByMeTime: js.UndefOr[String] = js.native
  
  /**
    * The last time the file was modified by anyone (RFC 3339 date-time).
    * Note that setting modifiedTime will also update modifiedByMeTime for the user.
    */
  var modifiedTime: js.UndefOr[String] = js.native
  
  /**
    * The name of the file. This is not necessarily unique within a folder. Note that for immutable items such as the top level folders of shared drives, My Drive root folder, and
    * Application Data folder the name is constant.
    */
  var name: js.UndefOr[String] = js.native
  
  /** The original filename of the uploaded content if available, or else the original value of the name field. This is only available for files with binary content in Google Drive. */
  var originalFilename: js.UndefOr[String] = js.native
  
  /** Whether the user owns the file. Not populated for items in shared drives. */
  var ownedByMe: js.UndefOr[Boolean] = js.native
  
  /** The owners of the file. Currently, only certain legacy files may have more than one owner. Not populated for items in shared drives. */
  var owners: js.UndefOr[js.Array[User]] = js.native
  
  /**
    * The IDs of the parent folders which contain the file.
    * If not specified as part of a create request, the file will be placed directly in the user's My Drive folder. If not specified as part of a copy request, the file will inherit any
    * discoverable parents of the source file. Update requests must use the addParents and removeParents parameters to modify the parents list.
    */
  var parents: js.UndefOr[js.Array[String]] = js.native
  
  /** List of permission IDs for users with access to this file. */
  var permissionIds: js.UndefOr[js.Array[String]] = js.native
  
  /** The full list of permissions for the file. This is only available if the requesting user can share the file. Not populated for items in shared drives. */
  var permissions: js.UndefOr[js.Array[Permission]] = js.native
  
  /**
    * A collection of arbitrary key-value pairs which are visible to all apps.
    * Entries with null values are cleared in update and copy requests.
    */
  var properties: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDrive.maximMazurokGapiClientDriveStrings.File with TopLevel[js.Any]
  ] = js.native
  
  /** The number of storage quota bytes used by the file. This includes the head revision as well as previous revisions with keepForever enabled. */
  var quotaBytesUsed: js.UndefOr[String] = js.native
  
  /** Whether the file has been shared. Not populated for items in shared drives. */
  var shared: js.UndefOr[Boolean] = js.native
  
  /** The time at which the file was shared with the user, if applicable (RFC 3339 date-time). */
  var sharedWithMeTime: js.UndefOr[String] = js.native
  
  /** The user who shared the file with the requesting user, if applicable. */
  var sharingUser: js.UndefOr[User] = js.native
  
  /** Shortcut file details. Only populated for shortcut files, which have the mimeType field set to application/vnd.google-apps.shortcut. */
  var shortcutDetails: js.UndefOr[TargetId] = js.native
  
  /** The size of the file's content in bytes. This is applicable to binary files in Google Drive and Google Docs files. */
  var size: js.UndefOr[String] = js.native
  
  /** The list of spaces which contain the file. The currently supported values are 'drive', 'appDataFolder' and 'photos'. */
  var spaces: js.UndefOr[js.Array[String]] = js.native
  
  /** Whether the user has starred the file. */
  var starred: js.UndefOr[Boolean] = js.native
  
  /** Deprecated - use driveId instead. */
  var teamDriveId: js.UndefOr[String] = js.native
  
  /**
    * A short-lived link to the file's thumbnail, if available. Typically lasts on the order of hours. Only populated when the requesting app can access the file's content. If the file
    * isn't shared publicly, the URL returned in Files.thumbnailLink must be fetched using a credentialed request.
    */
  var thumbnailLink: js.UndefOr[String] = js.native
  
  /** The thumbnail version for use in thumbnail cache invalidation. */
  var thumbnailVersion: js.UndefOr[String] = js.native
  
  /**
    * Whether the file has been trashed, either explicitly or from a trashed parent folder. Only the owner may trash a file. The trashed item is excluded from all files.list responses
    * returned for any user who does not own the file. However, all users with access to the file can see the trashed item metadata in an API response. All users with access can copy,
    * download, export, and share the file.
    */
  var trashed: js.UndefOr[Boolean] = js.native
  
  /** The time that the item was trashed (RFC 3339 date-time). Only populated for items in shared drives. */
  var trashedTime: js.UndefOr[String] = js.native
  
  /** If the file has been explicitly trashed, the user who trashed it. Only populated for items in shared drives. */
  var trashingUser: js.UndefOr[User] = js.native
  
  /** A monotonically increasing version number for the file. This reflects every change made to the file on the server, even those not visible to the user. */
  var version: js.UndefOr[String] = js.native
  
  /** Additional metadata about video media. This may not be available immediately upon upload. */
  var videoMediaMetadata: js.UndefOr[DurationMillis] = js.native
  
  /** Whether the file has been viewed by this user. */
  var viewedByMe: js.UndefOr[Boolean] = js.native
  
  /** The last time the file was viewed by the user (RFC 3339 date-time). */
  var viewedByMeTime: js.UndefOr[String] = js.native
  
  /** Deprecated - use copyRequiresWriterPermission instead. */
  var viewersCanCopyContent: js.UndefOr[Boolean] = js.native
  
  /** A link for downloading the content of the file in a browser. This is only available for files with binary content in Google Drive. */
  var webContentLink: js.UndefOr[String] = js.native
  
  /** A link for opening the file in a relevant Google editor or viewer in a browser. */
  var webViewLink: js.UndefOr[String] = js.native
  
  /** Whether users with only writer permission can modify the file's permissions. Not populated for items in shared drives. */
  var writersCanShare: js.UndefOr[Boolean] = js.native
}
object File {
  
  @scala.inline
  def apply(): File = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    
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
    def setAppProperties(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDrive.maximMazurokGapiClientDriveStrings.File with TopLevel[js.Any]
    ): Self = this.set("appProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppProperties: Self = this.set("appProperties", js.undefined)
    
    @scala.inline
    def setCapabilities(value: CanAddFolderFromAnotherDrive): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilities: Self = this.set("capabilities", js.undefined)
    
    @scala.inline
    def setContentHints(value: IndexableText): Self = this.set("contentHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentHints: Self = this.set("contentHints", js.undefined)
    
    @scala.inline
    def setContentRestrictionsVarargs(value: ContentRestriction*): Self = this.set("contentRestrictions", js.Array(value :_*))
    
    @scala.inline
    def setContentRestrictions(value: js.Array[ContentRestriction]): Self = this.set("contentRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentRestrictions: Self = this.set("contentRestrictions", js.undefined)
    
    @scala.inline
    def setCopyRequiresWriterPermission(value: Boolean): Self = this.set("copyRequiresWriterPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyRequiresWriterPermission: Self = this.set("copyRequiresWriterPermission", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: String): Self = this.set("createdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("createdTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDriveId(value: String): Self = this.set("driveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveId: Self = this.set("driveId", js.undefined)
    
    @scala.inline
    def setExplicitlyTrashed(value: Boolean): Self = this.set("explicitlyTrashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitlyTrashed: Self = this.set("explicitlyTrashed", js.undefined)
    
    @scala.inline
    def setExportLinks(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDrive.maximMazurokGapiClientDriveStrings.File with TopLevel[js.Any]
    ): Self = this.set("exportLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportLinks: Self = this.set("exportLinks", js.undefined)
    
    @scala.inline
    def setFileExtension(value: String): Self = this.set("fileExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileExtension: Self = this.set("fileExtension", js.undefined)
    
    @scala.inline
    def setFolderColorRgb(value: String): Self = this.set("folderColorRgb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolderColorRgb: Self = this.set("folderColorRgb", js.undefined)
    
    @scala.inline
    def setFullFileExtension(value: String): Self = this.set("fullFileExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullFileExtension: Self = this.set("fullFileExtension", js.undefined)
    
    @scala.inline
    def setHasAugmentedPermissions(value: Boolean): Self = this.set("hasAugmentedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasAugmentedPermissions: Self = this.set("hasAugmentedPermissions", js.undefined)
    
    @scala.inline
    def setHasThumbnail(value: Boolean): Self = this.set("hasThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasThumbnail: Self = this.set("hasThumbnail", js.undefined)
    
    @scala.inline
    def setHeadRevisionId(value: String): Self = this.set("headRevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadRevisionId: Self = this.set("headRevisionId", js.undefined)
    
    @scala.inline
    def setIconLink(value: String): Self = this.set("iconLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconLink: Self = this.set("iconLink", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImageMediaMetadata(value: Aperture): Self = this.set("imageMediaMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageMediaMetadata: Self = this.set("imageMediaMetadata", js.undefined)
    
    @scala.inline
    def setIsAppAuthorized(value: Boolean): Self = this.set("isAppAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAppAuthorized: Self = this.set("isAppAuthorized", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastModifyingUser(value: User): Self = this.set("lastModifyingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifyingUser: Self = this.set("lastModifyingUser", js.undefined)
    
    @scala.inline
    def setMd5Checksum(value: String): Self = this.set("md5Checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd5Checksum: Self = this.set("md5Checksum", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setModifiedByMe(value: Boolean): Self = this.set("modifiedByMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedByMe: Self = this.set("modifiedByMe", js.undefined)
    
    @scala.inline
    def setModifiedByMeTime(value: String): Self = this.set("modifiedByMeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedByMeTime: Self = this.set("modifiedByMeTime", js.undefined)
    
    @scala.inline
    def setModifiedTime(value: String): Self = this.set("modifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedTime: Self = this.set("modifiedTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOriginalFilename(value: String): Self = this.set("originalFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalFilename: Self = this.set("originalFilename", js.undefined)
    
    @scala.inline
    def setOwnedByMe(value: Boolean): Self = this.set("ownedByMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnedByMe: Self = this.set("ownedByMe", js.undefined)
    
    @scala.inline
    def setOwnersVarargs(value: User*): Self = this.set("owners", js.Array(value :_*))
    
    @scala.inline
    def setOwners(value: js.Array[User]): Self = this.set("owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwners: Self = this.set("owners", js.undefined)
    
    @scala.inline
    def setParentsVarargs(value: String*): Self = this.set("parents", js.Array(value :_*))
    
    @scala.inline
    def setParents(value: js.Array[String]): Self = this.set("parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParents: Self = this.set("parents", js.undefined)
    
    @scala.inline
    def setPermissionIdsVarargs(value: String*): Self = this.set("permissionIds", js.Array(value :_*))
    
    @scala.inline
    def setPermissionIds(value: js.Array[String]): Self = this.set("permissionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionIds: Self = this.set("permissionIds", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: Permission*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[Permission]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setProperties(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDrive.maximMazurokGapiClientDriveStrings.File with TopLevel[js.Any]
    ): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setQuotaBytesUsed(value: String): Self = this.set("quotaBytesUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaBytesUsed: Self = this.set("quotaBytesUsed", js.undefined)
    
    @scala.inline
    def setShared(value: Boolean): Self = this.set("shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
    
    @scala.inline
    def setSharedWithMeTime(value: String): Self = this.set("sharedWithMeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedWithMeTime: Self = this.set("sharedWithMeTime", js.undefined)
    
    @scala.inline
    def setSharingUser(value: User): Self = this.set("sharingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharingUser: Self = this.set("sharingUser", js.undefined)
    
    @scala.inline
    def setShortcutDetails(value: TargetId): Self = this.set("shortcutDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortcutDetails: Self = this.set("shortcutDetails", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSpacesVarargs(value: String*): Self = this.set("spaces", js.Array(value :_*))
    
    @scala.inline
    def setSpaces(value: js.Array[String]): Self = this.set("spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaces: Self = this.set("spaces", js.undefined)
    
    @scala.inline
    def setStarred(value: Boolean): Self = this.set("starred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarred: Self = this.set("starred", js.undefined)
    
    @scala.inline
    def setTeamDriveId(value: String): Self = this.set("teamDriveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamDriveId: Self = this.set("teamDriveId", js.undefined)
    
    @scala.inline
    def setThumbnailLink(value: String): Self = this.set("thumbnailLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailLink: Self = this.set("thumbnailLink", js.undefined)
    
    @scala.inline
    def setThumbnailVersion(value: String): Self = this.set("thumbnailVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailVersion: Self = this.set("thumbnailVersion", js.undefined)
    
    @scala.inline
    def setTrashed(value: Boolean): Self = this.set("trashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrashed: Self = this.set("trashed", js.undefined)
    
    @scala.inline
    def setTrashedTime(value: String): Self = this.set("trashedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrashedTime: Self = this.set("trashedTime", js.undefined)
    
    @scala.inline
    def setTrashingUser(value: User): Self = this.set("trashingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrashingUser: Self = this.set("trashingUser", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVideoMediaMetadata(value: DurationMillis): Self = this.set("videoMediaMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoMediaMetadata: Self = this.set("videoMediaMetadata", js.undefined)
    
    @scala.inline
    def setViewedByMe(value: Boolean): Self = this.set("viewedByMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewedByMe: Self = this.set("viewedByMe", js.undefined)
    
    @scala.inline
    def setViewedByMeTime(value: String): Self = this.set("viewedByMeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewedByMeTime: Self = this.set("viewedByMeTime", js.undefined)
    
    @scala.inline
    def setViewersCanCopyContent(value: Boolean): Self = this.set("viewersCanCopyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewersCanCopyContent: Self = this.set("viewersCanCopyContent", js.undefined)
    
    @scala.inline
    def setWebContentLink(value: String): Self = this.set("webContentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebContentLink: Self = this.set("webContentLink", js.undefined)
    
    @scala.inline
    def setWebViewLink(value: String): Self = this.set("webViewLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebViewLink: Self = this.set("webViewLink", js.undefined)
    
    @scala.inline
    def setWritersCanShare(value: Boolean): Self = this.set("writersCanShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWritersCanShare: Self = this.set("writersCanShare", js.undefined)
  }
}
