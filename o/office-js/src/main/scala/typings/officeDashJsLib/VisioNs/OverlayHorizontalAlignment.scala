package typings
package officeDashJsLib.VisioNs

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
  sealed trait center
    extends officeDashJsLib.VisioNs.OverlayHorizontalAlignment
  
  /**
    *
    * left
    *
    */
  @js.native
  sealed trait left
    extends officeDashJsLib.VisioNs.OverlayHorizontalAlignment
  
  /**
    *
    * right
    *
    */
  @js.native
  sealed trait right
    extends officeDashJsLib.VisioNs.OverlayHorizontalAlignment
  
  /* "Center" */ val center: center with java.lang.String = js.native
  /* "Left" */ val left: left with java.lang.String = js.native
  /* "Right" */ val right: right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.VisioNs.OverlayHorizontalAlignment with java.lang.String] = js.native
}

