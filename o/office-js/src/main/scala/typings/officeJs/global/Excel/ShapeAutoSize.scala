package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Determines the type of automatic sizing allowed.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeAutoSize")
@js.native
object ShapeAutoSize extends js.Object {
  /* "AutoSizeMixed" */ val autoSizeMixed: typings.officeJs.Excel.ShapeAutoSize.autoSizeMixed with String = js.native
  /* "AutoSizeNone" */ val autoSizeNone: typings.officeJs.Excel.ShapeAutoSize.autoSizeNone with String = js.native
  /* "AutoSizeShapeToFitText" */ val autoSizeShapeToFitText: typings.officeJs.Excel.ShapeAutoSize.autoSizeShapeToFitText with String = js.native
  /* "AutoSizeTextToFitShape" */ val autoSizeTextToFitShape: typings.officeJs.Excel.ShapeAutoSize.autoSizeTextToFitShape with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ShapeAutoSize with String] = js.native
}

