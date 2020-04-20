package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MusicGenre extends js.Object {
  var music_genre_id: Double
  var music_genre_name: String
  var music_genre_name_extended: String
  var music_genre_parent_id: Double
  var music_genre_vanity: String
}

object MusicGenre {
  @scala.inline
  def apply(
    music_genre_id: Double,
    music_genre_name: String,
    music_genre_name_extended: String,
    music_genre_parent_id: Double,
    music_genre_vanity: String
  ): MusicGenre = {
    val __obj = js.Dynamic.literal(music_genre_id = music_genre_id.asInstanceOf[js.Any], music_genre_name = music_genre_name.asInstanceOf[js.Any], music_genre_name_extended = music_genre_name_extended.asInstanceOf[js.Any], music_genre_parent_id = music_genre_parent_id.asInstanceOf[js.Any], music_genre_vanity = music_genre_vanity.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicGenre]
  }
}

