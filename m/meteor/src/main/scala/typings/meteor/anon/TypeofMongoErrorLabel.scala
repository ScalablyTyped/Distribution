package typings.meteor.anon

import typings.meteor.meteorStrings.HandshakeError
import typings.meteor.meteorStrings.NoWritesPerformed
import typings.meteor.meteorStrings.ResetPool
import typings.meteor.meteorStrings.ResumableChangeStreamError
import typings.meteor.meteorStrings.RetryableWriteError
import typings.meteor.meteorStrings.TransientTransactionError
import typings.meteor.meteorStrings.UnknownTransactionCommitResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMongoErrorLabel extends StObject {
  
  val HandshakeError: typings.meteor.meteorStrings.HandshakeError
  
  val NoWritesPerformed: typings.meteor.meteorStrings.NoWritesPerformed
  
  val ResetPool: typings.meteor.meteorStrings.ResetPool
  
  val ResumableChangeStreamError: typings.meteor.meteorStrings.ResumableChangeStreamError
  
  val RetryableWriteError: typings.meteor.meteorStrings.RetryableWriteError
  
  val TransientTransactionError: typings.meteor.meteorStrings.TransientTransactionError
  
  val UnknownTransactionCommitResult: typings.meteor.meteorStrings.UnknownTransactionCommitResult
}
object TypeofMongoErrorLabel {
  
  inline def apply(): TypeofMongoErrorLabel = {
    val __obj = js.Dynamic.literal(HandshakeError = "HandshakeError", NoWritesPerformed = "NoWritesPerformed", ResetPool = "ResetPool", ResumableChangeStreamError = "ResumableChangeStreamError", RetryableWriteError = "RetryableWriteError", TransientTransactionError = "TransientTransactionError", UnknownTransactionCommitResult = "UnknownTransactionCommitResult")
    __obj.asInstanceOf[TypeofMongoErrorLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofMongoErrorLabel] (val x: Self) extends AnyVal {
    
    inline def setHandshakeError(value: HandshakeError): Self = StObject.set(x, "HandshakeError", value.asInstanceOf[js.Any])
    
    inline def setNoWritesPerformed(value: NoWritesPerformed): Self = StObject.set(x, "NoWritesPerformed", value.asInstanceOf[js.Any])
    
    inline def setResetPool(value: ResetPool): Self = StObject.set(x, "ResetPool", value.asInstanceOf[js.Any])
    
    inline def setResumableChangeStreamError(value: ResumableChangeStreamError): Self = StObject.set(x, "ResumableChangeStreamError", value.asInstanceOf[js.Any])
    
    inline def setRetryableWriteError(value: RetryableWriteError): Self = StObject.set(x, "RetryableWriteError", value.asInstanceOf[js.Any])
    
    inline def setTransientTransactionError(value: TransientTransactionError): Self = StObject.set(x, "TransientTransactionError", value.asInstanceOf[js.Any])
    
    inline def setUnknownTransactionCommitResult(value: UnknownTransactionCommitResult): Self = StObject.set(x, "UnknownTransactionCommitResult", value.asInstanceOf[js.Any])
  }
}
