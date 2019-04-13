package typings
package msportalfxDashTestLib.msportalfxDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "Portal")
@js.native
class Portal () extends js.Object {
  var portalContext: PortalContext = js.native
  def applyFeature(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def executeScript[T](script: java.lang.String): qLib.qMod.Promise[T] = js.native
  def getBrowserLogs(level: LogLevel): qLib.qMod.Promise[js.Array[java.lang.String]] = js.native
  def getCurrentUrl(): qLib.qMod.Promise[java.lang.String] = js.native
  def goHome(): qLib.qMod.Promise[scala.Unit] = js.native
  def goHome(timeout: scala.Double): qLib.qMod.Promise[scala.Unit] = js.native
  def navigateToDeepLink(deepLink: java.lang.String): qLib.qMod.Promise[_] = js.native
  def navigateToDeepLink(deepLink: java.lang.String, timeout: scala.Double): qLib.qMod.Promise[_] = js.native
  def openBrowseBlade(resourceProvider: java.lang.String, resourceType: java.lang.String, bladeTitle: java.lang.String): qLib.qMod.Promise[msportalfxDashTestLib.msportalfxDashTestMod.BladesNs.BrowseResourceBlade] = js.native
  def openBrowseBlade(
    resourceProvider: java.lang.String,
    resourceType: java.lang.String,
    bladeTitle: java.lang.String,
    timeout: scala.Double
  ): qLib.qMod.Promise[msportalfxDashTestLib.msportalfxDashTestMod.BladesNs.BrowseResourceBlade] = js.native
  def openGalleryCreateBlade(galleryPackageName: java.lang.String, bladeTitle: java.lang.String): qLib.qMod.Promise[msportalfxDashTestLib.msportalfxDashTestMod.BladesNs.CreateBlade] = js.native
  def openGalleryCreateBlade(galleryPackageName: java.lang.String, bladeTitle: java.lang.String, timeout: scala.Double): qLib.qMod.Promise[msportalfxDashTestLib.msportalfxDashTestMod.BladesNs.CreateBlade] = js.native
  def openResourceBlade(resourceId: java.lang.String, bladeTitle: java.lang.String): qLib.qMod.Promise[msportalfxDashTestLib.msportalfxDashTestMod.BladesNs.Blade] = js.native
  def openResourceBlade(resourceId: java.lang.String, bladeTitle: java.lang.String, timeout: scala.Double): qLib.qMod.Promise[msportalfxDashTestLib.msportalfxDashTestMod.BladesNs.Blade] = js.native
  def quit(): qLib.qMod.Promise[_] = js.native
  def takeScreenshot(): qLib.qMod.Promise[java.lang.String] = js.native
  def takeScreenshot(filePrefix: java.lang.String): qLib.qMod.Promise[java.lang.String] = js.native
  def waitForElementLocated(locator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator): qLib.qMod.Promise[_] = js.native
  def waitForElementLocated(locator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator, timeout: scala.Double): qLib.qMod.Promise[_] = js.native
  def waitForElementNotVisible(locator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator): qLib.qMod.Promise[scala.Boolean] = js.native
  def waitForElementNotVisible(locator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator, timeout: scala.Double): qLib.qMod.Promise[scala.Boolean] = js.native
  def waitForElementVisible(locator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator): qLib.qMod.Promise[scala.Boolean] = js.native
  def waitForElementVisible(locator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator, timeout: scala.Double): qLib.qMod.Promise[scala.Boolean] = js.native
  def waitForElementsLocated(locator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator): qLib.qMod.Promise[js.Array[_]] = js.native
  def waitForElementsLocated(locator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator, timeout: scala.Double): qLib.qMod.Promise[js.Array[_]] = js.native
  def waitUntilElementContainsAttribute(
    locator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator,
    attributeName: java.lang.String,
    attributeValue: java.lang.String
  ): qLib.qMod.Promise[_] = js.native
  def waitUntilElementContainsAttribute(
    locator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator,
    attributeName: java.lang.String,
    attributeValue: java.lang.String,
    timeout: scala.Double
  ): qLib.qMod.Promise[_] = js.native
  def waitUntilElementDoesNotContainAttribute(
    locator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator,
    attributeName: java.lang.String,
    attributeValue: java.lang.String
  ): qLib.qMod.Promise[_] = js.native
  def waitUntilElementDoesNotContainAttribute(
    locator: msportalfxDashTestLib.msportalfxDashTestMod.LocatorsNs.Locator,
    attributeName: java.lang.String,
    attributeValue: java.lang.String,
    timeout: scala.Double
  ): qLib.qMod.Promise[_] = js.native
}

