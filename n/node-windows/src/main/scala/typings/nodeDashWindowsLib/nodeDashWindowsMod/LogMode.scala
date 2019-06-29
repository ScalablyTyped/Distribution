package typings
package nodeDashWindowsLib.nodeDashWindowsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogMode extends js.Object

@JSImport("node-windows", "LogMode")
@js.native
object LogMode extends js.Object {
  @js.native
  sealed trait append
    extends nodeDashWindowsLib.nodeDashWindowsMod.LogMode
  
  @js.native
  sealed trait reset
    extends nodeDashWindowsLib.nodeDashWindowsMod.LogMode
  
  @js.native
  sealed trait roll
    extends nodeDashWindowsLib.nodeDashWindowsMod.LogMode
  
  @js.native
  sealed trait rotate
    extends nodeDashWindowsLib.nodeDashWindowsMod.LogMode
  
  /* "append" */ val append: append with java.lang.String = js.native
  /* "reset" */ val reset: reset with java.lang.String = js.native
  /* "roll" */ val roll: roll with java.lang.String = js.native
  /* "rotate" */ val rotate: rotate with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[nodeDashWindowsLib.nodeDashWindowsMod.LogMode with java.lang.String] = js.native
}

