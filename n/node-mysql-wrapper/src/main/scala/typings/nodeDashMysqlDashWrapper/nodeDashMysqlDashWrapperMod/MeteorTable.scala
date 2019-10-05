package typings.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod

import typings.nodeDashMysqlDashWrapper.Anon_Multi
import typings.nodeDashMysqlDashWrapper.Mongo.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "MeteorTable")
@js.native
class MeteorTable[T] protected () extends js.Object {
  def this(table: Table[T]) = this()
  var table: Table[T] = js.native
  def collection(): Collection[T] = js.native
  def collection(nameOfCollection: String): Collection[T] = js.native
  def collection(nameOfCollection: String, fillWithCriteria: js.Any): Collection[T] = js.native
  def insert(doc: T): T = js.native
  def insert(doc: T, callback: js.Function1[/* _result */ T, Unit]): T = js.native
  def remove(selector: js.Any): DeleteAnswer = js.native
  def remove(selector: js.Any, callback: js.Function0[DeleteAnswer]): DeleteAnswer = js.native
  def update(selector: js.Any, modifier: js.Any): Double = js.native
  def update(selector: js.Any, modifier: js.Any, options: Anon_Multi): Double = js.native
  def update(selector: js.Any, modifier: js.Any, options: Anon_Multi, callback: js.Function1[/* result */ T, _]): Double = js.native
}

