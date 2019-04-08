package typings
package musicmatchLib.musicmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MusicGenre extends js.Object {
  var music_genre_id: scala.Double
  var music_genre_name: java.lang.String
  var music_genre_name_extended: java.lang.String
  var music_genre_parent_id: scala.Double
  var music_genre_vanity: java.lang.String
}

object MusicGenre {
  @scala.inline
  def apply(
    music_genre_id: scala.Double,
    music_genre_name: java.lang.String,
    music_genre_name_extended: java.lang.String,
    music_genre_parent_id: scala.Double,
    music_genre_vanity: java.lang.String
  ): MusicGenre = {
    val __obj = js.Dynamic.literal(music_genre_id = music_genre_id, music_genre_name = music_genre_name, music_genre_name_extended = music_genre_name_extended, music_genre_parent_id = music_genre_parent_id, music_genre_vanity = music_genre_vanity)
  
    __obj.asInstanceOf[MusicGenre]
  }
}

