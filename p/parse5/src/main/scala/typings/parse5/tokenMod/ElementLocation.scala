package typings.parse5.tokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementLocation
  extends StObject
     with LocationWithAttributes {
  
  /**
    * Element's end tag location info.
    * This property is undefined, if the element has no closing tag.
    */
  var endTag: js.UndefOr[Location] = js.undefined
  
  /** Element's start tag location info. */
  var startTag: js.UndefOr[Location] = js.undefined
}
object ElementLocation {
  
  inline def apply(
    endCol: Double,
    endLine: Double,
    endOffset: Double,
    startCol: Double,
    startLine: Double,
    startOffset: Double
  ): ElementLocation = {
    val __obj = js.Dynamic.literal(endCol = endCol.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementLocation]
  }
  
  extension [Self <: ElementLocation](x: Self) {
    
    inline def setEndTag(value: Location): Self = StObject.set(x, "endTag", value.asInstanceOf[js.Any])
    
    inline def setEndTagUndefined: Self = StObject.set(x, "endTag", js.undefined)
    
    inline def setStartTag(value: Location): Self = StObject.set(x, "startTag", value.asInstanceOf[js.Any])
    
    inline def setStartTagUndefined: Self = StObject.set(x, "startTag", js.undefined)
  }
}
