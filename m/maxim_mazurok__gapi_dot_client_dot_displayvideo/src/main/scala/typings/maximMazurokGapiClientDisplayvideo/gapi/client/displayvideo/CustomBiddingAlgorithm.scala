package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomBiddingAlgorithm extends StObject {
  
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
  implicit class CustomBiddingAlgorithmMutableBuilder[Self <: CustomBiddingAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setCustomBiddingAlgorithmId(value: String): Self = StObject.set(x, "customBiddingAlgorithmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomBiddingAlgorithmIdUndefined: Self = StObject.set(x, "customBiddingAlgorithmId", js.undefined)
    
    @scala.inline
    def setCustomBiddingAlgorithmType(value: String): Self = StObject.set(x, "customBiddingAlgorithmType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomBiddingAlgorithmTypeUndefined: Self = StObject.set(x, "customBiddingAlgorithmType", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEntityStatus(value: String): Self = StObject.set(x, "entityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityStatusUndefined: Self = StObject.set(x, "entityStatus", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}
