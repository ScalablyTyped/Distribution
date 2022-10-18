package typings.openui5.sapFLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LayoutType extends StObject
@JSImport("sap/f/library", "LayoutType")
@js.native
object LayoutType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LayoutType & String] = js.native
  
  /**
    * Desktop: -/-/100 only the End column is displayed
    *
    * Tablet: -/-/100 only the End column is displayed
    *
    * Phone: -/-/100 only the End column is displayed
    *
    * Use to display a detail-detail page only, when the user should focus entirely on it.
    */
  @js.native
  sealed trait EndColumnFullScreen
    extends StObject
       with LayoutType
  /* "EndColumnFullScreen" */ val EndColumnFullScreen: typings.openui5.sapFLibraryMod.LayoutType.EndColumnFullScreen & String = js.native
  
  /**
    * Desktop: -/100/- only the Mid column is displayed
    *
    * Tablet: -/100/- only the Mid column is displayed
    *
    * Phone: -/100/- only the Mid column is displayed
    *
    * Use to display a detail page only, when the user should focus entirely on it.
    */
  @js.native
  sealed trait MidColumnFullScreen
    extends StObject
       with LayoutType
  /* "MidColumnFullScreen" */ val MidColumnFullScreen: typings.openui5.sapFLibraryMod.LayoutType.MidColumnFullScreen & String = js.native
  
  /**
    * Desktop: 100/-/- only the Begin column is displayed
    *
    * Tablet: 100/-/- only the Begin column is displayed
    *
    * Phone: 100/-/- only the Begin column is displayed
    *
    * Use to start with a master page.
    */
  @js.native
  sealed trait OneColumn
    extends StObject
       with LayoutType
  /* "OneColumn" */ val OneColumn: typings.openui5.sapFLibraryMod.LayoutType.OneColumn & String = js.native
  
  /**
    * Desktop: 67/33/0 Begin (expanded) and Mid columns are displayed, End is accessible by layout arrows
    *
    * Tablet: 67/33/0 Begin (expanded) and Mid columns are displayed, End is accessible by layout arrows
    *
    * Phone: -/-/100 only the End column is displayed
    *
    * Use to display the master and detail pages when the user should focus on the master. The detail-detail
    * is still loaded and easily accessible with layout arrows.
    */
  @js.native
  sealed trait ThreeColumnsBeginExpandedEndHidden
    extends StObject
       with LayoutType
  /* "ThreeColumnsBeginExpandedEndHidden" */ val ThreeColumnsBeginExpandedEndHidden: typings.openui5.sapFLibraryMod.LayoutType.ThreeColumnsBeginExpandedEndHidden & String = js.native
  
  /**
    * Desktop: 25/25/50 Begin, Mid and End (expanded) columns are displayed
    *
    * Tablet: 0/33/67 Mid and End (expanded) columns are displayed, Begin is accessible by layout arrows
    *
    * Phone: -/-/100 (only the End column is displayed)
    *
    * Use to display all three pages (master, detail, detail-detail) when the user should focus on the detail-detail.
    */
  @js.native
  sealed trait ThreeColumnsEndExpanded
    extends StObject
       with LayoutType
  /* "ThreeColumnsEndExpanded" */ val ThreeColumnsEndExpanded: typings.openui5.sapFLibraryMod.LayoutType.ThreeColumnsEndExpanded & String = js.native
  
  /**
    * Desktop: 25/50/25 Begin, Mid (expanded) and End columns are displayed
    *
    * Tablet: 0/67/33 Mid (expanded) and End columns are displayed, Begin is accessible by a layout arrow
    *
    * Phone: -/-/100 only the End column is displayed
    *
    * Use to display all three pages (master, detail, detail-detail) when the user should focus on the detail.
    */
  @js.native
  sealed trait ThreeColumnsMidExpanded
    extends StObject
       with LayoutType
  /* "ThreeColumnsMidExpanded" */ val ThreeColumnsMidExpanded: typings.openui5.sapFLibraryMod.LayoutType.ThreeColumnsMidExpanded & String = js.native
  
  /**
    * Desktop: 33/67/0 Begin and Mid (expanded) columns are displayed, End is accessible by a layout arrow
    *
    * Tablet: 33/67/0 Begin and Mid (expanded) columns are displayed, End is accessible by a layout arrow
    *
    * Phone: -/-/100 only the End column is displayed
    *
    * Use to display the master and detail pages when the user should focus on the detail. The detail-detail
    * is still loaded and easily accessible with a layout arrow.
    */
  @js.native
  sealed trait ThreeColumnsMidExpandedEndHidden
    extends StObject
       with LayoutType
  /* "ThreeColumnsMidExpandedEndHidden" */ val ThreeColumnsMidExpandedEndHidden: typings.openui5.sapFLibraryMod.LayoutType.ThreeColumnsMidExpandedEndHidden & String = js.native
  
  /**
    * Desktop: 67/33/- Begin (expanded) and Mid columns are displayed
    *
    * Tablet: 67/33/- Begin (expanded) and Mid columns are displayed
    *
    * Phone: -/100/- only the Mid column is displayed
    *
    * Use to display both a master and a detail page when the user should focus on the master page.
    */
  @js.native
  sealed trait TwoColumnsBeginExpanded
    extends StObject
       with LayoutType
  /* "TwoColumnsBeginExpanded" */ val TwoColumnsBeginExpanded: typings.openui5.sapFLibraryMod.LayoutType.TwoColumnsBeginExpanded & String = js.native
  
  /**
    * Desktop: 33/67/- Begin and Mid (expanded) columns are displayed
    *
    * Tablet: 33/67/- Begin and Mid (expanded) columns are displayed
    *
    * Phone: -/100/- only the Mid column is displayed
    *
    * Use to display both a master and a detail page when the user should focus on the detail page.
    */
  @js.native
  sealed trait TwoColumnsMidExpanded
    extends StObject
       with LayoutType
  /* "TwoColumnsMidExpanded" */ val TwoColumnsMidExpanded: typings.openui5.sapFLibraryMod.LayoutType.TwoColumnsMidExpanded & String = js.native
}
