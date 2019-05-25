package typings
package olLib.interactionDragAndDropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DragAndDropEventType extends js.Object

@JSImport("ol/interaction/DragAndDrop", "DragAndDropEventType")
@js.native
object DragAndDropEventType extends js.Object {
  @js.native
  sealed trait ADD_FEATURES
    extends olLib.interactionDragAndDropMod.DragAndDropEventType
  
  /* "addfeatures" */ val ADD_FEATURES: ADD_FEATURES with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[olLib.interactionDragAndDropMod.DragAndDropEventType with java.lang.String] = js.native
}

