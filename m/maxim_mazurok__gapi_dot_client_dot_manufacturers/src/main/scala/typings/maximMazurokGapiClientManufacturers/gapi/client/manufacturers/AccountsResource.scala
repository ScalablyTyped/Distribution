package typings.maximMazurokGapiClientManufacturers.gapi.client.manufacturers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountsResource extends StObject {
  
  var products: ProductsResource
}
object AccountsResource {
  
  inline def apply(products: ProductsResource): AccountsResource = {
    val __obj = js.Dynamic.literal(products = products.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsResource]
  }
  
  extension [Self <: AccountsResource](x: Self) {
    
    inline def setProducts(value: ProductsResource): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
  }
}
