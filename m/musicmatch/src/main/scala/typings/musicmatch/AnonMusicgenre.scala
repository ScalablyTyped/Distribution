package typings.musicmatch

import typings.musicmatch.mod.MusicGenre
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMusicgenre extends js.Object {
  var music_genre: MusicGenre
}

object AnonMusicgenre {
  @scala.inline
  def apply(music_genre: MusicGenre): AnonMusicgenre = {
    val __obj = js.Dynamic.literal(music_genre = music_genre.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMusicgenre]
  }
}

