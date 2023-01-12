package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bitlocker
  extends StObject
     with Entity {
  
  // The recovery keys associated with the bitlocker entity.
  var recoveryKeys: js.UndefOr[NullableOption[js.Array[BitlockerRecoveryKey]]] = js.undefined
}
object Bitlocker {
  
  inline def apply(): Bitlocker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bitlocker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bitlocker] (val x: Self) extends AnyVal {
    
    inline def setRecoveryKeys(value: NullableOption[js.Array[BitlockerRecoveryKey]]): Self = StObject.set(x, "recoveryKeys", value.asInstanceOf[js.Any])
    
    inline def setRecoveryKeysNull: Self = StObject.set(x, "recoveryKeys", null)
    
    inline def setRecoveryKeysUndefined: Self = StObject.set(x, "recoveryKeys", js.undefined)
    
    inline def setRecoveryKeysVarargs(value: BitlockerRecoveryKey*): Self = StObject.set(x, "recoveryKeys", js.Array(value*))
  }
}
