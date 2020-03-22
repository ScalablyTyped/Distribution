package typings.newrelic.mod

import typings.newrelic.AnonModuleName
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instrument_ extends js.Object {
  def apply(moduleName: String, onRequire: js.Function0[Unit]): Unit = js.native
  def apply(moduleName: String, onRequire: js.Function0[Unit], onError: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(opts: AnonModuleName): Unit = js.native
}

