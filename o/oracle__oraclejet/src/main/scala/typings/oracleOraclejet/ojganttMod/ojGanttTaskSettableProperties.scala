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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojGanttTaskSettableProperties
  extends StObject
     with JetSettableProperties {
  
  var baseline: End
  
  var borderRadius: String
  
  var end: String
  
  var height: Double | Null
  
  var label: String
  
  var labelPosition: start | innerCenter | innerStart | innerEnd | end | none
  
  var labelStyle: js.Object
  
  var progress: Value
  
  var rowId: js.UndefOr[Any] = js.undefined
  
  var shortDesc: String | Null
  
  var start: String
  
  var svgClassName: String
  
  var svgStyle: js.Object
  
  var `type`: normal | milestone | summary | auto
}
object ojGanttTaskSettableProperties {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelPosition = labelPosition.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], height = null, shortDesc = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttTaskSettableProperties]
  }
  
  extension [Self <: ojGanttTaskSettableProperties](x: Self) {
    
    inline def setBaseline(value: End): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBorderRadius(value: String): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelPosition(value: start | innerCenter | innerStart | innerEnd | end | none): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
    
    inline def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Value): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setRowId(value: Any): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
    
    inline def setRowIdUndefined: Self = StObject.set(x, "rowId", js.undefined)
    
    inline def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
    
    inline def setShortDescNull: Self = StObject.set(x, "shortDesc", null)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    inline def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    inline def setType(value: normal | milestone | summary | auto): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
