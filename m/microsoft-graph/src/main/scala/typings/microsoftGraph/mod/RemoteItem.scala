package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteItem extends js.Object {
  /**
    * If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some
    * contexts and folders in others. Read-only.
    */
  @JSName("package")
  var _package: js.UndefOr[Package] = js.undefined
  // Identity of the user, device, and application which created the item. Read-only.
  var createdBy: js.UndefOr[IdentitySet] = js.undefined
  // Date and time of item creation. Read-only.
  var createdDateTime: js.UndefOr[String] = js.undefined
  // Indicates that the remote item is a file. Read-only.
  var file: js.UndefOr[File] = js.undefined
  // Information about the remote item from the local file system. Read-only.
  var fileSystemInfo: js.UndefOr[FileSystemInfo] = js.undefined
  // Indicates that the remote item is a folder. Read-only.
  var folder: js.UndefOr[Folder] = js.undefined
  // Unique identifier for the remote item in its drive. Read-only.
  var id: js.UndefOr[String] = js.undefined
  // Identity of the user, device, and application which last modified the item. Read-only.
  var lastModifiedBy: js.UndefOr[IdentitySet] = js.undefined
  // Date and time the item was last modified. Read-only.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  // Optional. Filename of the remote item. Read-only.
  var name: js.UndefOr[String] = js.undefined
  // Properties of the parent of the remote item. Read-only.
  var parentReference: js.UndefOr[ItemReference] = js.undefined
  /**
    * Indicates that the item has been shared with others and provides information about the shared state of the item.
    * Read-only.
    */
  var shared: js.UndefOr[Shared] = js.undefined
  /**
    * Provides interop between items in OneDrive for Business and SharePoint with the full set of item identifiers.
    * Read-only.
    */
  var sharepointIds: js.UndefOr[SharepointIds] = js.undefined
  // Size of the remote item. Read-only.
  var size: js.UndefOr[Double] = js.undefined
  // If the current item is also available as a special folder, this facet is returned. Read-only.
  var specialFolder: js.UndefOr[SpecialFolder] = js.undefined
  // DAV compatible URL for the item.
  var webDavUrl: js.UndefOr[String] = js.undefined
  // URL that displays the resource in the browser. Read-only.
  var webUrl: js.UndefOr[String] = js.undefined
}

object RemoteItem {
  @scala.inline
  def apply(
    _package: Package = null,
    createdBy: IdentitySet = null,
    createdDateTime: String = null,
    file: File = null,
    fileSystemInfo: FileSystemInfo = null,
    folder: Folder = null,
    id: String = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedDateTime: String = null,
    name: String = null,
    parentReference: ItemReference = null,
    shared: Shared = null,
    sharepointIds: SharepointIds = null,
    size: js.UndefOr[Double] = js.undefined,
    specialFolder: SpecialFolder = null,
    webDavUrl: String = null,
    webUrl: String = null
  ): RemoteItem = {
    val __obj = js.Dynamic.literal()
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (fileSystemInfo != null) __obj.updateDynamic("fileSystemInfo")(fileSystemInfo.asInstanceOf[js.Any])
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentReference != null) __obj.updateDynamic("parentReference")(parentReference.asInstanceOf[js.Any])
    if (shared != null) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    if (sharepointIds != null) __obj.updateDynamic("sharepointIds")(sharepointIds.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (specialFolder != null) __obj.updateDynamic("specialFolder")(specialFolder.asInstanceOf[js.Any])
    if (webDavUrl != null) __obj.updateDynamic("webDavUrl")(webDavUrl.asInstanceOf[js.Any])
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteItem]
  }
}

