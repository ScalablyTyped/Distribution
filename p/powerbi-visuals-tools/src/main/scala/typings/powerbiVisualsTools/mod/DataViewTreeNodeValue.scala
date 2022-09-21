package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewTreeNodeValue extends StObject {
  
  var value: js.UndefOr[PrimitiveValue] = js.undefined
}
object DataViewTreeNodeValue {
  
  inline def apply(): DataViewTreeNodeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataViewTreeNodeValue]
  }
  
  extension [Self <: DataViewTreeNodeValue](x: Self) {
    
    inline def setValue(value: PrimitiveValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
