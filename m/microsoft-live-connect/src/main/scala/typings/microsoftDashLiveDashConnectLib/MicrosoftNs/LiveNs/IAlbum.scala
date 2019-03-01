package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Album object contains info about a user's albums in Microsoft
  * SkyDrive. Albums are stored at the root level of a user's SkyDrive
  * directory, and can contain combinations of photos, videos, audio, files,
  * and folders. The Live Connect REST API supports reading Album objects.
  * Use the wl.photos scope to read a user's Album objects. Use the
  * wl.skydrive scope to read a user's files. Use the wl.contacts_photos
  * scope to read any albums, photos, videos, and audio that other users have
  * shared with the user.
  */
trait IAlbum extends js.Object {
  /**
    * The time, in ISO 8601 format, that the file was last updated.
    */
  var client_updated_time: java.lang.String
  /**
    * The total number of items in the album.
    */
  var count: scala.Double
  /**
    * The time, in ISO 8601 format, at which the album was created.
    */
  var created_time: java.lang.String
  /**
    * A description of the album, or null if no description is specified.
    */
  var description: java.lang.String
  /**
    * Info about the user who authored the album.
    */
  var from: IUserInfo
  /**
    * The Album object's ID.
    */
  var id: java.lang.String
  /**
    * A value that indicates whether this album can be embedded. If this
    * album can be embedded, this value is true; otherwise, it is false.
    */
  var is_embeddable: scala.Boolean
  /**
    * A URL of the album, hosted in SkyDrive.
    */
  var link: java.lang.String
  /**
    * The name of the album.
    */
  var name: java.lang.String
  /**
    * The resource ID of the parent.
    */
  var parent_id: java.lang.String
  /**
    * The object that contains permissions info for the album. Requires the
    * wl.skydrive scope.
    */
  var shared_with: ISharedWith
  /**
    * The type of object; in this case, "album".
    */
  var `type`: java.lang.String
  /**
    * The time, in ISO 8601 format, that the system updated the album last.
    */
  var updated_time: java.lang.String
  /**
    * The URL to upload items to the album, hosted in SkyDrive. Requires
    * the wl.skydrive scope.
    */
  var upload_location: java.lang.String
}

object IAlbum {
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
    `type`: java.lang.String,
    updated_time: java.lang.String,
    upload_location: java.lang.String
  ): IAlbum = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("client_updated_time")(client_updated_time)
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("created_time")(created_time)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("is_embeddable")(is_embeddable)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("parent_id")(parent_id)
    __obj.updateDynamic("shared_with")(shared_with)
    __obj.updateDynamic("updated_time")(updated_time)
    __obj.updateDynamic("upload_location")(upload_location)
    __obj.asInstanceOf[IAlbum]
  }
}

