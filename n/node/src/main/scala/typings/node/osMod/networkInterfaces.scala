package typings.node.osMod

import typings.node.NodeJS.Dict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("os", "networkInterfaces")
@js.native
object networkInterfaces extends js.Object {
  def apply(): Dict[js.Array[NetworkInterfaceInfo]] = js.native
}

