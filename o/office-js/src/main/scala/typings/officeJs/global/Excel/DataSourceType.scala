package typings.officeJs.global.Excel

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
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.DataSourceType & String] = js.native
  
  /* "LocalRange" */ val localRange: typings.officeJs.Excel.DataSourceType.localRange & String = js.native
  
  /* "LocalTable" */ val localTable: typings.officeJs.Excel.DataSourceType.localTable & String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJs.Excel.DataSourceType.unknown & String = js.native
}
