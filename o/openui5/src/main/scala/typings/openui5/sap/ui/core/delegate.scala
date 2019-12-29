package typings.openui5.sap.ui.core

import typings.jquery.JQueryStatic
import typings.openui5.sap.m.IconTabBar
import typings.openui5.sap.m.ListGrowingDirection
import typings.openui5.sap.ui.base.EventProvider
import typings.openui5.sap.ui.base.Object
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.delegate")
@js.native
object delegate extends js.Object {
  @js.native
  class ItemNavigation protected () extends EventProvider {
    /**
      * Creates an <code>ItemNavigation</code> delegate that can be attached to controls
      * requiringcapabilities for keyboard navigation between items.
      * @param oDomRef The root DOM reference that includes all items
      * @param aItemDomRefs Array of DOM references representing the items for the navigation
      * @param bNotInTabChain Whether the selected element should be in the tab chain or not
      */
    def this(oDomRef: Element, aItemDomRefs: js.Array[Element]) = this()
    def this(oDomRef: Element, aItemDomRefs: js.Array[Element], bNotInTabChain: Boolean) = this()
    /**
      * Returns disabled modifiersThese modifiers will not be handled by the <code>ItemNavigation</code>
      * @param oDisabledModifiers Object that includes event type with disabled keys as an array
      * @returns Object that includes event type with disabled keys as an array
      */
    def getDisabledModifiers(oDisabledModifiers: js.Any): js.Any = js.native
    /**
      * Returns the array of item DOM references
      * @returns Array of item DOM references
      */
    def getItemDomRefs(): js.Array[Element] = js.native
    /**
      * Returns the root DOM reference surrounding the items
      * @returns Root DOM reference
      */
    def getRootDomRef(): Element = js.native
    /**
      * Check whether given event has disabled modifier or not
      * @param oEvent jQuery event
      * @returns Flag if disabled modifiers are set
      */
    def hasDisabledModifier(oEvent: js.Any): Boolean = js.native
    /**
      * Sets whether the items are displayed in columns.If columns are used, the Arrow Up and Arrow Down
      * keys navigate to the next or previousitem of the column. If the first or last item of the column is
      * reached, the next focuseditem is then in the next or previous column.
      * @param iColumns Count of columns for the table mode or cycling mode
      * @param bNoColumnChange Forbids jumping to an other column with Arrow Up and Arrow Down keys
      * @returns <code>this</code> to allow method chaining
      */
    def setColumns(iColumns: Double, bNoColumnChange: Boolean): ItemNavigation = js.native
    /**
      * Sets whether the <code>ItemNavigation</code> should cycle through the items.If cycling is disabled
      * the navigation stops at the first and last item, if the corresponding arrow keys are used.
      * @param bCycling Set to true if cycling should be done, else false
      * @returns <code>this</code> to allow method chaining
      */
    def setCycling(bCycling: Boolean): ItemNavigation = js.native
    /**
      * Sets the disabled modifiersThese modifiers will not be handled by the
      * <code>ItemNavigation</code><pre>Example: Disable shift + up handling of the
      * <code>ItemNavigation</code>oItemNavigation.setDisabledModifiers({    sapnext : ["shift"]});Possible
      * keys are : "shift", "alt", "ctrl", "meta"Possible events are : "sapnext", "sapprevious", "saphome",
      * "sapend"</pre>
      * @param oDisabledModifiers Object that includes event type with disabled keys as an array
      * @returns <code>this</code> to allow method chaining
      */
    def setDisabledModifiers(oDisabledModifiers: js.Any): ItemNavigation = js.native
    /**
      * Sets behavior of HOME and END keys if columns are used.
      * @param bStayInRow HOME -> go to first item in row; END -> go to last item in row
      * @param bCtrlEnabled HOME/END with CTRL -> go to first/last item of all
      * @returns <code>this</code> to allow method chaining
      */
    def setHomeEndColumnMode(bStayInRow: Boolean, bCtrlEnabled: Boolean): ItemNavigation = js.native
    /**
      * Sets the item DOM references as an array for the items
      * @param aItemDomRefs Array of DOM references representing the items
      * @returns <code>this</code> to allow method chaining
      */
    def setItemDomRefs(aItemDomRefs: js.Array[Element]): ItemNavigation = js.native
    /**
      * Sets the page size of the item navigation to allow Page Up and Page Down keys.
      * @param iPageSize The page size, needs to be at least 1
      * @returns <code>this</code> to allow method chaining
      */
    def setPageSize(iPageSize: Double): ItemNavigation = js.native
    /**
      * Sets the root DOM reference surrounding the items
      * @param oDomRef Root DOM reference
      * @returns <code>this</code> to allow method chaining
      */
    def setRootDomRef(oDomRef: js.Any): ItemNavigation = js.native
    /**
      * Sets the selected index if the used control supports selection.
      * @param iIndex Index of the first selected item
      * @returns <code>this</code> to allow method chaining
      */
    def setSelectedIndex(iIndex: Double): ItemNavigation = js.native
    /**
      * Sets whether the <code>ItemNavigation</code> should use the table mode to navigate throughthe items
      * (navigation in a grid).
      * @param bTableMode Set to true if table mode should be used, else false
      * @param bTableList This sets a different behavior for table mode.In this mode we keep using table
      * navigation but there are some differences. e.g.<ul>	<li>Page-up moves focus to the first row, not to
      * the first cell like in table mode</li>	<li>Page-down moves focus to the last row, not to the last
      * cell like in table mode</li></ul>
      * @returns <code>this</code> to allow method chaining
      */
    def setTableMode(bTableMode: Boolean): ItemNavigation = js.native
    def setTableMode(bTableMode: Boolean, bTableList: Boolean): ItemNavigation = js.native
  }
  
  @js.native
  class ScrollEnablement () extends Object {
    def getChildPosition(vElement: JQueryStatic): js.Any = js.native
    /**
      * Calculates scroll position of a child of a container.
      * @param vElement An element(DOM or jQuery) for which the scroll position will be calculated.
      * @returns Position object.
      */
    def getChildPosition(vElement: HTMLElement): js.Any = js.native
    /**
      * Get current setting for horizontal scrolling.
      * @since 1.9.1
      * @returns true if horizontal scrolling is enabled
      */
    def getHorizontal(): Boolean = js.native
    /**
      * Get current setting for vertical scrolling.
      * @since 1.9.1
      * @returns true if vertical scrolling is enabled
      */
    def getVertical(): Boolean = js.native
    /**
      * Refreshes this Scrolling delegate.
      */
    def refresh(): Unit = js.native
    /**
      * Scrolls to an element within a container.
      * @param oElement A DOM element.
      * @param iTime The duration of animated scrolling in milliseconds. To scroll immediately without
      * animation, give 0 as value.
      */
    def scrollToElement(oElement: HTMLElement): ScrollEnablement = js.native
    def scrollToElement(oElement: HTMLElement, iTime: Double): ScrollEnablement = js.native
    /**
      * Setter for property <code>bounce</code>.
      * @since 1.17
      * @param bBounce new value for property <code>bounce</code>.
      */
    def setBounce(bBounce: Boolean): Unit = js.native
    /**
      * Sets GrowingList control to scroll container
      * @since 1.11.0
      * @param fnScrollLoadCallback Scrolling callback
      * @param sScrollLoadDirection Scrolling directionThis function is supported in iScroll and mouse
      * delegates only.
      */
    def setGrowingList(fnScrollLoadCallback: js.Any, sScrollLoadDirection: ListGrowingDirection): Unit = js.native
    /**
      * Enable or disable horizontal scrolling.
      * @param bHorizontal set true to enable horizontal scrolling, false - to disable
      */
    def setHorizontal(bHorizontal: Boolean): Unit = js.native
    /**
      * Sets IconTabBar control to scroll container
      * @since 1.16.1
      * @param IconTabBar instanceThis function is supported in iScroll only.
      */
    def setIconTabBar(IconTabBar: IconTabBar): Unit = js.native
    /**
      * Set overflow control on top of scroll container.
      * @since 1.9.2
      * @param top control that should be normally hidden overthe top border of the scroll container
      * (pull-down content).This function is supported in iScroll delegates only. In MouseScroll delegates
      * the element is not hidden and should have an appropriate rendering for being always displayed and
      * should have an alternative way for triggering (e.g. a Button).
      */
    def setPullDown(top: Control): Unit = js.native
    /**
      * Enable or disable vertical scrolling.
      * @param bVertical set true to enable vertical scrolling, false - to disable
      */
    def setVertical(bVertical: Boolean): Unit = js.native
  }
  
}

