package typings.pg.pgMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg", "Client")
@js.native
class Client () extends ClientBase {
  def this(config: String) = this()
  def this(config: ClientConfig) = this()
  def end(): js.Promise[Unit] = js.native
  def end(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

