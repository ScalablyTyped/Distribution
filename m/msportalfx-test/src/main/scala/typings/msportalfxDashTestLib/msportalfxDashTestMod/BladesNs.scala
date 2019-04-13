package typings
package msportalfxDashTestLib.msportalfxDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "Blades")
@js.native
object BladesNs extends js.Object {
  @js.native
  class Blade protected ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.PortalElement {
    def this(title: java.lang.String) = this()
    var title: java.lang.String = js.native
    def clickCommand(commandText: java.lang.String): qLib.qMod.Promise[Blade] = js.native
    def getTiles(): qLib.qMod.Promise[js.Array[msportalfxDashTestLib.msportalfxDashTestMod.PartsNs.Tile]] = js.native
  }
  
  @js.native
  class BrowseResourceBlade protected () extends Blade {
    def this(title: java.lang.String) = this()
    def filterItems(filter: java.lang.String): qLib.qMod.Promise[BrowseResourceBlade] = js.native
    def selectResource(resourceName: java.lang.String): qLib.qMod.Promise[scala.Unit] = js.native
  }
  
  @js.native
  class CreateBlade () extends Blade {
    var actionBar: msportalfxDashTestLib.msportalfxDashTestMod.ActionBarsNs.CreateActionBar = js.native
  }
  
  @js.native
  class PickerBlade () extends Blade {
    def pickItem(item: java.lang.String): qLib.qMod.Promise[scala.Unit] = js.native
  }
  
  @js.native
  class QuickStartBlade () extends Blade {
    def clickLink(linkText: java.lang.String): qLib.qMod.Promise[scala.Unit] = js.native
  }
  
  @js.native
  class SpecPickerBlade () extends Blade {
    def pickSpec(specCode: java.lang.String): qLib.qMod.Promise[scala.Unit] = js.native
  }
  
  @js.native
  class UsersBlade () extends Blade
  
}

