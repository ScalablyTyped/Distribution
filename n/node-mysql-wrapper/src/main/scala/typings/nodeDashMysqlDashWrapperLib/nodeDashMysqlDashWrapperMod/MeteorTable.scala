package typings
package nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "MeteorTable")
@js.native
class MeteorTable[T] protected () extends js.Object {
  def this(table: Table[T]) = this()
  var table: Table[T] = js.native
  def collection(): nodeDashMysqlDashWrapperLib.MongoNs.Collection[T] = js.native
  def collection(nameOfCollection: java.lang.String): nodeDashMysqlDashWrapperLib.MongoNs.Collection[T] = js.native
  def collection(nameOfCollection: java.lang.String, fillWithCriteria: js.Any): nodeDashMysqlDashWrapperLib.MongoNs.Collection[T] = js.native
  def insert(doc: T): T = js.native
  def insert(doc: T, callback: js.Function1[/* _result */ T, scala.Unit]): T = js.native
  def remove(selector: js.Any): nodeDashMysqlDashWrapperLib.DeleteAnswer = js.native
  def remove(selector: js.Any, callback: js.Function0[nodeDashMysqlDashWrapperLib.DeleteAnswer]): nodeDashMysqlDashWrapperLib.DeleteAnswer = js.native
  def update(selector: js.Any, modifier: js.Any): scala.Double = js.native
  def update(selector: js.Any, modifier: js.Any, options: nodeDashMysqlDashWrapperLib.Anon_Multi): scala.Double = js.native
  def update(
    selector: js.Any,
    modifier: js.Any,
    options: nodeDashMysqlDashWrapperLib.Anon_Multi,
    callback: js.Function1[/* result */ T, _]
  ): scala.Double = js.native
}

