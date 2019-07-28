package typings.openui5.sapNs.uiNs.coreNs.utilNs

import typings.openui5.sapNs.uiNs.baseNs.ManagedObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.util.MockServer")
@js.native
abstract class MockServer protected () extends ManagedObject {
  /**
    * Creates a mocked server. This helps to mock all or some backend calls, e.g. for OData/JSON Models or
    * simple XHR calls, withoutchanging the application code. This class can also be used for qunit
    * tests.Accepts an object literal <code>mSettings</code> that defines initialproperty values,
    * aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new server object; generated automatically if no non-empty id is given    
    * Note: this can be omitted, no matter whether <code>mSettings</code> will be given or not!
    * @param mSettings optional map/JSON-object with initial property values, aggregated objects etc. for
    * the new object
    * @param oScope scope object for resolving string based type and formatter references in bindings
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  def this(sId: String, mSettings: js.Any, oScope: js.Any) = this()
  /**
    * Enum for the method.
    */
  var HTTPMETHOD: js.Any = js.native
  /**
    * Attaches an event handler to be called after the built-in request processing of the mock server
    * @param event type according to HTTP Method
    * @param fnCallback the name of the function that will be called at this exitThe callback function
    * exposes an event with parameters, depending on the type of the request.oEvent.getParameters() lists
    * the parameters as per the request. Examples are:oXhr : the request object; oFilteredData : the mock
    * data entries that are about to be returned in the response; oEntry : the mock data entry that is
    * about to be returned in the response;
    * @param sEntitySet (optional) the name of the entity set
    */
  def attachAfter(event: String, fnCallback: js.Any, sEntitySet: String): Unit = js.native
  /**
    * Attaches an event handler to be called before the built-in request processing of the mock server
    * @param event type according to HTTP Method
    * @param fnCallback the name of the function that will be called at this exit.The callback function
    * exposes an event with parameters, depending on the type of the request.oEvent.getParameters() lists
    * the parameters as per the request. Examples are:oXhr : the request object; sUrlParams : the URL
    * parameters of the request; sKeys : key properties of the requested entry; sNavProp/sNavName : name
    * of navigation
    * @param sEntitySet (optional) the name of the entity set
    */
  def attachBefore(event: String, fnCallback: js.Any, sEntitySet: String): Unit = js.native
  /**
    * Removes a previously attached event handler
    * @param event type according to HTTP Method
    * @param fnCallback the name of the function that will be called at this exit
    * @param sEntitySet (optional) the name of the entity set
    */
  def detachAfter(event: String, fnCallback: js.Any, sEntitySet: String): Unit = js.native
  /**
    * Removes a previously attached event handler
    * @param event type according to HTTP Method
    * @param fnCallback the name of the function that will be called at this exit
    * @param sEntitySet (optional) the name of the entity set
    */
  def detachBefore(event: String, fnCallback: js.Any, sEntitySet: String): Unit = js.native
  /**
    * Returns the data model of the given EntitySet name.
    * @param sEntitySetName EntitySet name
    * @returns data model of the given EntitySet
    */
  def getEntitySetData(sEntitySetName: js.Any): js.Array[_] = js.native
  /**
    * Getter for property <code>requests</code>.Default value is <code>[]</code>
    * @returns the value of property <code>rootUri</code>
    */
  def getRequests(): js.Array[_] = js.native
  /**
    * Getter for property <code>rootUri</code>.Default value is empty/<code>undefined</code>
    * @returns the value of property <code>rootUri</code>
    */
  def getRootUri(): String = js.native
  /**
    * Returns whether the server is started or not.
    * @returns whether the server is started or not.
    */
  def isStarted(): Boolean = js.native
  /**
    * Sets the data of the given EntitySet name with the given array.
    * @param sEntitySetName EntitySet name
    * @param aData undefined
    */
  def setEntitySetData(sEntitySetName: js.Any, aData: js.Any): Unit = js.native
  /**
    * Setter for property <code>requests</code>.Default value is is <code>[]</code>Each array entry should
    * consist of an array with the following properties / values:<ul><li><b>method <string>:
    * "GET"|"POST"|"DELETE|"PUT"</b><br>(any HTTP verb)</li><li><b>path <string>:
    * "/path/to/resource"</b><br>The path is converted to a regular expression, so it can contain normal
    * regular expression syntax.All regular expression groups are forwarded as arguments to the
    * <code>response</code> function.In addition to this, parameters can be written in this notation:
    * <code>:param</code>. These placeholder will be replaced by regular expression
    * groups.</li><li><b>response <function>: function(xhr, param1, param2, ...) { }</b><br>The xhr object
    * can be used to respond on the request. Supported methods are:<br><code>xhr.respond(iStatusCode,
    * mHeaders, sBody)</code><br><code>xhr.respondJSON(iStatusCode, mHeaders, oJsonObjectOrString)</code>.
    * By default a JSON header is set for response header<br><code>xhr.respondXML(iStatusCode, mHeaders,
    * sXmlString)</code>. By default a XML header is set for response
    * header<br><code>xhr.respondFile(iStatusCode, mHeaders, sFileUrl)</code>. By default the mime type of
    * the file is set for response header</li></ul>
    * @param requests new value for property <code>requests</code>
    */
  def setRequests(requests: js.Array[_]): Unit = js.native
  /**
    * Setter for property <code>rootUri</code>. All request path URI are prefixed with this root URI if
    * set.Default value is empty/<code>undefined</code>
    * @param rootUri new value for property <code>rootUri</code>
    */
  def setRootUri(rootUri: String): Unit = js.native
  /**
    * Simulates an existing OData service by sepcifiying the metadata URL and the base URL for the
    * mockdata. The serverconfigures the request handlers depending on the service metadata. The mockdata
    * needs to be stored individually foreach entity type in a separate JSON file. The name of the JSON
    * file needs to match the name of the entity type. Ifno base url for the mockdata is specified then
    * the mockdata are generated from the metadata
    * @since 1.13.2
    * @param sMetadataUrl url to the service metadata document
    * @param vMockdataSettings (optional) base url which contains the path to the mockdata, or an object
    * which contains the following properties: sMockdataBaseUrl, bGenerateMissingMockData,
    * aEntitySetsNames. See below for descriptions of these parameters. Ommit this parameter to produce
    * random mock data based on the service metadata.
    */
  def simulate(sMetadataUrl: String): Unit = js.native
  def simulate(sMetadataUrl: String, vMockdataSettings: String): Unit = js.native
  def simulate(sMetadataUrl: String, vMockdataSettings: js.Any): Unit = js.native
  /**
    * Starts the server.
    */
  def start(): Unit = js.native
  /**
    * Stops the server.
    */
  def stop(): Unit = js.native
}

