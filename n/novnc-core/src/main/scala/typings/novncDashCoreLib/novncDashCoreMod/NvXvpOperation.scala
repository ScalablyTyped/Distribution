package typings
package novncDashCoreLib.novncDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NvXvpOperation extends js.Object

@JSImport("novnc-core", "NvXvpOperation")
@js.native
object NvXvpOperation extends js.Object {
  @js.native
  sealed trait reboot
    extends novncDashCoreLib.novncDashCoreMod.NvXvpOperation
  
  @js.native
  sealed trait reset
    extends novncDashCoreLib.novncDashCoreMod.NvXvpOperation
  
  @js.native
  sealed trait shutdown
    extends novncDashCoreLib.novncDashCoreMod.NvXvpOperation
  
  val reboot: reboot with scala.Double = js.native
  val reset: reset with scala.Double = js.native
  /* 2 */ val shutdown: shutdown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[novncDashCoreLib.novncDashCoreMod.NvXvpOperation with scala.Double] = js.native
}

