package typings.msportalfxDashTest.msportalfxDashTestMod

import typings.msportalfxDashTest.msportalfxDashTestMod.ControlsNs.HotSpot
import typings.msportalfxDashTest.msportalfxDashTestMod.LocatorsNs.Locator
import typings.msportalfxDashTest.msportalfxDashTestMod.PartsNs.Part
import typings.msportalfxDashTest.msportalfxDashTestMod.PartsNs.PartProperty
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "Parts")
@js.native
object PartsNs extends js.Object {
  @js.native
  class Part () extends PortalElement {
    def this(parentLocator: Locator) = this()
    def this(parentLocator: Locator, innerText: String) = this()
    def this(parentLocator: Locator, innerText: String, baseLocator: Locator) = this()
    var innerText: String = js.native
    def hasError(): Promise[Boolean] = js.native
    def isClickable(): Promise[Boolean] = js.native
    def isLoaded(): Promise[Boolean] = js.native
    def isSelected(): Promise[Boolean] = js.native
    def waitUntilLoaded(): Promise[Boolean] = js.native
    def waitUntilLoaded(timeout: Double): Promise[Boolean] = js.native
  }
  
  @js.native
  class PartProperty protected () extends PortalElement {
    def this(name: String) = this()
    def this(name: String, parentLocator: Locator) = this()
    var name: String = js.native
    def getValue(): Promise[String] = js.native
  }
  
  @js.native
  class PricingTierPart () extends Part
  
  @js.native
  class ResourceSummaryPart () extends Part {
    def this(parentLocator: Locator) = this()
    var accessHotSpot: HotSpot = js.native
    var properties: js.Array[PartProperty] = js.native
    var quickStartHotSpot: HotSpot = js.native
    var resourceGroupProperty: PartProperty = js.native
  }
  
  @js.native
  class Tile () extends PortalElement {
    def this(parentLocator: Locator) = this()
    var progressLocator: Locator = js.native
    def getPart(): Part = js.native
    def tryPin(): Promise[Unit] = js.native
    def waitUntilLoaded(): Promise[Unit] = js.native
    def waitUntilLoaded(timeout: Double): Promise[Unit] = js.native
  }
  
}

