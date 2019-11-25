package typings.mongodb.mongodbMod

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
    remove: () => UnorderedBulkOperation,
    removeOne: () => UnorderedBulkOperation,
    replaceOne: js.Object => UnorderedBulkOperation,
    update: js.Object => UnorderedBulkOperation,
    updateOne: js.Object => UnorderedBulkOperation,
    upsert: () => FindOperatorsUnordered
  ): FindOperatorsUnordered = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), removeOne = js.Any.fromFunction0(removeOne), replaceOne = js.Any.fromFunction1(replaceOne), update = js.Any.fromFunction1(update), updateOne = js.Any.fromFunction1(updateOne), upsert = js.Any.fromFunction0(upsert))
  
    __obj.asInstanceOf[FindOperatorsUnordered]
  }
}

