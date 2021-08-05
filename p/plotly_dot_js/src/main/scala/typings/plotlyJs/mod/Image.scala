package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.above
import typings.plotlyJs.plotlyJsStrings.below
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.contain
import typings.plotlyJs.plotlyJsStrings.fill
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.paper
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.stretch
import typings.plotlyJs.plotlyJsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  var layer: above | below
  
  var opacity: Double
  
  var sizex: Double
  
  var sizey: Double
  
  var sizing: fill | contain | stretch
  
  var source: String
  
  var visible: Boolean
  
  var x: Double | String
  
  var xanchor: left | center | right
  
  var xref: paper | XAxisName
  
  var y: Double | String
  
  var yanchor: top | middle | bottom
  
  var yref: paper | YAxisName
}
object Image {
  
  inline def apply(
    layer: above | below,
    opacity: Double,
    sizex: Double,
    sizey: Double,
    sizing: fill | contain | stretch,
    source: String,
    visible: Boolean,
    x: Double | String,
    xanchor: left | center | right,
    xref: paper | XAxisName,
    y: Double | String,
    yanchor: top | middle | bottom,
    yref: paper | YAxisName
  ): Image = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], sizex = sizex.asInstanceOf[js.Any], sizey = sizey.asInstanceOf[js.Any], sizing = sizing.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], xref = xref.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any], yref = yref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setLayer(value: above | below): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setSizex(value: Double): Self = StObject.set(x, "sizex", value.asInstanceOf[js.Any])
    
    inline def setSizey(value: Double): Self = StObject.set(x, "sizey", value.asInstanceOf[js.Any])
    
    inline def setSizing(value: fill | contain | stretch): Self = StObject.set(x, "sizing", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXanchor(value: left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    inline def setXref(value: paper | XAxisName): Self = StObject.set(x, "xref", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYanchor(value: top | middle | bottom): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
    
    inline def setYref(value: paper | YAxisName): Self = StObject.set(x, "yref", value.asInstanceOf[js.Any])
  }
}
