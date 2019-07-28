package typings.novncDashCore

import typings.novncDashCore.novncDashCoreStrings.debug
import typings.novncDashCore.novncDashCoreStrings.error
import typings.novncDashCore.novncDashCoreStrings.info
import typings.novncDashCore.novncDashCoreStrings.none
import typings.novncDashCore.novncDashCoreStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("novnc-core/lib/util/logging", JSImport.Namespace)
@js.native
object libUtilLoggingMod extends js.Object {
  def get_logging(): debug | info | warn | error | none = js.native
  def init_logging(): Unit = js.native
  @JSName("init_logging")
  def init_logging_debug(level: debug): Unit = js.native
  @JSName("init_logging")
  def init_logging_error(level: error): Unit = js.native
  @JSName("init_logging")
  def init_logging_info(level: info): Unit = js.native
  @JSName("init_logging")
  def init_logging_none(level: none): Unit = js.native
  @JSName("init_logging")
  def init_logging_warn(level: warn): Unit = js.native
}

