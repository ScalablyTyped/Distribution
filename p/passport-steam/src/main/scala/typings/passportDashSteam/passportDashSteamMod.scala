package typings.passportDashSteam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-steam", JSImport.Namespace)
@js.native
object passportDashSteamMod extends js.Object {
  // Circular reference from passport_steam
  val Strategy: js.Any = js.native
  val version: String = js.native
  def apply(options: js.Any, validate: js.Any): js.Any = js.native
  @JSName("prototype")
  @js.native
  object prototypeNs extends js.Object {
    def authenticate(req: js.Any): js.Any = js.native
    def loadAssociation(fn: js.Any): js.Any = js.native
    def loadDiscoveredInfo(fn: js.Any): js.Any = js.native
    def loadDiscoveredInformation(fn: js.Any): js.Any = js.native
    def saveAssociation(fn: js.Any): js.Any = js.native
    def saveDiscoveredInfo(fn: js.Any): js.Any = js.native
    def saveDiscoveredInformation(fn: js.Any): js.Any = js.native
  }
  
}

