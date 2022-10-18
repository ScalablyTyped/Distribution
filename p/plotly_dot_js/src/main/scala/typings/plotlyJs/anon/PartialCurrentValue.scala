package typings.plotlyJs.anon

import typings.plotlyJs.mod.Font
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.right
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.CurrentValue> */
trait PartialCurrentValue extends StObject {
  
  var font: js.UndefOr[Partial[Font]] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var suffix: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var xanchor: js.UndefOr[left | center | right] = js.undefined
}
object PartialCurrentValue {
  
  inline def apply(): PartialCurrentValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCurrentValue]
  }
  
  extension [Self <: PartialCurrentValue](x: Self) {
    
    inline def setFont(value: Partial[Font]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setXanchor(value: left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    inline def setXanchorUndefined: Self = StObject.set(x, "xanchor", js.undefined)
  }
}
