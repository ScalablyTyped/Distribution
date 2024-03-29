package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlbumParams extends StObject {
  
  var album_id: Double
}
object AlbumParams {
  
  inline def apply(album_id: Double): AlbumParams = {
    val __obj = js.Dynamic.literal(album_id = album_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlbumParams] (val x: Self) extends AnyVal {
    
    inline def setAlbum_id(value: Double): Self = StObject.set(x, "album_id", value.asInstanceOf[js.Any])
  }
}
