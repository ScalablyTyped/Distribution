package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a command type of `DataConnection`.
  *
  * @remarks
  * [Api set: ExcelApi 1.15]
  */
@JSGlobal("Excel.DataSourceType")
@js.native
object DataSourceType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.DataSourceType & String] = js.native
  
  /* "Cube" */ val cube: typings.officeJsPreview.Excel.DataSourceType.cube & String = js.native
  
  /* "LocalRange" */ val localRange: typings.officeJsPreview.Excel.DataSourceType.localRange & String = js.native
  
  /* "LocalTable" */ val localTable: typings.officeJsPreview.Excel.DataSourceType.localTable & String = js.native
  
  /* "OledbDefault" */ val oledbDefault: typings.officeJsPreview.Excel.DataSourceType.oledbDefault & String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJsPreview.Excel.DataSourceType.unknown & String = js.native
}
