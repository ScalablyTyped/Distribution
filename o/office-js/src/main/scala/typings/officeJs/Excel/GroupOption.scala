package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GroupOption extends StObject
/**
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.GroupOption")
@js.native
object GroupOption extends StObject {
  
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
