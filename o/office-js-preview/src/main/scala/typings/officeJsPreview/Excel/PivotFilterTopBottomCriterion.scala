package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PivotFilterTopBottomCriterion extends StObject
/**
  *
  * Represents the criteria for the top/bottom values filter.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PivotFilterTopBottomCriterion")
@js.native
object PivotFilterTopBottomCriterion extends StObject {
  
  @js.native
  sealed trait bottomItems
    extends StObject
       with PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait bottomPercent
    extends StObject
       with PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait bottomSum
    extends StObject
       with PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait invalid
    extends StObject
       with PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait topItems
    extends StObject
       with PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait topPercent
    extends StObject
       with PivotFilterTopBottomCriterion
  
  @js.native
  sealed trait topSum
    extends StObject
       with PivotFilterTopBottomCriterion
}
