package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BorderWeight extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.BorderWeight")
@js.native
object BorderWeight extends js.Object {
  @js.native
  sealed trait hairline extends BorderWeight
  
  @js.native
  sealed trait medium extends BorderWeight
  
  @js.native
  sealed trait thick extends BorderWeight
  
  @js.native
  sealed trait thin extends BorderWeight
  
}

