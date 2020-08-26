package typings.oracleOraclejet.ojnboxMod

import typings.oracleOraclejet.anon.BorderRadiusBorderWidth
import typings.oracleOraclejet.anon.BorderWidthColor
import typings.oracleOraclejet.mod.JetSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojNBoxNodeSettableProperties extends JetSettableProperties {
  var borderColor: String = js.native
  var borderWidth: Double = js.native
  var categories: js.Array[String] = js.native
  var color: js.UndefOr[String] = js.native
  var column: String = js.native
  var groupCategory: js.UndefOr[String] = js.native
  var icon: js.UndefOr[BorderRadiusBorderWidth] = js.native
  var indicatorColor: js.UndefOr[String] = js.native
  var indicatorIcon: js.UndefOr[BorderWidthColor] = js.native
  var label: String = js.native
  var row: String = js.native
  var secondaryLabel: String = js.native
  var shortDesc: String = js.native
  var svgClassName: String = js.native
  var svgStyle: js.Object | Null = js.native
  var xPercentage: js.UndefOr[Double | Null] = js.native
  var yPercentage: js.UndefOr[Double | Null] = js.native
}

object ojNBoxNodeSettableProperties {
  @scala.inline
  def apply(
    borderColor: String,
    borderWidth: Double,
    categories: js.Array[String],
    column: String,
    label: String,
    row: String,
    secondaryLabel: String,
    shortDesc: String,
    svgClassName: String
  ): ojNBoxNodeSettableProperties = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], secondaryLabel = secondaryLabel.asInstanceOf[js.Any], shortDesc = shortDesc.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNBoxNodeSettableProperties]
  }
  @scala.inline
  implicit class ojNBoxNodeSettablePropertiesOps[Self <: ojNBoxNodeSettableProperties] (val x: Self) extends AnyVal {
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
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumn(value: String): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: String): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondaryLabel(value: String): Self = this.set("secondaryLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortDesc(value: String): Self = this.set("shortDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgClassName(value: String): Self = this.set("svgClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setGroupCategory(value: String): Self = this.set("groupCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupCategory: Self = this.set("groupCategory", js.undefined)
    @scala.inline
    def setIcon(value: BorderRadiusBorderWidth): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIndicatorColor(value: String): Self = this.set("indicatorColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicatorColor: Self = this.set("indicatorColor", js.undefined)
    @scala.inline
    def setIndicatorIcon(value: BorderWidthColor): Self = this.set("indicatorIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicatorIcon: Self = this.set("indicatorIcon", js.undefined)
    @scala.inline
    def setSvgStyle(value: js.Object): Self = this.set("svgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgStyleNull: Self = this.set("svgStyle", null)
    @scala.inline
    def setXPercentage(value: Double): Self = this.set("xPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXPercentage: Self = this.set("xPercentage", js.undefined)
    @scala.inline
    def setXPercentageNull: Self = this.set("xPercentage", null)
    @scala.inline
    def setYPercentage(value: Double): Self = this.set("yPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYPercentage: Self = this.set("yPercentage", js.undefined)
    @scala.inline
    def setYPercentageNull: Self = this.set("yPercentage", null)
  }
  
}

