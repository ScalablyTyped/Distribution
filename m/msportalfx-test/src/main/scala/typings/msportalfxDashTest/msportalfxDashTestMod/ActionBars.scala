package typings.msportalfxDashTest.msportalfxDashTestMod

import typings.msportalfxDashTest.msportalfxDashTestMod.ActionBars.ActionBarButton
import typings.msportalfxDashTest.msportalfxDashTestMod.Locators.Locator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "ActionBars")
@js.native
object ActionBars extends js.Object {
  @js.native
  class ActionBarButton () extends PortalElement {
    def this(parentLocator: Locator) = this()
    def this(parentLocator: Locator, baseLocator: Locator) = this()
  }
  
  @js.native
  class CreateActionBar () extends PortalElement {
    def this(parentLocator: Locator) = this()
    var createButton: ActionBarButton = js.native
  }
  
  @js.native
  class DeleteActionBar () extends PortalElement {
    def this(parentLocator: Locator) = this()
    var cancelButton: ActionBarButton = js.native
    var deleteButton: ActionBarButton = js.native
  }
  
  @js.native
  class PickerActionBar () extends PortalElement {
    def this(parentLocator: Locator) = this()
    var selectButton: ActionBarButton = js.native
  }
  
}

