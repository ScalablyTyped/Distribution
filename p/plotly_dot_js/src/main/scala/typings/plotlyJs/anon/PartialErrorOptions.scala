package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.ErrorOptions> */
@js.native
trait PartialErrorOptions extends StObject {
  
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var symmetric: js.UndefOr[Boolean] = js.native
  
  var thickness: js.UndefOr[Double] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PartialErrorOptions {
  
  @scala.inline
  def apply(): PartialErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialErrorOptions]
  }
  
  @scala.inline
  implicit class PartialErrorOptionsMutableBuilder[Self <: PartialErrorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setSymmetric(value: Boolean): Self = StObject.set(x, "symmetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymmetricUndefined: Self = StObject.set(x, "symmetric", js.undefined)
    
    @scala.inline
    def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
