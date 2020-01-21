package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ConditionalIconCriterion
import typings.officeJsPreview.Excel.IconSet
import typings.officeJsPreview.officeJsPreviewStrings.FiveArrows
import typings.officeJsPreview.officeJsPreviewStrings.FiveArrowsGray
import typings.officeJsPreview.officeJsPreviewStrings.FiveBoxes
import typings.officeJsPreview.officeJsPreviewStrings.FiveQuarters
import typings.officeJsPreview.officeJsPreviewStrings.FiveRating
import typings.officeJsPreview.officeJsPreviewStrings.FourArrows
import typings.officeJsPreview.officeJsPreviewStrings.FourArrowsGray
import typings.officeJsPreview.officeJsPreviewStrings.FourRating
import typings.officeJsPreview.officeJsPreviewStrings.FourRedToBlack
import typings.officeJsPreview.officeJsPreviewStrings.FourTrafficLights
import typings.officeJsPreview.officeJsPreviewStrings.Invalid
import typings.officeJsPreview.officeJsPreviewStrings.ThreeArrows
import typings.officeJsPreview.officeJsPreviewStrings.ThreeArrowsGray
import typings.officeJsPreview.officeJsPreviewStrings.ThreeFlags
import typings.officeJsPreview.officeJsPreviewStrings.ThreeSigns
import typings.officeJsPreview.officeJsPreviewStrings.ThreeStars
import typings.officeJsPreview.officeJsPreviewStrings.ThreeSymbols
import typings.officeJsPreview.officeJsPreviewStrings.ThreeSymbols2
import typings.officeJsPreview.officeJsPreviewStrings.ThreeTrafficLights1
import typings.officeJsPreview.officeJsPreviewStrings.ThreeTrafficLights2
import typings.officeJsPreview.officeJsPreviewStrings.ThreeTriangles
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
    if (!js.isUndefined(reverseIconOrder)) __obj.updateDynamic("reverseIconOrder")(reverseIconOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(showIconOnly)) __obj.updateDynamic("showIconOnly")(showIconOnly.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconSetConditionalFormatUpdateData]
  }
}

