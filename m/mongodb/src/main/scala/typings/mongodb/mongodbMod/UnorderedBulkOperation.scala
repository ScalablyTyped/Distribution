package typings.mongodb.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnorderedBulkOperation extends js.Object {
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/lib_bulk_unordered.js.html line 339 */
  var length: scala.Double = js.native
  def execute(): js.Promise[BulkWriteResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/UnorderedBulkOperation.html#execute */
  def execute(callback: MongoCallback[BulkWriteResult]): Unit = js.native
  def execute(options: FSyncOptions): js.Promise[BulkWriteResult] = js.native
  def execute(options: FSyncOptions, callback: MongoCallback[BulkWriteResult]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/UnorderedBulkOperation.html#find */
  def find(selector: js.Object): FindOperatorsUnordered = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/UnorderedBulkOperation.html#insert */
  def insert(doc: js.Object): UnorderedBulkOperation = js.native
}

