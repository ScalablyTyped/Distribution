package typings.monacoEditor.mod.languages

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldingMarkers extends StObject {
  
  var end: RegExp
  
  var start: RegExp
}
object FoldingMarkers {
  
  inline def apply(end: RegExp, start: RegExp): FoldingMarkers = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingMarkers]
  }
  
  extension [Self <: FoldingMarkers](x: Self) {
    
    inline def setEnd(value: RegExp): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: RegExp): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
