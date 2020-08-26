package typings.microsoftLiveConnect.Microsoft.Live

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
@js.native
trait IVideo extends js.Object {
  /**
    * The bit rate, in bits per second, of the video.
    */
  var bitrate: Double = js.native
  /**
    * The number of comments that are associated with the video.
    */
  var comments_count: Double = js.native
  /**
    * A value that indicates whether comments are enabled for the video. If
    * comments can be made, this value is true; otherwise, it is false.
    */
  var comments_enabled: Boolean = js.native
  /**
    * The time, in ISO 8601 format, at which the video was created.
    */
  var created_time: String = js.native
  /**
    * A description of the video, or null if no description is specified.
    */
  var description: String = js.native
  /**
    * The duration, in milliseconds, of the video run time.
    */
  var duration: Double = js.native
  /**
    * Info about the user who uploaded the video.
    */
  var from: IUserInfo = js.native
  /**
    * The height, in pixels, of the video.
    */
  var height: Double = js.native
  /**
    * The Video object's ID.
    */
  var id: String = js.native
  /**
    * A value that indicates whether this video can be embedded. If this
    * video can be embedded, this value is true; otherwise, it is false.
    */
  var is_embeddable: Boolean = js.native
  /**
    * A URL of the video, hosted in SkyDrive.
    */
  var link: String = js.native
  /**
    * The file name of the video.
    */
  var name: String = js.native
  /**
    * The id of the folder where the item is stored.
    */
  var parent_id: String = js.native
  /**
    * A URL of a picture that represents the video.
    */
  var picture: String = js.native
  /**
    * The object that contains permission info.
    */
  var shared_with: ISharedWith = js.native
  /**
    * The size, in bytes, of the video.
    */
  var size: Double = js.native
  /**
    * The download URL for the video.
    * Warning: This value is not persistent. Use it immediately after
    * making the request, and avoid caching.
    */
  var source: String = js.native
  /**
    * The number of tags on the video.
    */
  var tags_count: Double = js.native
  /**
    * A value that indicates whether tags are enabled for the video. If
    * tags can be set, this value is true; otherwise, it is false.
    */
  var tags_enabled: Boolean = js.native
  /**
    * The type of object; in this case, "video".
    */
  var `type`: String = js.native
  /**
    * The time, in ISO 8601 format, at which the video was last updated.
    */
  var updated_time: String = js.native
  /**
    * The URL to upload video content, hosted in SkyDrive. This value is
    * returned only if the wl.skydrive scope is present.
    */
  var upload_location: String = js.native
  /**
    * The width, in pixels, of the video.
    */
  var width: Double = js.native
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
  @scala.inline
  implicit class IVideoOps[Self <: IVideo] (val x: Self) extends AnyVal {
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
    def setBitrate(value: Double): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def setComments_count(value: Double): Self = this.set("comments_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setComments_enabled(value: Boolean): Self = this.set("comments_enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_time(value: String): Self = this.set("created_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: IUserInfo): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_embeddable(value: Boolean): Self = this.set("is_embeddable", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent_id(value: String): Self = this.set("parent_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPicture(value: String): Self = this.set("picture", value.asInstanceOf[js.Any])
    @scala.inline
    def setShared_with(value: ISharedWith): Self = this.set("shared_with", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags_count(value: Double): Self = this.set("tags_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags_enabled(value: Boolean): Self = this.set("tags_enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_time(value: String): Self = this.set("updated_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpload_location(value: String): Self = this.set("upload_location", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

