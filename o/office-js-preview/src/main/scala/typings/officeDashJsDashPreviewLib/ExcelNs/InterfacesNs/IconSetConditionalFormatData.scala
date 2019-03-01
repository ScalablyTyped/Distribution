package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "iconSetConditionalFormat.toJSON()". */
trait IconSetConditionalFormatData extends js.Object {
  /**
    *
    * An array of Criteria and IconSets for the rules and potential custom icons for conditional icons. Note that for the first criterion only the custom icon can be modified, while type, formula, and operator will be ignored when set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criteria: js.UndefOr[js.Array[officeDashJsDashPreviewLib.ExcelNs.ConditionalIconCriterion]] = js.undefined
  /**
    *
    * If true, reverses the icon orders for the IconSet. Note that this cannot be set if custom icons are used.
    *
    * [Api set: ExcelApi 1.6]
    */
  var reverseIconOrder: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * If true, hides the values and only shows icons.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showIconOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * If set, displays the IconSet option for the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var style: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.IconSet | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Invalid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeArrows | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeArrowsGray | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeFlags | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeTrafficLights1 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeTrafficLights2 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeSigns | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeSymbols | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeSymbols2 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourArrows | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourArrowsGray | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourRedToBlack | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourRating | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourTrafficLights | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveArrows | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveArrowsGray | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveRating | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveQuarters | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeStars | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeTriangles | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveBoxes | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LinkedEntityFinanceIcon | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LinkedEntityMapIcon
  ] = js.undefined
}

object IconSetConditionalFormatData {
  @scala.inline
  def apply(
    criteria: js.Array[officeDashJsDashPreviewLib.ExcelNs.ConditionalIconCriterion] = null,
    reverseIconOrder: js.UndefOr[scala.Boolean] = js.undefined,
    showIconOnly: js.UndefOr[scala.Boolean] = js.undefined,
    style: officeDashJsDashPreviewLib.ExcelNs.IconSet | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Invalid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeArrows | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeArrowsGray | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeFlags | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeTrafficLights1 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeTrafficLights2 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeSigns | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeSymbols | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeSymbols2 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourArrows | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourArrowsGray | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourRedToBlack | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourRating | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourTrafficLights | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveArrows | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveArrowsGray | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveRating | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveQuarters | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeStars | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeTriangles | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveBoxes | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LinkedEntityFinanceIcon | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LinkedEntityMapIcon = null
  ): IconSetConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria)
    if (!js.isUndefined(reverseIconOrder)) __obj.updateDynamic("reverseIconOrder")(reverseIconOrder)
    if (!js.isUndefined(showIconOnly)) __obj.updateDynamic("showIconOnly")(showIconOnly)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconSetConditionalFormatData]
  }
}

