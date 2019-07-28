package typings.officeDashJs.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintComments extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PrintComments")
@js.native
object PrintComments extends js.Object {
  /**
    *
    * Comments will be printed as end notes at the end of the worksheet.
    *
    */
  @js.native
  sealed trait endSheet extends PrintComments
  
  /**
    *
    * Comments will be printed where they were inserted in the worksheet.
    *
    */
  @js.native
  sealed trait inPlace extends PrintComments
  
  /**
    *
    * Comments will not be printed.
    *
    */
  @js.native
  sealed trait noComments extends PrintComments
  
  /* "EndSheet" */ val endSheet: typings.officeDashJs.ExcelNs.PrintComments.endSheet with String = js.native
  /* "InPlace" */ val inPlace: typings.officeDashJs.ExcelNs.PrintComments.inPlace with String = js.native
  /* "NoComments" */ val noComments: typings.officeDashJs.ExcelNs.PrintComments.noComments with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PrintComments with String] = js.native
}

