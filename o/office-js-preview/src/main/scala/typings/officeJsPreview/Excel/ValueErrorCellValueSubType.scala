package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValueErrorCellValueSubType extends StObject
/**
  * Represents types of #VALUE! errors.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ValueErrorCellValueSubType")
@js.native
object ValueErrorCellValueSubType extends StObject {
  
  /**
    * An error caused by encountering a string where a boolean was expected, and that string not being coercible to a boolean. Displays as error type #VALUE! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait coerceStringToBoolInvalid
    extends StObject
       with ValueErrorCellValueSubType
  
  /**
    * An error caused by conversion of a string to a type other than a boolean or number. Displays as error type #VALUE! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait coerceStringToInvalidType
    extends StObject
       with ValueErrorCellValueSubType
  
  /**
    * An error caused by encountering a string where a number was expected, and that string not being coercible to a number. Displays as error type #VALUE! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait coerceStringToNumberInvalid
    extends StObject
       with ValueErrorCellValueSubType
  
  /**
    * An error caused by HLOOKUP not finding its lookup_value parameter. Displays as error type #VALUE! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait hlookupResultNotFound
    extends StObject
       with ValueErrorCellValueSubType
  
  /**
    * An error caused by a row_index_num parameter of HLOOKUP of less than 1. Displays as error type #VALUE! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait hlookupRowIndexLessThanOne
    extends StObject
       with ValueErrorCellValueSubType
  
  /**
    * An error caused by a `WebImageValue` with an invalid URL. Displays as error type #VALUE! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait invalidImageUrl
    extends StObject
       with ValueErrorCellValueSubType
  
  /**
    * An error caused by passing the incorrect number of parameters to a lambda value. Displays as error type #VALUE! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait lambdaWrongParamCount
    extends StObject
       with ValueErrorCellValueSubType
  
  /**
    * An error caused by passing an end_date parameter that precedes the start_date parameter to STOCKHISTORY. Displays as error type #VALUE! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait stockHistoryEndBeforeStart
    extends StObject
       with ValueErrorCellValueSubType
  
  /**
    * An error caused by passing an invalid date to STOCKHISTORY. Displays as error type #VALUE! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait stockHistoryInvalidDate
    extends StObject
       with ValueErrorCellValueSubType
  
  /**
    * An error caused by invalid interval or header parameters for STOCKHISTORY. Displays as error type #VALUE! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait stockHistoryInvalidEnum
    extends StObject
       with ValueErrorCellValueSubType
  
  /**
    * An error caused by STOCKHISTORY having a date range which only contains days that don't have stock trading. Displays as error type #VALUE! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait stockHistoryNonTradingDays
    extends StObject
       with ValueErrorCellValueSubType
  
  /**
    * An error caused by passing a stock parameter which is not a stock to STOCKHISTORY. Displays as error type #VALUE! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait stockHistoryNotAStock
    extends StObject
       with ValueErrorCellValueSubType
  
  /**
    * An error caused by STOCKHISTORY not finding the history of the specified stock. Displays as error type #VALUE! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait stockHistoryNotFound
    extends StObject
       with ValueErrorCellValueSubType
  
  /**
    * An error caused by STOCKHISTORY parameters that request only the date and no other fields. Displays as error type #VALUE! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait stockHistoryOnlyDateRequested
    extends StObject
       with ValueErrorCellValueSubType
  
  /**
    * An error caused by passing a future start_date parameter to STOCKHISTORY. Displays as error type #VALUE! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait stockHistoryStartInFuture
    extends StObject
       with ValueErrorCellValueSubType
  
  /**
    * An error caused by SUBARRAY missing a start column. Displays as error type #VALUE! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait subArrayStartColumnMissingEndColumnNot
    extends StObject
       with ValueErrorCellValueSubType
  
  /**
    * An error caused by SUBARRAY missing a start row. Displays as error type #VALUE! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait subArrayStartRowMissingEndRowNot
    extends StObject
       with ValueErrorCellValueSubType
  
  /**
    * An unknown type of error. Displays as error type #VALUE! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait unknown
    extends StObject
       with ValueErrorCellValueSubType
  
  /**
    * An error caused by a column_index_num parameter of VLOOKUP of less than 1. Displays as error type #VALUE! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait vlookupColumnIndexLessThanOne
    extends StObject
       with ValueErrorCellValueSubType
  
  /**
    * An error caused by VLOOKUP not finding its lookup_value parameter. Displays as error type #VALUE! in Excel.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait vlookupResultNotFound
    extends StObject
       with ValueErrorCellValueSubType
}
