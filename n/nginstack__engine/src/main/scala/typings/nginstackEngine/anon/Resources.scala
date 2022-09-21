package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resources extends StObject {
  
  var resources: js.Array[Double]
  
  var transaction: Any
}
object Resources {
  
  inline def apply(resources: js.Array[Double], transaction: Any): Resources = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resources]
  }
  
  extension [Self <: Resources](x: Self) {
    
    inline def setResources(value: js.Array[Double]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: Double*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setTransaction(value: Any): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
