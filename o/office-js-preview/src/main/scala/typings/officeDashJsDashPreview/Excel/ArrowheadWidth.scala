package typings.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArrowheadWidth extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ArrowheadWidth")
@js.native
object ArrowheadWidth extends js.Object {
  @js.native
  sealed trait medium extends ArrowheadWidth
  
  @js.native
  sealed trait narrow extends ArrowheadWidth
  
  @js.native
  sealed trait wide extends ArrowheadWidth
  
  /* "Medium" */ val medium: typings.officeDashJsDashPreview.Excel.ArrowheadWidth.medium with String = js.native
  /* "Narrow" */ val narrow: typings.officeDashJsDashPreview.Excel.ArrowheadWidth.narrow with String = js.native
  /* "Wide" */ val wide: typings.officeDashJsDashPreview.Excel.ArrowheadWidth.wide with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ArrowheadWidth with String] = js.native
}

