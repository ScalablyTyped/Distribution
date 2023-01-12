package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldingMarkers extends StObject {
  
  var end: js.RegExp
  
  var start: js.RegExp
}
object FoldingMarkers {
  
  inline def apply(end: js.RegExp, start: js.RegExp): FoldingMarkers = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingMarkers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FoldingMarkers] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: js.RegExp): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: js.RegExp): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
