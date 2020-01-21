package typings.nock.mod

import typings.nock.AnonContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Back_ extends js.Object {
  var currentMode: BackMode = js.native
  var fixtures: String = js.native
  def apply(fixtureName: String): js.Promise[AnonContext] = js.native
  def apply(fixtureName: String, nockedFn: js.Function1[/* nockDone */ js.Function0[Unit], Unit]): Unit = js.native
  def apply(fixtureName: String, options: BackOptions): js.Promise[AnonContext] = js.native
  def apply(
    fixtureName: String,
    options: BackOptions,
    nockedFn: js.Function1[/* nockDone */ js.Function0[Unit], Unit]
  ): Unit = js.native
  def setMode(mode: BackMode): Unit = js.native
}

