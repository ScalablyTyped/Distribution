package typings.msportalfxDashTest.msportalfxDashTestMod

import typings.msportalfxDashTest.msportalfxDashTestMod.Locators.Locator
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "PortalElement")
@js.native
class PortalElement protected () extends js.Object {
  def this(baseLocator: Locator) = this()
  def this(baseLocator: Locator, parentLocator: Locator) = this()
  var baseLocator: Locator = js.native
  var parentLocator: Locator = js.native
  def click(): Promise[Unit] = js.native
  def getAttribute(attributeName: String): Promise[String] = js.native
  def getLocator(): Locator = js.native
  def getText(): Promise[String] = js.native
  def isDisplayed(): Promise[Boolean] = js.native
  def isElementPresent(subLocator: Locator): Promise[Boolean] = js.native
  def isPresent(): Promise[Boolean] = js.native
  def rightClick(): Promise[Unit] = js.native
  def sendKeys(var_args: String*): Promise[Unit] = js.native
}

