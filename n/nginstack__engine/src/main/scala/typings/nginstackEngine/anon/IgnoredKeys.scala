package typings.nginstackEngine.anon

import typings.nginstackEngine.libSecurityPermissionManagerMod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoredKeys extends StObject {
  
  var ignoredKeys: js.UndefOr[js.Array[Double]] = js.undefined
  
  var resources: js.UndefOr[js.Array[Double]] = js.undefined
  
  var transaction: js.UndefOr[Transaction] = js.undefined
}
object IgnoredKeys {
  
  inline def apply(): IgnoredKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoredKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgnoredKeys] (val x: Self) extends AnyVal {
    
    inline def setIgnoredKeys(value: js.Array[Double]): Self = StObject.set(x, "ignoredKeys", value.asInstanceOf[js.Any])
    
    inline def setIgnoredKeysUndefined: Self = StObject.set(x, "ignoredKeys", js.undefined)
    
    inline def setIgnoredKeysVarargs(value: Double*): Self = StObject.set(x, "ignoredKeys", js.Array(value*))
    
    inline def setResources(value: js.Array[Double]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: Double*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
