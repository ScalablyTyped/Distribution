package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple enum that represents a type of filter for a PivotField.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.PivotFilterType")
@js.native
object PivotFilterType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.PivotFilterType & String] = js.native
  
  /* "Date" */ val date: typings.officeJsPreview.Excel.PivotFilterType.date & String = js.native
  
  /* "Label" */ val label: typings.officeJsPreview.Excel.PivotFilterType.label & String = js.native
  
  /* "Manual" */ val manual: typings.officeJsPreview.Excel.PivotFilterType.manual & String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJsPreview.Excel.PivotFilterType.unknown & String = js.native
  
  /* "Value" */ val value: typings.officeJsPreview.Excel.PivotFilterType.value & String = js.native
}
