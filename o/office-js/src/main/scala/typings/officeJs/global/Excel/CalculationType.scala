package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.CalculationType")
@js.native
object CalculationType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.CalculationType & String] = js.native
  
  /* "Full" */ val full: typings.officeJs.Excel.CalculationType.full & String = js.native
  
  /* "FullRebuild" */ val fullRebuild: typings.officeJs.Excel.CalculationType.fullRebuild & String = js.native
  
  /* "Recalculate" */ val recalculate: typings.officeJs.Excel.CalculationType.recalculate & String = js.native
}
