package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableCurrentData extends StObject {
  
  var dataIndex: Double = js.native
  
  var rowIndex: Double = js.native
}
object MUIDataTableCurrentData {
  
  @scala.inline
  def apply(dataIndex: Double, rowIndex: Double): MUIDataTableCurrentData = {
    val __obj = js.Dynamic.literal(dataIndex = dataIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableCurrentData]
  }
  
  @scala.inline
  implicit class MUIDataTableCurrentDataMutableBuilder[Self <: MUIDataTableCurrentData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataIndex(value: Double): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
  }
}
