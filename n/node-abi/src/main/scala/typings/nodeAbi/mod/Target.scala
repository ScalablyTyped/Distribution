package typings.nodeAbi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  var abi: String
  var lts: Boolean
  var runtime: Runtime
  var target: String
}

object Target {
  @scala.inline
  def apply(abi: String, lts: Boolean, runtime: Runtime, target: String): Target = {
    val __obj = js.Dynamic.literal(abi = abi.asInstanceOf[js.Any], lts = lts.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
}

