package typings.officeDashJs.Visio

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OverlayType with String] = js.native
  /* "Html" */ @js.native
  object html extends TopLevel[html with String]
  
  /* "Image" */ @js.native
  object image extends TopLevel[image with String]
  
  /* "Text" */ @js.native
  object text extends TopLevel[text with String]
  
}

