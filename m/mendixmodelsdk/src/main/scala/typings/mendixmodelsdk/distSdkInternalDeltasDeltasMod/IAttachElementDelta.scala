package typings.mendixmodelsdk.distSdkInternalDeltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.ATTACH_ELEMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttachElementDelta
  extends IElementDelta
     with Delta {
  var deltaType: ATTACH_ELEMENT
  /**
    * If the indicated new property is listy, `newIndex` is the index where the element-to-move will end up.
    * If not set, the element-to-move will be added at the end.
    */
  var newIndex: js.UndefOr[Double] = js.undefined
  /**
    * The ID of the parent element to attach the element to indicated by `elementId` to.
    */
  var newParentId: String
  /**
    * The name of the property of the new parent element to put the element-to-move in/on.
    */
  var newParentPropertyName: String
}

object IAttachElementDelta {
  @scala.inline
  def apply(
    deltaType: ATTACH_ELEMENT,
    elementId: String,
    newParentId: String,
    newParentPropertyName: String,
    unitId: String,
    newIndex: Int | Double = null
  ): IAttachElementDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], newParentId = newParentId.asInstanceOf[js.Any], newParentPropertyName = newParentPropertyName.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    if (newIndex != null) __obj.updateDynamic("newIndex")(newIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttachElementDelta]
  }
}

