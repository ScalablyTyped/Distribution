package typings
package maxmindLib.maxmindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def open[T /* <: Response */](filepath: java.lang.String): scala.Unit = js.native
  def open[T /* <: Response */](filepath: java.lang.String, opts: OpenOpts): scala.Unit = js.native
  def open[T /* <: Response */](filepath: java.lang.String, opts: OpenOpts, cb: openCb[T]): scala.Unit = js.native
  def open[T /* <: Response */](filepath: java.lang.String, opts: openCb[T]): scala.Unit = js.native
  def open[T /* <: Response */](filepath: java.lang.String, opts: openCb[T], cb: openCb[T]): scala.Unit = js.native
  def openSync[T /* <: Response */](filepath: java.lang.String): Reader[T] = js.native
  def openSync[T /* <: Response */](filepath: java.lang.String, opts: OpenOpts): Reader[T] = js.native
  def validate(ipAddress: java.lang.String): scala.Boolean = js.native
}

