package typings.officeDashJs.Visio

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OverlayVerticalAlignment extends js.Object

/**
  *
  * Represents the Vertical Alignment of the Overlay relative to the shape.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.OverlayVerticalAlignment")
@js.native
object OverlayVerticalAlignment extends js.Object {
  /**
    *
    * bottom
    *
    */
  @js.native
  sealed trait bottom extends OverlayVerticalAlignment
  
  /**
    *
    * middle
    *
    */
  @js.native
  sealed trait middle extends OverlayVerticalAlignment
  
  /**
    *
    * top
    *
    */
  @js.native
  sealed trait top extends OverlayVerticalAlignment
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OverlayVerticalAlignment with String] = js.native
  /* "Bottom" */ @js.native
  object bottom extends TopLevel[bottom with String]
  
  /* "Middle" */ @js.native
  object middle extends TopLevel[middle with String]
  
  /* "Top" */ @js.native
  object top extends TopLevel[top with String]
  
}

