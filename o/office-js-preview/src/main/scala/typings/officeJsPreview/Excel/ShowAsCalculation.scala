package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShowAsCalculation extends StObject
/**
  * The ShowAs calculation function for the DataPivotField.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.ShowAsCalculation")
@js.native
object ShowAsCalculation extends StObject {
  
  /**
    * Difference from the specified Base field and Base item.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait differenceFrom
    extends StObject
       with ShowAsCalculation
  
  /**
    * Calculates the values as follows:
    ((value in cell) x (Grand Total of Grand Totals)) / ((Grand Row Total) x (Grand Column Total))
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait index
    extends StObject
       with ShowAsCalculation
  
  /**
    * No calculation is applied.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait none
    extends StObject
       with ShowAsCalculation
  
  /**
    * Difference from the specified Base field and Base item.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait percentDifferenceFrom
    extends StObject
       with ShowAsCalculation
  
  /**
    * Percent of the specified Base field and Base item.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait percentOf
    extends StObject
       with ShowAsCalculation
  
  /**
    * Percent of the column total.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait percentOfColumnTotal
    extends StObject
       with ShowAsCalculation
  
  /**
    * Percent of the grand total.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait percentOfGrandTotal
    extends StObject
       with ShowAsCalculation
  
  /**
    * Percent of the column total for the specified Base field.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait percentOfParentColumnTotal
    extends StObject
       with ShowAsCalculation
  
  /**
    * Percent of the row total for the specified Base field.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait percentOfParentRowTotal
    extends StObject
       with ShowAsCalculation
  
  /**
    * Percent of the grand total for the specified Base field.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait percentOfParentTotal
    extends StObject
       with ShowAsCalculation
  
  /**
    * Percent of the row total.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait percentOfRowTotal
    extends StObject
       with ShowAsCalculation
  
  /**
    * Percent running total of the specified Base field.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait percentRunningTotal
    extends StObject
       with ShowAsCalculation
  
  /**
    * Ascending rank of the specified Base field.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait rankAscending
    extends StObject
       with ShowAsCalculation
  
  /**
    * Descending rank of the specified Base field.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait rankDecending
    extends StObject
       with ShowAsCalculation
  
  /**
    * Running total of the specified Base field.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait runningTotal
    extends StObject
       with ShowAsCalculation
  
  /**
    * Calculation is unknown or unsupported.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait unknown
    extends StObject
       with ShowAsCalculation
}
