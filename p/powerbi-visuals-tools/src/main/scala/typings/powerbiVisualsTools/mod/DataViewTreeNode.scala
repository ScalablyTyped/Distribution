package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.powerbiVisualsTools.mod.data.ISQExpr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewTreeNode extends StObject {
  
  /** The set of expressions that define the identity for the child nodes.  This must match items in the DataViewScopeIdentity of those nodes. */
  var childIdentityFields: js.UndefOr[js.Array[ISQExpr]] = js.undefined
  
  var children: js.UndefOr[js.Array[DataViewTreeNode]] = js.undefined
  
  var identity: js.UndefOr[DataViewScopeIdentity] = js.undefined
  
  var name: js.UndefOr[PrimitiveValue] = js.undefined
  
  /** The data repetition objects. */
  var objects: js.UndefOr[DataViewObjects] = js.undefined
  
  /**
    * When used under the context of DataView.tree, this value is one of the elements in the values property.
    *
    * When used under the context of DataView.matrix, this property is the value of the particular
    * group instance represented by this node (e.g. In a grouping on Year, a node can have value == 2016).
    *
    * DEPRECATED for usage under the context of DataView.matrix: This property is deprecated for objects
    * that conform to the DataViewMatrixNode interface (which extends DataViewTreeNode).
    * New visuals code should consume the new property levelValues on DataViewMatrixNode instead.
    * If this node represents a composite group node in matrix, this property will be undefined.
    */
  var value: js.UndefOr[PrimitiveValue] = js.undefined
  
  /**
    * This property contains all the values in this node.
    * The key of each of the key-value-pair in this dictionary is the position of the column in the
    * select statement to which the value belongs.
    */
  var values: js.UndefOr[NumberDictionary[DataViewTreeNodeValue]] = js.undefined
}
object DataViewTreeNode {
  
  inline def apply(): DataViewTreeNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataViewTreeNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataViewTreeNode] (val x: Self) extends AnyVal {
    
    inline def setChildIdentityFields(value: js.Array[ISQExpr]): Self = StObject.set(x, "childIdentityFields", value.asInstanceOf[js.Any])
    
    inline def setChildIdentityFieldsUndefined: Self = StObject.set(x, "childIdentityFields", js.undefined)
    
    inline def setChildIdentityFieldsVarargs(value: ISQExpr*): Self = StObject.set(x, "childIdentityFields", js.Array(value*))
    
    inline def setChildren(value: js.Array[DataViewTreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: DataViewTreeNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setIdentity(value: DataViewScopeIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setName(value: PrimitiveValue): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObjects(value: DataViewObjects): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    
    inline def setValue(value: PrimitiveValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValues(value: NumberDictionary[DataViewTreeNodeValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
