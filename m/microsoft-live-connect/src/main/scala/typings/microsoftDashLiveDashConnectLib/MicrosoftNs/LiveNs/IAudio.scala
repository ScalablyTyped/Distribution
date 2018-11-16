package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

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
  var album: java.lang.String
  /**
           * The artist name of the audio's album.
           */
  var album_artist: java.lang.String
  /**
           * The audio's artist name.
           */
  var artist: java.lang.String
  /**
           * The number of comments associated with the audio.
           */
  var comments_count: scala.Double
  /**
           * A value that indicates whether comments are enabled for the audio. If
           * comments can be made, this value is true; otherwise, it is false.
           */
  var comments_enabled: scala.Boolean
  /**
           * The time, in ISO 8601 format, at which the audio was created.
           */
  var created_time: java.lang.String
  /**
           * A description of the audio, or null if no description is specified.
           */
  var description: java.lang.String
  /**
           * The audio's playing time, in milliseconds.
           */
  var duration: scala.Double
  /**
           * Info about the user who uploaded the audio.
           */
  var from: IUserInfo
  /**
           * The audio's genre.
           */
  var genre: java.lang.String
  /**
           * The Audio object's ID.
           */
  var id: java.lang.String
  /**
           * A value that indicates whether this audio can be embedded. If this
           * audio can be embedded, this value is true; otherwise, it is false.
           */
  var is_embeddable: scala.Boolean
  /**
           * A URL to view the item on SkyDrive.
           */
  var link: java.lang.String
  /**
           * The name of the audio.
           */
  var name: java.lang.String
  /**
           * The id of the folder in which the audio is currently stored.
           */
  var parent_id: java.lang.String
  /**
           * A URL to view the audio's picture on SkyDrive.
           */
  var picture: java.lang.String
  /**
           * The object that contains permission info.
           */
  var shared_with: ISharedWith
  /**
           * The size, in bytes, of the audio.
           */
  var size: scala.Double
  /**
           * The URL to use to download the audio from SkyDrive.
           * Warning
           * This value is not persistent. Use it immediately after making the
           * request, and avoid caching.
           */
  var source: java.lang.String
  /**
           * The audio's title.
           */
  var title: java.lang.String
  /**
           * The type of object; in this case, "audio".
           */
  var `type`: java.lang.String
  /**
           * The time, in ISO 8601 format, at which the audio was last updated.
           */
  var updated_time: java.lang.String
  /**
           * The URL to use to upload a new audio to overwrite the existing audio.
           */
  var upload_location: java.lang.String
}

