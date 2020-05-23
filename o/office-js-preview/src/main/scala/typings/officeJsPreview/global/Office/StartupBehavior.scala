package typings.officeJsPreview.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Enumerations
/**
  * Provides options to determine the startup behavior of the add-in upon next start-up.
  */
@JSGlobal("Office.StartupBehavior")
@js.native
object StartupBehavior extends js.Object {
  /* "Load" */ val load: typings.officeJsPreview.Office.StartupBehavior.load with String = js.native
  /* "None" */ val none: typings.officeJsPreview.Office.StartupBehavior.none with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.StartupBehavior with String] = js.native
}

