package typings
package novncDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("novnc-core/lib/util/logging", JSImport.Namespace)
@js.native
object libUtilLoggingMod extends js.Object {
  def get_logging(): novncDashCoreLib.novncDashCoreLibStrings.debug | novncDashCoreLib.novncDashCoreLibStrings.info | novncDashCoreLib.novncDashCoreLibStrings.warn | novncDashCoreLib.novncDashCoreLibStrings.error | novncDashCoreLib.novncDashCoreLibStrings.none = js.native
  def init_logging(): scala.Unit = js.native
  @JSName("init_logging")
  def init_logging_debug(level: novncDashCoreLib.novncDashCoreLibStrings.debug): scala.Unit = js.native
  @JSName("init_logging")
  def init_logging_error(level: novncDashCoreLib.novncDashCoreLibStrings.error): scala.Unit = js.native
  @JSName("init_logging")
  def init_logging_info(level: novncDashCoreLib.novncDashCoreLibStrings.info): scala.Unit = js.native
  @JSName("init_logging")
  def init_logging_none(level: novncDashCoreLib.novncDashCoreLibStrings.none): scala.Unit = js.native
  @JSName("init_logging")
  def init_logging_warn(level: novncDashCoreLib.novncDashCoreLibStrings.warn): scala.Unit = js.native
}

