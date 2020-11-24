package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurgeProductsRequest extends js.Object {
  
  /** If delete_orphan_products is true, all Products that are not in any ProductSet will be deleted. */
  var deleteOrphanProducts: js.UndefOr[Boolean] = js.native
  
  /** The default value is false. Override this value to true to actually perform the purge. */
  var force: js.UndefOr[Boolean] = js.native
  
  /** Specify which ProductSet contains the Products to be deleted. */
  var productSetPurgeConfig: js.UndefOr[ProductSetPurgeConfig] = js.native
}
object PurgeProductsRequest {
  
  @scala.inline
  def apply(): PurgeProductsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurgeProductsRequest]
  }
  
  @scala.inline
  implicit class PurgeProductsRequestOps[Self <: PurgeProductsRequest] (val x: Self) extends AnyVal {
    
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
    def setDeleteOrphanProducts(value: Boolean): Self = this.set("deleteOrphanProducts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteOrphanProducts: Self = this.set("deleteOrphanProducts", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setProductSetPurgeConfig(value: ProductSetPurgeConfig): Self = this.set("productSetPurgeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductSetPurgeConfig: Self = this.set("productSetPurgeConfig", js.undefined)
  }
}
