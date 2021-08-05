package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartArtistsParams
  extends StObject
     with Pageable {
  
  var country: js.UndefOr[String] = js.undefined
}
object ChartArtistsParams {
  
  inline def apply(): ChartArtistsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartArtistsParams]
  }
  
  extension [Self <: ChartArtistsParams](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
  }
}
