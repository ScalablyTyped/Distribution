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

