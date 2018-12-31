package typings
package openui5Lib.sapNs.uiNs.modelNs.odataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.ODataModel")
@js.native
class ODataModel protected ()
  extends openui5Lib.sapNs.uiNs.modelNs.Model {
  /**
    * Constructor for a new ODataModel.
    * @param sServiceUrl base uri of the service to request data from; additional URL parameters appended
    * here will be appended to every request								can be passed with the mParameters object as well:
    * [mParameters.serviceUrl] A serviceURl is required!
    * @param mParameters (optional) a map which contains the following parameter properties:
    */
  def this(sServiceUrl: java.lang.String) = this()
  def this(sServiceUrl: java.lang.String, mParameters: js.Any) = this()
  /**
    * Adds (a) new URL(s) to the be parsed for OData annotations, which are then merged into the
    * annotations objectwhich can be retrieved by calling the getServiceAnnotations()-method. If a
    * $metadata url is passed the data willalso be merged into the metadata object, which can be reached
    * by calling the getServiceMetadata() method.
    * @param vUrl Either one URL as string or an array or URL strings
    * @returns The Promise to load the given URL(s), resolved if all URLs have been loaded, rejected if at
    * least one fails to load.					 If this promise resolves it returns the following parameters:					
    * annotations: The annotation object					 entitySets: An array of EntitySet objects containing the
    * newly merged EntitySets from a $metadata requests.								 the structure is the same as in the
    * metadata object reached by the getServiceMetadata() method.								 For non $metadata requests the
    * array will be empty.
    */
  def addAnnotationUrl(vUrl: java.lang.String): jqueryLib.JQueryPromise[_] = js.native
  def addAnnotationUrl(vUrl: js.Array[java.lang.String]): jqueryLib.JQueryPromise[_] = js.native
  /**
    * Adds new xml content to be parsed for OData annotations, which are then merged into the annotations
    * object whichcan be retrieved by calling the getServiceAnnotations()-method.
    * @param sXMLContent The string that should be parsed as annotation XML
    * @param bSuppressEvents Whether not to fire annotationsLoaded event on the annotationParser
    * @returns The Promise to parse the given XML-String, resolved if parsed without errors, rejected if
    * errors occur
    */
  def addAnnotationXML(sXMLContent: java.lang.String): jqueryLib.JQueryPromise[_] = js.native
  def addAnnotationXML(sXMLContent: java.lang.String, bSuppressEvents: scala.Boolean): jqueryLib.JQueryPromise[_] = js.native
  /**
    * Appends the change batch operations to the end of the batch stack. Only PUT, POST or DELETE batch
    * operations should be included in the specified array.The operations in the array will be included in
    * a single changeset. To embed change operations in different change sets call this method with the
    * corresponding change operations again.If an illegal batch operation is added to the change set
    * nothing will be performed and false will be returned.
    * @param aChangeOperations an array of change batch operations created via
    * <code>createBatchOperation</code> and <code>sMethod</code> = POST, PUT, MERGE or DELETE
    */
  def addBatchChangeOperations(aChangeOperations: js.Array[_]): scala.Unit = js.native
  /**
    * Appends the read batch operations to the end of the batch stack. Only GET batch operations should be
    * included in the specified array.If an illegal batch operation is added to the batch nothing will be
    * performed and false will be returned.
    * @param aReadOperations an array of read batch operations created via
    * <code>createBatchOperation</code> and <code>sMethod</code> = GET
    */
  def addBatchReadOperations(aReadOperations: js.Array[_]): scala.Unit = js.native
  /**
    * Attach event-handler <code>fnFunction</code> to the 'annotationsFailed' event of this
    * <code>sap.ui.model.odata.ODataModel</code>.
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, the global context (window)
    * is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachAnnotationsFailed(oData: js.Any, fnFunction: js.Any): ODataModel = js.native
  def attachAnnotationsFailed(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ODataModel = js.native
  /**
    * Attach event-handler <code>fnFunction</code> to the 'annotationsLoaded' event of this
    * <code>sap.ui.model.odata.ODataModel</code>.
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, the global context (window)
    * is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachAnnotationsLoaded(oData: js.Any, fnFunction: js.Any): ODataModel = js.native
  def attachAnnotationsLoaded(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ODataModel = js.native
  /**
    * Attach event-handler <code>fnFunction</code> to the 'metadataFailed' event of this
    * <code>sap.ui.model.odata.ODataModel</code>.
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, the global context (window)
    * is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachMetadataFailed(oData: js.Any, fnFunction: js.Any): ODataModel = js.native
  def attachMetadataFailed(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ODataModel = js.native
  /**
    * Attach event-handler <code>fnFunction</code> to the 'metadataLoaded' event of this
    * <code>sap.ui.model.odata.ODataModel</code>.
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, the global context (window)
    * is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachMetadataLoaded(oData: js.Any, fnFunction: js.Any): ODataModel = js.native
  def attachMetadataLoaded(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ODataModel = js.native
  /**
    * Trigger a request to the function import odata service that was specified in the model constructor.
    * @param sFunctionName A string containing the name of the function to call.		The name is concatenated
    * to the sServiceUrl which was specified in the model constructor.
    * @param mParameters Optional parameter map containing any of the following properties:
    * @returns an object which has an <code>abort</code> function to abort the current request.
    */
  def callFunction(sFunctionName: java.lang.String): js.Any = js.native
  def callFunction(sFunctionName: java.lang.String, mParameters: js.Any): js.Any = js.native
  /**
    * Removes all operations in the current batch.
    */
  def clearBatch(): scala.Unit = js.native
  /**
    * Trigger a POST request to the odata service that was specified in the model constructor. Please note
    * that deep creates are not supportedand may not work.
    * @param sPath A string containing the path to the collection where an entry		should be created. The
    * path is concatenated to the sServiceUrl		which was specified in the model constructor.
    * @param oData data of the entry that should be created.
    * @param mParameters Optional parameter map containing any of the following properties:
    * @returns an object which has an <code>abort</code> function to abort the current request.
    */
  def create(sPath: java.lang.String, oData: js.Any): js.Any = js.native
  def create(sPath: java.lang.String, oData: js.Any, mParameters: js.Any): js.Any = js.native
  /**
    * Creates a single batch operation (read or change operation) which can be used in a batch request.
    * @param sPath A string containing the path to the collection or entry where the batch operation
    * should be performed.						The path is concatenated to the sServiceUrl which was specified in the
    * model constructor.
    * @param sMethod for the batch operation. Possible values are GET, PUT, MERGE, POST, DELETE
    * @param oData optional data payload which should be created, updated, deleted in a change batch
    * operation.
    * @param oParameters optional parameter for additional information introduced in SAPUI5 1.9.1,
    */
  def createBatchOperation(sPath: java.lang.String, sMethod: java.lang.String): scala.Unit = js.native
  def createBatchOperation(sPath: java.lang.String, sMethod: java.lang.String, oData: js.Any): scala.Unit = js.native
  def createBatchOperation(sPath: java.lang.String, sMethod: java.lang.String, oData: js.Any, oParameters: js.Any): scala.Unit = js.native
  def createEntry(sPath: java.lang.String, vProperties: js.Any): openui5Lib.sapNs.uiNs.modelNs.Context = js.native
  /**
    * Creates a new entry object which is described by the metadata of the entity type of thespecified
    * sPath Name. A context object is returned which can be used to bindagainst the newly created
    * object.For each created entry a request is created and stored in a request queue.The request queue
    * can be submitted by calling submitChanges. To delete a createdentry from the request queue call
    * deleteCreateEntry.The optional vProperties parameter can be used as follows:  - vProperties could be
    * an array containing the property names which should be included    in the new entry. Other
    * properties defined in the entity type are not included.  - vProperties could be an object which
    * includes the desired properties and the values    which should be used for the created entry.If
    * vProperties is not specified, all properties in the entity type will be included in thecreated
    * entry.If there are no values specified the properties will have undefined values.Please note that
    * deep creates (including data defined by navigationproperties) are not supported
    * @param sPath Name of the path to the collection
    * @param vProperties An array that specifies a set of properties or the entry
    * @returns oContext A Context object that point to the new created entry.
    */
  def createEntry(sPath: java.lang.String, vProperties: js.Array[_]): openui5Lib.sapNs.uiNs.modelNs.Context = js.native
  /**
    * Creates the key from the given collection name and property map
    * @param sCollection The name of the collection
    * @param oKeyParameters The object containing at least all the key properties of the entity type
    * @param bDecode Whether the URI decoding should be applied on the key
    */
  def createKey(sCollection: java.lang.String, oKeyParameters: js.Any, bDecode: scala.Boolean): scala.Unit = js.native
  /**
    * Deletes a created entry from the request queue and the model.
    * @param oContext The context object pointing to the created entry
    */
  def deleteCreatedEntry(oContext: openui5Lib.sapNs.uiNs.modelNs.Context): scala.Unit = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'annotationsFailed' event of this
    * <code>sap.ui.model.odata.ODataModel</code>.The passed function and listener object must match the
    * ones previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachAnnotationsFailed(fnFunction: js.Any, oListener: js.Any): ODataModel = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'annotationsLoaded' event of this
    * <code>sap.ui.model.odata.ODataModel</code>.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachAnnotationsLoaded(fnFunction: js.Any, oListener: js.Any): ODataModel = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'metadataFailed' event of this
    * <code>sap.ui.model.odata.ODataModel</code>.The passed function and listener object must match the
    * ones previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachMetadataFailed(fnFunction: js.Any, oListener: js.Any): ODataModel = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'metadataLoaded' event of this
    * <code>sap.ui.model.odata.ODataModel</code>.The passed function and listener object must match the
    * ones previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachMetadataLoaded(fnFunction: js.Any, oListener: js.Any): ODataModel = js.native
  /**
    * Fire event annotationsFailed to attached listeners.
    * @param mArguments the arguments to pass along with the event.
    * @returns <code>this</code> to allow method chaining
    */
  def fireAnnotationsFailed(mArguments: js.Any): ODataModel = js.native
  /**
    * Fire event annotationsLoaded to attached listeners.
    * @param mArguments the arguments to pass along with the event.
    * @returns <code>this</code> to allow method chaining
    */
  def fireAnnotationsLoaded(mArguments: js.Any): ODataModel = js.native
  /**
    * Fire event metadataFailed to attached listeners.
    * @param mArguments the arguments to pass along with the event.
    * @returns <code>this</code> to allow method chaining
    */
  def fireMetadataFailed(mArguments: js.Any): ODataModel = js.native
  /**
    * Fire event metadataLoaded to attached listeners.
    * @param mArguments the arguments to pass along with the event.
    * @returns <code>this</code> to allow method chaining
    */
  def fireMetadataLoaded(mArguments: js.Any): ODataModel = js.native
  /**
    * Force no caching
    * @param bForceNoCache whether to force no caching
    */
  def forceNoCache(bForceNoCache: scala.Boolean): scala.Unit = js.native
  /**
    * Return requested data as object if the data has already been loaded and stored in the model.
    * @param sPath A string containing the path to the data object that should be returned.
    * @param oContext the optional context which is used with the sPath to retrieve the requested data.
    * @param bIncludeExpandEntries This parameter should be set when a URI or custom parameterwith a
    * $expand System Query Option was used to retrieve associated entries embedded/inline.If true then the
    * getProperty function returns a desired property value/entry and includes the associated expand
    * entries (if any).If false the associated/expanded entry properties are removed and not included in
    * thedesired entry as properties at all. This is useful for performing updates on the base entry only.
    * Note: A copy and not a reference of the entry will be returned.
    * @returns oData Object containing the requested data if the path is valid.
    */
  def getData(sPath: java.lang.String): js.Any = js.native
  def getData(sPath: java.lang.String, oContext: js.Any): js.Any = js.native
  def getData(sPath: java.lang.String, oContext: js.Any, bIncludeExpandEntries: scala.Boolean): js.Any = js.native
  /**
    * Returns the default count mode for retrieving the count of collections
    * @since 1.20
    */
  def getDefaultCountMode(): openui5Lib.Anon_Request = js.native
  /**
    * Returns all headers and custom headers which are stored in the OData model.
    * @returns the header map
    */
  def getHeaders(): js.Any = js.native
  /**
    * Returns the key part from the entry URI or the given context or object
    * @param oObject The context or object
    * @param bDecode Whether the URI decoding should be applied on the key
    */
  def getKey(oObject: js.Any, bDecode: scala.Boolean): scala.Unit = js.native
  def getKey(oObject: openui5Lib.sapNs.uiNs.modelNs.Context, bDecode: scala.Boolean): scala.Unit = js.native
  def getProperty(sPath: java.lang.String, oContext: js.Any, bIncludeExpandEntries: scala.Boolean): js.Any = js.native
  /**
    * Returns the current security token. If the token has not been requested from the server it will be
    * requested first.
    * @returns the CSRF security token
    */
  def getSecurityToken(): java.lang.String = js.native
  /**
    * Return the annotation object. Please note that when using the model with bLoadMetadataAsync = true
    * then this function might return undefined because themetadata has not been loaded yet.In this case
    * attach to the <code>annotationsLoaded</code> event to get notified when the annotations are
    * available and then call this function.
    * @returns metdata object
    */
  def getServiceAnnotations(): js.Any = js.native
  /**
    * Return the metadata object. Please note that when using the model with bLoadMetadataAsync = true
    * then this function might return undefined because themetadata has not been loaded yet.In this case
    * attach to the <code>metadataLoaded</code> event to get notified when the metadata is available and
    * then call this function.
    * @returns metdata object
    */
  def getServiceMetadata(): js.Any = js.native
  /**
    * Checks if there exist pending changes in the model created by the setProperty method.
    * @returns true/false
    */
  def hasPendingChanges(): scala.Boolean = js.native
  /**
    * Returns whether this model supports the $count on its collectionsThis method is deprecated, please
    * use getDefaultCountMode instead.
    */
  def isCountSupported(): scala.Boolean = js.native
  /**
    * Trigger a GET request to the odata service that was specified in the model constructor.The data will
    * not be stored in the model. The requested data is returned with the response.
    * @param sPath A string containing the path to the data which should		be retrieved. The path is
    * concatenated to the sServiceUrl		which was specified in the model constructor.
    * @param mParameters Optional parameter map containing any of the following properties:
    * @returns an object which has an <code>abort</code> function to abort the current request.
    */
  def read(sPath: java.lang.String): js.Any = js.native
  def read(sPath: java.lang.String, mParameters: js.Any): js.Any = js.native
  def refresh(bForceUpdate: scala.Boolean, bRemoveData: scala.Boolean): scala.Unit = js.native
  /**
    * refreshes the metadata for model, e.g. in case the first request for metadata has failed
    */
  def refreshMetadata(): scala.Unit = js.native
  /**
    * refresh XSRF token by performing a GET request against the service root URL.
    * @param fnSuccess a callback function which is called when the data has           					 been
    * successfully retrieved.
    * @param fnError a callback function which is called when the request failed. The handler can have the
    * parameter: oError which contains additional error information.
    * @param bAsync true for asynchronous requests.
    * @returns an object which has an <code>abort</code> function to abort the current request.
    */
  def refreshSecurityToken(): js.Any = js.native
  def refreshSecurityToken(fnSuccess: js.Any): js.Any = js.native
  def refreshSecurityToken(fnSuccess: js.Any, fnError: js.Any): js.Any = js.native
  def refreshSecurityToken(fnSuccess: js.Any, fnError: js.Any, bAsync: scala.Boolean): js.Any = js.native
  /**
    * Trigger a DELETE request to the odata service that was specified in the model constructor.
    * @param sPath A string containing the path to the data that should be removed.		The path is
    * concatenated to the sServiceUrl which was specified in the model constructor.
    * @param mParameters Optional, can contain the following attributes: oContext, fnSuccess, fnError,
    * sETag:
    * @returns an object which has an <code>abort</code> function to abort the current request.
    */
  def remove(sPath: java.lang.String): js.Any = js.native
  def remove(sPath: java.lang.String, mParameters: js.Any): js.Any = js.native
  /**
    * Resets the collected changes by the setProperty method and reloads the data from the server.
    * @param fnSuccess a callback function which is called when the data has           					 been
    * successfully resetted. The handler can have the           	                 following parameters:
    * oData and response.
    * @param fnError a callback function which is called when the request failed
    */
  def resetChanges(fnSuccess: js.Any): scala.Unit = js.native
  def resetChanges(fnSuccess: js.Any, fnError: js.Any): scala.Unit = js.native
  /**
    * Sets whether this OData service supports $count on its collections.This method is deprecated, please
    * use setDefaultCountMode instead.
    * @param bCountSupported undefined
    */
  def setCountSupported(bCountSupported: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the default way to retrieve the count of collections in this model.Count can be determined
    * either by sending a separate $count request, including$inlinecount=allpages in data requests, both
    * of them or not at all.
    * @since 1.20
    * @param sCountMode undefined
    */
  def setDefaultCountMode(sCountMode: openui5Lib.Anon_Request): scala.Unit = js.native
  /**
    * Set custom headers which are provided in a key/value map. These headers are used for requests
    * against the OData backend.Private headers which are set in the ODataModel cannot be modified.These
    * private headers are: accept, accept-language, x-csrf-token, MaxDataServiceVersion,
    * DataServiceVersion.To remove these headers simply set the mCustomHeaders parameter to null. Please
    * also note that when calling this method again all previous custom headersare removed unless they are
    * specified again in the mCustomHeaders parameter.
    * @param mHeaders the header name/value map.
    */
  def setHeaders(mHeaders: js.Any): scala.Unit = js.native
  /**
    * Sets a new value for the given property <code>sPropertyName</code> in the model without triggering a
    * server request. This can be done by the submitChanges method. Note: Only one entry of one collection
    * can be updated at once. Otherwise a fireRejectChange event is fired. Before updating a different
    * entry the existing changes of the current entry have to be submitted or resetted by the
    * corresponding methods: submitChanges, resetChanges. IMPORTANT: All pending changes are resetted in
    * the model if the application triggeres any kind of refresh on that entry. Make sure to submit the
    * pending changes first. To determine if there are any pending changes call the hasPendingChanges
    * method.
    * @param sPath path of the property to set
    * @param oValue value to set the property to
    * @param oContext the context which will be used to set the property
    * @param bAsyncUpdate whether to update other bindings dependent on this property asynchronously
    * @returns true if the value was set correctly and false if errors occurred like the entry was not
    * found or another entry was already updated.
    */
  def setProperty(sPath: java.lang.String, oValue: js.Any): scala.Boolean = js.native
  def setProperty(sPath: java.lang.String, oValue: js.Any, oContext: js.Any): scala.Boolean = js.native
  def setProperty(sPath: java.lang.String, oValue: js.Any, oContext: js.Any, bAsyncUpdate: scala.Boolean): scala.Boolean = js.native
  /**
    * Enable/Disable automatic updates of all Bindings after change operations
    * @since 1.16.3
    * @param bRefreshAfterChange undefined
    */
  def setRefreshAfterChange(bRefreshAfterChange: scala.Boolean): scala.Unit = js.native
  /**
    * Enable/Disable XCSRF-Token handling
    * @param bTokenHandling whether to use token handling or not
    */
  def setTokenHandlingEnabled(bTokenHandling: scala.Boolean): scala.Unit = js.native
  /**
    * Enable/Disable batch for all requests
    * @param bUseBatch whether the requests should be encapsulated in a batch request
    */
  def setUseBatch(bUseBatch: scala.Boolean): scala.Unit = js.native
  /**
    * Submits the collected changes in the batch which were collected via
    * <code>addBatchReadOperations</code> or <code>addBatchChangeOperations</code>.The batch will be
    * cleared afterwards. If the batch is empty no request will be performed and false will be
    * returned.Note: No data will be stored in the model.
    * @param fnSuccess a callback function which is called when the batch request has           					 been
    * successfully sent. Note: There might have errors occured in the single batch operations. These
    * errors can be accessed in the           aErrorResponses parameter in the callback handler.          
    * The handler can have the           	                 following parameters: oData, oResponse and
    * aErrorResponses.
    * @param fnError a callback function which is called when the batch request failed. The handler can
    * have the parameter: oError which containsadditional error information.
    * @param bAsync true for asynchronous request. Default is true.
    * @param bImportData undefined
    * @returns an object which has an <code>abort</code> function to abort the current request. Returns
    * false if no request will be performed because the batch is empty.
    */
  def submitBatch(fnSuccess: js.Any, fnError: js.Any, bAsync: scala.Boolean, bImportData: scala.Boolean): js.Any = js.native
  /**
    * Submits the collected changes which were collected by the setProperty method. A MERGE request will
    * be triggered to only update the changed properties.If a URI with a $expand System Query Option was
    * used then the expand entries will be removed from the collected changes.Changes to this entries
    * should be done on the entry itself. So no deep updates are supported.
    * @param fnSuccess a callback function which is called when the data has           					 been
    * successfully updated. The handler can have the           	                 following parameters:
    * oData and response.
    * @param fnError a callback function which is called when the request failed. The handler can have the
    * parameter: oError which containsadditional error information
    * @param oParameters optional parameter for additional information introduced in SAPUI5 1.9.1
    * @returns an object which has an <code>abort</code> function to abort the current request.
    */
  def submitChanges(fnSuccess: js.Any): js.Any = js.native
  def submitChanges(fnSuccess: js.Any, fnError: js.Any): js.Any = js.native
  def submitChanges(fnSuccess: js.Any, fnError: js.Any, oParameters: js.Any): js.Any = js.native
  /**
    * Trigger a PUT/MERGE request to the odata service that was specified in the model constructor. Please
    * note that deep updates are not supportedand may not work. These should be done seperate on the entry
    * directly.
    * @param sPath A string containing the path to the data that should be updated.		The path is
    * concatenated to the sServiceUrl which was specified		in the model constructor.
    * @param oData data of the entry that should be updated.
    * @param mParameters Optional, can contain the following attributes:
    * @returns an object which has an <code>abort</code> function to abort the current request.
    */
  def update(sPath: java.lang.String, oData: js.Any): js.Any = js.native
  def update(sPath: java.lang.String, oData: js.Any, mParameters: js.Any): js.Any = js.native
  /**
    * update all bindings
    * @param bForceUpdate If set to false an update  will only be done when the value of a binding
    * changed.
    */
  def updateBindings(bForceUpdate: scala.Boolean): scala.Unit = js.native
}

