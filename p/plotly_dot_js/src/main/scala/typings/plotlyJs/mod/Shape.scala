package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialShapeLine
import typings.plotlyJs.plotlyJsStrings.above
import typings.plotlyJs.plotlyJsStrings.below
import typings.plotlyJs.plotlyJsStrings.circle
import typings.plotlyJs.plotlyJsStrings.line
import typings.plotlyJs.plotlyJsStrings.paper
import typings.plotlyJs.plotlyJsStrings.path
import typings.plotlyJs.plotlyJsStrings.pixel
import typings.plotlyJs.plotlyJsStrings.rect
import typings.plotlyJs.plotlyJsStrings.scaled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shape extends StObject {
  
  var fillcolor: String
  
  var layer: below | above
  
  var line: PartialShapeLine
  
  var name: String
  
  var opacity: Double
  
  var path: String
  
  var templateitemname: String
  
  var `type`: rect | circle | line | path
  
  var visible: Boolean
  
  var x0: Datum
  
  var x1: Datum
  
  var xanchor: Double | String
  
  var xref: paper | XAxisName
  
  var xsizemode: scaled | pixel
  
  var y0: Datum
  
  var y1: Datum
  
  var yanchor: Double | String
  
  var yref: paper | YAxisName
  
  var ysizemode: scaled | pixel
}
object Shape {
  
  inline def apply(
    fillcolor: String,
    layer: below | above,
    line: PartialShapeLine,
    name: String,
    opacity: Double,
    path: String,
    templateitemname: String,
    `type`: rect | circle | line | path,
    visible: Boolean,
    xanchor: Double | String,
    xref: paper | XAxisName,
    xsizemode: scaled | pixel,
    yanchor: Double | String,
    yref: paper | YAxisName,
    ysizemode: scaled | pixel
  ): Shape = {
    val __obj = js.Dynamic.literal(fillcolor = fillcolor.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], templateitemname = templateitemname.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], xref = xref.asInstanceOf[js.Any], xsizemode = xsizemode.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any], yref = yref.asInstanceOf[js.Any], ysizemode = ysizemode.asInstanceOf[js.Any], x0 = null, x1 = null, y0 = null, y1 = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shape] (val x: Self) extends AnyVal {
    
    inline def setFillcolor(value: String): Self = StObject.set(x, "fillcolor", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: below | above): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLine(value: PartialShapeLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setTemplateitemname(value: String): Self = StObject.set(x, "templateitemname", value.asInstanceOf[js.Any])
    
    inline def setType(value: rect | circle | line | path): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setX0(value: Datum): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    inline def setX0Null: Self = StObject.set(x, "x0", null)
    
    inline def setX1(value: Datum): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX1Null: Self = StObject.set(x, "x1", null)
    
    inline def setXanchor(value: Double | String): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    inline def setXref(value: paper | XAxisName): Self = StObject.set(x, "xref", value.asInstanceOf[js.Any])
    
    inline def setXsizemode(value: scaled | pixel): Self = StObject.set(x, "xsizemode", value.asInstanceOf[js.Any])
    
    inline def setY0(value: Datum): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    inline def setY0Null: Self = StObject.set(x, "y0", null)
    
    inline def setY1(value: Datum): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY1Null: Self = StObject.set(x, "y1", null)
    
    inline def setYanchor(value: Double | String): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
    
    inline def setYref(value: paper | YAxisName): Self = StObject.set(x, "yref", value.asInstanceOf[js.Any])
    
    inline def setYsizemode(value: scaled | pixel): Self = StObject.set(x, "ysizemode", value.asInstanceOf[js.Any])
  }
}
