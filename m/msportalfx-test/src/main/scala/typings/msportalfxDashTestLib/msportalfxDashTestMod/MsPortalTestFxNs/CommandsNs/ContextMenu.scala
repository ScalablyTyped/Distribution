package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.CommandsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenu
  extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.PortalElement {
  def clickItem(text: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit]
  def hasItem(text: java.lang.String): qLib.qMod.QNs.Promise[scala.Boolean]
}

object ContextMenu {
  @scala.inline
  def apply(
    baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    click: () => qLib.qMod.QNs.Promise[scala.Unit],
    clickItem: java.lang.String => qLib.qMod.QNs.Promise[scala.Unit],
    getAttribute: java.lang.String => qLib.qMod.QNs.Promise[java.lang.String],
    getLocator: () => msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    getText: () => qLib.qMod.QNs.Promise[java.lang.String],
    hasItem: java.lang.String => qLib.qMod.QNs.Promise[scala.Boolean],
    isDisplayed: () => qLib.qMod.QNs.Promise[scala.Boolean],
    isElementPresent: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator => qLib.qMod.QNs.Promise[scala.Boolean],
    isPresent: () => qLib.qMod.QNs.Promise[scala.Boolean],
    parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    rightClick: () => qLib.qMod.QNs.Promise[scala.Unit],
    sendKeys: /* repeated */ java.lang.String => qLib.qMod.QNs.Promise[scala.Unit]
  ): ContextMenu = {
    val __obj = js.Dynamic.literal(baseLocator = baseLocator, click = js.Any.fromFunction0(click), clickItem = js.Any.fromFunction1(clickItem), getAttribute = js.Any.fromFunction1(getAttribute), getLocator = js.Any.fromFunction0(getLocator), getText = js.Any.fromFunction0(getText), hasItem = js.Any.fromFunction1(hasItem), isDisplayed = js.Any.fromFunction0(isDisplayed), isElementPresent = js.Any.fromFunction1(isElementPresent), isPresent = js.Any.fromFunction0(isPresent), parentLocator = parentLocator, rightClick = js.Any.fromFunction0(rightClick), sendKeys = js.Any.fromFunction1(sendKeys))
  
    __obj.asInstanceOf[ContextMenu]
  }
}

