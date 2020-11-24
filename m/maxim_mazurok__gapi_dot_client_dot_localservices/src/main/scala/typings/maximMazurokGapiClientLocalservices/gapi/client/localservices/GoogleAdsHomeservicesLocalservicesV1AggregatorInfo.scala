package typings.maximMazurokGapiClientLocalservices.gapi.client.localservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAdsHomeservicesLocalservicesV1AggregatorInfo extends js.Object {
  
  /** Provider id (listed in aggregator system) which maps to a account id in GLS system. */
  var aggregatorProviderId: js.UndefOr[String] = js.native
}
object GoogleAdsHomeservicesLocalservicesV1AggregatorInfo {
  
  @scala.inline
  def apply(): GoogleAdsHomeservicesLocalservicesV1AggregatorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAdsHomeservicesLocalservicesV1AggregatorInfo]
  }
  
  @scala.inline
  implicit class GoogleAdsHomeservicesLocalservicesV1AggregatorInfoOps[Self <: GoogleAdsHomeservicesLocalservicesV1AggregatorInfo] (val x: Self) extends AnyVal {
    
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
    def setAggregatorProviderId(value: String): Self = this.set("aggregatorProviderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregatorProviderId: Self = this.set("aggregatorProviderId", js.undefined)
  }
}
