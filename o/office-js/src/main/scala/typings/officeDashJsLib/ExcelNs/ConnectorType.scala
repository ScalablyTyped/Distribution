package typings
package officeDashJsLib.ExcelNs

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
  sealed trait curve
    extends officeDashJsLib.ExcelNs.ConnectorType
  
  @js.native
  sealed trait elbow
    extends officeDashJsLib.ExcelNs.ConnectorType
  
  @js.native
  sealed trait straight
    extends officeDashJsLib.ExcelNs.ConnectorType
  
  /* "Curve" */ val curve: curve with java.lang.String = js.native
  /* "Elbow" */ val elbow: elbow with java.lang.String = js.native
  /* "Straight" */ val straight: straight with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ConnectorType with java.lang.String] = js.native
}

