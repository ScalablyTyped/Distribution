package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtistParams extends StObject {
  
  var artist_id: js.UndefOr[Double] = js.native
  
  var artist_mbid: js.UndefOr[Double] = js.native
}
object ArtistParams {
  
  @scala.inline
  def apply(): ArtistParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtistParams]
  }
  
  @scala.inline
  implicit class ArtistParamsMutableBuilder[Self <: ArtistParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtist_id(value: Double): Self = StObject.set(x, "artist_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtist_idUndefined: Self = StObject.set(x, "artist_id", js.undefined)
    
    @scala.inline
    def setArtist_mbid(value: Double): Self = StObject.set(x, "artist_mbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtist_mbidUndefined: Self = StObject.set(x, "artist_mbid", js.undefined)
  }
}
