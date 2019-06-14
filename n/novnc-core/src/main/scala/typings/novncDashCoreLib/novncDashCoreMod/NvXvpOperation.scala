package typings
package novncDashCoreLib.novncDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - novncDashCoreLib.novncDashCoreLibNumbers.`2`
  - novncDashCoreLib.novncDashCoreLibNumbers.`0`
  - novncDashCoreLib.novncDashCoreLibNumbers.`1`
*/
trait NvXvpOperation extends js.Object

object NvXvpOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def reboot: novncDashCoreLib.novncDashCoreLibNumbers.`0` = this.cast(0)
  @scala.inline
  def reset: novncDashCoreLib.novncDashCoreLibNumbers.`1` = this.cast(1)
  @scala.inline
  def shutdown: novncDashCoreLib.novncDashCoreLibNumbers.`2` = this.cast(2)
}

