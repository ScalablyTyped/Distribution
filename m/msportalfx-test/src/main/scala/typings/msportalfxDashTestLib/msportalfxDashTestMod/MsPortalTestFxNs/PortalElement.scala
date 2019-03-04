package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalElement extends js.Object {
  var baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator
  var parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator
  def click(): qLib.qMod.QNs.Promise[scala.Unit]
  def getAttribute(attributeName: java.lang.String): qLib.qMod.QNs.Promise[java.lang.String]
  def getLocator(): msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator
  def getText(): qLib.qMod.QNs.Promise[java.lang.String]
  def isDisplayed(): qLib.qMod.QNs.Promise[scala.Boolean]
  def isElementPresent(subLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator): qLib.qMod.QNs.Promise[scala.Boolean]
  def isPresent(): qLib.qMod.QNs.Promise[scala.Boolean]
  def rightClick(): qLib.qMod.QNs.Promise[scala.Unit]
  def sendKeys(var_args: java.lang.String*): qLib.qMod.QNs.Promise[scala.Unit]
}

object PortalElement {
  @scala.inline
  def apply(
    baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    click: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    getAttribute: js.Function1[java.lang.String, qLib.qMod.QNs.Promise[java.lang.String]],
    getLocator: js.Function0[msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator],
    getText: js.Function0[qLib.qMod.QNs.Promise[java.lang.String]],
    isDisplayed: js.Function0[qLib.qMod.QNs.Promise[scala.Boolean]],
    isElementPresent: js.Function1[
      msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator, 
      qLib.qMod.QNs.Promise[scala.Boolean]
    ],
    isPresent: js.Function0[qLib.qMod.QNs.Promise[scala.Boolean]],
    parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    rightClick: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    sendKeys: js.Function1[/* repeated */ java.lang.String, qLib.qMod.QNs.Promise[scala.Unit]]
  ): PortalElement = {
    val __obj = js.Dynamic.literal(baseLocator = baseLocator, click = click, getAttribute = getAttribute, getLocator = getLocator, getText = getText, isDisplayed = isDisplayed, isElementPresent = isElementPresent, isPresent = isPresent, parentLocator = parentLocator, rightClick = rightClick, sendKeys = sendKeys)
  
    __obj.asInstanceOf[PortalElement]
  }
}

