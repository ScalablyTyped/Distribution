package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlbumTracksParams extends StObject {
  
  var album_id: js.UndefOr[Double] = js.undefined
  
  var album_mbid: js.UndefOr[Double] = js.undefined
  
  var format: js.UndefOr[TFormat] = js.undefined
}
object AlbumTracksParams {
  
  @scala.inline
  def apply(): AlbumTracksParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlbumTracksParams]
  }
  
  @scala.inline
  implicit class AlbumTracksParamsMutableBuilder[Self <: AlbumTracksParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbum_id(value: Double): Self = StObject.set(x, "album_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbum_idUndefined: Self = StObject.set(x, "album_id", js.undefined)
    
    @scala.inline
    def setAlbum_mbid(value: Double): Self = StObject.set(x, "album_mbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbum_mbidUndefined: Self = StObject.set(x, "album_mbid", js.undefined)
    
    @scala.inline
    def setFormat(value: TFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
