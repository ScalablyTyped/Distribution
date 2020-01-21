package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RibbonTab with String] = js.native
  /* "AddIns" */ @js.native
  object addIns extends TopLevel[addIns with String]
  
  /* "Data" */ @js.native
  object data extends TopLevel[data with String]
  
  /* "Developer" */ @js.native
  object developer extends TopLevel[developer with String]
  
  /* "Draw" */ @js.native
  object draw extends TopLevel[draw with String]
  
  /* "Formulas" */ @js.native
  object formulas extends TopLevel[formulas with String]
  
  /* "Help" */ @js.native
  object help extends TopLevel[help with String]
  
  /* "Home" */ @js.native
  object home extends TopLevel[home with String]
  
  /* "Insert" */ @js.native
  object insert extends TopLevel[insert with String]
  
  /* "Others" */ @js.native
  object others extends TopLevel[others with String]
  
  /* "PageLayout" */ @js.native
  object pageLayout extends TopLevel[pageLayout with String]
  
  /* "Review" */ @js.native
  object review extends TopLevel[review with String]
  
  /* "View" */ @js.native
  object view extends TopLevel[view with String]
  
}

