package typings.nodeDashAbi.nodeDashAbiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-abi", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var additionalTargets: js.Array[Target] = js.native
  var allTargets: js.Array[Target] = js.native
  var deprecatedTargets: js.Array[Target] = js.native
  var futureTargets: js.Array[Target] = js.native
  var supportedTargets: js.Array[Target] = js.native
  def _getNextTarget(runtime: Runtime): String | Null = js.native
  def _getNextTarget(runtime: Runtime, targets: js.Array[Target]): String | Null = js.native
  def getAbi(target: String): String = js.native
  def getAbi(target: String, runtime: Runtime): String = js.native
  def getTarget(): String = js.native
  def getTarget(abi: String): String = js.native
  def getTarget(abi: String, runtime: Runtime): String = js.native
}

