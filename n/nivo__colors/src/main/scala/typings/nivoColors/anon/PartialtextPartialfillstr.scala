package typings.nivoColors.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  text :std.Partial<{  fill :string,   outlineWidth :number,   outlineColor :string,   outlineOpacity :number} & std.Partial<std.Omit<react.react.CSSProperties, 'fill'>>>,   link :std.Partial<{  stroke :string,   strokeWidth :number,   outlineWidth :number,   outlineColor :string,   outlineOpacity :number} & std.Partial<std.Omit<react.react.CSSProperties, 'stroke' | 'strokeWidth'>>>,   outline :std.Partial<{  stroke :string,   strokeWidth :number,   outlineWidth :number,   outlineColor :string,   outlineOpacity :number} & std.Partial<std.Omit<react.react.CSSProperties, 'stroke' | 'strokeWidth'>>>,   symbol :std.Partial<{  fill :string,   outlineWidth :number,   outlineColor :string,   outlineOpacity :number} & std.Partial<std.Omit<react.react.CSSProperties, 'fill'>>>}> */
trait PartialtextPartialfillstr extends StObject {
  
  var link: js.UndefOr[PartialstrokestringstrokeAccentColor] = js.undefined
  
  var outline: js.UndefOr[PartialstrokestringstrokeAccentColor] = js.undefined
  
  var symbol: js.UndefOr[PartialfillstringoutlineW] = js.undefined
  
  var text: js.UndefOr[PartialfillstringoutlineW] = js.undefined
}
object PartialtextPartialfillstr {
  
  inline def apply(): PartialtextPartialfillstr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialtextPartialfillstr]
  }
  
  extension [Self <: PartialtextPartialfillstr](x: Self) {
    
    inline def setLink(value: PartialstrokestringstrokeAccentColor): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setOutline(value: PartialstrokestringstrokeAccentColor): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setSymbol(value: PartialfillstringoutlineW): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setText(value: PartialfillstringoutlineW): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
