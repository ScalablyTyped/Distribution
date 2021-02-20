package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductSetPurgeConfig extends StObject {
  
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
  implicit class ProductSetPurgeConfigMutableBuilder[Self <: ProductSetPurgeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductSetId(value: String): Self = StObject.set(x, "productSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductSetIdUndefined: Self = StObject.set(x, "productSetId", js.undefined)
  }
}
