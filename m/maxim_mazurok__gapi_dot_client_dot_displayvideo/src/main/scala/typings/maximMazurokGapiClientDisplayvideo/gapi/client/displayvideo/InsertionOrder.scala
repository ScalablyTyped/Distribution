package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertionOrder extends StObject {
  
  /** Output only. The unique ID of the advertiser the insertion order belongs to. */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** The bidding strategy of the insertion order. By default, fixed_bid is set. */
  var bidStrategy: js.UndefOr[BiddingStrategy] = js.undefined
  
  /** Immutable. The billable outcome of the insertion order. */
  var billableOutcome: js.UndefOr[String] = js.undefined
  
  /** Required. The budget allocation settings of the insertion order. */
  var budget: js.UndefOr[InsertionOrderBudget] = js.undefined
  
  /** Required. Immutable. The unique ID of the campaign that the insertion order belongs to. */
  var campaignId: js.UndefOr[String] = js.undefined
  
  /** Required. The display name of the insertion order. Must be UTF-8 encoded with a maximum size of 240 bytes. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Controls whether or not the insertion order can spend its budget and bid on inventory. * For CreateInsertionOrder method, only `ENTITY_STATUS_DRAFT` is allowed. To
    * activate an insertion order, use UpdateInsertionOrder method and update the status to `ENTITY_STATUS_ACTIVE` after creation. * An insertion order cannot be changed back to
    * `ENTITY_STATUS_DRAFT` status from any other status. * An insertion order cannot be set to `ENTITY_STATUS_ACTIVE` if its parent campaign is not active.
    */
  var entityStatus: js.UndefOr[String] = js.undefined
  
  /** Required. The frequency capping setting of the insertion order. */
  var frequencyCap: js.UndefOr[FrequencyCap] = js.undefined
  
  /** Output only. The unique ID of the insertion order. Assigned by the system. */
  var insertionOrderId: js.UndefOr[String] = js.undefined
  
  /** The type of insertion order. If this field is unspecified in creation, the value defaults to `RTB`. */
  var insertionOrderType: js.UndefOr[String] = js.undefined
  
  /** Additional integration details of the insertion order. */
  var integrationDetails: js.UndefOr[IntegrationDetails] = js.undefined
  
  /** Output only. The resource name of the insertion order. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. The budget spending speed setting of the insertion order. */
  var pacing: js.UndefOr[Pacing] = js.undefined
  
  /**
    * The partner costs associated with the insertion order. If absent or empty in CreateInsertionOrder method, the newly created insertion order will inherit partner costs from the
    * partner settings.
    */
  var partnerCosts: js.UndefOr[js.Array[PartnerCost]] = js.undefined
  
  /** Required. Performance goal of the insertion order. */
  var performanceGoal: js.UndefOr[PerformanceGoal] = js.undefined
  
  /** Output only. The reservation type of the insertion order. */
  var reservationType: js.UndefOr[String] = js.undefined
  
  /** Output only. The timestamp when the insertion order was last updated. Assigned by the system. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object InsertionOrder {
  
  inline def apply(): InsertionOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertionOrder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertionOrder] (val x: Self) extends AnyVal {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setBidStrategy(value: BiddingStrategy): Self = StObject.set(x, "bidStrategy", value.asInstanceOf[js.Any])
    
    inline def setBidStrategyUndefined: Self = StObject.set(x, "bidStrategy", js.undefined)
    
    inline def setBillableOutcome(value: String): Self = StObject.set(x, "billableOutcome", value.asInstanceOf[js.Any])
    
    inline def setBillableOutcomeUndefined: Self = StObject.set(x, "billableOutcome", js.undefined)
    
    inline def setBudget(value: InsertionOrderBudget): Self = StObject.set(x, "budget", value.asInstanceOf[js.Any])
    
    inline def setBudgetUndefined: Self = StObject.set(x, "budget", js.undefined)
    
    inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEntityStatus(value: String): Self = StObject.set(x, "entityStatus", value.asInstanceOf[js.Any])
    
    inline def setEntityStatusUndefined: Self = StObject.set(x, "entityStatus", js.undefined)
    
    inline def setFrequencyCap(value: FrequencyCap): Self = StObject.set(x, "frequencyCap", value.asInstanceOf[js.Any])
    
    inline def setFrequencyCapUndefined: Self = StObject.set(x, "frequencyCap", js.undefined)
    
    inline def setInsertionOrderId(value: String): Self = StObject.set(x, "insertionOrderId", value.asInstanceOf[js.Any])
    
    inline def setInsertionOrderIdUndefined: Self = StObject.set(x, "insertionOrderId", js.undefined)
    
    inline def setInsertionOrderType(value: String): Self = StObject.set(x, "insertionOrderType", value.asInstanceOf[js.Any])
    
    inline def setInsertionOrderTypeUndefined: Self = StObject.set(x, "insertionOrderType", js.undefined)
    
    inline def setIntegrationDetails(value: IntegrationDetails): Self = StObject.set(x, "integrationDetails", value.asInstanceOf[js.Any])
    
    inline def setIntegrationDetailsUndefined: Self = StObject.set(x, "integrationDetails", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPacing(value: Pacing): Self = StObject.set(x, "pacing", value.asInstanceOf[js.Any])
    
    inline def setPacingUndefined: Self = StObject.set(x, "pacing", js.undefined)
    
    inline def setPartnerCosts(value: js.Array[PartnerCost]): Self = StObject.set(x, "partnerCosts", value.asInstanceOf[js.Any])
    
    inline def setPartnerCostsUndefined: Self = StObject.set(x, "partnerCosts", js.undefined)
    
    inline def setPartnerCostsVarargs(value: PartnerCost*): Self = StObject.set(x, "partnerCosts", js.Array(value*))
    
    inline def setPerformanceGoal(value: PerformanceGoal): Self = StObject.set(x, "performanceGoal", value.asInstanceOf[js.Any])
    
    inline def setPerformanceGoalUndefined: Self = StObject.set(x, "performanceGoal", js.undefined)
    
    inline def setReservationType(value: String): Self = StObject.set(x, "reservationType", value.asInstanceOf[js.Any])
    
    inline def setReservationTypeUndefined: Self = StObject.set(x, "reservationType", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
