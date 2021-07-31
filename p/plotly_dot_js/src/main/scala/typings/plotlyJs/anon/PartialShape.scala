package typings.plotlyJs.anon

import typings.plotlyJs.mod.Datum
import typings.plotlyJs.mod.XAxisName
import typings.plotlyJs.mod.YAxisName
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

/* Inlined std.Partial<plotly.js.plotly.js.Shape> */
trait PartialShape extends StObject {
  
  var fillcolor: js.UndefOr[String] = js.undefined
  
  var layer: js.UndefOr[below | above] = js.undefined
  
  var line: js.UndefOr[PartialShapeLine] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var templateitemname: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[rect | circle | line | path] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var x0: js.UndefOr[Datum] = js.undefined
  
  var x1: js.UndefOr[Datum] = js.undefined
  
  var xanchor: js.UndefOr[Double | String] = js.undefined
  
  var xref: js.UndefOr[paper | XAxisName] = js.undefined
  
  var xsizemode: js.UndefOr[scaled | pixel] = js.undefined
  
  var y0: js.UndefOr[Datum] = js.undefined
  
  var y1: js.UndefOr[Datum] = js.undefined
  
  var yanchor: js.UndefOr[Double | String] = js.undefined
  
  var yref: js.UndefOr[paper | YAxisName] = js.undefined
  
  var ysizemode: js.UndefOr[scaled | pixel] = js.undefined
}
object PartialShape {
  
  @scala.inline
  def apply(): PartialShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialShape]
  }
  
  @scala.inline
  implicit class PartialShapeMutableBuilder[Self <: PartialShape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillcolor(value: String): Self = StObject.set(x, "fillcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillcolorUndefined: Self = StObject.set(x, "fillcolor", js.undefined)
    
    @scala.inline
    def setLayer(value: below | above): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setLine(value: PartialShapeLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setTemplateitemname(value: String): Self = StObject.set(x, "templateitemname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateitemnameUndefined: Self = StObject.set(x, "templateitemname", js.undefined)
    
    @scala.inline
    def setType(value: rect | circle | line | path): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setX0(value: Datum): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX0Null: Self = StObject.set(x, "x0", null)
    
    @scala.inline
    def setX0Undefined: Self = StObject.set(x, "x0", js.undefined)
    
    @scala.inline
    def setX1(value: Datum): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1Null: Self = StObject.set(x, "x1", null)
    
    @scala.inline
    def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
    
    @scala.inline
    def setXanchor(value: Double | String): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXanchorUndefined: Self = StObject.set(x, "xanchor", js.undefined)
    
    @scala.inline
    def setXref(value: paper | XAxisName): Self = StObject.set(x, "xref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrefUndefined: Self = StObject.set(x, "xref", js.undefined)
    
    @scala.inline
    def setXsizemode(value: scaled | pixel): Self = StObject.set(x, "xsizemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXsizemodeUndefined: Self = StObject.set(x, "xsizemode", js.undefined)
    
    @scala.inline
    def setY0(value: Datum): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY0Null: Self = StObject.set(x, "y0", null)
    
    @scala.inline
    def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
    
    @scala.inline
    def setY1(value: Datum): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1Null: Self = StObject.set(x, "y1", null)
    
    @scala.inline
    def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    
    @scala.inline
    def setYanchor(value: Double | String): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYanchorUndefined: Self = StObject.set(x, "yanchor", js.undefined)
    
    @scala.inline
    def setYref(value: paper | YAxisName): Self = StObject.set(x, "yref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYrefUndefined: Self = StObject.set(x, "yref", js.undefined)
    
    @scala.inline
    def setYsizemode(value: scaled | pixel): Self = StObject.set(x, "ysizemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYsizemodeUndefined: Self = StObject.set(x, "ysizemode", js.undefined)
  }
}
