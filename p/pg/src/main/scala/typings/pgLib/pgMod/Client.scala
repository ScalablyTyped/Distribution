package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg", "Client")
@js.native
class Client () extends ClientBase {
  def this(config: java.lang.String) = this()
  def this(config: ClientConfig) = this()
  def end(): stdLib.Promise[scala.Unit] = js.native
  def end(callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
}

