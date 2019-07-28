package typings.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod

import typings.nodeDashMysqlDashWrapper.Anon_Doc
import typings.nodeDashMysqlDashWrapper.Anon_Fields
import typings.nodeDashMysqlDashWrapper.Anon_FieldsReactive
import typings.nodeDashMysqlDashWrapper.MongoNs.Collection
import typings.nodeDashMysqlDashWrapper.MongoNs.Cursor
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
  def allow(options: Anon_Doc[T]): Boolean = js.native
  def deny(options: Anon_Doc[T]): Boolean = js.native
  def fill(criteriaRawJsObject: js.Any): Unit = js.native
  def fillAll(): Unit = js.native
  def fillOne(criteriaRawJsObject: js.Any): Unit = js.native
  def find(): Cursor[T] = js.native
  def find(selector: js.Any): Cursor[T] = js.native
  def find(selector: js.Any, options: Anon_Fields): Cursor[T] = js.native
  def findOne(): T = js.native
  def findOne(selector: js.Any): T = js.native
  def findOne(selector: js.Any, options: Anon_FieldsReactive): T = js.native
  def startListeningToDatabase(): Unit = js.native
}

