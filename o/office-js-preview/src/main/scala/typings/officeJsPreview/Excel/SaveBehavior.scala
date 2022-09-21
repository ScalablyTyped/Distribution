package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SaveBehavior extends StObject
/**
  * Specifies the save behavior for `Workbook.save`.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.SaveBehavior")
@js.native
object SaveBehavior extends StObject {
  
  /**
    * Prompts the "Save As" experience to the user if the workbook has not been saved,
    Ignored if the workbook was previously saved.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait prompt
    extends StObject
       with SaveBehavior
  
  /**
    * Save the workbook without prompting the user. If file is not saved,
    it will save it with default name in the default location.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait save
    extends StObject
       with SaveBehavior
}
