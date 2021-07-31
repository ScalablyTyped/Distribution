package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Panel
  extends StObject
     with Control {
  
  /**
    * Adds some content to the aggregation <code>content</code>.
    * @param oContent the content to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContent(oContent: Control): Panel = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>expand</code> event of this
    * <code>sap.m.Panel</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Panel</code> itself.Indicates that the panel will expand or collapse
    * @since 1.22
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Panel</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachExpand(oData: js.Any, fnFunction: js.Any): Panel = js.native
  def attachExpand(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Panel = js.native
  
  /**
    * Destroys all the content in the aggregation <code>content</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContent(): Panel = js.native
  
  /**
    * Destroys the headerToolbar in the aggregation <code>headerToolbar</code>.
    * @since 1.16
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyHeaderToolbar(): Panel = js.native
  
  /**
    * Destroys the infoToolbar in the aggregation <code>infoToolbar</code>.
    * @since 1.16
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyInfoToolbar(): Panel = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>expand</code> event of this
    * <code>sap.m.Panel</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @since 1.22
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachExpand(fnFunction: js.Any, oListener: js.Any): Panel = js.native
  
  /**
    * Fires event <code>expand</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>expand</code> of type <code>boolean</code>If the panel will expand, this is
    * true.If the panel will collapse, this is false.</li></ul>
    * @since 1.22
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireExpand(mArguments: js.Any): Panel = js.native
  
  /**
    * Gets current value of property <code>backgroundDesign</code>.This property is used to set the
    * background color of the Panel.Depending on the theme you can change the state of the background from
    * "Solid" over "Translucent" to "Transparent".Default value is <code>Translucent</code>.
    * @since 1.30
    * @returns Value of property <code>backgroundDesign</code>
    */
  def getBackgroundDesign(): BackgroundDesign = js.native
  
  /**
    * Gets content of aggregation <code>content</code>.Determines the content of the Panel.The content
    * will be visible only when the Panel is expanded.
    */
  def getContent(): js.Array[Control] = js.native
  
  /**
    * Gets current value of property <code>expandAnimation</code>.Indicates whether the transition between
    * the expanded and the collapsed state of the control is animated.By default the animation is
    * enabled.Default value is <code>true</code>.
    * @since 1.26
    * @returns Value of property <code>expandAnimation</code>
    */
  def getExpandAnimation(): Boolean = js.native
  
  /**
    * Gets current value of property <code>expandable</code>.Specifies whether the control is
    * expandable.This allows for collapsing or expanding the infoToolbar (if available) and content of the
    * Panel.Note: If expandable is set to false, the Panel will always be rendered expanded.Default value
    * is <code>false</code>.
    * @since 1.22
    * @returns Value of property <code>expandable</code>
    */
  def getExpandable(): Boolean = js.native
  
  /**
    * Gets current value of property <code>expanded</code>.Indicates whether the Panel is expanded or
    * not.If expanded is set to true, then both the infoToolbar (if available) and the content are
    * rendered.If expanded is set to false, then only the headerText or headerToolbar is rendered.Default
    * value is <code>false</code>.
    * @since 1.22
    * @returns Value of property <code>expanded</code>
    */
  def getExpanded(): Boolean = js.native
  
  /**
    * Gets current value of property <code>headerText</code>.This property is used to set the header text
    * of the Panel.The "headerText" is visible in both expanded and collapsed state.Note: This property is
    * overwritten by the "headerToolbar" aggregation.Default value is <code></code>.
    * @returns Value of property <code>headerText</code>
    */
  def getHeaderText(): String = js.native
  
  /**
    * Gets content of aggregation <code>headerToolbar</code>.This aggregation allows the use of a custom
    * Toolbar as header for the Panel.The "headerToolbar" is visible in both expanded and collapsed
    * state.Use it when you want to add extra controls for user interactions in the header.Note: This
    * aggregation overwrites "headerText" property.
    * @since 1.16
    */
  def getHeaderToolbar(): Toolbar = js.native
  
  /**
    * Gets current value of property <code>height</code>.Determines the Panel height.Default value is
    * <code>auto</code>.
    * @returns Value of property <code>height</code>
    */
  def getHeight(): js.Any = js.native
  
  /**
    * Gets content of aggregation <code>infoToolbar</code>.This aggregation allows the use of a custom
    * Toolbar as information bar for the Panel.The "infoToolbar" is placed below the header and is visible
    * only in expanded state.Use it when you want to show extra information to the user.
    * @since 1.16
    */
  def getInfoToolbar(): Toolbar = js.native
  
  /**
    * Gets current value of property <code>width</code>.Determines the Panel width.Default value is
    * <code>100%</code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>content</code>.and
    * returns its index if found or -1 otherwise.
    * @param oContent The content whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfContent(oContent: Control): Double = js.native
  
  /**
    * Inserts a content into the aggregation <code>content</code>.
    * @param oContent the content to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
    * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
    *  greater than the current size of the aggregation, the content is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertContent(oContent: Control, iIndex: Double): Panel = js.native
  
  /**
    * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllContent(): js.Array[Control] = js.native
  
  def removeContent(vContent: String): Control = js.native
  /**
    * Removes a content from the aggregation <code>content</code>.
    * @param vContent The content to remove or its index or id
    * @returns The removed content or <code>null</code>
    */
  def removeContent(vContent: Double): Control = js.native
  def removeContent(vContent: Control): Control = js.native
  
  /**
    * Sets a new value for property <code>backgroundDesign</code>.This property is used to set the
    * background color of the Panel.Depending on the theme you can change the state of the background from
    * "Solid" over "Translucent" to "Transparent".When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Translucent</code>.
    * @since 1.30
    * @param sBackgroundDesign New value for property <code>backgroundDesign</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundDesign(sBackgroundDesign: BackgroundDesign): Panel = js.native
  
  /**
    * Sets a new value for property <code>expandAnimation</code>.Indicates whether the transition between
    * the expanded and the collapsed state of the control is animated.By default the animation is
    * enabled.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>true</code>.
    * @since 1.26
    * @param bExpandAnimation New value for property <code>expandAnimation</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setExpandAnimation(bExpandAnimation: Boolean): Panel = js.native
  
  /**
    * Sets the expandable property of the control.
    * @param bExpandable Defines whether the control is expandable or not.
    * @returns Pointer to the control instance to allow method chaining.
    */
  def setExpandable(bExpandable: Boolean): Panel = js.native
  
  /**
    * Sets the expanded property of the control.
    * @param bExpanded Defines whether control is expanded or not.
    * @returns Pointer to the control instance to allow method chaining.
    */
  def setExpanded(bExpanded: Boolean): Panel = js.native
  
  /**
    * Sets a new value for property <code>headerText</code>.This property is used to set the header text
    * of the Panel.The "headerText" is visible in both expanded and collapsed state.Note: This property is
    * overwritten by the "headerToolbar" aggregation.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code></code>.
    * @param sHeaderText New value for property <code>headerText</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeaderText(sHeaderText: String): Panel = js.native
  
  /**
    * Sets the aggregated <code>headerToolbar</code>.
    * @since 1.16
    * @param oHeaderToolbar The headerToolbar to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeaderToolbar(oHeaderToolbar: Toolbar): Panel = js.native
  
  /**
    * Sets the height of the panel.
    * @param sHeight The height of the panel as CSS size.
    * @returns Pointer to the control instance to allow method chaining.
    */
  def setHeight(sHeight: js.Any): Panel = js.native
  
  /**
    * Sets the aggregated <code>infoToolbar</code>.
    * @since 1.16
    * @param oInfoToolbar The infoToolbar to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setInfoToolbar(oInfoToolbar: Toolbar): Panel = js.native
  
  /**
    * Sets the width of the panel.
    * @param sWidth The width of the Panel as CSS size.
    * @returns Pointer to the control instance to allow method chaining.
    */
  def setWidth(sWidth: js.Any): Panel = js.native
}
