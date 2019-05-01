package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeAutoSize extends js.Object

/**
  *
  * Determines the type of automatic sizing allowed.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeAutoSize")
@js.native
object ShapeAutoSize extends js.Object {
  /**
    *
    * A combination of automatic sizing schemes are used.
    *
    */
  @js.native
  sealed trait autoSizeMixed
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeAutoSize
  
  /**
    *
    * No autosizing.
    *
    */
  @js.native
  sealed trait autoSizeNone
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeAutoSize
  
  /**
    *
    * The shape is adjusted to fit the text.
    *
    */
  @js.native
  sealed trait autoSizeShapeToFitText
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeAutoSize
  
  /**
    *
    * The text is adjusted to fit the shape.
    *
    */
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

