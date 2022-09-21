package typings.officeJsPreview.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeLineStyle extends StObject
/**
  * Specifies the style for a line.
  *
  * @remarks
  * [Api set: PowerPointApi 1.4]
  */
@JSGlobal("PowerPoint.ShapeLineStyle")
@js.native
object ShapeLineStyle extends StObject {
  
  /**
    * Single line.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait single
    extends StObject
       with ShapeLineStyle
  
  /**
    * Thick line with a thin line on each side.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait thickBetweenThin
    extends StObject
       with ShapeLineStyle
  
  /**
    * Thick line next to thin line. For horizontal lines, the thick line is above the thin line. For vertical lines, the thick line is to the left of the thin line.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait thickThin
    extends StObject
       with ShapeLineStyle
  
  /**
    * Thick line next to thin line. For horizontal lines, the thick line is below the thin line. For vertical lines, the thick line is to the right of the thin line.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait thinThick
    extends StObject
       with ShapeLineStyle
  
  /**
    * Two thin lines.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait thinThin
    extends StObject
       with ShapeLineStyle
}
