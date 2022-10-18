package typings.muiDatatables.mod

import typings.muiDatatables.anon.DataIndexNumber
import typings.muiDatatables.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableIsRowCheck extends StObject {
  
  var data: js.Array[Index]
  
  var lookup: DataIndexNumber
}
object MUIDataTableIsRowCheck {
  
  inline def apply(data: js.Array[Index], lookup: DataIndexNumber): MUIDataTableIsRowCheck = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableIsRowCheck]
  }
  
  extension [Self <: MUIDataTableIsRowCheck](x: Self) {
    
    inline def setData(value: js.Array[Index]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Index*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLookup(value: DataIndexNumber): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
  }
}
