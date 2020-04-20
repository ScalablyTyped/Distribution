package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkWriteResult extends js.Object {
  /**
    * The number of documents inserted, excluding upserted documents.
    *
    * @see {@link nUpserted} for the number of documents inserted through an upsert.
    */
  var nInserted: scala.Double
  /**
    * The number of documents selected for update.
    *
    * If the update operation results in no change to the document,
    * e.g. `$set` expression updates the value to the current value,
    * {@link nMatched} can be greater than {@link nModified}.
    */
  var nMatched: scala.Double
  /**
    * The number of existing documents updated.
    *
    * If the update/replacement operation results in no change to the document,
    * such as setting the value of the field to its current value,
    * {@link nModified} can be less than {@link nMatched}
    */
  var nModified: scala.Double
  /**
    * The number of documents removed.
    */
  var nRemoved: scala.Double
  /**
    * The number of documents inserted by an
    * [upsert]{@link https://docs.mongodb.com/manual/reference/method/db.collection.update/#upsert-parameter}.
    */
  var nUpserted: scala.Double
  /**
    * Evaluates to `true` if the bulk operation correctly executes
    */
  var ok: Boolean
  // Returns an array of all inserted ids
  def getInsertedIds(): js.Array[js.Object]
  // Retrieve lastOp if available
  def getLastOp(): js.Object
  // Returns raw internal result
  def getRawResponse(): js.Object
  /**
    * Returns the upserted id at the given index
    * @param index the number of the upserted id to return, returns `undefined` if no result for passed in index
    */
  def getUpsertedIdAt(index: scala.Double): BulkWriteResultUpsertedIdObject
  // Returns an array of all upserted ids
  def getUpsertedIds(): js.Array[BulkWriteResultUpsertedIdObject]
  // Retrieve the write concern error if any
  def getWriteConcernError(): WriteConcernError
  /**
    * Returns a specific write error object
    * @param index of the write error to return, returns `null` if there is no result for passed in index
    */
  def getWriteErrorAt(index: scala.Double): WriteError
  // Returns the number of write errors off the bulk operation
  def getWriteErrorCount(): scala.Double
  // Retrieve all write errors
  def getWriteErrors(): js.Array[js.Object]
  // Returns `true` if the bulk operation contains a write error
  def hasWriteErrors(): Boolean
}

object BulkWriteResult {
  @scala.inline
  def apply(
    getInsertedIds: () => js.Array[js.Object],
    getLastOp: () => js.Object,
    getRawResponse: () => js.Object,
    getUpsertedIdAt: scala.Double => BulkWriteResultUpsertedIdObject,
    getUpsertedIds: () => js.Array[BulkWriteResultUpsertedIdObject],
    getWriteConcernError: () => WriteConcernError,
    getWriteErrorAt: scala.Double => WriteError,
    getWriteErrorCount: () => scala.Double,
    getWriteErrors: () => js.Array[js.Object],
    hasWriteErrors: () => Boolean,
    nInserted: scala.Double,
    nMatched: scala.Double,
    nModified: scala.Double,
    nRemoved: scala.Double,
    nUpserted: scala.Double,
    ok: Boolean
  ): BulkWriteResult = {
    val __obj = js.Dynamic.literal(getInsertedIds = js.Any.fromFunction0(getInsertedIds), getLastOp = js.Any.fromFunction0(getLastOp), getRawResponse = js.Any.fromFunction0(getRawResponse), getUpsertedIdAt = js.Any.fromFunction1(getUpsertedIdAt), getUpsertedIds = js.Any.fromFunction0(getUpsertedIds), getWriteConcernError = js.Any.fromFunction0(getWriteConcernError), getWriteErrorAt = js.Any.fromFunction1(getWriteErrorAt), getWriteErrorCount = js.Any.fromFunction0(getWriteErrorCount), getWriteErrors = js.Any.fromFunction0(getWriteErrors), hasWriteErrors = js.Any.fromFunction0(hasWriteErrors), nInserted = nInserted.asInstanceOf[js.Any], nMatched = nMatched.asInstanceOf[js.Any], nModified = nModified.asInstanceOf[js.Any], nRemoved = nRemoved.asInstanceOf[js.Any], nUpserted = nUpserted.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteResult]
  }
}

