package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Folder object contains info about a user's folders in SkyDrive.
  * Folders can contain combinations of photos, videos, audio, and
  * subfolders. The Live Connect REST API supports reading Folder objects.
  * Use the wl.photos scope to read Folder objects. Use the
  * wl.contacts_photos scope to read any albums, photos, videos, and audio
  * that other users have shared with the user.
  */
trait IFolder extends js.Object {
  /**
    * The time, in ISO 8601 format, that the client machine updated the
    * file last.
    */
  var client_updated_time: java.lang.String
  /**
    * The total number of items in the folder.
    */
  var count: scala.Double
  /**
    * The time, in ISO 8601 format, at which the folder was created.
    */
  var created_time: java.lang.String
  /**
    * A description of the folder, or null if no description is specified.
    */
  var description: java.lang.String
  /**
    * Info about the user who created the folder.
    */
  var from: IUserInfo
  /**
    * The Folder object's ID.
    */
  var id: java.lang.String
  /**
    * A value that indicates whether this folder can be embedded. If this
    * folder can be embedded, this value is true; otherwise, it is false.
    */
  var is_embeddable: scala.Boolean
  /**
    * The URL of the folder, hosted in SkyDrive.
    */
  var link: java.lang.String
  /**
    * The name of the folder.
    */
  var name: java.lang.String
  /**
    * The resource ID of the parent.
    */
  var parent_id: java.lang.String
  /**
    * Permissions info for the folder. Requires the wl.skydrive scope.
    */
  var shared_with: ISharedWith
  /**
    * Sorts the items to specify the following criteria: updated, name,
    * size, or default.
    */
  var sort_by: java.lang.String
  /**
    * The type of object; in this case, "folder".
    */
  var `type`: java.lang.String
  /**
    * The time, in ISO 8601 format, that the system updated the file last.
    */
  var updated_time: java.lang.String
  /**
    * The URL to upload items to the folder hosted in SkyDrive. Requires
    * the wl.skydrive scope.
    */
  var upload_location: java.lang.String
}

object IFolder {
  @scala.inline
  def apply(
    client_updated_time: java.lang.String,
    count: scala.Double,
    created_time: java.lang.String,
    description: java.lang.String,
    from: IUserInfo,
    id: java.lang.String,
    is_embeddable: scala.Boolean,
    link: java.lang.String,
    name: java.lang.String,
    parent_id: java.lang.String,
    shared_with: ISharedWith,
    sort_by: java.lang.String,
    `type`: java.lang.String,
    updated_time: java.lang.String,
    upload_location: java.lang.String
  ): IFolder = {
    val __obj = js.Dynamic.literal(client_updated_time = client_updated_time, count = count, created_time = created_time, description = description, from = from, id = id, is_embeddable = is_embeddable, link = link, name = name, parent_id = parent_id, shared_with = shared_with, sort_by = sort_by, updated_time = updated_time, upload_location = upload_location)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IFolder]
  }
}

