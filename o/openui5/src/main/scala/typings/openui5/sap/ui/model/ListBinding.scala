package typings.openui5.sap.ui.model

import typings.openui5.anon.TypeofFilterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBinding extends Binding {
  
  /**
    * Attach event-handler <code>fnFunction</code> to the 'filter' event of this
    * <code>sap.ui.model.ListBinding</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def attachFilter(fnFunction: js.Any): Unit = js.native
  def attachFilter(fnFunction: js.Any, oListener: js.Any): Unit = js.native
  
  /**
    * Attach event-handler <code>fnFunction</code> to the 'sort' event of this
    * <code>sap.ui.model.ListBinding</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def attachSort(fnFunction: js.Any): Unit = js.native
  def attachSort(fnFunction: js.Any, oListener: js.Any): Unit = js.native
  
  /**
    * Detach event-handler <code>fnFunction</code> from the 'filter' event of this
    * <code>sap.ui.model.ListBinding</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def detachFilter(fnFunction: js.Any): Unit = js.native
  def detachFilter(fnFunction: js.Any, oListener: js.Any): Unit = js.native
  
  /**
    * Detach event-handler <code>fnFunction</code> from the 'sort' event of this
    * <code>sap.ui.model.ListBinding</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def detachSort(fnFunction: js.Any): Unit = js.native
  def detachSort(fnFunction: js.Any, oListener: js.Any): Unit = js.native
  
  /**
    * Filters the list according to the filter definitions
    * @param aFilters Array of filter objects
    * @param sFilterType Type of the filter which should be adjusted, if it is not given, the standard
    * behaviour applies
    * @returns returns <code>this</code> to facilitate method chaining
    */
  def filter(aFilters: js.Array[_], sFilterType: TypeofFilterType): ListBinding = js.native
  
  /**
    * Returns an array of binding contexts for the bound target list.<strong>Note:</strong>The public
    * usage of this method is deprecated, as calls from outside of controls will leadto unexpected side
    * effects. For avoidance use {@link sap.ui.model.ListBinding.prototype.getCurrentContexts}instead.
    * @param iStartIndex the startIndex where to start the retrieval of contexts
    * @param iLength determines how many contexts to retrieve beginning from the start index.
    * @returns the array of contexts for each row of the bound list
    */
  def getContexts(iStartIndex: Double): js.Array[Context] = js.native
  def getContexts(iStartIndex: Double, iLength: Double): js.Array[Context] = js.native
  
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
  def getDistinctValues(sPath: String): js.Array[_] = js.native
  
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
  def getLength(): Double = js.native
  
  /**
    * Indicates whether grouping is enabled for the binding.Grouping is enabled for a list binding, if at
    * least one sorter exists on the binding and the first sorteris a grouping sorter.
    * @returns whether grouping is enabled
    */
  def isGrouped(): Boolean = js.native
  
  /**
    * Returns whether the length which can be retrieved using getLength() is a known, final length,or an
    * preliminary or estimated length which may change if further data is requested.
    * @since 1.24
    * @returns returns whether the length is final
    */
  def isLengthFinal(): Boolean = js.native
  
  /**
    * Sorts the list according to the sorter object
    * @param aSorters the Sorter object or an array of sorters which defines the sort order
    * @returns returns <code>this</code> to facilitate method chaining
    */
  def sort(aSorters: js.Array[Sorter]): ListBinding | Unit = js.native
  def sort(aSorters: Sorter): ListBinding | Unit = js.native
}
