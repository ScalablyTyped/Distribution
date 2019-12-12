package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Excel.BindingType.range
import typings.officeDashJs.Excel.BindingType.table
import typings.officeDashJs.Excel.BindingType.text
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BindingType with String] = js.native
  /* "Range" */ @js.native
  object range extends TopLevel[range with String]
  
  /* "Table" */ @js.native
  object table extends TopLevel[table with String]
  
  /* "Text" */ @js.native
  object text extends TopLevel[text with String]
  
}

