package typings.musicmatch.mod

import typings.musicmatch.AnonMusicgenre
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryGenres extends js.Object {
  var music_genre_list: js.Array[AnonMusicgenre]
}

object PrimaryGenres {
  @scala.inline
  def apply(music_genre_list: js.Array[AnonMusicgenre]): PrimaryGenres = {
    val __obj = js.Dynamic.literal(music_genre_list = music_genre_list.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryGenres]
  }
}

