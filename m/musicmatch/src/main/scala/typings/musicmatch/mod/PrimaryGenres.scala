package typings.musicmatch.mod

import typings.musicmatch.anon.Musicgenre
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrimaryGenres extends StObject {
  
  var music_genre_list: js.Array[Musicgenre]
}
object PrimaryGenres {
  
  @scala.inline
  def apply(music_genre_list: js.Array[Musicgenre]): PrimaryGenres = {
    val __obj = js.Dynamic.literal(music_genre_list = music_genre_list.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryGenres]
  }
  
  @scala.inline
  implicit class PrimaryGenresMutableBuilder[Self <: PrimaryGenres] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMusic_genre_list(value: js.Array[Musicgenre]): Self = StObject.set(x, "music_genre_list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMusic_genre_listVarargs(value: Musicgenre*): Self = StObject.set(x, "music_genre_list", js.Array(value :_*))
  }
}
