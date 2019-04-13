package typings
package msportalfxDashTestLib.msportalfxDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "Locators")
@js.native
object LocatorsNs extends js.Object {
  @js.native
  class By () extends js.Object
  
  @js.native
  class ChainedLocator protected () extends Locator {
    def this(innerLocators: js.Array[Locator]) = this()
    var locators: js.Array[Locator] = js.native
  }
  
  @js.native
  class ContentLocator protected () extends Locator {
    def this(innerLocators: js.Array[Locator]) = this()
    var locators: js.Array[Locator] = js.native
  }
  
  @js.native
  class Locator () extends js.Object {
    var seleniumLocator: js.Any = js.native
    def findElements(context: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object By extends js.Object {
    def chained(values: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator*): msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator = js.native
    def className(value: java.lang.String): msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator = js.native
    def content(values: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator*): msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator = js.native
    def css(value: java.lang.String): msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator = js.native
    def id(value: java.lang.String): msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator = js.native
    @JSName("js")
    def js_(script: js.Any, var_args: js.Any*): msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator = js.native
    def linkText(value: java.lang.String): msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator = js.native
    def name(value: java.lang.String): msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator = js.native
    def partialLinkText(value: java.lang.String): msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator = js.native
    def tagName(value: java.lang.String): msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator = js.native
    def text(value: java.lang.String): msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator = js.native
    def xpath(value: java.lang.String): msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator = js.native
  }
  
}

