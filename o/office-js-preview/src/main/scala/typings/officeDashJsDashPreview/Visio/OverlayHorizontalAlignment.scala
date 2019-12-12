package typings.officeDashJsDashPreview.Visio

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Visio.OverlayHorizontalAlignment.center
import typings.officeDashJsDashPreview.Visio.OverlayHorizontalAlignment.left
import typings.officeDashJsDashPreview.Visio.OverlayHorizontalAlignment.right
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OverlayHorizontalAlignment with String] = js.native
  /* "Center" */ @js.native
  object center extends TopLevel[center with String]
  
  /* "Left" */ @js.native
  object left extends TopLevel[left with String]
  
  /* "Right" */ @js.native
  object right extends TopLevel[right with String]
  
}

