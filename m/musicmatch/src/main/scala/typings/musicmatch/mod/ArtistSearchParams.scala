package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtistSearchParams extends Pageable {
  
  var f_artist_id: js.UndefOr[Double] = js.native
  
  var f_artist_mbid: js.UndefOr[Double] = js.native
  
  var q_artist: js.UndefOr[String] = js.native
}
object ArtistSearchParams {
  
  @scala.inline
  def apply(): ArtistSearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtistSearchParams]
  }
  
  @scala.inline
  implicit class ArtistSearchParamsMutableBuilder[Self <: ArtistSearchParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setF_artist_id(value: Double): Self = StObject.set(x, "f_artist_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_artist_idUndefined: Self = StObject.set(x, "f_artist_id", js.undefined)
    
    @scala.inline
    def setF_artist_mbid(value: Double): Self = StObject.set(x, "f_artist_mbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_artist_mbidUndefined: Self = StObject.set(x, "f_artist_mbid", js.undefined)
    
    @scala.inline
    def setQ_artist(value: String): Self = StObject.set(x, "q_artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ_artistUndefined: Self = StObject.set(x, "q_artist", js.undefined)
  }
}
