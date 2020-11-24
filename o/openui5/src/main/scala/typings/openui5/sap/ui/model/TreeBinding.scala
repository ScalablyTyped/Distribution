package typings.openui5.sap.ui.model

import typings.openui5.anon.TypeofFilterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeBinding extends Binding {
  
  /**
    * Attach event-handler <code>fnFunction</code> to the '_filter' event of this
    * <code>sap.ui.model.TreeBinding</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def attachFilter(fnFunction: js.Any): Unit = js.native
  def attachFilter(fnFunction: js.Any, oListener: js.Any): Unit = js.native
  
  /**
    * Detach event-handler <code>fnFunction</code> from the '_filter' event of this
    * <code>sap.ui.model.TreeBinding</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def detachFilter(fnFunction: js.Any): Unit = js.native
  def detachFilter(fnFunction: js.Any, oListener: js.Any): Unit = js.native
  
  /**
    * Filters the tree according to the filter definitions.
    * @param aFilters Array of sap.ui.model.Filter objects
    * @param sFilterType Type of the filter which should be adjusted, if it is not given, the standard
    * behaviour applies
    */
  def filter(aFilters: js.Array[Filter], sFilterType: TypeofFilterType): Unit = js.native
  
  /**
    * Returns the number of child nodes of a specific context
    * @param oContext the context element of the node
    * @returns the number of children
    */
  def getChildCount(oContext: js.Any): Double = js.native
  
  /**
    * Returns the current value of the bound target
    * @param oContext the context element of the node
    * @param iStartIndex the startIndex where to start the retrieval of contexts
    * @param iLength determines how many contexts to retrieve beginning from the start index.
    * @returns the array of child contexts for the given node
    */
  def getNodeContexts(oContext: js.Any, iStartIndex: Double, iLength: Double): js.Array[_] = js.native
  def getNodeContexts(oContext: js.Any, iStartIndex: Double, iLength: Double, iThreshold: Double): js.Array[_] = js.native
  
  /**
    * Returns the current value of the bound target
    * @param iStartIndex the startIndex where to start the retrieval of contexts
    * @param iLength determines how many contexts to retrieve beginning from the start index.
    * @returns the array of child contexts for the root node
    */
  def getRootContexts(iStartIndex: Double, iLength: Double): js.Array[_] = js.native
  
  /**
    * Returns if the node has child nodes
    * @param oContext the context element of the node
    * @returns true if node has children
    */
  def hasChildren(oContext: Context): Boolean = js.native
  def hasChildren(oContext: Context, mParameters: js.Any): Boolean = js.native
  
  /**
    * Sorts the tree according to the sorter definitions.
    * @param aSorters Array of sap.ui.model.Sorter objects
    */
  def sort(aSorters: js.Array[Sorter]): ListBinding | Unit = js.native
  def sort(aSorters: Sorter): ListBinding | Unit = js.native
}
