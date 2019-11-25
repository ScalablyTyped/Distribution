package typings.musicmetadata.MM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var album: String
  var albumartist: js.Array[String]
  var artist: js.Array[String]
  var disk: NoOf
  var duration: Double
  var genre: js.Array[String]
  var picture: js.Array[Picture]
  var title: String
  var track: NoOf
  var year: String
}

object Metadata {
  @scala.inline
  def apply(
    album: String,
    albumartist: js.Array[String],
    artist: js.Array[String],
    disk: NoOf,
    duration: Double,
    genre: js.Array[String],
    picture: js.Array[Picture],
    title: String,
    track: NoOf,
    year: String
  ): Metadata = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], albumartist = albumartist.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], disk = disk.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], genre = genre.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Metadata]
  }
}

