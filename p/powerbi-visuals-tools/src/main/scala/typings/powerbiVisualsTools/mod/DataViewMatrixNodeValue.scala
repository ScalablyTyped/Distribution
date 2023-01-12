package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a value at the matrix intersection, used in the values property on DataViewMatrixNode (inherited from DataViewTreeNode). */
trait DataViewMatrixNodeValue
  extends StObject
     with DataViewTreeNodeValue {
  
  var highlight: js.UndefOr[PrimitiveValue] = js.undefined
  
  /** The data repetition objects. */
  var objects: js.UndefOr[DataViewObjects] = js.undefined
  
  /** Indicates the index of the corresponding measure (held by DataViewMatrix.valueSources). Its value is 0 if omitted. */
  var valueSourceIndex: js.UndefOr[Double] = js.undefined
}
object DataViewMatrixNodeValue {
  
  inline def apply(): DataViewMatrixNodeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataViewMatrixNodeValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataViewMatrixNodeValue] (val x: Self) extends AnyVal {
    
    inline def setHighlight(value: PrimitiveValue): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    inline def setObjects(value: DataViewObjects): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    
    inline def setValueSourceIndex(value: Double): Self = StObject.set(x, "valueSourceIndex", value.asInstanceOf[js.Any])
    
    inline def setValueSourceIndexUndefined: Self = StObject.set(x, "valueSourceIndex", js.undefined)
  }
}
