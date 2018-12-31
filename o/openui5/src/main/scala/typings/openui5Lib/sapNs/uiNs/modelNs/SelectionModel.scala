package typings
package openui5Lib.sapNs.uiNs.modelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.SelectionModel")
@js.native
class SelectionModel protected ()
  extends openui5Lib.sapNs.uiNs.baseNs.EventProvider {
  /**
    * Constructs an instance of a sap.ui.model.SelectionModel.
    * @param iSelectionMode <code>sap.ui.model.SelectionModel.SINGLE_SELECTION</code> or
    * <code>sap.ui.model.SelectionModel.MULTI_SELECTION</code>
    */
  def this(iSelectionMode: scala.Double) = this()
  /**
    * SelectionMode: Multi Selection
    */
  var MULTI_SELECTION: js.Any = js.native
  /**
    * SelectionMode: Single Selection
    */
  var SINGLE_SELECTION: js.Any = js.native
  /**
    * Changes the selection to be the union of the current selectionand the range between
    * <code>iFromIndex</code> and <code>iToIndex</code> inclusive.If <code>iFromIndex</code> is smaller
    * than <code>iToIndex</code>, both parameters are swapped.In <code>SINGLE_SELECTION</code> selection
    * mode, this is equivalentto calling <code>setSelectionInterval</code>, and only the second indexis
    * used.If this call results in a change to the current selection or lead selection, then
    * a<code>SelectionChanged</code> event is fired.
    * @param iFromIndex one end of the interval.
    * @param iToIndex other end of the interval
    * @returns <code>this</code> to allow method chaining
    */
  def addSelectionInterval(iFromIndex: scala.Double, iToIndex: scala.Double): SelectionModel = js.native
  /**
    * Attach event-handler <code>fnFunction</code> to the 'selectionChanged' event of this
    * <code>sap.ui.model.SelectionModel</code>.<br/>
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, this Model is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachSelectionChanged(oData: js.Any, fnFunction: js.Any): SelectionModel = js.native
  def attachSelectionChanged(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SelectionModel = js.native
  /**
    * Change the selection to the empty set and clears the lead selection.If this call results in a change
    * to the current selection or lead selection, then a<code>SelectionChanged</code> event is fired.
    * @returns <code>this</code> to allow method chaining
    */
  def clearSelection(): SelectionModel = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'selectionChanged' event of this
    * <code>sap.ui.model.SelectionModel</code>.<br/>The passed function and listener object must match the
    * ones previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachSelectionChanged(fnFunction: js.Any, oListener: js.Any): SelectionModel = js.native
  /**
    * Fire event 'selectionChanged' to attached listeners.Expects following event
    * parameters:<ul><li>'leadIndex' of type <code>int</code> Lead selection index.</li><li>'rowIndices'
    * of type <code>int[]</code> Other selected indices (if available)</li></ul>
    * @param mArguments the arguments to pass along with the event.
    * @returns <code>this</code> to allow method chaining
    */
  def fireSelectionChanged(mArguments: js.Any): SelectionModel = js.native
  /**
    * Return the second index argument from the most recent call tosetSelectionInterval(),
    * addSelectionInterval() or removeSelectionInterval().
    * @returns lead selected index
    */
  def getLeadSelectedIndex(): scala.Double = js.native
  /**
    * Returns the selected indices as array.
    * @returns array of selected indices
    */
  def getSelectedIndices(): scala.Double = js.native
  /**
    * Returns the current selection mode.
    * @returns the current selection mode
    */
  def getSelectionMode(): scala.Double = js.native
  /**
    * Returns true if the specified index is selected.
    * @param iIndex undefined
    * @returns true if the specified index is selected.
    */
  def isSelectedIndex(iIndex: scala.Double): scala.Boolean = js.native
  /**
    * Moves all selected indices starting at the position <code>iStartIndex</code>
    * <code>iMove</code>items.This can be used if new items are inserted to the item set and you want to
    * keep the selection.To handle a deletion of items use <code>sliceSelectionInterval</code>.If this
    * call results in a change to the current selection or lead selection, then
    * a<code>SelectionChanged</code> event is fired.
    * @param iStartIndex start at this position
    * @param iMove undefined
    * @returns <code>this</code> to allow method chaining
    */
  def moveSelectionInterval(iStartIndex: scala.Double, iMove: scala.Double): SelectionModel = js.native
  /**
    * Changes the selection to be the set difference of the current selectionand the indices between
    * <code>iFromIndex</code> and <code>iToIndex</code> inclusive.If <code>iFromIndex</code> is smaller
    * than <code>iToIndex</code>, both parameters are swapped.If the range of removed selection indices
    * includes the current lead selection,then the lead selection will be unset (set to -1).If this call
    * results in a change to the current selection or lead selection, then a<code>SelectionChanged</code>
    * event is fired.
    * @param iFromIndex one end of the interval.
    * @param iToIndex other end of the interval
    * @returns <code>this</code> to allow method chaining
    */
  def removeSelectionInterval(iFromIndex: scala.Double, iToIndex: scala.Double): SelectionModel = js.native
  /**
    * Selects all rows up to the <code>iToIndex</iToIndex>.If this call results in a change to the current
    * selection, then a<code>SelectionChanged</code> event is fired.
    * @param iToIndex end of the interval
    * @returns <code>this</code> to allow method chaining
    */
  def selectAll(iToIndex: scala.Double): SelectionModel = js.native
  /**
    * Changes the selection to be equal to the range <code>iFromIndex</code> and
    * <code>iToIndex</code>inclusive. If <code>iFromIndex</code> is smaller than <code>iToIndex</code>,
    * both parameters are swapped.In <code>SINGLE_SELECTION</code> selection mode, only
    * <code>iToIndex</iToIndex> is used.If this call results in a change to the current selection, then
    * a<code>SelectionChanged</code> event is fired.
    * @param iFromIndex one end of the interval.
    * @param iToIndex other end of the interval
    * @returns <code>this</code> to allow method chaining
    */
  def setSelectionInterval(iFromIndex: scala.Double, iToIndex: scala.Double): SelectionModel = js.native
  /**
    * Sets the selection mode. The following list describes the acceptedselection
    * modes:<ul><li><code>sap.ui.model.SelectionModel.SINGLE_SELECTION</code> -  Only one list index can
    * be selected at a time. In this mode,  <code>setSelectionInterval</code> and
    * <code>addSelectionInterval</code> are  equivalent, both replacing the current selection with the
    * index  represented by the second argument (the
    * "lead").<li><code>sap.ui.model.SelectionModel.MULTI_SELECTION</code> -  In this mode, there's no
    * restriction on what can be selected.</ul>
    * @param iSelectionMode selection mode
    */
  def setSelectionMode(iSelectionMode: scala.Double): scala.Unit = js.native
  /**
    * Slices a the indices between the two indices from the selection.If <code>iFromIndex</code> is
    * smaller than <code>iToIndex</code>, both parameters are swapped.If the range of removed selection
    * indices includes the current lead selection,then the lead selection will be unset (set to -1).If
    * this call results in a change to the current selection or lead selection, then
    * a<code>SelectionChanged</code> event is fired.
    * @param iFromIndex one end of the interval.
    * @param iToIndex other end of the interval
    * @returns <code>this</code> to allow method chaining
    */
  def sliceSelectionInterval(iFromIndex: scala.Double, iToIndex: scala.Double): SelectionModel = js.native
}

