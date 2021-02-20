package typings.muiDatatables.mod

import typings.muiDatatables.anon.DataIndex
import typings.muiDatatables.anon.DataIndexNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableIsRowCheck extends StObject {
  
  var data: js.Array[DataIndex] = js.native
  
  var lookup: DataIndexNumber = js.native
}
object MUIDataTableIsRowCheck {
  
  @scala.inline
  def apply(data: js.Array[DataIndex], lookup: DataIndexNumber): MUIDataTableIsRowCheck = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableIsRowCheck]
  }
  
  @scala.inline
  implicit class MUIDataTableIsRowCheckMutableBuilder[Self <: MUIDataTableIsRowCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[DataIndex]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: DataIndex*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setLookup(value: DataIndexNumber): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
  }
}
