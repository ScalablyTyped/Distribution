package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientSession
  extends nodeLib.eventsMod.EventEmitter {
  /** The server id associated with this session */
  var id: js.Any = js.native
  /**
    * Aborts the currently active transaction in this session.
    * @param cb Optional callback for completion of this operation
    */
  def abortTransaction(): js.Promise[scala.Unit] = js.native
  def abortTransaction(cb: MongoCallback[scala.Unit]): js.Promise[scala.Unit] = js.native
  /**
    * Advances the operationTime for a ClientSession.
    */
  def advanceOperationTime(operamtionTime: bsonLib.bsonMod.Timestamp): scala.Unit = js.native
  /**
    * Commits the currently active transaction in this session.
    * @param cb Optional callback for completion of this operation
    */
  def commitTransaction(): js.Promise[scala.Unit] = js.native
  def commitTransaction(cb: MongoCallback[scala.Unit]): js.Promise[scala.Unit] = js.native
  /**
    * Ends this session on the server
    * @param cb Optional callback for completion of this operation
    */
  def endSession(): scala.Unit = js.native
  def endSession(cb: MongoCallback[scala.Unit]): scala.Unit = js.native
  /**
    * Ends this session on the server
    * @param options Optional settings. Currently reserved for future use
    * @param cb Optional callback for completion of this operation
    */
  def endSession(options: js.Any): scala.Unit = js.native
  def endSession(options: js.Any, cb: MongoCallback[scala.Unit]): scala.Unit = js.native
  /**
    * Used to determine if this session equals another
    *
    * @param session A class representing a client session on the server
    * @returns Whether the sessions are equal
    */
  def equals(session: ClientSession): scala.Boolean = js.native
  /**
    * @returns Whether this session is currently in a transaction or not
    */
  def inTransaction(): scala.Boolean = js.native
  /** Increment the transaction number on the internal ServerSession */
  def incrementTransactionNumber(): scala.Unit = js.native
  /**
    * Starts a new transaction with the given options.
    */
  def startTransaction(): scala.Unit = js.native
  def startTransaction(options: TransactionOptions): scala.Unit = js.native
}

