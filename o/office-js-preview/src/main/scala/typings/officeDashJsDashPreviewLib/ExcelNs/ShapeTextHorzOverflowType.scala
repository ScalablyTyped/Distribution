package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeTextHorzOverflowType extends js.Object

/**
     * [Api set: ExcelApi BETA (PREVIEW ONLY)]
     * @beta
     */
@JSGlobal("Excel.ShapeTextHorzOverflowType")
@js.native
object ShapeTextHorzOverflowType extends js.Object {
  @js.native
  sealed trait clip
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorzOverflowType
  
  @js.native
  sealed trait overflow
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorzOverflowType
  
  @js.native
  sealed trait shapeTextHorzOverflowType_MaxEnumIDs
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorzOverflowType
  
  /* "Clip" */ val clip: clip with java.lang.String = js.native
  /* "Overflow" */ val overflow: overflow with java.lang.String = js.native
  /* "ShapeTextHorzOverflowType_MaxEnumIDs" */ val shapeTextHorzOverflowType_MaxEnumIDs: shapeTextHorzOverflowType_MaxEnumIDs with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorzOverflowType with java.lang.String
  ] = js.native
}

