package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.CREATE_UNIT_TREE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreateUnitTreeDelta
  extends IDelta
     with Delta {
  /**
    * The ID of the containing unit.
    * (This relates to the project tree.)
    */
  var containerId: String
  /**
    * The name of the property of the containing unit which will contain the unit-to-create.
    * (This relates to the project tree.)
    */
  var containmentName: String
  /**
    * The qualified name of the type of unit to create.
    */
  var contentType: String
  var deltaType: CREATE_UNIT_TREE
  /**
    * The JSON of the unit tree to create.
    */
  var unitTree: IStructureJSON
}

object ICreateUnitTreeDelta {
  @scala.inline
  def apply(
    containerId: String,
    containmentName: String,
    contentType: String,
    deltaType: CREATE_UNIT_TREE,
    unitId: String,
    unitTree: IStructureJSON
  ): ICreateUnitTreeDelta = {
    val __obj = js.Dynamic.literal(containerId = containerId.asInstanceOf[js.Any], containmentName = containmentName.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], deltaType = deltaType.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any], unitTree = unitTree.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICreateUnitTreeDelta]
  }
}

