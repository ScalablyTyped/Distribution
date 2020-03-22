package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShowAsCalculation extends js.Object

/**
  *
  * The ShowAs Calculation function for the Data Pivot Field.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.ShowAsCalculation")
@js.native
object ShowAsCalculation extends js.Object {
  /**
    * Difference from the specified Base Field and Base Item.
    *
    */
  @js.native
  sealed trait differenceFrom extends ShowAsCalculation
  
  /**
    * Calculates the values as follows:
    ((value in cell) x (Grand Total of Grand Totals)) / ((Grand Row Total) x (Grand Column Total))
    *
    */
  @js.native
  sealed trait index extends ShowAsCalculation
  
  /**
    * No calculation is applied.
    *
    */
  @js.native
  sealed trait none extends ShowAsCalculation
  
  /**
    * Difference from the specified Base Field and Base Item.
    *
    */
  @js.native
  sealed trait percentDifferenceFrom extends ShowAsCalculation
  
  /**
    * Percent of the specified Base Field and Base Item.
    *
    */
  @js.native
  sealed trait percentOf extends ShowAsCalculation
  
  /**
    * Percent of the column total.
    *
    */
  @js.native
  sealed trait percentOfColumnTotal extends ShowAsCalculation
  
  /**
    * Percent of the grand total.
    *
    */
  @js.native
  sealed trait percentOfGrandTotal extends ShowAsCalculation
  
  /**
    * Percent of the column total for the specified Base Field.
    *
    */
  @js.native
  sealed trait percentOfParentColumnTotal extends ShowAsCalculation
  
  /**
    * Percent of the row total for the specified Base Field.
    *
    */
  @js.native
  sealed trait percentOfParentRowTotal extends ShowAsCalculation
  
  /**
    * Percent of the grand total for the specified Base Field.
    *
    */
  @js.native
  sealed trait percentOfParentTotal extends ShowAsCalculation
  
  /**
    * Percent of the row total.
    *
    */
  @js.native
  sealed trait percentOfRowTotal extends ShowAsCalculation
  
  /**
    * Percent Running Total of the specified Base Field.
    *
    */
  @js.native
  sealed trait percentRunningTotal extends ShowAsCalculation
  
  /**
    * Ascending Rank of the specified Base Field.
    *
    */
  @js.native
  sealed trait rankAscending extends ShowAsCalculation
  
  /**
    * Descending Rank of the specified Base Field.
    *
    */
  @js.native
  sealed trait rankDecending extends ShowAsCalculation
  
  /**
    * Running Total of the specified Base Field.
    *
    */
  @js.native
  sealed trait runningTotal extends ShowAsCalculation
  
  /**
    * Calculation is unknown or unsupported.
    *
    */
  @js.native
  sealed trait unknown extends ShowAsCalculation
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShowAsCalculation with String] = js.native
  /* "DifferenceFrom" */ @js.native
  object differenceFrom extends TopLevel[differenceFrom with String]
  
  /* "Index" */ @js.native
  object index extends TopLevel[index with String]
  
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "PercentDifferenceFrom" */ @js.native
  object percentDifferenceFrom extends TopLevel[percentDifferenceFrom with String]
  
  /* "PercentOf" */ @js.native
  object percentOf extends TopLevel[percentOf with String]
  
  /* "PercentOfColumnTotal" */ @js.native
  object percentOfColumnTotal extends TopLevel[percentOfColumnTotal with String]
  
  /* "PercentOfGrandTotal" */ @js.native
  object percentOfGrandTotal extends TopLevel[percentOfGrandTotal with String]
  
  /* "PercentOfParentColumnTotal" */ @js.native
  object percentOfParentColumnTotal extends TopLevel[percentOfParentColumnTotal with String]
  
  /* "PercentOfParentRowTotal" */ @js.native
  object percentOfParentRowTotal extends TopLevel[percentOfParentRowTotal with String]
  
  /* "PercentOfParentTotal" */ @js.native
  object percentOfParentTotal extends TopLevel[percentOfParentTotal with String]
  
  /* "PercentOfRowTotal" */ @js.native
  object percentOfRowTotal extends TopLevel[percentOfRowTotal with String]
  
  /* "PercentRunningTotal" */ @js.native
  object percentRunningTotal extends TopLevel[percentRunningTotal with String]
  
  /* "RankAscending" */ @js.native
  object rankAscending extends TopLevel[rankAscending with String]
  
  /* "RankDecending" */ @js.native
  object rankDecending extends TopLevel[rankDecending with String]
  
  /* "RunningTotal" */ @js.native
  object runningTotal extends TopLevel[runningTotal with String]
  
  /* "Unknown" */ @js.native
  object unknown extends TopLevel[unknown with String]
  
}

