package typings.musicmatch.mod

import typings.musicmatch.anon.Musicgenre
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrimaryGenres extends js.Object {
  var music_genre_list: js.Array[Musicgenre] = js.native
}

object PrimaryGenres {
  @scala.inline
  def apply(music_genre_list: js.Array[Musicgenre]): PrimaryGenres = {
    val __obj = js.Dynamic.literal(music_genre_list = music_genre_list.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryGenres]
  }
  @scala.inline
  implicit class PrimaryGenresOps[Self <: PrimaryGenres] (val x: Self) extends AnyVal {
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
    def setMusic_genre_listVarargs(value: Musicgenre*): Self = this.set("music_genre_list", js.Array(value :_*))
    @scala.inline
    def setMusic_genre_list(value: js.Array[Musicgenre]): Self = this.set("music_genre_list", value.asInstanceOf[js.Any])
  }
  
}

