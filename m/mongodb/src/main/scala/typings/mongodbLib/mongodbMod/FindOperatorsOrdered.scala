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
    delete: js.Function0[OrderedBulkOperation],
    deleteOne: js.Function0[OrderedBulkOperation],
    replaceOne: js.Function1[js.Object, OrderedBulkOperation],
    update: js.Function1[js.Object, OrderedBulkOperation],
    updateOne: js.Function1[js.Object, OrderedBulkOperation],
    upsert: js.Function0[FindOperatorsOrdered]
  ): FindOperatorsOrdered = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("deleteOne")(deleteOne)
    __obj.updateDynamic("replaceOne")(replaceOne)
    __obj.updateDynamic("update")(update)
    __obj.updateDynamic("updateOne")(updateOne)
    __obj.updateDynamic("upsert")(upsert)
    __obj.asInstanceOf[FindOperatorsOrdered]
  }
}

