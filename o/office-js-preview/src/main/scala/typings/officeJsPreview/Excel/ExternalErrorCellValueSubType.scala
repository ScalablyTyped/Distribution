package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExternalErrorCellValueSubType extends StObject
/**
  * Represents types of #EXTERNAL! errors.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
@JSGlobal("Excel.ExternalErrorCellValueSubType")
@js.native
object ExternalErrorCellValueSubType extends StObject {
  
  /**
    * An unknown type of error. Displays as error type #EXTERNAL! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait unknown
    extends StObject
       with ExternalErrorCellValueSubType
}
