package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RefErrorCellValueSubType extends StObject
/**
  * Represents types of #REF! errors.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.RefErrorCellValueSubType")
@js.native
object RefErrorCellValueSubType extends StObject {
  
  /**
    * An error caused by dynamic array references from the linked workbook. Displays as error type #REF! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait externalLinksCalculatedRef
    extends StObject
       with RefErrorCellValueSubType
  
  /**
    * An error caused by structured references from the linked workbook. Displays as error type #REF! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait externalLinksStructuredRef
    extends StObject
       with RefErrorCellValueSubType
  
  /**
    * An unknown type of error. Displays as error type #REF! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait unknown
    extends StObject
       with RefErrorCellValueSubType
}
