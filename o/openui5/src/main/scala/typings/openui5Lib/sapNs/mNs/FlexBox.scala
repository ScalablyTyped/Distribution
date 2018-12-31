package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.FlexBox")
@js.native
class FlexBox protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new <code>sap.m.FlexBox</code>.Accepts an object literal <code>mSettings</code>
    * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds some item to the aggregation <code>items</code>.
    * @param oItem the item to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addItem(oItem: openui5Lib.sapNs.uiNs.coreNs.Control): FlexBox = js.native
  /**
    * Destroys all the items in the aggregation <code>items</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyItems(): FlexBox = js.native
  /**
    * Gets current value of property <code>alignContent</code>.Determines the layout behavior of container
    * lines when there's extra space along the cross-axis. This property has no effect in Internet
    * Explorer 10.Default value is <code>Stretch</code>.
    * @since 1.36.0
    * @returns Value of property <code>alignContent</code>
    */
  def getAlignContent(): FlexAlignContent = js.native
  /**
    * Gets current value of property <code>alignItems</code>.Determines the layout behavior of items along
    * the cross-axis. "Baseline" is not supported in Internet Explorer 10.Default value is
    * <code>Stretch</code>.
    * @returns Value of property <code>alignItems</code>
    */
  def getAlignItems(): FlexAlignItems = js.native
  /**
    * Gets current value of property <code>backgroundDesign</code>.Defines the background style of the
    * <code>sap.m.FlexBox</code>.Default value is <code>Transparent</code>.
    * @since 1.38.5
    * @returns Value of property <code>backgroundDesign</code>
    */
  def getBackgroundDesign(): BackgroundDesign = js.native
  /**
    * Gets current value of property <code>direction</code>.Determines the direction of the layout of
    * child elements.Default value is <code>Row</code>.
    * @returns Value of property <code>direction</code>
    */
  def getDirection(): FlexDirection = js.native
  /**
    * Gets current value of property <code>displayInline</code>.Determines whether the
    * <code>sap.m.FlexBox</code> is in block or inline mode.Default value is <code>false</code>.
    * @returns Value of property <code>displayInline</code>
    */
  def getDisplayInline(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>fitContainer</code>.Determines whether the
    * <code>sap.m.FlexBox</code> will be sized to completely fill its container. If the
    * <code>sap.m.FlexBox</code> is inserted into a Page, the property 'enableScrolling' of the Page needs
    * to be set to 'false' for the FlexBox to fit the entire viewport.Default value is <code>false</code>.
    * @returns Value of property <code>fitContainer</code>
    */
  def getFitContainer(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>height</code>.The height of the <code>sap.m.FlexBox</code>.
    * Note that when a percentage is given, for the height to work as expected, the height of the
    * surrounding container must be defined.Default value is <code></code>.
    * @since 1.9.1
    * @returns Value of property <code>height</code>
    */
  def getHeight(): js.Any = js.native
  /**
    * Gets content of aggregation <code>items</code>.Flex items within the flexible box layout
    */
  def getItems(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
    * Gets current value of property <code>justifyContent</code>.Determines the layout behavior along the
    * main axis.Default value is <code>Start</code>.
    * @returns Value of property <code>justifyContent</code>
    */
  def getJustifyContent(): FlexJustifyContent = js.native
  /**
    * Gets current value of property <code>renderType</code>.Determines whether the layout is rendered as
    * a series of divs or as an unordered list (ul)Default value is <code>Div</code>.
    * @returns Value of property <code>renderType</code>
    */
  def getRenderType(): FlexRendertype = js.native
  /**
    * Gets current value of property <code>width</code>.The width of the <code>sap.m.FlexBox</code>. Note
    * that when a percentage is given, for the width to work as expected, the width of the surrounding
    * container must be defined.Default value is <code></code>.
    * @since 1.9.1
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Gets current value of property <code>wrap</code>.Determines the wrapping behavior of the flex
    * container. This property has no effect in older browsers, e.g. Android Native 4.3 and below.Default
    * value is <code>NoWrap</code>.
    * @since 1.36.0
    * @returns Value of property <code>wrap</code>
    */
  def getWrap(): FlexWrap = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>items</code>.and
    * returns its index if found or -1 otherwise.
    * @param oItem The item whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfItem(oItem: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Double = js.native
  /**
    * Inserts a item into the aggregation <code>items</code>.
    * @param oItem the item to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the item should be inserted at; for             a
    * negative value of <code>iIndex</code>, the item is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the item is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertItem(oItem: openui5Lib.sapNs.uiNs.coreNs.Control, iIndex: scala.Double): FlexBox = js.native
  /**
    * Removes all the controls from the aggregation <code>items</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllItems(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def removeItem(vItem: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  def removeItem(vItem: openui5Lib.sapNs.uiNs.coreNs.Control): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Removes a item from the aggregation <code>items</code>.
    * @param vItem The item to remove or its index or id
    * @returns The removed item or <code>null</code>
    */
  def removeItem(vItem: scala.Double): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Sets a new value for property <code>alignContent</code>.Determines the layout behavior of container
    * lines when there's extra space along the cross-axis. This property has no effect in Internet
    * Explorer 10.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>Stretch</code>.
    * @since 1.36.0
    * @param sAlignContent New value for property <code>alignContent</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAlignContent(sAlignContent: FlexAlignContent): FlexBox = js.native
  /**
    * Sets a new value for property <code>alignItems</code>.Determines the layout behavior of items along
    * the cross-axis. "Baseline" is not supported in Internet Explorer 10.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>Stretch</code>.
    * @param sAlignItems New value for property <code>alignItems</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAlignItems(sAlignItems: FlexAlignItems): FlexBox = js.native
  /**
    * Sets a new value for property <code>backgroundDesign</code>.Defines the background style of the
    * <code>sap.m.FlexBox</code>.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>Transparent</code>.
    * @since 1.38.5
    * @param sBackgroundDesign New value for property <code>backgroundDesign</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundDesign(sBackgroundDesign: BackgroundDesign): FlexBox = js.native
  /**
    * Sets a new value for property <code>direction</code>.Determines the direction of the layout of child
    * elements.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>Row</code>.
    * @param sDirection New value for property <code>direction</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDirection(sDirection: FlexDirection): FlexBox = js.native
  /**
    * Sets a new value for property <code>displayInline</code>.Determines whether the
    * <code>sap.m.FlexBox</code> is in block or inline mode.When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @param bDisplayInline New value for property <code>displayInline</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDisplayInline(bDisplayInline: scala.Boolean): FlexBox = js.native
  /**
    * Sets a new value for property <code>fitContainer</code>.Determines whether the
    * <code>sap.m.FlexBox</code> will be sized to completely fill its container. If the
    * <code>sap.m.FlexBox</code> is inserted into a Page, the property 'enableScrolling' of the Page needs
    * to be set to 'false' for the FlexBox to fit the entire viewport.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @param bFitContainer New value for property <code>fitContainer</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFitContainer(bFitContainer: scala.Boolean): FlexBox = js.native
  /**
    * Sets a new value for property <code>height</code>.The height of the <code>sap.m.FlexBox</code>. Note
    * that when a percentage is given, for the height to work as expected, the height of the surrounding
    * container must be defined.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code></code>.
    * @since 1.9.1
    * @param sHeight New value for property <code>height</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeight(sHeight: js.Any): FlexBox = js.native
  /**
    * Sets a new value for property <code>justifyContent</code>.Determines the layout behavior along the
    * main axis.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>Start</code>.
    * @param sJustifyContent New value for property <code>justifyContent</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setJustifyContent(sJustifyContent: FlexJustifyContent): FlexBox = js.native
  /**
    * Sets a new value for property <code>renderType</code>.Determines whether the layout is rendered as a
    * series of divs or as an unordered list (ul)When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Div</code>.
    * @param sRenderType New value for property <code>renderType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setRenderType(sRenderType: FlexRendertype): FlexBox = js.native
  /**
    * Sets a new value for property <code>width</code>.The width of the <code>sap.m.FlexBox</code>. Note
    * that when a percentage is given, for the width to work as expected, the width of the surrounding
    * container must be defined.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code></code>.
    * @since 1.9.1
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): FlexBox = js.native
  /**
    * Sets a new value for property <code>wrap</code>.Determines the wrapping behavior of the flex
    * container. This property has no effect in older browsers, e.g. Android Native 4.3 and below.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>NoWrap</code>.
    * @since 1.36.0
    * @param sWrap New value for property <code>wrap</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWrap(sWrap: FlexWrap): FlexBox = js.native
}

