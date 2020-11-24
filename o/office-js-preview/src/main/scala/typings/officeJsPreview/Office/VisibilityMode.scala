package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
