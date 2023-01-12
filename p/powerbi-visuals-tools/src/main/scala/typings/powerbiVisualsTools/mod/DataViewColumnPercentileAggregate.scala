package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewColumnPercentileAggregate extends StObject {
  
  var exclusive: js.UndefOr[Boolean] = js.undefined
  
  var k: Double
  
  var value: PrimitiveValue
}
object DataViewColumnPercentileAggregate {
  
  inline def apply(k: Double, value: PrimitiveValue): DataViewColumnPercentileAggregate = {
    val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewColumnPercentileAggregate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataViewColumnPercentileAggregate] (val x: Self) extends AnyVal {
    
    inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    inline def setK(value: Double): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    inline def setValue(value: PrimitiveValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
