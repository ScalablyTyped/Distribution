package typings.openui5.sap.ui.model.odata

import typings.jquery.JQueryPromise
import typings.openui5.sap.ui.base.EventProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.ODataAnnotations")
@js.native
class ODataAnnotations protected () extends EventProvider {
  def this(aAnnotationURI: String, oMetadata: ODataMetadata, mParams: js.Any) = this()
  def this(aAnnotationURI: js.Array[String], oMetadata: ODataMetadata, mParams: js.Any) = this()
  /**
    * Adds either one URL or an array of URLs to be loaded and parsed. The result will be merged into the
    * annotationsdata which can be retrieved using the getAnnotations-method.
    * @param vUrl Either one URL as string or an array of URL strings
    * @returns The Promise to load the given URL(s), resolved if all URLs have been loaded, rejected if at
    *        least one failed to load. The argument is an object containing the annotations object,
    * success (an array        of sucessfully loaded URLs), fail (an array ob of failed URLs).
    */
  def addUrl(vUrl: String): JQueryPromise[_] = js.native
  def addUrl(vUrl: js.Array[String]): JQueryPromise[_] = js.native
  /**
    * Attach event-handler <code>fnFunction</code> to the 'failed' event of this
    * <code>sap.ui.model.odata.ODataAnnotations</code>.
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, the global context (window)
    * is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachFailed(oData: js.Any, fnFunction: js.Any): ODataAnnotations = js.native
  def attachFailed(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ODataAnnotations = js.native
  /**
    * Attach event-handler <code>fnFunction</code> to the 'loaded' event of this
    * <code>sap.ui.model.odata.ODataAnnotations</code>.
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, the global context (window)
    * is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachLoaded(oData: js.Any, fnFunction: js.Any): ODataAnnotations = js.native
  def attachLoaded(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ODataAnnotations = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'failed' event of this
    * <code>sap.ui.model.odata.ODataAnnotations</code>.The passed function and listener object must match
    * the ones previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachFailed(fnFunction: js.Any, oListener: js.Any): ODataAnnotations = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'loaded' event of this
    * <code>sap.ui.model.odata.ODataAnnotations</code>.The passed function and listener object must match
    * the ones previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachLoaded(fnFunction: js.Any, oListener: js.Any): ODataAnnotations = js.native
  /**
    * Fire event failed to attached listeners.
    * @param mArguments the arguments to pass along with the event.
    * @returns <code>this</code> to allow method chaining
    */
  def fireFailed(mArguments: js.Any): ODataAnnotations = js.native
  /**
    * Fire event loaded to attached listeners.
    * @param mArguments Map of arguments that will be given as parameters to teh event handler
    * @returns <code>this</code> to allow method chaining
    */
  def fireLoaded(mArguments: js.Any): ODataAnnotations = js.native
  /**
    * returns the raw annotation data
    * @returns returns annotations data
    */
  def getAnnotationsData(): js.Any = js.native
  /**
    * Checks whether annotations loading of at least one of the given URLs has already failed.Note: For
    * asynchronous annotations {@link #attachFailed} has to be used.
    * @returns whether annotations request has failed
    */
  def isFailed(): Boolean = js.native
  /**
    * Checks whether annotations from at least one source are available
    * @returns returns whether annotations is already loaded
    */
  def isLoaded(): Boolean = js.native
  /**
    * Set custom headers which are provided in a key/value map. These headers are used for all
    * requests.The Accept-Language header cannot be modified and is set using the Core's language
    * setting.To remove these headers simply set the mHeaders parameter to {}. Please also note that when
    * calling this methodagain all previous custom headers are removed unless they are specified again in
    * the mCustomHeaders parameter.
    * @param mHeaders the header name/value map.
    */
  def setHeaders(mHeaders: js.Any): Unit = js.native
  /**
    * Sets an XML document
    * @param oXMLDocument The XML document to parse for annotations
    * @param sXMLContent The XML content as string to parse for annotations
    * @param mOptions Additional options
    * @returns Whether or not parsing was successful
    */
  def setXML(oXMLDocument: js.Any, sXMLContent: String): Boolean = js.native
  def setXML(oXMLDocument: js.Any, sXMLContent: String, mOptions: js.Any): Boolean = js.native
}

