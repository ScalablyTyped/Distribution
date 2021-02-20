package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableStateRows extends StObject {
  
  var data: js.Array[String] = js.native
  
  var lookup: js.Any = js.native
}
object MUIDataTableStateRows {
  
  @scala.inline
  def apply(data: js.Array[String], lookup: js.Any): MUIDataTableStateRows = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableStateRows]
  }
  
  @scala.inline
  implicit class MUIDataTableStateRowsMutableBuilder[Self <: MUIDataTableStateRows] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: String*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setLookup(value: js.Any): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
  }
}
