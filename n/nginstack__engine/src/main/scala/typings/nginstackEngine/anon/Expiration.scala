package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expiration extends StObject {
  
  var expiration: js.Date
  
  var extensions: Double | js.Array[Double]
  
  var licenseType: String
  
  var licenseVersion: js.UndefOr[Double] = js.undefined
  
  var licenseeId: String
  
  var licenseeName: String
  
  var licenserKey: js.UndefOr[Double] = js.undefined
  
  var product: Double
  
  var quantity: Double
}
object Expiration {
  
  inline def apply(
    expiration: js.Date,
    extensions: Double | js.Array[Double],
    licenseType: String,
    licenseeId: String,
    licenseeName: String,
    product: Double,
    quantity: Double
  ): Expiration = {
    val __obj = js.Dynamic.literal(expiration = expiration.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], licenseType = licenseType.asInstanceOf[js.Any], licenseeId = licenseeId.asInstanceOf[js.Any], licenseeName = licenseeName.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expiration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Expiration] (val x: Self) extends AnyVal {
    
    inline def setExpiration(value: js.Date): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExtensions(value: Double | js.Array[Double]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsVarargs(value: Double*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setLicenseType(value: String): Self = StObject.set(x, "licenseType", value.asInstanceOf[js.Any])
    
    inline def setLicenseVersion(value: Double): Self = StObject.set(x, "licenseVersion", value.asInstanceOf[js.Any])
    
    inline def setLicenseVersionUndefined: Self = StObject.set(x, "licenseVersion", js.undefined)
    
    inline def setLicenseeId(value: String): Self = StObject.set(x, "licenseeId", value.asInstanceOf[js.Any])
    
    inline def setLicenseeName(value: String): Self = StObject.set(x, "licenseeName", value.asInstanceOf[js.Any])
    
    inline def setLicenserKey(value: Double): Self = StObject.set(x, "licenserKey", value.asInstanceOf[js.Any])
    
    inline def setLicenserKeyUndefined: Self = StObject.set(x, "licenserKey", js.undefined)
    
    inline def setProduct(value: Double): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
  }
}
