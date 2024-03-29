package typings.officeJs.global.Excel

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
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ShapeType & String] = js.native
  
  /* "GeometricShape" */ val geometricShape: typings.officeJs.Excel.ShapeType.geometricShape & String = js.native
  
  /* "Group" */ val group: typings.officeJs.Excel.ShapeType.group & String = js.native
  
  /* "Image" */ val image: typings.officeJs.Excel.ShapeType.image & String = js.native
  
  /* "Line" */ val line: typings.officeJs.Excel.ShapeType.line & String = js.native
  
  /* "Unsupported" */ val unsupported: typings.officeJs.Excel.ShapeType.unsupported & String = js.native
}
