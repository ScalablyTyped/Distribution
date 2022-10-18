package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents types of #NUM! errors.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
@JSGlobal("Excel.NumErrorCellValueSubType")
@js.native
object NumErrorCellValueSubType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.NumErrorCellValueSubType & String] = js.native
  
  /* "ArrayTooLarge" */ val arrayTooLarge: typings.officeJs.Excel.NumErrorCellValueSubType.arrayTooLarge & String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJs.Excel.NumErrorCellValueSubType.unknown & String = js.native
}
