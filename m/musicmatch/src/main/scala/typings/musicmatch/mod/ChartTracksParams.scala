package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartTracksParams extends Pageable {
  
  var country: js.UndefOr[String] = js.native
  
  var f_has_lyrics: js.UndefOr[TBoolean] = js.native
}
object ChartTracksParams {
  
  @scala.inline
  def apply(): ChartTracksParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTracksParams]
  }
  
  @scala.inline
  implicit class ChartTracksParamsMutableBuilder[Self <: ChartTracksParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setF_has_lyrics(value: TBoolean): Self = StObject.set(x, "f_has_lyrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_has_lyricsUndefined: Self = StObject.set(x, "f_has_lyrics", js.undefined)
  }
}
