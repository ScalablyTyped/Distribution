package typings
package mendixmodelsdkLib.distSdkInternalDeltasDeltasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAttachElementDelta extends IElementDelta {
  var deltaType: mendixmodelsdkLib.mendixmodelsdkLibStrings.ATTACH_ELEMENT
  /**
       * If the indicated new property is listy, `newIndex` is the index where the element-to-move will end up.
       * If not set, the element-to-move will be added at the end.
       */
  var newIndex: js.UndefOr[scala.Double] = js.undefined
  /**
       * The ID of the parent element to attach the element to indicated by `elementId` to.
       */
  var newParentId: java.lang.String
  /**
       * The name of the property of the new parent element to put the element-to-move in/on.
       */
  var newParentPropertyName: java.lang.String
}

