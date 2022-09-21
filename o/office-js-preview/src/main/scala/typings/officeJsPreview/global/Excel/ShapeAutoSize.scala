package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Determines the type of automatic sizing allowed.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeAutoSize")
@js.native
object ShapeAutoSize extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ShapeAutoSize & String] = js.native
  
  /* "AutoSizeMixed" */ val autoSizeMixed: typings.officeJsPreview.Excel.ShapeAutoSize.autoSizeMixed & String = js.native
  
  /* "AutoSizeNone" */ val autoSizeNone: typings.officeJsPreview.Excel.ShapeAutoSize.autoSizeNone & String = js.native
  
  /* "AutoSizeShapeToFitText" */ val autoSizeShapeToFitText: typings.officeJsPreview.Excel.ShapeAutoSize.autoSizeShapeToFitText & String = js.native
  
  /* "AutoSizeTextToFitShape" */ val autoSizeTextToFitShape: typings.officeJsPreview.Excel.ShapeAutoSize.autoSizeTextToFitShape & String = js.native
}
