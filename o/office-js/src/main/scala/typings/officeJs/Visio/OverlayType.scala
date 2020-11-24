package typings.officeJs.Visio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
