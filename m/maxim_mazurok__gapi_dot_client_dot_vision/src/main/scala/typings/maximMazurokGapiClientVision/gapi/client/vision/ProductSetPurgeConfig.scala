package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductSetPurgeConfig extends StObject {
  
  /** The ProductSet that contains the Products to delete. If a Product is a member of product_set_id in addition to other ProductSets, the Product will still be deleted. */
  var productSetId: js.UndefOr[String] = js.undefined
}
object ProductSetPurgeConfig {
  
  inline def apply(): ProductSetPurgeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductSetPurgeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductSetPurgeConfig] (val x: Self) extends AnyVal {
    
    inline def setProductSetId(value: String): Self = StObject.set(x, "productSetId", value.asInstanceOf[js.Any])
    
    inline def setProductSetIdUndefined: Self = StObject.set(x, "productSetId", js.undefined)
  }
}
