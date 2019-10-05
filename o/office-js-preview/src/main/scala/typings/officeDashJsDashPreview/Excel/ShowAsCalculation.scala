package typings.officeDashJsDashPreview.Excel

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
    *
    * Difference from the specified Base Field and Base Item.
    *
    */
  @js.native
  sealed trait differenceFrom extends ShowAsCalculation
  
  /**
    *
    * Calculates the values as follows:
    ((value in cell) x (Grand Total of Grand Totals)) / ((Grand Row Total) x (Grand Column Total))
    *
    */
  @js.native
  sealed trait index extends ShowAsCalculation
  
  /**
    *
    * No calculation is applied.
    *
    */
  @js.native
  sealed trait none extends ShowAsCalculation
  
  /**
    *
    * Difference from the specified Base Field and Base Item.
    *
    */
  @js.native
  sealed trait percentDifferenceFrom extends ShowAsCalculation
  
  /**
    *
    * Percent of the specified Base Field and Base Item.
    *
    */
  @js.native
  sealed trait percentOf extends ShowAsCalculation
  
  /**
    *
    * Percent of the column total.
    *
    */
  @js.native
  sealed trait percentOfColumnTotal extends ShowAsCalculation
  
  /**
    *
    * Percent of the grand total.
    *
    */
  @js.native
  sealed trait percentOfGrandTotal extends ShowAsCalculation
  
  /**
    *
    * Percent of the column total for the specified Base Field.
    *
    */
  @js.native
  sealed trait percentOfParentColumnTotal extends ShowAsCalculation
  
  /**
    *
    * Percent of the row total for the specified Base Field.
    *
    */
  @js.native
  sealed trait percentOfParentRowTotal extends ShowAsCalculation
  
  /**
    *
    * Percent of the grand total for the specified Base Field.
    *
    */
  @js.native
  sealed trait percentOfParentTotal extends ShowAsCalculation
  
  /**
    *
    * Percent of the row total.
    *
    */
  @js.native
  sealed trait percentOfRowTotal extends ShowAsCalculation
  
  /**
    *
    * Percent Running Total of the specified Base Field.
    *
    */
  @js.native
  sealed trait percentRunningTotal extends ShowAsCalculation
  
  /**
    *
    * Ascending Rank of the specified Base Field.
    *
    */
  @js.native
  sealed trait rankAscending extends ShowAsCalculation
  
  /**
    *
    * Descending Rank of the specified Base Field.
    *
    */
  @js.native
  sealed trait rankDecending extends ShowAsCalculation
  
  /**
    *
    * Running Total of the specified Base Field.
    *
    */
  @js.native
  sealed trait runningTotal extends ShowAsCalculation
  
  /**
    *
    * Calculation is unknown or unsupported.
    *
    */
  @js.native
  sealed trait unknown extends ShowAsCalculation
  
  /* "DifferenceFrom" */ val differenceFrom: typings.officeDashJsDashPreview.Excel.ShowAsCalculation.differenceFrom with String = js.native
  /* "Index" */ val index: typings.officeDashJsDashPreview.Excel.ShowAsCalculation.index with String = js.native
  /* "None" */ val none: typings.officeDashJsDashPreview.Excel.ShowAsCalculation.none with String = js.native
  /* "PercentDifferenceFrom" */ val percentDifferenceFrom: typings.officeDashJsDashPreview.Excel.ShowAsCalculation.percentDifferenceFrom with String = js.native
  /* "PercentOf" */ val percentOf: typings.officeDashJsDashPreview.Excel.ShowAsCalculation.percentOf with String = js.native
  /* "PercentOfColumnTotal" */ val percentOfColumnTotal: typings.officeDashJsDashPreview.Excel.ShowAsCalculation.percentOfColumnTotal with String = js.native
  /* "PercentOfGrandTotal" */ val percentOfGrandTotal: typings.officeDashJsDashPreview.Excel.ShowAsCalculation.percentOfGrandTotal with String = js.native
  /* "PercentOfParentColumnTotal" */ val percentOfParentColumnTotal: typings.officeDashJsDashPreview.Excel.ShowAsCalculation.percentOfParentColumnTotal with String = js.native
  /* "PercentOfParentRowTotal" */ val percentOfParentRowTotal: typings.officeDashJsDashPreview.Excel.ShowAsCalculation.percentOfParentRowTotal with String = js.native
  /* "PercentOfParentTotal" */ val percentOfParentTotal: typings.officeDashJsDashPreview.Excel.ShowAsCalculation.percentOfParentTotal with String = js.native
  /* "PercentOfRowTotal" */ val percentOfRowTotal: typings.officeDashJsDashPreview.Excel.ShowAsCalculation.percentOfRowTotal with String = js.native
  /* "PercentRunningTotal" */ val percentRunningTotal: typings.officeDashJsDashPreview.Excel.ShowAsCalculation.percentRunningTotal with String = js.native
  /* "RankAscending" */ val rankAscending: typings.officeDashJsDashPreview.Excel.ShowAsCalculation.rankAscending with String = js.native
  /* "RankDecending" */ val rankDecending: typings.officeDashJsDashPreview.Excel.ShowAsCalculation.rankDecending with String = js.native
  /* "RunningTotal" */ val runningTotal: typings.officeDashJsDashPreview.Excel.ShowAsCalculation.runningTotal with String = js.native
  /* "Unknown" */ val unknown: typings.officeDashJsDashPreview.Excel.ShowAsCalculation.unknown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShowAsCalculation with String] = js.native
}

