package typings.openui5.sap.ui.model

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeBindingAdapter extends StObject {
  
  /**
    * Calculate the request length based on the given information
    * @param iMaxGroupSize the maximum group size
    * @param oSection the information of the current section
    */
  def _calculateRequestLength(iMaxGroupSize: Double, oSection: js.Any): Unit = js.native
  
  /**
    * Attach event-handler <code>fnFunction</code> to the 'selectionChanged' event of this
    * <code>sap.ui.model.SelectionModel</code>.<br/>Event is fired if the selection of tree nodes is
    * changed in any way.
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, this Model is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachSelectionChanged(oData: js.Any, fnFunction: js.Any): SelectionModel = js.native
  def attachSelectionChanged(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SelectionModel = js.native
  
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
    * Retrieves the requested part from the tree and returns node objects.
    * @param iStartIndex undefined
    * @param iLength undefined
    * @param iThreshold undefined
    * @returns Tree Node
    */
  def getNodes(iStartIndex: js.Any, iLength: js.Any, iThreshold: js.Any): js.Any = js.native
}
