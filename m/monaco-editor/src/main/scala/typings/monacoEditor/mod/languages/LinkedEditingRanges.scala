package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkedEditingRanges extends StObject {
  
  /**
    * A list of ranges that can be edited together. The ranges must have
    * identical length and text content. The ranges cannot overlap
    */
  var ranges: js.Array[IRange]
  
  /**
    * An optional word pattern that describes valid contents for the given ranges.
    * If no pattern is provided, the language configuration's word pattern will be used.
    */
  var wordPattern: js.UndefOr[js.RegExp] = js.undefined
}
object LinkedEditingRanges {
  
  inline def apply(ranges: js.Array[IRange]): LinkedEditingRanges = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedEditingRanges]
  }
  
  extension [Self <: LinkedEditingRanges](x: Self) {
    
    inline def setRanges(value: js.Array[IRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesVarargs(value: IRange*): Self = StObject.set(x, "ranges", js.Array(value*))
    
    inline def setWordPattern(value: js.RegExp): Self = StObject.set(x, "wordPattern", value.asInstanceOf[js.Any])
    
    inline def setWordPatternUndefined: Self = StObject.set(x, "wordPattern", js.undefined)
  }
}
