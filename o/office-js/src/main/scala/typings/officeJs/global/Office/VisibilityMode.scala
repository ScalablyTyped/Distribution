package typings.officeJs.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Visibility mode of the add-in.
  */
@JSGlobal("Office.VisibilityMode")
@js.native
object VisibilityMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Office.VisibilityMode with String] = js.native
  
  /* "Hidden" */ val hidden: typings.officeJs.Office.VisibilityMode.hidden with String = js.native
  
  /* "Taskpane" */ val taskpane: typings.officeJs.Office.VisibilityMode.taskpane with String = js.native
}
