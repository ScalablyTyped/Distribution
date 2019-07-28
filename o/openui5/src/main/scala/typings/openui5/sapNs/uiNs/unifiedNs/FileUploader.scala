package typings.openui5.sapNs.uiNs.unifiedNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import typings.openui5.sapNs.uiNs.coreNs.ValueState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.FileUploader")
@js.native
/**
  * Constructor for a new FileUploader.Accepts an object literal <code>mSettings</code> that defines
  * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
  * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
  * object.
  * @param sId id for the new control, generated automatically if no id is given
  * @param mSettings initial settings for the new control
  */
class FileUploader () extends Control {
  def this(mSettings: js.Any) = this()
  /**
    * Constructor for a new FileUploader.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Aborts the currently running upload.
    * @since 1.24.0
    */
  def abort(): Unit = js.native
  /**
    * Adds some headerParameter to the aggregation <code>headerParameters</code>.
    * @param oHeaderParameter the headerParameter to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addHeaderParameter(oHeaderParameter: FileUploaderParameter): FileUploader = js.native
  /**
    * Adds some parameter to the aggregation <code>parameters</code>.
    * @since 1.12.2
    * @param oParameter the parameter to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addParameter(oParameter: FileUploaderParameter): FileUploader = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>change</code> event of this
    * <code>sap.ui.unified.FileUploader</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.FileUploader</code> itself.Event is fired when the value of the file
    * path has been changed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.FileUploader</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachChange(oData: js.Any, fnFunction: js.Any): FileUploader = js.native
  def attachChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): FileUploader = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>fileAllowed</code> event of this
    * <code>sap.ui.unified.FileUploader</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.FileUploader</code> itself.Event is fired when the file is allowed for
    * upload on client side.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.FileUploader</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachFileAllowed(oData: js.Any, fnFunction: js.Any): FileUploader = js.native
  def attachFileAllowed(oData: js.Any, fnFunction: js.Any, oListener: js.Any): FileUploader = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>fileSizeExceed</code> event of this
    * <code>sap.ui.unified.FileUploader</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.FileUploader</code> itself.Event is fired when the size of a file is
    * above the maximumFileSize property.This event is not supported by Internet Explorer 9 (same
    * restriction as for the property maximumFileSize).
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.FileUploader</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachFileSizeExceed(oData: js.Any, fnFunction: js.Any): FileUploader = js.native
  def attachFileSizeExceed(oData: js.Any, fnFunction: js.Any, oListener: js.Any): FileUploader = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>filenameLengthExceed</code> event of
    * this <code>sap.ui.unified.FileUploader</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.FileUploader</code> itself.Event is fired, if the filename of a chosen
    * file is longer than the value specified with the maximumFilenameLength property.
    * @since 1.24.0
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.FileUploader</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachFilenameLengthExceed(oData: js.Any, fnFunction: js.Any): FileUploader = js.native
  def attachFilenameLengthExceed(oData: js.Any, fnFunction: js.Any, oListener: js.Any): FileUploader = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>typeMissmatch</code> event of this
    * <code>sap.ui.unified.FileUploader</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.FileUploader</code> itself.Event is fired when the type of a file does
    * not match the mimeType or fileType property.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.FileUploader</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachTypeMissmatch(oData: js.Any, fnFunction: js.Any): FileUploader = js.native
  def attachTypeMissmatch(oData: js.Any, fnFunction: js.Any, oListener: js.Any): FileUploader = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>uploadAborted</code> event of this
    * <code>sap.ui.unified.FileUploader</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.FileUploader</code> itself.Event is fired after the current upload has
    * been aborted.This is event is only supported with property sendXHR set to true, i.e. the event is
    * not supported in Internet Explorer 9.
    * @since 1.24.0
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.FileUploader</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachUploadAborted(oData: js.Any, fnFunction: js.Any): FileUploader = js.native
  def attachUploadAborted(oData: js.Any, fnFunction: js.Any, oListener: js.Any): FileUploader = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>uploadComplete</code> event of this
    * <code>sap.ui.unified.FileUploader</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.FileUploader</code> itself.Event is fired as soon as the upload request
    * is completed (either successful or unsuccessful). To see if the upload request was successful, check
    * the 'state' parameter for a value 2xx.The uploads actual progress can be retrieved via the
    * 'uploadProgress' Event.However this covers only the client side of the Upload process and does not
    * give any success status from the server.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.FileUploader</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachUploadComplete(oData: js.Any, fnFunction: js.Any): FileUploader = js.native
  def attachUploadComplete(oData: js.Any, fnFunction: js.Any, oListener: js.Any): FileUploader = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>uploadProgress</code> event of this
    * <code>sap.ui.unified.FileUploader</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.FileUploader</code> itself.Event is fired after the upload has started
    * and before the upload is completed and contains progress information related to the running
    * upload.Depending on file size, band width and used browser the event is fired once or multiple
    * times.This is event is only supported with property sendXHR set to true, i.e. the event is not
    * supported in Internet Explorer 9.
    * @since 1.24.0
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.FileUploader</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachUploadProgress(oData: js.Any, fnFunction: js.Any): FileUploader = js.native
  def attachUploadProgress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): FileUploader = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>uploadStart</code> event of this
    * <code>sap.ui.unified.FileUploader</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.FileUploader</code> itself.Event is fired before an upload is started.
    * @since 1.30.0
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.FileUploader</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachUploadStart(oData: js.Any, fnFunction: js.Any): FileUploader = js.native
  def attachUploadStart(oData: js.Any, fnFunction: js.Any, oListener: js.Any): FileUploader = js.native
  /**
    * Clears the content of the FileUploader. The attached additional data however is retained.
    * @since 1.25.0
    */
  def clear(): Unit = js.native
  /**
    * Destroys all the headerParameters in the aggregation <code>headerParameters</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyHeaderParameters(): FileUploader = js.native
  /**
    * Destroys all the parameters in the aggregation <code>parameters</code>.
    * @since 1.12.2
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyParameters(): FileUploader = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>change</code> event of this
    * <code>sap.ui.unified.FileUploader</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachChange(fnFunction: js.Any, oListener: js.Any): FileUploader = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>fileAllowed</code> event of this
    * <code>sap.ui.unified.FileUploader</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachFileAllowed(fnFunction: js.Any, oListener: js.Any): FileUploader = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>fileSizeExceed</code> event of this
    * <code>sap.ui.unified.FileUploader</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachFileSizeExceed(fnFunction: js.Any, oListener: js.Any): FileUploader = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>filenameLengthExceed</code> event of
    * this <code>sap.ui.unified.FileUploader</code>.The passed function and listener object must match the
    * ones used for event registration.
    * @since 1.24.0
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachFilenameLengthExceed(fnFunction: js.Any, oListener: js.Any): FileUploader = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>typeMissmatch</code> event of this
    * <code>sap.ui.unified.FileUploader</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachTypeMissmatch(fnFunction: js.Any, oListener: js.Any): FileUploader = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>uploadAborted</code> event of this
    * <code>sap.ui.unified.FileUploader</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @since 1.24.0
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachUploadAborted(fnFunction: js.Any, oListener: js.Any): FileUploader = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>uploadComplete</code> event of this
    * <code>sap.ui.unified.FileUploader</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachUploadComplete(fnFunction: js.Any, oListener: js.Any): FileUploader = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>uploadProgress</code> event of this
    * <code>sap.ui.unified.FileUploader</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @since 1.24.0
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachUploadProgress(fnFunction: js.Any, oListener: js.Any): FileUploader = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>uploadStart</code> event of this
    * <code>sap.ui.unified.FileUploader</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @since 1.30.0
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachUploadStart(fnFunction: js.Any, oListener: js.Any): FileUploader = js.native
  /**
    * Fires event <code>change</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>newValue</code> of type <code>string</code>New file path
    * value.</li><li><code>files</code> of type <code>object[]</code>Files.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireChange(mArguments: js.Any): FileUploader = js.native
  /**
    * Fires event <code>fileAllowed</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireFileAllowed(mArguments: js.Any): FileUploader = js.native
  /**
    * Fires event <code>fileSizeExceed</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>fileName</code> of type <code>string</code>The name of a file to be
    * uploaded.</li><li><code>fileSize</code> of type <code>string</code>The size in MB of a file to be
    * uploaded.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireFileSizeExceed(mArguments: js.Any): FileUploader = js.native
  /**
    * Fires event <code>filenameLengthExceed</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>fileName</code> of type <code>string</code>The filename, which is longer
    * than specified by the value of the property maximumFilenameLength.</li></ul>
    * @since 1.24.0
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireFilenameLengthExceed(mArguments: js.Any): FileUploader = js.native
  /**
    * Fires event <code>typeMissmatch</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>fileName</code> of type <code>string</code>The name of a file to be
    * uploaded.</li><li><code>fileType</code> of type <code>string</code>The file ending of a file to be
    * uploaded.</li><li><code>mimeType</code> of type <code>string</code>The MIME type of a file to be
    * uploaded.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireTypeMissmatch(mArguments: js.Any): FileUploader = js.native
  /**
    * Fires event <code>uploadAborted</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>fileName</code> of type <code>string</code>The name of a file to be
    * uploaded.</li><li><code>requestHeaders</code> of type <code>object[]</code>Http-Request-Headers.
    * Required for receiving "header" is to set the property "sendXHR" to true.This property is not
    * supported by Internet Explorer 9.</li></ul>
    * @since 1.24.0
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireUploadAborted(mArguments: js.Any): FileUploader = js.native
  /**
    * Fires event <code>uploadComplete</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>fileName</code> of type <code>string</code>The name of a file to be
    * uploaded.</li><li><code>response</code> of type <code>string</code>Response message which comes from
    * the server. On the server side this response has to be put within the &quot;body&quot; tags of the
    * response document of the iFrame.It can consist of a return code and an optional message. This does
    * not work in cross-domain scenarios.</li><li><code>readyStateXHR</code> of type
    * <code>string</code>ReadyState of the XHR request. Required for receiving a readyState is to set the
    * property "sendXHR" to "true". This property is not supported by Internet Explorer
    * 9.</li><li><code>status</code> of type <code>string</code>Status of the XHR request. Required for
    * receiving a status is to set the property "sendXHR" to "true". This property is not supported by
    * Internet Explorer 9.</li><li><code>responseRaw</code> of type <code>string</code>Http-Response which
    * comes from the server. Required for receiving "responseRaw" is to set the property "sendXHR" to
    * true. This property is not supported by Internet Explorer 9.</li><li><code>headers</code> of type
    * <code>object</code>Http-Response-Headers which come from the server. provided as a JSON-map, i.e.
    * each header-field is reflected by a property in the header-object, with the property value
    * reflecting the header-field's content.Required for receiving "header" is to set the property
    * "sendXHR" to true.This property is not supported by Internet Explorer
    * 9.</li><li><code>requestHeaders</code> of type <code>object[]</code>Http-Request-Headers. Required
    * for receiving "header" is to set the property "sendXHR" to true. This property is not supported by
    * Internet Explorer 9.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireUploadComplete(mArguments: js.Any): FileUploader = js.native
  /**
    * Fires event <code>uploadProgress</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>lengthComputable</code> of type <code>boolean</code>Indicates whether or
    * not the relative upload progress can be calculated out of loaded and
    * total.</li><li><code>loaded</code> of type <code>float</code>The number of bytes of the file which
    * have been uploaded by to the time the event was fired.</li><li><code>total</code> of type
    * <code>float</code>The total size of the file to be uploaded in byte.</li><li><code>fileName</code>
    * of type <code>string</code>The name of a file to be uploaded.</li><li><code>requestHeaders</code> of
    * type <code>object[]</code>Http-Request-Headers. Required for receiving "header" is to set the
    * property "sendXHR" to true.This property is not supported by Internet Explorer 9.</li></ul>
    * @since 1.24.0
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireUploadProgress(mArguments: js.Any): FileUploader = js.native
  /**
    * Fires event <code>uploadStart</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>fileName</code> of type <code>string</code>The name of a file to be
    * uploaded.</li><li><code>requestHeaders</code> of type <code>object[]</code>Http-Request-Headers.
    * Required for receiving "header" is to set the property "sendXHR" to true.This property is not
    * supported by Internet Explorer 9.</li></ul>
    * @since 1.30.0
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireUploadStart(mArguments: js.Any): FileUploader = js.native
  /**
    * Gets current value of property <code>additionalData</code>.Additional data that is sent to the back
    * end service. Data will be transmitted as value of a hidden input where the name is derived from the
    * name property with suffix -data.
    * @returns Value of property <code>additionalData</code>
    */
  def getAdditionalData(): String = js.native
  /**
    * Gets current value of property <code>buttonOnly</code>.If set to "true", the FileUploader will be
    * rendered as Button only, without showing the InputField.Default value is <code>false</code>.
    * @returns Value of property <code>buttonOnly</code>
    */
  def getButtonOnly(): Boolean = js.native
  /**
    * Gets current value of property <code>buttonText</code>.The Button text can be overwritten using this
    * property.
    * @returns Value of property <code>buttonText</code>
    */
  def getButtonText(): String = js.native
  /**
    * Gets current value of property <code>enabled</code>.Disabled controls have different colors,
    * depending on customer settings.Default value is <code>true</code>.
    * @returns Value of property <code>enabled</code>
    */
  def getEnabled(): Boolean = js.native
  /**
    * Gets current value of property <code>fileType</code>.The chosen files will be checked against an
    * array of file types. If at least one file does not fit the file type restriction the upload is
    * prevented.Example: ["jpg", "png", "bmp"].
    * @returns Value of property <code>fileType</code>
    */
  def getFileType(): js.Array[String] = js.native
  /**
    * Gets content of aggregation <code>headerParameters</code>.The header parameters for the FileUploader
    * which are only submitted with XHR requests. Header parameters are not supported by Internet Explorer
    * 9.
    */
  def getHeaderParameters(): js.Array[FileUploaderParameter] = js.native
  /**
    * Gets current value of property <code>icon</code>.Icon to be displayed as graphical element within
    * the button.This can be an URI to an image or an icon font URI.Default value is <code></code>.
    * @since 1.26.0
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  /**
    * Gets current value of property <code>iconFirst</code>.If set to true (default), the display sequence
    * is 1. icon 2. control text.Default value is <code>true</code>.
    * @since 1.26.0
    * @returns Value of property <code>iconFirst</code>
    */
  def getIconFirst(): Boolean = js.native
  /**
    * Gets current value of property <code>iconHovered</code>.Icon to be displayed as graphical element
    * within the button when it is hovered (only if also a base icon was specified). If not specified the
    * base icon is used.If a icon font icon is used, this property is ignored.Default value is
    * <code></code>.
    * @since 1.26.0
    * @returns Value of property <code>iconHovered</code>
    */
  def getIconHovered(): js.Any = js.native
  /**
    * Gets current value of property <code>iconOnly</code>.If set to true, the button is displayed without
    * any text.Default value is <code>false</code>.
    * @since 1.26.0
    * @returns Value of property <code>iconOnly</code>
    */
  def getIconOnly(): Boolean = js.native
  /**
    * Gets current value of property <code>iconSelected</code>.Icon to be displayed as graphical element
    * within the button when it is selected (only if also a base icon was specified). If not specified the
    * base or hovered icon is used.If a icon font icon is used, this property is ignored.Default value is
    * <code></code>.
    * @since 1.26.0
    * @returns Value of property <code>iconSelected</code>
    */
  def getIconSelected(): js.Any = js.native
  /**
    * Gets current value of property <code>maximumFileSize</code>.A file size limit in megabytes which
    * prevents the upload if at least one file exceeds it. This property is not supported by Internet
    * Explorer 9.
    * @returns Value of property <code>maximumFileSize</code>
    */
  def getMaximumFileSize(): Double = js.native
  /**
    * Gets current value of property <code>maximumFilenameLength</code>.The maximum length of a filename
    * which the FileUploader will accept. If the maximum filename length is exceeded, the corresponding
    * Event 'filenameLengthExceed' is fired.
    * @since 1.24.0
    * @returns Value of property <code>maximumFilenameLength</code>
    */
  def getMaximumFilenameLength(): Double = js.native
  /**
    * Gets current value of property <code>mimeType</code>.The chosen files will be checked against an
    * array of mime types. If at least one file does not fit the mime type restriction the upload is
    * prevented. This property is not supported by Internet Explorer 9.Example: mimeType ["image/png",
    * "image/jpeg"].
    * @returns Value of property <code>mimeType</code>
    */
  def getMimeType(): js.Array[String] = js.native
  /**
    * Gets current value of property <code>multiple</code>.Allows multiple files to be chosen and uploaded
    * from the same folder. This property is not supported by Internet Explorer 9.Default value is
    * <code>false</code>.
    * @returns Value of property <code>multiple</code>
    */
  def getMultiple(): Boolean = js.native
  /**
    * Gets current value of property <code>name</code>.Unique control name for identification on the
    * server side after sending data to the server.
    * @returns Value of property <code>name</code>
    */
  def getName(): String = js.native
  /**
    * Gets content of aggregation <code>parameters</code>.The parameters for the FileUploader which are
    * rendered as a hidden inputfield.
    * @since 1.12.2
    */
  def getParameters(): js.Array[FileUploaderParameter] = js.native
  /**
    * Gets current value of property <code>placeholder</code>.Placeholder for the text field.
    * @returns Value of property <code>placeholder</code>
    */
  def getPlaceholder(): String = js.native
  /**
    * Gets current value of property <code>sameFilenameAllowed</code>.If the FileUploader is configured to
    * upload the file directly after the file is selected it is not allowed to upload a file with the same
    * name again. If a user should be allowed to upload a file with the same name again this parameter has
    * to be "true". A typical use case would be if the files have different paths.Default value is
    * <code>false</code>.
    * @returns Value of property <code>sameFilenameAllowed</code>
    */
  def getSameFilenameAllowed(): Boolean = js.native
  /**
    * Gets current value of property <code>sendXHR</code>.If set to "true", the request will be sent as
    * XHR request instead of a form submit. This property is not supported by Internet Explorer 9.Default
    * value is <code>false</code>.
    * @returns Value of property <code>sendXHR</code>
    */
  def getSendXHR(): Boolean = js.native
  /**
    * Gets current value of property <code>style</code>.Style of the button. "Transparent, "Accept",
    * "Reject", or "Emphasized" is allowed.
    * @returns Value of property <code>style</code>
    */
  def getStyle(): String = js.native
  /**
    * Gets current value of property <code>uploadOnChange</code>.If set to "true", the upload immediately
    * starts after file selection. With the default setting, the upload needs to be explicitly
    * triggered.Default value is <code>false</code>.
    * @returns Value of property <code>uploadOnChange</code>
    */
  def getUploadOnChange(): Boolean = js.native
  /**
    * Gets current value of property <code>uploadUrl</code>.Used when URL address is on a remote
    * server.Default value is <code></code>.
    * @returns Value of property <code>uploadUrl</code>
    */
  def getUploadUrl(): js.Any = js.native
  /**
    * Gets current value of property <code>useMultipart</code>.If set to "false", the request will be sent
    * as file only request instead of a multipart/form-data request. Only one file could be uploaded using
    * this type of request. Required for sending such a request is to set the property "sendXHR" to
    * "true". This property is not supported by Internet Explorer 9.Default value is <code>true</code>.
    * @returns Value of property <code>useMultipart</code>
    */
  def getUseMultipart(): Boolean = js.native
  /**
    * Gets current value of property <code>value</code>.Value of the path for file upload.Default value is
    * <code></code>.
    * @returns Value of property <code>value</code>
    */
  def getValue(): String = js.native
  /**
    * Gets current value of property <code>valueState</code>.Visualizes warnings or errors related to the
    * text field. Possible values: Warning, Error, Success, None.Default value is <code>None</code>.
    * @since 1.24.0
    * @returns Value of property <code>valueState</code>
    */
  def getValueState(): ValueState = js.native
  /**
    * Gets current value of property <code>width</code>.Specifies the displayed control width.Default
    * value is <code></code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Checks for the provided <code>sap.ui.unified.FileUploaderParameter</code> in the aggregation
    * <code>headerParameters</code>.and returns its index if found or -1 otherwise.
    * @param oHeaderParameter The headerParameter whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfHeaderParameter(oHeaderParameter: FileUploaderParameter): Double = js.native
  /**
    * Checks for the provided <code>sap.ui.unified.FileUploaderParameter</code> in the aggregation
    * <code>parameters</code>.and returns its index if found or -1 otherwise.
    * @since 1.12.2
    * @param oParameter The parameter whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfParameter(oParameter: FileUploaderParameter): Double = js.native
  /**
    * Inserts a headerParameter into the aggregation <code>headerParameters</code>.
    * @param oHeaderParameter the headerParameter to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the headerParameter should be inserted at; for         
    *    a negative value of <code>iIndex</code>, the headerParameter is inserted at position 0; for a
    * value             greater than the current size of the aggregation, the headerParameter is inserted
    * at             the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertHeaderParameter(oHeaderParameter: FileUploaderParameter, iIndex: Double): FileUploader = js.native
  /**
    * Inserts a parameter into the aggregation <code>parameters</code>.
    * @since 1.12.2
    * @param oParameter the parameter to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the parameter should be inserted at; for             a
    * negative value of <code>iIndex</code>, the parameter is inserted at position 0; for a value         
    *    greater than the current size of the aggregation, the parameter is inserted at             the
    * last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertParameter(oParameter: FileUploaderParameter, iIndex: Double): FileUploader = js.native
  /**
    * Removes all the controls from the aggregation <code>headerParameters</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllHeaderParameters(): js.Array[FileUploaderParameter] = js.native
  /**
    * Removes all the controls from the aggregation <code>parameters</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @since 1.12.2
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllParameters(): js.Array[FileUploaderParameter] = js.native
  def removeHeaderParameter(vHeaderParameter: String): FileUploaderParameter = js.native
  /**
    * Removes a headerParameter from the aggregation <code>headerParameters</code>.
    * @param vHeaderParameter The headerParameter to remove or its index or id
    * @returns The removed headerParameter or <code>null</code>
    */
  def removeHeaderParameter(vHeaderParameter: Double): FileUploaderParameter = js.native
  def removeHeaderParameter(vHeaderParameter: FileUploaderParameter): FileUploaderParameter = js.native
  def removeParameter(vParameter: String): FileUploaderParameter = js.native
  /**
    * Removes a parameter from the aggregation <code>parameters</code>.
    * @since 1.12.2
    * @param vParameter The parameter to remove or its index or id
    * @returns The removed parameter or <code>null</code>
    */
  def removeParameter(vParameter: Double): FileUploaderParameter = js.native
  def removeParameter(vParameter: FileUploaderParameter): FileUploaderParameter = js.native
  /**
    * Sets a new value for property <code>additionalData</code>.Additional data that is sent to the back
    * end service. Data will be transmitted as value of a hidden input where the name is derived from the
    * name property with suffix -data.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sAdditionalData New value for property <code>additionalData</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAdditionalData(sAdditionalData: String): FileUploader = js.native
  /**
    * Sets a new value for property <code>buttonOnly</code>.If set to "true", the FileUploader will be
    * rendered as Button only, without showing the InputField.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @param bButtonOnly New value for property <code>buttonOnly</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setButtonOnly(bButtonOnly: Boolean): FileUploader = js.native
  /**
    * Sets a new value for property <code>buttonText</code>.The Button text can be overwritten using this
    * property.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param sButtonText New value for property <code>buttonText</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setButtonText(sButtonText: String): FileUploader = js.native
  /**
    * Sets a new value for property <code>enabled</code>.Disabled controls have different colors,
    * depending on customer settings.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bEnabled New value for property <code>enabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnabled(bEnabled: Boolean): FileUploader = js.native
  /**
    * Sets a new value for property <code>fileType</code>.The chosen files will be checked against an
    * array of file types. If at least one file does not fit the file type restriction the upload is
    * prevented.Example: ["jpg", "png", "bmp"].When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sFileType New value for property <code>fileType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFileType(sFileType: js.Array[String]): FileUploader = js.native
  /**
    * Sets a new value for property <code>icon</code>.Icon to be displayed as graphical element within the
    * button.This can be an URI to an image or an icon font URI.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @since 1.26.0
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): FileUploader = js.native
  /**
    * Sets a new value for property <code>iconFirst</code>.If set to true (default), the display sequence
    * is 1. icon 2. control text.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>true</code>.
    * @since 1.26.0
    * @param bIconFirst New value for property <code>iconFirst</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconFirst(bIconFirst: Boolean): FileUploader = js.native
  /**
    * Sets a new value for property <code>iconHovered</code>.Icon to be displayed as graphical element
    * within the button when it is hovered (only if also a base icon was specified). If not specified the
    * base icon is used.If a icon font icon is used, this property is ignored.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @since 1.26.0
    * @param sIconHovered New value for property <code>iconHovered</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconHovered(sIconHovered: js.Any): FileUploader = js.native
  /**
    * Sets a new value for property <code>iconOnly</code>.If set to true, the button is displayed without
    * any text.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>false</code>.
    * @since 1.26.0
    * @param bIconOnly New value for property <code>iconOnly</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconOnly(bIconOnly: Boolean): FileUploader = js.native
  /**
    * Sets a new value for property <code>iconSelected</code>.Icon to be displayed as graphical element
    * within the button when it is selected (only if also a base icon was specified). If not specified the
    * base or hovered icon is used.If a icon font icon is used, this property is ignored.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @since 1.26.0
    * @param sIconSelected New value for property <code>iconSelected</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconSelected(sIconSelected: js.Any): FileUploader = js.native
  /**
    * Sets a new value for property <code>maximumFileSize</code>.A file size limit in megabytes which
    * prevents the upload if at least one file exceeds it. This property is not supported by Internet
    * Explorer 9.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @param fMaximumFileSize New value for property <code>maximumFileSize</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaximumFileSize(fMaximumFileSize: Double): FileUploader = js.native
  /**
    * Sets a new value for property <code>maximumFilenameLength</code>.The maximum length of a filename
    * which the FileUploader will accept. If the maximum filename length is exceeded, the corresponding
    * Event 'filenameLengthExceed' is fired.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @since 1.24.0
    * @param iMaximumFilenameLength New value for property <code>maximumFilenameLength</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaximumFilenameLength(iMaximumFilenameLength: Double): FileUploader = js.native
  /**
    * Sets a new value for property <code>mimeType</code>.The chosen files will be checked against an
    * array of mime types. If at least one file does not fit the mime type restriction the upload is
    * prevented. This property is not supported by Internet Explorer 9.Example: mimeType ["image/png",
    * "image/jpeg"].When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @param sMimeType New value for property <code>mimeType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMimeType(sMimeType: js.Array[String]): FileUploader = js.native
  /**
    * Sets a new value for property <code>multiple</code>.Allows multiple files to be chosen and uploaded
    * from the same folder. This property is not supported by Internet Explorer 9.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @param bMultiple New value for property <code>multiple</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMultiple(bMultiple: Boolean): FileUploader = js.native
  /**
    * Sets a new value for property <code>name</code>.Unique control name for identification on the server
    * side after sending data to the server.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sName New value for property <code>name</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setName(sName: String): FileUploader = js.native
  /**
    * Sets a new value for property <code>placeholder</code>.Placeholder for the text field.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.
    * @param sPlaceholder New value for property <code>placeholder</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPlaceholder(sPlaceholder: String): FileUploader = js.native
  /**
    * Sets a new value for property <code>sameFilenameAllowed</code>.If the FileUploader is configured to
    * upload the file directly after the file is selected it is not allowed to upload a file with the same
    * name again. If a user should be allowed to upload a file with the same name again this parameter has
    * to be "true". A typical use case would be if the files have different paths.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @param bSameFilenameAllowed New value for property <code>sameFilenameAllowed</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSameFilenameAllowed(bSameFilenameAllowed: Boolean): FileUploader = js.native
  /**
    * Sets a new value for property <code>sendXHR</code>.If set to "true", the request will be sent as XHR
    * request instead of a form submit. This property is not supported by Internet Explorer 9.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>false</code>.
    * @param bSendXHR New value for property <code>sendXHR</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSendXHR(bSendXHR: Boolean): FileUploader = js.native
  /**
    * Sets a new value for property <code>style</code>.Style of the button. "Transparent, "Accept",
    * "Reject", or "Emphasized" is allowed.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sStyle New value for property <code>style</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setStyle(sStyle: String): FileUploader = js.native
  /**
    * Sets a new value for property <code>uploadOnChange</code>.If set to "true", the upload immediately
    * starts after file selection. With the default setting, the upload needs to be explicitly
    * triggered.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>false</code>.
    * @param bUploadOnChange New value for property <code>uploadOnChange</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setUploadOnChange(bUploadOnChange: Boolean): FileUploader = js.native
  /**
    * Sets a new value for property <code>uploadUrl</code>.Used when URL address is on a remote
    * server.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code></code>.
    * @param sUploadUrl New value for property <code>uploadUrl</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setUploadUrl(sUploadUrl: js.Any): FileUploader = js.native
  /**
    * Sets a new value for property <code>useMultipart</code>.If set to "false", the request will be sent
    * as file only request instead of a multipart/form-data request. Only one file could be uploaded using
    * this type of request. Required for sending such a request is to set the property "sendXHR" to
    * "true". This property is not supported by Internet Explorer 9.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bUseMultipart New value for property <code>useMultipart</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setUseMultipart(bUseMultipart: Boolean): FileUploader = js.native
  /**
    * Sets a new value for property <code>value</code>.Value of the path for file upload.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @param sValue New value for property <code>value</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValue(sValue: String): FileUploader = js.native
  /**
    * Sets a new value for property <code>valueState</code>.Visualizes warnings or errors related to the
    * text field. Possible values: Warning, Error, Success, None.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>None</code>.
    * @since 1.24.0
    * @param sValueState New value for property <code>valueState</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValueState(sValueState: ValueState): FileUploader = js.native
  /**
    * Sets a new value for property <code>width</code>.Specifies the displayed control width.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code></code>.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): FileUploader = js.native
  /**
    * Starts the upload (as defined by uploadUrl)
    */
  def upload(): Unit = js.native
}

