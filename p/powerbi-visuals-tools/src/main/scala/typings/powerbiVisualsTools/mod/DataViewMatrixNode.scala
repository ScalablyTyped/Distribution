package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewMatrixNode
  extends StObject
     with DataViewTreeNode {
  
  @JSName("children")
  var children_DataViewMatrixNode: js.UndefOr[js.Array[DataViewMatrixNode]] = js.undefined
  
  /** Indicates whether or not the node is a subtotal node. Its value is false if omitted. */
  var isSubtotal: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates the level this node is on. Zero indicates the outermost children (root node level is undefined). */
  var level: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the source metadata index on the node's level. Its value is 0 if omitted.
    *
    * DEPRECATED: This property is deprecated and exists for backward-compatibility only.
    * New visuals code should consume the new property levelSourceIndex on DataViewMatrixGroupValue instead.
    */
  var levelSourceIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The values of the particular group instance represented by this node.
    * This array property would contain more than one element in a composite group
    * (e.g. Year == 2016 and Month == 'January').
    */
  var levelValues: js.UndefOr[js.Array[DataViewMatrixGroupValue]] = js.undefined
  
  /* If this DataViewMatrixNode represents the  inner-most dimension of row groups (i.e. a leaf node), then this property will contain the values at the
    * matrix intersection under the group. The valueSourceIndex property will contain the position of the column in the select statement to which the
    * value belongs.
    *
    * When this DataViewMatrixNode is used under the context of DataView.matrix.columns, this property is not used.
    */
  @JSName("values")
  var values_DataViewMatrixNode: js.UndefOr[NumberDictionary[DataViewMatrixNodeValue]] = js.undefined
}
object DataViewMatrixNode {
  
  inline def apply(): DataViewMatrixNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataViewMatrixNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataViewMatrixNode] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[DataViewMatrixNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: DataViewMatrixNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setIsSubtotal(value: Boolean): Self = StObject.set(x, "isSubtotal", value.asInstanceOf[js.Any])
    
    inline def setIsSubtotalUndefined: Self = StObject.set(x, "isSubtotal", js.undefined)
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelSourceIndex(value: Double): Self = StObject.set(x, "levelSourceIndex", value.asInstanceOf[js.Any])
    
    inline def setLevelSourceIndexUndefined: Self = StObject.set(x, "levelSourceIndex", js.undefined)
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setLevelValues(value: js.Array[DataViewMatrixGroupValue]): Self = StObject.set(x, "levelValues", value.asInstanceOf[js.Any])
    
    inline def setLevelValuesUndefined: Self = StObject.set(x, "levelValues", js.undefined)
    
    inline def setLevelValuesVarargs(value: DataViewMatrixGroupValue*): Self = StObject.set(x, "levelValues", js.Array(value*))
    
    inline def setValues(value: NumberDictionary[DataViewMatrixNodeValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
