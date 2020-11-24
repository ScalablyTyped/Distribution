package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartAxisGroup extends js.Object
/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisGroup")
@js.native
object ChartAxisGroup extends js.Object {
  
  @js.native
  sealed trait primary extends ChartAxisGroup
  
  @js.native
  sealed trait secondary extends ChartAxisGroup
}
