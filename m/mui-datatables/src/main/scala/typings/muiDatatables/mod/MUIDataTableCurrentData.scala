package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableCurrentData[T] extends StObject {
  
  var data: js.Array[T]
  
  var index: Double
}
object MUIDataTableCurrentData {
  
  inline def apply[T](data: js.Array[T], index: Double): MUIDataTableCurrentData[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableCurrentData[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MUIDataTableCurrentData[?], T] (val x: Self & MUIDataTableCurrentData[T]) extends AnyVal {
    
    inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
