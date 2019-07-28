package typings.microsoftDashAjax.SysNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VisibilityMode extends js.Object

/**
  * Describes the layout of a DOM element in the page when the element's visible property is set to false.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397498(v=vs.100).aspx}
  */
@JSGlobal("Sys.UI.VisibilityMode")
@js.native
object VisibilityMode extends js.Object {
  /**
    * The element is not visible, and the space it occupies is collapsed.
    */
  @js.native
  sealed trait collapse extends VisibilityMode
  
  /**
    * The element is not visible, but it occupies space on the page.
    */
  @js.native
  sealed trait hide extends VisibilityMode
  
  /* 1 */ val collapse: typings.microsoftDashAjax.SysNs.UINs.VisibilityMode.collapse with Double = js.native
  /* 0 */ val hide: typings.microsoftDashAjax.SysNs.UINs.VisibilityMode.hide with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VisibilityMode with Double] = js.native
}

