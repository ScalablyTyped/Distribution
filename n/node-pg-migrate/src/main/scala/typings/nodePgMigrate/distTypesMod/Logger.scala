package typings.nodePgMigrate.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  var debug: js.UndefOr[LogFn] = js.native
  @JSName("error")
  var error_Original: LogFn = js.native
  @JSName("info")
  var info_Original: LogFn = js.native
  @JSName("warn")
  var warn_Original: LogFn = js.native
  def error(msg: String): Unit = js.native
  def info(msg: String): Unit = js.native
  def warn(msg: String): Unit = js.native
}

