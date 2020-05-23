package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.ATTACH_ELEMENT
import typings.mendixmodelsdk.mendixmodelsdkStrings.CREATE_ELEMENT_TREE
import typings.mendixmodelsdk.mendixmodelsdkStrings.CREATE_UNIT_TREE
import typings.mendixmodelsdk.mendixmodelsdkStrings.DELETE_ELEMENT
import typings.mendixmodelsdk.mendixmodelsdkStrings.DELETE_UNIT
import typings.mendixmodelsdk.mendixmodelsdkStrings.DETACH_ELEMENT
import typings.mendixmodelsdk.mendixmodelsdkStrings.UPDATE_PROPERTY_VALUE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mendixmodelsdk.deltasDeltasMod.ICreateElementTreeDelta
  - typings.mendixmodelsdk.deltasDeltasMod.IDeleteElementDelta
  - typings.mendixmodelsdk.deltasDeltasMod.IAttachElementDelta
  - typings.mendixmodelsdk.deltasDeltasMod.IDetachElementDelta
  - typings.mendixmodelsdk.deltasDeltasMod.ICreateUnitTreeDelta
  - typings.mendixmodelsdk.deltasDeltasMod.IDeleteUnitDelta
  - typings.mendixmodelsdk.deltasDeltasMod.IUpdatePropertyValueDelta
*/
trait Delta extends js.Object

object Delta {
  @scala.inline
  def ICreateUnitTreeDelta(
    containerId: String,
    containmentName: String,
    contentType: String,
    deltaType: CREATE_UNIT_TREE,
    unitId: String,
    unitTree: IStructureJSON
  ): Delta = {
    val __obj = js.Dynamic.literal(containerId = containerId.asInstanceOf[js.Any], containmentName = containmentName.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], deltaType = deltaType.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any], unitTree = unitTree.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  @scala.inline
  def IDeleteElementDelta(deltaType: DELETE_ELEMENT, elementId: String, unitId: String): Delta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  @scala.inline
  def ICreateElementTreeDelta(
    deltaType: CREATE_ELEMENT_TREE,
    elementTree: IStructureJSON,
    parentId: String,
    parentPropertyName: String,
    unitId: String,
    additionIndex: js.UndefOr[Double] = js.undefined
  ): Delta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementTree = elementTree.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], parentPropertyName = parentPropertyName.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    if (!js.isUndefined(additionIndex)) __obj.updateDynamic("additionIndex")(additionIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  @scala.inline
  def IDetachElementDelta(deltaType: DETACH_ELEMENT, elementId: String, unitId: String): Delta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  @scala.inline
  def IUpdatePropertyValueDelta(
    deltaType: UPDATE_PROPERTY_VALUE,
    elementId: String,
    mutator: Mutator,
    propertyName: String,
    unitId: String
  ): Delta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], mutator = mutator.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  @scala.inline
  def IDeleteUnitDelta(deltaType: DELETE_UNIT, unitId: String): Delta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  @scala.inline
  def IAttachElementDelta(
    deltaType: ATTACH_ELEMENT,
    elementId: String,
    newParentId: String,
    newParentPropertyName: String,
    unitId: String,
    newIndex: js.UndefOr[Double] = js.undefined
  ): Delta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], newParentId = newParentId.asInstanceOf[js.Any], newParentPropertyName = newParentPropertyName.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    if (!js.isUndefined(newIndex)) __obj.updateDynamic("newIndex")(newIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
}

