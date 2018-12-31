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

