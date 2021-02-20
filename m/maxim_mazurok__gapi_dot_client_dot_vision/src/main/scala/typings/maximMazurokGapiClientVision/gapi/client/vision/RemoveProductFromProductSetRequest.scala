package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveProductFromProductSetRequest extends StObject {
  
  /** Required. The resource name for the Product to be removed from this ProductSet. Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID` */
  var product: js.UndefOr[String] = js.native
}
object RemoveProductFromProductSetRequest {
  
  @scala.inline
  def apply(): RemoveProductFromProductSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveProductFromProductSetRequest]
  }
  
  @scala.inline
  implicit class RemoveProductFromProductSetRequestMutableBuilder[Self <: RemoveProductFromProductSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
  }
}
