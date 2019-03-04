package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.BladesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowseResourceBlade extends Blade {
  def filterItems(filter: java.lang.String): qLib.qMod.QNs.Promise[BrowseResourceBlade]
  def selectResource(resourceName: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit]
}

object BrowseResourceBlade {
  @scala.inline
  def apply(
    baseLocator: msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs.Locator,
    click: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    clickCommand: js.Function1[java.lang.String, qLib.qMod.QNs.Promise[Blade]],
    filterItems: js.Function1[java.lang.String, qLib.qMod.QNs.Promise[BrowseResourceBlade]],
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
    selectResource: js.Function1[java.lang.String, qLib.qMod.QNs.Promise[scala.Unit]],
    sendKeys: js.Function1[/* repeated */ java.lang.String, qLib.qMod.QNs.Promise[scala.Unit]],
    title: java.lang.String
  ): BrowseResourceBlade = {
    val __obj = js.Dynamic.literal(baseLocator = baseLocator, click = click, clickCommand = clickCommand, filterItems = filterItems, getAttribute = getAttribute, getLocator = getLocator, getText = getText, getTiles = getTiles, isDisplayed = isDisplayed, isElementPresent = isElementPresent, isPresent = isPresent, parentLocator = parentLocator, rightClick = rightClick, selectResource = selectResource, sendKeys = sendKeys, title = title)
  
    __obj.asInstanceOf[BrowseResourceBlade]
  }
}

