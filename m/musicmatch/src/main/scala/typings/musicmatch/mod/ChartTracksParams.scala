package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartTracksParams
  extends StObject
     with Pageable {
  
  var country: js.UndefOr[String] = js.undefined
  
  var f_has_lyrics: js.UndefOr[TBoolean] = js.undefined
}
object ChartTracksParams {
  
  inline def apply(): ChartTracksParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTracksParams]
  }
  
  extension [Self <: ChartTracksParams](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setF_has_lyrics(value: TBoolean): Self = StObject.set(x, "f_has_lyrics", value.asInstanceOf[js.Any])
    
    inline def setF_has_lyricsUndefined: Self = StObject.set(x, "f_has_lyrics", js.undefined)
  }
}
