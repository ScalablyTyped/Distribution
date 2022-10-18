package typings.openui5.sapUiWebcFioriLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FCLLayout extends StObject
@JSImport("sap/ui/webc/fiori/library", "FCLLayout")
@js.native
object FCLLayout extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FCLLayout & String] = js.native
  
  /**
    * Desktop: -/-/100 only the End column is displayed Tablet: -/-/100 only the End column is displayed Phone:
    * -/-/100 only the End column is displayed
    *
    * Use to display a detail-detail page only, when the user should focus entirely on it.
    */
  @js.native
  sealed trait EndColumnFullScreen
    extends StObject
       with FCLLayout
  /* "EndColumnFullScreen" */ val EndColumnFullScreen: typings.openui5.sapUiWebcFioriLibraryMod.FCLLayout.EndColumnFullScreen & String = js.native
  
  /**
    * Desktop: -/100/- only the Mid column is displayed Tablet: -/100/- only the Mid column is displayed Phone:
    * -/100/- only the Mid column is displayed
    *
    * Use to display a detail page only, when the user should focus entirely on it.
    */
  @js.native
  sealed trait MidColumnFullScreen
    extends StObject
       with FCLLayout
  /* "MidColumnFullScreen" */ val MidColumnFullScreen: typings.openui5.sapUiWebcFioriLibraryMod.FCLLayout.MidColumnFullScreen & String = js.native
  
  /**
    * The layout will display 1 column.
    */
  @js.native
  sealed trait OneColumn
    extends StObject
       with FCLLayout
  /* "OneColumn" */ val OneColumn: typings.openui5.sapUiWebcFioriLibraryMod.FCLLayout.OneColumn & String = js.native
  
  /**
    * Desktop: 25/25/50 Start, Mid and End (expanded) columns are displayed Tablet: 0/33/67 Mid and End (expanded)
    * columns are displayed, Start is accessible by layout arrows Phone: -/-/100 (only the End column is displayed)
    *
    * Use to display all three pages (list, detail, detail-detail) when the user should focus on the detail-detail.
    */
  @js.native
  sealed trait ThreeColumnsEndExpanded
    extends StObject
       with FCLLayout
  /* "ThreeColumnsEndExpanded" */ val ThreeColumnsEndExpanded: typings.openui5.sapUiWebcFioriLibraryMod.FCLLayout.ThreeColumnsEndExpanded & String = js.native
  
  /**
    * Desktop: 25/50/25 Start, Mid (expanded) and End columns are displayed Tablet: 0/67/33 Mid (expanded)
    * and End columns are displayed, Start is accessible by a layout arrow Phone: -/-/100 only the End column
    * is displayed
    *
    * Use to display all three pages (list, detail, detail-detail) when the user should focus on the detail.
    */
  @js.native
  sealed trait ThreeColumnsMidExpanded
    extends StObject
       with FCLLayout
  /* "ThreeColumnsMidExpanded" */ val ThreeColumnsMidExpanded: typings.openui5.sapUiWebcFioriLibraryMod.FCLLayout.ThreeColumnsMidExpanded & String = js.native
  
  /**
    * Desktop: 33/67/0 Start and Mid (expanded) columns are displayed, End is accessible by a layout arrow
    * Tablet: 33/67/0 Start and Mid (expanded) columns are displayed, End is accessible by a layout arrow Phone:
    * -/-/100 only the End column is displayed
    *
    * Use to display the list and detail pages when the user should focus on the detail. The detail-detail
    * is still loaded and easily accessible with a layout arrow.
    */
  @js.native
  sealed trait ThreeColumnsMidExpandedEndHidden
    extends StObject
       with FCLLayout
  /* "ThreeColumnsMidExpandedEndHidden" */ val ThreeColumnsMidExpandedEndHidden: typings.openui5.sapUiWebcFioriLibraryMod.FCLLayout.ThreeColumnsMidExpandedEndHidden & String = js.native
  
  /**
    * Desktop: 67/33/0 Start (expanded) and Mid columns are displayed, End is accessible by layout arrows Tablet:
    * 67/33/0 Start (expanded) and Mid columns are displayed, End is accessible by layout arrows Phone: -/-/100
    * only the End column is displayed
    *
    * Use to display the list and detail pages when the user should focus on the list. The detail-detail is
    * still loaded and easily accessible with layout arrows.
    */
  @js.native
  sealed trait ThreeColumnsStartExpandedEndHidden
    extends StObject
       with FCLLayout
  /* "ThreeColumnsStartExpandedEndHidden" */ val ThreeColumnsStartExpandedEndHidden: typings.openui5.sapUiWebcFioriLibraryMod.FCLLayout.ThreeColumnsStartExpandedEndHidden & String = js.native
  
  /**
    * Desktop: 33/67/- Start and Mid (expanded) columns are displayed Tablet: 33/67/- Start and Mid (expanded)
    * columns are displayed Phone: -/100/- only the Mid column is displayed
    *
    * Use to display both a list and a detail page when the user should focus on the detail page.
    */
  @js.native
  sealed trait TwoColumnsMidExpanded
    extends StObject
       with FCLLayout
  /* "TwoColumnsMidExpanded" */ val TwoColumnsMidExpanded: typings.openui5.sapUiWebcFioriLibraryMod.FCLLayout.TwoColumnsMidExpanded & String = js.native
  
  /**
    * Desktop: 67/33/- Start (expanded) and Mid columns are displayed Tablet: 67/33/- Start (expanded) and
    * Mid columns are displayed Phone: -/100/- only the Mid column is displayed
    *
    * Use to display both a list and a detail page when the user should focus on the list page.
    */
  @js.native
  sealed trait TwoColumnsStartExpanded
    extends StObject
       with FCLLayout
  /* "TwoColumnsStartExpanded" */ val TwoColumnsStartExpanded: typings.openui5.sapUiWebcFioriLibraryMod.FCLLayout.TwoColumnsStartExpanded & String = js.native
}
