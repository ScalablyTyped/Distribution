package typings
package olLib.interactionDrawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DrawEventType extends js.Object

@JSImport("ol/interaction/Draw", "DrawEventType")
@js.native
object DrawEventType extends js.Object {
  @js.native
  sealed trait DRAWEND
    extends olLib.interactionDrawMod.DrawEventType
  
  @js.native
  sealed trait DRAWSTART
    extends olLib.interactionDrawMod.DrawEventType
  
  /* "drawend" */ val DRAWEND: DRAWEND with java.lang.String = js.native
  /* "drawstart" */ val DRAWSTART: DRAWSTART with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[olLib.interactionDrawMod.DrawEventType with java.lang.String] = js.native
}

