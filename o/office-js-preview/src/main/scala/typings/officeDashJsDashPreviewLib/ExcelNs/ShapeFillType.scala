package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeFillType extends js.Object

/**
     * [Api set: ExcelApi BETA (PREVIEW ONLY)]
     * @beta
     */
@JSGlobal("Excel.ShapeFillType")
@js.native
object ShapeFillType extends js.Object {
  @js.native
  sealed trait gradient
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeFillType
  
  @js.native
  sealed trait mixed
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeFillType
  
  @js.native
  sealed trait noFill
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeFillType
  
  @js.native
  sealed trait pattern
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeFillType
  
  @js.native
  sealed trait pictureAndTexture
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeFillType
  
  @js.native
  sealed trait solid
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeFillType
  
  /* "Gradient" */ val gradient: gradient with java.lang.String = js.native
  /* "Mixed" */ val mixed: mixed with java.lang.String = js.native
  /* "NoFill" */ val noFill: noFill with java.lang.String = js.native
  /* "Pattern" */ val pattern: pattern with java.lang.String = js.native
  /* "PictureAndTexture" */ val pictureAndTexture: pictureAndTexture with java.lang.String = js.native
  /* "Solid" */ val solid: solid with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ShapeFillType with java.lang.String] = js.native
}

