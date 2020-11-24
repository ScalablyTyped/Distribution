package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdFilter extends js.Object {
  
  /** YouTube Ads to download by ID. All IDs must belong to the same Advertiser or Partner specified in CreateSdfDownloadTaskRequest. */
  var adGroupAdIds: js.UndefOr[js.Array[String]] = js.native
  
  /** YouTube Ad Groups to download by ID. All IDs must belong to the same Advertiser or Partner specified in CreateSdfDownloadTaskRequest. */
  var adGroupIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Campaigns to download by ID. All IDs must belong to the same Advertiser or Partner specified in CreateSdfDownloadTaskRequest. */
  var campaignIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Insertion Orders to download by ID. All IDs must belong to the same Advertiser or Partner specified in CreateSdfDownloadTaskRequest. */
  var insertionOrderIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Line Items to download by ID. All IDs must belong to the same Advertiser or Partner specified in CreateSdfDownloadTaskRequest. */
  var lineItemIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Media Products to download by ID. All IDs must belong to the same Advertiser or Partner specified in CreateSdfDownloadTaskRequest. */
  var mediaProductIds: js.UndefOr[js.Array[String]] = js.native
}
object IdFilter {
  
  @scala.inline
  def apply(): IdFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdFilter]
  }
  
  @scala.inline
  implicit class IdFilterOps[Self <: IdFilter] (val x: Self) extends AnyVal {
    
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
    def setAdGroupAdIdsVarargs(value: String*): Self = this.set("adGroupAdIds", js.Array(value :_*))
    
    @scala.inline
    def setAdGroupAdIds(value: js.Array[String]): Self = this.set("adGroupAdIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdGroupAdIds: Self = this.set("adGroupAdIds", js.undefined)
    
    @scala.inline
    def setAdGroupIdsVarargs(value: String*): Self = this.set("adGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setAdGroupIds(value: js.Array[String]): Self = this.set("adGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdGroupIds: Self = this.set("adGroupIds", js.undefined)
    
    @scala.inline
    def setCampaignIdsVarargs(value: String*): Self = this.set("campaignIds", js.Array(value :_*))
    
    @scala.inline
    def setCampaignIds(value: js.Array[String]): Self = this.set("campaignIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignIds: Self = this.set("campaignIds", js.undefined)
    
    @scala.inline
    def setInsertionOrderIdsVarargs(value: String*): Self = this.set("insertionOrderIds", js.Array(value :_*))
    
    @scala.inline
    def setInsertionOrderIds(value: js.Array[String]): Self = this.set("insertionOrderIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertionOrderIds: Self = this.set("insertionOrderIds", js.undefined)
    
    @scala.inline
    def setLineItemIdsVarargs(value: String*): Self = this.set("lineItemIds", js.Array(value :_*))
    
    @scala.inline
    def setLineItemIds(value: js.Array[String]): Self = this.set("lineItemIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItemIds: Self = this.set("lineItemIds", js.undefined)
    
    @scala.inline
    def setMediaProductIdsVarargs(value: String*): Self = this.set("mediaProductIds", js.Array(value :_*))
    
    @scala.inline
    def setMediaProductIds(value: js.Array[String]): Self = this.set("mediaProductIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaProductIds: Self = this.set("mediaProductIds", js.undefined)
  }
}
