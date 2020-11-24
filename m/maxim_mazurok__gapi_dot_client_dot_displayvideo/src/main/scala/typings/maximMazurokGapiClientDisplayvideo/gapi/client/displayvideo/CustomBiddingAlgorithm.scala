package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomBiddingAlgorithm extends js.Object {
  
  /** Immutable. The unique ID of the advertiser that owns the custom bidding algorithm. */
  var advertiserId: js.UndefOr[String] = js.native
  
  /** Output only. The unique ID of the custom bidding algorithm. Assigned by the system. */
  var customBiddingAlgorithmId: js.UndefOr[String] = js.native
  
  /** Required. Immutable. The type of custom bidding algorithm. */
  var customBiddingAlgorithmType: js.UndefOr[String] = js.native
  
  /** Required. The display name of the custom bidding algorithm. Must be UTF-8 encoded with a maximum size of 240 bytes. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Controls whether or not the custom bidding algorithm can be used as a bidding strategy. Accepted values are: * `ENTITY_STATUS_ACTIVE` * `ENTITY_STATUS_ARCHIVED` */
  var entityStatus: js.UndefOr[String] = js.native
  
  /** Output only. The resource name of the custom bidding algorithm. */
  var name: js.UndefOr[String] = js.native
  
  /** Immutable. The unique ID of the partner that owns the custom bidding algorithm. */
  var partnerId: js.UndefOr[String] = js.native
}
object CustomBiddingAlgorithm {
  
  @scala.inline
  def apply(): CustomBiddingAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomBiddingAlgorithm]
  }
  
  @scala.inline
  implicit class CustomBiddingAlgorithmOps[Self <: CustomBiddingAlgorithm] (val x: Self) extends AnyVal {
    
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
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setCustomBiddingAlgorithmId(value: String): Self = this.set("customBiddingAlgorithmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomBiddingAlgorithmId: Self = this.set("customBiddingAlgorithmId", js.undefined)
    
    @scala.inline
    def setCustomBiddingAlgorithmType(value: String): Self = this.set("customBiddingAlgorithmType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomBiddingAlgorithmType: Self = this.set("customBiddingAlgorithmType", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEntityStatus(value: String): Self = this.set("entityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityStatus: Self = this.set("entityStatus", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPartnerId(value: String): Self = this.set("partnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartnerId: Self = this.set("partnerId", js.undefined)
  }
}
