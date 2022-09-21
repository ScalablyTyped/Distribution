package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeFillType extends StObject
/**
  * Specifies a shape's fill type.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeFillType")
@js.native
object ShapeFillType extends StObject {
  
  /**
    * Gradient fill.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait gradient
    extends StObject
       with ShapeFillType
  
  /**
    * Mixed fill.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait mixed
    extends StObject
       with ShapeFillType
  
  /**
    * No fill.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait noFill
    extends StObject
       with ShapeFillType
  
  /**
    * Pattern fill.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait pattern
    extends StObject
       with ShapeFillType
  
  /**
    * Picture and texture fill.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait pictureAndTexture
    extends StObject
       with ShapeFillType
  
  /**
    * Solid fill.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait solid
    extends StObject
       with ShapeFillType
}
