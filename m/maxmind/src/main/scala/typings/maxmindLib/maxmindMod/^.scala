package typings
package maxmindLib.maxmindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def init(): scala.Nothing = js.native
  def open[T](filepath: java.lang.String): js.Promise[maxmindLib.libReaderMod.default[T]] = js.native
  def open[T](filepath: java.lang.String, opts: js.UndefOr[scala.Nothing], cb: Callback): js.Promise[maxmindLib.libReaderMod.default[T]] = js.native
  def open[T](filepath: java.lang.String, opts: OpenOpts): js.Promise[maxmindLib.libReaderMod.default[T]] = js.native
  def open[T](filepath: java.lang.String, opts: OpenOpts, cb: Callback): js.Promise[maxmindLib.libReaderMod.default[T]] = js.native
  def openSync(): scala.Nothing = js.native
  def validate(ip: java.lang.String): scala.Boolean = js.native
}

