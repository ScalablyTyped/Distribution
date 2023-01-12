package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableStateRows extends StObject {
  
  var data: js.Array[String]
  
  var lookup: Any
}
object MUIDataTableStateRows {
  
  inline def apply(data: js.Array[String], lookup: Any): MUIDataTableStateRows = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableStateRows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MUIDataTableStateRows] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: String*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLookup(value: Any): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
  }
}
