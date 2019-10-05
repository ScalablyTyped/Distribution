package typings.officeDashJs.Excel

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
  sealed trait autoSizeMixed extends ShapeAutoSize
  
  /**
    *
    * No autosizing.
    *
    */
  @js.native
  sealed trait autoSizeNone extends ShapeAutoSize
  
  /**
    *
    * The shape is adjusted to fit the text.
    *
    */
  @js.native
  sealed trait autoSizeShapeToFitText extends ShapeAutoSize
  
  /**
    *
    * The text is adjusted to fit the shape.
    *
    */
  @js.native
  sealed trait autoSizeTextToFitShape extends ShapeAutoSize
  
  /* "AutoSizeMixed" */ val autoSizeMixed: typings.officeDashJs.Excel.ShapeAutoSize.autoSizeMixed with String = js.native
  /* "AutoSizeNone" */ val autoSizeNone: typings.officeDashJs.Excel.ShapeAutoSize.autoSizeNone with String = js.native
  /* "AutoSizeShapeToFitText" */ val autoSizeShapeToFitText: typings.officeDashJs.Excel.ShapeAutoSize.autoSizeShapeToFitText with String = js.native
  /* "AutoSizeTextToFitShape" */ val autoSizeTextToFitShape: typings.officeDashJs.Excel.ShapeAutoSize.autoSizeTextToFitShape with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeAutoSize with String] = js.native
}

