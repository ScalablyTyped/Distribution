package typings.nginstackEngine.anon

import typings.nginstackEngine.libSecurityPermissionManagerMod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resources extends StObject {
  
  var resources: js.Array[Double]
  
  var transaction: Transaction
}
object Resources {
  
  inline def apply(resources: js.Array[Double], transaction: Transaction): Resources = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resources]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Resources] (val x: Self) extends AnyVal {
    
    inline def setResources(value: js.Array[Double]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: Double*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
