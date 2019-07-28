package typings.ndnDashJs.interestMod

import typings.ndnDashJs.nameMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/interest", "DelegationSet")
@js.native
object DelegationSetNs extends js.Object {
  @js.native
  class Delegation () extends js.Object {
    def getName(): Name = js.native
    def getPreference(): Double = js.native
  }
  
}

