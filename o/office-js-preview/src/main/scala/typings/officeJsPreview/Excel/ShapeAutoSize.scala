package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeAutoSize extends StObject
/**
  * Determines the type of automatic sizing allowed.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeAutoSize")
@js.native
object ShapeAutoSize extends StObject {
  
  /**
    * A combination of automatic sizing schemes are used.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait autoSizeMixed
    extends StObject
       with ShapeAutoSize
  
  /**
    * No autosizing.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait autoSizeNone
    extends StObject
       with ShapeAutoSize
  
  /**
    * The shape is adjusted to fit the text.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait autoSizeShapeToFitText
    extends StObject
       with ShapeAutoSize
  
  /**
    * The text is adjusted to fit the shape.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait autoSizeTextToFitShape
    extends StObject
       with ShapeAutoSize
}
