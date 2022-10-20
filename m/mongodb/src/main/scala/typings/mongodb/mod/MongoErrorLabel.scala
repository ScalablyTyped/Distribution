package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mongodbStrings.TransientTransactionError
  - typings.mongodb.mongodbStrings.ResetPool
  - typings.mongodb.mongodbStrings.ResumableChangeStreamError
  - typings.mongodb.mongodbStrings.RetryableWriteError
  - typings.mongodb.mongodbStrings.NoWritesPerformed
  - typings.mongodb.mongodbStrings.UnknownTransactionCommitResult
  - typings.mongodb.mongodbStrings.HandshakeError
*/
trait MongoErrorLabel extends StObject
/* Inlined std.Readonly<{ readonly RetryableWriteError :'RetryableWriteError',  readonly TransientTransactionError :'TransientTransactionError',  readonly UnknownTransactionCommitResult :'UnknownTransactionCommitResult',  readonly ResumableChangeStreamError :'ResumableChangeStreamError',  readonly HandshakeError :'HandshakeError',  readonly ResetPool :'ResetPool',  readonly NoWritesPerformed :'NoWritesPerformed'}> */
object MongoErrorLabel {
  
  @JSImport("mongodb", "MongoErrorLabel.HandshakeError")
  @js.native
  val HandshakeError: typings.mongodb.mongodbStrings.HandshakeError = js.native
  
  @JSImport("mongodb", "MongoErrorLabel.NoWritesPerformed")
  @js.native
  val NoWritesPerformed: typings.mongodb.mongodbStrings.NoWritesPerformed = js.native
  
  @JSImport("mongodb", "MongoErrorLabel.ResetPool")
  @js.native
  val ResetPool: typings.mongodb.mongodbStrings.ResetPool = js.native
  
  @JSImport("mongodb", "MongoErrorLabel.ResumableChangeStreamError")
  @js.native
  val ResumableChangeStreamError: typings.mongodb.mongodbStrings.ResumableChangeStreamError = js.native
  
  @JSImport("mongodb", "MongoErrorLabel.RetryableWriteError")
  @js.native
  val RetryableWriteError: typings.mongodb.mongodbStrings.RetryableWriteError = js.native
  
  @JSImport("mongodb", "MongoErrorLabel.TransientTransactionError")
  @js.native
  val TransientTransactionError: typings.mongodb.mongodbStrings.TransientTransactionError = js.native
  
  @JSImport("mongodb", "MongoErrorLabel.UnknownTransactionCommitResult")
  @js.native
  val UnknownTransactionCommitResult: typings.mongodb.mongodbStrings.UnknownTransactionCommitResult = js.native
}
