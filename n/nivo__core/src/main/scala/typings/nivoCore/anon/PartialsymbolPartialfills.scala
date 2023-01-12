package typings.nivoCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  symbol :std.Partial<{  fill :string,   opacity :number}>,   text :std.Partial<react.react.CSSProperties>}> */
trait PartialsymbolPartialfills extends StObject {
  
  var symbol: js.UndefOr[Partialfillstringopacityn] = js.undefined
  
  var text: js.UndefOr[PartialCSSProperties] = js.undefined
}
object PartialsymbolPartialfills {
  
  inline def apply(): PartialsymbolPartialfills = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialsymbolPartialfills]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialsymbolPartialfills] (val x: Self) extends AnyVal {
    
    inline def setSymbol(value: Partialfillstringopacityn): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setText(value: PartialCSSProperties): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
