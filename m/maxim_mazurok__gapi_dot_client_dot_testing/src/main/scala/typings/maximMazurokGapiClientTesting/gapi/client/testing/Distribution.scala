package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Distribution extends StObject {
  
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
  implicit class DistributionMutableBuilder[Self <: Distribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarketShare(value: Double): Self = StObject.set(x, "marketShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketShareUndefined: Self = StObject.set(x, "marketShare", js.undefined)
    
    @scala.inline
    def setMeasurementTime(value: String): Self = StObject.set(x, "measurementTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurementTimeUndefined: Self = StObject.set(x, "measurementTime", js.undefined)
  }
}
