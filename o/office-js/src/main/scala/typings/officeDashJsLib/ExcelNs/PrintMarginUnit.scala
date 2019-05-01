package typings
package officeDashJsLib.ExcelNs

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
  sealed trait centimeters
    extends officeDashJsLib.ExcelNs.PrintMarginUnit
  
  /**
    *
    * Assign the page margins in inches.
    *
    */
  @js.native
  sealed trait inches
    extends officeDashJsLib.ExcelNs.PrintMarginUnit
  
  /**
    *
    * Assign the page margins in points. A point is 1/72 of an inch.
    *
    */
  @js.native
  sealed trait points
    extends officeDashJsLib.ExcelNs.PrintMarginUnit
  
  /* "Centimeters" */ val centimeters: centimeters with java.lang.String = js.native
  /* "Inches" */ val inches: inches with java.lang.String = js.native
  /* "Points" */ val points: points with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.PrintMarginUnit with java.lang.String] = js.native
}

