package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Popover
  extends StObject
     with Control {
  
  /**
    * Hook called after adjusment of the Popover position.
    */
  def _afterAdjustPositionAndArrowHook(): Unit = js.native
  
  /**
    * If customHeader is set, this will return the customHeaer. Otherwise it creates a header and put
    * thetitle and buttons if needed inside, and finally return this newly create header.
    */
  def _getAnyHeader(): Unit = js.native
  
  /**
    * Adds some ariaDescribedBy into the association <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy the ariaDescribedBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaDescribedBy(vAriaDescribedBy: js.Any): Popover = js.native
  def addAriaDescribedBy(vAriaDescribedBy: Control): Popover = js.native
  
  /**
    * Adds some content to the aggregation <code>content</code>.
    * @param oContent the content to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContent(oContent: Control): Popover = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>afterClose</code> event of this
    * <code>sap.m.Popover</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Popover</code> itself.This event will be fired after the popover is closed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Popover</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAfterClose(oData: js.Any, fnFunction: js.Any): Popover = js.native
  def attachAfterClose(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Popover = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>afterOpen</code> event of this
    * <code>sap.m.Popover</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Popover</code> itself.This event will be fired after the popover is opened.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Popover</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAfterOpen(oData: js.Any, fnFunction: js.Any): Popover = js.native
  def attachAfterOpen(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Popover = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>beforeClose</code> event of this
    * <code>sap.m.Popover</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Popover</code> itself.This event will be fired before the popover is closed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Popover</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachBeforeClose(oData: js.Any, fnFunction: js.Any): Popover = js.native
  def attachBeforeClose(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Popover = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>beforeOpen</code> event of this
    * <code>sap.m.Popover</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Popover</code> itself.This event will be fired before the popover is opened.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Popover</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachBeforeOpen(oData: js.Any, fnFunction: js.Any): Popover = js.native
  def attachBeforeOpen(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Popover = js.native
  
  /**
    * Closes the popover when it's already opened.
    * @returns Reference to the control instance for chaining
    */
  def close(): Popover = js.native
  
  /**
    * Destroys the beginButton in the aggregation <code>beginButton</code>.
    * @since 1.15.1
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyBeginButton(): Popover = js.native
  
  /**
    * Destroys all the content in the aggregation <code>content</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContent(): Popover = js.native
  
  /**
    * Destroys the customHeader in the aggregation <code>customHeader</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyCustomHeader(): Popover = js.native
  
  /**
    * Destroys the endButton in the aggregation <code>endButton</code>.
    * @since 1.15.1
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyEndButton(): Popover = js.native
  
  /**
    * Destroys the footer in the aggregation <code>footer</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyFooter(): Popover = js.native
  
  /**
    * Destroys the subHeader in the aggregation <code>subHeader</code>.
    * @since 1.15.1
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySubHeader(): Popover = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>afterClose</code> event of this
    * <code>sap.m.Popover</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAfterClose(fnFunction: js.Any, oListener: js.Any): Popover = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>afterOpen</code> event of this
    * <code>sap.m.Popover</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAfterOpen(fnFunction: js.Any, oListener: js.Any): Popover = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>beforeClose</code> event of this
    * <code>sap.m.Popover</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachBeforeClose(fnFunction: js.Any, oListener: js.Any): Popover = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>beforeOpen</code> event of this
    * <code>sap.m.Popover</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachBeforeOpen(fnFunction: js.Any, oListener: js.Any): Popover = js.native
  
  /**
    * Fires event <code>afterClose</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>openBy</code> of type <code>sap.ui.core.Control</code>This refers to the
    * control which opens the popover.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAfterClose(mArguments: js.Any): Popover = js.native
  
  /**
    * Fires event <code>afterOpen</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>openBy</code> of type <code>sap.ui.core.Control</code>This refers to the
    * control which opens the popover.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAfterOpen(mArguments: js.Any): Popover = js.native
  
  /**
    * Fires event <code>beforeClose</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>openBy</code> of type <code>sap.ui.core.Control</code>This refers to the
    * control which opens the popover.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireBeforeClose(mArguments: js.Any): Popover = js.native
  
  /**
    * Fires event <code>beforeOpen</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>openBy</code> of type <code>sap.ui.core.Control</code>This refers to the
    * control which opens the popover.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireBeforeOpen(mArguments: js.Any): Popover = js.native
  
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaDescribedBy</code>.
    */
  def getAriaDescribedBy(): js.Array[js.Any] = js.native
  
  /**
    * Gets content of aggregation <code>beginButton</code>.BeginButton is shown at the left side (right
    * side in RTL mode) inside the header. When showHeader is set to false, the property is ignored.
    * @since 1.15.1
    */
  def getBeginButton(): Control = js.native
  
  /**
    * Gets content of aggregation <code>content</code>.The content inside the popover.
    */
  def getContent(): js.Array[Control] = js.native
  
  /**
    * Gets current value of property <code>contentHeight</code>.Set the height of the content area inside
    * Popover. When controls which adapt their size to the parent control are added directly into Popover,
    * for example sap.m.Page control, a size needs to be specified to the content area of the Popover.
    * Otherwise, Popover control isn't able to display the content in the right way. This values isn't
    * necessary for controls added to Popover directly which can decide their size by themselves, for
    * exmaple sap.m.List, sap.m.Image etc., only needed for controls that adapt their size to the parent
    * control.
    * @since 1.9.0
    * @returns Value of property <code>contentHeight</code>
    */
  def getContentHeight(): js.Any = js.native
  
  /**
    * Gets current value of property <code>contentMinWidth</code>.Sets the minimum width of the content
    * area inside popover.Default value is <code></code>.
    * @since 1.36
    * @returns Value of property <code>contentMinWidth</code>
    */
  def getContentMinWidth(): js.Any = js.native
  
  /**
    * Gets current value of property <code>contentWidth</code>.Set the width of the content area inside
    * Popover. When controls which adapt their size to the parent control are added directly into Popover,
    * for example sap.m.Page control, a size needs to be specified to the content area of the Popover.
    * Otherwise, Popover control isn't able to display the content in the right way. This values isn't
    * necessary for controls added to Popover directly which can decide their size by themselves, for
    * exmaple sap.m.List, sap.m.Image etc., only needed for controls that adapt their size to the parent
    * control.
    * @since 1.9.0
    * @returns Value of property <code>contentWidth</code>
    */
  def getContentWidth(): js.Any = js.native
  
  /**
    * Gets content of aggregation <code>customHeader</code>.Any control that needed to be displayed in the
    * header area. When this is set, the showHeader property is ignored, and only this customHeader is
    * shown on the top of popover.
    */
  def getCustomHeader(): Control = js.native
  
  /**
    * Gets current value of property <code>enableScrolling</code>.This property is deprecated. Please use
    * properties verticalScrolling and horizontalScrolling instead. If you still use this property it will
    * be mapped on the new properties verticalScrolling and horizontalScrolling.Default value is
    * <code>true</code>.
    * @returns Value of property <code>enableScrolling</code>
    */
  def getEnableScrolling(): Boolean = js.native
  
  /**
    * Gets content of aggregation <code>endButton</code>.EndButton is always shown at the right side (left
    * side in RTL mode) inside the header. When showHeader is set to false, the property is ignored.
    * @since 1.15.1
    */
  def getEndButton(): Control = js.native
  
  /**
    * Gets content of aggregation <code>footer</code>.This is optional footer which is shown on the bottom
    * of the popover.
    */
  def getFooter(): Control = js.native
  
  /**
    * Gets current value of property <code>horizontalScrolling</code>.This property indicates if user can
    * scroll horizontally inside popover when the content is bigger than the content area. However, when
    * scrollable control (sap.m.ScrollContainer, sap.m.Page) is in the popover, this property needs to be
    * set to false to disable the scrolling in popover in order to make the scrolling in the child control
    * work properly.Popover detects if there's sap.m.NavContainer, sap.m.Page, or sap.m.ScrollContainer as
    * direct child added to Popover. If there is, Popover will turn off scrolling by setting this property
    * to false automatically ignoring the existing value of this property.Default value is
    * <code>true</code>.
    * @since 1.15.0
    * @returns Value of property <code>horizontalScrolling</code>
    */
  def getHorizontalScrolling(): Boolean = js.native
  
  /**
    * ID of the element which is the current target of the association <code>initialFocus</code>, or
    * <code>null</code>.
    * @since 1.15.0
    */
  def getInitialFocus(): js.Any = js.native
  
  /**
    * ID of the element which is the current target of the association <code>leftButton</code>, or
    * <code>null</code>.
    */
  def getLeftButton(): js.Any = js.native
  
  /**
    * Gets current value of property <code>modal</code>.If the popover will not be closed when tapping
    * outside the popover. It also blocks any interaction with the background. The default value is
    * false.Default value is <code>false</code>.
    * @returns Value of property <code>modal</code>
    */
  def getModal(): Boolean = js.native
  
  /**
    * Gets current value of property <code>offsetX</code>.The offset for the popover placement in the x
    * axis. It's with unit pixel.Default value is <code>0</code>.
    * @returns Value of property <code>offsetX</code>
    */
  def getOffsetX(): Double = js.native
  
  /**
    * Gets current value of property <code>offsetY</code>.The offset for the popover placement in the y
    * axis. It's with unit pixel.Default value is <code>0</code>.
    * @returns Value of property <code>offsetY</code>
    */
  def getOffsetY(): Double = js.native
  
  /**
    * Gets current value of property <code>placement</code>.This is the information about on which side
    * will the popover be placed at. Possible values are sap.m.PlacementType.Left,
    * sap.m.PlacementType.Right, sap.m.PlacementType.Top, sap.m.PlacementType.Bottom,
    * sap.m.PlacementType.Horizontal, sap.m.PlacementType.HorizontalPreferredLeft,
    * sap.m.PlacementType.HorizontalPreferredRight, sap.m.PlacementType.Vertical,
    * sap.m.PlacementType.VerticalPreferredTop, sap.m.PlacementType.VerticalPreferredBottom,
    * sap.m.PlacementType.Auto. The default value is sap.m.PlacementType.Right. Setting this property
    * while popover is open won't cause any rerendering of the popover, but it will take effect when it's
    * opened again.Default value is <code>Right</code>.
    * @returns Value of property <code>placement</code>
    */
  def getPlacement(): PlacementType = js.native
  
  /**
    * Gets current value of property <code>resizable</code>.Whether resize option is enabled.Default value
    * is <code>false</code>.
    * @since 1.36.4
    * @returns Value of property <code>resizable</code>
    */
  def getResizable(): Boolean = js.native
  
  /**
    * ID of the element which is the current target of the association <code>rightButton</code>, or
    * <code>null</code>.
    */
  def getRightButton(): js.Any = js.native
  
  /**
    * Gets current value of property <code>showArrow</code>.Whether Popover arrow should be visibleDefault
    * value is <code>true</code>.
    * @since 1.31
    * @returns Value of property <code>showArrow</code>
    */
  def getShowArrow(): Boolean = js.native
  
  /**
    * Gets current value of property <code>showHeader</code>.If a header should be shown at the top of the
    * popover.Default value is <code>true</code>.
    * @returns Value of property <code>showHeader</code>
    */
  def getShowHeader(): Boolean = js.native
  
  /**
    * Gets content of aggregation <code>subHeader</code>.When subHeader is assigned to Popover, it's
    * rendered directly after the main header if there is, or at the beginning of Popover when there's no
    * main header. SubHeader is out of the content area and won't be scrolled when content's size is
    * bigger than the content area's size.
    * @since 1.15.1
    */
  def getSubHeader(): Control = js.native
  
  /**
    * Gets current value of property <code>title</code>.Title text appears in the header. This property
    * will be ignored when showHeader is set to false.
    * @returns Value of property <code>title</code>
    */
  def getTitle(): String = js.native
  
  /**
    * Gets current value of property <code>verticalScrolling</code>.This property indicates if user can
    * scroll vertically inside popover when the content is bigger than the content area. However, when
    * scrollable control (sap.m.ScrollContainer, sap.m.Page) is in the popover, this property needs to be
    * set to false to disable the scrolling in popover in order to make the scrolling in the child control
    * work properly.Popover detects if there's sap.m.NavContainer, sap.m.Page, or sap.m.ScrollContainer as
    * direct child added to Popover. If there is, Popover will turn off scrolling by setting this property
    * to false automatically ignoring the existing value of this property.Default value is
    * <code>true</code>.
    * @since 1.15.0
    * @returns Value of property <code>verticalScrolling</code>
    */
  def getVerticalScrolling(): Boolean = js.native
  
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
  def insertContent(oContent: Control, iIndex: Double): Popover = js.native
  
  /**
    * The method checks if the Popover is open. It returns true when the Popover is currently open (this
    * includes opening and closing animations), otherwise it returns false.
    * @since 1.9.1
    * @returns whether the Popover is currently opened
    */
  def isOpen(): Boolean = js.native
  
  /**
    * Opens the Popover and set the Popover position according to the {@link #getPlacement() placement}
    * property around the <code>oControl</code> parameter.
    * @param oControl This is the control to which the Popover will be placed. It can be not only a UI5
    * control, but also an existing DOM reference. The side of the placement depends on the placement
    * property set in the Popover.
    * @param bSkipInstanceManager undefined
    * @returns Reference to the control instance for chaining
    */
  def openBy(oControl: js.Any, bSkipInstanceManager: Boolean): Popover = js.native
  
  /**
    * Calculate outerHeight of the element; used as hook for SVG elements
    * @param oElement An Element for which outerHeight will be calculated.
    * @param bIncludeMargin Determines if the margins should be included in the calculated outerHeight.
    * Default value is false.
    */
  def outerHeight(oElement: HTMLElement, bIncludeMargin: Boolean): Unit = js.native
  
  /**
    * Calculate outerWidth of the element; used as hook for SVG elements
    * @param oElement An Element for which outerWidth will be calculated.
    * @param bIncludeMargin Determines if the margins should be included in the calculated outerWidth.
    * Default value is false.
    */
  def outerWidth(oElement: HTMLElement, bIncludeMargin: Boolean): Unit = js.native
  
  /**
    * Removes all the controls in the association named <code>ariaDescribedBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaDescribedBy(): js.Array[js.Any] = js.native
  
  /**
    * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllContent(): js.Array[Control] = js.native
  
  def removeAriaDescribedBy(vAriaDescribedBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
    * @returns The removed ariaDescribedBy or <code>null</code>
    */
  def removeAriaDescribedBy(vAriaDescribedBy: Double): js.Any = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: Control): js.Any = js.native
  
  def removeContent(vContent: String): Control = js.native
  /**
    * Removes a content from the aggregation <code>content</code>.
    * @param vContent The content to remove or its index or id
    * @returns The removed content or <code>null</code>
    */
  def removeContent(vContent: Double): Control = js.native
  def removeContent(vContent: Control): Control = js.native
  
  /**
    * Sets the aggregated <code>beginButton</code>.
    * @since 1.15.1
    * @param oBeginButton The beginButton to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBeginButton(oBeginButton: Control): Popover = js.native
  
  /**
    * Setter for property <code>bounce</code>.Default value is empty
    * @param bBounce New value for property <code>bounce</code>
    * @returns Reference to the control instance for chaining
    */
  def setBounce(bBounce: Boolean): Popover = js.native
  
  /**
    * Sets a new value for property <code>contentHeight</code>.Set the height of the content area inside
    * Popover. When controls which adapt their size to the parent control are added directly into Popover,
    * for example sap.m.Page control, a size needs to be specified to the content area of the Popover.
    * Otherwise, Popover control isn't able to display the content in the right way. This values isn't
    * necessary for controls added to Popover directly which can decide their size by themselves, for
    * exmaple sap.m.List, sap.m.Image etc., only needed for controls that adapt their size to the parent
    * control.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @since 1.9.0
    * @param sContentHeight New value for property <code>contentHeight</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setContentHeight(sContentHeight: js.Any): Popover = js.native
  
  /**
    * Sets a new value for property <code>contentMinWidth</code>.Sets the minimum width of the content
    * area inside popover.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code></code>.
    * @since 1.36
    * @param sContentMinWidth New value for property <code>contentMinWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setContentMinWidth(sContentMinWidth: js.Any): Popover = js.native
  
  /**
    * Sets a new value for property <code>contentWidth</code>.Set the width of the content area inside
    * Popover. When controls which adapt their size to the parent control are added directly into Popover,
    * for example sap.m.Page control, a size needs to be specified to the content area of the Popover.
    * Otherwise, Popover control isn't able to display the content in the right way. This values isn't
    * necessary for controls added to Popover directly which can decide their size by themselves, for
    * exmaple sap.m.List, sap.m.Image etc., only needed for controls that adapt their size to the parent
    * control.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @since 1.9.0
    * @param sContentWidth New value for property <code>contentWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setContentWidth(sContentWidth: js.Any): Popover = js.native
  
  /**
    * Sets the aggregated <code>customHeader</code>.
    * @param oCustomHeader The customHeader to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCustomHeader(oCustomHeader: Control): Popover = js.native
  
  /**
    * Sets a new value for property <code>enableScrolling</code>.This property is deprecated. Please use
    * properties verticalScrolling and horizontalScrolling instead. If you still use this property it will
    * be mapped on the new properties verticalScrolling and horizontalScrolling.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bEnableScrolling New value for property <code>enableScrolling</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnableScrolling(bEnableScrolling: Boolean): Popover = js.native
  
  /**
    * Sets the aggregated <code>endButton</code>.
    * @since 1.15.1
    * @param oEndButton The endButton to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEndButton(oEndButton: Control): Popover = js.native
  
  /**
    * The followOf feature closes the Popover when the position of the control that opened the Popover
    * changes by at least  32 pixels (on desktop browsers). This may lead to unwanted closing of the
    * Popover.This function is for enabling/disabling the followOf feature.
    * @since 1.16.8
    * @param bValue Enables the followOf feature
    * @returns Reference to the control instance for chaining
    */
  def setFollowOf(bValue: Boolean): Popover = js.native
  
  /**
    * Sets the aggregated <code>footer</code>.
    * @param oFooter The footer to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFooter(oFooter: Control): Popover = js.native
  
  /**
    * Sets a new value for property <code>horizontalScrolling</code>.This property indicates if user can
    * scroll horizontally inside popover when the content is bigger than the content area. However, when
    * scrollable control (sap.m.ScrollContainer, sap.m.Page) is in the popover, this property needs to be
    * set to false to disable the scrolling in popover in order to make the scrolling in the child control
    * work properly.Popover detects if there's sap.m.NavContainer, sap.m.Page, or sap.m.ScrollContainer as
    * direct child added to Popover. If there is, Popover will turn off scrolling by setting this property
    * to false automatically ignoring the existing value of this property.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @since 1.15.0
    * @param bHorizontalScrolling New value for property <code>horizontalScrolling</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHorizontalScrolling(bHorizontalScrolling: Boolean): Popover = js.native
  
  /**
    * Sets the associated <code>initialFocus</code>.
    * @since 1.15.0
    * @param oInitialFocus ID of an element which becomes the new target of this initialFocus association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setInitialFocus(oInitialFocus: js.Any): Popover = js.native
  def setInitialFocus(oInitialFocus: Control): Popover = js.native
  
  /**
    * Sets the associated <code>leftButton</code>.
    * @param oLeftButton ID of an element which becomes the new target of this leftButton association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLeftButton(oLeftButton: js.Any): Popover = js.native
  def setLeftButton(oLeftButton: Button): Popover = js.native
  
  /**
    * Setter for property <code>modal</code>.This overwrites the default setter of the property
    * <code>modal</code> to avoid rerendering the whole popover control.Default value is
    * <code>false</code>
    * @param bModal New value for property <code>modal</code>.
    * @param sModalCSSClass A CSS class (or space-separated list of classes) that should be added to the
    * block layer.
    * @returns Reference to the control instance for chaining
    */
  def setModal(bModal: Boolean): Popover = js.native
  def setModal(bModal: Boolean, sModalCSSClass: String): Popover = js.native
  
  /**
    * Sets a new value for property <code>offsetX</code>.The offset for the popover placement in the x
    * axis. It's with unit pixel.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>0</code>.
    * @param iOffsetX New value for property <code>offsetX</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setOffsetX(iOffsetX: Double): Popover = js.native
  
  /**
    * Sets a new value for property <code>offsetY</code>.The offset for the popover placement in the y
    * axis. It's with unit pixel.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>0</code>.
    * @param iOffsetY New value for property <code>offsetY</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setOffsetY(iOffsetY: Double): Popover = js.native
  
  /**
    * Set the placement of the Popover.
    * @param sPlacement The position of the Popover
    * @returns Reference to the control instance for chaining
    */
  def setPlacement(sPlacement: PlacementType): Popover = js.native
  
  /**
    * Sets a new value for property <code>resizable</code>.Whether resize option is enabled.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>false</code>.
    * @since 1.36.4
    * @param bResizable New value for property <code>resizable</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setResizable(bResizable: Boolean): Popover = js.native
  
  /**
    * Sets the associated <code>rightButton</code>.
    * @param oRightButton ID of an element which becomes the new target of this rightButton association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setRightButton(oRightButton: js.Any): Popover = js.native
  def setRightButton(oRightButton: Button): Popover = js.native
  
  /**
    * Sets a new value for property <code>showArrow</code>.Whether Popover arrow should be visibleWhen
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>true</code>.
    * @since 1.31
    * @param bShowArrow New value for property <code>showArrow</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowArrow(bShowArrow: Boolean): Popover = js.native
  
  /**
    * Sets a new value for property <code>showHeader</code>.If a header should be shown at the top of the
    * popover.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>true</code>.
    * @param bShowHeader New value for property <code>showHeader</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowHeader(bShowHeader: Boolean): Popover = js.native
  
  /**
    * Sets the aggregated <code>subHeader</code>.
    * @since 1.15.1
    * @param oSubHeader The subHeader to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSubHeader(oSubHeader: Control): Popover = js.native
  
  /**
    * The setter of the title property.If you want to show a header in the popover, don't forget to set
    * the{@link #setShowHeader showHeader} property to true.
    * @param sTitle The title to be set
    * @returns Reference to the control instance for chaining
    */
  def setTitle(sTitle: String): Popover = js.native
  
  /**
    * Sets a new value for property <code>verticalScrolling</code>.This property indicates if user can
    * scroll vertically inside popover when the content is bigger than the content area. However, when
    * scrollable control (sap.m.ScrollContainer, sap.m.Page) is in the popover, this property needs to be
    * set to false to disable the scrolling in popover in order to make the scrolling in the child control
    * work properly.Popover detects if there's sap.m.NavContainer, sap.m.Page, or sap.m.ScrollContainer as
    * direct child added to Popover. If there is, Popover will turn off scrolling by setting this property
    * to false automatically ignoring the existing value of this property.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @since 1.15.0
    * @param bVerticalScrolling New value for property <code>verticalScrolling</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVerticalScrolling(bVerticalScrolling: Boolean): Popover = js.native
}
