package typings
package ndnDashJsLib.interestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/interest", "DelegationSet")
@js.native
object DelegationSetNs extends js.Object {
  @js.native
  class Delegation () extends js.Object {
    def getName(): ndnDashJsLib.nameMod.Name = js.native
    def getPreference(): scala.Double = js.native
  }
  
}

