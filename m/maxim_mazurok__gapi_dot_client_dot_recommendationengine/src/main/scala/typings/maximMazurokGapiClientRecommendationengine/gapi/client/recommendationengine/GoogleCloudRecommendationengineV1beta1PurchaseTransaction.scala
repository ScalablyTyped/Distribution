package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1PurchaseTransaction extends js.Object {
  
  /**
    * Optional. All the costs associated with the product. These can be manufacturing costs, shipping expenses not borne by the end user, or any other costs. Total product cost such that
    * profit = revenue - (sum(taxes) + sum(costs)) If product_cost is not set, then profit = revenue - tax - shipping - sum(CatalogItem.costs). If CatalogItem.cost is not specified for
    * one of the items, CatalogItem.cost based profit *cannot* be calculated for this Transaction.
    */
  var costs: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: number}
    */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1PurchaseTransaction with TopLevel[js.Any]
  ] = js.native
  
  /** Required. Currency code. Use three-character ISO-4217 code. This field is not required if the event type is `refund`. */
  var currencyCode: js.UndefOr[String] = js.native
  
  /** Optional. The transaction ID with a length limit of 128 bytes. */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Required. Total revenue or grand total associated with the transaction. This value include shipping, tax, or other adjustments to total revenue that you want to include as part of
    * your revenue calculations. This field is not required if the event type is `refund`.
    */
  var revenue: js.UndefOr[Double] = js.native
  
  /** Optional. All the taxes associated with the transaction. */
  var taxes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: number}
    */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1PurchaseTransaction with TopLevel[js.Any]
  ] = js.native
}
object GoogleCloudRecommendationengineV1beta1PurchaseTransaction {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1PurchaseTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1PurchaseTransaction]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1PurchaseTransactionOps[Self <: GoogleCloudRecommendationengineV1beta1PurchaseTransaction] (val x: Self) extends AnyVal {
    
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
    def setCosts(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: number}
      */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1PurchaseTransaction with TopLevel[js.Any]
    ): Self = this.set("costs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCosts: Self = this.set("costs", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setRevenue(value: Double): Self = this.set("revenue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevenue: Self = this.set("revenue", js.undefined)
    
    @scala.inline
    def setTaxes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: number}
      */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1PurchaseTransaction with TopLevel[js.Any]
    ): Self = this.set("taxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxes: Self = this.set("taxes", js.undefined)
  }
}
