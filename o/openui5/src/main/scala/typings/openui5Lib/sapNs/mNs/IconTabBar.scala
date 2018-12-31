package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.IconTabBar")
@js.native
class IconTabBar protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new IconTabBar.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds some content to the aggregation <code>content</code>.
    * @param oContent the content to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control): IconTabBar = js.native
  /**
    * Adds some item to the aggregation <code>items</code>.
    * @param oItem the item to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addItem(oItem: IconTab): IconTabBar = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>expand</code> event of this
    * <code>sap.m.IconTabBar</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.IconTabBar</code> itself.Indicates that the tab will expand or collapse.
    * @since 1.15.0
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.IconTabBar</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachExpand(oData: js.Any, fnFunction: js.Any): IconTabBar = js.native
  def attachExpand(oData: js.Any, fnFunction: js.Any, oListener: js.Any): IconTabBar = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>select</code> event of this
    * <code>sap.m.IconTabBar</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.IconTabBar</code> itself.Fires when an item is selected.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.IconTabBar</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSelect(oData: js.Any, fnFunction: js.Any): IconTabBar = js.native
  def attachSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): IconTabBar = js.native
  /**
    * Destroys all the content in the aggregation <code>content</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContent(): IconTabBar = js.native
  /**
    * Destroys all the items in the aggregation <code>items</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyItems(): IconTabBar = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>expand</code> event of this
    * <code>sap.m.IconTabBar</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @since 1.15.0
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachExpand(fnFunction: js.Any, oListener: js.Any): IconTabBar = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>select</code> event of this
    * <code>sap.m.IconTabBar</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSelect(fnFunction: js.Any, oListener: js.Any): IconTabBar = js.native
  /**
    * Fires event <code>expand</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>expand</code> of type <code>boolean</code>If the tab will expand, this is
    * true.</li><li><code>collapse</code> of type <code>boolean</code>If the tab will collapse, this is
    * true.</li></ul>
    * @since 1.15.0
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireExpand(mArguments: js.Any): IconTabBar = js.native
  /**
    * Fires event <code>select</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>item</code> of type <code>sap.m.IconTabFilter</code>The selected
    * item</li><li><code>key</code> of type <code>string</code>The key of the selected
    * item</li><li><code>selectedItem</code> of type <code>sap.m.IconTabFilter</code>The selected
    * item</li><li><code>selectedKey</code> of type <code>string</code>The key of the selected
    * item</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSelect(mArguments: js.Any): IconTabBar = js.native
  /**
    * Gets current value of property <code>applyContentPadding</code>.Determines whether the IconTabBar
    * content fits to the full area.The paddings are removed if it's set to false.Default value is
    * <code>true</code>.
    * @since 1.26
    * @returns Value of property <code>applyContentPadding</code>
    */
  def getApplyContentPadding(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>backgroundDesign</code>.Specifies the background color of the
    * IconTabBar.Depending on the theme, you can change the state ofthe background color to "Solid",
    * "Translucent", or "Transparent".Default value is <code>Solid</code>.
    * @since 1.26
    * @returns Value of property <code>backgroundDesign</code>
    */
  def getBackgroundDesign(): BackgroundDesign = js.native
  /**
    * Gets content of aggregation <code>content</code>.Represents the contents displayed below the
    * IconTabBar.If there are multiple contents, they are rendered after each other.The developer has to
    * manage to display the right one or use the content aggregationinside the IconTabFilter (which will
    * be displayed instead if it is set).
    */
  def getContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
    * Gets current value of property <code>expandable</code>.Defines if the tabs are collapsible and
    * expandable.Default value is <code>true</code>.
    * @since 1.15.0
    * @returns Value of property <code>expandable</code>
    */
  def getExpandable(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>expanded</code>.Indicates if the actual tab content is expanded
    * or not.Default value is <code>true</code>.
    * @since 1.15.0
    * @returns Value of property <code>expanded</code>
    */
  def getExpanded(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>headerMode</code>.Specifies the header mode.<b>Note:</b> The
    * Inline mode works only if no icons are set.Default value is <code>Standard</code>.
    * @since 1.40
    * @returns Value of property <code>headerMode</code>
    */
  def getHeaderMode(): IconTabHeaderMode = js.native
  /**
    * Gets content of aggregation <code>items</code>.The items displayed in the IconTabBar.
    */
  def getItems(): js.Array[IconTab] = js.native
  /**
    * Reflector for the internal header's selectedKey property.
    * @returns The current property value
    */
  def getSelectedKey(): java.lang.String = js.native
  /**
    * Gets current value of property <code>showSelection</code>.Defines whether the current selection
    * should be visualized.Default value is <code>true</code>.
    * @returns Value of property <code>showSelection</code>
    */
  def getShowSelection(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>stretchContentHeight</code>.Determines whether the IconTabBar
    * height is stretched to the maximum possible heightof its parent container. As a prerequisite, the
    * height of the parent container must bedefined as a fixed value.Default value is <code>false</code>.
    * @since 1.26
    * @returns Value of property <code>stretchContentHeight</code>
    */
  def getStretchContentHeight(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>upperCase</code>.Determines whether the text of the icon tab
    * filter (not the count) is displayed in uppercase.Default value is <code>false</code>.
    * @since 1.22
    * @returns Value of property <code>upperCase</code>
    */
  def getUpperCase(): scala.Boolean = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>content</code>.and
    * returns its index if found or -1 otherwise.
    * @param oContent The content whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Double = js.native
  /**
    * Checks for the provided <code>sap.m.IconTab</code> in the aggregation <code>items</code>.and returns
    * its index if found or -1 otherwise.
    * @param oItem The item whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfItem(oItem: IconTab): scala.Double = js.native
  /**
    * Inserts a content into the aggregation <code>content</code>.
    * @param oContent the content to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
    * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
    *  greater than the current size of the aggregation, the content is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control, iIndex: scala.Double): IconTabBar = js.native
  /**
    * Inserts a item into the aggregation <code>items</code>.
    * @param oItem the item to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the item should be inserted at; for             a
    * negative value of <code>iIndex</code>, the item is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the item is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertItem(oItem: IconTab, iIndex: scala.Double): IconTabBar = js.native
  /**
    * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
    * Removes all the controls from the aggregation <code>items</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllItems(): js.Array[IconTab] = js.native
  def removeContent(vContent: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  def removeContent(vContent: openui5Lib.sapNs.uiNs.coreNs.Control): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Removes a content from the aggregation <code>content</code>.
    * @param vContent The content to remove or its index or id
    * @returns The removed content or <code>null</code>
    */
  def removeContent(vContent: scala.Double): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  def removeItem(vItem: java.lang.String): IconTab = js.native
  def removeItem(vItem: IconTab): IconTab = js.native
  /**
    * Removes a item from the aggregation <code>items</code>.
    * @param vItem The item to remove or its index or id
    * @returns The removed item or <code>null</code>
    */
  def removeItem(vItem: scala.Double): IconTab = js.native
  /**
    * Sets a new value for property <code>applyContentPadding</code>.Determines whether the IconTabBar
    * content fits to the full area.The paddings are removed if it's set to false.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @since 1.26
    * @param bApplyContentPadding New value for property <code>applyContentPadding</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setApplyContentPadding(bApplyContentPadding: scala.Boolean): IconTabBar = js.native
  /**
    * Sets a new value for property <code>backgroundDesign</code>.Specifies the background color of the
    * IconTabBar.Depending on the theme, you can change the state ofthe background color to "Solid",
    * "Translucent", or "Transparent".When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Solid</code>.
    * @since 1.26
    * @param sBackgroundDesign New value for property <code>backgroundDesign</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundDesign(sBackgroundDesign: BackgroundDesign): IconTabBar = js.native
  /**
    * Sets the tabs as collapsible and expandable without re-rendering the control.
    * @param bExpandable new parameter value
    * @returns this pointer for chaining
    */
  def setExpandable(bExpandable: scala.Boolean): IconTabBar = js.native
  /**
    * Sets the tab content as expanded.
    * @param bExpanded new parameter value
    * @returns this pointer for chaining
    */
  def setExpanded(bExpanded: scala.Boolean): IconTabBar = js.native
  /**
    * Sets the header mode.
    * @param mode new parameter value
    * @returns this pointer for chaining
    */
  def setHeaderMode(mode: IconTabHeaderMode): IconTabBar = js.native
  /**
    * Reflector for the internal header's selectedKey property.
    * @param sValue the new value
    * @returns this pointer for chaining
    */
  def setSelectedKey(sValue: java.lang.String): IconTabBar = js.native
  /**
    * Sets a new value for property <code>showSelection</code>.Defines whether the current selection
    * should be visualized.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>true</code>.
    * @param bShowSelection New value for property <code>showSelection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowSelection(bShowSelection: scala.Boolean): IconTabBar = js.native
  /**
    * Sets a new value for property <code>stretchContentHeight</code>.Determines whether the IconTabBar
    * height is stretched to the maximum possible heightof its parent container. As a prerequisite, the
    * height of the parent container must bedefined as a fixed value.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @since 1.26
    * @param bStretchContentHeight New value for property <code>stretchContentHeight</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setStretchContentHeight(bStretchContentHeight: scala.Boolean): IconTabBar = js.native
  /**
    * Sets a new value for property <code>upperCase</code>.Determines whether the text of the icon tab
    * filter (not the count) is displayed in uppercase.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @since 1.22
    * @param bUpperCase New value for property <code>upperCase</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setUpperCase(bUpperCase: scala.Boolean): IconTabBar = js.native
}

