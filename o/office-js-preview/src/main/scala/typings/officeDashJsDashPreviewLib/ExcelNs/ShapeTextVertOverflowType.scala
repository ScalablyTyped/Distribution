package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeTextVertOverflowType extends js.Object

/**
     * [Api set: ExcelApi BETA (PREVIEW ONLY)]
     * @beta
     */
@JSGlobal("Excel.ShapeTextVertOverflowType")
@js.native
object ShapeTextVertOverflowType extends js.Object {
  @js.native
  sealed trait clip
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextVertOverflowType
  
  @js.native
  sealed trait ellipsis
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextVertOverflowType
  
  @js.native
  sealed trait overflow
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextVertOverflowType
  
  @js.native
  sealed trait shapeTextVertOverflowType_MaxEnumIDs
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextVertOverflowType
  
  /* "Clip" */ val clip: clip with java.lang.String = js.native
  /* "Ellipsis" */ val ellipsis: ellipsis with java.lang.String = js.native
  /* "Overflow" */ val overflow: overflow with java.lang.String = js.native
  /* "ShapeTextVertOverflowType_MaxEnumIDs" */ val shapeTextVertOverflowType_MaxEnumIDs: shapeTextVertOverflowType_MaxEnumIDs with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeTextVertOverflowType with java.lang.String
  ] = js.native
}

