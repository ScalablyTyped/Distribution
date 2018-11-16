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
  
  val DELETE: DELETE with java.lang.String = js.native
  val INSERT: INSERT with java.lang.String = js.native
  val RESET: RESET with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod.CollectionChangedAction with java.lang.String
  ] = js.native
}

