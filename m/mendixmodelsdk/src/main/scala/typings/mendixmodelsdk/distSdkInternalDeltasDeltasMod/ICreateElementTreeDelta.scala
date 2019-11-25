package typings.mendixmodelsdk.distSdkInternalDeltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.CREATE_ELEMENT_TREE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreateElementTreeDelta
  extends IDelta
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
  def apply(
    deltaType: CREATE_ELEMENT_TREE,
    elementTree: IStructureJSON,
    parentId: String,
    parentPropertyName: String,
    unitId: String,
    additionIndex: Int | Double = null
  ): ICreateElementTreeDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementTree = elementTree.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], parentPropertyName = parentPropertyName.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    if (additionIndex != null) __obj.updateDynamic("additionIndex")(additionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateElementTreeDelta]
  }
}

