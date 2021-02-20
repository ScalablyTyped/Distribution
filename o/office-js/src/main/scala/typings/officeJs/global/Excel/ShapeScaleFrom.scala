package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies which part of the shape retains its position when the shape is scaled.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeScaleFrom")
@js.native
object ShapeScaleFrom extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ShapeScaleFrom with String] = js.native
  
  /* "ScaleFromBottomRight" */ val scaleFromBottomRight: typings.officeJs.Excel.ShapeScaleFrom.scaleFromBottomRight with String = js.native
  
  /* "ScaleFromMiddle" */ val scaleFromMiddle: typings.officeJs.Excel.ShapeScaleFrom.scaleFromMiddle with String = js.native
  
  /* "ScaleFromTopLeft" */ val scaleFromTopLeft: typings.officeJs.Excel.ShapeScaleFrom.scaleFromTopLeft with String = js.native
}
