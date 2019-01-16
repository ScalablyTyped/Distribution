package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeLineStyle extends js.Object

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ShapeLineStyle")
@js.native
object ShapeLineStyle extends js.Object {
  @js.native
  sealed trait single
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeLineStyle
  
  @js.native
  sealed trait thickBetweenThin
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeLineStyle
  
  @js.native
  sealed trait thickThin
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeLineStyle
  
  @js.native
  sealed trait thinThick
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeLineStyle
  
  @js.native
  sealed trait thinThin
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeLineStyle
  
  /* "Single" */ val single: single with java.lang.String = js.native
  /* "ThickBetweenThin" */ val thickBetweenThin: thickBetweenThin with java.lang.String = js.native
  /* "ThickThin" */ val thickThin: thickThin with java.lang.String = js.native
  /* "ThinThick" */ val thinThick: thinThick with java.lang.String = js.native
  /* "ThinThin" */ val thinThin: thinThin with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ShapeLineStyle with java.lang.String] = js.native
}

