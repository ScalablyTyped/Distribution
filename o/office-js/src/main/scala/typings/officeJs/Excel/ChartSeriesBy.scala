package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartSeriesBy extends StObject
/**
  * Specifies whether the series are by rows or by columns. In Excel on desktop, the "auto" option will inspect the source data shape to automatically guess whether the data is by rows or columns. In Excel on the web, "auto" will simply default to "columns".
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartSeriesBy")
@js.native
object ChartSeriesBy extends StObject {
  
  /**
    * In Excel on desktop, the "auto" option will inspect the source data shape to automatically guess whether the data is by rows or columns. In Excel on the web, "auto" will simply default to "columns".
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  @js.native
  sealed trait auto
    extends StObject
       with ChartSeriesBy
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  @js.native
  sealed trait columns
    extends StObject
       with ChartSeriesBy
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  @js.native
  sealed trait rows
    extends StObject
       with ChartSeriesBy
}
