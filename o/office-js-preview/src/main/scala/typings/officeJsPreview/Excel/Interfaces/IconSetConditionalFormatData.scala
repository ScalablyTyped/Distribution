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

/** An interface describing the data returned by calling `iconSetConditionalFormat.toJSON()`. */
@js.native
trait IconSetConditionalFormatData extends js.Object {
  /**
    *
    * An array of Criteria and IconSets for the rules and potential custom icons for conditional icons. Note that for the first criterion only the custom icon can be modified, while type, formula, and operator will be ignored when set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criteria: js.UndefOr[js.Array[ConditionalIconCriterion]] = js.native
  /**
    *
    * If true, reverses the icon orders for the IconSet. Note that this cannot be set if custom icons are used.
    *
    * [Api set: ExcelApi 1.6]
    */
  var reverseIconOrder: js.UndefOr[Boolean] = js.native
  /**
    *
    * If true, hides the values and only shows icons.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showIconOnly: js.UndefOr[Boolean] = js.native
  /**
    *
    * If set, displays the IconSet option for the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var style: js.UndefOr[
    IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
  ] = js.native
}

object IconSetConditionalFormatData {
  @scala.inline
  def apply(): IconSetConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconSetConditionalFormatData]
  }
  @scala.inline
  implicit class IconSetConditionalFormatDataOps[Self <: IconSetConditionalFormatData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCriteriaVarargs(value: ConditionalIconCriterion*): Self = this.set("criteria", js.Array(value :_*))
    @scala.inline
    def setCriteria(value: js.Array[ConditionalIconCriterion]): Self = this.set("criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCriteria: Self = this.set("criteria", js.undefined)
    @scala.inline
    def setReverseIconOrder(value: Boolean): Self = this.set("reverseIconOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverseIconOrder: Self = this.set("reverseIconOrder", js.undefined)
    @scala.inline
    def setShowIconOnly(value: Boolean): Self = this.set("showIconOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowIconOnly: Self = this.set("showIconOnly", js.undefined)
    @scala.inline
    def setStyle(
      value: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
    ): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

