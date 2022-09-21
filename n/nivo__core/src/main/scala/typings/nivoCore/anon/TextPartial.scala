package typings.nivoCore.anon

import typings.react.mod.CSSProperties
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextPartial extends StObject {
  
  var text: Partial[CSSProperties]
}
object TextPartial {
  
  inline def apply(text: Partial[CSSProperties]): TextPartial = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextPartial]
  }
  
  extension [Self <: TextPartial](x: Self) {
    
    inline def setText(value: Partial[CSSProperties]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
