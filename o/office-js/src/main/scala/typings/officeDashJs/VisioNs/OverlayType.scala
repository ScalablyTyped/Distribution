package typings.officeDashJs.VisioNs

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
    * html
    *
    */
  @js.native
  sealed trait html extends OverlayType
  
  /**
    *
    * image
    *
    */
  @js.native
  sealed trait image extends OverlayType
  
  /**
    *
    * text
    *
    */
  @js.native
  sealed trait text extends OverlayType
  
  /* "Html" */ val html: typings.officeDashJs.VisioNs.OverlayType.html with String = js.native
  /* "Image" */ val image: typings.officeDashJs.VisioNs.OverlayType.image with String = js.native
  /* "Text" */ val text: typings.officeDashJs.VisioNs.OverlayType.text with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OverlayType with String] = js.native
}

