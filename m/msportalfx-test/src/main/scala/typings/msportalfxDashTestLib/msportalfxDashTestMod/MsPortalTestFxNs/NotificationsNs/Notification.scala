package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification
  extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.PortalElement {
  def getDescription(): qLib.qMod.QNs.Promise[java.lang.String]
  def getTitle(): qLib.qMod.QNs.Promise[java.lang.String]
}

object Notification {
  @scala.inline
  def apply(
    baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    click: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    getAttribute: js.Function1[java.lang.String, qLib.qMod.QNs.Promise[java.lang.String]],
    getDescription: js.Function0[qLib.qMod.QNs.Promise[java.lang.String]],
    getLocator: js.Function0[msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator],
    getText: js.Function0[qLib.qMod.QNs.Promise[java.lang.String]],
    getTitle: js.Function0[qLib.qMod.QNs.Promise[java.lang.String]],
    isDisplayed: js.Function0[qLib.qMod.QNs.Promise[scala.Boolean]],
    isElementPresent: js.Function1[
      msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator, 
      qLib.qMod.QNs.Promise[scala.Boolean]
    ],
    isPresent: js.Function0[qLib.qMod.QNs.Promise[scala.Boolean]],
    parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    rightClick: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    sendKeys: js.Function1[/* repeated */ java.lang.String, qLib.qMod.QNs.Promise[scala.Unit]]
  ): Notification = {
    val __obj = js.Dynamic.literal(baseLocator = baseLocator, click = click, getAttribute = getAttribute, getDescription = getDescription, getLocator = getLocator, getText = getText, getTitle = getTitle, isDisplayed = isDisplayed, isElementPresent = isElementPresent, isPresent = isPresent, parentLocator = parentLocator, rightClick = rightClick, sendKeys = sendKeys)
  
    __obj.asInstanceOf[Notification]
  }
}

