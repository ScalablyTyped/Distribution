package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeAutoSize extends js.Object

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ShapeAutoSize")
@js.native
object ShapeAutoSize extends js.Object {
  @js.native
  sealed trait autoSizeMixed
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeAutoSize
  
  @js.native
  sealed trait autoSizeNone
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeAutoSize
  
  @js.native
  sealed trait autoSizeShapeToFitText
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeAutoSize
  
  @js.native
  sealed trait autoSizeTextToFitShape
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeAutoSize
  
  /* "AutoSizeMixed" */ val autoSizeMixed: autoSizeMixed with java.lang.String = js.native
  /* "AutoSizeNone" */ val autoSizeNone: autoSizeNone with java.lang.String = js.native
  /* "AutoSizeShapeToFitText" */ val autoSizeShapeToFitText: autoSizeShapeToFitText with java.lang.String = js.native
  /* "AutoSizeTextToFitShape" */ val autoSizeTextToFitShape: autoSizeTextToFitShape with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ShapeAutoSize with java.lang.String] = js.native
}

