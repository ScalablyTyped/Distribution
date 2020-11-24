package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NamedItemScope extends js.Object
/**
  * [Api set: ExcelApi 1.4]
  */
@JSGlobal("Excel.NamedItemScope")
@js.native
object NamedItemScope extends js.Object {
  
  @js.native
  sealed trait workbook extends NamedItemScope
  
  @js.native
  sealed trait worksheet extends NamedItemScope
}
