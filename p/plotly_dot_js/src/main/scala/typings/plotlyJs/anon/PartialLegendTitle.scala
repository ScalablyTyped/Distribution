package typings.plotlyJs.anon

import typings.plotlyJs.mod.Font
import typings.plotlyJs.plotlyJsStrings.`top left`
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.top
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.LegendTitle> */
trait PartialLegendTitle extends StObject {
  
  var font: js.UndefOr[Partial[Font]] = js.undefined
  
  var side: js.UndefOr[top | left | (`top left`)] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object PartialLegendTitle {
  
  inline def apply(): PartialLegendTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLegendTitle]
  }
  
  extension [Self <: PartialLegendTitle](x: Self) {
    
    inline def setFont(value: Partial[Font]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setSide(value: top | left | (`top left`)): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
