package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.PartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartProperty
  extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.PortalElement {
  var name: java.lang.String
  def getValue(): qLib.qMod.QNs.Promise[java.lang.String]
}

object PartProperty {
  @scala.inline
  def apply(
    baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    click: () => qLib.qMod.QNs.Promise[scala.Unit],
    getAttribute: java.lang.String => qLib.qMod.QNs.Promise[java.lang.String],
    getLocator: () => msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    getText: () => qLib.qMod.QNs.Promise[java.lang.String],
    getValue: () => qLib.qMod.QNs.Promise[java.lang.String],
    isDisplayed: () => qLib.qMod.QNs.Promise[scala.Boolean],
    isElementPresent: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator => qLib.qMod.QNs.Promise[scala.Boolean],
    isPresent: () => qLib.qMod.QNs.Promise[scala.Boolean],
    name: java.lang.String,
    parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    rightClick: () => qLib.qMod.QNs.Promise[scala.Unit],
    sendKeys: /* repeated */ java.lang.String => qLib.qMod.QNs.Promise[scala.Unit]
  ): PartProperty = {
    val __obj = js.Dynamic.literal(baseLocator = baseLocator, click = js.Any.fromFunction0(click), getAttribute = js.Any.fromFunction1(getAttribute), getLocator = js.Any.fromFunction0(getLocator), getText = js.Any.fromFunction0(getText), getValue = js.Any.fromFunction0(getValue), isDisplayed = js.Any.fromFunction0(isDisplayed), isElementPresent = js.Any.fromFunction1(isElementPresent), isPresent = js.Any.fromFunction0(isPresent), name = name, parentLocator = parentLocator, rightClick = js.Any.fromFunction0(rightClick), sendKeys = js.Any.fromFunction1(sendKeys))
  
    __obj.asInstanceOf[PartProperty]
  }
}

