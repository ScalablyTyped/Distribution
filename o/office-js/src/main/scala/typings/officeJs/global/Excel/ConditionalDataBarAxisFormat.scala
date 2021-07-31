package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the format options for a Data Bar Axis.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalDataBarAxisFormat")
@js.native
object ConditionalDataBarAxisFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ConditionalDataBarAxisFormat & String] = js.native
  
  /* "Automatic" */ val automatic: typings.officeJs.Excel.ConditionalDataBarAxisFormat.automatic & String = js.native
  
  /* "CellMidPoint" */ val cellMidPoint: typings.officeJs.Excel.ConditionalDataBarAxisFormat.cellMidPoint & String = js.native
  
  /* "None" */ val none: typings.officeJs.Excel.ConditionalDataBarAxisFormat.none & String = js.native
}
