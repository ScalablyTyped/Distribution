package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConnectorType with String] = js.native
  /* "Curve" */ @js.native
  object curve extends TopLevel[curve with String]
  
  /* "Elbow" */ @js.native
  object elbow extends TopLevel[elbow with String]
  
  /* "Straight" */ @js.native
  object straight extends TopLevel[straight with String]
  
}

