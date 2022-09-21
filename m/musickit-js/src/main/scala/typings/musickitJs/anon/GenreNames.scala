package typings.musickitJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenreNames extends StObject {
  
  var editorialNotes: js.UndefOr[typings.musickitJs.MusicKit.EditorialNotes] = js.undefined
  
  var genreNames: js.Array[String]
  
  var name: String
  
  var url: String
}
object GenreNames {
  
  inline def apply(genreNames: js.Array[String], name: String, url: String): GenreNames = {
    val __obj = js.Dynamic.literal(genreNames = genreNames.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenreNames]
  }
  
  extension [Self <: GenreNames](x: Self) {
    
    inline def setEditorialNotes(value: typings.musickitJs.MusicKit.EditorialNotes): Self = StObject.set(x, "editorialNotes", value.asInstanceOf[js.Any])
    
    inline def setEditorialNotesUndefined: Self = StObject.set(x, "editorialNotes", js.undefined)
    
    inline def setGenreNames(value: js.Array[String]): Self = StObject.set(x, "genreNames", value.asInstanceOf[js.Any])
    
    inline def setGenreNamesVarargs(value: String*): Self = StObject.set(x, "genreNames", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
