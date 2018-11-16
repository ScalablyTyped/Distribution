package typings
package officeDashJsLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OverlayType extends js.Object

/**
     *
     * Represents the type of the overlay.
     *
     * [Api set:  1.1]
     */
@JSGlobal("Visio.OverlayType")
@js.native
object OverlayType extends js.Object {
  /**
           *
           * image
           *
           */
  @js.native
  sealed trait image
    extends officeDashJsLib.VisioNs.OverlayType
  
  /**
           *
           * text
           *
           */
  @js.native
  sealed trait text
    extends officeDashJsLib.VisioNs.OverlayType
  
  /* "Image" */ val image: image with java.lang.String = js.native
  /* "Text" */ val text: text with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.VisioNs.OverlayType with java.lang.String] = js.native
}

