package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeType extends js.Object

/**
  *
  * Specifies the type of a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeType")
@js.native
object ShapeType extends js.Object {
  @js.native
  sealed trait geometricShape extends ShapeType
  
  @js.native
  sealed trait group extends ShapeType
  
  @js.native
  sealed trait image extends ShapeType
  
  @js.native
  sealed trait line extends ShapeType
  
  @js.native
  sealed trait unsupported extends ShapeType
  
}

