package typings.nodeDashMysqlDashWrapper.MongoNs

import org.scalablytyped.runtime.StringDictionary
import typings.nodeDashMysqlDashWrapper.Anon_Connection
import typings.nodeDashMysqlDashWrapper.Anon_Doc
import typings.nodeDashMysqlDashWrapper.Anon_Fields
import typings.nodeDashMysqlDashWrapper.Anon_FieldsReactive
import typings.nodeDashMysqlDashWrapper.Anon_InsertedId
import typings.nodeDashMysqlDashWrapper.Anon_Multi
import typings.nodeDashMysqlDashWrapper.Anon_MultiBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection[T] extends js.Object {
  def _ensureIndex(indexName: String): Unit = js.native
  def _ensureIndex(indexName: String, options: StringDictionary[js.Any]): Unit = js.native
  def allow(options: Anon_Doc[T]): Boolean = js.native
  def deny(options: Anon_Doc[T]): Boolean = js.native
  def find(): Cursor[T] = js.native
  def find(selector: js.Any): Cursor[T] = js.native
  def find(selector: js.Any, options: Anon_Fields): Cursor[T] = js.native
  def findOne(): T = js.native
  def findOne(selector: js.Any): T = js.native
  def findOne(selector: js.Any, options: Anon_FieldsReactive): T = js.native
  def insert(doc: T): String = js.native
  def insert(doc: T, callback: js.Function): String = js.native
  def rawCollection(): js.Any = js.native
  def rawDatabase(): js.Any = js.native
  def remove(selector: js.Any): Unit = js.native
  def remove(selector: js.Any, callback: js.Function): Unit = js.native
  def update(selector: js.Any, modifier: js.Any): Double = js.native
  def update(selector: js.Any, modifier: js.Any, options: Anon_Multi): Double = js.native
  def update(selector: js.Any, modifier: js.Any, options: Anon_Multi, callback: js.Function): Double = js.native
  def upsert(selector: js.Any, modifier: js.Any): Anon_InsertedId = js.native
  def upsert(selector: js.Any, modifier: js.Any, options: Anon_MultiBoolean): Anon_InsertedId = js.native
  def upsert(selector: js.Any, modifier: js.Any, options: Anon_MultiBoolean, callback: js.Function): Anon_InsertedId = js.native
}

@JSGlobal("Mongo.Collection")
@js.native
class CollectionCls[T] protected () extends Collection[T] {
  def this(name: String) = this()
  def this(name: String, options: Anon_Connection) = this()
}

