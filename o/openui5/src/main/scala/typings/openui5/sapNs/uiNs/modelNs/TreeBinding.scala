package typings.openui5.sapNs.uiNs.modelNs

import typings.openui5.TypeofFilterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.TreeBinding")
@js.native
class TreeBinding protected () extends Binding {
  /**
    * Constructor for TreeBinding
    * @param oModel undefined
    * @param sPath the path pointing to the tree / array that should be bound
    * @param oContext the context object for this databinding (optional)
    * @param aFilters predefined filter/s contained in an array (optional)
    * @param mParameters additional model specific parameters (optional)
    * @param aSorters predefined sap.ui.model.sorter/s contained in an array (optional)
    */
  def this(oModel: Model, sPath: String) = this()
  def this(oModel: Model, sPath: String, oContext: js.Any) = this()
  def this(oModel: Model, sPath: String, oContext: js.Any, aFilters: js.Array[_]) = this()
  def this(oModel: Model, sPath: String, oContext: js.Any, aFilters: js.Array[_], mParameters: js.Any) = this()
  def this(
    oModel: Model,
    sPath: String,
    oContext: js.Any,
    aFilters: js.Array[_],
    mParameters: js.Any,
    aSorters: js.Array[_]
  ) = this()
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

