package typings.plotlyJs.anon

import typings.plotlyJs.mod.Dash
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

/* Inlined std.Partial<plotly.js.plotly.js.ScatterLine> */
@js.native
trait PartialScatterLine extends StObject {
  
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var dash: js.UndefOr[Dash] = js.native
  
  var shape: js.UndefOr[linear | spline | hv | vh | hvh | vhv] = js.native
  
  var simplify: js.UndefOr[Boolean] = js.native
  
  var smoothing: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PartialScatterLine {
  
  @scala.inline
  def apply(): PartialScatterLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScatterLine]
  }
  
  @scala.inline
  implicit class PartialScatterLineMutableBuilder[Self <: PartialScatterLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setDash(value: Dash): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
    
    @scala.inline
    def setShape(value: linear | spline | hv | vh | hvh | vhv): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setSimplify(value: Boolean): Self = StObject.set(x, "simplify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimplifyUndefined: Self = StObject.set(x, "simplify", js.undefined)
    
    @scala.inline
    def setSmoothing(value: Double): Self = StObject.set(x, "smoothing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothingUndefined: Self = StObject.set(x, "smoothing", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
