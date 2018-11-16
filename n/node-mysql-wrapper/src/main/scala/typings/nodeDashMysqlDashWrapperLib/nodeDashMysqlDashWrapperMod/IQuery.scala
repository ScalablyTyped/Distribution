package typings
package nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQuery[T] extends js.Object {
  var _table: Table[T] = js.native
  def execute(rawCriteria: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def execute(rawCriteria: js.Any, callback: js.Function1[/* _results */ js.Any, _]): bluebirdLib.bluebirdMod.namespaced[_] = js.native
}

