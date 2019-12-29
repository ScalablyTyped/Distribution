package typings.officeDashJs.Office

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionMode extends js.Object

/**
  * Specifies whether to select (highlight) the location to navigate to (when using the {@link Office.Document | Document}.goToByIdAsync method).
  */
@JSGlobal("Office.SelectionMode")
@js.native
object SelectionMode extends js.Object {
  @js.native
  sealed trait Default extends SelectionMode
  
  /**
    * The cursor is moved to the beginning of the location.
    */
  @js.native
  sealed trait None extends SelectionMode
  
  /**
    * The location will be selected (highlighted).
    */
  @js.native
  sealed trait Selected extends SelectionMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionMode with Double] = js.native
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 2 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Selected extends TopLevel[Selected with Double]
  
}

