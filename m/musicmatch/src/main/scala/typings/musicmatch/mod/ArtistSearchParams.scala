package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtistSearchParams
  extends StObject
     with Pageable {
  
  var f_artist_id: js.UndefOr[Double] = js.undefined
  
  var f_artist_mbid: js.UndefOr[Double] = js.undefined
  
  var q_artist: js.UndefOr[String] = js.undefined
}
object ArtistSearchParams {
  
  inline def apply(): ArtistSearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtistSearchParams]
  }
  
  extension [Self <: ArtistSearchParams](x: Self) {
    
    inline def setF_artist_id(value: Double): Self = StObject.set(x, "f_artist_id", value.asInstanceOf[js.Any])
    
    inline def setF_artist_idUndefined: Self = StObject.set(x, "f_artist_id", js.undefined)
    
    inline def setF_artist_mbid(value: Double): Self = StObject.set(x, "f_artist_mbid", value.asInstanceOf[js.Any])
    
    inline def setF_artist_mbidUndefined: Self = StObject.set(x, "f_artist_mbid", js.undefined)
    
    inline def setQ_artist(value: String): Self = StObject.set(x, "q_artist", value.asInstanceOf[js.Any])
    
    inline def setQ_artistUndefined: Self = StObject.set(x, "q_artist", js.undefined)
  }
}
