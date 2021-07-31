package typings.officeJs.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OverlayHorizontalAlignment extends StObject
/**
  *
  * Represents the Horizontal Alignment of the Overlay relative to the shape.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.OverlayHorizontalAlignment")
@js.native
object OverlayHorizontalAlignment extends StObject {
  
  /**
    *
    * center
    *
    */
  @js.native
  sealed trait center
    extends StObject
       with OverlayHorizontalAlignment
  
  /**
    *
    * left
    *
    */
  @js.native
  sealed trait left
    extends StObject
       with OverlayHorizontalAlignment
  
  /**
    *
    * right
    *
    */
  @js.native
  sealed trait right
    extends StObject
       with OverlayHorizontalAlignment
}
