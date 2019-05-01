package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangeCopyType extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.RangeCopyType")
@js.native
object RangeCopyType extends js.Object {
  @js.native
  sealed trait all
    extends officeDashJsLib.ExcelNs.RangeCopyType
  
  @js.native
  sealed trait formats
    extends officeDashJsLib.ExcelNs.RangeCopyType
  
  @js.native
  sealed trait formulas
    extends officeDashJsLib.ExcelNs.RangeCopyType
  
  @js.native
  sealed trait values
    extends officeDashJsLib.ExcelNs.RangeCopyType
  
  /* "All" */ val all: all with java.lang.String = js.native
  /* "Formats" */ val formats: formats with java.lang.String = js.native
  /* "Formulas" */ val formulas: formulas with java.lang.String = js.native
  /* "Values" */ val values: values with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.RangeCopyType with java.lang.String] = js.native
}

