package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.CREATE_ELEMENT_TREE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICreateElementTreeDelta
  extends StObject
     with IDelta
     with Delta {
  
  /**
    * Index where the element should be created. Only for listy properties.
    */
  var additionIndex: js.UndefOr[Double] = js.undefined
  
  var deltaType: CREATE_ELEMENT_TREE
  
  /**
    * The JSON of the element tree to create.
    */
  var elementTree: IStructureJSON
  
  /**
    * The ID of the parent element to create the new element in.
    */
  var parentId: String
  
  /**
    * The name of the property to create the new element on/in.
    * This must a property of PART kind with an element type compatible with `elementType`.
    */
  var parentPropertyName: String
}
object ICreateElementTreeDelta {
  
  @scala.inline
  def apply(elementTree: IStructureJSON, parentId: String, parentPropertyName: String, unitId: String): ICreateElementTreeDelta = {
    val __obj = js.Dynamic.literal(deltaType = "CREATE_ELEMENT_TREE", elementTree = elementTree.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], parentPropertyName = parentPropertyName.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateElementTreeDelta]
  }
  
  @scala.inline
  implicit class ICreateElementTreeDeltaMutableBuilder[Self <: ICreateElementTreeDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionIndex(value: Double): Self = StObject.set(x, "additionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionIndexUndefined: Self = StObject.set(x, "additionIndex", js.undefined)
    
    @scala.inline
    def setDeltaType(value: CREATE_ELEMENT_TREE): Self = StObject.set(x, "deltaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementTree(value: IStructureJSON): Self = StObject.set(x, "elementTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentPropertyName(value: String): Self = StObject.set(x, "parentPropertyName", value.asInstanceOf[js.Any])
  }
}
