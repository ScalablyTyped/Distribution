package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.BladesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickStartBlade extends Blade {
  def clickLink(linkText: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit]
}

object QuickStartBlade {
  @scala.inline
  def apply(
    baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    click: () => qLib.qMod.QNs.Promise[scala.Unit],
    clickCommand: java.lang.String => qLib.qMod.QNs.Promise[Blade],
    clickLink: java.lang.String => qLib.qMod.QNs.Promise[scala.Unit],
    getAttribute: java.lang.String => qLib.qMod.QNs.Promise[java.lang.String],
    getLocator: () => msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    getText: () => qLib.qMod.QNs.Promise[java.lang.String],
    getTiles: () => qLib.qMod.QNs.Promise[
      js.Array[msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.PartsNs.Tile]
    ],
    isDisplayed: () => qLib.qMod.QNs.Promise[scala.Boolean],
    isElementPresent: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator => qLib.qMod.QNs.Promise[scala.Boolean],
    isPresent: () => qLib.qMod.QNs.Promise[scala.Boolean],
    parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    rightClick: () => qLib.qMod.QNs.Promise[scala.Unit],
    sendKeys: /* repeated */ java.lang.String => qLib.qMod.QNs.Promise[scala.Unit],
    title: java.lang.String
  ): QuickStartBlade = {
    val __obj = js.Dynamic.literal(baseLocator = baseLocator, click = js.Any.fromFunction0(click), clickCommand = js.Any.fromFunction1(clickCommand), clickLink = js.Any.fromFunction1(clickLink), getAttribute = js.Any.fromFunction1(getAttribute), getLocator = js.Any.fromFunction0(getLocator), getText = js.Any.fromFunction0(getText), getTiles = js.Any.fromFunction0(getTiles), isDisplayed = js.Any.fromFunction0(isDisplayed), isElementPresent = js.Any.fromFunction1(isElementPresent), isPresent = js.Any.fromFunction0(isPresent), parentLocator = parentLocator, rightClick = js.Any.fromFunction0(rightClick), sendKeys = js.Any.fromFunction1(sendKeys), title = title)
  
    __obj.asInstanceOf[QuickStartBlade]
  }
}

