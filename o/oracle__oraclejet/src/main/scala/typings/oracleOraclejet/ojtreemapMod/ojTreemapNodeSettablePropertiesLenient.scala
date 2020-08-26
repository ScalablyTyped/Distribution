package typings.oracleOraclejet.ojtreemapMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.Isolate
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.header
import typings.oracleOraclejet.oracleOraclejetStrings.inherit
import typings.oracleOraclejet.oracleOraclejetStrings.largeChecker
import typings.oracleOraclejet.oracleOraclejetStrings.largeCrosshatch
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiagonalLeft
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiagonalRight
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiamond
import typings.oracleOraclejet.oracleOraclejetStrings.largeTriangle
import typings.oracleOraclejet.oracleOraclejetStrings.node
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.smallChecker
import typings.oracleOraclejet.oracleOraclejetStrings.smallCrosshatch
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiagonalLeft
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiagonalRight
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiamond
import typings.oracleOraclejet.oracleOraclejetStrings.smallTriangle
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojtreemap.ojTreemapNodeSettableProperties> */
@js.native
trait ojTreemapNodeSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var categories: js.UndefOr[js.Array[String]] = js.native
  var color: js.UndefOr[String] = js.native
  var drilling: js.UndefOr[on | off | inherit] = js.native
  var groupLabelDisplay: js.UndefOr[node | off | header] = js.native
  var header: js.UndefOr[Isolate] = js.native
  var label: js.UndefOr[String] = js.native
  var labelDisplay: js.UndefOr[off | node] = js.native
  var labelHalign: js.UndefOr[start | end | center] = js.native
  var labelStyle: js.UndefOr[js.Object] = js.native
  var labelValign: js.UndefOr[top | bottom | center] = js.native
  var pattern: js.UndefOr[
    smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
  ] = js.native
  var selectable: js.UndefOr[off | auto] = js.native
  var shortDesc: js.UndefOr[String] = js.native
  var svgClassName: js.UndefOr[String] = js.native
  var svgStyle: js.UndefOr[js.Object] = js.native
  var value: js.UndefOr[Double] = js.native
}

object ojTreemapNodeSettablePropertiesLenient {
  @scala.inline
  def apply(): ojTreemapNodeSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojTreemapNodeSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojTreemapNodeSettablePropertiesLenientOps[Self <: ojTreemapNodeSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDrilling(value: on | off | inherit): Self = this.set("drilling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrilling: Self = this.set("drilling", js.undefined)
    @scala.inline
    def setGroupLabelDisplay(value: node | off | header): Self = this.set("groupLabelDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupLabelDisplay: Self = this.set("groupLabelDisplay", js.undefined)
    @scala.inline
    def setHeader(value: Isolate): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelDisplay(value: off | node): Self = this.set("labelDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelDisplay: Self = this.set("labelDisplay", js.undefined)
    @scala.inline
    def setLabelHalign(value: start | end | center): Self = this.set("labelHalign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelHalign: Self = this.set("labelHalign", js.undefined)
    @scala.inline
    def setLabelStyle(value: js.Object): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setLabelValign(value: top | bottom | center): Self = this.set("labelValign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelValign: Self = this.set("labelValign", js.undefined)
    @scala.inline
    def setPattern(
      value: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
    ): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setSelectable(value: off | auto): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setShortDesc(value: String): Self = this.set("shortDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortDesc: Self = this.set("shortDesc", js.undefined)
    @scala.inline
    def setSvgClassName(value: String): Self = this.set("svgClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgClassName: Self = this.set("svgClassName", js.undefined)
    @scala.inline
    def setSvgStyle(value: js.Object): Self = this.set("svgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgStyle: Self = this.set("svgStyle", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

