package typings.officeJs.Visio

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
  
}

