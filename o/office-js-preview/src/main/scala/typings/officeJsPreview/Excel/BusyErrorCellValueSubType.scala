package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BusyErrorCellValueSubType extends StObject
/**
  * Represents types of #BUSY! errors.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.BusyErrorCellValueSubType")
@js.native
object BusyErrorCellValueSubType extends StObject {
  
  /**
    * An error caused by external links. Displays as error type #BUSY! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait externalLinksGeneric
    extends StObject
       with BusyErrorCellValueSubType
  
  /**
    * An error that displays while an image is loading. Displays as error type #BUSY! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait loadingImage
    extends StObject
       with BusyErrorCellValueSubType
  
  /**
    * An unknown type of error. Displays as error type #BUSY! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait unknown
    extends StObject
       with BusyErrorCellValueSubType
}
