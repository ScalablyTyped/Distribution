package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalFrequencyRange extends StObject {
  
  /** The highest frequency of the frequency range in MHz. */
  var highFrequencyMhz: js.UndefOr[Double] = js.native
  
  /** The lowest frequency of the frequency range in MHz. */
  var lowFrequencyMhz: js.UndefOr[Double] = js.native
}
object SasPortalFrequencyRange {
  
  @scala.inline
  def apply(): SasPortalFrequencyRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalFrequencyRange]
  }
  
  @scala.inline
  implicit class SasPortalFrequencyRangeMutableBuilder[Self <: SasPortalFrequencyRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighFrequencyMhz(value: Double): Self = StObject.set(x, "highFrequencyMhz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighFrequencyMhzUndefined: Self = StObject.set(x, "highFrequencyMhz", js.undefined)
    
    @scala.inline
    def setLowFrequencyMhz(value: Double): Self = StObject.set(x, "lowFrequencyMhz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowFrequencyMhzUndefined: Self = StObject.set(x, "lowFrequencyMhz", js.undefined)
  }
}
