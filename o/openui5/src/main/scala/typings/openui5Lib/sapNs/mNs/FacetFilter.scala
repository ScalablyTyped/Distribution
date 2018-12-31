package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.FacetFilter")
@js.native
class FacetFilter protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new FacetFilter.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds some list to the aggregation <code>lists</code>.
    * @param oList the list to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addList(oList: FacetFilterList): FacetFilter = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>confirm</code> event of this
    * <code>sap.m.FacetFilter</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.FacetFilter</code> itself.Fired when the user confirms filter selection.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.FacetFilter</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachConfirm(oData: js.Any, fnFunction: js.Any): FacetFilter = js.native
  def attachConfirm(oData: js.Any, fnFunction: js.Any, oListener: js.Any): FacetFilter = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>reset</code> event of this
    * <code>sap.m.FacetFilter</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.FacetFilter</code> itself.Fired when the Reset button is pressed to inform that all
    * FacetFilterLists need to be reset.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.FacetFilter</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachReset(oData: js.Any, fnFunction: js.Any): FacetFilter = js.native
  def attachReset(oData: js.Any, fnFunction: js.Any, oListener: js.Any): FacetFilter = js.native
  /**
    * Destroys all the lists in the aggregation <code>lists</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyLists(): FacetFilter = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>confirm</code> event of this
    * <code>sap.m.FacetFilter</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachConfirm(fnFunction: js.Any, oListener: js.Any): FacetFilter = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>reset</code> event of this
    * <code>sap.m.FacetFilter</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachReset(fnFunction: js.Any, oListener: js.Any): FacetFilter = js.native
  /**
    * Fires event <code>confirm</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireConfirm(mArguments: js.Any): FacetFilter = js.native
  /**
    * Fires event <code>reset</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireReset(mArguments: js.Any): FacetFilter = js.native
  /**
    * Gets current value of property <code>liveSearch</code>.Enables/disables live search on all search
    * fields except for the FacetFilterList search.Default value is <code>true</code>.
    * @returns Value of property <code>liveSearch</code>
    */
  def getLiveSearch(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>showPersonalization</code>.If set to <code>true</code> and the
    * FacetFilter type is <code>Simple</code>, then the Add Facet icon will be displayed and each facet
    * button will also have a Facet Remove icon displayed beside it, allowing the user to deactivate the
    * facet.Default value is <code>false</code>.
    * @returns Value of property <code>showPersonalization</code>
    */
  def getShowPersonalization(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>showPopoverOKButton</code>.If set to <code>true</code>, an OK
    * button is displayed for every FacetFilterList popover. This button allows the user to close the
    * popover from within the popover instead of having to click outside of it.Default value is
    * <code>false</code>.
    * @returns Value of property <code>showPopoverOKButton</code>
    */
  def getShowPopoverOKButton(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>showReset</code>.Shows/hides the FacetFilter Reset
    * button.Default value is <code>true</code>.
    * @returns Value of property <code>showReset</code>
    */
  def getShowReset(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>showSummaryBar</code>.Shows the summary bar instead of the
    * FacetFilter buttons bar when set to <code>true</code>.Default value is <code>false</code>.
    * @returns Value of property <code>showSummaryBar</code>
    */
  def getShowSummaryBar(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>type</code>.Defines the default appearance of the FacetFilter
    * on the device. Possible values are <code>Simple</code> (default) and <code>Light</code>.Default
    * value is <code>Simple</code>.
    * @returns Value of property <code>type</code>
    */
  def getType(): FacetFilterType = js.native
  /**
    * Checks for the provided <code>sap.m.FacetFilterList</code> in the aggregation <code>lists</code>.and
    * returns its index if found or -1 otherwise.
    * @param oList The list whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfList(oList: FacetFilterList): scala.Double = js.native
  /**
    * Inserts a list into the aggregation <code>lists</code>.
    * @param oList the list to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the list should be inserted at; for             a
    * negative value of <code>iIndex</code>, the list is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the list is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertList(oList: FacetFilterList, iIndex: scala.Double): FacetFilter = js.native
  /**
    * Opens the FacetFilter dialog.
    * @returns this pointer for chaining
    */
  def openFilterDialog(): FacetFilter = js.native
  /**
    * Removes all the controls from the aggregation <code>lists</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllLists(): js.Array[FacetFilterList] = js.native
  /**
    * Sets a new value for property <code>showPersonalization</code>.If set to <code>true</code> and the
    * FacetFilter type is <code>Simple</code>, then the Add Facet icon will be displayed and each facet
    * button will also have a Facet Remove icon displayed beside it, allowing the user to deactivate the
    * facet.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>false</code>.
    * @param bShowPersonalization New value for property <code>showPersonalization</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowPersonalization(bShowPersonalization: scala.Boolean): FacetFilter = js.native
  /**
    * Sets a new value for property <code>showPopoverOKButton</code>.If set to <code>true</code>, an OK
    * button is displayed for every FacetFilterList popover. This button allows the user to close the
    * popover from within the popover instead of having to click outside of it.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @param bShowPopoverOKButton New value for property <code>showPopoverOKButton</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowPopoverOKButton(bShowPopoverOKButton: scala.Boolean): FacetFilter = js.native
}

