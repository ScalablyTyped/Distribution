package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CalculationType extends StObject
/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.CalculationType")
@js.native
object CalculationType extends StObject {
  
  /**
    * This will mark all cells as dirty and then recalculate them.
    *
    */
  @js.native
  sealed trait full
    extends StObject
       with CalculationType
  
  /**
    * This will rebuild the full dependency chain, mark all cells as dirty and then recalculate them.
    *
    */
  @js.native
  sealed trait fullRebuild
    extends StObject
       with CalculationType
  
  /**
    * Recalculates all cells that Excel has marked as dirty, that is, dependents of volatile or changed data, and cells programmatically marked as dirty.
    *
    */
  @js.native
  sealed trait recalculate
    extends StObject
       with CalculationType
}
