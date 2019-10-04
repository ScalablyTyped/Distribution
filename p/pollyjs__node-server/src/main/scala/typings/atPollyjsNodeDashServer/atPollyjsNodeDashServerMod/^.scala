package typings.atPollyjsNodeDashServer.atPollyjsNodeDashServerMod

import typings.express.expressMod.Express
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pollyjs/node-server", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Defaults: Config = js.native
  def registerExpressAPI(app: Express, config: Partial[Config]): Unit = js.native
}

