package typings.micromarkUtilTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Point extends StObject {
  
  /**
    *   Position in a string chunk (or `-1` when pointing to a numeric chunk)
    */
  var _bufferIndex: Double
  
  /**
    *   Position in a list of chunks
    */
  var _index: Double
  
  /**
    *   1-indexed column number
    */
  var column: Double
  
  /**
    *   1-indexed line number
    */
  var line: Double
  
  /**
    *   0-indexed position in the document
    */
  var offset: Double
}
object Point {
  
  inline def apply(_bufferIndex: Double, _index: Double, column: Double, line: Double, offset: Double): Point = {
    val __obj = js.Dynamic.literal(_bufferIndex = _bufferIndex.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def set_bufferIndex(value: Double): Self = StObject.set(x, "_bufferIndex", value.asInstanceOf[js.Any])
    
    inline def set_index(value: Double): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
  }
}
