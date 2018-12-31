package typings
package officeDashJsDashPreviewLib.VisioNs

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
  sealed trait bottom
    extends officeDashJsDashPreviewLib.VisioNs.OverlayVerticalAlignment
  
  /**
    *
    * middle
    *
    */
  @js.native
  sealed trait middle
    extends officeDashJsDashPreviewLib.VisioNs.OverlayVerticalAlignment
  
  /**
    *
    * top
    *
    */
  @js.native
  sealed trait top
    extends officeDashJsDashPreviewLib.VisioNs.OverlayVerticalAlignment
  
  /* "Bottom" */ val bottom: bottom with java.lang.String = js.native
  /* "Middle" */ val middle: middle with java.lang.String = js.native
  /* "Top" */ val top: top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.VisioNs.OverlayVerticalAlignment with java.lang.String
  ] = js.native
}

