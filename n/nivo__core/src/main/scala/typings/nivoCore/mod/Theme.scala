package typings.nivoCore.mod

import typings.nivoCore.anon.PartialcontainerPartialCS
import typings.nivoCore.anon.PartialdomainPartiallineP
import typings.nivoCore.anon.PartialhiddenPartialsymbo
import typings.nivoCore.anon.PartiallineColorstringlin
import typings.nivoCore.anon.PartiallinePartialPartial
import typings.nivoCore.anon.PartiallinePartialstrokes
import typings.nivoCore.anon.PartialtextPartialPartial
import typings.nivoCore.anon.PartialtextPartialfillstr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<@nivo/core.@nivo/core.CompleteTheme, 'background' | 'fontFamily' | 'fontSize' | 'textColor'> & {  crosshair :std.Partial<{  line :std.Partial<@nivo/core.@nivo/core.CompleteTheme['crosshair']['line']>}>,   axis :std.Partial<{  domain :std.Partial<{  line :std.Partial<@nivo/core.@nivo/core.CompleteTheme['axis']['domain']['line']>}>,   ticks :std.Partial<{  line :std.Partial<@nivo/core.@nivo/core.CompleteTheme['axis']['ticks']['line']>,   text :std.Partial<@nivo/core.@nivo/core.CompleteTheme['axis']['ticks']['text']>}>,   legend :std.Partial<{  text :std.Partial<@nivo/core.@nivo/core.CompleteTheme['axis']['legend']['text']>}>}>,   grid :std.Partial<{  line :std.Partial<@nivo/core.@nivo/core.CompleteTheme['grid']['line']>}>,   legends :std.Partial<{  hidden :std.Partial<{  symbol :@nivo/core.@nivo/core.CompleteTheme['legends']['hidden']['symbol'],   text :@nivo/core.@nivo/core.CompleteTheme['legends']['hidden']['text']}>,   title :std.Partial<{  text :std.Partial<@nivo/core.@nivo/core.CompleteTheme['legends']['title']['text']>}>,   text :std.Partial<@nivo/core.@nivo/core.CompleteTheme['legends']['text']>,   ticks :std.Partial<{  line :std.Partial<@nivo/core.@nivo/core.CompleteTheme['legends']['ticks']['line']>,   text :std.Partial<@nivo/core.@nivo/core.CompleteTheme['legends']['ticks']['text']>}>}>,   labels :std.Partial<{  text :std.Partial<@nivo/core.@nivo/core.CompleteTheme['labels']['text']>}>,   markers :std.Partial<@nivo/core.@nivo/core.CompleteTheme['markers']>,   dots :std.Partial<{  text :std.Partial<@nivo/core.@nivo/core.CompleteTheme['dots']['text']>}>,   tooltip :std.Partial<@nivo/core.@nivo/core.CompleteTheme['tooltip']>,   annotations :std.Partial<{  text :std.Partial<@nivo/core.@nivo/core.CompleteTheme['annotations']['text']>,   link :std.Partial<@nivo/core.@nivo/core.CompleteTheme['annotations']['link']>,   outline :std.Partial<@nivo/core.@nivo/core.CompleteTheme['annotations']['outline']>,   symbol :std.Partial<@nivo/core.@nivo/core.CompleteTheme['annotations']['symbol']>}>}> */
trait Theme extends StObject {
  
  var annotations: js.UndefOr[PartialtextPartialfillstr] = js.undefined
  
  var axis: js.UndefOr[PartialdomainPartiallineP] = js.undefined
  
  var background: js.UndefOr[String] = js.undefined
  
  var crosshair: js.UndefOr[PartiallinePartialstrokes] = js.undefined
  
  var dots: js.UndefOr[PartialtextPartialPartial] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var grid: js.UndefOr[PartiallinePartialPartial] = js.undefined
  
  var labels: js.UndefOr[PartialtextPartialPartial] = js.undefined
  
  var legends: js.UndefOr[PartialhiddenPartialsymbo] = js.undefined
  
  var markers: js.UndefOr[PartiallineColorstringlin] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
  
  var tooltip: js.UndefOr[PartialcontainerPartialCS] = js.undefined
}
object Theme {
  
  inline def apply(): Theme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Theme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
    
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
    
    inline def setGrid(value: PartiallinePartialPartial): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
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
