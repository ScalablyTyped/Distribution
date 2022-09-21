package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the type of a shape.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeType")
@js.native
object ShapeType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ShapeType & String] = js.native
  
  /* "GeometricShape" */ val geometricShape: typings.officeJsPreview.Excel.ShapeType.geometricShape & String = js.native
  
  /* "Group" */ val group: typings.officeJsPreview.Excel.ShapeType.group & String = js.native
  
  /* "Image" */ val image: typings.officeJsPreview.Excel.ShapeType.image & String = js.native
  
  /* "Line" */ val line: typings.officeJsPreview.Excel.ShapeType.line & String = js.native
  
  /* "Unsupported" */ val unsupported: typings.officeJsPreview.Excel.ShapeType.unsupported & String = js.native
}
