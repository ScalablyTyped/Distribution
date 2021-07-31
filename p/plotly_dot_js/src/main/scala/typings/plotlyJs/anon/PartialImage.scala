package typings.plotlyJs.anon

import typings.plotlyJs.mod.XAxisName
import typings.plotlyJs.mod.YAxisName
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

/* Inlined std.Partial<plotly.js.plotly.js.Image> */
trait PartialImage extends StObject {
  
  var layer: js.UndefOr[above | below] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var sizex: js.UndefOr[Double] = js.undefined
  
  var sizey: js.UndefOr[Double] = js.undefined
  
  var sizing: js.UndefOr[fill | contain | stretch] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var x: js.UndefOr[Double | String] = js.undefined
  
  var xanchor: js.UndefOr[left | center | right] = js.undefined
  
  var xref: js.UndefOr[paper | XAxisName] = js.undefined
  
  var y: js.UndefOr[Double | String] = js.undefined
  
  var yanchor: js.UndefOr[top | middle | bottom] = js.undefined
  
  var yref: js.UndefOr[paper | YAxisName] = js.undefined
}
object PartialImage {
  
  @scala.inline
  def apply(): PartialImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialImage]
  }
  
  @scala.inline
  implicit class PartialImageMutableBuilder[Self <: PartialImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayer(value: above | below): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setSizex(value: Double): Self = StObject.set(x, "sizex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizexUndefined: Self = StObject.set(x, "sizex", js.undefined)
    
    @scala.inline
    def setSizey(value: Double): Self = StObject.set(x, "sizey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeyUndefined: Self = StObject.set(x, "sizey", js.undefined)
    
    @scala.inline
    def setSizing(value: fill | contain | stretch): Self = StObject.set(x, "sizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizingUndefined: Self = StObject.set(x, "sizing", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setXanchor(value: left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXanchorUndefined: Self = StObject.set(x, "xanchor", js.undefined)
    
    @scala.inline
    def setXref(value: paper | XAxisName): Self = StObject.set(x, "xref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrefUndefined: Self = StObject.set(x, "xref", js.undefined)
    
    @scala.inline
    def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setYanchor(value: top | middle | bottom): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYanchorUndefined: Self = StObject.set(x, "yanchor", js.undefined)
    
    @scala.inline
    def setYref(value: paper | YAxisName): Self = StObject.set(x, "yref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYrefUndefined: Self = StObject.set(x, "yref", js.undefined)
  }
}
