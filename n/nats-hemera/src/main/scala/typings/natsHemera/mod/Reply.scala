package typings.natsHemera.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reply extends js.Object {
  var error: Error = js.native
  var log: typings.pino.mod.Logger | Logger = js.native
  var payload: HemeraMessagePayload = js.native
  var sent: Boolean = js.native
  def next(message: js.Any): Unit = js.native
  def next(message: Error): Unit = js.native
  def send(message: js.Any): Unit = js.native
  def send(message: Error): Unit = js.native
}

