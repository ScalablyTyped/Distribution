package typings
package msportalfxDashTestLib.msportalfxDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "ActionBars")
@js.native
object ActionBarsNs extends js.Object {
  @js.native
  class ActionBarButton ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.PortalElement {
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator, baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
  }
  
  @js.native
  class CreateActionBar ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.PortalElement {
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
    var createButton: ActionBarButton = js.native
  }
  
  @js.native
  class DeleteActionBar ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.PortalElement {
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
    var cancelButton: ActionBarButton = js.native
    var deleteButton: ActionBarButton = js.native
  }
  
  @js.native
  class PickerActionBar ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.PortalElement {
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
    var selectButton: ActionBarButton = js.native
  }
  
}

