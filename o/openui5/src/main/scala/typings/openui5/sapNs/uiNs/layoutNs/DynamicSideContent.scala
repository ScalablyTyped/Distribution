package typings.openui5.sapNs.uiNs.layoutNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.layout.DynamicSideContent")
@js.native
class DynamicSideContent protected () extends Control {
  /**
    * Constructor for a new DynamicSideContent.Accepts an object literal <code>mSettings</code> that
    * defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds a control to the main content area.Only the main content part in the aggregation is
    * re-rendered.
    * @param oControl Object to be added in the aggregation
    * @returns this pointer for chaining
    */
  def addMainContent(oControl: js.Any): js.Any = js.native
  /**
    * Adds a control to the side content area.Only the side content part in the aggregation is
    * re-rendered.
    * @param oControl Object to be added in the aggregation
    * @returns this pointer for chaining
    */
  def addSideContent(oControl: js.Any): js.Any = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>breakpointChanged</code> event of this
    * <code>sap.ui.layout.DynamicSideContent</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.layout.DynamicSideContent</code> itself.Fires when the current breakpoint has
    * been changed.
    * @since 1.32
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.layout.DynamicSideContent</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachBreakpointChanged(oData: js.Any, fnFunction: js.Any): DynamicSideContent = js.native
  def attachBreakpointChanged(oData: js.Any, fnFunction: js.Any, oListener: js.Any): DynamicSideContent = js.native
  /**
    * Destroys all the mainContent in the aggregation <code>mainContent</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyMainContent(): DynamicSideContent = js.native
  /**
    * Destroys all the sideContent in the aggregation <code>sideContent</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySideContent(): DynamicSideContent = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>breakpointChanged</code> event of this
    * <code>sap.ui.layout.DynamicSideContent</code>.The passed function and listener object must match the
    * ones used for event registration.
    * @since 1.32
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachBreakpointChanged(fnFunction: js.Any, oListener: js.Any): DynamicSideContent = js.native
  /**
    * Fires event <code>breakpointChanged</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>currentBreakpoint</code> of type <code>string</code></li></ul>
    * @since 1.32
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireBreakpointChanged(mArguments: js.Any): DynamicSideContent = js.native
  /**
    * Gets current value of property <code>containerQuery</code>.If set to TRUE, then not the media Query
    * (device screen size) but the size of the container, surrounding the control, defines the current
    * range.Default value is <code>false</code>.
    * @returns Value of property <code>containerQuery</code>
    */
  def getContainerQuery(): Boolean = js.native
  /**
    * Returns the breakpoint for the current state of the control.
    * @returns currentBreakpoint
    */
  def getCurrentBreakpoint(): String = js.native
  /**
    * Gets current value of property <code>equalSplit</code>.Defines whether the control is in equal split
    * mode. In this mode, the side and the main contenttake 50:50 percent of the container on all screen
    * sizes except for phone, where the main andside contents are switching visibility using the toggle
    * method.Default value is <code>false</code>.
    * @returns Value of property <code>equalSplit</code>
    */
  def getEqualSplit(): Boolean = js.native
  /**
    * Gets content of aggregation <code>mainContent</code>.Main content controls.
    */
  def getMainContent(): js.Array[Control] = js.native
  /**
    * Gets the value of showMainContent property.
    * @returns Side content visibility state
    */
  def getShowMainContent(): Boolean = js.native
  /**
    * Gets the value of showSideContent property.
    * @returns Side content visibility state
    */
  def getShowSideContent(): Boolean = js.native
  /**
    * Gets content of aggregation <code>sideContent</code>.Side content controls.
    */
  def getSideContent(): js.Array[Control] = js.native
  /**
    * Gets current value of property <code>sideContentFallDown</code>.Determines on which breakpoints the
    * side content falls down below the main content.Default value is <code>OnMinimumWidth</code>.
    * @returns Value of property <code>sideContentFallDown</code>
    */
  def getSideContentFallDown(): SideContentFallDown = js.native
  /**
    * Gets current value of property <code>sideContentPosition</code>.Determines whether the side content
    * is on the left or on the right side of the main content.Default value is <code>End</code>.
    * @since 1.36
    * @returns Value of property <code>sideContentPosition</code>
    */
  def getSideContentPosition(): SideContentPosition = js.native
  /**
    * Gets current value of property <code>sideContentVisibility</code>.Determines on which breakpoints
    * the side content is visible.Default value is <code>ShowAboveS</code>.
    * @returns Value of property <code>sideContentVisibility</code>
    */
  def getSideContentVisibility(): SideContentVisibility = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation
    * <code>mainContent</code>.and returns its index if found or -1 otherwise.
    * @param oMainContent The mainContent whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfMainContent(oMainContent: Control): Double = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation
    * <code>sideContent</code>.and returns its index if found or -1 otherwise.
    * @param oSideContent The sideContent whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfSideContent(oSideContent: Control): Double = js.native
  /**
    * Inserts a mainContent into the aggregation <code>mainContent</code>.
    * @param oMainContent the mainContent to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the mainContent should be inserted at; for            
    * a negative value of <code>iIndex</code>, the mainContent is inserted at position 0; for a value     
    *        greater than the current size of the aggregation, the mainContent is inserted at            
    * the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertMainContent(oMainContent: Control, iIndex: Double): DynamicSideContent = js.native
  /**
    * Inserts a sideContent into the aggregation <code>sideContent</code>.
    * @param oSideContent the sideContent to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the sideContent should be inserted at; for            
    * a negative value of <code>iIndex</code>, the sideContent is inserted at position 0; for a value     
    *        greater than the current size of the aggregation, the sideContent is inserted at            
    * the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertSideContent(oSideContent: Control, iIndex: Double): DynamicSideContent = js.native
  /**
    * Removes all the controls from the aggregation <code>mainContent</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllMainContent(): js.Array[Control] = js.native
  /**
    * Removes all the controls from the aggregation <code>sideContent</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllSideContent(): js.Array[Control] = js.native
  def removeMainContent(vMainContent: String): Control = js.native
  /**
    * Removes a mainContent from the aggregation <code>mainContent</code>.
    * @param vMainContent The mainContent to remove or its index or id
    * @returns The removed mainContent or <code>null</code>
    */
  def removeMainContent(vMainContent: Double): Control = js.native
  def removeMainContent(vMainContent: Control): Control = js.native
  def removeSideContent(vSideContent: String): Control = js.native
  /**
    * Removes a sideContent from the aggregation <code>sideContent</code>.
    * @param vSideContent The sideContent to remove or its index or id
    * @returns The removed sideContent or <code>null</code>
    */
  def removeSideContent(vSideContent: Double): Control = js.native
  def removeSideContent(vSideContent: Control): Control = js.native
  /**
    * Sets a new value for property <code>containerQuery</code>.If set to TRUE, then not the media Query
    * (device screen size) but the size of the container, surrounding the control, defines the current
    * range.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>false</code>.
    * @param bContainerQuery New value for property <code>containerQuery</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setContainerQuery(bContainerQuery: Boolean): DynamicSideContent = js.native
  /**
    * Sets or unsets the page in equalSplit mode.
    * @param bState Determines if the page is set to equalSplit mode
    * @returns this pointer for chaining
    */
  def setEqualSplit(bState: Boolean): js.Any = js.native
  /**
    * Sets the showMainContent property.
    * @param bVisible Determines if the main content part is visible
    * @param bSuppressVisualUpdate Determines if the visual state is updated
    * @returns this pointer for chaining
    */
  def setShowMainContent(bVisible: Boolean, bSuppressVisualUpdate: Boolean): js.Any = js.native
  /**
    * Sets the showSideContent property.
    * @param bVisible Determines if the side content part is visible
    * @param bSuppressVisualUpdate Determines if the visual state is updated
    * @returns this pointer for chaining
    */
  def setShowSideContent(bVisible: Boolean, bSuppressVisualUpdate: Boolean): js.Any = js.native
  /**
    * Sets a new value for property <code>sideContentFallDown</code>.Determines on which breakpoints the
    * side content falls down below the main content.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>OnMinimumWidth</code>.
    * @param sSideContentFallDown New value for property <code>sideContentFallDown</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSideContentFallDown(sSideContentFallDown: SideContentFallDown): DynamicSideContent = js.native
  /**
    * Sets a new value for property <code>sideContentPosition</code>.Determines whether the side content
    * is on the left or on the right side of the main content.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>End</code>.
    * @since 1.36
    * @param sSideContentPosition New value for property <code>sideContentPosition</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSideContentPosition(sSideContentPosition: SideContentPosition): DynamicSideContent = js.native
  /**
    * Sets a new value for property <code>sideContentVisibility</code>.Determines on which breakpoints the
    * side content is visible.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>ShowAboveS</code>.
    * @param sSideContentVisibility New value for property <code>sideContentVisibility</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSideContentVisibility(sSideContentVisibility: SideContentVisibility): DynamicSideContent = js.native
  /**
    * Used for the toggle button functionality.When the control is on a phone screen size only, one
    * control area is visible.This helper method is used to implement a button/switch for changingbetween
    * the main and side content areas.Only works if the current breakpoint is "S".
    * @returns this pointer for chaining
    */
  def toggle(): js.Any = js.native
}

