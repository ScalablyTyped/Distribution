package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddProductToProductSetRequest extends StObject {
  
  /** Required. The resource name for the Product to be added to this ProductSet. Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID` */
  var product: js.UndefOr[String] = js.undefined
}
object AddProductToProductSetRequest {
  
  @scala.inline
  def apply(): AddProductToProductSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddProductToProductSetRequest]
  }
  
  @scala.inline
  implicit class AddProductToProductSetRequestMutableBuilder[Self <: AddProductToProductSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
  }
}
