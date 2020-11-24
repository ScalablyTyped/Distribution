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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends js.Object {
  
  var layer: above | below = js.native
  
  var opacity: Double = js.native
  
  var sizex: Double = js.native
  
  var sizey: Double = js.native
  
  var sizing: fill | contain | stretch = js.native
  
  var source: String = js.native
  
  var visible: Boolean = js.native
  
  var x: Double | String = js.native
  
  var xanchor: left | center | right = js.native
  
  var xref: paper | XAxisName = js.native
  
  var y: Double | String = js.native
  
  var yanchor: top | middle | bottom = js.native
  
  var yref: paper | YAxisName = js.native
}
object Image {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    
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
    def setLayer(value: above | below): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizex(value: Double): Self = this.set("sizex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizey(value: Double): Self = this.set("sizey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizing(value: fill | contain | stretch): Self = this.set("sizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double | String): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXanchor(value: left | center | right): Self = this.set("xanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXref(value: paper | XAxisName): Self = this.set("xref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double | String): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYanchor(value: top | middle | bottom): Self = this.set("yanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYref(value: paper | YAxisName): Self = this.set("yref", value.asInstanceOf[js.Any])
  }
}
