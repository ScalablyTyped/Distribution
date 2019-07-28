package typings.ndnDashJs.interestMod

import typings.ndnDashJs.interestMod.DelegationSetNs.Delegation
import typings.ndnDashJs.nameMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/interest", "DelegationSet")
@js.native
class DelegationSet () extends js.Object {
  def add(preference: Double, name: Name): Unit = js.native
  def clear(): Unit = js.native
  def find(name: Name): Double = js.native
  def get(i: Double): Delegation = js.native
  def remove(name: Name): Boolean = js.native
  def size(): Double = js.native
}

