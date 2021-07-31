package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.DifferenceFrom
import typings.officeJsPreview.officeJsPreviewStrings.Index
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.PercentDifferenceFrom
import typings.officeJsPreview.officeJsPreviewStrings.PercentOf
import typings.officeJsPreview.officeJsPreviewStrings.PercentOfColumnTotal
import typings.officeJsPreview.officeJsPreviewStrings.PercentOfGrandTotal
import typings.officeJsPreview.officeJsPreviewStrings.PercentOfParentColumnTotal
import typings.officeJsPreview.officeJsPreviewStrings.PercentOfParentRowTotal
import typings.officeJsPreview.officeJsPreviewStrings.PercentOfParentTotal
import typings.officeJsPreview.officeJsPreviewStrings.PercentOfRowTotal
import typings.officeJsPreview.officeJsPreviewStrings.PercentRunningTotal
import typings.officeJsPreview.officeJsPreviewStrings.RankAscending
import typings.officeJsPreview.officeJsPreviewStrings.RankDecending
import typings.officeJsPreview.officeJsPreviewStrings.RunningTotal
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Api set: ExcelApi 1.8]
  */
trait ShowAsRule extends StObject {
  
  /**
    *
    * The base PivotField to base the ShowAs calculation, if applicable based on the ShowAsCalculation type, else null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var baseField: js.UndefOr[PivotField] = js.undefined
  
  /**
    *
    * The base Item to base the ShowAs calculation on, if applicable based on the ShowAsCalculation type, else null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var baseItem: js.UndefOr[PivotItem] = js.undefined
  
  /**
    *
    * The ShowAs Calculation to use for the Data PivotField. See Excel.ShowAsCalculation for Details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var calculation: ShowAsCalculation | Unknown_ | None | PercentOfGrandTotal | PercentOfRowTotal | PercentOfColumnTotal | PercentOfParentRowTotal | PercentOfParentColumnTotal | PercentOfParentTotal | PercentOf | RunningTotal | PercentRunningTotal | DifferenceFrom | PercentDifferenceFrom | RankAscending | RankDecending | Index
}
object ShowAsRule {
  
  @scala.inline
  def apply(
    calculation: ShowAsCalculation | Unknown_ | None | PercentOfGrandTotal | PercentOfRowTotal | PercentOfColumnTotal | PercentOfParentRowTotal | PercentOfParentColumnTotal | PercentOfParentTotal | PercentOf | RunningTotal | PercentRunningTotal | DifferenceFrom | PercentDifferenceFrom | RankAscending | RankDecending | Index
  ): ShowAsRule = {
    val __obj = js.Dynamic.literal(calculation = calculation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowAsRule]
  }
  
  @scala.inline
  implicit class ShowAsRuleMutableBuilder[Self <: ShowAsRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseField(value: PivotField): Self = StObject.set(x, "baseField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseFieldUndefined: Self = StObject.set(x, "baseField", js.undefined)
    
    @scala.inline
    def setBaseItem(value: PivotItem): Self = StObject.set(x, "baseItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseItemUndefined: Self = StObject.set(x, "baseItem", js.undefined)
    
    @scala.inline
    def setCalculation(
      value: ShowAsCalculation | Unknown_ | None | PercentOfGrandTotal | PercentOfRowTotal | PercentOfColumnTotal | PercentOfParentRowTotal | PercentOfParentColumnTotal | PercentOfParentTotal | PercentOf | RunningTotal | PercentRunningTotal | DifferenceFrom | PercentDifferenceFrom | RankAscending | RankDecending | Index
    ): Self = StObject.set(x, "calculation", value.asInstanceOf[js.Any])
  }
}
