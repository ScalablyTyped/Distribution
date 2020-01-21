package typings.nodeLogglyBulk.mod

import typings.loggly.mod.LogglyInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-loggly-bulk", "createClient")
@js.native
object createClient extends js.Object {
  def apply(options: LogglyBulkOptions): LogglyInstance = js.native
}

