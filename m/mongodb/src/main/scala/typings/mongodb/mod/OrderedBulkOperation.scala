package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderedBulkOperation extends js.Object {
  var length: scala.Double = js.native
  def execute(): js.Promise[BulkWriteResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/OrderedBulkOperation.html#execute */
  def execute(callback: MongoCallback[BulkWriteResult]): Unit = js.native
  def execute(options: FSyncOptions): js.Promise[BulkWriteResult] = js.native
  def execute(options: FSyncOptions, callback: MongoCallback[BulkWriteResult]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/OrderedBulkOperation.html#find */
  def find(selector: js.Object): FindOperatorsOrdered = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/OrderedBulkOperation.html#insert */
  def insert(doc: js.Object): OrderedBulkOperation = js.native
}

