package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadCollection
  extends StObject
     with Control {
  
  /**
    * Adds some headerParameter to the aggregation <code>headerParameters</code>.
    * @param oHeaderParameter the headerParameter to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addHeaderParameter(oHeaderParameter: UploadCollectionParameter): UploadCollection = js.native
  
  /**
    * Adds some item to the aggregation <code>items</code>.
    * @param oItem the item to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addItem(oItem: UploadCollectionItem): UploadCollection = js.native
  
  /**
    * Adds some parameter to the aggregation <code>parameters</code>.
    * @param oParameter the parameter to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addParameter(oParameter: UploadCollectionParameter): UploadCollection = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>beforeUploadStarts</code> event of this
    * <code>sap.m.UploadCollection</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.UploadCollection</code> itself.The event is triggered before the actual upload
    * starts. An event is fired per file. All the necessary header parameters should be set here.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.UploadCollection</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachBeforeUploadStarts(oData: js.Any, fnFunction: js.Any): UploadCollection = js.native
  def attachBeforeUploadStarts(oData: js.Any, fnFunction: js.Any, oListener: js.Any): UploadCollection = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>change</code> event of this
    * <code>sap.m.UploadCollection</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.UploadCollection</code> itself.The event is triggered when files are selected in
    * the FileUploader dialog. Applications can set parameters and headerParameters which will be
    * dispatched to the embedded FileUploader control.Limitation: parameters and headerParameters are not
    * supported by Internet Explorer 9.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.UploadCollection</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachChange(oData: js.Any, fnFunction: js.Any): UploadCollection = js.native
  def attachChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): UploadCollection = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>fileDeleted</code> event of this
    * <code>sap.m.UploadCollection</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.UploadCollection</code> itself.The event is triggered when an uploaded
    * attachment is selected and the Delete button is pressed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.UploadCollection</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachFileDeleted(oData: js.Any, fnFunction: js.Any): UploadCollection = js.native
  def attachFileDeleted(oData: js.Any, fnFunction: js.Any, oListener: js.Any): UploadCollection = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>fileRenamed</code> event of this
    * <code>sap.m.UploadCollection</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.UploadCollection</code> itself.The event is triggered when the file name is
    * changed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.UploadCollection</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachFileRenamed(oData: js.Any, fnFunction: js.Any): UploadCollection = js.native
  def attachFileRenamed(oData: js.Any, fnFunction: js.Any, oListener: js.Any): UploadCollection = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>fileSizeExceed</code> event of this
    * <code>sap.m.UploadCollection</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.UploadCollection</code> itself.The event is triggered when the file size of an
    * uploaded file is exceeded (only if the maxFileSize property was provided by the application).This
    * event is not supported by Internet Explorer 9.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.UploadCollection</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachFileSizeExceed(oData: js.Any, fnFunction: js.Any): UploadCollection = js.native
  def attachFileSizeExceed(oData: js.Any, fnFunction: js.Any, oListener: js.Any): UploadCollection = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>filenameLengthExceed</code> event of
    * this <code>sap.m.UploadCollection</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.UploadCollection</code> itself.The event is triggered when the name of a chosen
    * file is longer than the value specified with the maximumFilenameLength property (only if provided by
    * the application).
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.UploadCollection</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachFilenameLengthExceed(oData: js.Any, fnFunction: js.Any): UploadCollection = js.native
  def attachFilenameLengthExceed(oData: js.Any, fnFunction: js.Any, oListener: js.Any): UploadCollection = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>selectionChange</code> event of this
    * <code>sap.m.UploadCollection</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.UploadCollection</code> itself.Fires when selection is changed via user
    * interaction inside the control.
    * @since 1.36.0
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.UploadCollection</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSelectionChange(oData: js.Any, fnFunction: js.Any): UploadCollection = js.native
  def attachSelectionChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): UploadCollection = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>typeMissmatch</code> event of this
    * <code>sap.m.UploadCollection</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.UploadCollection</code> itself.The event is triggered when the file type or the
    * MIME type don't match the permitted types (only if the fileType property or the mimeType property
    * are provided by the application).
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.UploadCollection</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachTypeMissmatch(oData: js.Any, fnFunction: js.Any): UploadCollection = js.native
  def attachTypeMissmatch(oData: js.Any, fnFunction: js.Any, oListener: js.Any): UploadCollection = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>uploadComplete</code> event of this
    * <code>sap.m.UploadCollection</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.UploadCollection</code> itself.The event is triggered as soon as the upload
    * request is completed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.UploadCollection</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachUploadComplete(oData: js.Any, fnFunction: js.Any): UploadCollection = js.native
  def attachUploadComplete(oData: js.Any, fnFunction: js.Any, oListener: js.Any): UploadCollection = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>uploadTerminated</code> event of this
    * <code>sap.m.UploadCollection</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.UploadCollection</code> itself.The event is triggered as soon as the upload
    * request was terminated by the user.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.UploadCollection</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachUploadTerminated(oData: js.Any, fnFunction: js.Any): UploadCollection = js.native
  def attachUploadTerminated(oData: js.Any, fnFunction: js.Any, oListener: js.Any): UploadCollection = js.native
  
  /**
    * Binds aggregation <code>items</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindItems(oBindingInfo: js.Any): UploadCollection = js.native
  
  /**
    * Destroys all the headerParameters in the aggregation <code>headerParameters</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyHeaderParameters(): UploadCollection = js.native
  
  /**
    * Destroys all the items in the aggregation <code>items</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyItems(): UploadCollection = js.native
  
  /**
    * Destroys all the parameters in the aggregation <code>parameters</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyParameters(): UploadCollection = js.native
  
  /**
    * Destroys the toolbar in the aggregation <code>toolbar</code>.
    * @since 1.34
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyToolbar(): UploadCollection = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>beforeUploadStarts</code> event of
    * this <code>sap.m.UploadCollection</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachBeforeUploadStarts(fnFunction: js.Any, oListener: js.Any): UploadCollection = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>change</code> event of this
    * <code>sap.m.UploadCollection</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachChange(fnFunction: js.Any, oListener: js.Any): UploadCollection = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>fileDeleted</code> event of this
    * <code>sap.m.UploadCollection</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachFileDeleted(fnFunction: js.Any, oListener: js.Any): UploadCollection = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>fileRenamed</code> event of this
    * <code>sap.m.UploadCollection</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachFileRenamed(fnFunction: js.Any, oListener: js.Any): UploadCollection = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>fileSizeExceed</code> event of this
    * <code>sap.m.UploadCollection</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachFileSizeExceed(fnFunction: js.Any, oListener: js.Any): UploadCollection = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>filenameLengthExceed</code> event of
    * this <code>sap.m.UploadCollection</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachFilenameLengthExceed(fnFunction: js.Any, oListener: js.Any): UploadCollection = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>selectionChange</code> event of this
    * <code>sap.m.UploadCollection</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @since 1.36.0
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSelectionChange(fnFunction: js.Any, oListener: js.Any): UploadCollection = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>typeMissmatch</code> event of this
    * <code>sap.m.UploadCollection</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachTypeMissmatch(fnFunction: js.Any, oListener: js.Any): UploadCollection = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>uploadComplete</code> event of this
    * <code>sap.m.UploadCollection</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachUploadComplete(fnFunction: js.Any, oListener: js.Any): UploadCollection = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>uploadTerminated</code> event of this
    * <code>sap.m.UploadCollection</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachUploadTerminated(fnFunction: js.Any, oListener: js.Any): UploadCollection = js.native
  
  /**
    * Downloads the given item.This function delegates to {sap.m.UploadCollectionItem.download}.
    * @since 1.36.0
    * @param uploadCollectionItem The item to download. This parameter is mandatory.
    * @param askForLocation Decides whether to ask for a location to download or not.
    * @returns True if the download has started successfully. False if the download couldn't be started.
    */
  def downloadItem(uploadCollectionItem: UploadCollectionItem, askForLocation: Boolean): Boolean = js.native
  
  /**
    * Fires event <code>beforeUploadStarts</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>fileName</code> of type <code>string</code>Specifies the name of the file
    * to be uploaded.</li><li><code>addHeaderParameter</code> of type <code>function</code>Adds a header
    * parameter to the file that will be uploaded.</li><li><code>getHeaderParameter</code> of type
    * <code>function</code>Returns the corresponding header parameter (type
    * sap.m.UploadCollectionParameter) if available.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireBeforeUploadStarts(mArguments: js.Any): UploadCollection = js.native
  
  /**
    * Fires event <code>change</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>documentId</code> of type <code>string</code>An unique Id of the attached
    * document.This parameter is deprecated since version 1.28.0, use parameter files
    * instead.</li><li><code>files</code> of type <code>object[]</code>A FileList of individually selected
    * files from the underlying system. See www.w3.org for the FileList Interface definition.Limitation:
    * Internet Explorer 9 supports only single file with property file.name.Since version
    * 1.28.0.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireChange(mArguments: js.Any): UploadCollection = js.native
  
  /**
    * Fires event <code>fileDeleted</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>documentId</code> of type <code>string</code>An unique Id of the attached
    * document.This parameter is deprecated since version 1.28.0, use parameter item
    * instead.</li><li><code>item</code> of type <code>sap.m.UploadCollectionItem</code>An item to be
    * deleted from the collection.Since version 1.28.0.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireFileDeleted(mArguments: js.Any): UploadCollection = js.native
  
  /**
    * Fires event <code>fileRenamed</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>documentId</code> of type <code>string</code>An unique Id of the attached
    * document.This parameter is deprecated since version 1.28.0, use parameter item
    * instead.</li><li><code>fileName</code> of type <code>string</code>The new file name.This parameter
    * is deprecated since version 1.28.0, use parameter item instead.</li><li><code>item</code> of type
    * <code>sap.m.UploadCollectionItem</code>The renamed UI element as a UploadCollectionItem.Since
    * version 1.28.0.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireFileRenamed(mArguments: js.Any): UploadCollection = js.native
  
  /**
    * Fires event <code>fileSizeExceed</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>documentId</code> of type <code>string</code>An unique Id of the attached
    * document.This parameter is deprecated since version 1.28.0, use parameter files
    * instead.</li><li><code>fileSize</code> of type <code>string</code>The size in MB of a file to be
    * uploaded.This parameter is deprecated since version 1.28.0, use parameter files
    * instead.</li><li><code>files</code> of type <code>object[]</code>A FileList of individually selected
    * files from the underlying system.Limitation: Internet Explorer 9 supports only single file with
    * property file.name.Since version 1.28.0.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireFileSizeExceed(mArguments: js.Any): UploadCollection = js.native
  
  /**
    * Fires event <code>filenameLengthExceed</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>documentId</code> of type <code>string</code>An unique Id of the attached
    * document.This parameter is deprecated since version 1.28.0, use parameter files
    * instead.</li><li><code>files</code> of type <code>object[]</code>A FileList of individually selected
    * files from the underlying system.Limitation: Internet Explorer 9 supports only single file with
    * property file.name.Since version 1.28.0.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireFilenameLengthExceed(mArguments: js.Any): UploadCollection = js.native
  
  /**
    * Fires event <code>selectionChange</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>selectedItem</code> of type <code>sap.m.UploadCollectionItem</code>The item
    * whose selection has changed. In <code>MultiSelect</code> mode, only the selected item upmost is
    * returned. This parameter can be used for single-selection modes.</li><li><code>selectedItems</code>
    * of type <code>sap.m.UploadCollectionItem[]</code>Array of items whose selection has changed. This
    * parameter can be used for <code>MultiSelect</code> mode.</li><li><code>selected</code> of type
    * <code>boolean</code>Indicates whether the <code>listItem</code> parameter is selected or
    * not.</li></ul>
    * @since 1.36.0
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSelectionChange(mArguments: js.Any): UploadCollection = js.native
  
  /**
    * Fires event <code>typeMissmatch</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>documentId</code> of type <code>string</code>An unique Id of the attached
    * document.This parameter is deprecated since version 1.28.0, use parameter files
    * instead.</li><li><code>fileType</code> of type <code>string</code>File type.This parameter is
    * deprecated since version 1.28.0, use parameter files instead.</li><li><code>mimeType</code> of type
    * <code>string</code>MIME type.This parameter is deprecated since version 1.28.0, use parameter files
    * instead.</li><li><code>files</code> of type <code>object[]</code>A FileList of individually selected
    * files from the underlying system.Limitation: Internet Explorer 9 supports only single file.Since
    * version 1.28.0.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireTypeMissmatch(mArguments: js.Any): UploadCollection = js.native
  
  /**
    * Fires event <code>uploadComplete</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>readyStateXHR</code> of type <code>string</code>Ready state XHR. This
    * parameter is deprecated since version 1.28.0., use parameter files
    * instead.</li><li><code>response</code> of type <code>string</code>Response of the completed upload
    * request. This parameter is deprecated since version 1.28.0., use parameter files
    * instead.</li><li><code>status</code> of type <code>string</code>Status Code of the completed upload
    * event. This parameter is deprecated since version 1.28.0., use parameter files
    * instead.</li><li><code>files</code> of type <code>object[]</code>A list of uploaded files. Each
    * entry contains the following members.fileName    : The name of a file to be uploaded.response    :
    * Response message which comes from the server. On the server side, this response has to be put within
    * the 'body' tags of the response document of the iFrame. It can consist of a return code and an
    * optional message. This does not work in cross-domain scenarios.responseRaw : HTTP-Response which
    * comes from the server. This property is not supported by Internet Explorer Versions lower than
    * 9.status    : Status of the XHR request. This property is not supported by Internet Explorer 9 and
    * lower.headers : HTTP-Response-Headers which come from the server. Provided as a JSON-map, i.e. each
    * header-field is reflected by a property in the header-object, with the property value reflecting the
    * header-field's content. This property is not supported by Internet Explorer 9 and lower.Since
    * version 1.28.0.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireUploadComplete(mArguments: js.Any): UploadCollection = js.native
  
  /**
    * Fires event <code>uploadTerminated</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>fileName</code> of type <code>string</code>Specifies the name of the file
    * of which the upload is to be terminated.</li><li><code>getHeaderParameter</code> of type
    * <code>function</code>This callback function returns the corresponding header parameter (type
    * sap.m.UploadCollectionParameter) if available.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireUploadTerminated(mArguments: js.Any): UploadCollection = js.native
  
  /**
    * Gets current value of property <code>fileType</code>.Defines the allowed file types for the
    * upload.The chosen files will be checked against an array of file types.If at least one file does not
    * fit the file type requirements, the upload is prevented.  Example: ["jpg", "png", "bmp"].
    * @returns Value of property <code>fileType</code>
    */
  def getFileType(): js.Array[String] = js.native
  
  /**
    * Gets content of aggregation <code>headerParameters</code>.Specifies the header parameters for the
    * FileUploader that are submitted only with XHR requests.Header parameters are not supported by
    * Internet Explorer 8 and 9.
    */
  def getHeaderParameters(): js.Array[UploadCollectionParameter] = js.native
  
  /**
    * Gets current value of property <code>instantUpload</code>.If false, no upload is triggered when a
    * file is selected. In addition, if a file was selected, a new FileUploader instance is created to
    * ensure that multiple files from multiple folders can be chosen.Default value is <code>true</code>.
    * @since 1.30
    * @returns Value of property <code>instantUpload</code>
    */
  def getInstantUpload(): Boolean = js.native
  
  /**
    * Gets content of aggregation <code>items</code>.Uploaded items.
    */
  def getItems(): js.Array[UploadCollectionItem] = js.native
  
  /**
    * Gets current value of property <code>maximumFileSize</code>.Specifies a file size limit in megabytes
    * that prevents the upload if at least one file exceeds the limit.This property is not supported by
    * Internet Explorer 8 and 9.
    * @returns Value of property <code>maximumFileSize</code>
    */
  def getMaximumFileSize(): Double = js.native
  
  /**
    * Gets current value of property <code>maximumFilenameLength</code>.Specifies the maximum length of a
    * file name.If the maximum file name length is exceeded, the corresponding event
    * 'filenameLengthExceed' is triggered.
    * @returns Value of property <code>maximumFilenameLength</code>
    */
  def getMaximumFilenameLength(): Double = js.native
  
  /**
    * Gets current value of property <code>mimeType</code>.Defines the allowed MIME types of files to be
    * uploaded.The chosen files will be checked against an array of MIME types.If at least one file does
    * not fit the MIME type requirements, the upload is prevented.This property is not supported by
    * Internet Explorer 8 and 9. Example: mimeType ["image/png", "image/jpeg"].
    * @returns Value of property <code>mimeType</code>
    */
  def getMimeType(): js.Array[String] = js.native
  
  /**
    * Gets current value of property <code>mode</code>.Defines the selection mode of the control (e.g.
    * None, SingleSelect, MultiSelect, SingleSelectLeft, SingleSelectMaster).Since the UploadCollection
    * reacts like a list for attachments, the API is close to the ListBase Interface.sap.m.ListMode.Delete
    * mode is not supported and will be automatically set to sap.m.ListMode.None.In addition, if instant
    * upload is set to false the mode sap.m.ListMode.MultiSelect is not supported and will be
    * automatically set to sap.m.ListMode.None.Default value is <code>None</code>.
    * @since 1.34
    * @returns Value of property <code>mode</code>
    */
  def getMode(): ListMode = js.native
  
  /**
    * Gets current value of property <code>multiple</code>.Lets the user select multiple files from the
    * same folder and then upload them.Internet Explorer 8 and 9 do not support this property.Please note
    * that the various operating systems for mobile devices can react differently to the property so that
    * fewer upload functions may be available in some cases.Default value is <code>false</code>.
    * @returns Value of property <code>multiple</code>
    */
  def getMultiple(): Boolean = js.native
  
  /**
    * Gets current value of property <code>noDataText</code>.Allows you to set your own text for the 'No
    * data' label.
    * @returns Value of property <code>noDataText</code>
    */
  def getNoDataText(): String = js.native
  
  /**
    * Gets current value of property <code>numberOfAttachmentsText</code>.Sets the title text in the
    * toolbar of the list of attachments.To show as well the number of attachments in brackets like the
    * default text does. The number of attachments could be retrieved via "getItems().length".If a new
    * title is set, the default is deactivated.The default value is set to language-dependent "Attachments
    * (n)".
    * @since 1.30
    * @returns Value of property <code>numberOfAttachmentsText</code>
    */
  def getNumberOfAttachmentsText(): String = js.native
  
  /**
    * Gets content of aggregation <code>parameters</code>.Specifies the parameters for the FileUploader
    * that are rendered as a hidden input field.
    */
  def getParameters(): js.Array[UploadCollectionParameter] = js.native
  
  /**
    * Gets current value of property <code>sameFilenameAllowed</code>.Allows the user to use the same name
    * for a file when editing the file name. 'Same name' refers to an already existing file name in the
    * list.Default value is <code>false</code>.
    * @returns Value of property <code>sameFilenameAllowed</code>
    */
  def getSameFilenameAllowed(): Boolean = js.native
  
  /**
    * Returns selected UploadCollectionItem.
    * @since 1.34
    * @returns selected item
    */
  def getSelectedItem(): UploadCollectionItem = js.native
  
  /**
    * Returns an array containing the selected UploadCollectionItems.
    * @since 1.34
    * @returns array with selected items
    */
  def getSelectedItems(): js.Array[UploadCollectionItem] = js.native
  
  /**
    * Gets current value of property <code>showSeparators</code>.Defines whether separators are shown
    * between list items.Default value is <code>All</code>.
    * @returns Value of property <code>showSeparators</code>
    */
  def getShowSeparators(): ListSeparators = js.native
  
  /**
    * Gets content of aggregation <code>toolbar</code>.Specifies the toolbar.
    * @since 1.34
    */
  def getToolbar(): OverflowToolbar = js.native
  
  /**
    * Gets current value of property <code>uploadEnabled</code>.Enables the upload of a file.Default value
    * is <code>true</code>.
    * @returns Value of property <code>uploadEnabled</code>
    */
  def getUploadEnabled(): Boolean = js.native
  
  /**
    * Gets current value of property <code>uploadUrl</code>.Specifies the URL where the uploaded files
    * have to be stored.Default value is <code>../../../upload</code>.
    * @returns Value of property <code>uploadUrl</code>
    */
  def getUploadUrl(): String = js.native
  
  /**
    * Checks for the provided <code>sap.m.UploadCollectionParameter</code> in the aggregation
    * <code>headerParameters</code>.and returns its index if found or -1 otherwise.
    * @param oHeaderParameter The headerParameter whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfHeaderParameter(oHeaderParameter: UploadCollectionParameter): Double = js.native
  
  /**
    * Checks for the provided <code>sap.m.UploadCollectionItem</code> in the aggregation
    * <code>items</code>.and returns its index if found or -1 otherwise.
    * @param oItem The item whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfItem(oItem: UploadCollectionItem): Double = js.native
  
  /**
    * Checks for the provided <code>sap.m.UploadCollectionParameter</code> in the aggregation
    * <code>parameters</code>.and returns its index if found or -1 otherwise.
    * @param oParameter The parameter whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfParameter(oParameter: UploadCollectionParameter): Double = js.native
  
  /**
    * Inserts a headerParameter into the aggregation <code>headerParameters</code>.
    * @param oHeaderParameter the headerParameter to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the headerParameter should be inserted at; for         
    *    a negative value of <code>iIndex</code>, the headerParameter is inserted at position 0; for a
    * value             greater than the current size of the aggregation, the headerParameter is inserted
    * at             the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertHeaderParameter(oHeaderParameter: UploadCollectionParameter, iIndex: Double): UploadCollection = js.native
  
  /**
    * Inserts a item into the aggregation <code>items</code>.
    * @param oItem the item to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the item should be inserted at; for             a
    * negative value of <code>iIndex</code>, the item is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the item is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertItem(oItem: UploadCollectionItem, iIndex: Double): UploadCollection = js.native
  
  /**
    * Inserts a parameter into the aggregation <code>parameters</code>.
    * @param oParameter the parameter to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the parameter should be inserted at; for             a
    * negative value of <code>iIndex</code>, the parameter is inserted at position 0; for a value         
    *    greater than the current size of the aggregation, the parameter is inserted at             the
    * last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertParameter(oParameter: UploadCollectionParameter, iIndex: Double): UploadCollection = js.native
  
  /**
    * Opens the FileUploader dialog. When an UploadCollectionItem is provided, this method can be used to
    * update a file with a new version.In this case, the upload progress can be sequenced using the
    * events: beforeUploadStarts, uploadComplete and uploadTerminated. For this use,multiple properties
    * from the UploadCollection have to be set to false. If no UploadCollectionItem is provided, only the
    * dialog opensand no further configuration of the UploadCollection is needed.
    * @since 1.38.0
    * @param item The item to update with a new version. This parameter is mandatory.
    * @returns To ensure method chaining, return the UploadCollection.
    */
  def openFileDialog(item: UploadCollectionItem): UploadCollection = js.native
  
  /**
    * Removes all the controls from the aggregation <code>headerParameters</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllHeaderParameters(): js.Array[UploadCollectionParameter] = js.native
  
  /**
    * Removes all the controls from the aggregation <code>items</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllItems(): js.Array[UploadCollectionItem] = js.native
  
  /**
    * Removes all the controls from the aggregation <code>parameters</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllParameters(): js.Array[UploadCollectionParameter] = js.native
  
  def removeHeaderParameter(vHeaderParameter: String): UploadCollectionParameter = js.native
  /**
    * Removes a headerParameter from the aggregation <code>headerParameters</code>.
    * @param vHeaderParameter The headerParameter to remove or its index or id
    * @returns The removed headerParameter or <code>null</code>
    */
  def removeHeaderParameter(vHeaderParameter: Double): UploadCollectionParameter = js.native
  def removeHeaderParameter(vHeaderParameter: UploadCollectionParameter): UploadCollectionParameter = js.native
  
  def removeItem(vItem: String): UploadCollectionItem = js.native
  /**
    * Removes a item from the aggregation <code>items</code>.
    * @param vItem The item to remove or its index or id
    * @returns The removed item or <code>null</code>
    */
  def removeItem(vItem: Double): UploadCollectionItem = js.native
  def removeItem(vItem: UploadCollectionItem): UploadCollectionItem = js.native
  
  def removeParameter(vParameter: String): UploadCollectionParameter = js.native
  /**
    * Removes a parameter from the aggregation <code>parameters</code>.
    * @param vParameter The parameter to remove or its index or id
    * @returns The removed parameter or <code>null</code>
    */
  def removeParameter(vParameter: Double): UploadCollectionParameter = js.native
  def removeParameter(vParameter: UploadCollectionParameter): UploadCollectionParameter = js.native
  
  /**
    * Select all items in "MultiSelection" mode.
    * @since 1.34
    * @returns The current UploadCollection
    */
  def selectAll(): UploadCollection = js.native
  
  /**
    * Sets a new value for property <code>fileType</code>.Defines the allowed file types for the
    * upload.The chosen files will be checked against an array of file types.If at least one file does not
    * fit the file type requirements, the upload is prevented.  Example: ["jpg", "png", "bmp"].When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.
    * @param sFileType New value for property <code>fileType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFileType(sFileType: js.Array[String]): UploadCollection = js.native
  
  /**
    * Sets a new value for property <code>instantUpload</code>.If false, no upload is triggered when a
    * file is selected. In addition, if a file was selected, a new FileUploader instance is created to
    * ensure that multiple files from multiple folders can be chosen.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @since 1.30
    * @param bInstantUpload New value for property <code>instantUpload</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setInstantUpload(bInstantUpload: Boolean): UploadCollection = js.native
  
  /**
    * Sets a new value for property <code>maximumFileSize</code>.Specifies a file size limit in megabytes
    * that prevents the upload if at least one file exceeds the limit.This property is not supported by
    * Internet Explorer 8 and 9.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.
    * @param fMaximumFileSize New value for property <code>maximumFileSize</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaximumFileSize(fMaximumFileSize: Double): UploadCollection = js.native
  
  /**
    * Sets a new value for property <code>maximumFilenameLength</code>.Specifies the maximum length of a
    * file name.If the maximum file name length is exceeded, the corresponding event
    * 'filenameLengthExceed' is triggered.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param iMaximumFilenameLength New value for property <code>maximumFilenameLength</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaximumFilenameLength(iMaximumFilenameLength: Double): UploadCollection = js.native
  
  /**
    * Sets a new value for property <code>mimeType</code>.Defines the allowed MIME types of files to be
    * uploaded.The chosen files will be checked against an array of MIME types.If at least one file does
    * not fit the MIME type requirements, the upload is prevented.This property is not supported by
    * Internet Explorer 8 and 9. Example: mimeType ["image/png", "image/jpeg"].When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sMimeType New value for property <code>mimeType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMimeType(sMimeType: js.Array[String]): UploadCollection = js.native
  
  /**
    * Sets a new value for property <code>mode</code>.Defines the selection mode of the control (e.g.
    * None, SingleSelect, MultiSelect, SingleSelectLeft, SingleSelectMaster).Since the UploadCollection
    * reacts like a list for attachments, the API is close to the ListBase Interface.sap.m.ListMode.Delete
    * mode is not supported and will be automatically set to sap.m.ListMode.None.In addition, if instant
    * upload is set to false the mode sap.m.ListMode.MultiSelect is not supported and will be
    * automatically set to sap.m.ListMode.None.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>None</code>.
    * @since 1.34
    * @param sMode New value for property <code>mode</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMode(sMode: ListMode): UploadCollection = js.native
  
  /**
    * Sets a new value for property <code>multiple</code>.Lets the user select multiple files from the
    * same folder and then upload them.Internet Explorer 8 and 9 do not support this property.Please note
    * that the various operating systems for mobile devices can react differently to the property so that
    * fewer upload functions may be available in some cases.When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @param bMultiple New value for property <code>multiple</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMultiple(bMultiple: Boolean): UploadCollection = js.native
  
  /**
    * Sets a new value for property <code>noDataText</code>.Allows you to set your own text for the 'No
    * data' label.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @param sNoDataText New value for property <code>noDataText</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNoDataText(sNoDataText: String): UploadCollection = js.native
  
  /**
    * Sets a new value for property <code>numberOfAttachmentsText</code>.Sets the title text in the
    * toolbar of the list of attachments.To show as well the number of attachments in brackets like the
    * default text does. The number of attachments could be retrieved via "getItems().length".If a new
    * title is set, the default is deactivated.The default value is set to language-dependent "Attachments
    * (n)".When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @since 1.30
    * @param sNumberOfAttachmentsText New value for property <code>numberOfAttachmentsText</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNumberOfAttachmentsText(sNumberOfAttachmentsText: String): UploadCollection = js.native
  
  /**
    * Sets a new value for property <code>sameFilenameAllowed</code>.Allows the user to use the same name
    * for a file when editing the file name. 'Same name' refers to an already existing file name in the
    * list.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>false</code>.
    * @param bSameFilenameAllowed New value for property <code>sameFilenameAllowed</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSameFilenameAllowed(bSameFilenameAllowed: Boolean): UploadCollection = js.native
  
  /**
    * Selects or deselects the given list item.
    * @since 1.34
    * @param uploadCollectionItem The item whose selection to be changed. This parameter is mandatory.
    * @param select Sets selected status of the item. Default value is true.
    * @returns The current UploadCollection
    */
  def setSelectedItem(uploadCollectionItem: UploadCollectionItem, select: Boolean): UploadCollection = js.native
  
  /**
    * Sets a UploadCollectionItem to be selected by id. In single mode, the method removes the previous
    * selection.
    * @since 1.34
    * @param id The id of the item whose selection to be changed.
    * @param select Sets selected status of the item. Default value is true.
    * @returns The current UploadCollection
    */
  def setSelectedItemById(id: String, select: Boolean): UploadCollection = js.native
  
  /**
    * Sets a new value for property <code>showSeparators</code>.Defines whether separators are shown
    * between list items.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>All</code>.
    * @param sShowSeparators New value for property <code>showSeparators</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowSeparators(sShowSeparators: ListSeparators): UploadCollection = js.native
  
  /**
    * Sets the aggregated <code>toolbar</code>.
    * @since 1.34
    * @param oToolbar The toolbar to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setToolbar(oToolbar: OverflowToolbar): UploadCollection = js.native
  
  /**
    * Sets a new value for property <code>uploadEnabled</code>.Enables the upload of a file.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>true</code>.
    * @param bUploadEnabled New value for property <code>uploadEnabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setUploadEnabled(bUploadEnabled: Boolean): UploadCollection = js.native
  
  /**
    * Sets a new value for property <code>uploadUrl</code>.Specifies the URL where the uploaded files have
    * to be stored.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>../../../upload</code>.
    * @param sUploadUrl New value for property <code>uploadUrl</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setUploadUrl(sUploadUrl: String): UploadCollection = js.native
  
  /**
    * Unbinds aggregation <code>items</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindItems(): UploadCollection = js.native
  
  /**
    * Starts the upload for all selected files.
    * @since 1.30
    */
  def upload(): Unit = js.native
}
