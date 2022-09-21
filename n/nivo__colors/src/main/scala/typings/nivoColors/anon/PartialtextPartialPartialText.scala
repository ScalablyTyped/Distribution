package typings.nivoColors.anon

import typings.react.mod.CSSProperties
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  text :std.Partial<std.Partial<react.react.CSSProperties>>}> */
trait PartialtextPartialPartialText extends StObject {
  
  var text: js.UndefOr[Partial[Partial[CSSProperties]]] = js.undefined
}
object PartialtextPartialPartialText {
  
  inline def apply(): PartialtextPartialPartialText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialtextPartialPartialText]
  }
  
  extension [Self <: PartialtextPartialPartialText](x: Self) {
    
    inline def setText(value: Partial[Partial[CSSProperties]]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
