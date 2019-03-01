package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.BladesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecPickerBlade extends Blade {
  def pickSpec(specCode: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit]
}

object SpecPickerBlade {
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
    pickSpec: js.Function1[java.lang.String, qLib.qMod.QNs.Promise[scala.Unit]],
    rightClick: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    sendKeys: js.Function1[/* repeated */ java.lang.String, qLib.qMod.QNs.Promise[scala.Unit]],
    title: java.lang.String
  ): SpecPickerBlade = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseLocator")(baseLocator)
    __obj.updateDynamic("click")(click)
    __obj.updateDynamic("clickCommand")(clickCommand)
    __obj.updateDynamic("getAttribute")(getAttribute)
    __obj.updateDynamic("getLocator")(getLocator)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("getTiles")(getTiles)
    __obj.updateDynamic("isDisplayed")(isDisplayed)
    __obj.updateDynamic("isElementPresent")(isElementPresent)
    __obj.updateDynamic("isPresent")(isPresent)
    __obj.updateDynamic("parentLocator")(parentLocator)
    __obj.updateDynamic("pickSpec")(pickSpec)
    __obj.updateDynamic("rightClick")(rightClick)
    __obj.updateDynamic("sendKeys")(sendKeys)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SpecPickerBlade]
  }
}

