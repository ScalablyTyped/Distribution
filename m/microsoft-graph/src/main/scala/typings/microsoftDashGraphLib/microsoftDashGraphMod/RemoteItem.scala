package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteItem extends js.Object {
  // Identity of the user, device, and application which created the item. Read-only.
  var createdBy: js.UndefOr[IdentitySet] = js.undefined
  // Date and time of item creation. Read-only.
  var createdDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Indicates that the remote item is a file. Read-only.
  var file: js.UndefOr[File] = js.undefined
  // Information about the remote item from the local file system. Read-only.
  var fileSystemInfo: js.UndefOr[FileSystemInfo] = js.undefined
  // Indicates that the remote item is a folder. Read-only.
  var folder: js.UndefOr[Folder] = js.undefined
  // Unique identifier for the remote item in its drive. Read-only.
  var id: js.UndefOr[java.lang.String] = js.undefined
  // Identity of the user, device, and application which last modified the item. Read-only.
  var lastModifiedBy: js.UndefOr[IdentitySet] = js.undefined
  // Date and time the item was last modified. Read-only.
  var lastModifiedDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Optional. Filename of the remote item. Read-only.
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some
    * contexts and folders in others. Read-only.
    */
  var `package`: js.UndefOr[Package] = js.undefined
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
  var size: js.UndefOr[scala.Double] = js.undefined
  // If the current item is also available as a special folder, this facet is returned. Read-only.
  var specialFolder: js.UndefOr[SpecialFolder] = js.undefined
  // DAV compatible URL for the item.
  var webDavUrl: js.UndefOr[java.lang.String] = js.undefined
  // URL that displays the resource in the browser. Read-only.
  var webUrl: js.UndefOr[java.lang.String] = js.undefined
}

object RemoteItem {
  @scala.inline
  def apply(
    createdBy: IdentitySet = null,
    createdDateTime: java.lang.String = null,
    file: File = null,
    fileSystemInfo: FileSystemInfo = null,
    folder: Folder = null,
    id: java.lang.String = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedDateTime: java.lang.String = null,
    name: java.lang.String = null,
    `package`: Package = null,
    parentReference: ItemReference = null,
    shared: Shared = null,
    sharepointIds: SharepointIds = null,
    size: scala.Int | scala.Double = null,
    specialFolder: SpecialFolder = null,
    webDavUrl: java.lang.String = null,
    webUrl: java.lang.String = null
  ): RemoteItem = {
    val __obj = js.Dynamic.literal()
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (file != null) __obj.updateDynamic("file")(file)
    if (fileSystemInfo != null) __obj.updateDynamic("fileSystemInfo")(fileSystemInfo)
    if (folder != null) __obj.updateDynamic("folder")(folder)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    if (parentReference != null) __obj.updateDynamic("parentReference")(parentReference)
    if (shared != null) __obj.updateDynamic("shared")(shared)
    if (sharepointIds != null) __obj.updateDynamic("sharepointIds")(sharepointIds)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (specialFolder != null) __obj.updateDynamic("specialFolder")(specialFolder)
    if (webDavUrl != null) __obj.updateDynamic("webDavUrl")(webDavUrl)
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[RemoteItem]
  }
}

