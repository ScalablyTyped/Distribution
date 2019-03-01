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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseLocator")(baseLocator)
    __obj.updateDynamic("click")(click)
    __obj.updateDynamic("getAttribute")(getAttribute)
    __obj.updateDynamic("getDescription")(getDescription)
    __obj.updateDynamic("getLocator")(getLocator)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("getTitle")(getTitle)
    __obj.updateDynamic("isDisplayed")(isDisplayed)
    __obj.updateDynamic("isElementPresent")(isElementPresent)
    __obj.updateDynamic("isPresent")(isPresent)
    __obj.updateDynamic("parentLocator")(parentLocator)
    __obj.updateDynamic("rightClick")(rightClick)
    __obj.updateDynamic("sendKeys")(sendKeys)
    __obj.asInstanceOf[Notification]
  }
}

