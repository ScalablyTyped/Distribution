package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadResponse extends StObject {
  
  /** Retrieved ad groups in SDF format. */
  var adGroups: js.UndefOr[String] = js.native
  
  /** Retrieved ads in SDF format. */
  var ads: js.UndefOr[String] = js.native
  
  /** Retrieved campaigns in SDF format. */
  var campaigns: js.UndefOr[String] = js.native
  
  /** Retrieved insertion orders in SDF format. */
  var insertionOrders: js.UndefOr[String] = js.native
  
  var inventorySources: js.UndefOr[String] = js.native
  
  /** Retrieved line items in SDF format. */
  var lineItems: js.UndefOr[String] = js.native
}
object DownloadResponse {
  
  @scala.inline
  def apply(): DownloadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadResponse]
  }
  
  @scala.inline
  implicit class DownloadResponseMutableBuilder[Self <: DownloadResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdGroups(value: String): Self = StObject.set(x, "adGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdGroupsUndefined: Self = StObject.set(x, "adGroups", js.undefined)
    
    @scala.inline
    def setAds(value: String): Self = StObject.set(x, "ads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdsUndefined: Self = StObject.set(x, "ads", js.undefined)
    
    @scala.inline
    def setCampaigns(value: String): Self = StObject.set(x, "campaigns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignsUndefined: Self = StObject.set(x, "campaigns", js.undefined)
    
    @scala.inline
    def setInsertionOrders(value: String): Self = StObject.set(x, "insertionOrders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertionOrdersUndefined: Self = StObject.set(x, "insertionOrders", js.undefined)
    
    @scala.inline
    def setInventorySources(value: String): Self = StObject.set(x, "inventorySources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventorySourcesUndefined: Self = StObject.set(x, "inventorySources", js.undefined)
    
    @scala.inline
    def setLineItems(value: String): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
  }
}
