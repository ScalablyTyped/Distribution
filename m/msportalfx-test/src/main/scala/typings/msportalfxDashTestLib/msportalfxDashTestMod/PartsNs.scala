package typings
package msportalfxDashTestLib.msportalfxDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "Parts")
@js.native
object PartsNs extends js.Object {
  @js.native
  class Part ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.PortalElement {
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator, innerText: java.lang.String) = this()
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator, innerText: java.lang.String, baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
    var innerText: java.lang.String = js.native
    def hasError(): qLib.qMod.Promise[scala.Boolean] = js.native
    def isClickable(): qLib.qMod.Promise[scala.Boolean] = js.native
    def isLoaded(): qLib.qMod.Promise[scala.Boolean] = js.native
    def isSelected(): qLib.qMod.Promise[scala.Boolean] = js.native
    def waitUntilLoaded(): qLib.qMod.Promise[scala.Boolean] = js.native
    def waitUntilLoaded(timeout: scala.Double): qLib.qMod.Promise[scala.Boolean] = js.native
  }
  
  @js.native
  class PartProperty protected ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.PortalElement {
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
    var name: java.lang.String = js.native
    def getValue(): qLib.qMod.Promise[java.lang.String] = js.native
  }
  
  @js.native
  class PricingTierPart () extends Part
  
  @js.native
  class ResourceSummaryPart () extends Part {
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
    var accessHotSpot: msportalfxDashTestLib.msportalfxDashTestMod.ControlsNs.HotSpot = js.native
    var properties: js.Array[PartProperty] = js.native
    var quickStartHotSpot: msportalfxDashTestLib.msportalfxDashTestMod.ControlsNs.HotSpot = js.native
    var resourceGroupProperty: PartProperty = js.native
  }
  
  @js.native
  class Tile ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.PortalElement {
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
    var progressLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator = js.native
    def getPart(): Part = js.native
    def tryPin(): qLib.qMod.Promise[scala.Unit] = js.native
    def waitUntilLoaded(): qLib.qMod.Promise[scala.Unit] = js.native
    def waitUntilLoaded(timeout: scala.Double): qLib.qMod.Promise[scala.Unit] = js.native
  }
  
}

