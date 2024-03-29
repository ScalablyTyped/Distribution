package typings.muiDatatables.mod

import typings.muiDatatables.anon.DataIndex
import typings.muiDatatables.anon.DataIndexNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableIsRowCheck extends StObject {
  
  var data: js.Array[DataIndex]
  
  var lookup: DataIndexNumber
}
object MUIDataTableIsRowCheck {
  
  inline def apply(data: js.Array[DataIndex], lookup: DataIndexNumber): MUIDataTableIsRowCheck = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableIsRowCheck]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MUIDataTableIsRowCheck] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[DataIndex]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: DataIndex*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLookup(value: DataIndexNumber): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
  }
}
