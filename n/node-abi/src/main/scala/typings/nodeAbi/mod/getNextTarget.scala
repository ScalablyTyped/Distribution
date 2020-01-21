package typings.nodeAbi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-abi", "_getNextTarget")
@js.native
object getNextTarget extends js.Object {
  def apply(runtime: Runtime): String | Null = js.native
  def apply(runtime: Runtime, targets: js.Array[Target]): String | Null = js.native
}

