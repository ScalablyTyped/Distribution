package typings.plotlyJs.anon

import typings.plotlyJs.mod.Font
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.right
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.HoverLabel> */
trait PartialHoverLabelAlign extends StObject {
  
  var align: js.UndefOr[left | right | auto] = js.undefined
  
  var bgcolor: js.UndefOr[String] = js.undefined
  
  var bordercolor: js.UndefOr[String] = js.undefined
  
  var font: js.UndefOr[Partial[Font]] = js.undefined
  
  var namelength: js.UndefOr[Double] = js.undefined
}
object PartialHoverLabelAlign {
  
  inline def apply(): PartialHoverLabelAlign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHoverLabelAlign]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialHoverLabelAlign] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: left | right | auto): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    inline def setBordercolor(value: String): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    inline def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
    
    inline def setFont(value: Partial[Font]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setNamelength(value: Double): Self = StObject.set(x, "namelength", value.asInstanceOf[js.Any])
    
    inline def setNamelengthUndefined: Self = StObject.set(x, "namelength", js.undefined)
  }
}
