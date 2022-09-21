package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PivotAxis extends StObject
/**
  * Represents the axis from which to get the PivotItems.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PivotAxis")
@js.native
object PivotAxis extends StObject {
  
  /**
    * The column axis.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait column
    extends StObject
       with PivotAxis
  
  /**
    * The data axis.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait data
    extends StObject
       with PivotAxis
  
  /**
    * The filter axis.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait filter
    extends StObject
       with PivotAxis
  
  /**
    * The row axis.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait row
    extends StObject
       with PivotAxis
  
  /**
    * The axis or region is unknown or unsupported.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait unknown
    extends StObject
       with PivotAxis
}
