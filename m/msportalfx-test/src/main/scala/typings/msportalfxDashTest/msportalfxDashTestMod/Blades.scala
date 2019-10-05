package typings.msportalfxDashTest.msportalfxDashTestMod

import typings.msportalfxDashTest.msportalfxDashTestMod.ActionBars.CreateActionBar
import typings.msportalfxDashTest.msportalfxDashTestMod.Blades.Blade
import typings.msportalfxDashTest.msportalfxDashTestMod.Blades.BrowseResourceBlade
import typings.msportalfxDashTest.msportalfxDashTestMod.Parts.Tile
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "Blades")
@js.native
object Blades extends js.Object {
  @js.native
  class Blade protected () extends PortalElement {
    def this(title: String) = this()
    var title: String = js.native
    def clickCommand(commandText: String): Promise[Blade] = js.native
    def getTiles(): Promise[js.Array[Tile]] = js.native
  }
  
  @js.native
  class BrowseResourceBlade protected () extends Blade {
    def this(title: String) = this()
    def filterItems(filter: String): Promise[BrowseResourceBlade] = js.native
    def selectResource(resourceName: String): Promise[Unit] = js.native
  }
  
  @js.native
  class CreateBlade () extends Blade {
    var actionBar: CreateActionBar = js.native
  }
  
  @js.native
  class PickerBlade () extends Blade {
    def pickItem(item: String): Promise[Unit] = js.native
  }
  
  @js.native
  class QuickStartBlade () extends Blade {
    def clickLink(linkText: String): Promise[Unit] = js.native
  }
  
  @js.native
  class SpecPickerBlade () extends Blade {
    def pickSpec(specCode: String): Promise[Unit] = js.native
  }
  
  @js.native
  class UsersBlade () extends Blade
  
}

