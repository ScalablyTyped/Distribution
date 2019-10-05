package typings.newrelic.newrelicMod

import org.scalablytyped.runtime.TopLevel
import typings.newrelic.Anon_Err
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instrument extends js.Object {
  def apply(moduleName: String, onRequire: js.Function0[Unit]): Unit = js.native
  def apply(moduleName: String, onRequire: js.Function0[Unit], onError: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(opts: Anon_Err): Unit = js.native
}

@JSImport("newrelic", "instrument")
@js.native
object instrument extends TopLevel[Instrument]

