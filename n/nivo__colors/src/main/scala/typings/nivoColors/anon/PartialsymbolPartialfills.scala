package typings.nivoColors.anon

import typings.react.mod.CSSProperties
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  symbol :std.Partial<{  fill :string,   opacity :number}>,   text :std.Partial<react.react.CSSProperties>}> */
trait PartialsymbolPartialfills extends StObject {
  
  var symbol: js.UndefOr[Partial[Fill]] = js.undefined
  
  var text: js.UndefOr[Partial[CSSProperties]] = js.undefined
}
object PartialsymbolPartialfills {
  
  inline def apply(): PartialsymbolPartialfills = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialsymbolPartialfills]
  }
  
  extension [Self <: PartialsymbolPartialfills](x: Self) {
    
    inline def setSymbol(value: Partial[Fill]): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setText(value: Partial[CSSProperties]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
