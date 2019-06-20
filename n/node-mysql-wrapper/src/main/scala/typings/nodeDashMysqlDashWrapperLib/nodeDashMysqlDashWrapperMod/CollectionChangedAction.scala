package typings
package nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CollectionChangedAction extends js.Object

@JSImport("node-mysql-wrapper", "CollectionChangedAction")
@js.native
object CollectionChangedAction extends js.Object {
  @js.native
  sealed trait DELETE
    extends nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod.CollectionChangedAction
  
  @js.native
  sealed trait INSERT
    extends nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod.CollectionChangedAction
  
  @js.native
  sealed trait RESET
    extends nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod.CollectionChangedAction
  
  /* 1 */ val DELETE: DELETE with scala.Double = js.native
  /* 0 */ val INSERT: INSERT with scala.Double = js.native
  /* 2 */ val RESET: RESET with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod.CollectionChangedAction with scala.Double
  ] = js.native
}

