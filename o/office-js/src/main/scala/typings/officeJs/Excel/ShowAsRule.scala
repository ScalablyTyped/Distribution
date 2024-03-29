package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.DifferenceFrom
import typings.officeJs.officeJsStrings.Index
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.PercentDifferenceFrom
import typings.officeJs.officeJsStrings.PercentOf
import typings.officeJs.officeJsStrings.PercentOfColumnTotal
import typings.officeJs.officeJsStrings.PercentOfGrandTotal
import typings.officeJs.officeJsStrings.PercentOfParentColumnTotal
import typings.officeJs.officeJsStrings.PercentOfParentRowTotal
import typings.officeJs.officeJsStrings.PercentOfParentTotal
import typings.officeJs.officeJsStrings.PercentOfRowTotal
import typings.officeJs.officeJsStrings.PercentRunningTotal
import typings.officeJs.officeJsStrings.RankAscending
import typings.officeJs.officeJsStrings.RankDecending
import typings.officeJs.officeJsStrings.RunningTotal
import typings.officeJs.officeJsStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
trait ShowAsRule extends StObject {
  
  /**
    * The PivotField to base the `ShowAs` calculation on, if applicable according to the `ShowAsCalculation` type, else `null`.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var baseField: js.UndefOr[PivotField] = js.undefined
  
  /**
    * The item to base the `ShowAs` calculation on, if applicable according to the `ShowAsCalculation` type, else `null`.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var baseItem: js.UndefOr[PivotItem] = js.undefined
  
  /**
    * The `ShowAs` calculation to use for the PivotField. See `Excel.ShowAsCalculation` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var calculation: ShowAsCalculation | Unknown_ | None | PercentOfGrandTotal | PercentOfRowTotal | PercentOfColumnTotal | PercentOfParentRowTotal | PercentOfParentColumnTotal | PercentOfParentTotal | PercentOf | RunningTotal | PercentRunningTotal | DifferenceFrom | PercentDifferenceFrom | RankAscending | RankDecending | Index
}
object ShowAsRule {
  
  inline def apply(
    calculation: ShowAsCalculation | Unknown_ | None | PercentOfGrandTotal | PercentOfRowTotal | PercentOfColumnTotal | PercentOfParentRowTotal | PercentOfParentColumnTotal | PercentOfParentTotal | PercentOf | RunningTotal | PercentRunningTotal | DifferenceFrom | PercentDifferenceFrom | RankAscending | RankDecending | Index
  ): ShowAsRule = {
    val __obj = js.Dynamic.literal(calculation = calculation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowAsRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShowAsRule] (val x: Self) extends AnyVal {
    
    inline def setBaseField(value: PivotField): Self = StObject.set(x, "baseField", value.asInstanceOf[js.Any])
    
    inline def setBaseFieldUndefined: Self = StObject.set(x, "baseField", js.undefined)
    
    inline def setBaseItem(value: PivotItem): Self = StObject.set(x, "baseItem", value.asInstanceOf[js.Any])
    
    inline def setBaseItemUndefined: Self = StObject.set(x, "baseItem", js.undefined)
    
    inline def setCalculation(
      value: ShowAsCalculation | Unknown_ | None | PercentOfGrandTotal | PercentOfRowTotal | PercentOfColumnTotal | PercentOfParentRowTotal | PercentOfParentColumnTotal | PercentOfParentTotal | PercentOf | RunningTotal | PercentRunningTotal | DifferenceFrom | PercentDifferenceFrom | RankAscending | RankDecending | Index
    ): Self = StObject.set(x, "calculation", value.asInstanceOf[js.Any])
  }
}
