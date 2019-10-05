package typings.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod

import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "DeleteQuery")
@js.native
class DeleteQuery[T] protected () extends IQuery[T] {
  def this(_table: Table[T]) = this()
  def execute(criteriaOrID: String): ^[DeleteAnswer] = js.native
  def execute(criteriaOrID: String, callback: js.Function1[/* _result */ DeleteAnswer, _]): ^[DeleteAnswer] = js.native
  def execute(criteriaOrID: Double): ^[DeleteAnswer] = js.native
  def execute(criteriaOrID: Double, callback: js.Function1[/* _result */ DeleteAnswer, _]): ^[DeleteAnswer] = js.native
}

