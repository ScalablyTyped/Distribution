package typings.officeJsPreview.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OverlayVerticalAlignment extends StObject
/**
  *
  * Represents the Vertical Alignment of the Overlay relative to the shape.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.OverlayVerticalAlignment")
@js.native
object OverlayVerticalAlignment extends StObject {
  
  /**
    *
    * bottom
    *
    */
  @js.native
  sealed trait bottom
    extends StObject
       with OverlayVerticalAlignment
  
  /**
    *
    * middle
    *
    */
  @js.native
  sealed trait middle
    extends StObject
       with OverlayVerticalAlignment
  
  /**
    *
    * top
    *
    */
  @js.native
  sealed trait top
    extends StObject
       with OverlayVerticalAlignment
}
