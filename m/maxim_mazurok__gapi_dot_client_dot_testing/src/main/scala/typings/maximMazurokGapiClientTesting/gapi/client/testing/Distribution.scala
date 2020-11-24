package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Distribution extends js.Object {
  
  /** Output only. The estimated fraction (0-1) of the total market with this configuration. */
  var marketShare: js.UndefOr[Double] = js.native
  
  /** Output only. The time this distribution was measured. */
  var measurementTime: js.UndefOr[String] = js.native
}
object Distribution {
  
  @scala.inline
  def apply(): Distribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Distribution]
  }
  
  @scala.inline
  implicit class DistributionOps[Self <: Distribution] (val x: Self) extends AnyVal {
    
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
    def setMarketShare(value: Double): Self = this.set("marketShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarketShare: Self = this.set("marketShare", js.undefined)
    
    @scala.inline
    def setMeasurementTime(value: String): Self = this.set("measurementTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasurementTime: Self = this.set("measurementTime", js.undefined)
  }
}
