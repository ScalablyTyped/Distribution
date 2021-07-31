package typings.officeJsPreview.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Visibility mode of the add-in.
  */
@JSGlobal("Office.VisibilityMode")
@js.native
object VisibilityMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.VisibilityMode & String] = js.native
  
  /* "Hidden" */ val hidden: typings.officeJsPreview.Office.VisibilityMode.hidden & String = js.native
  
  /* "Taskpane" */ val taskpane: typings.officeJsPreview.Office.VisibilityMode.taskpane & String = js.native
}
