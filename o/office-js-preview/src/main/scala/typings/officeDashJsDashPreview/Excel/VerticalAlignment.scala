package typings.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalAlignment extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.VerticalAlignment")
@js.native
object VerticalAlignment extends js.Object {
  @js.native
  sealed trait bottom extends VerticalAlignment
  
  @js.native
  sealed trait center extends VerticalAlignment
  
  @js.native
  sealed trait distributed extends VerticalAlignment
  
  @js.native
  sealed trait justify extends VerticalAlignment
  
  @js.native
  sealed trait top extends VerticalAlignment
  
  /* "Bottom" */ val bottom: typings.officeDashJsDashPreview.Excel.VerticalAlignment.bottom with String = js.native
  /* "Center" */ val center: typings.officeDashJsDashPreview.Excel.VerticalAlignment.center with String = js.native
  /* "Distributed" */ val distributed: typings.officeDashJsDashPreview.Excel.VerticalAlignment.distributed with String = js.native
  /* "Justify" */ val justify: typings.officeDashJsDashPreview.Excel.VerticalAlignment.justify with String = js.native
  /* "Top" */ val top: typings.officeDashJsDashPreview.Excel.VerticalAlignment.top with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[VerticalAlignment with String] = js.native
}

