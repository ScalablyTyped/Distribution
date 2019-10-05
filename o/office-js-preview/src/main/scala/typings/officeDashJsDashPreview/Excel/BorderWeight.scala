package typings.officeDashJsDashPreview.Excel

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
  
  /* "Hairline" */ val hairline: typings.officeDashJsDashPreview.Excel.BorderWeight.hairline with String = js.native
  /* "Medium" */ val medium: typings.officeDashJsDashPreview.Excel.BorderWeight.medium with String = js.native
  /* "Thick" */ val thick: typings.officeDashJsDashPreview.Excel.BorderWeight.thick with String = js.native
  /* "Thin" */ val thin: typings.officeDashJsDashPreview.Excel.BorderWeight.thin with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BorderWeight with String] = js.native
}

