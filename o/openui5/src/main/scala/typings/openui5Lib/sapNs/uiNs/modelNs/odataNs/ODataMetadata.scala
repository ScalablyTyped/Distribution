package typings
package openui5Lib.sapNs.uiNs.modelNs.odataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.ODataMetadata")
@js.native
class ODataMetadata protected ()
  extends openui5Lib.sapNs.uiNs.baseNs.EventProvider {
  /**
    * Constructor for a new ODataMetadata.
    * @param sMetadataURI needs the correct metadata uri including $metadata
    * @param mParams optional map of parameters.
    */
  def this(sMetadataURI: java.lang.String) = this()
  def this(sMetadataURI: java.lang.String, mParams: js.Any) = this()
  /**
    * Attach event-handler <code>fnFunction</code> to the 'failed' event of this
    * <code>sap.ui.model.odata.ODataMetadata</code>.
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, the global context (window)
    * is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachFailed(oData: js.Any, fnFunction: js.Any): ODataMetadata = js.native
  def attachFailed(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ODataMetadata = js.native
  /**
    * Attach event-handler <code>fnFunction</code> to the 'loaded' event of this
    * <code>sap.ui.model.odata.ODataMetadata</code>.
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, the global context (window)
    * is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachLoaded(oData: js.Any, fnFunction: js.Any): ODataMetadata = js.native
  def attachLoaded(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ODataMetadata = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'failed' event of this
    * <code>sap.ui.model.odata.ODataMetadata</code>.The passed function and listener object must match the
    * ones previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachFailed(fnFunction: js.Any, oListener: js.Any): ODataMetadata = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'loaded' event of this
    * <code>sap.ui.model.odata.ODataMetadata</code>.The passed function and listener object must match the
    * ones previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachLoaded(fnFunction: js.Any, oListener: js.Any): ODataMetadata = js.native
  /**
    * Fire event failed to attached listeners.
    * @param mArguments the arguments to pass along with the event.
    * @returns <code>this</code> to allow method chaining
    */
  def fireFailed(mArguments: js.Any): ODataMetadata = js.native
  /**
    * Fire event loaded to attached listeners.
    * @returns <code>this</code> to allow method chaining
    */
  def fireLoaded(): ODataMetadata = js.native
  /**
    * Return the metadata object
    * @returns metdata object
    */
  def getServiceMetadata(): js.Any = js.native
  /**
    * Get the the use-batch extension value if any
    * @returns true/false
    */
  def getUseBatch(): scala.Boolean = js.native
  /**
    * Checks whether metadata loading has already failed
    * @returns returns whether metadata request has failed
    */
  def isFailed(): scala.Boolean = js.native
  /**
    * Checks whether metadata is available
    * @returns returns whether metadata is already loaded
    */
  def isLoaded(): scala.Boolean = js.native
  /**
    * Returns a promise for the loaded state of the metadata
    * @returns returns a promise on metadata loaded state
    */
  def loaded(): jqueryLib.JQueryPromise[_] = js.native
  /**
    * Refreshes the metadata creating a new request to the server.Returns a new promise which can be
    * resolved or rejected depending on the metadata loading state.
    * @returns returns a promise on metadata loaded state
    */
  def refresh(): jqueryLib.JQueryPromise[_] = js.native
}

