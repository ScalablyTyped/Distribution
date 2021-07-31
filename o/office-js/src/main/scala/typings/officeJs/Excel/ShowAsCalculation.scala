package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShowAsCalculation extends StObject
/**
  *
  * The ShowAs Calculation function for the Data Pivot Field.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.ShowAsCalculation")
@js.native
object ShowAsCalculation extends StObject {
  
  /**
    * Difference from the specified Base Field and Base Item.
    *
    */
  @js.native
  sealed trait differenceFrom
    extends StObject
       with ShowAsCalculation
  
  /**
    * Calculates the values as follows:
    ((value in cell) x (Grand Total of Grand Totals)) / ((Grand Row Total) x (Grand Column Total))
    *
    */
  @js.native
  sealed trait index
    extends StObject
       with ShowAsCalculation
  
  /**
    * No calculation is applied.
    *
    */
  @js.native
  sealed trait none
    extends StObject
       with ShowAsCalculation
  
  /**
    * Difference from the specified Base Field and Base Item.
    *
    */
  @js.native
  sealed trait percentDifferenceFrom
    extends StObject
       with ShowAsCalculation
  
  /**
    * Percent of the specified Base Field and Base Item.
    *
    */
  @js.native
  sealed trait percentOf
    extends StObject
       with ShowAsCalculation
  
  /**
    * Percent of the column total.
    *
    */
  @js.native
  sealed trait percentOfColumnTotal
    extends StObject
       with ShowAsCalculation
  
  /**
    * Percent of the grand total.
    *
    */
  @js.native
  sealed trait percentOfGrandTotal
    extends StObject
       with ShowAsCalculation
  
  /**
    * Percent of the column total for the specified Base Field.
    *
    */
  @js.native
  sealed trait percentOfParentColumnTotal
    extends StObject
       with ShowAsCalculation
  
  /**
    * Percent of the row total for the specified Base Field.
    *
    */
  @js.native
  sealed trait percentOfParentRowTotal
    extends StObject
       with ShowAsCalculation
  
  /**
    * Percent of the grand total for the specified Base Field.
    *
    */
  @js.native
  sealed trait percentOfParentTotal
    extends StObject
       with ShowAsCalculation
  
  /**
    * Percent of the row total.
    *
    */
  @js.native
  sealed trait percentOfRowTotal
    extends StObject
       with ShowAsCalculation
  
  /**
    * Percent Running Total of the specified Base Field.
    *
    */
  @js.native
  sealed trait percentRunningTotal
    extends StObject
       with ShowAsCalculation
  
  /**
    * Ascending Rank of the specified Base Field.
    *
    */
  @js.native
  sealed trait rankAscending
    extends StObject
       with ShowAsCalculation
  
  /**
    * Descending Rank of the specified Base Field.
    *
    */
  @js.native
  sealed trait rankDecending
    extends StObject
       with ShowAsCalculation
  
  /**
    * Running Total of the specified Base Field.
    *
    */
  @js.native
  sealed trait runningTotal
    extends StObject
       with ShowAsCalculation
  
  /**
    * Calculation is unknown or unsupported.
    *
    */
  @js.native
  sealed trait unknown
    extends StObject
       with ShowAsCalculation
}
