package typings.ol.interactionSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectEventType extends js.Object

@JSImport("ol/interaction/Select", "SelectEventType")
@js.native
object SelectEventType extends js.Object {
  @js.native
  sealed trait SELECT extends SelectEventType
  
  /* "select" */ val SELECT: typings.ol.interactionSelectMod.SelectEventType.SELECT with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SelectEventType with String] = js.native
}

