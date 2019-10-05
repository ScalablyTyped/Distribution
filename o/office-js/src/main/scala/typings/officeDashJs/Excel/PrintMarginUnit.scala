package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintMarginUnit extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PrintMarginUnit")
@js.native
object PrintMarginUnit extends js.Object {
  /**
    *
    * Assign the page margins in centimeters.
    *
    */
  @js.native
  sealed trait centimeters extends PrintMarginUnit
  
  /**
    *
    * Assign the page margins in inches.
    *
    */
  @js.native
  sealed trait inches extends PrintMarginUnit
  
  /**
    *
    * Assign the page margins in points. A point is 1/72 of an inch.
    *
    */
  @js.native
  sealed trait points extends PrintMarginUnit
  
  /* "Centimeters" */ val centimeters: typings.officeDashJs.Excel.PrintMarginUnit.centimeters with String = js.native
  /* "Inches" */ val inches: typings.officeDashJs.Excel.PrintMarginUnit.inches with String = js.native
  /* "Points" */ val points: typings.officeDashJs.Excel.PrintMarginUnit.points with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PrintMarginUnit with String] = js.native
}

