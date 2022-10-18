package typings.parse5.distCjsCommonTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  /** One-based column index of the last character. Points directly *after* the last character. */
  var endCol: Double
  
  /** One-based line index of the last character. */
  var endLine: Double
  
  /** Zero-based last character index. Points directly *after* the last character. */
  var endOffset: Double
  
  /** One-based column index of the first character. */
  var startCol: Double
  
  /** One-based line index of the first character. */
  var startLine: Double
  
  /** Zero-based first character index. */
  var startOffset: Double
}
object Location {
  
  inline def apply(
    endCol: Double,
    endLine: Double,
    endOffset: Double,
    startCol: Double,
    startLine: Double,
    startOffset: Double
  ): Location = {
    val __obj = js.Dynamic.literal(endCol = endCol.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  extension [Self <: Location](x: Self) {
    
    inline def setEndCol(value: Double): Self = StObject.set(x, "endCol", value.asInstanceOf[js.Any])
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setStartCol(value: Double): Self = StObject.set(x, "startCol", value.asInstanceOf[js.Any])
    
    inline def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
  }
}
