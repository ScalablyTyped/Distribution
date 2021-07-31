package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataValidationType extends StObject
/**
  *
  * Represents Data validation type enum.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.DataValidationType")
@js.native
object DataValidationType extends StObject {
  
  /**
    * Custom data validation type
    *
    */
  @js.native
  sealed trait custom
    extends StObject
       with DataValidationType
  
  /**
    * Date data validation type
    *
    */
  @js.native
  sealed trait date
    extends StObject
       with DataValidationType
  
  /**
    * Decimal data validation type
    *
    */
  @js.native
  sealed trait decimal
    extends StObject
       with DataValidationType
  
  /**
    * Inconsistent means that the range has inconsistent data validation (there are different rules on different cells)
    *
    */
  @js.native
  sealed trait inconsistent
    extends StObject
       with DataValidationType
  
  /**
    * List data validation type
    *
    */
  @js.native
  sealed trait list
    extends StObject
       with DataValidationType
  
  /**
    * MixedCriteria means that the range has data validation present on some but not all cells
    *
    */
  @js.native
  sealed trait mixedCriteria
    extends StObject
       with DataValidationType
  
  /**
    * None means allow any value and so there is no data validation in the range.
    *
    */
  @js.native
  sealed trait none
    extends StObject
       with DataValidationType
  
  /**
    * Text length data validation type
    *
    */
  @js.native
  sealed trait textLength
    extends StObject
       with DataValidationType
  
  /**
    * Time data validation type
    *
    */
  @js.native
  sealed trait time
    extends StObject
       with DataValidationType
  
  /**
    * Whole number data validation type
    *
    */
  @js.native
  sealed trait wholeNumber
    extends StObject
       with DataValidationType
}
