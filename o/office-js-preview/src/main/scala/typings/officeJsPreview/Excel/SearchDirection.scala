package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SearchDirection extends StObject
/**
  *
  * Specifies the search direction.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.SearchDirection")
@js.native
object SearchDirection extends StObject {
  
  /**
    * Search in reverse order.
    *
    */
  @js.native
  sealed trait backwards extends SearchDirection
  
  /**
    * Search in forward order.
    *
    */
  @js.native
  sealed trait forward extends SearchDirection
}
