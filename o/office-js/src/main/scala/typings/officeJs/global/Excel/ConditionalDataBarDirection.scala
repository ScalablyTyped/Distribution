package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the data bar direction within a cell.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalDataBarDirection")
@js.native
object ConditionalDataBarDirection extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ConditionalDataBarDirection & String] = js.native
  
  /* "Context" */ val context: typings.officeJs.Excel.ConditionalDataBarDirection.context & String = js.native
  
  /* "LeftToRight" */ val leftToRight: typings.officeJs.Excel.ConditionalDataBarDirection.leftToRight & String = js.native
  
  /* "RightToLeft" */ val rightToLeft: typings.officeJs.Excel.ConditionalDataBarDirection.rightToLeft & String = js.native
}
