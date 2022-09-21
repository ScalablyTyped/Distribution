package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartDataSourceType extends StObject
/**
  * Specifies the data source type of the chart series.
  * 
  * @remarks
  * [Api set: ExcelApi 1.15]
  */
@JSGlobal("Excel.ChartDataSourceType")
@js.native
object ChartDataSourceType extends StObject {
  
  /**
    * The data source type of the chart series is an external range.
    * @remarks
    * [Api set: ExcelApi 1.15]
    */
  @js.native
  sealed trait externalRange
    extends StObject
       with ChartDataSourceType
  
  /**
    * The data source type of the chart series is a list.
    * @remarks
    * [Api set: ExcelApi 1.15]
    */
  @js.native
  sealed trait list
    extends StObject
       with ChartDataSourceType
  
  /**
    * The data source type of the chart series is a local range.
    * @remarks
    * [Api set: ExcelApi 1.15]
    */
  @js.native
  sealed trait localRange
    extends StObject
       with ChartDataSourceType
  
  /**
    * The data source type of the chart series is unknown or unsupported.
    * @remarks
    * [Api set: ExcelApi 1.15]
    */
  @js.native
  sealed trait unknown
    extends StObject
       with ChartDataSourceType
}
