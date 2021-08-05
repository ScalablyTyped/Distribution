package typings.mendixmodelsdk.deltasDeltasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mendixmodelsdk.deltasDeltasMod.ICreateElementTreeDelta
  - typings.mendixmodelsdk.deltasDeltasMod.IDeleteElementDelta
  - typings.mendixmodelsdk.deltasDeltasMod.IAttachElementDelta
  - typings.mendixmodelsdk.deltasDeltasMod.IDetachElementDelta
  - typings.mendixmodelsdk.deltasDeltasMod.ICreateUnitTreeDelta
  - typings.mendixmodelsdk.deltasDeltasMod.IDeleteUnitDelta
  - typings.mendixmodelsdk.deltasDeltasMod.IUpdatePropertyValueDelta
*/
trait Delta extends StObject
object Delta {
  
  inline def IAttachElementDelta(elementId: String, newParentId: String, newParentPropertyName: String, unitId: String): typings.mendixmodelsdk.deltasDeltasMod.IAttachElementDelta = {
    val __obj = js.Dynamic.literal(deltaType = "ATTACH_ELEMENT", elementId = elementId.asInstanceOf[js.Any], newParentId = newParentId.asInstanceOf[js.Any], newParentPropertyName = newParentPropertyName.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mendixmodelsdk.deltasDeltasMod.IAttachElementDelta]
  }
  
  inline def ICreateElementTreeDelta(elementTree: IStructureJSON, parentId: String, parentPropertyName: String, unitId: String): typings.mendixmodelsdk.deltasDeltasMod.ICreateElementTreeDelta = {
    val __obj = js.Dynamic.literal(deltaType = "CREATE_ELEMENT_TREE", elementTree = elementTree.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], parentPropertyName = parentPropertyName.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mendixmodelsdk.deltasDeltasMod.ICreateElementTreeDelta]
  }
  
  inline def ICreateUnitTreeDelta(
    containerId: String,
    containmentName: String,
    contentType: String,
    unitId: String,
    unitTree: IStructureJSON
  ): typings.mendixmodelsdk.deltasDeltasMod.ICreateUnitTreeDelta = {
    val __obj = js.Dynamic.literal(containerId = containerId.asInstanceOf[js.Any], containmentName = containmentName.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], deltaType = "CREATE_UNIT_TREE", unitId = unitId.asInstanceOf[js.Any], unitTree = unitTree.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mendixmodelsdk.deltasDeltasMod.ICreateUnitTreeDelta]
  }
  
  inline def IDeleteElementDelta(elementId: String, unitId: String): typings.mendixmodelsdk.deltasDeltasMod.IDeleteElementDelta = {
    val __obj = js.Dynamic.literal(deltaType = "DELETE_ELEMENT", elementId = elementId.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mendixmodelsdk.deltasDeltasMod.IDeleteElementDelta]
  }
  
  inline def IDeleteUnitDelta(unitId: String): typings.mendixmodelsdk.deltasDeltasMod.IDeleteUnitDelta = {
    val __obj = js.Dynamic.literal(deltaType = "DELETE_UNIT", unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mendixmodelsdk.deltasDeltasMod.IDeleteUnitDelta]
  }
  
  inline def IDetachElementDelta(elementId: String, unitId: String): typings.mendixmodelsdk.deltasDeltasMod.IDetachElementDelta = {
    val __obj = js.Dynamic.literal(deltaType = "DETACH_ELEMENT", elementId = elementId.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mendixmodelsdk.deltasDeltasMod.IDetachElementDelta]
  }
  
  inline def IUpdatePropertyValueDelta(elementId: String, mutator: Mutator, propertyName: String, unitId: String): typings.mendixmodelsdk.deltasDeltasMod.IUpdatePropertyValueDelta = {
    val __obj = js.Dynamic.literal(deltaType = "UPDATE_PROPERTY_VALUE", elementId = elementId.asInstanceOf[js.Any], mutator = mutator.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mendixmodelsdk.deltasDeltasMod.IUpdatePropertyValueDelta]
  }
}
