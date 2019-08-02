package typings.nodeDashAbi.nodeDashAbiMod

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
    val __obj = js.Dynamic.literal(abi = abi, lts = lts, runtime = runtime, target = target)
  
    __obj.asInstanceOf[Target]
  }
}

