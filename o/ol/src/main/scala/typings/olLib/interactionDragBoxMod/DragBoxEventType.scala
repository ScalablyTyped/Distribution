package typings
package olLib.interactionDragBoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DragBoxEventType extends js.Object

@JSImport("ol/interaction/DragBox", "DragBoxEventType")
@js.native
object DragBoxEventType extends js.Object {
  @js.native
  sealed trait BOXDRAG
    extends olLib.interactionDragBoxMod.DragBoxEventType
  
  @js.native
  sealed trait BOXEND
    extends olLib.interactionDragBoxMod.DragBoxEventType
  
  @js.native
  sealed trait BOXSTART
    extends olLib.interactionDragBoxMod.DragBoxEventType
  
  /* "boxdrag" */ val BOXDRAG: BOXDRAG with java.lang.String = js.native
  /* "boxend" */ val BOXEND: BOXEND with java.lang.String = js.native
  /* "boxstart" */ val BOXSTART: BOXSTART with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[olLib.interactionDragBoxMod.DragBoxEventType with java.lang.String] = js.native
}

