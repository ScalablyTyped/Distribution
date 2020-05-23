package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeFillType extends js.Object

/**
  *
  * Specifies a shape's fill type.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeFillType")
@js.native
object ShapeFillType extends js.Object {
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

