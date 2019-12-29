package typings.ol.interactionDragBoxMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DragBoxEventType with String] = js.native
  /* "boxdrag" */ @js.native
  object BOXDRAG extends TopLevel[BOXDRAG with String]
  
  /* "boxend" */ @js.native
  object BOXEND extends TopLevel[BOXEND with String]
  
  /* "boxstart" */ @js.native
  object BOXSTART extends TopLevel[BOXSTART with String]
  
}

