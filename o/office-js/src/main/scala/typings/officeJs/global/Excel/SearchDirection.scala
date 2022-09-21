package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the search direction.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.SearchDirection")
@js.native
object SearchDirection extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.SearchDirection & String] = js.native
  
  /* "Backwards" */ val backwards: typings.officeJs.Excel.SearchDirection.backwards & String = js.native
  
  /* "Forward" */ val forward: typings.officeJs.Excel.SearchDirection.forward & String = js.native
}
