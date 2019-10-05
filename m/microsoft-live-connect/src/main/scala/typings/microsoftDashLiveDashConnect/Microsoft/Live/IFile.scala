package typings.microsoftDashLiveDashConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The File object contains info about a user's files in SkyDrive. The Live
  * Connect REST API supports creating, reading, updating, and deleting File
  * objects. Use the wl.skydrive scope to read File objects. Use the
  * wl.contacts_skydrive scope to read any files that other users have shared
  * with the user. Use the wl.skydrive_update scope to create, update, or
  * delete File objects.
  */
trait IFile extends js.Object {
  /**
    * The time, in ISO 8601 format, that the client machine updated the
    * file last.
    */
  var client_updated_time: String
  /**
    * The number of comments that are associated with the file.
    */
  var comments_count: Double
  /**
    * A value that indicates whether comments are enabled for the file. If
    * comments can be made, this value is true; otherwise, it is false.
    */
  var comments_enabled: Boolean
  /**
    * The time, in ISO 8601 format, at which the file was created.
    */
  var created_time: String
  /**
    * A description of the file, or null if no description is specified.
    */
  var description: String
  /**
    * Info about the user who uploaded the file.
    */
  var from: IUserInfo
  /**
    * The File object's ID.
    */
  var id: String
  /**
    * A value that indicates whether this file can be embedded. If this
    * file can be embedded, this value is true; otherwise, it is false.
    */
  var is_embeddable: Boolean
  /**
    * A URL to view the item on SkyDrive.
    */
  var link: String
  /**
    * The name of the file.
    */
  var name: String
  /**
    * The ID of the folder the file is currently stored in.
    */
  var parent_id: String
  /**
    * Object that contains permission info.
    */
  var shared_with: ISharedWith
  /**
    * The size, in bytes, of the file.
    */
  var size: Double
  /**
    * Sorts the items to specify the following criteria: updated, name,
    * size, or default.
    */
  var sort_by: String
  /**
    * The URL to use to download the file from SkyDrive.
    * Warning: This value is not persistent. Use it immediately after
    * making the request, and avoid caching.
    * Note: This structure is not available if the file is an Office
    * OneNote notebook.
    */
  var source: String
  /**
    * The type of object; in this case, "file".
    * Note: If the file is a Office OneNote notebook, the type structure is
    * set to "notebook".
    */
  var `type`: String
  /**
    * The time, in ISO 8601 format, that the system updated the file last.
    */
  var updated_time: String
  /**
    * The URL to upload file content hosted in SkyDrive.
    * Note: This structure is not available if the file is an Microsoft
    * Office OneNote notebook.
    */
  var upload_location: String
}

object IFile {
  @scala.inline
  def apply(
    client_updated_time: String,
    comments_count: Double,
    comments_enabled: Boolean,
    created_time: String,
    description: String,
    from: IUserInfo,
    id: String,
    is_embeddable: Boolean,
    link: String,
    name: String,
    parent_id: String,
    shared_with: ISharedWith,
    size: Double,
    sort_by: String,
    source: String,
    `type`: String,
    updated_time: String,
    upload_location: String
  ): IFile = {
    val __obj = js.Dynamic.literal(client_updated_time = client_updated_time, comments_count = comments_count, comments_enabled = comments_enabled, created_time = created_time, description = description, from = from, id = id, is_embeddable = is_embeddable, link = link, name = name, parent_id = parent_id, shared_with = shared_with, size = size, sort_by = sort_by, source = source, updated_time = updated_time, upload_location = upload_location)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IFile]
  }
}

