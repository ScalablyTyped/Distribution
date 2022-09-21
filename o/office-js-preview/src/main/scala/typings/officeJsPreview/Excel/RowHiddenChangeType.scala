package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RowHiddenChangeType extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.11]
  */
@JSGlobal("Excel.RowHiddenChangeType")
@js.native
object RowHiddenChangeType extends StObject {
  
  /**
    * `Hidden` indicates that the row is hidden.
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  @js.native
  sealed trait hidden
    extends StObject
       with RowHiddenChangeType
  
  /**
    * `Unhidden` indicates that the row is not hidden.
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  @js.native
  sealed trait unhidden
    extends StObject
       with RowHiddenChangeType
}
