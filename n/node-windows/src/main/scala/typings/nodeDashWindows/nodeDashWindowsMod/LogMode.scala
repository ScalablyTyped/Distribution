package typings.nodeDashWindows.nodeDashWindowsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogMode extends js.Object

@JSImport("node-windows", "LogMode")
@js.native
object LogMode extends js.Object {
  @js.native
  sealed trait append extends LogMode
  
  @js.native
  sealed trait reset extends LogMode
  
  @js.native
  sealed trait roll extends LogMode
  
  @js.native
  sealed trait rotate extends LogMode
  
  /* "append" */ val append: typings.nodeDashWindows.nodeDashWindowsMod.LogMode.append with String = js.native
  /* "reset" */ val reset: typings.nodeDashWindows.nodeDashWindowsMod.LogMode.reset with String = js.native
  /* "roll" */ val roll: typings.nodeDashWindows.nodeDashWindowsMod.LogMode.roll with String = js.native
  /* "rotate" */ val rotate: typings.nodeDashWindows.nodeDashWindowsMod.LogMode.rotate with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LogMode with String] = js.native
}

