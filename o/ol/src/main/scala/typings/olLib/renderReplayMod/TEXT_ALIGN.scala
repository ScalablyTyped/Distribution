package typings
package olLib.renderReplayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TEXT_ALIGN extends js.Object

@JSImport("ol/render/replay", "TEXT_ALIGN")
@js.native
object TEXT_ALIGN extends js.Object {
  @js.native
  sealed trait alphabetic
    extends olLib.renderReplayMod.TEXT_ALIGN
  
  @js.native
  sealed trait bottom
    extends olLib.renderReplayMod.TEXT_ALIGN
  
  @js.native
  sealed trait center
    extends olLib.renderReplayMod.TEXT_ALIGN
  
  @js.native
  sealed trait end
    extends olLib.renderReplayMod.TEXT_ALIGN
  
  @js.native
  sealed trait hanging
    extends olLib.renderReplayMod.TEXT_ALIGN
  
  @js.native
  sealed trait ideographic
    extends olLib.renderReplayMod.TEXT_ALIGN
  
  @js.native
  sealed trait left
    extends olLib.renderReplayMod.TEXT_ALIGN
  
  @js.native
  sealed trait middle
    extends olLib.renderReplayMod.TEXT_ALIGN
  
  @js.native
  sealed trait right
    extends olLib.renderReplayMod.TEXT_ALIGN
  
  @js.native
  sealed trait start
    extends olLib.renderReplayMod.TEXT_ALIGN
  
  @js.native
  sealed trait top
    extends olLib.renderReplayMod.TEXT_ALIGN
  
  /* 0.8 */ val alphabetic: alphabetic with scala.Double = js.native
  /* 1 */ val bottom: bottom with scala.Double = js.native
  /* 0.5 */ val center: center with scala.Double = js.native
  /* 0 */ val end: end with scala.Double = js.native
  /* 0.2 */ val hanging: hanging with scala.Double = js.native
  /* 0.8 */ val ideographic: ideographic with scala.Double = js.native
  /* 0 */ val left: left with scala.Double = js.native
  /* 0.5 */ val middle: middle with scala.Double = js.native
  /* 1 */ val right: right with scala.Double = js.native
  /* 1 */ val start: start with scala.Double = js.native
  /* 0 */ val top: top with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[olLib.renderReplayMod.TEXT_ALIGN with scala.Double] = js.native
}

