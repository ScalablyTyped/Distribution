package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import typings.officeDashJsDashPreview.ExcelNs.ConditionalIconCriterion
import typings.officeDashJsDashPreview.ExcelNs.IconSet
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FiveArrows
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FiveArrowsGray
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FiveBoxes
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FiveQuarters
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FiveRating
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FourArrows
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FourArrowsGray
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FourRating
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FourRedToBlack
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FourTrafficLights
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Invalid
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LinkedEntityFinanceIcon
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LinkedEntityMapIcon
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeArrows
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeArrowsGray
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeFlags
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeSigns
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeStars
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeSymbols
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeSymbols2
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeTrafficLights1
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeTrafficLights2
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeTriangles
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
    IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes | LinkedEntityFinanceIcon | LinkedEntityMapIcon
  ] = js.undefined
}

object IconSetConditionalFormatUpdateData {
  @scala.inline
  def apply(
    criteria: js.Array[ConditionalIconCriterion] = null,
    reverseIconOrder: js.UndefOr[Boolean] = js.undefined,
    showIconOnly: js.UndefOr[Boolean] = js.undefined,
    style: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes | LinkedEntityFinanceIcon | LinkedEntityMapIcon = null
  ): IconSetConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria)
    if (!js.isUndefined(reverseIconOrder)) __obj.updateDynamic("reverseIconOrder")(reverseIconOrder)
    if (!js.isUndefined(showIconOnly)) __obj.updateDynamic("showIconOnly")(showIconOnly)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconSetConditionalFormatUpdateData]
  }
}

