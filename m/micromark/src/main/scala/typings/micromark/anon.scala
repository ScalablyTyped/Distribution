package typings.micromark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<micromark-util-types.micromark-util-types.Point, '_index' | '_bufferIndex'> */
  trait OmitPointindexbufferIndex extends StObject {
    
    var column: Double
    
    var line: Double
    
    var offset: Double
  }
  object OmitPointindexbufferIndex {
    
    inline def apply(column: Double, line: Double, offset: Double): OmitPointindexbufferIndex = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitPointindexbufferIndex]
    }
    
    extension [Self <: OmitPointindexbufferIndex](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
}
