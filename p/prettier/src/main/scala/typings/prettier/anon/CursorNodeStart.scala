package typings.prettier.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CursorNodeStart extends StObject {
  
  var cursorNodeStart: js.UndefOr[Double] = js.undefined
  
  var cursorNodeText: js.UndefOr[String] = js.undefined
  
  var formatted: String
}
object CursorNodeStart {
  
  inline def apply(formatted: String): CursorNodeStart = {
    val __obj = js.Dynamic.literal(formatted = formatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorNodeStart]
  }
  
  extension [Self <: CursorNodeStart](x: Self) {
    
    inline def setCursorNodeStart(value: Double): Self = StObject.set(x, "cursorNodeStart", value.asInstanceOf[js.Any])
    
    inline def setCursorNodeStartUndefined: Self = StObject.set(x, "cursorNodeStart", js.undefined)
    
    inline def setCursorNodeText(value: String): Self = StObject.set(x, "cursorNodeText", value.asInstanceOf[js.Any])
    
    inline def setCursorNodeTextUndefined: Self = StObject.set(x, "cursorNodeText", js.undefined)
    
    inline def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
  }
}
