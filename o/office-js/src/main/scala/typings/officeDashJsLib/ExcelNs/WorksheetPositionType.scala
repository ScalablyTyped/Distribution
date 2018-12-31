package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorksheetPositionType extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.WorksheetPositionType")
@js.native
object WorksheetPositionType extends js.Object {
  @js.native
  sealed trait after
    extends officeDashJsLib.ExcelNs.WorksheetPositionType
  
  @js.native
  sealed trait before
    extends officeDashJsLib.ExcelNs.WorksheetPositionType
  
  @js.native
  sealed trait beginning
    extends officeDashJsLib.ExcelNs.WorksheetPositionType
  
  @js.native
  sealed trait end
    extends officeDashJsLib.ExcelNs.WorksheetPositionType
  
  @js.native
  sealed trait none
    extends officeDashJsLib.ExcelNs.WorksheetPositionType
  
  /* "After" */ val after: after with java.lang.String = js.native
  /* "Before" */ val before: before with java.lang.String = js.native
  /* "Beginning" */ val beginning: beginning with java.lang.String = js.native
  /* "End" */ val end: end with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.WorksheetPositionType with java.lang.String] = js.native
}

