package typings.msportalfxDashTest.msportalfxDashTestMod

import typings.msportalfxDashTest.msportalfxDashTestMod.Locators.Locator
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "Commands")
@js.native
object Commands extends js.Object {
  @js.native
  class ContextMenu () extends PortalElement {
    def clickItem(text: String): Promise[Unit] = js.native
    def hasItem(text: String): Promise[Boolean] = js.native
  }
  
  @js.native
  class ContextMenuItem protected () extends PortalElement {
    def this(parentLocator: Locator) = this()
    def this(parentLocator: Locator, text: String) = this()
  }
  
}

