package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the types of the `CellValue` object.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
@JSGlobal("Excel.CellValueType")
@js.native
object CellValueType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.CellValueType & String] = js.native
  
  /* "Array" */ val array: typings.officeJs.Excel.CellValueType.array & String = js.native
  
  /* "Boolean" */ val boolean: typings.officeJs.Excel.CellValueType.boolean & String = js.native
  
  /* "Double" */ val double: typings.officeJs.Excel.CellValueType.double & String = js.native
  
  /* "Empty" */ val empty: typings.officeJs.Excel.CellValueType.empty & String = js.native
  
  /* "Entity" */ val entity: typings.officeJs.Excel.CellValueType.entity & String = js.native
  
  /* "Error" */ val error: typings.officeJs.Excel.CellValueType.error & String = js.native
  
  /* "FormattedNumber" */ val formattedNumber: typings.officeJs.Excel.CellValueType.formattedNumber & String = js.native
  
  /* "LinkedEntity" */ val linkedEntity: typings.officeJs.Excel.CellValueType.linkedEntity & String = js.native
  
  /* "NotAvailable" */ val notAvailable: typings.officeJs.Excel.CellValueType.notAvailable & String = js.native
  
  /* "Reference" */ val reference: typings.officeJs.Excel.CellValueType.reference & String = js.native
  
  /* "String" */ val string: typings.officeJs.Excel.CellValueType.string & String = js.native
  
  /* "WebImage" */ val webImage: typings.officeJs.Excel.CellValueType.webImage & String = js.native
}
