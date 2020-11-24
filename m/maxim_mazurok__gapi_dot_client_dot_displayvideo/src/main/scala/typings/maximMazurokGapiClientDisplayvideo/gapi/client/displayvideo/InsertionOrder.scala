package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertionOrder extends js.Object {
  
  /** Output only. The unique ID of the advertiser the insertion order belongs to. */
  var advertiserId: js.UndefOr[String] = js.native
  
  /** The bidding strategy of the insertion order. By default, fixed_bid is set. */
  var bidStrategy: js.UndefOr[BiddingStrategy] = js.native
  
  /** Required. The budget allocation settings of the insertion order. */
  var budget: js.UndefOr[InsertionOrderBudget] = js.native
  
  /** Required. Immutable. The unique ID of the campaign that the insertion order belongs to. */
  var campaignId: js.UndefOr[String] = js.native
  
  /** Required. The display name of the insertion order. Must be UTF-8 encoded with a maximum size of 240 bytes. */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Required. Controls whether or not the insertion order can spend its budget and bid on inventory. * For CreateInsertionOrder method, only `ENTITY_STATUS_DRAFT` is allowed. To
    * activate an insertion order, use UpdateInsertionOrder method and update the status to `ENTITY_STATUS_ACTIVE` after creation. * An insertion order cannot be changed back to
    * `ENTITY_STATUS_DRAFT` status from any other status. * An insertion order cannot be set to `ENTITY_STATUS_ACTIVE` if its parent campaign is not active.
    */
  var entityStatus: js.UndefOr[String] = js.native
  
  /** Required. The frequency capping setting of the insertion order. */
  var frequencyCap: js.UndefOr[FrequencyCap] = js.native
  
  /** Output only. The unique ID of the insertion order. Assigned by the system. */
  var insertionOrderId: js.UndefOr[String] = js.native
  
  /** Additional integration details of the insertion order. */
  var integrationDetails: js.UndefOr[IntegrationDetails] = js.native
  
  /** Output only. The resource name of the insertion order. */
  var name: js.UndefOr[String] = js.native
  
  /** Required. The budget spending speed setting of the insertion order. */
  var pacing: js.UndefOr[Pacing] = js.native
  
  /**
    * The partner costs associated with the insertion order. If absent or empty in CreateInsertionOrder method, the newly created insertion order will inherit partner costs from the
    * partner settings.
    */
  var partnerCosts: js.UndefOr[js.Array[PartnerCost]] = js.native
  
  /** Required. Performance goal of the insertion order. */
  var performanceGoal: js.UndefOr[PerformanceGoal] = js.native
  
  /** Output only. The timestamp when the insertion order was last updated. Assigned by the system. */
  var updateTime: js.UndefOr[String] = js.native
}
object InsertionOrder {
  
  @scala.inline
  def apply(): InsertionOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertionOrder]
  }
  
  @scala.inline
  implicit class InsertionOrderOps[Self <: InsertionOrder] (val x: Self) extends AnyVal {
    
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
    def setBidStrategy(value: BiddingStrategy): Self = this.set("bidStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBidStrategy: Self = this.set("bidStrategy", js.undefined)
    
    @scala.inline
    def setBudget(value: InsertionOrderBudget): Self = this.set("budget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBudget: Self = this.set("budget", js.undefined)
    
    @scala.inline
    def setCampaignId(value: String): Self = this.set("campaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignId: Self = this.set("campaignId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEntityStatus(value: String): Self = this.set("entityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityStatus: Self = this.set("entityStatus", js.undefined)
    
    @scala.inline
    def setFrequencyCap(value: FrequencyCap): Self = this.set("frequencyCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequencyCap: Self = this.set("frequencyCap", js.undefined)
    
    @scala.inline
    def setInsertionOrderId(value: String): Self = this.set("insertionOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertionOrderId: Self = this.set("insertionOrderId", js.undefined)
    
    @scala.inline
    def setIntegrationDetails(value: IntegrationDetails): Self = this.set("integrationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrationDetails: Self = this.set("integrationDetails", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPacing(value: Pacing): Self = this.set("pacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePacing: Self = this.set("pacing", js.undefined)
    
    @scala.inline
    def setPartnerCostsVarargs(value: PartnerCost*): Self = this.set("partnerCosts", js.Array(value :_*))
    
    @scala.inline
    def setPartnerCosts(value: js.Array[PartnerCost]): Self = this.set("partnerCosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartnerCosts: Self = this.set("partnerCosts", js.undefined)
    
    @scala.inline
    def setPerformanceGoal(value: PerformanceGoal): Self = this.set("performanceGoal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformanceGoal: Self = this.set("performanceGoal", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
