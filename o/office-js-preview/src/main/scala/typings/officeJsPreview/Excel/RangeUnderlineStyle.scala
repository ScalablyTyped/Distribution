package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RangeUnderlineStyle extends js.Object
/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.RangeUnderlineStyle")
@js.native
object RangeUnderlineStyle extends js.Object {
  
  @js.native
  sealed trait double extends RangeUnderlineStyle
  
  @js.native
  sealed trait doubleAccountant extends RangeUnderlineStyle
  
  @js.native
  sealed trait none extends RangeUnderlineStyle
  
  @js.native
  sealed trait single extends RangeUnderlineStyle
  
  @js.native
  sealed trait singleAccountant extends RangeUnderlineStyle
}
