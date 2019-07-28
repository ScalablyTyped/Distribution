package typings.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CollectionChangedAction extends js.Object

@JSImport("node-mysql-wrapper", "CollectionChangedAction")
@js.native
object CollectionChangedAction extends js.Object {
  @js.native
  sealed trait DELETE extends CollectionChangedAction
  
  @js.native
  sealed trait INSERT extends CollectionChangedAction
  
  @js.native
  sealed trait RESET extends CollectionChangedAction
  
  /* 1 */ val DELETE: typings.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod.CollectionChangedAction.DELETE with Double = js.native
  /* 0 */ val INSERT: typings.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod.CollectionChangedAction.INSERT with Double = js.native
  /* 2 */ val RESET: typings.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod.CollectionChangedAction.RESET with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CollectionChangedAction with Double] = js.native
}

