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

