package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  visible :boolean,   width :number,   fillcolor :plotly.js.plotly.js.Color,   line :std.Partial<{  color :plotly.js.plotly.js.Color,   width :number}>}> */
@js.native
trait Partialvisiblebooleanwidt extends StObject {
  
  var fillcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var line: js.UndefOr[PartialcolorColorwidthnumColor] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object Partialvisiblebooleanwidt {
  
  @scala.inline
  def apply(): Partialvisiblebooleanwidt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialvisiblebooleanwidt]
  }
  
  @scala.inline
  implicit class PartialvisiblebooleanwidtMutableBuilder[Self <: Partialvisiblebooleanwidt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillcolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "fillcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillcolorUndefined: Self = StObject.set(x, "fillcolor", js.undefined)
    
    @scala.inline
    def setFillcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "fillcolor", js.Array(value :_*))
    
    @scala.inline
    def setLine(value: PartialcolorColorwidthnumColor): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
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
