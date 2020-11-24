package typings.oracleOraclejet.ojnboxMod.ojNBox

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait Cell extends js.Object {
  
  var column: String = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var labelHalign: js.UndefOr[String] = js.native
  
  var labelStyle: js.UndefOr[js.Object] = js.native
  
  var maximizedSvgClassName: js.UndefOr[String] = js.native
  
  var maximizedSvgStyle: js.UndefOr[js.Object] = js.native
  
  var minimizedSvgClassName: js.UndefOr[String] = js.native
  
  var minimizedSvgStyle: js.UndefOr[js.Object] = js.native
  
  var row: String = js.native
  
  var shortDesc: js.UndefOr[String] = js.native
  
  var showCount: js.UndefOr[on | off | auto | String] = js.native
  
  var svgClassName: js.UndefOr[String] = js.native
  
  var svgStyle: js.UndefOr[js.Object] = js.native
}
object Cell {
  
  @scala.inline
  def apply(column: String, row: String): Cell = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
  
  @scala.inline
  implicit class CellOps[Self <: Cell] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: String): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: String): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelHalign(value: String): Self = this.set("labelHalign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelHalign: Self = this.set("labelHalign", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    
    @scala.inline
    def setMaximizedSvgClassName(value: String): Self = this.set("maximizedSvgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximizedSvgClassName: Self = this.set("maximizedSvgClassName", js.undefined)
    
    @scala.inline
    def setMaximizedSvgStyle(value: js.Object): Self = this.set("maximizedSvgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximizedSvgStyle: Self = this.set("maximizedSvgStyle", js.undefined)
    
    @scala.inline
    def setMinimizedSvgClassName(value: String): Self = this.set("minimizedSvgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimizedSvgClassName: Self = this.set("minimizedSvgClassName", js.undefined)
    
    @scala.inline
    def setMinimizedSvgStyle(value: js.Object): Self = this.set("minimizedSvgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimizedSvgStyle: Self = this.set("minimizedSvgStyle", js.undefined)
    
    @scala.inline
    def setShortDesc(value: String): Self = this.set("shortDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortDesc: Self = this.set("shortDesc", js.undefined)
    
    @scala.inline
    def setShowCount(value: on | off | auto | String): Self = this.set("showCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCount: Self = this.set("showCount", js.undefined)
    
    @scala.inline
    def setSvgClassName(value: String): Self = this.set("svgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSvgClassName: Self = this.set("svgClassName", js.undefined)
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = this.set("svgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSvgStyle: Self = this.set("svgStyle", js.undefined)
  }
}
