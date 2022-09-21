package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewSingle extends StObject {
  
  var value: PrimitiveValue
}
object DataViewSingle {
  
  inline def apply(value: PrimitiveValue): DataViewSingle = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewSingle]
  }
  
  extension [Self <: DataViewSingle](x: Self) {
    
    inline def setValue(value: PrimitiveValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
