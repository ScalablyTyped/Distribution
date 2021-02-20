package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortBy extends StObject
/**
  *
  * Represents the sort direction.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.SortBy")
@js.native
object SortBy extends StObject {
  
  /**
    * Ascending sort. Smallest to largest or A to Z.
    *
    */
  @js.native
  sealed trait ascending extends SortBy
  
  /**
    * Descending sort. Largest to smallest or Z to A.
    *
    */
  @js.native
  sealed trait descending extends SortBy
}
