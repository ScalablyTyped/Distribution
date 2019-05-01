package typings
package nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "DeleteQuery")
@js.native
class DeleteQuery[T] protected () extends IQuery[T] {
  def this(_table: Table[T]) = this()
  def execute(criteriaOrID: java.lang.String): bluebirdLib.bluebirdMod.^[DeleteAnswer] = js.native
  def execute(criteriaOrID: java.lang.String, callback: js.Function1[/* _result */ DeleteAnswer, _]): bluebirdLib.bluebirdMod.^[DeleteAnswer] = js.native
  def execute(criteriaOrID: scala.Double): bluebirdLib.bluebirdMod.^[DeleteAnswer] = js.native
  def execute(criteriaOrID: scala.Double, callback: js.Function1[/* _result */ DeleteAnswer, _]): bluebirdLib.bluebirdMod.^[DeleteAnswer] = js.native
}

