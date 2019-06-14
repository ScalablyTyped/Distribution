package typings
package officeDashJsDashPreviewLib.OfficeNs

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
  sealed trait Default
    extends officeDashJsDashPreviewLib.OfficeNs.SelectionMode
  
  /**
    * The cursor is moved to the beginning of the location.
    */
  @js.native
  sealed trait None
    extends officeDashJsDashPreviewLib.OfficeNs.SelectionMode
  
  /**
    * The location will be selected (highlighted).
    */
  @js.native
  sealed trait Selected
    extends officeDashJsDashPreviewLib.OfficeNs.SelectionMode
  
  /* 0 */ val Default: Default with scala.Double = js.native
  /* 2 */ val None: None with scala.Double = js.native
  /* 1 */ val Selected: Selected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.SelectionMode with scala.Double] = js.native
}

