package typings
package openui5Lib.sapNs.uiNs.coreNs.delegateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.delegate.ItemNavigation")
@js.native
class ItemNavigation protected ()
  extends openui5Lib.sapNs.uiNs.baseNs.EventProvider {
  /**
             * Creates an <code>ItemNavigation</code> delegate that can be attached to controls
             * requiringcapabilities for keyboard navigation between items.
             * @param oDomRef The root DOM reference that includes all items
             * @param aItemDomRefs Array of DOM references representing the items for the navigation
             * @param bNotInTabChain Whether the selected element should be in the tab chain or not
            */
  def this(oDomRef: openui5Lib.sapNs.uiNs.coreNs.Element, aItemDomRefs: js.Array[openui5Lib.sapNs.uiNs.coreNs.Element]) = this()
  /**
             * Creates an <code>ItemNavigation</code> delegate that can be attached to controls
             * requiringcapabilities for keyboard navigation between items.
             * @param oDomRef The root DOM reference that includes all items
             * @param aItemDomRefs Array of DOM references representing the items for the navigation
             * @param bNotInTabChain Whether the selected element should be in the tab chain or not
            */
  def this(oDomRef: openui5Lib.sapNs.uiNs.coreNs.Element, aItemDomRefs: js.Array[openui5Lib.sapNs.uiNs.coreNs.Element], bNotInTabChain: scala.Boolean) = this()
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
  def getItemDomRefs(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Element] = js.native
  /**
             * Returns the root DOM reference surrounding the items
             * @returns Root DOM reference
            */
  def getRootDomRef(): openui5Lib.sapNs.uiNs.coreNs.Element = js.native
  /**
             * Check whether given event has disabled modifier or not
             * @param oEvent jQuery event
             * @returns Flag if disabled modifiers are set
            */
  def hasDisabledModifier(oEvent: js.Any): scala.Boolean = js.native
  /**
             * Sets whether the items are displayed in columns.If columns are used, the Arrow Up and Arrow Down
             * keys navigate to the next or previousitem of the column. If the first or last item of the column is
             * reached, the next focuseditem is then in the next or previous column.
             * @param iColumns Count of columns for the table mode or cycling mode
             * @param bNoColumnChange Forbids jumping to an other column with Arrow Up and Arrow Down keys
             * @returns <code>this</code> to allow method chaining
            */
  def setColumns(iColumns: scala.Double, bNoColumnChange: scala.Boolean): ItemNavigation = js.native
  /**
             * Sets whether the <code>ItemNavigation</code> should cycle through the items.If cycling is disabled
             * the navigation stops at the first and last item, if the corresponding arrow keys are used.
             * @param bCycling Set to true if cycling should be done, else false
             * @returns <code>this</code> to allow method chaining
            */
  def setCycling(bCycling: scala.Boolean): ItemNavigation = js.native
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
  def setHomeEndColumnMode(bStayInRow: scala.Boolean, bCtrlEnabled: scala.Boolean): ItemNavigation = js.native
  /**
             * Sets the item DOM references as an array for the items
             * @param aItemDomRefs Array of DOM references representing the items
             * @returns <code>this</code> to allow method chaining
            */
  def setItemDomRefs(aItemDomRefs: js.Array[openui5Lib.sapNs.uiNs.coreNs.Element]): ItemNavigation = js.native
  /**
             * Sets the page size of the item navigation to allow Page Up and Page Down keys.
             * @param iPageSize The page size, needs to be at least 1
             * @returns <code>this</code> to allow method chaining
            */
  def setPageSize(iPageSize: scala.Double): ItemNavigation = js.native
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
  def setSelectedIndex(iIndex: scala.Double): ItemNavigation = js.native
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
  def setTableMode(bTableMode: scala.Boolean): ItemNavigation = js.native
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
  def setTableMode(bTableMode: scala.Boolean, bTableList: scala.Boolean): ItemNavigation = js.native
}

