package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.CREATE_ELEMENT_TREE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICreateElementTreeDelta
  extends IDelta
     with Delta {
  /**
    * Index where the element should be created. Only for listy properties.
    */
  var additionIndex: js.UndefOr[Double] = js.native
  var deltaType: CREATE_ELEMENT_TREE = js.native
  /**
    * The JSON of the element tree to create.
    */
  var elementTree: IStructureJSON = js.native
  /**
    * The ID of the parent element to create the new element in.
    */
  var parentId: String = js.native
  /**
    * The name of the property to create the new element on/in.
    * This must a property of PART kind with an element type compatible with `elementType`.
    */
  var parentPropertyName: String = js.native
}

object ICreateElementTreeDelta {
  @scala.inline
  def apply(
    deltaType: CREATE_ELEMENT_TREE,
    elementTree: IStructureJSON,
    parentId: String,
    parentPropertyName: String,
    unitId: String
  ): ICreateElementTreeDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementTree = elementTree.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], parentPropertyName = parentPropertyName.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateElementTreeDelta]
  }
  @scala.inline
  implicit class ICreateElementTreeDeltaOps[Self <: ICreateElementTreeDelta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeltaType(value: CREATE_ELEMENT_TREE): Self = this.set("deltaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementTree(value: IStructureJSON): Self = this.set("elementTree", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentPropertyName(value: String): Self = this.set("parentPropertyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdditionIndex(value: Double): Self = this.set("additionIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionIndex: Self = this.set("additionIndex", js.undefined)
  }
  
}

