package typings
package msportalfxDashTestLib.msportalfxDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "Controls")
@js.native
object ControlsNs extends js.Object {
  @js.native
  class CheckBoxField ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.ControlsNs.CheckBoxField {
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator) = this()
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator, label: java.lang.String) = this()
    /* CompleteClass */
    override var baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override var label: java.lang.String = js.native
    /* CompleteClass */
    override var parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override def click(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
    /* CompleteClass */
    override def getAttribute(attributeName: java.lang.String): qLib.qMod.QNs.Promise[java.lang.String] = js.native
    /* CompleteClass */
    override def getLocator(): msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override def getText(): qLib.qMod.QNs.Promise[java.lang.String] = js.native
    /* CompleteClass */
    override def isDisplayed(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def isElementPresent(subLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def isPresent(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def rightClick(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
    /* CompleteClass */
    override def sendKeys(var_args: java.lang.String*): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  }
  
  @js.native
  class CreatorAndSelectorField ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.ControlsNs.CreatorAndSelectorField {
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator) = this()
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator, selectModeLabel: java.lang.String) = this()
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator, selectModeLabel: java.lang.String, createModeLabel: java.lang.String) = this()
    /* CompleteClass */
    override var baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override var label: java.lang.String = js.native
    /* CompleteClass */
    override var parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override def click(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
    /* CompleteClass */
    override def clickCreateNew(): qLib.qMod.QNs.Promise[
        msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.ControlsNs.CreatorAndSelectorField
      ] = js.native
    /* CompleteClass */
    override def enterNewValue(var_args: java.lang.String*): qLib.qMod.QNs.Promise[
        msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.ControlsNs.CreatorAndSelectorField
      ] = js.native
    /* CompleteClass */
    override def getAttribute(attributeName: java.lang.String): qLib.qMod.QNs.Promise[java.lang.String] = js.native
    /* CompleteClass */
    override def getLocator(): msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override def getText(): qLib.qMod.QNs.Promise[java.lang.String] = js.native
    /* CompleteClass */
    override def isDisplayed(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def isElementPresent(subLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def isPresent(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def openPicker(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
    /* CompleteClass */
    override def rightClick(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
    /* CompleteClass */
    override def sendKeys(var_args: java.lang.String*): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  }
  
  @js.native
  class FormElement protected ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.ControlsNs.FormElement {
    def this(baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator) = this()
    def this(baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator, parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator) = this()
    def this(baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator, parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator, label: java.lang.String) = this()
    /* CompleteClass */
    override var baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override var label: java.lang.String = js.native
    /* CompleteClass */
    override var parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override def click(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
    /* CompleteClass */
    override def getAttribute(attributeName: java.lang.String): qLib.qMod.QNs.Promise[java.lang.String] = js.native
    /* CompleteClass */
    override def getLocator(): msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override def getText(): qLib.qMod.QNs.Promise[java.lang.String] = js.native
    /* CompleteClass */
    override def isDisplayed(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def isElementPresent(subLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def isPresent(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def rightClick(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
    /* CompleteClass */
    override def sendKeys(var_args: java.lang.String*): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  }
  
  @js.native
  class GridCell protected ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.ControlsNs.GridCell {
    def this(text: java.lang.String) = this()
    def this(text: java.lang.String, parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator) = this()
    /* CompleteClass */
    override var baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override var parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override def click(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
    /* CompleteClass */
    override def getAttribute(attributeName: java.lang.String): qLib.qMod.QNs.Promise[java.lang.String] = js.native
    /* CompleteClass */
    override def getLocator(): msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override def getText(): qLib.qMod.QNs.Promise[java.lang.String] = js.native
    /* CompleteClass */
    override def isDisplayed(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def isElementPresent(subLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def isPresent(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def rightClick(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
    /* CompleteClass */
    override def sendKeys(var_args: java.lang.String*): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  }
  
  @js.native
  class HotSpot ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.ControlsNs.HotSpot {
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator) = this()
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator, baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator) = this()
    /* CompleteClass */
    override var baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override var parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override def click(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
    /* CompleteClass */
    override def getAttribute(attributeName: java.lang.String): qLib.qMod.QNs.Promise[java.lang.String] = js.native
    /* CompleteClass */
    override def getLocator(): msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override def getText(): qLib.qMod.QNs.Promise[java.lang.String] = js.native
    /* CompleteClass */
    override def isDisplayed(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def isElementPresent(subLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def isPresent(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def isSelected(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def rightClick(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
    /* CompleteClass */
    override def sendKeys(var_args: java.lang.String*): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  }
  
  @js.native
  class ResourceFilterTextField ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.ControlsNs.ResourceFilterTextField {
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator) = this()
    /* CompleteClass */
    override var baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override var label: java.lang.String = js.native
    /* CompleteClass */
    override var parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override def click(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
    /* CompleteClass */
    override def getAttribute(attributeName: java.lang.String): qLib.qMod.QNs.Promise[java.lang.String] = js.native
    /* CompleteClass */
    override def getLocator(): msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override def getText(): qLib.qMod.QNs.Promise[java.lang.String] = js.native
    /* CompleteClass */
    override def isDisplayed(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def isElementPresent(subLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def isPresent(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def rightClick(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
    /* CompleteClass */
    override def sendKeys(var_args: java.lang.String*): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  }
  
  @js.native
  class SelectorField ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.ControlsNs.SelectorField {
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator) = this()
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator, label: java.lang.String) = this()
    /* CompleteClass */
    override var baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override var label: java.lang.String = js.native
    /* CompleteClass */
    override var parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override def click(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
    /* CompleteClass */
    override def getAttribute(attributeName: java.lang.String): qLib.qMod.QNs.Promise[java.lang.String] = js.native
    /* CompleteClass */
    override def getLocator(): msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override def getText(): qLib.qMod.QNs.Promise[java.lang.String] = js.native
    /* CompleteClass */
    override def isDisplayed(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def isElementPresent(subLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def isPresent(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def openPicker(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
    /* CompleteClass */
    override def rightClick(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
    /* CompleteClass */
    override def sendKeys(var_args: java.lang.String*): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  }
  
  @js.native
  class TextField ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.ControlsNs.TextField {
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator) = this()
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator, label: java.lang.String) = this()
    def this(parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator, label: java.lang.String, baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator) = this()
    /* CompleteClass */
    override var baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override var label: java.lang.String = js.native
    /* CompleteClass */
    override var parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override def click(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
    /* CompleteClass */
    override def getAttribute(attributeName: java.lang.String): qLib.qMod.QNs.Promise[java.lang.String] = js.native
    /* CompleteClass */
    override def getLocator(): msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator = js.native
    /* CompleteClass */
    override def getText(): qLib.qMod.QNs.Promise[java.lang.String] = js.native
    /* CompleteClass */
    override def isDisplayed(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def isElementPresent(subLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def isPresent(): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
    /* CompleteClass */
    override def rightClick(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
    /* CompleteClass */
    override def sendKeys(var_args: java.lang.String*): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  }
  
}

