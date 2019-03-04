package typings
package musicmetadataLib.MMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var album: java.lang.String
  var albumartist: js.Array[java.lang.String]
  var artist: js.Array[java.lang.String]
  var disk: NoOf
  var duration: scala.Double
  var genre: js.Array[java.lang.String]
  var picture: js.Array[Picture]
  var title: java.lang.String
  var track: NoOf
  var year: java.lang.String
}

object Metadata {
  @scala.inline
  def apply(
    album: java.lang.String,
    albumartist: js.Array[java.lang.String],
    artist: js.Array[java.lang.String],
    disk: NoOf,
    duration: scala.Double,
    genre: js.Array[java.lang.String],
    picture: js.Array[Picture],
    title: java.lang.String,
    track: NoOf,
    year: java.lang.String
  ): Metadata = {
    val __obj = js.Dynamic.literal(album = album, albumartist = albumartist, artist = artist, disk = disk, duration = duration, genre = genre, picture = picture, title = title, track = track, year = year)
  
    __obj.asInstanceOf[Metadata]
  }
}

