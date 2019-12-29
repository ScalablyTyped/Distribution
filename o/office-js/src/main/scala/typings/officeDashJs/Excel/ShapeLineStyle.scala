package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeLineStyle extends js.Object

/**
  *
  * The style for a line.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeLineStyle")
@js.native
object ShapeLineStyle extends js.Object {
  /**
    *
    * Single line.
    *
    */
  @js.native
  sealed trait single extends ShapeLineStyle
  
  /**
    *
    * Thick line with a thin line on each side.
    *
    */
  @js.native
  sealed trait thickBetweenThin extends ShapeLineStyle
  
  /**
    *
    * Thick line next to thin line. For horizontal lines, the thick line is above the thin line. For vertical lines, the thick line is to the left of the thin line.
    *
    */
  @js.native
  sealed trait thickThin extends ShapeLineStyle
  
  /**
    *
    * Thick line next to thin line. For horizontal lines, the thick line is below the thin line. For vertical lines, the thick line is to the right of the thin line.
    *
    */
  @js.native
  sealed trait thinThick extends ShapeLineStyle
  
  /**
    *
    * Two thin lines.
    *
    */
  @js.native
  sealed trait thinThin extends ShapeLineStyle
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeLineStyle with String] = js.native
  /* "Single" */ @js.native
  object single extends TopLevel[single with String]
  
  /* "ThickBetweenThin" */ @js.native
  object thickBetweenThin extends TopLevel[thickBetweenThin with String]
  
  /* "ThickThin" */ @js.native
  object thickThin extends TopLevel[thickThin with String]
  
  /* "ThinThick" */ @js.native
  object thinThick extends TopLevel[thinThick with String]
  
  /* "ThinThin" */ @js.native
  object thinThin extends TopLevel[thinThin with String]
  
}

