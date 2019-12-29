package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartMapLabelStrategy extends js.Object

/**
  *
  * Represents the region level of a chart series layout. This only applies to region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapLabelStrategy")
@js.native
object ChartMapLabelStrategy extends js.Object {
  @js.native
  sealed trait bestFit extends ChartMapLabelStrategy
  
  @js.native
  sealed trait none extends ChartMapLabelStrategy
  
  @js.native
  sealed trait showAll extends ChartMapLabelStrategy
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartMapLabelStrategy with String] = js.native
  /* "BestFit" */ @js.native
  object bestFit extends TopLevel[bestFit with String]
  
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "ShowAll" */ @js.native
  object showAll extends TopLevel[showAll with String]
  
}

