package typings.parse5.distCommonTokenMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationWithAttributes
  extends StObject
     with Location {
  
  /** Start tag attributes' location info. */
  var attrs: js.UndefOr[Record[String, Location]] = js.undefined
}
object LocationWithAttributes {
  
  inline def apply(
    endCol: Double,
    endLine: Double,
    endOffset: Double,
    startCol: Double,
    startLine: Double,
    startOffset: Double
  ): LocationWithAttributes = {
    val __obj = js.Dynamic.literal(endCol = endCol.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationWithAttributes]
  }
  
  extension [Self <: LocationWithAttributes](x: Self) {
    
    inline def setAttrs(value: Record[String, Location]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
  }
}
