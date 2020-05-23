package typings.openui5.sap.ui.model.odata.v2

import typings.jquery.JQueryPromise
import typings.openui5.anon.TypeofCountMode
import typings.openui5.sap.ui.model.Context
import typings.openui5.sap.ui.model.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ODataModel extends Model {
  /**
    * Adds (a) new URL(s) to the be parsed for OData annotations, which are then merged into the
    * annotations objectwhich can be retrieved by calling the getServiceAnnotations()-method. If a
    * $metadata url is passed the data willalso be merged into the metadata object, which can be reached
    * by calling the getServiceMetadata() method.
    * @param vUrl Either one URL as string or an array or URL strings
    * @returns The Promise to load the given URL(s), resolved if all URLs have been loaded, rejected if at
    * least one fails to load.                     If this promise resolves it returns the following parameters:                    
    * annotations: The annotation object                     entitySets: An array of EntitySet objects containing the
    * newly merged EntitySets from a $metadata requests.                                 the structure is the same as in the
    * metadata object reached by the getServiceMetadata() method.                                 For non $metadata requests the
    * array will be empty.
    */
  def addAnnotationUrl(vUrl: String): JQueryPromise[_] = js.native
  def addAnnotationUrl(vUrl: js.Array[String]): JQueryPromise[_] = js.native
  /**
    * Adds new xml content to be parsed for OData annotations, which are then merged into the annotations
    * object whichcan be retrieved by calling the getServiceAnnotations()-method.
    * @param sXMLContent The string that should be parsed as annotation XML
    * @param bSuppressEvents Whether not to fire annotationsLoaded event on the annotationParser
    * @returns The Promise to parse the given XML-String, resolved if parsed without errors, rejected if
    * errors occur
    */
  def addAnnotationXML(sXMLContent: String): JQueryPromise[_] = js.native
  def addAnnotationXML(sXMLContent: String, bSuppressEvents: Boolean): JQueryPromise[_] = js.native
  /**
    * Attach event-handler <code>fnFunction</code> to the 'annotationsFailed' event of this
    * <code>sap.ui.model.odata.v2.ODataModel</code>.
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
    * <code>sap.ui.model.odata.v2.ODataModel</code>.
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
    * Attach event-handler <code>fnFunction</code> to the 'batchRequestCompleted' event of this
    * <code>sap.ui.model.odata.v2.ODataModel</code>.
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, the global context (window)
    * is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachBatchRequestCompleted(oData: js.Any, fnFunction: js.Any): ODataModel = js.native
  def attachBatchRequestCompleted(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ODataModel = js.native
  /**
    * Attach event-handler <code>fnFunction</code> to the 'batchRequestFailed' event of this
    * <code>sap.ui.model.odata.v2.ODataModel</code>.<br/>
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, this Model is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachBatchRequestFailed(oData: js.Any, fnFunction: js.Any): ODataModel = js.native
  def attachBatchRequestFailed(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ODataModel = js.native
  /**
    * Attach event-handler <code>fnFunction</code> to the 'requestSent' event of this
    * <code>sap.ui.model.odata.v2.ODataModel</code>.
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, the global context (window)
    * is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachBatchRequestSent(oData: js.Any, fnFunction: js.Any): ODataModel = js.native
  def attachBatchRequestSent(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ODataModel = js.native
  /**
    * Attach event-handler <code>fnFunction</code> to the 'metadataFailed' event of this
    * <code>sap.ui.model.odata.v2.ODataModel</code>.
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
    * <code>sap.ui.model.odata.v2.ODataModel</code>.
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
    * Trigger a request to the function import odata service that was specified in the model
    * constructor.If the ReturnType of the function import is either an EntityType or a collection of
    * EntityType thechanges are reflected in the model, otherwise they are ignored, and the
    * <code>response</code> canbe processed in the successHandler.
    * @param sFunctionName A string containing the name of the function to call. The name is concatenated
    * to the sServiceUrl which was       specified in the model constructor.
    * @param mParameters Optional parameter map containing any of the following properties:
    * @returns oRequestHandle An object which has a <code>contextCreated</code> function that returns a
    * <code>Promise</code>.        This resolves with the created {@link sap.ui.model.Context}.        In
    * addition it has an <code>abort</code> function to abort the current request.
    */
  def callFunction(sFunctionName: String): js.Any = js.native
  def callFunction(sFunctionName: String, mParameters: js.Any): js.Any = js.native
  /**
    * Trigger a POST request to the odata service that was specified in the model constructor. Please note
    * that deep creates are not supportedand may not work.
    * @param sPath A string containing the path to the collection where an entry        should be created. The
    * path is concatenated to the sServiceUrl        which was specified in the model constructor.
    * @param oData data of the entry that should be created.
    * @param mParameters Optional parameter map containing any of the following properties:
    * @returns an object which has an <code>abort</code> function to abort the current request.
    */
  def create(sPath: String, oData: js.Any): js.Any = js.native
  def create(sPath: String, oData: js.Any, mParameters: js.Any): js.Any = js.native
  /**
    * Creates a new entry object which is described by the metadata of the entity type of thespecified
    * sPath Name. A context object is returned which can be used to bindagainst the newly created
    * object.For each created entry a request is created and stored in a request queue.The request queue
    * can be submitted by calling submitChanges. To delete a createdentry from the request queue call
    * deleteCreatedEntry.The optional properties parameter can be used as follows:  - properties could be
    * an array containing the property names which should be included    in the new entry. Other
    * properties defined in the entity type are not included.  - properties could be an object which
    * includes the desired properties and the values    which should be used for the created entry.If
    * properties is not specified, all properties in the entity type will be included in thecreated
    * entry.If there are no values specified the properties will have undefined values.Please note that
    * deep creates (including data defined by navigationproperties) are not supported
    * @param sPath Name of the path to the EntitySet
    * @param mParameters A map of the following parameters:
    * @returns oContext A Context object that point to the new created entry.
    */
  def createEntry(sPath: String, mParameters: js.Any): Context = js.native
  /**
    * Creates the key from the given collection name and property map. Please make sure that the metadata
    * document is loaded before using this function.
    * @param sCollection The name of the collection
    * @param oKeyProperties The object containing at least all the key properties of the entity type
    * @returns [sKey] key of the entry
    */
  def createKey(sCollection: String, oKeyProperties: js.Any): String = js.native
  /**
    * Deletes a created entry from the request queue and the model.
    * @param oContext The context object pointing to the created entry
    */
  def deleteCreatedEntry(oContext: Context): Unit = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'annotationsFailed' event of this
    * <code>sap.ui.model.odata.v2.ODataModel</code>.The passed function and listener object must match the
    * ones previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachAnnotationsFailed(fnFunction: js.Any, oListener: js.Any): ODataModel = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'annotationsLoaded' event of this
    * <code>sap.ui.model.odata.v2.ODataModel</code>.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachAnnotationsLoaded(fnFunction: js.Any, oListener: js.Any): ODataModel = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'batchRequestCompleted' event of this
    * <code>sap.ui.model.odata.v2.ODataModel</code>.The passed function and listener object must match the
    * ones previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachBatchRequestCompleted(fnFunction: js.Any, oListener: js.Any): ODataModel = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'batchRequestFailed' event of this
    * <code>sap.ui.model.odata.v2.ODataModel</code>.<br/>The passed function and listener object must
    * match the ones previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachBatchRequestFailed(fnFunction: js.Any, oListener: js.Any): ODataModel = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'batchRequestSent' event of this
    * <code>sap.ui.model.odata.v2.ODataModel</code>.The passed function and listener object must match the
    * ones previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachBatchRequestSent(fnFunction: js.Any, oListener: js.Any): ODataModel = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'metadataFailed' event of this
    * <code>sap.ui.model.odata.v2.ODataModel</code>.The passed function and listener object must match the
    * ones previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachMetadataFailed(fnFunction: js.Any, oListener: js.Any): ODataModel = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'metadataLoaded' event of this
    * <code>sap.ui.model.odata.v2.ODataModel</code>.The passed function and listener object must match the
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
    * Fire event batchRequestCompleted to attached listeners.
    * @param mArguments parameters to add to the fired event
    * @returns <code>this</code> to allow method chaining
    */
  def fireBatchRequestCompleted(mArguments: js.Any): ODataModel = js.native
  /**
    * Fire event batchRequestFailed to attached listeners.
    * @param mArguments the arguments to pass along with the event.
    * @returns <code>this</code> to allow method chaining
    */
  def fireBatchRequestFailed(mArguments: js.Any): ODataModel = js.native
  /**
    * Fire event batchRequestSent to attached listeners.
    * @param mArguments the arguments to pass along with the event.
    * @returns <code>this</code> to allow method chaining
    */
  def fireBatchRequestSent(mArguments: js.Any): ODataModel = js.native
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
    * Force the update on the server of an entity by setting its ETag to '*'.ETag handling must be active
    * so the force update will work.
    * @param sKey The key to an Entity e.g.: Customer(4711)
    */
  def forceEntityUpdate(sKey: String): Unit = js.native
  /**
    * Returns the definition of batchGroups per EntityType for TwoWay changes
    * @returns mChangeBatchGroups Definition of bactchGRoups for "TwoWay" changes
    */
  def getChangeBatchGroups(): js.Any = js.native
  /**
    * Returns the definition of groups per EntityType for TwoWay changes
    * @returns mChangeGroups Definition of Groups for "TwoWay" changes
    */
  def getChangeGroups(): js.Any = js.native
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
  def getData(sPath: String): js.Any = js.native
  def getData(sPath: String, oContext: js.Any): js.Any = js.native
  def getData(sPath: String, oContext: js.Any, bIncludeExpandEntries: Boolean): js.Any = js.native
  /**
    * Returns the default count mode for retrieving the count of collections
    * @since 1.20
    * @returns sCountMode returns defaultCountMode
    */
  def getDefaultCountMode(): TypeofCountMode = js.native
  /**
    * Returns the array of batchGroupIds that are set as deferred
    * @returns aGroupIds The array of deferred batchGroupIds
    */
  def getDeferredBatchGroups(): js.Array[_] = js.native
  /**
    * Returns the array of GroupIds that are set as deferred
    * @returns aGroupIds The array of deferred GroupIds
    */
  def getDeferredGroups(): js.Array[_] = js.native
  /**
    * Returns the ETag for a given binding path/context or data object
    * @param sPath The binding path
    * @param oContext The binding context
    * @param oEntity The entity data
    * @returns The found ETag (or null if none could be found)
    */
  def getETag(sPath: String): String = js.native
  def getETag(sPath: String, oContext: Context): String = js.native
  def getETag(sPath: String, oContext: Context, oEntity: js.Any): String = js.native
  /**
    * Returns all headers and custom headers which are stored in the OData model.
    * @returns the header map
    */
  def getHeaders(): js.Any = js.native
  /**
    * Returns the key part from the entry URI or the given context or object
    * @param vValue A string representation of an URI, the context or entry object
    * @returns [sKey] key of the entry
    */
  def getKey(vValue: String): String = js.native
  def getKey(vValue: js.Any): String = js.native
  def getKey(vValue: Context): String = js.native
  def getProperty(sPath: String, oContext: js.Any, bIncludeExpandEntries: Boolean): js.Any = js.native
  /**
    * Returns the current security token. If the token has not been requested from the server it will be
    * requested first.
    * @returns the CSRF security token
    */
  def getSecurityToken(): String = js.native
  /**
    * Return the annotation object. Please note that the metadata is loaded asynchronously and this
    * function might return undefined because themetadata has not been loaded yet.In this case attach to
    * the <code>annotationsLoaded</code> event to get notified when the annotations are available and then
    * call this function.
    * @returns metdata object
    */
  def getServiceAnnotations(): js.Any = js.native
  /**
    * Return the parsed XML metadata as a Javascript object. Please note that the metadata is loaded
    * asynchronously and this function might return undefined because themetadata has not been loaded
    * yet.In this case attach to the <code>metadataLoaded</code> event to get notified when the metadata
    * is available and then call this function.
    * @returns metdata object
    */
  def getServiceMetadata(): js.Any = js.native
  /**
    * Checks if there exist pending changes in the model created by the setProperty method.
    * @returns true/false
    */
  def hasPendingChanges(): Boolean = js.native
  /**
    * Checks if there are pending requests, either ongoing or sequential
    * @returns true/false
    */
  def hasPendingRequests(): Boolean = js.native
  /**
    * Checks whether metadata loading has failed in the past.
    * @since 1.38
    * @returns returns whether metadata request has failed
    */
  def isMetadataLoadingFailed(): Boolean = js.native
  /**
    * Returns a promise for the loaded state of the metadata. The promise won't get rejected in case the
    * metadata loading failed butis only resolved if the metadata is loaded successfully.If
    * <code>refreshMetadata</code> function is called after this promise is already resolved you should
    * rely on the promise returned by<code>refreshMetadata</code> to get information about the refreshed
    * metadata loaded state.
    * @since 1.30
    * @returns returns a promise on metadata loaded state
    */
  def metadataLoaded(): JQueryPromise[_] = js.native
  /**
    * Trigger a GET request to the odata service that was specified in the model constructor.The data will
    * be stored in the model. The requested data is returned with the response.
    * @param sPath A string containing the path to the data which should        be retrieved. The path is
    * concatenated to the sServiceUrl        which was specified in the model constructor.
    * @param mParameters Optional parameter map containing any of the following properties:
    * @returns an object which has an <code>abort</code> function to abort the current request.
    */
  def read(sPath: String): js.Any = js.native
  def read(sPath: String, mParameters: js.Any): js.Any = js.native
  def refresh(bForceUpdate: Boolean, bRemoveData: Boolean): Unit = js.native
  def refresh(bForceUpdate: Boolean, bRemoveData: Boolean, sGroupId: String): Unit = js.native
  /**
    * Refreshes the metadata for model, e.g. in case the request for metadata has failed.Returns a new
    * promise which can be resolved or rejected depending on the metadata loading state.
    * @returns returns a promise on metadata loaded state or null if metadata is not initialized or
    * currently refreshed.
    */
  def refreshMetadata(): JQueryPromise[_] = js.native
  /**
    * refresh XSRF token by performing a GET request against the service root URL.
    * @param fnSuccess a callback function which is called when the data has                                been
    * successfully retrieved.
    * @param fnError a callback function which is called when the request failed. The handler can have the
    * parameter: oError which contains additional error information.
    * @returns an object which has an <code>abort</code> function to abort the current request.
    */
  def refreshSecurityToken(fnSuccess: js.Any): js.Any = js.native
  def refreshSecurityToken(fnSuccess: js.Any, fnError: js.Any): js.Any = js.native
  /**
    * Trigger a DELETE request to the odata service that was specified in the model constructor.
    * @param sPath A string containing the path to the data that should be removed.        The path is
    * concatenated to the sServiceUrl which was specified in the model constructor.
    * @param mParameters Optional, can contain the following attributes:
    * @returns an object which has an <code>abort</code> function to abort the current request.
    */
  def remove(sPath: String): js.Any = js.native
  def remove(sPath: String, mParameters: js.Any): js.Any = js.native
  /**
    * Resets the collected changes by the setProperty method.
    * @param aPath Array of paths that should be resetted.                            If no array is passed all changes will be
    * resetted.
    */
  def resetChanges(aPath: js.Array[_]): Unit = js.native
  /**
    * Returns a promise, which will resolve with the security token as soon as it is available
    * @returns the CSRF security token
    */
  def securityTokenAvailable(): JQueryPromise[_] = js.native
  /**
    * Definition of batchGroups per EntityType for "TwoWay" changes
    * @param mGroups A map containing the definition of bacthGroups for TwoWay changes. The Map has
    * thefollowing format:{        "EntityTypeName": {            batchGroupId: "ID",            [changeSetId: "ID",]            [single:
    * true/false,]        }}bacthGroupId: Defines the bacthGroup for changes of the defined
    * EntityTypeNamechangeSetId: Defines a changeSetId wich bundles the changes for the EntityType.single:
    * Defines if every change will get an own changeSet (true)
    */
  def setChangeBatchGroups(mGroups: js.Any): Unit = js.native
  /**
    * Definition of groups per EntityType for "TwoWay" changes
    * @param mGroups A map containing the definition of bacthGroups for TwoWay changes. The Map has
    * thefollowing format:{        "EntityTypeName": {            groupId: "ID",            [changeSetId: "ID",]            [single:
    * true/false,]        }}GroupId: Defines the Group for changes of the defined EntityTypeNamechangeSetId:
    * Defines a changeSetId wich bundles the changes for the EntityType.single: Defines if every change
    * will get an own changeSet (true)
    */
  def setChangeGroups(mGroups: js.Any): Unit = js.native
  /**
    * Sets the default way to retrieve the count of collections in this model.Count can be determined
    * either by sending a separate $count request, including$inlinecount=allpages in data requests, both
    * of them or not at all.
    * @since 1.20
    * @param sCountMode sets default count mode
    */
  def setDefaultCountMode(sCountMode: TypeofCountMode): Unit = js.native
  /**
    * Setting batch groups as deferred. Requests that belongs to a deferred batch group will be sent
    * manuallyvia a submitChanges call.
    * @param aGroupIds Array of batchGroupIds that should be set as deferred
    */
  def setDeferredBatchGroups(aGroupIds: js.Array[_]): Unit = js.native
  /**
    * Setting request groups as deferred. Requests that belongs to a deferred group will be sent
    * manuallyvia a submitChanges call.
    * @param aGroupIds Array of GroupIds that should be set as deferred
    */
  def setDeferredGroups(aGroupIds: js.Array[_]): Unit = js.native
  /**
    * Set custom headers which are provided in a key/value map. These headers are used for requests
    * against the OData backend.Private headers which are set in the ODataModel cannot be modified.These
    * private headers are: accept, accept-language, x-csrf-token, MaxDataServiceVersion,
    * DataServiceVersion.To remove these headers simply set the mCustomHeaders parameter to null. Please
    * also note that when calling this method again all previous custom headersare removed unless they are
    * specified again in the mCustomHeaders parameter.
    * @param mHeaders the header name/value map.
    */
  def setHeaders(mHeaders: js.Any): Unit = js.native
  /**
    * Sets a new value for the given property <code>sPropertyName</code> in the model.If the
    * changeBatchGroup for the changed EntityType is set to deferred changes could be submittedwith
    * submitChanges. Otherwise the change will be submitted directly.
    * @param sPath path of the property to set
    * @param oValue value to set the property to
    * @param oContext the context which will be used to set the property
    * @param bAsyncUpdate whether to update other bindings dependent on this property asynchronously
    * @returns true if the value was set correctly and false if errors occurred like the entry was not
    * found or another entry was already updated.
    */
  def setProperty(sPath: String, oValue: js.Any): Boolean = js.native
  def setProperty(sPath: String, oValue: js.Any, oContext: js.Any): Boolean = js.native
  def setProperty(sPath: String, oValue: js.Any, oContext: js.Any, bAsyncUpdate: Boolean): Boolean = js.native
  /**
    * Enable/Disable automatic updates of all Bindings after change operations
    * @since 1.16.3
    * @param bRefreshAfterChange Refresh after change
    */
  def setRefreshAfterChange(bRefreshAfterChange: Boolean): Unit = js.native
  /**
    * Enable/Disable XCSRF-Token handling
    * @param bTokenHandling whether to use token handling or not
    */
  def setTokenHandlingEnabled(bTokenHandling: Boolean): Unit = js.native
  /**
    * @param bUseBatch whether the requests should be encapsulated in a batch request
    */
  def setUseBatch(bUseBatch: Boolean): Unit = js.native
  /**
    * Submits the collected changes which were collected by the setProperty method. The update method is
    * defined by the global <code>defaultUpdateMethod</code>parameter which is
    * sap.ui.model.odata.UpdateMethod.Merge by default. In case of a sap.ui.model.odata.UpdateMethod.Merge
    * request only the changed properties will be updated.If a URI with a $expand System Query Option was
    * used then the expand entries will be removed from the collected changes.Changes to this entries
    * should be done on the entry itself. So no deep updates are supported.Important: The success/error
    * handler will only be called if batch support is enabled. If multiple batchGroups are submitted the
    * handlers will be called for every batchGroup.
    * @param mParameters a map which contains the following parameter properties:
    * @returns an object which has an <code>abort</code> function to abort the current request or requests
    */
  def submitChanges(mParameters: js.Any): js.Any = js.native
  /**
    * Trigger a PUT/MERGE request to the odata service that was specified in the model constructor.The
    * update method used is defined by the global <code>defaultUpdateMethod</code> parameter which is
    * sap.ui.model.odata.UpdateMethod.Merge by default.Please note that deep updates are not supported and
    * may not work. These should be done seperate on the entry directly.
    * @param sPath A string containing the path to the data that should be updated.        The path is
    * concatenated to the sServiceUrl which was specified        in the model constructor.
    * @param oData data of the entry that should be updated.
    * @param mParameters Optional, can contain the following attributes:
    * @returns an object which has an <code>abort</code> function to abort the current request.
    */
  def update(sPath: String, oData: js.Any): js.Any = js.native
  def update(sPath: String, oData: js.Any, mParameters: js.Any): js.Any = js.native
  /**
    * update all bindings
    * @param bForceUpdate If set to false an update  will only be done when the value of a binding
    * changed.
    */
  def updateBindings(bForceUpdate: Boolean): Unit = js.native
}

