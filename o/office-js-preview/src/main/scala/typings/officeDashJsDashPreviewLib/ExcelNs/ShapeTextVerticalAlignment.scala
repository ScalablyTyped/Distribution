package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeTextVerticalAlignment extends js.Object

/**
  *
  * Specifies the vertical alignment for the text frame in a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextVerticalAlignment")
@js.native
object ShapeTextVerticalAlignment extends js.Object {
  @js.native
  sealed trait bottom
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalAlignment
  
  @js.native
  sealed trait distributed
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalAlignment
  
  @js.native
  sealed trait justified
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalAlignment
  
  @js.native
  sealed trait middle
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalAlignment
  
  @js.native
  sealed trait top
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalAlignment
  
  /* "Bottom" */ val bottom: bottom with java.lang.String = js.native
  /* "Distributed" */ val distributed: distributed with java.lang.String = js.native
  /* "Justified" */ val justified: justified with java.lang.String = js.native
  /* "Middle" */ val middle: middle with java.lang.String = js.native
  /* "Top" */ val top: top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalAlignment with java.lang.String
  ] = js.native
}

