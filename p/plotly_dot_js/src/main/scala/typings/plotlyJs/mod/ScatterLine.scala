package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.hv
import typings.plotlyJs.plotlyJsStrings.hvh
import typings.plotlyJs.plotlyJsStrings.linear
import typings.plotlyJs.plotlyJsStrings.spline
import typings.plotlyJs.plotlyJsStrings.vh
import typings.plotlyJs.plotlyJsStrings.vhv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScatterLine extends StObject {
  
  var color: Color = js.native
  
  var dash: Dash = js.native
  
  var shape: linear | spline | hv | vh | hvh | vhv = js.native
  
  var simplify: Boolean = js.native
  
  var smoothing: Double = js.native
  
  var width: Double = js.native
}
object ScatterLine {
  
  @scala.inline
  def apply(
    color: Color,
    dash: Dash,
    shape: linear | spline | hv | vh | hvh | vhv,
    simplify: Boolean,
    smoothing: Double,
    width: Double
  ): ScatterLine = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], dash = dash.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], simplify = simplify.asInstanceOf[js.Any], smoothing = smoothing.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterLine]
  }
  
  @scala.inline
  implicit class ScatterLineMutableBuilder[Self <: ScatterLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setDash(value: Dash): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: linear | spline | hv | vh | hvh | vhv): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimplify(value: Boolean): Self = StObject.set(x, "simplify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothing(value: Double): Self = StObject.set(x, "smoothing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
