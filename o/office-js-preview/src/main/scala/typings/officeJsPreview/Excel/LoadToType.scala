package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LoadToType extends StObject
/**
  * An enum that specifies the query load to destination.
  *
  * @remarks
  * [Api set: ExcelApi 1.14]
  */
@JSGlobal("Excel.LoadToType")
@js.native
object LoadToType extends StObject {
  
  /**
    * Load to connection only.
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  @js.native
  sealed trait connectionOnly
    extends StObject
       with LoadToType
  
  /**
    * Load to PivotChart.
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  @js.native
  sealed trait pivotChart
    extends StObject
       with LoadToType
  
  /**
    * Load to PivotTable.
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  @js.native
  sealed trait pivotTable
    extends StObject
       with LoadToType
  
  /**
    * Load to a table.
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  @js.native
  sealed trait table
    extends StObject
       with LoadToType
}
