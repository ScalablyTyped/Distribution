package typings
package nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "MeteorCollection")
@js.native
class MeteorCollection[T] protected () extends js.Object {
  def this(table: Table[T]) = this()
  def this(table: Table[T], name: java.lang.String) = this()
  var collection: nodeDashMysqlDashWrapperLib.MongoNs.Collection[T] = js.native
  var rawCollection: nodeDashMysqlDashWrapperLib.MongoNs.Collection[T] = js.native
  var table: Table[T] = js.native
  //ONLY MONGO/METEOR COLLECTION METHODS START
  def allow(options: nodeDashMysqlDashWrapperLib.Anon_Insert[T]): scala.Boolean = js.native
  def deny(options: nodeDashMysqlDashWrapperLib.Anon_Insert[T]): scala.Boolean = js.native
  def fill(criteriaRawJsObject: js.Any): scala.Unit = js.native
  def fillAll(): scala.Unit = js.native
  def fillOne(criteriaRawJsObject: js.Any): scala.Unit = js.native
  def find(): nodeDashMysqlDashWrapperLib.MongoNs.Cursor[T] = js.native
  def find(selector: js.Any): nodeDashMysqlDashWrapperLib.MongoNs.Cursor[T] = js.native
  def find(selector: js.Any, options: nodeDashMysqlDashWrapperLib.Anon_Reactive): nodeDashMysqlDashWrapperLib.MongoNs.Cursor[T] = js.native
  def findOne(): T = js.native
  def findOne(selector: js.Any): T = js.native
  def findOne(selector: js.Any, options: nodeDashMysqlDashWrapperLib.Anon_ReactiveSkip): T = js.native
  def startListeningToDatabase(): scala.Unit = js.native
}

