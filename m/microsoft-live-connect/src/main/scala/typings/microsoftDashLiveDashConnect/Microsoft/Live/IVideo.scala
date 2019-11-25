package typings.microsoftDashLiveDashConnect.Microsoft.Live

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
  var bitrate: Double
  /**
    * The number of comments that are associated with the video.
    */
  var comments_count: Double
  /**
    * A value that indicates whether comments are enabled for the video. If
    * comments can be made, this value is true; otherwise, it is false.
    */
  var comments_enabled: Boolean
  /**
    * The time, in ISO 8601 format, at which the video was created.
    */
  var created_time: String
  /**
    * A description of the video, or null if no description is specified.
    */
  var description: String
  /**
    * The duration, in milliseconds, of the video run time.
    */
  var duration: Double
  /**
    * Info about the user who uploaded the video.
    */
  var from: IUserInfo
  /**
    * The height, in pixels, of the video.
    */
  var height: Double
  /**
    * The Video object's ID.
    */
  var id: String
  /**
    * A value that indicates whether this video can be embedded. If this
    * video can be embedded, this value is true; otherwise, it is false.
    */
  var is_embeddable: Boolean
  /**
    * A URL of the video, hosted in SkyDrive.
    */
  var link: String
  /**
    * The file name of the video.
    */
  var name: String
  /**
    * The id of the folder where the item is stored.
    */
  var parent_id: String
  /**
    * A URL of a picture that represents the video.
    */
  var picture: String
  /**
    * The object that contains permission info.
    */
  var shared_with: ISharedWith
  /**
    * The size, in bytes, of the video.
    */
  var size: Double
  /**
    * The download URL for the video.
    * Warning: This value is not persistent. Use it immediately after
    * making the request, and avoid caching.
    */
  var source: String
  /**
    * The number of tags on the video.
    */
  var tags_count: Double
  /**
    * A value that indicates whether tags are enabled for the video. If
    * tags can be set, this value is true; otherwise, it is false.
    */
  var tags_enabled: Boolean
  /**
    * The type of object; in this case, "video".
    */
  var `type`: String
  /**
    * The time, in ISO 8601 format, at which the video was last updated.
    */
  var updated_time: String
  /**
    * The URL to upload video content, hosted in SkyDrive. This value is
    * returned only if the wl.skydrive scope is present.
    */
  var upload_location: String
  /**
    * The width, in pixels, of the video.
    */
  var width: Double
}

object IVideo {
  @scala.inline
  def apply(
    bitrate: Double,
    comments_count: Double,
    comments_enabled: Boolean,
    created_time: String,
    description: String,
    duration: Double,
    from: IUserInfo,
    height: Double,
    id: String,
    is_embeddable: Boolean,
    link: String,
    name: String,
    parent_id: String,
    picture: String,
    shared_with: ISharedWith,
    size: Double,
    source: String,
    tags_count: Double,
    tags_enabled: Boolean,
    `type`: String,
    updated_time: String,
    upload_location: String,
    width: Double
  ): IVideo = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], comments_count = comments_count.asInstanceOf[js.Any], comments_enabled = comments_enabled.asInstanceOf[js.Any], created_time = created_time.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_embeddable = is_embeddable.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent_id = parent_id.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], shared_with = shared_with.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tags_count = tags_count.asInstanceOf[js.Any], tags_enabled = tags_enabled.asInstanceOf[js.Any], updated_time = updated_time.asInstanceOf[js.Any], upload_location = upload_location.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVideo]
  }
}

