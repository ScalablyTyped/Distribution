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

