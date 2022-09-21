package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorkbookLinksRefreshMode extends StObject
/**
  * Represents the refresh mode of the workbook links.
  *
  * @remarks
  * [Api set: ExcelApiOnline 1.1]
  */
@JSGlobal("Excel.WorkbookLinksRefreshMode")
@js.native
object WorkbookLinksRefreshMode extends StObject {
  
  /**
    * The workbook links are updated at a set interval determined by the Excel application.
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  @js.native
  sealed trait automatic
    extends StObject
       with WorkbookLinksRefreshMode
  
  /**
    * The workbook links are updated manually.
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  @js.native
  sealed trait manual
    extends StObject
       with WorkbookLinksRefreshMode
}
