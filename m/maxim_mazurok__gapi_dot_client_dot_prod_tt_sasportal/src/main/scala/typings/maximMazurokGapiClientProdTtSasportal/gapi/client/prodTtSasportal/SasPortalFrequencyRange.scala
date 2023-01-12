package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalFrequencyRange extends StObject {
  
  /** The highest frequency of the frequency range in MHz. */
  var highFrequencyMhz: js.UndefOr[Double] = js.undefined
  
  /** The lowest frequency of the frequency range in MHz. */
  var lowFrequencyMhz: js.UndefOr[Double] = js.undefined
}
object SasPortalFrequencyRange {
  
  inline def apply(): SasPortalFrequencyRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalFrequencyRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SasPortalFrequencyRange] (val x: Self) extends AnyVal {
    
    inline def setHighFrequencyMhz(value: Double): Self = StObject.set(x, "highFrequencyMhz", value.asInstanceOf[js.Any])
    
    inline def setHighFrequencyMhzUndefined: Self = StObject.set(x, "highFrequencyMhz", js.undefined)
    
    inline def setLowFrequencyMhz(value: Double): Self = StObject.set(x, "lowFrequencyMhz", value.asInstanceOf[js.Any])
    
    inline def setLowFrequencyMhzUndefined: Self = StObject.set(x, "lowFrequencyMhz", js.undefined)
  }
}
