package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RibbonTab extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.RibbonTab")
@js.native
object RibbonTab extends js.Object {
  @js.native
  sealed trait addIns extends RibbonTab
  
  @js.native
  sealed trait data extends RibbonTab
  
  @js.native
  sealed trait developer extends RibbonTab
  
  @js.native
  sealed trait draw extends RibbonTab
  
  @js.native
  sealed trait formulas extends RibbonTab
  
  @js.native
  sealed trait help extends RibbonTab
  
  @js.native
  sealed trait home extends RibbonTab
  
  @js.native
  sealed trait insert extends RibbonTab
  
  @js.native
  sealed trait others extends RibbonTab
  
  @js.native
  sealed trait pageLayout extends RibbonTab
  
  @js.native
  sealed trait review extends RibbonTab
  
  @js.native
  sealed trait view extends RibbonTab
  
  /* "AddIns" */ val addIns: typings.officeDashJs.Excel.RibbonTab.addIns with String = js.native
  /* "Data" */ val data: typings.officeDashJs.Excel.RibbonTab.data with String = js.native
  /* "Developer" */ val developer: typings.officeDashJs.Excel.RibbonTab.developer with String = js.native
  /* "Draw" */ val draw: typings.officeDashJs.Excel.RibbonTab.draw with String = js.native
  /* "Formulas" */ val formulas: typings.officeDashJs.Excel.RibbonTab.formulas with String = js.native
  /* "Help" */ val help: typings.officeDashJs.Excel.RibbonTab.help with String = js.native
  /* "Home" */ val home: typings.officeDashJs.Excel.RibbonTab.home with String = js.native
  /* "Insert" */ val insert: typings.officeDashJs.Excel.RibbonTab.insert with String = js.native
  /* "Others" */ val others: typings.officeDashJs.Excel.RibbonTab.others with String = js.native
  /* "PageLayout" */ val pageLayout: typings.officeDashJs.Excel.RibbonTab.pageLayout with String = js.native
  /* "Review" */ val review: typings.officeDashJs.Excel.RibbonTab.review with String = js.native
  /* "View" */ val view: typings.officeDashJs.Excel.RibbonTab.view with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RibbonTab with String] = js.native
}

