package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.anon.CausalConsistency
import typings.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "ClientSession")
@js.native
open class ClientSession () extends TypedEventEmitter[ClientSessionEvents] {
  def this(options: EventEmitterOptions) = this()
  
  /**
    * Aborts the currently active transaction in this session.
    *
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def abortTransaction(): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def abortTransaction(callback: Callback[Document]): Unit = js.native
  
  /**
    * Advances the clusterTime for a ClientSession to the provided clusterTime of another ClientSession
    *
    * @param clusterTime - the $clusterTime returned by the server from another session in the form of a document containing the `BSON.Timestamp` clusterTime and signature
    */
  def advanceClusterTime(clusterTime: ClusterTime): Unit = js.native
  
  /**
    * Advances the operationTime for a ClientSession.
    *
    * @param operationTime - the `BSON.Timestamp` of the operation type it is desired to advance to
    */
  def advanceOperationTime(operationTime: typings.bson.mod.Timestamp): Unit = js.native
  
  var clientOptions: js.UndefOr[MongoOptions] = js.native
  
  var clusterTime: js.UndefOr[ClusterTime] = js.native
  
  /**
    * Commits the currently active transaction in this session.
    *
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def commitTransaction(): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def commitTransaction(callback: Callback[Document]): Unit = js.native
  
  /* Excluded from this release type: owner */
  var defaultTransactionOptions: TransactionOptions = js.native
  
  /**
    * Ends this session on the server
    *
    * @param options - Optional settings. Currently reserved for future use
    * @param callback - Optional callback for completion of this operation
    */
  def endSession(): js.Promise[Unit] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def endSession(callback: Callback[Unit]): Unit = js.native
  def endSession(options: EndSessionOptions): js.Promise[Unit] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def endSession(options: EndSessionOptions, callback: Callback[Unit]): Unit = js.native
  
  /**
    * Used to determine if this session equals another
    *
    * @param session - The session to compare to
    */
  def equals(session: ClientSession): Boolean = js.native
  
  var explicit: Boolean = js.native
  
  /* Excluded from this release type: client */
  /* Excluded from this release type: sessionPool */
  var hasEnded: Boolean = js.native
  
  /* Excluded from this release type: [kServerSession] */
  /* Excluded from this release type: [kSnapshotTime] */
  /* Excluded from this release type: [kSnapshotEnabled] */
  /* Excluded from this release type: [kPinnedConnection] */
  /* Excluded from this release type: [kTxnNumberIncrement] */
  /* Excluded from this release type: __constructor */
  /** The server id associated with this session */
  def id: js.UndefOr[ServerSessionId] = js.native
  
  /** @returns whether this session is currently in a transaction or not */
  def inTransaction(): Boolean = js.native
  
  /**
    * Increment the transaction number on the internal ServerSession
    *
    * @privateRemarks
    * This helper increments a value stored on the client session that will be
    * added to the serverSession's txnNumber upon applying it to a command.
    * This is because the serverSession is lazily acquired after a connection is obtained
    */
  def incrementTransactionNumber(): Unit = js.native
  
  /* Excluded from this release type: pinnedConnection */
  /* Excluded from this release type: pin */
  /* Excluded from this release type: unpin */
  def isPinned: Boolean = js.native
  
  def loadBalanced: Boolean = js.native
  
  var operationTime: js.UndefOr[typings.bson.mod.Timestamp] = js.native
  
  def serverSession: ServerSession = js.native
  
  /** Whether or not this session is configured for snapshot reads */
  def snapshotEnabled: Boolean = js.native
  
  /**
    * Starts a new transaction with the given options.
    *
    * @param options - Options for the transaction
    */
  def startTransaction(): Unit = js.native
  def startTransaction(options: TransactionOptions): Unit = js.native
  
  var supports: CausalConsistency = js.native
  
  /**
    * This is here to ensure that ClientSession is never serialized to BSON.
    */
  def toBSON(): scala.Nothing = js.native
  
  var transaction: Transaction = js.native
  
  /**
    * Runs a provided callback within a transaction, retrying either the commitTransaction operation
    * or entire transaction as needed (and when the error permits) to better ensure that
    * the transaction can complete successfully.
    *
    * **IMPORTANT:** This method requires the user to return a Promise, and `await` all operations.
    * Any callbacks that do not return a Promise will result in undefined behavior.
    *
    * @remarks
    * This function:
    * - Will return the command response from the final commitTransaction if every operation is successful (can be used as a truthy object)
    * - Will return `undefined` if the transaction is explicitly aborted with `await session.abortTransaction()`
    * - Will throw if one of the operations throws or `throw` statement is used inside the `withTransaction` callback
    *
    * Checkout a descriptive example here:
    * @see https://www.mongodb.com/developer/quickstart/node-transactions/
    *
    * @param fn - callback to run within a transaction
    * @param options - optional settings for the transaction
    * @returns A raw command response or undefined
    */
  def withTransaction[T](fn: WithTransactionCallback[T]): js.Promise[js.UndefOr[Document]] = js.native
  def withTransaction[T](fn: WithTransactionCallback[T], options: TransactionOptions): js.Promise[js.UndefOr[Document]] = js.native
}
