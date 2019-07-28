package typings.msportalfxDashTest.msportalfxDashTestMod

import typings.msportalfxDashTest.msportalfxDashTestMod.ControlsNs.CreatorAndSelectorField
import typings.msportalfxDashTest.msportalfxDashTestMod.ControlsNs.FormElement
import typings.msportalfxDashTest.msportalfxDashTestMod.ControlsNs.TextField
import typings.msportalfxDashTest.msportalfxDashTestMod.LocatorsNs.Locator
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "Controls")
@js.native
object ControlsNs extends js.Object {
  @js.native
  class CheckBoxField () extends FormElement {
    def this(parentLocator: Locator) = this()
    def this(parentLocator: Locator, label: String) = this()
  }
  
  @js.native
  class CreatorAndSelectorField () extends FormElement {
    def this(parentLocator: Locator) = this()
    def this(parentLocator: Locator, selectModeLabel: String) = this()
    def this(parentLocator: Locator, selectModeLabel: String, createModeLabel: String) = this()
    def clickCreateNew(): Promise[CreatorAndSelectorField] = js.native
    def enterNewValue(var_args: String*): Promise[CreatorAndSelectorField] = js.native
    def openPicker(): Promise[Unit] = js.native
  }
  
  @js.native
  class FormElement protected () extends PortalElement {
    def this(baseLocator: Locator) = this()
    def this(baseLocator: Locator, parentLocator: Locator) = this()
    def this(baseLocator: Locator, parentLocator: Locator, label: String) = this()
    var label: String = js.native
  }
  
  @js.native
  class GridCell protected () extends PortalElement {
    def this(text: String) = this()
    def this(text: String, parentLocator: Locator) = this()
  }
  
  @js.native
  class HotSpot () extends PortalElement {
    def this(parentLocator: Locator) = this()
    def this(parentLocator: Locator, baseLocator: Locator) = this()
    def isSelected(): Promise[Boolean] = js.native
  }
  
  @js.native
  class ResourceFilterTextField () extends TextField {
    def this(parentLocator: Locator) = this()
  }
  
  @js.native
  class SelectorField () extends FormElement {
    def this(parentLocator: Locator) = this()
    def this(parentLocator: Locator, label: String) = this()
    def openPicker(): Promise[Unit] = js.native
  }
  
  @js.native
  class TextField () extends FormElement {
    def this(parentLocator: Locator) = this()
    def this(parentLocator: Locator, label: String) = this()
    def this(parentLocator: Locator, label: String, baseLocator: Locator) = this()
  }
  
}

