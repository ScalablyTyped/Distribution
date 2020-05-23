package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterDatetimeSpecificity extends js.Object

/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.FilterDatetimeSpecificity")
@js.native
object FilterDatetimeSpecificity extends js.Object {
  @js.native
  sealed trait day extends FilterDatetimeSpecificity
  
  @js.native
  sealed trait hour extends FilterDatetimeSpecificity
  
  @js.native
  sealed trait minute extends FilterDatetimeSpecificity
  
  @js.native
  sealed trait month extends FilterDatetimeSpecificity
  
  @js.native
  sealed trait second extends FilterDatetimeSpecificity
  
  @js.native
  sealed trait year extends FilterDatetimeSpecificity
  
}

