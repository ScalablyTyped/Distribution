package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SaveBehavior extends StObject
/**
  *
  * Specifies the save behavior for Workbook.save API.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.SaveBehavior")
@js.native
object SaveBehavior extends StObject {
  
  /**
    * Prompts the saveas experience to the user if the workbook has not been saved,
    Ignored if the workbook was previously saved.
    *
    */
  @js.native
  sealed trait prompt
    extends StObject
       with SaveBehavior
  
  /**
    * Save the workbook without prompting the user. If file is not saved,
    it will save it with default name under default location.
    *
    */
  @js.native
  sealed trait save
    extends StObject
       with SaveBehavior
}
