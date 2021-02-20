package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PivotTableDateGroupBy extends StObject
/**
  *
  * Represents the DateTime Grouping condition.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.PivotTableDateGroupBy")
@js.native
object PivotTableDateGroupBy extends StObject {
  
  @js.native
  sealed trait byDays extends PivotTableDateGroupBy
  
  @js.native
  sealed trait byHours extends PivotTableDateGroupBy
  
  @js.native
  sealed trait byMinutes extends PivotTableDateGroupBy
  
  @js.native
  sealed trait byMonths extends PivotTableDateGroupBy
  
  @js.native
  sealed trait byQuarters extends PivotTableDateGroupBy
  
  @js.native
  sealed trait bySeconds extends PivotTableDateGroupBy
  
  @js.native
  sealed trait byYears extends PivotTableDateGroupBy
  
  @js.native
  sealed trait invalid extends PivotTableDateGroupBy
}
