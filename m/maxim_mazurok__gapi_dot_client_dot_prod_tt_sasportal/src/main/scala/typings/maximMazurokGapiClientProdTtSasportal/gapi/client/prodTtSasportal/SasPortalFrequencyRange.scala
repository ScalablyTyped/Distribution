package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalFrequencyRange extends js.Object {
  
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
  implicit class SasPortalFrequencyRangeOps[Self <: SasPortalFrequencyRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHighFrequencyMhz(value: Double): Self = this.set("highFrequencyMhz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighFrequencyMhz: Self = this.set("highFrequencyMhz", js.undefined)
    
    @scala.inline
    def setLowFrequencyMhz(value: Double): Self = this.set("lowFrequencyMhz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowFrequencyMhz: Self = this.set("lowFrequencyMhz", js.undefined)
  }
}
