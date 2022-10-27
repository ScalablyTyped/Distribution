package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialFont
import typings.plotlyJs.anon.PartialLegendTitleFont
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Legend
  extends StObject
     with Label {
  
  var borderwidth: Double
  
  var groupclick: toggleitem | togglegroup
  
  var grouptitlefont: PartialFont
  
  var itemclick: toggle | toggleothers | `false`
  
  var itemdoubleclick: toggle | toggleothers | `false`
  
  var itemsizing: trace | constant
  
  var itemwidth: Double
  
  var orientation: v | h
  
  var title: PartialLegendTitleFont
  
  var tracegroupgap: Double
  
  var traceorder: grouped | normal | reversed | reversedPlussigngrouped
  
  var uirevision: Double | String
  
  var valign: top | middle | bottom
  
  var x: Double
  
  var xanchor: auto | left | center | right
  
  var y: Double
  
  var yanchor: auto | top | middle | bottom
}
object Legend {
  
  inline def apply(
    bgcolor: String,
    bordercolor: String,
    borderwidth: Double,
    font: PartialFont,
    groupclick: toggleitem | togglegroup,
    grouptitlefont: PartialFont,
    itemclick: toggle | toggleothers | `false`,
    itemdoubleclick: toggle | toggleothers | `false`,
    itemsizing: trace | constant,
    itemwidth: Double,
    orientation: v | h,
    title: PartialLegendTitleFont,
    tracegroupgap: Double,
    traceorder: grouped | normal | reversed | reversedPlussigngrouped,
    uirevision: Double | String,
    valign: top | middle | bottom,
    x: Double,
    xanchor: auto | left | center | right,
    y: Double,
    yanchor: auto | top | middle | bottom
  ): Legend = {
    val __obj = js.Dynamic.literal(bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], groupclick = groupclick.asInstanceOf[js.Any], grouptitlefont = grouptitlefont.asInstanceOf[js.Any], itemclick = itemclick.asInstanceOf[js.Any], itemdoubleclick = itemdoubleclick.asInstanceOf[js.Any], itemsizing = itemsizing.asInstanceOf[js.Any], itemwidth = itemwidth.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], tracegroupgap = tracegroupgap.asInstanceOf[js.Any], traceorder = traceorder.asInstanceOf[js.Any], uirevision = uirevision.asInstanceOf[js.Any], valign = valign.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Legend]
  }
  
  extension [Self <: Legend](x: Self) {
    
    inline def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    inline def setGroupclick(value: toggleitem | togglegroup): Self = StObject.set(x, "groupclick", value.asInstanceOf[js.Any])
    
    inline def setGrouptitlefont(value: PartialFont): Self = StObject.set(x, "grouptitlefont", value.asInstanceOf[js.Any])
    
    inline def setItemclick(value: toggle | toggleothers | `false`): Self = StObject.set(x, "itemclick", value.asInstanceOf[js.Any])
    
    inline def setItemdoubleclick(value: toggle | toggleothers | `false`): Self = StObject.set(x, "itemdoubleclick", value.asInstanceOf[js.Any])
    
    inline def setItemsizing(value: trace | constant): Self = StObject.set(x, "itemsizing", value.asInstanceOf[js.Any])
    
    inline def setItemwidth(value: Double): Self = StObject.set(x, "itemwidth", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: v | h): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: PartialLegendTitleFont): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTracegroupgap(value: Double): Self = StObject.set(x, "tracegroupgap", value.asInstanceOf[js.Any])
    
    inline def setTraceorder(value: grouped | normal | reversed | reversedPlussigngrouped): Self = StObject.set(x, "traceorder", value.asInstanceOf[js.Any])
    
    inline def setUirevision(value: Double | String): Self = StObject.set(x, "uirevision", value.asInstanceOf[js.Any])
    
    inline def setValign(value: top | middle | bottom): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXanchor(value: auto | left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYanchor(value: auto | top | middle | bottom): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
  }
}
