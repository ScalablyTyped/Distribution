package typings.officeDashJs.Visio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OverlayHorizontalAlignment extends js.Object

/**
  *
  * Represents the Horizontal Alignment of the Overlay relative to the shape.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.OverlayHorizontalAlignment")
@js.native
object OverlayHorizontalAlignment extends js.Object {
  /**
    *
    * center
    *
    */
  @js.native
  sealed trait center extends OverlayHorizontalAlignment
  
  /**
    *
    * left
    *
    */
  @js.native
  sealed trait left extends OverlayHorizontalAlignment
  
  /**
    *
    * right
    *
    */
  @js.native
  sealed trait right extends OverlayHorizontalAlignment
  
  /* "Center" */ val center: typings.officeDashJs.Visio.OverlayHorizontalAlignment.center with String = js.native
  /* "Left" */ val left: typings.officeDashJs.Visio.OverlayHorizontalAlignment.left with String = js.native
  /* "Right" */ val right: typings.officeDashJs.Visio.OverlayHorizontalAlignment.right with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OverlayHorizontalAlignment with String] = js.native
}

