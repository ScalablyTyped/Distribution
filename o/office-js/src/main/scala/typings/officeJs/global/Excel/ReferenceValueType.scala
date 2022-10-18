package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the types of the `ReferenceValue` object.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
@JSGlobal("Excel.ReferenceValueType")
@js.native
object ReferenceValueType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ReferenceValueType & String] = js.native
  
  /* "Array" */ val array: typings.officeJs.Excel.ReferenceValueType.array & String = js.native
  
  /* "Entity" */ val entity: typings.officeJs.Excel.ReferenceValueType.entity & String = js.native
  
  /* "Root" */ val root: typings.officeJs.Excel.ReferenceValueType.root & String = js.native
}
