package typings.microsoftDashAjax.Sys.UI

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VisibilityMode with Double] = js.native
  /* 1 */ @js.native
  object collapse extends TopLevel[collapse with Double]
  
  /* 0 */ @js.native
  object hide extends TopLevel[hide with Double]
  
}

