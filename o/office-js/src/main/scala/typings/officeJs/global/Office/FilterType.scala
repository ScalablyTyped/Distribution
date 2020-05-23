package typings.officeJs.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies whether filtering from the host application is applied when the data is retrieved.
  */
@JSGlobal("Office.FilterType")
@js.native
object FilterType extends js.Object {
  /* 0 */ val All: typings.officeJs.Office.FilterType.All with Double = js.native
  /* 1 */ val OnlyVisible: typings.officeJs.Office.FilterType.OnlyVisible with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJs.Office.FilterType with Double] = js.native
}

