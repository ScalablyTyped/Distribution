package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PrintMarginUnit with String] = js.native
  /* "Centimeters" */ @js.native
  object centimeters extends TopLevel[centimeters with String]
  
  /* "Inches" */ @js.native
  object inches extends TopLevel[inches with String]
  
  /* "Points" */ @js.native
  object points extends TopLevel[points with String]
  
}

