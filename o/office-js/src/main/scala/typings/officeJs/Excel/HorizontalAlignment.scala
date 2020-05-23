package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalAlignment extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.HorizontalAlignment")
@js.native
object HorizontalAlignment extends js.Object {
  @js.native
  sealed trait center extends HorizontalAlignment
  
  @js.native
  sealed trait centerAcrossSelection extends HorizontalAlignment
  
  @js.native
  sealed trait distributed extends HorizontalAlignment
  
  @js.native
  sealed trait fill extends HorizontalAlignment
  
  @js.native
  sealed trait general extends HorizontalAlignment
  
  @js.native
  sealed trait justify extends HorizontalAlignment
  
  @js.native
  sealed trait left extends HorizontalAlignment
  
  @js.native
  sealed trait right extends HorizontalAlignment
  
}

