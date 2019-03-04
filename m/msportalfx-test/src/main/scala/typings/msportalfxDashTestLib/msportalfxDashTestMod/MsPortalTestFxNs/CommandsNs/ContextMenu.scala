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
    click: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    clickItem: js.Function1[java.lang.String, qLib.qMod.QNs.Promise[scala.Unit]],
    getAttribute: js.Function1[java.lang.String, qLib.qMod.QNs.Promise[java.lang.String]],
    getLocator: js.Function0[msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator],
    getText: js.Function0[qLib.qMod.QNs.Promise[java.lang.String]],
    hasItem: js.Function1[java.lang.String, qLib.qMod.QNs.Promise[scala.Boolean]],
    isDisplayed: js.Function0[qLib.qMod.QNs.Promise[scala.Boolean]],
    isElementPresent: js.Function1[
      msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator, 
      qLib.qMod.QNs.Promise[scala.Boolean]
    ],
    isPresent: js.Function0[qLib.qMod.QNs.Promise[scala.Boolean]],
    parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    rightClick: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    sendKeys: js.Function1[/* repeated */ java.lang.String, qLib.qMod.QNs.Promise[scala.Unit]]
  ): ContextMenu = {
    val __obj = js.Dynamic.literal(baseLocator = baseLocator, click = click, clickItem = clickItem, getAttribute = getAttribute, getLocator = getLocator, getText = getText, hasItem = hasItem, isDisplayed = isDisplayed, isElementPresent = isElementPresent, isPresent = isPresent, parentLocator = parentLocator, rightClick = rightClick, sendKeys = sendKeys)
  
    __obj.asInstanceOf[ContextMenu]
  }
}

