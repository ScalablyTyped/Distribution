package typings
package nodeDashMysqlDashWrapperLib.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection[T] extends js.Object {
  def _ensureIndex(indexName: java.lang.String): scala.Unit = js.native
  def _ensureIndex(indexName: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def allow(options: nodeDashMysqlDashWrapperLib.Anon_Doc[T]): scala.Boolean = js.native
  def deny(options: nodeDashMysqlDashWrapperLib.Anon_Doc[T]): scala.Boolean = js.native
  def find(): Cursor[T] = js.native
  def find(selector: js.Any): Cursor[T] = js.native
  def find(selector: js.Any, options: nodeDashMysqlDashWrapperLib.Anon_Fields): Cursor[T] = js.native
  def findOne(): T = js.native
  def findOne(selector: js.Any): T = js.native
  def findOne(selector: js.Any, options: nodeDashMysqlDashWrapperLib.Anon_FieldsReactive): T = js.native
  def insert(doc: T): java.lang.String = js.native
  def insert(doc: T, callback: js.Function): java.lang.String = js.native
  def rawCollection(): js.Any = js.native
  def rawDatabase(): js.Any = js.native
  def remove(selector: js.Any): scala.Unit = js.native
  def remove(selector: js.Any, callback: js.Function): scala.Unit = js.native
  def update(selector: js.Any, modifier: js.Any): scala.Double = js.native
  def update(selector: js.Any, modifier: js.Any, options: nodeDashMysqlDashWrapperLib.Anon_Multi): scala.Double = js.native
  def update(
    selector: js.Any,
    modifier: js.Any,
    options: nodeDashMysqlDashWrapperLib.Anon_Multi,
    callback: js.Function
  ): scala.Double = js.native
  def upsert(selector: js.Any, modifier: js.Any): nodeDashMysqlDashWrapperLib.Anon_InsertedId = js.native
  def upsert(selector: js.Any, modifier: js.Any, options: nodeDashMysqlDashWrapperLib.Anon_MultiBoolean): nodeDashMysqlDashWrapperLib.Anon_InsertedId = js.native
  def upsert(
    selector: js.Any,
    modifier: js.Any,
    options: nodeDashMysqlDashWrapperLib.Anon_MultiBoolean,
    callback: js.Function
  ): nodeDashMysqlDashWrapperLib.Anon_InsertedId = js.native
}

@JSGlobal("Mongo.Collection")
@js.native
class CollectionCls[T] protected () extends Collection[T] {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, options: nodeDashMysqlDashWrapperLib.Anon_Connection) = this()
}

