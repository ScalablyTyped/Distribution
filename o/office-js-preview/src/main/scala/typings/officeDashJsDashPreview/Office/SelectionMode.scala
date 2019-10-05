package typings.officeDashJsDashPreview.Office

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
  
  /* 0 */ val Default: typings.officeDashJsDashPreview.Office.SelectionMode.Default with Double = js.native
  /* 2 */ val None: typings.officeDashJsDashPreview.Office.SelectionMode.None with Double = js.native
  /* 1 */ val Selected: typings.officeDashJsDashPreview.Office.SelectionMode.Selected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionMode with Double] = js.native
}

