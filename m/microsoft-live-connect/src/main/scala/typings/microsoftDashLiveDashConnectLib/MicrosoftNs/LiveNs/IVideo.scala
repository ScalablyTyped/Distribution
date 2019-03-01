package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Video object contains info about a user's videos on SkyDrive. The
  * Live Connect REST API supports creating, reading, updating, and deleting
  * Video objects. Use the wl.photos scope to read Video objects. Use the
  * wl.contacts_photos scope to read albums, photos, and videos that other
  * users have shared with the user. Use the wl.skydrive_update scope to
  * create, update, or delete Video objects.
  */
trait IVideo extends js.Object {
  /**
    * The bit rate, in bits per second, of the video.
    */
  var bitrate: scala.Double
  /**
    * The number of comments that are associated with the video.
    */
  var comments_count: scala.Double
  /**
    * A value that indicates whether comments are enabled for the video. If
    * comments can be made, this value is true; otherwise, it is false.
    */
  var comments_enabled: scala.Boolean
  /**
    * The time, in ISO 8601 format, at which the video was created.
    */
  var created_time: java.lang.String
  /**
    * A description of the video, or null if no description is specified.
    */
  var description: java.lang.String
  /**
    * The duration, in milliseconds, of the video run time.
    */
  var duration: scala.Double
  /**
    * Info about the user who uploaded the video.
    */
  var from: IUserInfo
  /**
    * The height, in pixels, of the video.
    */
  var height: scala.Double
  /**
    * The Video object's ID.
    */
  var id: java.lang.String
  /**
    * A value that indicates whether this video can be embedded. If this
    * video can be embedded, this value is true; otherwise, it is false.
    */
  var is_embeddable: scala.Boolean
  /**
    * A URL of the video, hosted in SkyDrive.
    */
  var link: java.lang.String
  /**
    * The file name of the video.
    */
  var name: java.lang.String
  /**
    * The id of the folder where the item is stored.
    */
  var parent_id: java.lang.String
  /**
    * A URL of a picture that represents the video.
    */
  var picture: java.lang.String
  /**
    * The object that contains permission info.
    */
  var shared_with: ISharedWith
  /**
    * The size, in bytes, of the video.
    */
  var size: scala.Double
  /**
    * The download URL for the video.
    * Warning: This value is not persistent. Use it immediately after
    * making the request, and avoid caching.
    */
  var source: java.lang.String
  /**
    * The number of tags on the video.
    */
  var tags_count: scala.Double
  /**
    * A value that indicates whether tags are enabled for the video. If
    * tags can be set, this value is true; otherwise, it is false.
    */
  var tags_enabled: scala.Boolean
  /**
    * The type of object; in this case, "video".
    */
  var `type`: java.lang.String
  /**
    * The time, in ISO 8601 format, at which the video was last updated.
    */
  var updated_time: java.lang.String
  /**
    * The URL to upload video content, hosted in SkyDrive. This value is
    * returned only if the wl.skydrive scope is present.
    */
  var upload_location: java.lang.String
  /**
    * The width, in pixels, of the video.
    */
  var width: scala.Double
}

object IVideo {
  @scala.inline
  def apply(
    bitrate: scala.Double,
    comments_count: scala.Double,
    comments_enabled: scala.Boolean,
    created_time: java.lang.String,
    description: java.lang.String,
    duration: scala.Double,
    from: IUserInfo,
    height: scala.Double,
    id: java.lang.String,
    is_embeddable: scala.Boolean,
    link: java.lang.String,
    name: java.lang.String,
    parent_id: java.lang.String,
    picture: java.lang.String,
    shared_with: ISharedWith,
    size: scala.Double,
    source: java.lang.String,
    tags_count: scala.Double,
    tags_enabled: scala.Boolean,
    `type`: java.lang.String,
    updated_time: java.lang.String,
    upload_location: java.lang.String,
    width: scala.Double
  ): IVideo = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bitrate")(bitrate)
    __obj.updateDynamic("comments_count")(comments_count)
    __obj.updateDynamic("comments_enabled")(comments_enabled)
    __obj.updateDynamic("created_time")(created_time)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("is_embeddable")(is_embeddable)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("parent_id")(parent_id)
    __obj.updateDynamic("picture")(picture)
    __obj.updateDynamic("shared_with")(shared_with)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("tags_count")(tags_count)
    __obj.updateDynamic("tags_enabled")(tags_enabled)
    __obj.updateDynamic("updated_time")(updated_time)
    __obj.updateDynamic("upload_location")(upload_location)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[IVideo]
  }
}

