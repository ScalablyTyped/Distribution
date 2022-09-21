package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PivotTableDateGroupBy extends StObject
/**
  * Represents the DateTime Grouping condition.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.PivotTableDateGroupBy")
@js.native
object PivotTableDateGroupBy extends StObject {
  
  /**
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    */
  @js.native
  sealed trait byDays
    extends StObject
       with PivotTableDateGroupBy
  
  /**
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    */
  @js.native
  sealed trait byHours
    extends StObject
       with PivotTableDateGroupBy
  
  /**
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    */
  @js.native
  sealed trait byMinutes
    extends StObject
       with PivotTableDateGroupBy
  
  /**
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    */
  @js.native
  sealed trait byMonths
    extends StObject
       with PivotTableDateGroupBy
  
  /**
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    */
  @js.native
  sealed trait byQuarters
    extends StObject
       with PivotTableDateGroupBy
  
  /**
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    */
  @js.native
  sealed trait bySeconds
    extends StObject
       with PivotTableDateGroupBy
  
  /**
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    */
  @js.native
  sealed trait byYears
    extends StObject
       with PivotTableDateGroupBy
  
  /**
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    */
  @js.native
  sealed trait invalid
    extends StObject
       with PivotTableDateGroupBy
}
