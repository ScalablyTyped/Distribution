package typings
package musicmatchLib.musicmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryGenres extends js.Object {
  var music_genre_list: js.Array[musicmatchLib.Anon_Musicgenre]
}

object PrimaryGenres {
  @scala.inline
  def apply(music_genre_list: js.Array[musicmatchLib.Anon_Musicgenre]): PrimaryGenres = {
    val __obj = js.Dynamic.literal(music_genre_list = music_genre_list)
  
    __obj.asInstanceOf[PrimaryGenres]
  }
}

