package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialFont
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapboxSymbol extends StObject {
  
  var icon: String
  
  var iconsize: Double
  
  var placement: point | line | `line-center`
  
  var text: String
  
  var textfont: PartialFont
  
  var textposition: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
}
object MapboxSymbol {
  
  inline def apply(
    icon: String,
    iconsize: Double,
    placement: point | line | `line-center`,
    text: String,
    textfont: PartialFont,
    textposition: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
  ): MapboxSymbol = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], iconsize = iconsize.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textfont = textfont.asInstanceOf[js.Any], textposition = textposition.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxSymbol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapboxSymbol] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconsize(value: Double): Self = StObject.set(x, "iconsize", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: point | line | `line-center`): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextfont(value: PartialFont): Self = StObject.set(x, "textfont", value.asInstanceOf[js.Any])
    
    inline def setTextposition(
      value: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
    ): Self = StObject.set(x, "textposition", value.asInstanceOf[js.Any])
  }
}
