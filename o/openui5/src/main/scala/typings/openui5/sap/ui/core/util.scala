package typings.openui5.sap.ui.core

import typings.jquery.JQueryPromise
import typings.openui5.sap.ui.base.EventProvider
import typings.openui5.sap.ui.base.ManagedObject
import typings.openui5.sap.ui.model.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.core.util")
@js.native
object util extends js.Object {
  
  @js.native
  trait Export extends Control {
    
    /**
      * Adds some column to the aggregation <code>columns</code>.
      * @param oColumn the column to add; if empty, nothing is inserted
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def addColumn(oColumn: ExportColumn): Export = js.native
    
    /**
      * Adds some row to the aggregation <code>rows</code>.
      * @param oRow the row to add; if empty, nothing is inserted
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def addRow(oRow: ExportRow): Export = js.native
    
    /**
      * Binds aggregation <code>columns</code> to model data.See {@link
      * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of <code>oBindingInfo</code>.
      * @param oBindingInfo The binding information
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def bindColumns(oBindingInfo: js.Any): Export = js.native
    
    /**
      * Binds aggregation <code>rows</code> to model data.See {@link
      * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of <code>oBindingInfo</code>.
      * @param oBindingInfo The binding information
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def bindRows(oBindingInfo: js.Any): Export = js.native
    
    /**
      * Destroys all the columns in the aggregation <code>columns</code>.
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def destroyColumns(): Export = js.native
    
    /**
      * Destroys the exportType in the aggregation <code>exportType</code>.
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def destroyExportType(): Export = js.native
    
    /**
      * Destroys all the rows in the aggregation <code>rows</code>.
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def destroyRows(): Export = js.native
    
    /**
      * Generates the file content and returns a Promisewith the instance as context (this).<br>The promise
      * will be resolved with the generated contentas a string.<p><b>Please note: The return value was
      * changed from jQuery Promises to standard ES6 Promises.jQuery specific Promise methods ('done',
      * 'fail', 'always', 'pipe' and 'state') are still available but should not be used.Please use only the
      * standard methods 'then' and 'catch'!</b></p>
      * @returns Promise object
      */
    def generate(): JQueryPromise[_] = js.native
    
    /**
      * Gets content of aggregation <code>columns</code>.Columns for the Export.
      */
    def getColumns(): js.Array[ExportColumn] = js.native
    
    /**
      * Gets content of aggregation <code>exportType</code>.Type that generates the content.
      */
    def getExportType(): ExportType = js.native
    
    /**
      * Gets content of aggregation <code>rows</code>.Rows of the Export.
      */
    def getRows(): js.Array[ExportRow] = js.native
    
    /**
      * Checks for the provided <code>sap.ui.core.util.ExportColumn</code> in the aggregation
      * <code>columns</code>.and returns its index if found or -1 otherwise.
      * @param oColumn The column whose index is looked for
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfColumn(oColumn: ExportColumn): Double = js.native
    
    /**
      * Checks for the provided <code>sap.ui.core.util.ExportRow</code> in the aggregation
      * <code>rows</code>.and returns its index if found or -1 otherwise.
      * @param oRow The row whose index is looked for
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfRow(oRow: ExportRow): Double = js.native
    
    /**
      * Inserts a column into the aggregation <code>columns</code>.
      * @param oColumn the column to insert; if empty, nothing is inserted
      * @param iIndex the <code>0</code>-based index the column should be inserted at; for             a
      * negative value of <code>iIndex</code>, the column is inserted at position 0; for a value            
      * greater than the current size of the aggregation, the column is inserted at             the last
      * position
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def insertColumn(oColumn: ExportColumn, iIndex: Double): Export = js.native
    
    /**
      * Inserts a row into the aggregation <code>rows</code>.
      * @param oRow the row to insert; if empty, nothing is inserted
      * @param iIndex the <code>0</code>-based index the row should be inserted at; for             a
      * negative value of <code>iIndex</code>, the row is inserted at position 0; for a value            
      * greater than the current size of the aggregation, the row is inserted at             the last
      * position
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def insertRow(oRow: ExportRow, iIndex: Double): Export = js.native
    
    /**
      * Removes all the controls from the aggregation <code>columns</code>.Additionally, it unregisters them
      * from the hosting UIArea.
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllColumns(): js.Array[ExportColumn] = js.native
    
    /**
      * Removes all the controls from the aggregation <code>rows</code>.Additionally, it unregisters them
      * from the hosting UIArea.
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllRows(): js.Array[ExportRow] = js.native
    
    def removeColumn(vColumn: String): ExportColumn = js.native
    /**
      * Removes a column from the aggregation <code>columns</code>.
      * @param vColumn The column to remove or its index or id
      * @returns The removed column or <code>null</code>
      */
    def removeColumn(vColumn: Double): ExportColumn = js.native
    def removeColumn(vColumn: ExportColumn): ExportColumn = js.native
    
    def removeRow(vRow: String): ExportRow = js.native
    /**
      * Removes a row from the aggregation <code>rows</code>.
      * @param vRow The row to remove or its index or id
      * @returns The removed row or <code>null</code>
      */
    def removeRow(vRow: Double): ExportRow = js.native
    def removeRow(vRow: ExportRow): ExportRow = js.native
    
    /**
      * Generates the file content, triggers a download / save action andreturns a Promise with the instance
      * as context (this).<br>The promise will be resolved with the generated contentas a string.<p><b>For
      * information about browser support, see <code>sap.ui.core.util.File.save</code></b></p><p><b>Please
      * note: The return value was changed from jQuery Promises to standard ES6 Promises.jQuery specific
      * Promise methods ('done', 'fail', 'always', 'pipe' and 'state') are still available but should not be
      * used.Please use only the standard methods 'then' and 'catch'!</b></p>
      * @param sFileName file name, defaults to 'data'
      * @returns Promise object
      */
    def saveFile(sFileName: String): JQueryPromise[_] = js.native
    
    /**
      * Sets the aggregated <code>exportType</code>.
      * @param oExportType The exportType to set
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setExportType(oExportType: ExportType): Export = js.native
    
    /**
      * Unbinds aggregation <code>columns</code> from model data.
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def unbindColumns(): Export = js.native
    
    /**
      * Unbinds aggregation <code>rows</code> from model data.
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def unbindRows(): Export = js.native
  }
  
  @js.native
  trait ExportCell extends Element {
    
    /**
      * Gets current value of property <code>content</code>.Cell content.
      * @returns Value of property <code>content</code>
      */
    def getContent(): String = js.native
    
    /**
      * Sets a new value for property <code>content</code>.Cell content.When called with a value of
      * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
      * @param sContent New value for property <code>content</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setContent(sContent: String): ExportCell = js.native
  }
  
  @js.native
  trait ExportColumn extends ManagedObject {
    
    /**
      * Destroys the template in the aggregation <code>template</code>.
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def destroyTemplate(): ExportColumn = js.native
    
    /**
      * Gets current value of property <code>name</code>.Column name.
      * @returns Value of property <code>name</code>
      */
    def getName(): String = js.native
    
    /**
      * Gets content of aggregation <code>template</code>.Cell template for column.
      */
    def getTemplate(): ExportCell = js.native
    
    /**
      * Sets a new value for property <code>name</code>.Column name.When called with a value of
      * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
      * @param sName New value for property <code>name</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setName(sName: String): ExportColumn = js.native
    
    /**
      * Sets the aggregated <code>template</code>.
      * @param oTemplate The template to set
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setTemplate(oTemplate: ExportCell): ExportColumn = js.native
  }
  
  @js.native
  trait ExportRow extends ManagedObject {
    
    /**
      * Adds some cell to the aggregation <code>cells</code>.
      * @param oCell the cell to add; if empty, nothing is inserted
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def addCell(oCell: ExportCell): ExportRow = js.native
    
    /**
      * Destroys all the cells in the aggregation <code>cells</code>.
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def destroyCells(): ExportRow = js.native
    
    /**
      * Gets content of aggregation <code>cells</code>.Cells for the Export.
      */
    def getCells(): js.Array[ExportCell] = js.native
    
    /**
      * Checks for the provided <code>sap.ui.core.util.ExportCell</code> in the aggregation
      * <code>cells</code>.and returns its index if found or -1 otherwise.
      * @param oCell The cell whose index is looked for
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfCell(oCell: ExportCell): Double = js.native
    
    /**
      * Inserts a cell into the aggregation <code>cells</code>.
      * @param oCell the cell to insert; if empty, nothing is inserted
      * @param iIndex the <code>0</code>-based index the cell should be inserted at; for             a
      * negative value of <code>iIndex</code>, the cell is inserted at position 0; for a value            
      * greater than the current size of the aggregation, the cell is inserted at             the last
      * position
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def insertCell(oCell: ExportCell, iIndex: Double): ExportRow = js.native
    
    /**
      * Removes all the controls from the aggregation <code>cells</code>.Additionally, it unregisters them
      * from the hosting UIArea.
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllCells(): js.Array[ExportCell] = js.native
    
    def removeCell(vCell: String): ExportCell = js.native
    /**
      * Removes a cell from the aggregation <code>cells</code>.
      * @param vCell The cell to remove or its index or id
      * @returns The removed cell or <code>null</code>
      */
    def removeCell(vCell: Double): ExportCell = js.native
    def removeCell(vCell: ExportCell): ExportCell = js.native
  }
  
  @js.native
  trait ExportType extends ManagedObject {
    
    /**
      * Handles the generation process of the file.<br>
      * @param oExport export instance
      * @returns content
      */
    def _generate(oExport: Export): String = js.native
    
    /**
      * Creates a cell "generator" (inspired by ES6 Generators)
      * @returns generator
      */
    def cellGenerator(): js.Any = js.native
    
    /**
      * Creates a column "generator" (inspired by ES6 Generators)
      * @returns generator
      */
    def columnGenerator(): js.Any = js.native
    
    /**
      * Generates the file content.<br>Should be implemented by the individual types!
      * @returns content
      */
    def generate(): String = js.native
    
    /**
      * Gets current value of property <code>charset</code>.Charset.
      * @returns Value of property <code>charset</code>
      */
    def getCharset(): String = js.native
    
    /**
      * Returns the number of columns.
      * @returns count
      */
    def getColumnCount(): Double = js.native
    
    /**
      * Gets current value of property <code>fileExtension</code>.File extension.
      * @returns Value of property <code>fileExtension</code>
      */
    def getFileExtension(): String = js.native
    
    /**
      * Gets current value of property <code>mimeType</code>.MIME type.
      * @returns Value of property <code>mimeType</code>
      */
    def getMimeType(): String = js.native
    
    /**
      * Returns the number of rows.
      * @returns count
      */
    def getRowCount(): Double = js.native
    
    /**
      * Creates a row "generator" (inspired by ES6 Generators)
      * @returns generator
      */
    def rowGenerator(): js.Any = js.native
    
    /**
      * Sets a new value for property <code>charset</code>.Charset.When called with a value of
      * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
      * @param sCharset New value for property <code>charset</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setCharset(sCharset: String): ExportType = js.native
    
    /**
      * Sets a new value for property <code>fileExtension</code>.File extension.When called with a value of
      * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
      * @param sFileExtension New value for property <code>fileExtension</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setFileExtension(sFileExtension: String): ExportType = js.native
    
    /**
      * Sets a new value for property <code>mimeType</code>.MIME type.When called with a value of
      * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
      * @param sMimeType New value for property <code>mimeType</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setMimeType(sMimeType: String): ExportType = js.native
  }
  
  @js.native
  trait ExportTypeCSV extends ExportType {
    
    /**
      * Gets current value of property <code>separatorChar</code>.Separator char.Value needs to be exactly
      * one character or empty for default.Default value is <code>,</code>.
      * @returns Value of property <code>separatorChar</code>
      */
    def getSeparatorChar(): String = js.native
    
    /**
      * Setter for property <code>separatorChar</code>.Value needs to be exactly one character or empty for
      * default. Default value is ','.
      * @param sSeparatorChar new value for property <code>separatorChar</code>
      * @returns <code>this</code> to allow method chaining
      */
    def setSeparatorChar(sSeparatorChar: String): ExportTypeCSV = js.native
  }
  
  @js.native
  trait MockServer extends ManagedObject {
    
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
  
  @js.native
  object XMLPreprocessor extends js.Object {
    
    /**
      * Context interface provided by XML template processing as an additional firstargument to any
      * formatter function which opts in to this mechanism. Candidates forsuch formatter functions are all
      * those used in binding expressions which areevaluated during XML template processing, including those
      * used inside templateinstructions like <code>&lt;template:if></code>. The formatter function needs to
      * bemarked with a property <code>requiresIContext = true</code> to express that itrequires this
      * extended signature (compared to ordinary formatter functions). Theusual arguments are provided after
      * the first one (currently: the raw value from themodel).This interface provides callback functions to
      * access the model and path  which areneeded to process OData V4 annotations. It initially offers a
      * subset of methodsfrom {@link sap.ui.model.Context} so that formatters might also be called with
      * acontext object for convenience, e.g. outside of XML template processing (see belowfor an exception
      * to this rule).<b>Example:</b> Suppose you have a formatter function called "foo" like belowand it is
      * used within an XML template like<code>&lt;template:if test="{path: '...', formatter:
      * 'foo'}"></code>.In this case <code>foo</code> is called with arguments<code>oInterface,
      * vRawValue</code> such that<code>oInterface.getModel().getObject(oInterface.getPath()) ===
      * vRawValue</code>holds.<pre>window.foo = function (oInterface, vRawValue) {    //TODO
      * ...};window.foo.requiresIContext = true;</pre><b>Composite Binding Examples:</b> Suppose you have
      * the same formatter function andit is used in a composite binding like <code>&lt;Text text="{path:
      * 'Label',formatter: 'foo'}: {path: 'Value', formatter: 'foo'}"/></code>.In this case
      * <code>oInterface.getPath()</code> refers to ".../Label" in the 1st calland ".../Value" in the 2nd
      * call. This means each formatter call knows which part ofthe composite binding it belongs to and
      * behaves just as if it was an ordinarybinding.Suppose your formatter is not used within a part of the
      * composite binding, but atthe root of the composite binding in order to aggregate all parts like
      * <code>&lt;Text text="{parts: [{path: 'Label'}, {path: 'Value'}], formatter: 'foo'}"/></code>. In
      * this case <code>oInterface.getPath(0)</code> refers to ".../Label"
      * and<code>oInterface.getPath(1)</code> refers to ".../Value". This means, the rootformatter can
      * access the ith part of the composite binding at will (since 1.31.0);see also {@link #.getInterface
      * getInterface}.The function <code>foo</code> is called with arguments such that
      * <code>oInterface.getModel(i).getObject(oInterface.getPath(i)) === arguments[i + 1]</code>holds.To
      * distinguish those two use cases, just check whether<code>oInterface.getModel() === undefined</code>,
      * in which case the formatter iscalled on root level of a composite binding. To find out the number of
      * parts, probefor the smallest non-negative integer where<code>oInterface.getModel(i) ===
      * undefined</code>.This additional functionality is, of course, not available from{@link
      * sap.ui.model.Context}, i.e. such formatters MUST be called with an instanceof this context
      * interface.
      * @resource sap/ui/core/util/XMLPreprocessor.js
      */
    @js.native
    trait IContext extends js.Object {
      
      /**
        * Returns a context interface for the indicated part in case of the root formatterof a composite
        * binding. The new interface provides access to the originalsettings, but only to the model and path
        * of the indicated part:<pre>this.getInterface(i).getSetting(sName) ===
        * this.getSetting(sName);this.getInterface(i).getModel() ===
        * this.getModel(i);this.getInterface(i).getPath() === this.getPath(i);</pre>If a path is given, the
        * new interface points to the resolved path as follows:<pre>this.getInterface(i, "foo/bar").getPath()
        * === this.getPath(i) + "/foo/bar";this.getInterface(i, "/absolute/path").getPath() ===
        * "/absolute/path";</pre>A formatter which is not at the root level of a composite binding can
        * alsoprovide a path, but must not provide an index:<pre>this.getInterface("foo/bar").getPath() ===
        * this.getPath() + "/foo/bar";this.getInterface("/absolute/path").getPath() ===
        * "/absolute/path";</pre>Note that at least one argument must be present.
        * @since 1.31.0
        * @param iPart index of part in case of the root formatter of a composite binding
        * @param sPath a path, interpreted relative to <code>this.getPath(iPart)</code>
        * @returns the context interface related to the indicated part
        */
      def getInterface(iPart: Double): IContext = js.native
      def getInterface(iPart: Double, sPath: String): IContext = js.native
      
      /**
        * Returns the model related to the current formatter call.
        * @param iPart index of part in case of the root formatter of a composite binding  (since 1.31.0)
        * @returns the model related to the current formatter call, or (since 1.31.0)  <code>undefined</code>
        * in case of a root formatter if no <code>iPart</code> is  given or if <code>iPart</code> is out of
        * range
        */
      def getModel(iPart: Double): Model = js.native
      
      /**
        * Returns the absolute path related to the current formatter call.
        * @param iPart index of part in case of the root formatter of a composite binding  (since 1.31.0)
        * @returns the absolute path related to the current formatter call, or (since 1.31.0) 
        * <code>undefined</code> in case of a root formatter if no <code>iPart</code> is  given or if
        * <code>iPart</code> is out of range
        */
      def getPath(iPart: Double): String = js.native
      
      /**
        * Returns the value of the setting with the given name which was provided to theXML template
        * processing.
        * @param sName the name of the setting
        * @returns the value of the setting
        */
      def getSetting(sName: String): js.Any = js.native
    }
  }
  
  @js.native
  object serializer extends js.Object {
    
    @js.native
    trait HTMLViewSerializer extends EventProvider
    
    @js.native
    trait Serializer extends EventProvider
    
    @js.native
    trait ViewSerializer extends EventProvider
    
    @js.native
    trait XMLViewSerializer extends EventProvider
    
    @js.native
    object delegate extends js.Object {
      
      @js.native
      trait Delegate extends EventProvider
      
      @js.native
      trait HTML extends Delegate
      
      @js.native
      trait XML extends Delegate
    }
  }
}
