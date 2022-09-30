package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientSessionOptions extends StObject {
  
  /** Whether causal consistency should be enabled on this session */
  var causalConsistency: js.UndefOr[Boolean] = js.undefined
  
  /** The default TransactionOptions to use for transactions started on this session. */
  var defaultTransactionOptions: js.UndefOr[TransactionOptions] = js.undefined
  
  /** Whether all read operations should be read from the same snapshot for this session (NOTE: not compatible with `causalConsistency=true`) */
  var snapshot: js.UndefOr[Boolean] = js.undefined
}
object ClientSessionOptions {
  
  inline def apply(): ClientSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSessionOptions]
  }
  
  extension [Self <: ClientSessionOptions](x: Self) {
    
    inline def setCausalConsistency(value: Boolean): Self = StObject.set(x, "causalConsistency", value.asInstanceOf[js.Any])
    
    inline def setCausalConsistencyUndefined: Self = StObject.set(x, "causalConsistency", js.undefined)
    
    inline def setDefaultTransactionOptions(value: TransactionOptions): Self = StObject.set(x, "defaultTransactionOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultTransactionOptionsUndefined: Self = StObject.set(x, "defaultTransactionOptions", js.undefined)
    
    inline def setSnapshot(value: Boolean): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
  }
}
