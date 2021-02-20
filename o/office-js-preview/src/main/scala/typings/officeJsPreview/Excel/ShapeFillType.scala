package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  sealed trait gradient extends ShapeFillType
  
  /**
    * Mixed fill.
    *
    */
  @js.native
  sealed trait mixed extends ShapeFillType
  
  /**
    * No fill.
    *
    */
  @js.native
  sealed trait noFill extends ShapeFillType
  
  /**
    * Pattern fill.
    *
    */
  @js.native
  sealed trait pattern extends ShapeFillType
  
  /**
    * Picture and texture fill.
    *
    */
  @js.native
  sealed trait pictureAndTexture extends ShapeFillType
  
  /**
    * Solid fill.
    *
    */
  @js.native
  sealed trait solid extends ShapeFillType
}
