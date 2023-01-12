package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewTreeNodeGroupValue
  extends StObject
     with DataViewTreeNodeValue {
  
  var count: js.UndefOr[PrimitiveValue] = js.undefined
}
object DataViewTreeNodeGroupValue {
  
  inline def apply(): DataViewTreeNodeGroupValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataViewTreeNodeGroupValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataViewTreeNodeGroupValue] (val x: Self) extends AnyVal {
    
    inline def setCount(value: PrimitiveValue): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
