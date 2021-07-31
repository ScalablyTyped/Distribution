package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeScaleFrom extends StObject
/**
  *
  * Specifies which part of the shape retains its position when the shape is scaled.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeScaleFrom")
@js.native
object ShapeScaleFrom extends StObject {
  
  @js.native
  sealed trait scaleFromBottomRight
    extends StObject
       with ShapeScaleFrom
  
  @js.native
  sealed trait scaleFromMiddle
    extends StObject
       with ShapeScaleFrom
  
  @js.native
  sealed trait scaleFromTopLeft
    extends StObject
       with ShapeScaleFrom
}
