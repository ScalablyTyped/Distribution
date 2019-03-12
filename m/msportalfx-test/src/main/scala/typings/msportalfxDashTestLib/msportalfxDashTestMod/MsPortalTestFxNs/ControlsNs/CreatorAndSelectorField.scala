package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatorAndSelectorField extends FormElement {
  def clickCreateNew(): qLib.qMod.QNs.Promise[CreatorAndSelectorField]
  def enterNewValue(var_args: java.lang.String*): qLib.qMod.QNs.Promise[CreatorAndSelectorField]
  def openPicker(): qLib.qMod.QNs.Promise[scala.Unit]
}

object CreatorAndSelectorField {
  @scala.inline
  def apply(
    baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    click: () => qLib.qMod.QNs.Promise[scala.Unit],
    clickCreateNew: () => qLib.qMod.QNs.Promise[CreatorAndSelectorField],
    enterNewValue: /* repeated */ java.lang.String => qLib.qMod.QNs.Promise[CreatorAndSelectorField],
    getAttribute: java.lang.String => qLib.qMod.QNs.Promise[java.lang.String],
    getLocator: () => msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    getText: () => qLib.qMod.QNs.Promise[java.lang.String],
    isDisplayed: () => qLib.qMod.QNs.Promise[scala.Boolean],
    isElementPresent: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator => qLib.qMod.QNs.Promise[scala.Boolean],
    isPresent: () => qLib.qMod.QNs.Promise[scala.Boolean],
    label: java.lang.String,
    openPicker: () => qLib.qMod.QNs.Promise[scala.Unit],
    parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    rightClick: () => qLib.qMod.QNs.Promise[scala.Unit],
    sendKeys: /* repeated */ java.lang.String => qLib.qMod.QNs.Promise[scala.Unit]
  ): CreatorAndSelectorField = {
    val __obj = js.Dynamic.literal(baseLocator = baseLocator, click = js.Any.fromFunction0(click), clickCreateNew = js.Any.fromFunction0(clickCreateNew), enterNewValue = js.Any.fromFunction1(enterNewValue), getAttribute = js.Any.fromFunction1(getAttribute), getLocator = js.Any.fromFunction0(getLocator), getText = js.Any.fromFunction0(getText), isDisplayed = js.Any.fromFunction0(isDisplayed), isElementPresent = js.Any.fromFunction1(isElementPresent), isPresent = js.Any.fromFunction0(isPresent), label = label, openPicker = js.Any.fromFunction0(openPicker), parentLocator = parentLocator, rightClick = js.Any.fromFunction0(rightClick), sendKeys = js.Any.fromFunction1(sendKeys))
  
    __obj.asInstanceOf[CreatorAndSelectorField]
  }
}

