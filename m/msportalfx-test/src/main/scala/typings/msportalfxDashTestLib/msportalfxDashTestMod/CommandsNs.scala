package typings
package msportalfxDashTestLib.msportalfxDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "Commands")
@js.native
object CommandsNs extends js.Object {
  @js.native
  class ContextMenu ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.PortalElement {
    def clickItem(text: java.lang.String): qLib.qMod.Promise[scala.Unit] = js.native
    def hasItem(text: java.lang.String): qLib.qMod.Promise[scala.Boolean] = js.native
  }
  
  @js.native
  class ContextMenuItem protected ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.PortalElement {
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator, text: java.lang.String) = this()
  }
  
}

