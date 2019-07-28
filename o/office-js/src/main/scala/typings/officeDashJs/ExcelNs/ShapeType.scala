package typings.officeDashJs.ExcelNs

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
  
  /* "GeometricShape" */ val geometricShape: typings.officeDashJs.ExcelNs.ShapeType.geometricShape with String = js.native
  /* "Group" */ val group: typings.officeDashJs.ExcelNs.ShapeType.group with String = js.native
  /* "Image" */ val image: typings.officeDashJs.ExcelNs.ShapeType.image with String = js.native
  /* "Line" */ val line: typings.officeDashJs.ExcelNs.ShapeType.line with String = js.native
  /* "Unsupported" */ val unsupported: typings.officeDashJs.ExcelNs.ShapeType.unsupported with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeType with String] = js.native
}

