package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extension extends StObject {
  
  var `extension`: js.UndefOr[Double] = js.undefined
  
  var licensedProducts: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var licenseeId: js.UndefOr[String] = js.undefined
  
  var licenseeName: js.UndefOr[String] = js.undefined
  
  var licenserKey: js.UndefOr[Double] = js.undefined
  
  var product: Double
}
object Extension {
  
  inline def apply(product: Double): Extension = {
    val __obj = js.Dynamic.literal(product = product.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Extension] (val x: Self) extends AnyVal {
    
    inline def setExtension(value: Double): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setLicensedProducts(value: Double | js.Array[Double]): Self = StObject.set(x, "licensedProducts", value.asInstanceOf[js.Any])
    
    inline def setLicensedProductsUndefined: Self = StObject.set(x, "licensedProducts", js.undefined)
    
    inline def setLicensedProductsVarargs(value: Double*): Self = StObject.set(x, "licensedProducts", js.Array(value*))
    
    inline def setLicenseeId(value: String): Self = StObject.set(x, "licenseeId", value.asInstanceOf[js.Any])
    
    inline def setLicenseeIdUndefined: Self = StObject.set(x, "licenseeId", js.undefined)
    
    inline def setLicenseeName(value: String): Self = StObject.set(x, "licenseeName", value.asInstanceOf[js.Any])
    
    inline def setLicenseeNameUndefined: Self = StObject.set(x, "licenseeName", js.undefined)
    
    inline def setLicenserKey(value: Double): Self = StObject.set(x, "licenserKey", value.asInstanceOf[js.Any])
    
    inline def setLicenserKeyUndefined: Self = StObject.set(x, "licenserKey", js.undefined)
    
    inline def setProduct(value: Double): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
  }
}
