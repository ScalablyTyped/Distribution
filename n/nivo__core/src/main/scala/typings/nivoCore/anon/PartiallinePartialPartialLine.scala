package typings.nivoCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  line :std.Partial<std.Partial<react.react.CSSProperties>>,   text :std.Partial<std.Partial<react.react.CSSProperties>>}> */
trait PartiallinePartialPartialLine extends StObject {
  
  var line: js.UndefOr[PartialPartialCSSProperti] = js.undefined
  
  var text: js.UndefOr[PartialPartialCSSProperti] = js.undefined
}
object PartiallinePartialPartialLine {
  
  inline def apply(): PartiallinePartialPartialLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartiallinePartialPartialLine]
  }
  
  extension [Self <: PartiallinePartialPartialLine](x: Self) {
    
    inline def setLine(value: PartialPartialCSSProperti): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setText(value: PartialPartialCSSProperti): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
