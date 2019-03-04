package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.BladesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blade
  extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.PortalElement {
  var title: java.lang.String
  def clickCommand(commandText: java.lang.String): qLib.qMod.QNs.Promise[Blade]
  def getTiles(): qLib.qMod.QNs.Promise[
    js.Array[msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.PartsNs.Tile]
  ]
}

object Blade {
  @scala.inline
  def apply(
    baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    click: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    clickCommand: js.Function1[java.lang.String, qLib.qMod.QNs.Promise[Blade]],
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
    sendKeys: js.Function1[/* repeated */ java.lang.String, qLib.qMod.QNs.Promise[scala.Unit]],
    title: java.lang.String
  ): Blade = {
    val __obj = js.Dynamic.literal(baseLocator = baseLocator, click = click, clickCommand = clickCommand, getAttribute = getAttribute, getLocator = getLocator, getText = getText, getTiles = getTiles, isDisplayed = isDisplayed, isElementPresent = isElementPresent, isPresent = isPresent, parentLocator = parentLocator, rightClick = rightClick, sendKeys = sendKeys, title = title)
  
    __obj.asInstanceOf[Blade]
  }
}

