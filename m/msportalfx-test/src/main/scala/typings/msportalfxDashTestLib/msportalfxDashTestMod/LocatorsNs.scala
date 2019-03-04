package typings
package msportalfxDashTestLib.msportalfxDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "Locators")
@js.native
object LocatorsNs extends js.Object {
  @js.native
  class By ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.By
  
  @js.native
  class ChainedLocator protected ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.ChainedLocator {
    def this(innerLocators: js.Array[msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator]) = this()
    /* CompleteClass */
    override var locators: js.Array[msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator] = js.native
    /* CompleteClass */
    override var seleniumLocator: js.Any = js.native
    /* CompleteClass */
    override def findElements(context: js.Any): js.Any = js.native
  }
  
  @js.native
  class ContentLocator protected ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.ContentLocator {
    def this(innerLocators: js.Array[msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator]) = this()
    /* CompleteClass */
    override var locators: js.Array[msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator] = js.native
    /* CompleteClass */
    override var seleniumLocator: js.Any = js.native
    /* CompleteClass */
    override def findElements(context: js.Any): js.Any = js.native
  }
  
  @js.native
  class Locator ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator {
    /* CompleteClass */
    override var seleniumLocator: js.Any = js.native
    /* CompleteClass */
    override def findElements(context: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object By extends js.Object {
    def chained(values: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator*): msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    def className(value: java.lang.String): msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    def content(values: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator*): msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    def css(value: java.lang.String): msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    def id(value: java.lang.String): msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    @JSName("js")
    def js_(script: js.Any, var_args: js.Any*): msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    def linkText(value: java.lang.String): msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    def name(value: java.lang.String): msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    def partialLinkText(value: java.lang.String): msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    def tagName(value: java.lang.String): msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    def text(value: java.lang.String): msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    def xpath(value: java.lang.String): msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
  }
  
}

