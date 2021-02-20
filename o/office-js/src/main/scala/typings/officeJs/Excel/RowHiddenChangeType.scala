package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RowHiddenChangeType extends StObject
/**
  * [Api set: ExcelApi 1.11]
  */
@JSGlobal("Excel.RowHiddenChangeType")
@js.native
object RowHiddenChangeType extends StObject {
  
  /**
    * Hidden indicates the row is hidden.
    *
    */
  @js.native
  sealed trait hidden extends RowHiddenChangeType
  
  /**
    * Unhidden indicates the row is not hidden.
    *
    */
  @js.native
  sealed trait unhidden extends RowHiddenChangeType
}
