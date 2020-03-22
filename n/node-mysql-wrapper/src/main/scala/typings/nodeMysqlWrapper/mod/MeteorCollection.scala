package typings.nodeMysqlWrapper.mod

import typings.nodeMysqlWrapper.AnonFetch
import typings.nodeMysqlWrapper.AnonFields
import typings.nodeMysqlWrapper.AnonReactive
import typings.nodeMysqlWrapper.Mongo.Collection
import typings.nodeMysqlWrapper.Mongo.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "MeteorCollection")
@js.native
class MeteorCollection[T] protected () extends js.Object {
  def this(table: Table[T]) = this()
  def this(table: Table[T], name: String) = this()
  var collection: Collection[T] = js.native
  var rawCollection: Collection[T] = js.native
  var table: Table[T] = js.native
  //ONLY MONGO/METEOR COLLECTION METHODS START
  def allow(options: AnonFetch[T]): Boolean = js.native
  def deny(options: AnonFetch[T]): Boolean = js.native
  def fill(criteriaRawJsObject: js.Any): Unit = js.native
  def fillAll(): Unit = js.native
  def fillOne(criteriaRawJsObject: js.Any): Unit = js.native
  def find(): Cursor[T] = js.native
  def find(selector: js.Any): Cursor[T] = js.native
  def find(selector: js.Any, options: AnonFields): Cursor[T] = js.native
  def findOne(): T = js.native
  def findOne(selector: js.Any): T = js.native
  def findOne(selector: js.Any, options: AnonReactive): T = js.native
  def startListeningToDatabase(): Unit = js.native
}

