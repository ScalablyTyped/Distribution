package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accesskey extends StObject {
  
  var access_key: js.UndefOr[String] = js.undefined
  
  var album_id: js.UndefOr[Double] = js.undefined
  
  var artist: String
  
  var date: js.UndefOr[Double] = js.undefined
  
  var duration: Double
  
  var genre_id: js.UndefOr[Double] = js.undefined
  
  var id: Double
  
  var owner_id: Double
  
  var performer: js.UndefOr[String] = js.undefined
  
  var title: String
  
  var url: js.UndefOr[String] = js.undefined
}
object Accesskey {
  
  inline def apply(artist: String, duration: Double, id: Double, owner_id: Double, title: String): Accesskey = {
    val __obj = js.Dynamic.literal(artist = artist.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], owner_id = owner_id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accesskey]
  }
  
  extension [Self <: Accesskey](x: Self) {
    
    inline def setAccess_key(value: String): Self = StObject.set(x, "access_key", value.asInstanceOf[js.Any])
    
    inline def setAccess_keyUndefined: Self = StObject.set(x, "access_key", js.undefined)
    
    inline def setAlbum_id(value: Double): Self = StObject.set(x, "album_id", value.asInstanceOf[js.Any])
    
    inline def setAlbum_idUndefined: Self = StObject.set(x, "album_id", js.undefined)
    
    inline def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setGenre_id(value: Double): Self = StObject.set(x, "genre_id", value.asInstanceOf[js.Any])
    
    inline def setGenre_idUndefined: Self = StObject.set(x, "genre_id", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOwner_id(value: Double): Self = StObject.set(x, "owner_id", value.asInstanceOf[js.Any])
    
    inline def setPerformer(value: String): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
