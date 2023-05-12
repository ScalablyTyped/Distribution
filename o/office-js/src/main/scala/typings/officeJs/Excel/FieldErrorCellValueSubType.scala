package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldErrorCellValueSubType extends StObject
/**
  * Represents types of #FIELD! errors.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
@JSGlobal("Excel.FieldErrorCellValueSubType")
@js.native
object FieldErrorCellValueSubType extends StObject {
  
  /**
    * An error caused by an error from a data provider. Displays as error type #FIELD! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait dataProviderError
    extends StObject
       with FieldErrorCellValueSubType
  
  /**
    * An error caused by a missing file. In this case, the RichValueRel.xml file is missing from the metro package. Displays as error type #FIELD! in Excel.
    *
    * @remarks
    * [Api set: 1.16]
    */
  @js.native
  sealed trait richValueRelMissingFilePart
    extends StObject
       with FieldErrorCellValueSubType
  
  /**
    * An unknown type of error. Displays as error type #FIELD! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait unknown
    extends StObject
       with FieldErrorCellValueSubType
  
  /**
    * An error caused by a missing file. In this case, the RichValueWebImageValue.xml file is missing from the metro package. Displays as error type #FIELD! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait webImageMissingFilePart
    extends StObject
       with FieldErrorCellValueSubType
}
