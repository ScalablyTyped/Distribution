package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartBoard extends PortalElement {
  def getTiles(): qLib.qMod.QNs.Promise[
    js.Array[msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.PartsNs.Tile]
  ]
}

object StartBoard {
  @scala.inline
  def apply(
    baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    click: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    getAttribute: js.Function1[java.lang.String, qLib.qMod.QNs.Promise[java.lang.String]],
    getLocator: js.Function0[msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator],
    getText: js.Function0[qLib.qMod.QNs.Promise[java.lang.String]],
    getTiles: js.Function0[
      qLib.qMod.QNs.Promise[
        js.Array[msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.PartsNs.Tile]
      ]
    ],
    isDisplayed: js.Function0[qLib.qMod.QNs.Promise[scala.Boolean]],
    isElementPresent: js.Function1[
      msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator, 
      qLib.qMod.QNs.Promise[scala.Boolean]
    ],
    isPresent: js.Function0[qLib.qMod.QNs.Promise[scala.Boolean]],
    parentLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    rightClick: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    sendKeys: js.Function1[/* repeated */ java.lang.String, qLib.qMod.QNs.Promise[scala.Unit]]
  ): StartBoard = {
    val __obj = js.Dynamic.literal(baseLocator = baseLocator, click = click, getAttribute = getAttribute, getLocator = getLocator, getText = getText, getTiles = getTiles, isDisplayed = isDisplayed, isElementPresent = isElementPresent, isPresent = isPresent, parentLocator = parentLocator, rightClick = rightClick, sendKeys = sendKeys)
  
    __obj.asInstanceOf[StartBoard]
  }
}

