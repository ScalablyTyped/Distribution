package typings
package pinoLib.pinoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogFn extends js.Object {
  def apply(msg: java.lang.String, args: js.Any*): scala.Unit = js.native
  def apply(obj: js.Object): scala.Unit = js.native
  def apply(obj: js.Object, msg: java.lang.String, args: js.Any*): scala.Unit = js.native
}

