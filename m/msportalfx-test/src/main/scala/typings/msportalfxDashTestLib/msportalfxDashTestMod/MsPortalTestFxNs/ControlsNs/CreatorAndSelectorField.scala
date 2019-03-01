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
    click: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    clickCreateNew: js.Function0[qLib.qMod.QNs.Promise[CreatorAndSelectorField]],
    enterNewValue: js.Function1[/* repeated */ java.lang.String, qLib.qMod.QNs.Promise[CreatorAndSelectorField]],
    getAttribute: js.Function1[java.lang.String, qLib.qMod.QNs.Promise[java.lang.String]],
    getLocator: js.Function0[msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator],
    getText: js.Function0[qLib.qMod.QNs.Promise[java.lang.String]],
    isDisplayed: js.Function0[qLib.qMod.QNs.Promise[scala.Boolean]],
    isElementPresent: js.Function1[
      msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator, 
      qLib.qMod.QNs.Promise[scala.Boolean]
    ],
    isPresent: js.Function0[qLib.qMod.QNs.Promise[scala.Boolean]],
    label: java.lang.String,
    openPicker: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    rightClick: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    sendKeys: js.Function1[/* repeated */ java.lang.String, qLib.qMod.QNs.Promise[scala.Unit]]
  ): CreatorAndSelectorField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseLocator")(baseLocator)
    __obj.updateDynamic("click")(click)
    __obj.updateDynamic("clickCreateNew")(clickCreateNew)
    __obj.updateDynamic("enterNewValue")(enterNewValue)
    __obj.updateDynamic("getAttribute")(getAttribute)
    __obj.updateDynamic("getLocator")(getLocator)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("isDisplayed")(isDisplayed)
    __obj.updateDynamic("isElementPresent")(isElementPresent)
    __obj.updateDynamic("isPresent")(isPresent)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("openPicker")(openPicker)
    __obj.updateDynamic("parentLocator")(parentLocator)
    __obj.updateDynamic("rightClick")(rightClick)
    __obj.updateDynamic("sendKeys")(sendKeys)
    __obj.asInstanceOf[CreatorAndSelectorField]
  }
}

