package typings.plotlyJs.anon

import typings.plotlyJs.mod.Font
import typings.plotlyJs.plotlyJsStrings.`bottom center`
import typings.plotlyJs.plotlyJsStrings.`bottom left`
import typings.plotlyJs.plotlyJsStrings.`bottom right`
import typings.plotlyJs.plotlyJsStrings.`line-center`
import typings.plotlyJs.plotlyJsStrings.`middle center`
import typings.plotlyJs.plotlyJsStrings.`top center`
import typings.plotlyJs.plotlyJsStrings.`top left`
import typings.plotlyJs.plotlyJsStrings.`top right`
import typings.plotlyJs.plotlyJsStrings.line
import typings.plotlyJs.plotlyJsStrings.point
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.MapboxSymbol> */
trait PartialMapboxSymbol extends StObject {
  
  var icon: js.UndefOr[String] = js.undefined
  
  var iconsize: js.UndefOr[Double] = js.undefined
  
  var placement: js.UndefOr[point | line | `line-center`] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var textfont: js.UndefOr[Partial[Font]] = js.undefined
  
  var textposition: js.UndefOr[
    (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
  ] = js.undefined
}
object PartialMapboxSymbol {
  
  inline def apply(): PartialMapboxSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMapboxSymbol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMapboxSymbol] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconsize(value: Double): Self = StObject.set(x, "iconsize", value.asInstanceOf[js.Any])
    
    inline def setIconsizeUndefined: Self = StObject.set(x, "iconsize", js.undefined)
    
    inline def setPlacement(value: point | line | `line-center`): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextfont(value: Partial[Font]): Self = StObject.set(x, "textfont", value.asInstanceOf[js.Any])
    
    inline def setTextfontUndefined: Self = StObject.set(x, "textfont", js.undefined)
    
    inline def setTextposition(
      value: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
    ): Self = StObject.set(x, "textposition", value.asInstanceOf[js.Any])
    
    inline def setTextpositionUndefined: Self = StObject.set(x, "textposition", js.undefined)
  }
}
