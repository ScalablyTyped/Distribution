package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeTextVerticalAlignType extends js.Object

/**
     * [Api set: ExcelApi BETA (PREVIEW ONLY)]
     * @beta
     */
@JSGlobal("Excel.ShapeTextVerticalAlignType")
@js.native
object ShapeTextVerticalAlignType extends js.Object {
  @js.native
  sealed trait bottom
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalAlignType
  
  @js.native
  sealed trait distributed
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalAlignType
  
  @js.native
  sealed trait justified
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalAlignType
  
  @js.native
  sealed trait middle
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalAlignType
  
  @js.native
  sealed trait shapeTextVerticalAlignType_MaxEnumIDs
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalAlignType
  
  @js.native
  sealed trait top
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalAlignType
  
  /* "Bottom" */ val bottom: bottom with java.lang.String = js.native
  /* "Distributed" */ val distributed: distributed with java.lang.String = js.native
  /* "Justified" */ val justified: justified with java.lang.String = js.native
  /* "Middle" */ val middle: middle with java.lang.String = js.native
  /* "ShapeTextVerticalAlignType_MaxEnumIDs" */ val shapeTextVerticalAlignType_MaxEnumIDs: shapeTextVerticalAlignType_MaxEnumIDs with java.lang.String = js.native
  /* "Top" */ val top: top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalAlignType with java.lang.String
  ] = js.native
}

