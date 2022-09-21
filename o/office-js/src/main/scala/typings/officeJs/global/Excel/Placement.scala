package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the way that an object is attached to its underlying cells.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.Placement")
@js.native
object Placement extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.Placement & String] = js.native
  
  /* "Absolute" */ val absolute: typings.officeJs.Excel.Placement.absolute & String = js.native
  
  /* "OneCell" */ val oneCell: typings.officeJs.Excel.Placement.oneCell & String = js.native
  
  /* "TwoCell" */ val twoCell: typings.officeJs.Excel.Placement.twoCell & String = js.native
}
