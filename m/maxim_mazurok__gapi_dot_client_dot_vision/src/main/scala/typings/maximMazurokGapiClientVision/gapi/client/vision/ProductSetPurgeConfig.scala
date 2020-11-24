package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductSetPurgeConfig extends js.Object {
  
  /** The ProductSet that contains the Products to delete. If a Product is a member of product_set_id in addition to other ProductSets, the Product will still be deleted. */
  var productSetId: js.UndefOr[String] = js.native
}
object ProductSetPurgeConfig {
  
  @scala.inline
  def apply(): ProductSetPurgeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductSetPurgeConfig]
  }
  
  @scala.inline
  implicit class ProductSetPurgeConfigOps[Self <: ProductSetPurgeConfig] (val x: Self) extends AnyVal {
    
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
    def setProductSetId(value: String): Self = this.set("productSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductSetId: Self = this.set("productSetId", js.undefined)
  }
}
