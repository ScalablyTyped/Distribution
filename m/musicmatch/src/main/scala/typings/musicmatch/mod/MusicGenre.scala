package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MusicGenre extends StObject {
  
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
  
  @scala.inline
  implicit class MusicGenreMutableBuilder[Self <: MusicGenre] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMusic_genre_id(value: Double): Self = StObject.set(x, "music_genre_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMusic_genre_name(value: String): Self = StObject.set(x, "music_genre_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMusic_genre_name_extended(value: String): Self = StObject.set(x, "music_genre_name_extended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMusic_genre_parent_id(value: Double): Self = StObject.set(x, "music_genre_parent_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMusic_genre_vanity(value: String): Self = StObject.set(x, "music_genre_vanity", value.asInstanceOf[js.Any])
  }
}
