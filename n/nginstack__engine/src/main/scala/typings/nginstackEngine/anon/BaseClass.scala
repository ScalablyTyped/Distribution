package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseClass extends StObject {
  
  var baseClass: Double
  
  var products: js.Array[Double]
}
object BaseClass {
  
  inline def apply(baseClass: Double, products: js.Array[Double]): BaseClass = {
    val __obj = js.Dynamic.literal(baseClass = baseClass.asInstanceOf[js.Any], products = products.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseClass]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseClass] (val x: Self) extends AnyVal {
    
    inline def setBaseClass(value: Double): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
    
    inline def setProducts(value: js.Array[Double]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsVarargs(value: Double*): Self = StObject.set(x, "products", js.Array(value*))
  }
}
