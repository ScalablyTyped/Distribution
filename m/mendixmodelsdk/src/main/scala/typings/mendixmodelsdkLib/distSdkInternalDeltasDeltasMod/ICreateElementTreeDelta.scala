package typings
package mendixmodelsdkLib.distSdkInternalDeltasDeltasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreateElementTreeDelta extends IDelta {
  /**
    * Index where the element should be created. Only for listy properties.
    */
  var additionIndex: js.UndefOr[scala.Double] = js.undefined
  var deltaType: mendixmodelsdkLib.mendixmodelsdkLibStrings.CREATE_ELEMENT_TREE
  /**
    * The JSON of the element tree to create.
    */
  var elementTree: IStructureJSON
  /**
    * The ID of the parent element to create the new element in.
    */
  var parentId: java.lang.String
  /**
    * The name of the property to create the new element on/in.
    * This must a property of PART kind with an element type compatible with `elementType`.
    */
  var parentPropertyName: java.lang.String
}

