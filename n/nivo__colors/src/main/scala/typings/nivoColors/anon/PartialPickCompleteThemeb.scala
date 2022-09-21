package typings.nivoColors.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<@nivo/core.@nivo/core.CompleteTheme, 'background' | 'fontFamily' | 'fontSize' | 'textColor'> & {  crosshair :std.Partial<{  line :std.Partial<{  stroke :string,   strokeWidth :number,   strokeOpacity :number,   strokeDasharray :string}>}>,   axis :std.Partial<{  domain :std.Partial<{  line :std.Partial<std.Partial<react.react.CSSProperties>>}>,   ticks :std.Partial<{  line :std.Partial<std.Partial<react.react.CSSProperties>>,   text :std.Partial<std.Partial<react.react.CSSProperties>>}>,   legend :std.Partial<{  text :std.Partial<std.Partial<react.react.CSSProperties>>}>}>,   grid :std.Partial<{  line :std.Partial<std.Partial<react.react.CSSProperties>>}>,   legends :std.Partial<{  hidden :std.Partial<{  symbol :std.Partial<{  fill :string,   opacity :number}>,   text :std.Partial<react.react.CSSProperties>}>,   title :std.Partial<{  text :std.Partial<std.Partial<react.react.CSSProperties>>}>,   text :std.Partial<std.Partial<react.react.CSSProperties>>,   ticks :std.Partial<{  line :std.Partial<std.Partial<react.react.CSSProperties>>,   text :std.Partial<std.Partial<react.react.CSSProperties>>}>}>,   labels :std.Partial<{  text :std.Partial<std.Partial<react.react.CSSProperties>>}>,   markers :std.Partial<{  lineColor :string,   lineStrokeWidth :number,   textColor :string,   fontSize :string | 0,   text :std.Partial<react.react.CSSProperties>}>,   dots :std.Partial<{  text :std.Partial<std.Partial<react.react.CSSProperties>>}>,   tooltip :std.Partial<{  container :std.Partial<react.react.CSSProperties>,   basic :std.Partial<react.react.CSSProperties>,   chip :std.Partial<react.react.CSSProperties>,   table :std.Partial<react.react.CSSProperties>,   tableCell :std.Partial<react.react.CSSProperties>,   tableCellValue :std.Partial<react.react.CSSProperties>}>,   annotations :std.Partial<{  text :std.Partial<{  fill :string,   outlineWidth :number,   outlineColor :string,   outlineOpacity :number} & std.Partial<std.Omit<react.react.CSSProperties, 'fill'>>>,   link :std.Partial<{  stroke :string,   strokeWidth :number,   outlineWidth :number,   outlineColor :string,   outlineOpacity :number} & std.Partial<std.Omit<react.react.CSSProperties, 'stroke' | 'strokeWidth'>>>,   outline :std.Partial<{  stroke :string,   strokeWidth :number,   outlineWidth :number,   outlineColor :string,   outlineOpacity :number} & std.Partial<std.Omit<react.react.CSSProperties, 'stroke' | 'strokeWidth'>>>,   symbol :std.Partial<{  fill :string,   outlineWidth :number,   outlineColor :string,   outlineOpacity :number} & std.Partial<std.Omit<react.react.CSSProperties, 'fill'>>>}>}> */
trait PartialPickCompleteThemeb extends StObject {
  
  var annotations: js.UndefOr[PartialtextPartialfillstr] = js.undefined
  
  var axis: js.UndefOr[PartialdomainPartiallineP] = js.undefined
  
  var background: js.UndefOr[String] = js.undefined
  
  var crosshair: js.UndefOr[PartiallinePartialstrokes] = js.undefined
  
  var dots: js.UndefOr[PartialtextPartialPartial] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var grid: js.UndefOr[PartiallinePartialPartial0] = js.undefined
  
  var labels: js.UndefOr[PartialtextPartialPartial] = js.undefined
  
  var legends: js.UndefOr[PartialhiddenPartialsymbo] = js.undefined
  
  var markers: js.UndefOr[PartiallineColorstringlin] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
  
  var tooltip: js.UndefOr[PartialcontainerPartialCS] = js.undefined
}
object PartialPickCompleteThemeb {
  
  inline def apply(): PartialPickCompleteThemeb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickCompleteThemeb]
  }
  
  extension [Self <: PartialPickCompleteThemeb](x: Self) {
    
    inline def setAnnotations(value: PartialtextPartialfillstr): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAxis(value: PartialdomainPartiallineP): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setCrosshair(value: PartiallinePartialstrokes): Self = StObject.set(x, "crosshair", value.asInstanceOf[js.Any])
    
    inline def setCrosshairUndefined: Self = StObject.set(x, "crosshair", js.undefined)
    
    inline def setDots(value: PartialtextPartialPartial): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    inline def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setGrid(value: PartiallinePartialPartial0): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setLabels(value: PartialtextPartialPartial): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLegends(value: PartialhiddenPartialsymbo): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
    
    inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
    
    inline def setMarkers(value: PartiallineColorstringlin): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setTooltip(value: PartialcontainerPartialCS): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
