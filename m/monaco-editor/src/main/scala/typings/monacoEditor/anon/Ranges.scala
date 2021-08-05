package typings.monacoEditor.anon

import typings.monacoEditor.mod.IRange
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ranges extends StObject {
  
  var ranges: js.Array[IRange]
  
  var wordPattern: js.UndefOr[RegExp] = js.undefined
}
object Ranges {
  
  inline def apply(ranges: js.Array[IRange]): Ranges = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ranges]
  }
  
  extension [Self <: Ranges](x: Self) {
    
    inline def setRanges(value: js.Array[IRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesVarargs(value: IRange*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    inline def setWordPattern(value: RegExp): Self = StObject.set(x, "wordPattern", value.asInstanceOf[js.Any])
    
    inline def setWordPatternUndefined: Self = StObject.set(x, "wordPattern", js.undefined)
  }
}
