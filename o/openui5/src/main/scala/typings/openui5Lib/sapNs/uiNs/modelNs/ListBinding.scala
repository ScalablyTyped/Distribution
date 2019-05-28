package typings
package openui5Lib.sapNs.uiNs.modelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.ListBinding")
@js.native
class ListBinding protected () extends Binding {
  /**
    * Constructor for ListBinding
    * @param oModel undefined
    * @param sPath undefined
    * @param oContext undefined
    * @param aSorters initial sort order (can be either a sorter or an array of sorters)
    * @param aFilters predefined filter/s (can be either a filter or an array of filters)
    * @param mParameters undefined
    */
  def this(oModel: Model, sPath: java.lang.String, oContext: Context) = this()
  def this(oModel: Model, sPath: java.lang.String, oContext: Context, aSorters: js.Array[_]) = this()
  def this(oModel: Model, sPath: java.lang.String, oContext: Context, aSorters: js.Array[_], aFilters: js.Array[_]) = this()
  def this(oModel: Model, sPath: java.lang.String, oContext: Context, aSorters: js.Array[_], aFilters: js.Array[_], mParameters: js.Any) = this()
  /**
    * Attach event-handler <code>fnFunction</code> to the 'filter' event of this
    * <code>sap.ui.model.ListBinding</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def attachFilter(fnFunction: js.Any): scala.Unit = js.native
  def attachFilter(fnFunction: js.Any, oListener: js.Any): scala.Unit = js.native
  /**
    * Attach event-handler <code>fnFunction</code> to the 'sort' event of this
    * <code>sap.ui.model.ListBinding</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def attachSort(fnFunction: js.Any): scala.Unit = js.native
  def attachSort(fnFunction: js.Any, oListener: js.Any): scala.Unit = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'filter' event of this
    * <code>sap.ui.model.ListBinding</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def detachFilter(fnFunction: js.Any): scala.Unit = js.native
  def detachFilter(fnFunction: js.Any, oListener: js.Any): scala.Unit = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'sort' event of this
    * <code>sap.ui.model.ListBinding</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def detachSort(fnFunction: js.Any): scala.Unit = js.native
  def detachSort(fnFunction: js.Any, oListener: js.Any): scala.Unit = js.native
  /**
    * Filters the list according to the filter definitions
    * @param aFilters Array of filter objects
    * @param sFilterType Type of the filter which should be adjusted, if it is not given, the standard
    * behaviour applies
    * @returns returns <code>this</code> to facilitate method chaining
    */
  def filter(aFilters: js.Array[_], sFilterType: openui5Lib.TypeofFilterType): ListBinding = js.native
  /**
    * Returns an array of binding contexts for the bound target list.<strong>Note:</strong>The public
    * usage of this method is deprecated, as calls from outside of controls will leadto unexpected side
    * effects. For avoidance use {@link sap.ui.model.ListBinding.prototype.getCurrentContexts}instead.
    * @param iStartIndex the startIndex where to start the retrieval of contexts
    * @param iLength determines how many contexts to retrieve beginning from the start index.
    * @returns the array of contexts for each row of the bound list
    */
  def getContexts(iStartIndex: scala.Double): js.Array[Context] = js.native
  def getContexts(iStartIndex: scala.Double, iLength: scala.Double): js.Array[Context] = js.native
  /**
    * Returns an array of currently used binding contexts of the bound controlThis method does not trigger
    * any data requests from the backend or delta calculation, but just returns the contextarray as last
    * requested by the control. This can be used by the application to get access to the data
    * currentlydisplayed by a list control.
    * @since 1.28
    * @returns the array of contexts for each row of the bound list
    */
  def getCurrentContexts(): js.Array[Context] = js.native
  /**
    * Returns list of distinct values for the given relative binding path
    * @param sPath the relative binding path
    * @returns the array of distinct values.
    */
  def getDistinctValues(): js.Array[_] = js.native
  def getDistinctValues(sPath: java.lang.String): js.Array[_] = js.native
  /**
    * Gets the group for the given context.Must only be called if isGrouped() returns that grouping is
    * enabled for this binding. The grouping will beperformed using the first sorter (in case multiple
    * sorters are defined).
    * @param oContext the binding context
    * @returns the group object containing a key property and optional custom properties
    */
  def getGroup(oContext: Context): js.Any = js.native
  /**
    * Returns the number of entries in the list. This might be an estimated or preliminary length, in
    * casethe full length is not known yet, see method isLengthFinal().
    * @since 1.24
    * @returns returns the number of entries in the list
    */
  def getLength(): scala.Double = js.native
  /**
    * Indicates whether grouping is enabled for the binding.Grouping is enabled for a list binding, if at
    * least one sorter exists on the binding and the first sorteris a grouping sorter.
    * @returns whether grouping is enabled
    */
  def isGrouped(): scala.Boolean = js.native
  /**
    * Returns whether the length which can be retrieved using getLength() is a known, final length,or an
    * preliminary or estimated length which may change if further data is requested.
    * @since 1.24
    * @returns returns whether the length is final
    */
  def isLengthFinal(): scala.Boolean = js.native
  /**
    * Sorts the list according to the sorter object
    * @param aSorters the Sorter object or an array of sorters which defines the sort order
    * @returns returns <code>this</code> to facilitate method chaining
    */
  def sort(aSorters: js.Array[Sorter]): ListBinding | scala.Unit = js.native
  def sort(aSorters: Sorter): ListBinding | scala.Unit = js.native
}

