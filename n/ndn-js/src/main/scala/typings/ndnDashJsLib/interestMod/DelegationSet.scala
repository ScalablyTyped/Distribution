package typings
package ndnDashJsLib.interestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/interest", "DelegationSet")
@js.native
class DelegationSet () extends js.Object {
  def add(preference: scala.Double, name: ndnDashJsLib.nameMod.Name): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def find(name: ndnDashJsLib.nameMod.Name): scala.Double = js.native
  def get(i: scala.Double): ndnDashJsLib.interestMod.DelegationSetNs.Delegation = js.native
  def remove(name: ndnDashJsLib.nameMod.Name): scala.Boolean = js.native
  def size(): scala.Double = js.native
}

