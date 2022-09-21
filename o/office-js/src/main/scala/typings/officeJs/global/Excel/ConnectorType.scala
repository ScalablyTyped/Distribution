package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ConnectorType")
@js.native
object ConnectorType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ConnectorType & String] = js.native
  
  /* "Curve" */ val curve: typings.officeJs.Excel.ConnectorType.curve & String = js.native
  
  /* "Elbow" */ val elbow: typings.officeJs.Excel.ConnectorType.elbow & String = js.native
  
  /* "Straight" */ val straight: typings.officeJs.Excel.ConnectorType.straight & String = js.native
}
