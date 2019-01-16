package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectorType extends js.Object

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ConnectorType")
@js.native
object ConnectorType extends js.Object {
  @js.native
  sealed trait curve
    extends officeDashJsDashPreviewLib.ExcelNs.ConnectorType
  
  @js.native
  sealed trait elbow
    extends officeDashJsDashPreviewLib.ExcelNs.ConnectorType
  
  @js.native
  sealed trait straight
    extends officeDashJsDashPreviewLib.ExcelNs.ConnectorType
  
  /* "Curve" */ val curve: curve with java.lang.String = js.native
  /* "Elbow" */ val elbow: elbow with java.lang.String = js.native
  /* "Straight" */ val straight: straight with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ConnectorType with java.lang.String] = js.native
}

