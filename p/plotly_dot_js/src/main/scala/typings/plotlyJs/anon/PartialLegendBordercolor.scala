package typings.plotlyJs.anon

import typings.plotlyJs.mod.Font
import typings.plotlyJs.mod.LegendTitle
import typings.plotlyJs.plotlyJsBooleans.`false`
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.constant
import typings.plotlyJs.plotlyJsStrings.grouped
import typings.plotlyJs.plotlyJsStrings.h
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.normal
import typings.plotlyJs.plotlyJsStrings.reversed
import typings.plotlyJs.plotlyJsStrings.reversedPlussigngrouped
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.toggle
import typings.plotlyJs.plotlyJsStrings.togglegroup
import typings.plotlyJs.plotlyJsStrings.toggleitem
import typings.plotlyJs.plotlyJsStrings.toggleothers
import typings.plotlyJs.plotlyJsStrings.top
import typings.plotlyJs.plotlyJsStrings.trace
import typings.plotlyJs.plotlyJsStrings.v
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Legend> */
trait PartialLegendBordercolor extends StObject {
  
  var bgcolor: js.UndefOr[String] = js.undefined
  
  var bordercolor: js.UndefOr[String] = js.undefined
  
  var borderwidth: js.UndefOr[Double] = js.undefined
  
  var font: js.UndefOr[Partial[Font]] = js.undefined
  
  var groupclick: js.UndefOr[toggleitem | togglegroup] = js.undefined
  
  var grouptitlefont: js.UndefOr[Partial[Font]] = js.undefined
  
  var itemclick: js.UndefOr[toggle | toggleothers | `false`] = js.undefined
  
  var itemdoubleclick: js.UndefOr[toggle | toggleothers | `false`] = js.undefined
  
  var itemsizing: js.UndefOr[trace | constant] = js.undefined
  
  var itemwidth: js.UndefOr[Double] = js.undefined
  
  var orientation: js.UndefOr[v | h] = js.undefined
  
  var title: js.UndefOr[Partial[LegendTitle]] = js.undefined
  
  var tracegroupgap: js.UndefOr[Double] = js.undefined
  
  var traceorder: js.UndefOr[grouped | normal | reversed | reversedPlussigngrouped] = js.undefined
  
  var uirevision: js.UndefOr[Double | String] = js.undefined
  
  var valign: js.UndefOr[top | middle | bottom] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var xanchor: js.UndefOr[auto | left | center | right] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
  
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.undefined
}
object PartialLegendBordercolor {
  
  inline def apply(): PartialLegendBordercolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLegendBordercolor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialLegendBordercolor] (val x: Self) extends AnyVal {
    
    inline def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    inline def setBordercolor(value: String): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    inline def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
    
    inline def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    inline def setBorderwidthUndefined: Self = StObject.set(x, "borderwidth", js.undefined)
    
    inline def setFont(value: Partial[Font]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setGroupclick(value: toggleitem | togglegroup): Self = StObject.set(x, "groupclick", value.asInstanceOf[js.Any])
    
    inline def setGroupclickUndefined: Self = StObject.set(x, "groupclick", js.undefined)
    
    inline def setGrouptitlefont(value: Partial[Font]): Self = StObject.set(x, "grouptitlefont", value.asInstanceOf[js.Any])
    
    inline def setGrouptitlefontUndefined: Self = StObject.set(x, "grouptitlefont", js.undefined)
    
    inline def setItemclick(value: toggle | toggleothers | `false`): Self = StObject.set(x, "itemclick", value.asInstanceOf[js.Any])
    
    inline def setItemclickUndefined: Self = StObject.set(x, "itemclick", js.undefined)
    
    inline def setItemdoubleclick(value: toggle | toggleothers | `false`): Self = StObject.set(x, "itemdoubleclick", value.asInstanceOf[js.Any])
    
    inline def setItemdoubleclickUndefined: Self = StObject.set(x, "itemdoubleclick", js.undefined)
    
    inline def setItemsizing(value: trace | constant): Self = StObject.set(x, "itemsizing", value.asInstanceOf[js.Any])
    
    inline def setItemsizingUndefined: Self = StObject.set(x, "itemsizing", js.undefined)
    
    inline def setItemwidth(value: Double): Self = StObject.set(x, "itemwidth", value.asInstanceOf[js.Any])
    
    inline def setItemwidthUndefined: Self = StObject.set(x, "itemwidth", js.undefined)
    
    inline def setOrientation(value: v | h): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setTitle(value: Partial[LegendTitle]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTracegroupgap(value: Double): Self = StObject.set(x, "tracegroupgap", value.asInstanceOf[js.Any])
    
    inline def setTracegroupgapUndefined: Self = StObject.set(x, "tracegroupgap", js.undefined)
    
    inline def setTraceorder(value: grouped | normal | reversed | reversedPlussigngrouped): Self = StObject.set(x, "traceorder", value.asInstanceOf[js.Any])
    
    inline def setTraceorderUndefined: Self = StObject.set(x, "traceorder", js.undefined)
    
    inline def setUirevision(value: Double | String): Self = StObject.set(x, "uirevision", value.asInstanceOf[js.Any])
    
    inline def setUirevisionUndefined: Self = StObject.set(x, "uirevision", js.undefined)
    
    inline def setValign(value: top | middle | bottom): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
    
    inline def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setXanchor(value: auto | left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    inline def setXanchorUndefined: Self = StObject.set(x, "xanchor", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setYanchor(value: auto | top | middle | bottom): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
    
    inline def setYanchorUndefined: Self = StObject.set(x, "yanchor", js.undefined)
  }
}
