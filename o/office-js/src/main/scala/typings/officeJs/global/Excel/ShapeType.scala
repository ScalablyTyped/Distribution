package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies the type of a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeType")
@js.native
object ShapeType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ShapeType with String] = js.native
  
  /* "GeometricShape" */ val geometricShape: typings.officeJs.Excel.ShapeType.geometricShape with String = js.native
  
  /* "Group" */ val group: typings.officeJs.Excel.ShapeType.group with String = js.native
  
  /* "Image" */ val image: typings.officeJs.Excel.ShapeType.image with String = js.native
  
  /* "Line" */ val line: typings.officeJs.Excel.ShapeType.line with String = js.native
  
  /* "Unsupported" */ val unsupported: typings.officeJs.Excel.ShapeType.unsupported with String = js.native
}
