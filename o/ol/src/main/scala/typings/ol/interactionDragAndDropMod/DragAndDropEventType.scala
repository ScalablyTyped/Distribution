package typings.ol.interactionDragAndDropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DragAndDropEventType extends js.Object

@JSImport("ol/interaction/DragAndDrop", "DragAndDropEventType")
@js.native
object DragAndDropEventType extends js.Object {
  @js.native
  sealed trait ADD_FEATURES extends DragAndDropEventType
  
  /* "addfeatures" */ val ADD_FEATURES: typings.ol.interactionDragAndDropMod.DragAndDropEventType.ADD_FEATURES with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DragAndDropEventType with String] = js.native
}

