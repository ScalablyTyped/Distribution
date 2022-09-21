package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortBy extends StObject
/**
  * Represents the sort direction.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.SortBy")
@js.native
object SortBy extends StObject {
  
  /**
    * Ascending sort. Smallest to largest or A to Z.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait ascending
    extends StObject
       with SortBy
  
  /**
    * Descending sort. Largest to smallest or Z to A.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait descending
    extends StObject
       with SortBy
}
