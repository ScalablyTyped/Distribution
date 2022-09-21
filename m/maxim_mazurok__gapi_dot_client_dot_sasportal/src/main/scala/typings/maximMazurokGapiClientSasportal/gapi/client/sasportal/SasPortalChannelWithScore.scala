package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalChannelWithScore extends StObject {
  
  /** The frequency range of the channel. */
  var frequencyRange: js.UndefOr[SasPortalFrequencyRange] = js.undefined
  
  /** The channel score, normalized to be in [0,100]. */
  var score: js.UndefOr[Double] = js.undefined
}
object SasPortalChannelWithScore {
  
  inline def apply(): SasPortalChannelWithScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalChannelWithScore]
  }
  
  extension [Self <: SasPortalChannelWithScore](x: Self) {
    
    inline def setFrequencyRange(value: SasPortalFrequencyRange): Self = StObject.set(x, "frequencyRange", value.asInstanceOf[js.Any])
    
    inline def setFrequencyRangeUndefined: Self = StObject.set(x, "frequencyRange", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
