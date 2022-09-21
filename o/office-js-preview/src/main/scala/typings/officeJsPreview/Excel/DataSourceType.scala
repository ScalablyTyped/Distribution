package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataSourceType extends StObject
/**
  * Represents a command type of `DataConnection`.
  *
  * @remarks
  * [Api set: ExcelApi 1.15]
  */
@JSGlobal("Excel.DataSourceType")
@js.native
object DataSourceType extends StObject {
  
  /**
    * Contains a cube name for an OLAP data source.
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait cube
    extends StObject
       with DataSourceType
  
  /**
    * The data source type is a range in the current workbook.
    * @remarks
    * [Api set: ExcelApi 1.15]
    */
  @js.native
  sealed trait localRange
    extends StObject
       with DataSourceType
  
  /**
    * The data source type is a table in the current workbook.
    * @remarks
    * [Api set: ExcelApi 1.15]
    */
  @js.native
  sealed trait localTable
    extends StObject
       with DataSourceType
  
  /**
    * Contains command text that the OLE DB provider (such as Power BI) understands.
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait oledbDefault
    extends StObject
       with DataSourceType
  
  /**
    * The data source type is unknown or unsupported.
    * @remarks
    * [Api set: ExcelApi 1.15]
    */
  @js.native
  sealed trait unknown
    extends StObject
       with DataSourceType
}
