package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Portal extends js.Object {
  var portalContext: PortalContext = js.native
  def applyFeature(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def executeScript[T](script: java.lang.String): qLib.qMod.QNs.Promise[T] = js.native
  def getBrowserLogs(level: LogLevel): qLib.qMod.QNs.Promise[js.Array[java.lang.String]] = js.native
  def getCurrentUrl(): qLib.qMod.QNs.Promise[java.lang.String] = js.native
  def goHome(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def goHome(timeout: scala.Double): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def navigateToDeepLink(deepLink: java.lang.String): qLib.qMod.QNs.Promise[_] = js.native
  def navigateToDeepLink(deepLink: java.lang.String, timeout: scala.Double): qLib.qMod.QNs.Promise[_] = js.native
  def openBrowseBlade(resourceProvider: java.lang.String, resourceType: java.lang.String, bladeTitle: java.lang.String): qLib.qMod.QNs.Promise[
    msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.BladesNs.BrowseResourceBlade
  ] = js.native
  def openBrowseBlade(
    resourceProvider: java.lang.String,
    resourceType: java.lang.String,
    bladeTitle: java.lang.String,
    timeout: scala.Double
  ): qLib.qMod.QNs.Promise[
    msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.BladesNs.BrowseResourceBlade
  ] = js.native
  def openGalleryCreateBlade(galleryPackageName: java.lang.String, bladeTitle: java.lang.String): qLib.qMod.QNs.Promise[
    msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.BladesNs.CreateBlade
  ] = js.native
  def openGalleryCreateBlade(galleryPackageName: java.lang.String, bladeTitle: java.lang.String, timeout: scala.Double): qLib.qMod.QNs.Promise[
    msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.BladesNs.CreateBlade
  ] = js.native
  def openResourceBlade(resourceId: java.lang.String, bladeTitle: java.lang.String): qLib.qMod.QNs.Promise[msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.BladesNs.Blade] = js.native
  def openResourceBlade(resourceId: java.lang.String, bladeTitle: java.lang.String, timeout: scala.Double): qLib.qMod.QNs.Promise[msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.BladesNs.Blade] = js.native
  def quit(): qLib.qMod.QNs.Promise[_] = js.native
  def takeScreenshot(): qLib.qMod.QNs.Promise[java.lang.String] = js.native
  def takeScreenshot(filePrefix: java.lang.String): qLib.qMod.QNs.Promise[java.lang.String] = js.native
  def waitForElementLocated(locator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator): qLib.qMod.QNs.Promise[_] = js.native
  def waitForElementLocated(
    locator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    timeout: scala.Double
  ): qLib.qMod.QNs.Promise[_] = js.native
  def waitForElementNotVisible(locator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
  def waitForElementNotVisible(
    locator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    timeout: scala.Double
  ): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
  def waitForElementVisible(locator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
  def waitForElementVisible(
    locator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    timeout: scala.Double
  ): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
  def waitForElementsLocated(locator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator): qLib.qMod.QNs.Promise[js.Array[_]] = js.native
  def waitForElementsLocated(
    locator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    timeout: scala.Double
  ): qLib.qMod.QNs.Promise[js.Array[_]] = js.native
  def waitUntilElementContainsAttribute(
    locator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    attributeName: java.lang.String,
    attributeValue: java.lang.String
  ): qLib.qMod.QNs.Promise[_] = js.native
  def waitUntilElementContainsAttribute(
    locator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    attributeName: java.lang.String,
    attributeValue: java.lang.String,
    timeout: scala.Double
  ): qLib.qMod.QNs.Promise[_] = js.native
  def waitUntilElementDoesNotContainAttribute(
    locator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    attributeName: java.lang.String,
    attributeValue: java.lang.String
  ): qLib.qMod.QNs.Promise[_] = js.native
  def waitUntilElementDoesNotContainAttribute(
    locator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    attributeName: java.lang.String,
    attributeValue: java.lang.String,
    timeout: scala.Double
  ): qLib.qMod.QNs.Promise[_] = js.native
}

