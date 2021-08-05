package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionOptions extends StObject {
  
  /**
    * Whether causal consistency should be enabled on this session
    * @default true
    */
  var causalConsistency: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default TransactionOptions to use for transactions started on this session.
    */
  var defaultTransactionOptions: js.UndefOr[TransactionOptions] = js.undefined
}
object SessionOptions {
  
  inline def apply(): SessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionOptions]
  }
  
  extension [Self <: SessionOptions](x: Self) {
    
    inline def setCausalConsistency(value: Boolean): Self = StObject.set(x, "causalConsistency", value.asInstanceOf[js.Any])
    
    inline def setCausalConsistencyUndefined: Self = StObject.set(x, "causalConsistency", js.undefined)
    
    inline def setDefaultTransactionOptions(value: TransactionOptions): Self = StObject.set(x, "defaultTransactionOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultTransactionOptionsUndefined: Self = StObject.set(x, "defaultTransactionOptions", js.undefined)
  }
}
