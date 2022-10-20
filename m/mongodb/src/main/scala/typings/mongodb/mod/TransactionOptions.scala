package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionOptions
  extends StObject
     with CommandOperationOptions {
  
  /** Specifies the maximum amount of time to allow a commit action on a transaction to run in milliseconds */
  var maxCommitTimeMS: js.UndefOr[scala.Double] = js.undefined
  
  /** A default writeConcern for commands in this transaction */
  @JSName("writeConcern")
  var writeConcern_TransactionOptions: js.UndefOr[WriteConcern] = js.undefined
}
object TransactionOptions {
  
  inline def apply(): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionOptions]
  }
  
  extension [Self <: TransactionOptions](x: Self) {
    
    inline def setMaxCommitTimeMS(value: scala.Double): Self = StObject.set(x, "maxCommitTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxCommitTimeMSUndefined: Self = StObject.set(x, "maxCommitTimeMS", js.undefined)
    
    inline def setWriteConcern(value: WriteConcern): Self = StObject.set(x, "writeConcern", value.asInstanceOf[js.Any])
    
    inline def setWriteConcernUndefined: Self = StObject.set(x, "writeConcern", js.undefined)
  }
}
