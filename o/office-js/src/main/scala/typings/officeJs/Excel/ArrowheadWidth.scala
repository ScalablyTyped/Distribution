package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArrowheadWidth extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ArrowheadWidth")
@js.native
object ArrowheadWidth extends js.Object {
  @js.native
  sealed trait medium extends ArrowheadWidth
  
  @js.native
  sealed trait narrow extends ArrowheadWidth
  
  @js.native
  sealed trait wide extends ArrowheadWidth
  
}

