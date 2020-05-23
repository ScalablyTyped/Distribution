package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BindingType extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.BindingType")
@js.native
object BindingType extends js.Object {
  @js.native
  sealed trait range extends BindingType
  
  @js.native
  sealed trait table extends BindingType
  
  @js.native
  sealed trait text extends BindingType
  
}

