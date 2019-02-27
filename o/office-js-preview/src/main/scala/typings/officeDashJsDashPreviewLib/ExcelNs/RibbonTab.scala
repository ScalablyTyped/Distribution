package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RibbonTab extends js.Object

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.RibbonTab")
@js.native
object RibbonTab extends js.Object {
  @js.native
  sealed trait addIns
    extends officeDashJsDashPreviewLib.ExcelNs.RibbonTab
  
  @js.native
  sealed trait data
    extends officeDashJsDashPreviewLib.ExcelNs.RibbonTab
  
  @js.native
  sealed trait developer
    extends officeDashJsDashPreviewLib.ExcelNs.RibbonTab
  
  @js.native
  sealed trait draw
    extends officeDashJsDashPreviewLib.ExcelNs.RibbonTab
  
  @js.native
  sealed trait formulas
    extends officeDashJsDashPreviewLib.ExcelNs.RibbonTab
  
  @js.native
  sealed trait help
    extends officeDashJsDashPreviewLib.ExcelNs.RibbonTab
  
  @js.native
  sealed trait home
    extends officeDashJsDashPreviewLib.ExcelNs.RibbonTab
  
  @js.native
  sealed trait insert
    extends officeDashJsDashPreviewLib.ExcelNs.RibbonTab
  
  @js.native
  sealed trait others
    extends officeDashJsDashPreviewLib.ExcelNs.RibbonTab
  
  @js.native
  sealed trait pageLayout
    extends officeDashJsDashPreviewLib.ExcelNs.RibbonTab
  
  @js.native
  sealed trait review
    extends officeDashJsDashPreviewLib.ExcelNs.RibbonTab
  
  @js.native
  sealed trait view
    extends officeDashJsDashPreviewLib.ExcelNs.RibbonTab
  
  /* "AddIns" */ val addIns: addIns with java.lang.String = js.native
  /* "Data" */ val data: data with java.lang.String = js.native
  /* "Developer" */ val developer: developer with java.lang.String = js.native
  /* "Draw" */ val draw: draw with java.lang.String = js.native
  /* "Formulas" */ val formulas: formulas with java.lang.String = js.native
  /* "Help" */ val help: help with java.lang.String = js.native
  /* "Home" */ val home: home with java.lang.String = js.native
  /* "Insert" */ val insert: insert with java.lang.String = js.native
  /* "Others" */ val others: others with java.lang.String = js.native
  /* "PageLayout" */ val pageLayout: pageLayout with java.lang.String = js.native
  /* "Review" */ val review: review with java.lang.String = js.native
  /* "View" */ val view: view with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.RibbonTab with java.lang.String] = js.native
}

