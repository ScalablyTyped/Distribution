package typings.plotlyJs.anon

import typings.plotlyJs.mod.Padding
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.container
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.paper
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.top
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  text :string,   font :std.Partial<plotly.js.plotly.js.Font>,   xref :'container' | 'paper',   yref :'container' | 'paper',   x :number,   y :number,   xanchor :'auto' | 'left' | 'center' | 'right',   yanchor :'auto' | 'top' | 'middle' | 'bottom',   pad :std.Partial<plotly.js.plotly.js.Padding>}> */
trait PartialtextstringfontPartFont extends StObject {
  
  var font: js.UndefOr[Partial[typings.plotlyJs.mod.Font]] = js.undefined
  
  var pad: js.UndefOr[Partial[Padding]] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var xanchor: js.UndefOr[auto | left | center | right] = js.undefined
  
  var xref: js.UndefOr[container | paper] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
  
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.undefined
  
  var yref: js.UndefOr[container | paper] = js.undefined
}
object PartialtextstringfontPartFont {
  
  @scala.inline
  def apply(): PartialtextstringfontPartFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialtextstringfontPartFont]
  }
  
  @scala.inline
  implicit class PartialtextstringfontPartFontMutableBuilder[Self <: PartialtextstringfontPartFont] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: Partial[typings.plotlyJs.mod.Font]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setPad(value: Partial[Padding]): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setXanchor(value: auto | left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXanchorUndefined: Self = StObject.set(x, "xanchor", js.undefined)
    
    @scala.inline
    def setXref(value: container | paper): Self = StObject.set(x, "xref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrefUndefined: Self = StObject.set(x, "xref", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setYanchor(value: auto | top | middle | bottom): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYanchorUndefined: Self = StObject.set(x, "yanchor", js.undefined)
    
    @scala.inline
    def setYref(value: container | paper): Self = StObject.set(x, "yref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYrefUndefined: Self = StObject.set(x, "yref", js.undefined)
  }
}
