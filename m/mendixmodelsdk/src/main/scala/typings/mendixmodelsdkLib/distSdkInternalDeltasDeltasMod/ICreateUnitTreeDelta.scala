package typings
package mendixmodelsdkLib.distSdkInternalDeltasDeltasMod

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
  var containerId: java.lang.String
  /**
    * The name of the property of the containing unit which will contain the unit-to-create.
    * (This relates to the project tree.)
    */
  var containmentName: java.lang.String
  /**
    * The qualified name of the type of unit to create.
    */
  var contentType: java.lang.String
  var deltaType: mendixmodelsdkLib.mendixmodelsdkLibStrings.CREATE_UNIT_TREE
  /**
    * The JSON of the unit tree to create.
    */
  var unitTree: IStructureJSON
}

object ICreateUnitTreeDelta {
  @scala.inline
  def apply(
    containerId: java.lang.String,
    containmentName: java.lang.String,
    contentType: java.lang.String,
    deltaType: mendixmodelsdkLib.mendixmodelsdkLibStrings.CREATE_UNIT_TREE,
    unitId: java.lang.String,
    unitTree: IStructureJSON
  ): ICreateUnitTreeDelta = {
    val __obj = js.Dynamic.literal(containerId = containerId, containmentName = containmentName, contentType = contentType, deltaType = deltaType, unitId = unitId, unitTree = unitTree)
  
    __obj.asInstanceOf[ICreateUnitTreeDelta]
  }
}

