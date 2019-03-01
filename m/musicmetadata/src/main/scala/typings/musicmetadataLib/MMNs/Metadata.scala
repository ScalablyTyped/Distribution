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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("album")(album)
    __obj.updateDynamic("albumartist")(albumartist)
    __obj.updateDynamic("artist")(artist)
    __obj.updateDynamic("disk")(disk)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("genre")(genre)
    __obj.updateDynamic("picture")(picture)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("track")(track)
    __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[Metadata]
  }
}

