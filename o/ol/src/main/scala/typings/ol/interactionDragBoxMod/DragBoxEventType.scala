package typings.ol.interactionDragBoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DragBoxEventType extends js.Object

@JSImport("ol/interaction/DragBox", "DragBoxEventType")
@js.native
object DragBoxEventType extends js.Object {
  @js.native
  sealed trait BOXDRAG extends DragBoxEventType
  
  @js.native
  sealed trait BOXEND extends DragBoxEventType
  
  @js.native
  sealed trait BOXSTART extends DragBoxEventType
  
  /* "boxdrag" */ val BOXDRAG: typings.ol.interactionDragBoxMod.DragBoxEventType.BOXDRAG with String = js.native
  /* "boxend" */ val BOXEND: typings.ol.interactionDragBoxMod.DragBoxEventType.BOXEND with String = js.native
  /* "boxstart" */ val BOXSTART: typings.ol.interactionDragBoxMod.DragBoxEventType.BOXSTART with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DragBoxEventType with String] = js.native
}

