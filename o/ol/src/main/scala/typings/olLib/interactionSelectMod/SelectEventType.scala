package typings
package olLib.interactionSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectEventType extends js.Object

@JSImport("ol/interaction/Select", "SelectEventType")
@js.native
object SelectEventType extends js.Object {
  @js.native
  sealed trait SELECT
    extends olLib.interactionSelectMod.SelectEventType
  
  /* "select" */ val SELECT: SELECT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[olLib.interactionSelectMod.SelectEventType with java.lang.String] = js.native
}

