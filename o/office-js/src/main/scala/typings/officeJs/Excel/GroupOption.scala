package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GroupOption extends js.Object
/**
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.GroupOption")
@js.native
object GroupOption extends js.Object {
  
  /**
    * Group by columns.
    *
    */
  @js.native
  sealed trait byColumns extends GroupOption
  
  /**
    * Group by rows.
    *
    */
  @js.native
  sealed trait byRows extends GroupOption
}
