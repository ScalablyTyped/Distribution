package typings
package maxmindLib.maxmindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def open[T /* <: maxmindLib.maxmindMod.Response */](filepath: java.lang.String): scala.Unit = js.native
  def open[T /* <: maxmindLib.maxmindMod.Response */](filepath: java.lang.String, opts: maxmindLib.maxmindMod.OpenOpts): scala.Unit = js.native
  def open[T /* <: maxmindLib.maxmindMod.Response */](
    filepath: java.lang.String,
    opts: maxmindLib.maxmindMod.OpenOpts,
    cb: maxmindLib.maxmindMod.openCb[T]
  ): scala.Unit = js.native
  def open[T /* <: maxmindLib.maxmindMod.Response */](filepath: java.lang.String, opts: maxmindLib.maxmindMod.openCb[T]): scala.Unit = js.native
  def open[T /* <: maxmindLib.maxmindMod.Response */](
    filepath: java.lang.String,
    opts: maxmindLib.maxmindMod.openCb[T],
    cb: maxmindLib.maxmindMod.openCb[T]
  ): scala.Unit = js.native
  def openSync[T /* <: maxmindLib.maxmindMod.Response */](filepath: java.lang.String): maxmindLib.maxmindMod.Reader[T] = js.native
  def openSync[T /* <: maxmindLib.maxmindMod.Response */](filepath: java.lang.String, opts: maxmindLib.maxmindMod.OpenOpts): maxmindLib.maxmindMod.Reader[T] = js.native
  def validate(ipAddress: java.lang.String): scala.Boolean = js.native
}

