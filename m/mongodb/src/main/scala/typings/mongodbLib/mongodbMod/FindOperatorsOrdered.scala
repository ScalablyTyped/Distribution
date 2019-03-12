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

object FindOperatorsOrdered {
  @scala.inline
  def apply(
    delete: () => OrderedBulkOperation,
    deleteOne: () => OrderedBulkOperation,
    replaceOne: js.Object => OrderedBulkOperation,
    update: js.Object => OrderedBulkOperation,
    updateOne: js.Object => OrderedBulkOperation,
    upsert: () => FindOperatorsOrdered
  ): FindOperatorsOrdered = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteOne = js.Any.fromFunction0(deleteOne), replaceOne = js.Any.fromFunction1(replaceOne), update = js.Any.fromFunction1(update), updateOne = js.Any.fromFunction1(updateOne), upsert = js.Any.fromFunction0(upsert))
  
    __obj.asInstanceOf[FindOperatorsOrdered]
  }
}

