package typings
package msportalfxDashTestLib.msportalfxDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "PortalElement")
@js.native
class PortalElement protected () extends js.Object {
  def this(baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
  def this(baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator, parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator) = this()
  var baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator = js.native
  var parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator = js.native
  def click(): qLib.qMod.Promise[scala.Unit] = js.native
  def getAttribute(attributeName: java.lang.String): qLib.qMod.Promise[java.lang.String] = js.native
  def getLocator(): msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator = js.native
  def getText(): qLib.qMod.Promise[java.lang.String] = js.native
  def isDisplayed(): qLib.qMod.Promise[scala.Boolean] = js.native
  def isElementPresent(subLocator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator): qLib.qMod.Promise[scala.Boolean] = js.native
  def isPresent(): qLib.qMod.Promise[scala.Boolean] = js.native
  def rightClick(): qLib.qMod.Promise[scala.Unit] = js.native
  def sendKeys(var_args: java.lang.String*): qLib.qMod.Promise[scala.Unit] = js.native
}

