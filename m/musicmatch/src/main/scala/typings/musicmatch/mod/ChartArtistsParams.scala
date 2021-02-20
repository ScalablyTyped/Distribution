package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartArtistsParams extends Pageable {
  
  var country: js.UndefOr[String] = js.native
}
object ChartArtistsParams {
  
  @scala.inline
  def apply(): ChartArtistsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartArtistsParams]
  }
  
  @scala.inline
  implicit class ChartArtistsParamsMutableBuilder[Self <: ChartArtistsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
  }
}
