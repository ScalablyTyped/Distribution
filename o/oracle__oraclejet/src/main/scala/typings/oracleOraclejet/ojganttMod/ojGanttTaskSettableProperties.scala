package typings.oracleOraclejet.ojganttMod

import typings.oracleOraclejet.anon.End
import typings.oracleOraclejet.anon.Value
import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.innerCenter
import typings.oracleOraclejet.oracleOraclejetStrings.innerEnd
import typings.oracleOraclejet.oracleOraclejetStrings.innerStart
import typings.oracleOraclejet.oracleOraclejetStrings.milestone
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.normal
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.summary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojGanttTaskSettableProperties extends JetSettableProperties {
  
  var baseline: End = js.native
  
  var borderRadius: String = js.native
  
  var end: String = js.native
  
  var height: Double | Null = js.native
  
  var label: String = js.native
  
  var labelPosition: start | innerCenter | innerStart | innerEnd | end | none = js.native
  
  var labelStyle: js.Object = js.native
  
  var progress: Value = js.native
  
  var rowId: js.UndefOr[js.Any] = js.native
  
  var shortDesc: String | Null = js.native
  
  var start: String = js.native
  
  var svgClassName: String = js.native
  
  var svgStyle: js.Object = js.native
  
  var `type`: normal | milestone | summary | auto = js.native
}
object ojGanttTaskSettableProperties {
  
  @scala.inline
  def apply(
    baseline: End,
    borderRadius: String,
    end: String,
    label: String,
    labelPosition: start | innerCenter | innerStart | innerEnd | end | none,
    labelStyle: js.Object,
    progress: Value,
    start: String,
    svgClassName: String,
    svgStyle: js.Object,
    `type`: normal | milestone | summary | auto
  ): ojGanttTaskSettableProperties = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelPosition = labelPosition.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttTaskSettableProperties]
  }
  
  @scala.inline
  implicit class ojGanttTaskSettablePropertiesOps[Self <: ojGanttTaskSettableProperties] (val x: Self) extends AnyVal {
    
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
    def setBaseline(value: End): Self = this.set("baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadius(value: String): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPosition(value: start | innerCenter | innerStart | innerEnd | end | none): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Value): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgClassName(value: String): Self = this.set("svgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = this.set("svgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: normal | milestone | summary | auto): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightNull: Self = this.set("height", null)
    
    @scala.inline
    def setRowId(value: js.Any): Self = this.set("rowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowId: Self = this.set("rowId", js.undefined)
    
    @scala.inline
    def setShortDesc(value: String): Self = this.set("shortDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescNull: Self = this.set("shortDesc", null)
  }
}
