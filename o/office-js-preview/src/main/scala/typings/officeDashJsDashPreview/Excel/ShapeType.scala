package typings.officeDashJsDashPreview.Excel

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
  
  /* "GeometricShape" */ val geometricShape: typings.officeDashJsDashPreview.Excel.ShapeType.geometricShape with String = js.native
  /* "Group" */ val group: typings.officeDashJsDashPreview.Excel.ShapeType.group with String = js.native
  /* "Image" */ val image: typings.officeDashJsDashPreview.Excel.ShapeType.image with String = js.native
  /* "Line" */ val line: typings.officeDashJsDashPreview.Excel.ShapeType.line with String = js.native
  /* "Unsupported" */ val unsupported: typings.officeDashJsDashPreview.Excel.ShapeType.unsupported with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeType with String] = js.native
}

