package typings.microsoftDashLiveDashConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Audio object contains info about a user's audio in SkyDrive. The Live
  * Connect REST API supports creating, reading, updating, and deleting Audio
  * objects. Use the wl.skydrive scope to read Audio objects. Use the
  * wl.contacts_skydrive scope to read any audio that other users have shared
  * with the user. Use the wl.skydrive_update scope to create, update, or
  * delete Audio objects.
  */
trait IAudio extends js.Object {
  /**
    * The audio's album name.
    */
  var album: String
  /**
    * The artist name of the audio's album.
    */
  var album_artist: String
  /**
    * The audio's artist name.
    */
  var artist: String
  /**
    * The number of comments associated with the audio.
    */
  var comments_count: Double
  /**
    * A value that indicates whether comments are enabled for the audio. If
    * comments can be made, this value is true; otherwise, it is false.
    */
  var comments_enabled: Boolean
  /**
    * The time, in ISO 8601 format, at which the audio was created.
    */
  var created_time: String
  /**
    * A description of the audio, or null if no description is specified.
    */
  var description: String
  /**
    * The audio's playing time, in milliseconds.
    */
  var duration: Double
  /**
    * Info about the user who uploaded the audio.
    */
  var from: IUserInfo
  /**
    * The audio's genre.
    */
  var genre: String
  /**
    * The Audio object's ID.
    */
  var id: String
  /**
    * A value that indicates whether this audio can be embedded. If this
    * audio can be embedded, this value is true; otherwise, it is false.
    */
  var is_embeddable: Boolean
  /**
    * A URL to view the item on SkyDrive.
    */
  var link: String
  /**
    * The name of the audio.
    */
  var name: String
  /**
    * The id of the folder in which the audio is currently stored.
    */
  var parent_id: String
  /**
    * A URL to view the audio's picture on SkyDrive.
    */
  var picture: String
  /**
    * The object that contains permission info.
    */
  var shared_with: ISharedWith
  /**
    * The size, in bytes, of the audio.
    */
  var size: Double
  /**
    * The URL to use to download the audio from SkyDrive.
    * Warning
    * This value is not persistent. Use it immediately after making the
    * request, and avoid caching.
    */
  var source: String
  /**
    * The audio's title.
    */
  var title: String
  /**
    * The type of object; in this case, "audio".
    */
  var `type`: String
  /**
    * The time, in ISO 8601 format, at which the audio was last updated.
    */
  var updated_time: String
  /**
    * The URL to use to upload a new audio to overwrite the existing audio.
    */
  var upload_location: String
}

object IAudio {
  @scala.inline
  def apply(
    album: String,
    album_artist: String,
    artist: String,
    comments_count: Double,
    comments_enabled: Boolean,
    created_time: String,
    description: String,
    duration: Double,
    from: IUserInfo,
    genre: String,
    id: String,
    is_embeddable: Boolean,
    link: String,
    name: String,
    parent_id: String,
    picture: String,
    shared_with: ISharedWith,
    size: Double,
    source: String,
    title: String,
    `type`: String,
    updated_time: String,
    upload_location: String
  ): IAudio = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], album_artist = album_artist.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], comments_count = comments_count.asInstanceOf[js.Any], comments_enabled = comments_enabled.asInstanceOf[js.Any], created_time = created_time.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], genre = genre.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_embeddable = is_embeddable.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent_id = parent_id.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], shared_with = shared_with.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_time = updated_time.asInstanceOf[js.Any], upload_location = upload_location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAudio]
  }
}

