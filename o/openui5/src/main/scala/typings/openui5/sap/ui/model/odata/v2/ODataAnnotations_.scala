package typings.openui5.sap.ui.model.odata.v2

import typings.jquery.JQueryPromise
import typings.openui5.sap.ui.base.EventProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ODataAnnotations_ extends EventProvider {
  
  /**
    * This event exists for compatibility with the old Annotation loaderAttaches the given callback to the
    * <code>allFailed</code> event. This event is fired when no annotation from a group ofsources was
    * successfully (loaded,) parsed and merged.The parameter <code>result</code> will be set on the event
    * argument and contains an array of Errors in the order in whichthe sources had been added.
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The event callback. This function will be called in the context of the oListener  
    *     object if given as the next argument.
    * @param oListener Object to use as context of the callback. If empty, the global context is used.
    * @returns <code>this</code>-reference to allow method chaining
    */
  def attachAllFailed(oData: js.Any, fnFunction: js.Any): ODataAnnotations = js.native
  def attachAllFailed(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ODataAnnotations = js.native
  
  /**
    * Attaches the given callback to the <code>error</code> event, which is fired whenever a source cannot
    * be loaded, parsed ormerged into the annotation data.The following parameters will be set on the
    * event object that is given to the callback function:  <code>source</code> - A map containing the
    * properties <code>type</code> - containing either "url" or "xml" - and <code>data</code> containing  
    *           the data given as source, either an URL or an XML string depending on how the source was
    * added.  <code>error</code>  - An Error object describing the problem that occurred
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The event callback. This function will be called in the context of the oListener  
    *     object if given as the next argument.
    * @param oListener Object to use as context of the callback. If empty, the global context is used.
    * @returns <code>this</code>-reference to allow method chaining
    */
  def attachError(oData: js.Any, fnFunction: js.Any): ODataAnnotations = js.native
  def attachError(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ODataAnnotations = js.native
  
  /**
    * Attaches the given callback to the <code>failed</code> event. This event is fired when at least one
    * annotation from a groupof sources was not successfully (loaded,) parsed or merged.The parameter
    * <code>result</code> will be set on the event argument and contains an array of Errors in the order
    * in whichthe sources had been added.
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The event callback. This function will be called in the context of the oListener  
    *     object if given as the next argument.
    * @param oListener Object to use as context of the callback. If empty, the global context is used.
    * @returns <code>this</code>-reference to allow method chaining
    */
  def attachFailed(oData: js.Any, fnFunction: js.Any): ODataAnnotations = js.native
  def attachFailed(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ODataAnnotations = js.native
  
  /**
    * Attaches the given callback to the <code>loaded</code> event. This event is fired when all
    * annotations from a group ofsources was successfully (loaded,) parsed and merged.The parameter
    * <code>result</code> will be set on the event argument and contains an array of all loaded sources as
    * wellas Errors in the order in which they had been added.
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The event callback. This function will be called in the context of the oListener  
    *     object if given as the next argument.
    * @param oListener Object to use as context of the callback. If empty, the global context is used.
    * @returns <code>this</code>-reference to allow method chaining
    */
  def attachLoaded(oData: js.Any, fnFunction: js.Any): ODataAnnotations = js.native
  def attachLoaded(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ODataAnnotations = js.native
  
  /**
    * This event exists for compatibility with the old Annotation loaderAttaches the given callback to the
    * <code>someLoaded</code> event. This event is fired when at least one annotation from agroup of
    * sources was successfully (loaded,) parsed and merged.The parameter <code>result</code> will be set
    * on the event argument and contains an array of all loaded sources as wellas Errors in the order in
    * which they had been added.
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The event callback. This function will be called in the context of the oListener  
    *     object if given as the next argument.
    * @param oListener Object to use as context of the callback. If empty, the global context is used.
    * @returns <code>this</code>-reference to allow method chaining
    */
  def attachSomeLoaded(oData: js.Any, fnFunction: js.Any): ODataAnnotations = js.native
  def attachSomeLoaded(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ODataAnnotations = js.native
  
  /**
    * Attaches the given callback to the <code>success</code> event, which is fired whenever a source has
    * been successfully(loaded,) parsed and merged into the annotation data.The following parameters will
    * be set on the event object that is given to the callback function:  <code>source</code> - A map
    * containing the properties <code>type</code> - containing either "url" or "xml" - and
    * <code>data</code> containing             the data given as source, either an URL or an XML string
    * depending on how the source was added.
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The event callback. This function will be called in the context of the oListener  
    *     object if given as the next argument.
    * @param oListener Object to use as context of the callback. If empty, the global context is used.
    * @returns <code>this</code>-reference to allow method chaining.
    */
  def attachSuccess(oData: js.Any, fnFunction: js.Any): ODataAnnotations = js.native
  def attachSuccess(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ODataAnnotations = js.native
  
  /**
    * Detaches the given callback from the <code>allFailed</code> event.The passed function and listener
    * object must match the ones previously used for attaching to the event.
    * @param fnFunction The event callback previously used with {@link
    * sap.ui.model.odata.v2.ODataAnnotations#attachFailed}.
    * @param oListener The same (if any) context object that was used when attaching to the
    * <code>error</code> event.
    * @returns <code>this</code>-reference to allow method chaining.
    */
  def detachAllFailed(fnFunction: js.Any): ODataAnnotations = js.native
  def detachAllFailed(fnFunction: js.Any, oListener: js.Any): ODataAnnotations = js.native
  
  /**
    * Detaches the given callback from the <code>error</code> event.The passed function and listener
    * object must match the ones previously used for attaching to the event.
    * @param fnFunction The event callback previously used with {@link
    * sap.ui.model.odata.v2.ODataAnnotations#attachError}.
    * @param oListener The same (if any) context object that was used when attaching to the
    * <code>error</code> event.
    * @returns <code>this</code>-reference to allow method chaining.
    */
  def detachError(fnFunction: js.Any): ODataAnnotations = js.native
  def detachError(fnFunction: js.Any, oListener: js.Any): ODataAnnotations = js.native
  
  /**
    * Detaches the given callback from the <code>failed</code> event.The passed function and listener
    * object must match the ones previously used for attaching to the event.
    * @param fnFunction The event callback previously used with {@link
    * sap.ui.model.odata.v2.ODataAnnotations#attachFailed}.
    * @param oListener The same (if any) context object that was used when attaching to the
    * <code>error</code> event.
    * @returns <code>this</code>-reference to allow method chaining.
    */
  def detachFailed(fnFunction: js.Any): ODataAnnotations = js.native
  def detachFailed(fnFunction: js.Any, oListener: js.Any): ODataAnnotations = js.native
  
  /**
    * Detaches the given callback from the <code>loaded</code> event.The passed function and listener
    * object must match the ones previously used for attaching to the event.
    * @param fnFunction The event callback previously used with {@link
    * sap.ui.model.odata.v2.ODataAnnotations#attachLoaded}.
    * @param oListener The same (if any) context object that was used when attaching to the
    * <code>error</code> event.
    * @returns <code>this</code>-reference to allow method chaining.
    */
  def detachLoaded(fnFunction: js.Any): ODataAnnotations = js.native
  def detachLoaded(fnFunction: js.Any, oListener: js.Any): ODataAnnotations = js.native
  
  /**
    * Detaches the given callback from the <code>someLoaded</code> event.The passed function and listener
    * object must match the ones previously used for attaching to the event.
    * @param fnFunction The event callback previously used with {@link
    * sap.ui.model.odata.v2.ODataAnnotations#attachSomeLoaded}.
    * @param oListener The same (if any) context object that was used when attaching to the
    * <code>error</code> event.
    * @returns <code>this</code>-reference to allow method chaining.
    */
  def detachSomeLoaded(fnFunction: js.Any): ODataAnnotations = js.native
  def detachSomeLoaded(fnFunction: js.Any, oListener: js.Any): ODataAnnotations = js.native
  
  /**
    * Detaches the given callback from the <code>success</code> event.The passed function and listener
    * object must match the ones previously used for attaching to the event.
    * @param fnFunction The event callback previously used with {@link
    * sap.ui.model.odata.v2.ODataAnnotations#attachSuccess}.
    * @param oListener The same (if any) context object that was used when attaching to the
    * <code>success</code> event.
    * @returns <code>this</code>-reference to allow method chaining.
    */
  def detachSuccess(fnFunction: js.Any): ODataAnnotations = js.native
  def detachSuccess(fnFunction: js.Any, oListener: js.Any): ODataAnnotations = js.native
  
  /**
    * V1 API Compatibility method. @see sap.ui.model.odata.v2.ODataAnnotations#getDataReturns the parsed
    * and merged annotation data object
    * @returns returns annotations data
    */
  def getAnnotationsData(): js.Any = js.native
  
  /**
    * Returns the parsed and merged annotation data object
    * @returns returns annotations data
    */
  def getData(): js.Any = js.native
  
  /**
    * Returns a promise that resolves when the annotation sources that were added up to this point were
    * successfully(loaded,) parsed and merged
    * @returns The Promise that resolves/rejects after the last added sources have been processed
    */
  def loaded(): JQueryPromise[_] = js.native
  
  /**
    * Set custom headers which are provided in a key/value map. These headers are used for all
    * requests.The "Accept-Language" header cannot be modified and is set using the core's language
    * setting.To remove these headers, simply set the <code>mHeaders</code> parameter to <code>{}</code>.
    * Please also note that when calling this methodagain all previous custom headers are removed unless
    * they are specified again in the <code>mCustomHeaders</code> parameter.
    * @param mHeaders the header name/value map.
    */
  def setHeaders(mHeaders: js.Any): Unit = js.native
}
