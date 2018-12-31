package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOperatorsOrdered extends js.Object {
  def delete(): OrderedBulkOperation
  def deleteOne(): OrderedBulkOperation
  def replaceOne(doc: js.Object): OrderedBulkOperation
  def update(doc: js.Object): OrderedBulkOperation
  def updateOne(doc: js.Object): OrderedBulkOperation
  def upsert(): FindOperatorsOrdered
}

