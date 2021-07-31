package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeFillType extends StObject
/**
  *
  * Specifies a shape's fill type.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeFillType")
@js.native
object ShapeFillType extends StObject {
  
  /**
    * Gradient fill.
    *
    */
  @js.native
  sealed trait gradient
    extends StObject
       with ShapeFillType
  
  /**
    * Mixed fill.
    *
    */
  @js.native
  sealed trait mixed
    extends StObject
       with ShapeFillType
  
  /**
    * No fill.
    *
    */
  @js.native
  sealed trait noFill
    extends StObject
       with ShapeFillType
  
  /**
    * Pattern fill.
    *
    */
  @js.native
  sealed trait pattern
    extends StObject
       with ShapeFillType
  
  /**
    * Picture and texture fill.
    *
    */
  @js.native
  sealed trait pictureAndTexture
    extends StObject
       with ShapeFillType
  
  /**
    * Solid fill.
    *
    */
  @js.native
  sealed trait solid
    extends StObject
       with ShapeFillType
}
