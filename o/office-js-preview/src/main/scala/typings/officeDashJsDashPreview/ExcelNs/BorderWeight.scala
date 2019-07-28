package typings.officeDashJsDashPreview.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BorderWeight extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.BorderWeight")
@js.native
object BorderWeight extends js.Object {
  @js.native
  sealed trait hairline extends BorderWeight
  
  @js.native
  sealed trait medium extends BorderWeight
  
  @js.native
  sealed trait thick extends BorderWeight
  
  @js.native
  sealed trait thin extends BorderWeight
  
  /* "Hairline" */ val hairline: typings.officeDashJsDashPreview.ExcelNs.BorderWeight.hairline with String = js.native
  /* "Medium" */ val medium: typings.officeDashJsDashPreview.ExcelNs.BorderWeight.medium with String = js.native
  /* "Thick" */ val thick: typings.officeDashJsDashPreview.ExcelNs.BorderWeight.thick with String = js.native
  /* "Thin" */ val thin: typings.officeDashJsDashPreview.ExcelNs.BorderWeight.thin with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BorderWeight with String] = js.native
}

