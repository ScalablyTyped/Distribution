package typings.nivoColors.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  text :std.Partial<std.Partial<react.react.CSSProperties>>}> */
trait PartialtextPartialPartial extends StObject {
  
  var text: js.UndefOr[PartialPartialCSSProperti] = js.undefined
}
object PartialtextPartialPartial {
  
  inline def apply(): PartialtextPartialPartial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialtextPartialPartial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialtextPartialPartial] (val x: Self) extends AnyVal {
    
    inline def setText(value: PartialPartialCSSProperti): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
