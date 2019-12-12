package typings.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod

import org.scalablytyped.runtime.TopLevel
import typings.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod.CollectionChangedAction.DELETE
import typings.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod.CollectionChangedAction.INSERT
import typings.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod.CollectionChangedAction.RESET
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CollectionChangedAction with Double] = js.native
  /* 1 */ @js.native
  object DELETE extends TopLevel[DELETE with Double]
  
  /* 0 */ @js.native
  object INSERT extends TopLevel[INSERT with Double]
  
  /* 2 */ @js.native
  object RESET extends TopLevel[RESET with Double]
  
}

