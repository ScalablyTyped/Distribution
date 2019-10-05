package typings.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectorType extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ConnectorType")
@js.native
object ConnectorType extends js.Object {
  @js.native
  sealed trait curve extends ConnectorType
  
  @js.native
  sealed trait elbow extends ConnectorType
  
  @js.native
  sealed trait straight extends ConnectorType
  
  /* "Curve" */ val curve: typings.officeDashJsDashPreview.Excel.ConnectorType.curve with String = js.native
  /* "Elbow" */ val elbow: typings.officeDashJsDashPreview.Excel.ConnectorType.elbow with String = js.native
  /* "Straight" */ val straight: typings.officeDashJsDashPreview.Excel.ConnectorType.straight with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConnectorType with String] = js.native
}

