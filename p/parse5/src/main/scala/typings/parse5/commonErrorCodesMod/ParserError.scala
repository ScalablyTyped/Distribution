package typings.parse5.commonErrorCodesMod

import typings.parse5.commonTokenMod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParserError
  extends StObject
     with Location {
  
  var code: ERR
}
object ParserError {
  
  inline def apply(
    code: ERR,
    endCol: Double,
    endLine: Double,
    endOffset: Double,
    startCol: Double,
    startLine: Double,
    startOffset: Double
  ): ParserError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], endCol = endCol.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserError]
  }
  
  extension [Self <: ParserError](x: Self) {
    
    inline def setCode(value: ERR): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
