package typings.musicmatch.anon

import typings.musicmatch.mod.MusicGenre
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Musicgenre extends js.Object {
  var music_genre: MusicGenre = js.native
}

object Musicgenre {
  @scala.inline
  def apply(music_genre: MusicGenre): Musicgenre = {
    val __obj = js.Dynamic.literal(music_genre = music_genre.asInstanceOf[js.Any])
    __obj.asInstanceOf[Musicgenre]
  }
  @scala.inline
  implicit class MusicgenreOps[Self <: Musicgenre] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMusic_genre(value: MusicGenre): Self = this.set("music_genre", value.asInstanceOf[js.Any])
  }
  
}

