package typings.nivoCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Link extends StObject {
  
  var link: strokestringstrokeWidthnu
  
  var outline: strokestringstrokeWidthnu
  
  var symbol: fillstringoutlineWidthnum
  
  var text: fillstringoutlineWidthnum
}
object Link {
  
  inline def apply(
    link: strokestringstrokeWidthnu,
    outline: strokestringstrokeWidthnu,
    symbol: fillstringoutlineWidthnum,
    text: fillstringoutlineWidthnum
  ): Link = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
    
    inline def setLink(value: strokestringstrokeWidthnu): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setOutline(value: strokestringstrokeWidthnu): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: fillstringoutlineWidthnum): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setText(value: fillstringoutlineWidthnum): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
