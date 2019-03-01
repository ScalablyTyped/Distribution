package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOperatorsUnordered extends js.Object {
  var length: scala.Double
  def remove(): UnorderedBulkOperation
  def removeOne(): UnorderedBulkOperation
  def replaceOne(doc: js.Object): UnorderedBulkOperation
  def update(doc: js.Object): UnorderedBulkOperation
  def updateOne(doc: js.Object): UnorderedBulkOperation
  def upsert(): FindOperatorsUnordered
}

object FindOperatorsUnordered {
  @scala.inline
  def apply(
    length: scala.Double,
    remove: js.Function0[UnorderedBulkOperation],
    removeOne: js.Function0[UnorderedBulkOperation],
    replaceOne: js.Function1[js.Object, UnorderedBulkOperation],
    update: js.Function1[js.Object, UnorderedBulkOperation],
    updateOne: js.Function1[js.Object, UnorderedBulkOperation],
    upsert: js.Function0[FindOperatorsUnordered]
  ): FindOperatorsUnordered = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("removeOne")(removeOne)
    __obj.updateDynamic("replaceOne")(replaceOne)
    __obj.updateDynamic("update")(update)
    __obj.updateDynamic("updateOne")(updateOne)
    __obj.updateDynamic("upsert")(upsert)
    __obj.asInstanceOf[FindOperatorsUnordered]
  }
}

