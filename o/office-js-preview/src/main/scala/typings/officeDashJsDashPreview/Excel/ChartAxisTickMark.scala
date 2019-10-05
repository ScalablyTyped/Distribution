package typings.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisTickMark extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisTickMark")
@js.native
object ChartAxisTickMark extends js.Object {
  @js.native
  sealed trait cross extends ChartAxisTickMark
  
  @js.native
  sealed trait inside extends ChartAxisTickMark
  
  @js.native
  sealed trait none extends ChartAxisTickMark
  
  @js.native
  sealed trait outside extends ChartAxisTickMark
  
  /* "Cross" */ val cross: typings.officeDashJsDashPreview.Excel.ChartAxisTickMark.cross with String = js.native
  /* "Inside" */ val inside: typings.officeDashJsDashPreview.Excel.ChartAxisTickMark.inside with String = js.native
  /* "None" */ val none: typings.officeDashJsDashPreview.Excel.ChartAxisTickMark.none with String = js.native
  /* "Outside" */ val outside: typings.officeDashJsDashPreview.Excel.ChartAxisTickMark.outside with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartAxisTickMark with String] = js.native
}

