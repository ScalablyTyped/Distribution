package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ConditionalIconCriterion
import typings.officeJs.Excel.IconSet
import typings.officeJs.officeJsStrings.FiveArrows
import typings.officeJs.officeJsStrings.FiveArrowsGray
import typings.officeJs.officeJsStrings.FiveBoxes
import typings.officeJs.officeJsStrings.FiveQuarters
import typings.officeJs.officeJsStrings.FiveRating
import typings.officeJs.officeJsStrings.FourArrows
import typings.officeJs.officeJsStrings.FourArrowsGray
import typings.officeJs.officeJsStrings.FourRating
import typings.officeJs.officeJsStrings.FourRedToBlack
import typings.officeJs.officeJsStrings.FourTrafficLights
import typings.officeJs.officeJsStrings.Invalid
import typings.officeJs.officeJsStrings.ThreeArrows
import typings.officeJs.officeJsStrings.ThreeArrowsGray
import typings.officeJs.officeJsStrings.ThreeFlags
import typings.officeJs.officeJsStrings.ThreeSigns
import typings.officeJs.officeJsStrings.ThreeStars
import typings.officeJs.officeJsStrings.ThreeSymbols
import typings.officeJs.officeJsStrings.ThreeSymbols2
import typings.officeJs.officeJsStrings.ThreeTrafficLights1
import typings.officeJs.officeJsStrings.ThreeTrafficLights2
import typings.officeJs.officeJsStrings.ThreeTriangles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the IconSetConditionalFormat object, for use in `iconSetConditionalFormat.set({ ... })`. */
trait IconSetConditionalFormatUpdateData extends js.Object {
  /**
    *
    * An array of Criteria and IconSets for the rules and potential custom icons for conditional icons. Note that for the first criterion only the custom icon can be modified, while type, formula, and operator will be ignored when set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criteria: js.UndefOr[js.Array[ConditionalIconCriterion]] = js.undefined
  /**
    *
    * If true, reverses the icon orders for the IconSet. Note that this cannot be set if custom icons are used.
    *
    * [Api set: ExcelApi 1.6]
    */
  var reverseIconOrder: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * If true, hides the values and only shows icons.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showIconOnly: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * If set, displays the IconSet option for the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var style: js.UndefOr[
    IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
  ] = js.undefined
}

object IconSetConditionalFormatUpdateData {
  @scala.inline
  def apply(
    criteria: js.Array[ConditionalIconCriterion] = null,
    reverseIconOrder: js.UndefOr[Boolean] = js.undefined,
    showIconOnly: js.UndefOr[Boolean] = js.undefined,
    style: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes = null
  ): IconSetConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseIconOrder)) __obj.updateDynamic("reverseIconOrder")(reverseIconOrder.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showIconOnly)) __obj.updateDynamic("showIconOnly")(showIconOnly.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconSetConditionalFormatUpdateData]
  }
}

