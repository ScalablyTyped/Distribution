package typings.officeJsPreview.Office

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VisibilityMode extends js.Object

/**
  * Visibility mode of the add-in.
  */
@JSGlobal("Office.VisibilityMode")
@js.native
object VisibilityMode extends js.Object {
  /**
    * UI is Hidden
    */
  @js.native
  sealed trait hidden extends VisibilityMode
  
  /**
    * Displayed as taskpane
    */
  @js.native
  sealed trait taskpane extends VisibilityMode
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[VisibilityMode with String] = js.native
  /* "Hidden" */ @js.native
  object hidden extends TopLevel[hidden with String]
  
  /* "Taskpane" */ @js.native
  object taskpane extends TopLevel[taskpane with String]
  
}

