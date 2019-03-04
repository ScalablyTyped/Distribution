package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkWriteResult extends js.Object {
  var nInserted: scala.Double
  var nModified: scala.Double
  var nRemoved: scala.Double
  var nUpdated: scala.Double
  var nUpserted: scala.Double
  var ok: scala.Double
  def getInsertedIds(): js.Array[js.Object]
  def getLastOp(): js.Object
  def getRawResponse(): js.Object
  def getUpsertedIdAt(index: scala.Double): js.Object
  def getUpsertedIds(): js.Array[js.Object]
  def getWriteConcernError(): WriteConcernError
  def getWriteErrorAt(index: scala.Double): WriteError
  def getWriteErrorCount(): scala.Double
  def getWriteErrors(): js.Array[js.Object]
  def hasWriteErrors(): scala.Boolean
}

object BulkWriteResult {
  @scala.inline
  def apply(
    getInsertedIds: js.Function0[js.Array[js.Object]],
    getLastOp: js.Function0[js.Object],
    getRawResponse: js.Function0[js.Object],
    getUpsertedIdAt: js.Function1[scala.Double, js.Object],
    getUpsertedIds: js.Function0[js.Array[js.Object]],
    getWriteConcernError: js.Function0[WriteConcernError],
    getWriteErrorAt: js.Function1[scala.Double, WriteError],
    getWriteErrorCount: js.Function0[scala.Double],
    getWriteErrors: js.Function0[js.Array[js.Object]],
    hasWriteErrors: js.Function0[scala.Boolean],
    nInserted: scala.Double,
    nModified: scala.Double,
    nRemoved: scala.Double,
    nUpdated: scala.Double,
    nUpserted: scala.Double,
    ok: scala.Double
  ): BulkWriteResult = {
    val __obj = js.Dynamic.literal(getInsertedIds = getInsertedIds, getLastOp = getLastOp, getRawResponse = getRawResponse, getUpsertedIdAt = getUpsertedIdAt, getUpsertedIds = getUpsertedIds, getWriteConcernError = getWriteConcernError, getWriteErrorAt = getWriteErrorAt, getWriteErrorCount = getWriteErrorCount, getWriteErrors = getWriteErrors, hasWriteErrors = hasWriteErrors, nInserted = nInserted, nModified = nModified, nRemoved = nRemoved, nUpdated = nUpdated, nUpserted = nUpserted, ok = ok)
  
    __obj.asInstanceOf[BulkWriteResult]
  }
}

