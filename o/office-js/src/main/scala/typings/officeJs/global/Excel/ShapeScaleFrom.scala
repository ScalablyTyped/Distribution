package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies which part of the shape retains its position when the shape is scaled.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeScaleFrom")
@js.native
object ShapeScaleFrom extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ShapeScaleFrom & String] = js.native
  
  /* "ScaleFromBottomRight" */ val scaleFromBottomRight: typings.officeJs.Excel.ShapeScaleFrom.scaleFromBottomRight & String = js.native
  
  /* "ScaleFromMiddle" */ val scaleFromMiddle: typings.officeJs.Excel.ShapeScaleFrom.scaleFromMiddle & String = js.native
  
  /* "ScaleFromTopLeft" */ val scaleFromTopLeft: typings.officeJs.Excel.ShapeScaleFrom.scaleFromTopLeft & String = js.native
}
