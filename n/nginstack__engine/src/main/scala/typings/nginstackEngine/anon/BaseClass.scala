package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseClass extends StObject {
  
  var baseClass: Double
  
  var forceStrictMode: Boolean
  
  var products: js.Array[Double]
}
object BaseClass {
  
  inline def apply(baseClass: Double, forceStrictMode: Boolean, products: js.Array[Double]): BaseClass = {
    val __obj = js.Dynamic.literal(baseClass = baseClass.asInstanceOf[js.Any], forceStrictMode = forceStrictMode.asInstanceOf[js.Any], products = products.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseClass]
  }
  
  extension [Self <: BaseClass](x: Self) {
    
    inline def setBaseClass(value: Double): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
    
    inline def setForceStrictMode(value: Boolean): Self = StObject.set(x, "forceStrictMode", value.asInstanceOf[js.Any])
    
    inline def setProducts(value: js.Array[Double]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsVarargs(value: Double*): Self = StObject.set(x, "products", js.Array(value*))
  }
}
