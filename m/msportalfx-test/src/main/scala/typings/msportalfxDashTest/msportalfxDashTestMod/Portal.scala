package typings.msportalfxDashTest.msportalfxDashTestMod

import typings.msportalfxDashTest.msportalfxDashTestMod.BladesNs.Blade
import typings.msportalfxDashTest.msportalfxDashTestMod.BladesNs.BrowseResourceBlade
import typings.msportalfxDashTest.msportalfxDashTestMod.BladesNs.CreateBlade
import typings.msportalfxDashTest.msportalfxDashTestMod.LocatorsNs.Locator
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "Portal")
@js.native
class Portal () extends js.Object {
  var portalContext: PortalContext = js.native
  def applyFeature(name: String, value: String): Unit = js.native
  def executeScript[T](script: String): Promise[T] = js.native
  def getBrowserLogs(level: LogLevel): Promise[js.Array[String]] = js.native
  def getCurrentUrl(): Promise[String] = js.native
  def goHome(): Promise[Unit] = js.native
  def goHome(timeout: Double): Promise[Unit] = js.native
  def navigateToDeepLink(deepLink: String): Promise[_] = js.native
  def navigateToDeepLink(deepLink: String, timeout: Double): Promise[_] = js.native
  def openBrowseBlade(resourceProvider: String, resourceType: String, bladeTitle: String): Promise[BrowseResourceBlade] = js.native
  def openBrowseBlade(resourceProvider: String, resourceType: String, bladeTitle: String, timeout: Double): Promise[BrowseResourceBlade] = js.native
  def openGalleryCreateBlade(galleryPackageName: String, bladeTitle: String): Promise[CreateBlade] = js.native
  def openGalleryCreateBlade(galleryPackageName: String, bladeTitle: String, timeout: Double): Promise[CreateBlade] = js.native
  def openResourceBlade(resourceId: String, bladeTitle: String): Promise[Blade] = js.native
  def openResourceBlade(resourceId: String, bladeTitle: String, timeout: Double): Promise[Blade] = js.native
  def quit(): Promise[_] = js.native
  def takeScreenshot(): Promise[String] = js.native
  def takeScreenshot(filePrefix: String): Promise[String] = js.native
  def waitForElementLocated(locator: Locator): Promise[_] = js.native
  def waitForElementLocated(locator: Locator, timeout: Double): Promise[_] = js.native
  def waitForElementNotVisible(locator: Locator): Promise[Boolean] = js.native
  def waitForElementNotVisible(locator: Locator, timeout: Double): Promise[Boolean] = js.native
  def waitForElementVisible(locator: Locator): Promise[Boolean] = js.native
  def waitForElementVisible(locator: Locator, timeout: Double): Promise[Boolean] = js.native
  def waitForElementsLocated(locator: Locator): Promise[js.Array[_]] = js.native
  def waitForElementsLocated(locator: Locator, timeout: Double): Promise[js.Array[_]] = js.native
  def waitUntilElementContainsAttribute(locator: Locator, attributeName: String, attributeValue: String): Promise[_] = js.native
  def waitUntilElementContainsAttribute(locator: Locator, attributeName: String, attributeValue: String, timeout: Double): Promise[_] = js.native
  def waitUntilElementDoesNotContainAttribute(locator: Locator, attributeName: String, attributeValue: String): Promise[_] = js.native
  def waitUntilElementDoesNotContainAttribute(locator: Locator, attributeName: String, attributeValue: String, timeout: Double): Promise[_] = js.native
}

