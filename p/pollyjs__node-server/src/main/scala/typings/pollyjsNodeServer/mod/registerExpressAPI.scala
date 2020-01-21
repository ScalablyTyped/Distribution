package typings.pollyjsNodeServer.mod

import typings.express.mod.Express
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pollyjs/node-server", "registerExpressAPI")
@js.native
object registerExpressAPI extends js.Object {
  def apply(app: Express, config: Partial[Config]): Unit = js.native
}

