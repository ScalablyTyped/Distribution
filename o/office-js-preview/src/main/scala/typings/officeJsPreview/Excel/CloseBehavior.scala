package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CloseBehavior extends StObject
/**
  *
  * Specifies the close behavior for Workbook.close API.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.CloseBehavior")
@js.native
object CloseBehavior extends StObject {
  
  /**
    * Save the possible changes before closing the workbook.
    *
    */
  @js.native
  sealed trait save extends CloseBehavior
  
  /**
    * Discard the possible changes when closing the workbook.
    *
    */
  @js.native
  sealed trait skipSave extends CloseBehavior
}
