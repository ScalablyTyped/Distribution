package typings
package msportalfxDashTestLib.msportalfxDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "Controls")
@js.native
object ControlsNs extends js.Object {
  @js.native
  class CheckBoxField () extends FormElement {
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator, label: java.lang.String) = this()
  }
  
  @js.native
  class CreatorAndSelectorField () extends FormElement {
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator, selectModeLabel: java.lang.String) = this()
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator, selectModeLabel: java.lang.String, createModeLabel: java.lang.String) = this()
    def clickCreateNew(): qLib.qMod.Promise[CreatorAndSelectorField] = js.native
    def enterNewValue(var_args: java.lang.String*): qLib.qMod.Promise[CreatorAndSelectorField] = js.native
    def openPicker(): qLib.qMod.Promise[scala.Unit] = js.native
  }
  
  @js.native
  class FormElement protected ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.PortalElement {
    def this(baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
    def this(baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator, parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
    def this(baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator, parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator, label: java.lang.String) = this()
    var label: java.lang.String = js.native
  }
  
  @js.native
  class GridCell protected ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.PortalElement {
    def this(text: java.lang.String) = this()
    def this(text: java.lang.String, parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
  }
  
  @js.native
  class HotSpot ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.PortalElement {
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator, baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
    def isSelected(): qLib.qMod.Promise[scala.Boolean] = js.native
  }
  
  @js.native
  class ResourceFilterTextField () extends TextField {
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
  }
  
  @js.native
  class SelectorField () extends FormElement {
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator, label: java.lang.String) = this()
    def openPicker(): qLib.qMod.Promise[scala.Unit] = js.native
  }
  
  @js.native
  class TextField () extends FormElement {
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator, label: java.lang.String) = this()
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator, label: java.lang.String, baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
  }
  
}

