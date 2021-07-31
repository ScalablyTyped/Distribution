package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeLineStyle extends StObject
/**
  *
  * The style for a line.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeLineStyle")
@js.native
object ShapeLineStyle extends StObject {
  
  /**
    * Single line.
    *
    */
  @js.native
  sealed trait single
    extends StObject
       with ShapeLineStyle
  
  /**
    * Thick line with a thin line on each side.
    *
    */
  @js.native
  sealed trait thickBetweenThin
    extends StObject
       with ShapeLineStyle
  
  /**
    * Thick line next to thin line. For horizontal lines, the thick line is above the thin line. For vertical lines, the thick line is to the left of the thin line.
    *
    */
  @js.native
  sealed trait thickThin
    extends StObject
       with ShapeLineStyle
  
  /**
    * Thick line next to thin line. For horizontal lines, the thick line is below the thin line. For vertical lines, the thick line is to the right of the thin line.
    *
    */
  @js.native
  sealed trait thinThick
    extends StObject
       with ShapeLineStyle
  
  /**
    * Two thin lines.
    *
    */
  @js.native
  sealed trait thinThin
    extends StObject
       with ShapeLineStyle
}
