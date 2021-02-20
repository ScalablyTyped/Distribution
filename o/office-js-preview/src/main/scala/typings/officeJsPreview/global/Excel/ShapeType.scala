package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
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
object ShapeType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ShapeType with String] = js.native
  
  /* "GeometricShape" */ val geometricShape: typings.officeJsPreview.Excel.ShapeType.geometricShape with String = js.native
  
  /* "Group" */ val group: typings.officeJsPreview.Excel.ShapeType.group with String = js.native
  
  /* "Image" */ val image: typings.officeJsPreview.Excel.ShapeType.image with String = js.native
  
  /* "Line" */ val line: typings.officeJsPreview.Excel.ShapeType.line with String = js.native
  
  /* "Unsupported" */ val unsupported: typings.officeJsPreview.Excel.ShapeType.unsupported with String = js.native
}
