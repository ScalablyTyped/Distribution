package typings.openui5.sapUiLayoutLibraryMod

import typings.openui5.sapUiCoreControlMod.default
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssgrid {
  
  @js.native
  sealed trait CSSGridAutoFlow extends StObject
  /**
    * @SINCE 1.60.0
    *
    * A string type that is used for CSS grid to control how the auto-placement algorithm works, specifying
    * exactly how auto-placed items get flowed into the grid.
    * See:
    * 	{@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-flow}
    */
  @JSImport("sap/ui/layout/library", "cssgrid.CSSGridAutoFlow")
  @js.native
  object CSSGridAutoFlow extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CSSGridAutoFlow & String] = js.native
    
    /**
      * Insert auto-placed items by filling each column.
      */
    @js.native
    sealed trait Column
      extends StObject
         with CSSGridAutoFlow
    /* "Column" */ val Column: typings.openui5.sapUiLayoutLibraryMod.cssgrid.CSSGridAutoFlow.Column & String = js.native
    
    /**
      * Insert auto-placed items by filling each column, and fill any holes in the grid.
      */
    @js.native
    sealed trait ColumnDense
      extends StObject
         with CSSGridAutoFlow
    /* "ColumnDense" */ val ColumnDense: typings.openui5.sapUiLayoutLibraryMod.cssgrid.CSSGridAutoFlow.ColumnDense & String = js.native
    
    /**
      * Insert auto-placed items by filling each row.
      */
    @js.native
    sealed trait Row
      extends StObject
         with CSSGridAutoFlow
    /* "Row" */ val Row: typings.openui5.sapUiLayoutLibraryMod.cssgrid.CSSGridAutoFlow.Row & String = js.native
    
    /**
      * Insert auto-placed items by filling each row, and fill any holes in the grid.
      */
    @js.native
    sealed trait RowDense
      extends StObject
         with CSSGridAutoFlow
    /* "RowDense" */ val RowDense: typings.openui5.sapUiLayoutLibraryMod.cssgrid.CSSGridAutoFlow.RowDense & String = js.native
  }
  
  /**
    * @SINCE 1.60.0
    *
    * A string type that represents a short hand CSS grid gap.
    * See:
    * 	{@link https://developer.mozilla.org/en-US/docs/Web/CSS/gap}
    */
  type CSSGridGapShortHand = String
  
  /**
    * @SINCE 1.60.0
    *
    * A string type that represents one or two grid lines. Used to define the position and size of a single
    * grid item.
    *
    * Valid values:
    * 	 - auto
    * 	 - inherit
    * 	 - 1
    * 	 - span 2
    * 	 - span 2 / 5
    * 	 - span 2 / -5
    * 	 - 5 / 7
    * 	 - 7 / span 5
    * 	 - span 7 / span 5
    * See:
    * 	{@link https://developer.mozilla.org/en-US/docs/Glossary/Grid_lines MDN web docs: grid lines}
    */
  type CSSGridLine = String
  
  /**
    * @SINCE 1.60.0
    *
    * A string type that represents a grid track (the space between two grid lines)
    * See:
    * 	{@link https://developer.mozilla.org/en-US/docs/Glossary/Grid_tracks}
    */
  type CSSGridTrack = String
  
  /**
    * @SINCE 1.60.0
    *
    * Defines the functions that need to be implemented by a Control which wants to have display:grid behavior
    * via sap.ui.layout.cssgrid.GridLayoutDelegate
    */
  trait IGridConfigurable extends StObject {
    
    var __implements__sap_ui_layout_cssgrid_IGridConfigurable: Boolean
    
    /**
      * @SINCE 1.60.0
      *
      * The function is used by GridLayoutDelegate to determine on which HTML Elements the display:grid styles
      * should be applied
      *
      * @returns The controls or HTML elements on which display:grid styles should be applied
      */
    def getGridDomRefs(): js.Array[HTMLElement | default]
    
    /**
      * @SINCE 1.60.0
      *
      * The function is used by GridLayoutDelegate to get the grid layout (display:grid styles) to apply
      *
      * @returns The display:grid layout to apply
      */
    def getGridLayoutConfiguration(): typings.openui5.sapUiLayoutCssgridGridLayoutBaseMod.default
  }
  object IGridConfigurable {
    
    inline def apply(
      __implements__sap_ui_layout_cssgrid_IGridConfigurable: Boolean,
      getGridDomRefs: () => js.Array[HTMLElement | default],
      getGridLayoutConfiguration: () => typings.openui5.sapUiLayoutCssgridGridLayoutBaseMod.default
    ): IGridConfigurable = {
      val __obj = js.Dynamic.literal(__implements__sap_ui_layout_cssgrid_IGridConfigurable = __implements__sap_ui_layout_cssgrid_IGridConfigurable.asInstanceOf[js.Any], getGridDomRefs = js.Any.fromFunction0(getGridDomRefs), getGridLayoutConfiguration = js.Any.fromFunction0(getGridLayoutConfiguration))
      __obj.asInstanceOf[IGridConfigurable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGridConfigurable] (val x: Self) extends AnyVal {
      
      inline def setGetGridDomRefs(value: () => js.Array[HTMLElement | default]): Self = StObject.set(x, "getGridDomRefs", js.Any.fromFunction0(value))
      
      inline def setGetGridLayoutConfiguration(value: () => typings.openui5.sapUiLayoutCssgridGridLayoutBaseMod.default): Self = StObject.set(x, "getGridLayoutConfiguration", js.Any.fromFunction0(value))
      
      inline def set__implements__sap_ui_layout_cssgrid_IGridConfigurable(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_layout_cssgrid_IGridConfigurable", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @SINCE 1.88.0
    *
    * LayoutData for grid items
    */
  trait IGridItemLayoutData extends StObject {
    
    var __implements__sap_ui_layout_cssgrid_IGridItemLayoutData: Boolean
  }
  object IGridItemLayoutData {
    
    inline def apply(__implements__sap_ui_layout_cssgrid_IGridItemLayoutData: Boolean): IGridItemLayoutData = {
      val __obj = js.Dynamic.literal(__implements__sap_ui_layout_cssgrid_IGridItemLayoutData = __implements__sap_ui_layout_cssgrid_IGridItemLayoutData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGridItemLayoutData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGridItemLayoutData] (val x: Self) extends AnyVal {
      
      inline def set__implements__sap_ui_layout_cssgrid_IGridItemLayoutData(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_layout_cssgrid_IGridItemLayoutData", value.asInstanceOf[js.Any])
    }
  }
}
