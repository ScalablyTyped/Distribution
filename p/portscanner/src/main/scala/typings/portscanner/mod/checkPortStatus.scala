package typings.portscanner.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("portscanner", "checkPortStatus")
@js.native
object checkPortStatus extends js.Object {
  def apply(port: Double): js.Promise[Status] = js.native
  def apply(port: Double, checkPortCallback: StatusCallback): Unit = js.native
  def apply(port: Double, host: String): js.Promise[Status] = js.native
  def apply(port: Double, host: String, checkPortCallback: StatusCallback): Unit = js.native
  def apply(port: Double, host: String, opts: Options): js.Promise[Status] = js.native
  def apply(port: Double, host: String, opts: Options, checkPortCallback: StatusCallback): Unit = js.native
  def apply(port: Double, opts: Options): js.Promise[Status] = js.native
  def apply(port: Double, opts: Options, checkPortCallback: StatusCallback): Unit = js.native
}

