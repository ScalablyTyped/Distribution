package typings
package nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-zookeeper-client", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CreateMode: nodeDashZookeeperDashClientLib.Anon_EPHEMERAL = js.native
  val Permission: nodeDashZookeeperDashClientLib.Anon_ADMIN = js.native
  def createClient(connectionString: java.lang.String): nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientMod.Client = js.native
  def createClient(
    connectionString: java.lang.String,
    options: stdLib.Partial[nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientMod.Option]
  ): nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientMod.Client = js.native
}

