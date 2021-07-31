package typings.officeJsPreview.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OverlayType extends StObject
/**
  *
  * Represents the type of the overlay.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.OverlayType")
@js.native
object OverlayType extends StObject {
  
  /**
    *
    * html
    *
    */
  @js.native
  sealed trait html
    extends StObject
       with OverlayType
  
  /**
    *
    * image
    *
    */
  @js.native
  sealed trait image
    extends StObject
       with OverlayType
  
  /**
    *
    * text
    *
    */
  @js.native
  sealed trait text
    extends StObject
       with OverlayType
}
