package typings.nivoCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  hidden :std.Partial<{  symbol :std.Partial<{  fill :string,   opacity :number}>,   text :std.Partial<react.react.CSSProperties>}>,   title :std.Partial<{  text :std.Partial<std.Partial<react.react.CSSProperties>>}>,   text :std.Partial<std.Partial<react.react.CSSProperties>>,   ticks :std.Partial<{  line :std.Partial<std.Partial<react.react.CSSProperties>>,   text :std.Partial<std.Partial<react.react.CSSProperties>>}>}> */
trait PartialhiddenPartialsymbo extends StObject {
  
  var hidden: js.UndefOr[PartialsymbolPartialfills] = js.undefined
  
  var text: js.UndefOr[PartialPartialCSSProperti] = js.undefined
  
  var ticks: js.UndefOr[PartiallinePartialPartialLine] = js.undefined
  
  var title: js.UndefOr[PartialtextPartialPartial] = js.undefined
}
object PartialhiddenPartialsymbo {
  
  inline def apply(): PartialhiddenPartialsymbo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialhiddenPartialsymbo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialhiddenPartialsymbo] (val x: Self) extends AnyVal {
    
    inline def setHidden(value: PartialsymbolPartialfills): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setText(value: PartialPartialCSSProperti): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTicks(value: PartiallinePartialPartialLine): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    inline def setTitle(value: PartialtextPartialPartial): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
