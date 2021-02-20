package typings.muiDatatables.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataIndexNumber extends StObject {
  
  var dataIndex: Double = js.native
}
object DataIndexNumber {
  
  @scala.inline
  def apply(dataIndex: Double): DataIndexNumber = {
    val __obj = js.Dynamic.literal(dataIndex = dataIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIndexNumber]
  }
  
  @scala.inline
  implicit class DataIndexNumberMutableBuilder[Self <: DataIndexNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataIndex(value: Double): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
  }
}
