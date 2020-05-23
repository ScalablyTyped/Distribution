package typings.musicmatch.anon

import typings.musicmatch.mod.MusicGenre
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Musicgenre extends js.Object {
  var music_genre: MusicGenre
}

object Musicgenre {
  @scala.inline
  def apply(music_genre: MusicGenre): Musicgenre = {
    val __obj = js.Dynamic.literal(music_genre = music_genre.asInstanceOf[js.Any])
    __obj.asInstanceOf[Musicgenre]
  }
}

