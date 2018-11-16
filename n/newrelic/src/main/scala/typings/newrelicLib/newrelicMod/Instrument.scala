package typings
package newrelicLib.newrelicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instrument extends js.Object {
  def apply(moduleName: java.lang.String, onRequire: js.Function0[scala.Unit]): scala.Unit = js.native
  def apply(
    moduleName: java.lang.String,
    onRequire: js.Function0[scala.Unit],
    onError: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def apply(opts: newrelicLib.Anon_OnError): scala.Unit = js.native
}

