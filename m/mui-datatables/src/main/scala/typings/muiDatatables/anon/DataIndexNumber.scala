package typings.muiDatatables.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataIndexNumber extends StObject {
  
  var dataIndex: Double
}
object DataIndexNumber {
  
  inline def apply(dataIndex: Double): DataIndexNumber = {
    val __obj = js.Dynamic.literal(dataIndex = dataIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIndexNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataIndexNumber] (val x: Self) extends AnyVal {
    
    inline def setDataIndex(value: Double): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
  }
}
