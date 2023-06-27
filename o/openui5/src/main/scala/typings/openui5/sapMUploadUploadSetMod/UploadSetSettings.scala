package typings.openui5.sapMUploadUploadSetMod

import typings.openui5.float
import typings.openui5.int
import typings.openui5.sapMLibraryMod.ListMode
import typings.openui5.sapMUploadUploaderHttpRequestMethodMod.UploaderHttpRequestMethod
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadSetSettings
  extends StObject
     with ControlSettings {
  
  /**
    * This event is fired when a new file is added to the set of items to be uploaded.
    */
  var afterItemAdded: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$AfterItemAddedEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @since 1.83
    *
    * This event is fired after item edit is confirmed.
    */
  var afterItemEdited: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$AfterItemEditedEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @since 1.83
    *
    * This event is fired after the item is removed on click of ok button in confirmation dialog.
    */
  var afterItemRemoved: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$AfterItemRemovedEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * This event is fired just before a new file is added to the set of items to be uploaded.
    */
  var beforeItemAdded: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$BeforeItemAddedEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * This event is fired when the edit button is clicked for an item and no other item is being edited at
    * the same time.
    * If there is another item that has unsaved changes, the editing of the clicked item cannot be started.
    */
  var beforeItemEdited: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$BeforeItemEditedEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * This event is fired just before the confirmation dialog for 'Remove' action is displayed.
    */
  var beforeItemRemoved: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$BeforeItemRemovedEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * This event is fired right before the upload process begins.
    */
  var beforeUploadStarts: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$BeforeUploadStartsEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * This event is fired right before the upload is terminated.
    */
  var beforeUploadTermination: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$BeforeUploadTerminationEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @experimental (since 1.106)
    *
    * The text of the CloudFile picker button. The default text is "Upload from cloud" (translated to the respective
    * language).
    */
  var cloudFilePickerButtonText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  
  /**
    * @experimental (since 1.106)
    *
    * Enables CloudFile picker feature to upload files from cloud.
    */
  var cloudFilePickerEnabled: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * @experimental (since 1.106)
    *
    * Url of the FileShare OData V4 service supplied for CloudFile picker control.
    */
  var cloudFilePickerServiceUrl: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  
  /**
    * @since 1.107
    *
    * Lets the user upload entire files from directories and sub directories.
    */
  var directory: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * Defines custom text for the drag and drop description label.
    */
  var dragDropDescription: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  
  /**
    * Defines custom text for the drag and drop text label.
    */
  var dragDropText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  
  /**
    * This event is fired in either of the following cases:
    * 	 - When a file that is selected to be uploaded fails to meet the file name length restriction specified
    *     in the `maxFileNameLength` property.
    * 	 - When the file name length restriction changes, and the file to be uploaded fails to meet the new
    *     restriction.
    * 	 - Listeners can use the item parameter to remove the incomplete item that failed to meet the restriction
    */
  var fileNameLengthExceeded: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$FileNameLengthExceededEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @since 1.100.0
    *
    * The event is triggered when the file name is changed.
    */
  var fileRenamed: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$FileRenamedEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * This event is fired in either of the following cases:
    * 	 - When a file that is selected to be uploaded fails to meet the file size restriction specified in
    *     the `maxFileSize` property.
    * 	 - When the file size restriction changes, and the file to be uploaded fails to meet the new restriction.
    *
    * 	 - Listeners can use the item parameter to remove the incomplete item that failed to meet the restriction
    */
  var fileSizeExceeded: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$FileSizeExceededEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * This event is fired in either of the following cases:
    * 	 - When a file that is selected to be uploaded fails to meet the file type restriction (`fileType` property).
    *
    * 	 - When the file type restriction changes, and the file to be uploaded fails to meet the new restriction.
    */
  var fileTypeMismatch: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$FileTypeMismatchEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Allowed file types for files to be uploaded.
    * If this property is not set, any file can be uploaded.
    */
  var fileTypes: js.UndefOr[
    js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * Header fields to be included in the header section of an XHR request.
    */
  var headerFields: js.UndefOr[
    js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * @since 1.90
    *
    * HTTP request method chosen for file upload.
    */
  var httpRequestMethod: js.UndefOr[
    UploaderHttpRequestMethod | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * Items representing files yet to be uploaded.
    */
  var incompleteItems: js.UndefOr[
    js.Array[typings.openui5.sapMUploadUploadSetItemMod.default] | typings.openui5.sapMUploadUploadSetItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * Defines whether the upload process should be triggered as soon as the file is added.
    *  If set to `false`, no upload is triggered when a file is added.
    */
  var instantUpload: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * @since 1.99
    *
    * This event is fired when the user starts dragging an uploaded item.
    */
  var itemDragStart: js.UndefOr[
    js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
  ] = js.undefined
  
  /**
    * @since 1.99
    *
    * This event is fired when an uploaded item is dropped on the new list position.
    */
  var itemDrop: js.UndefOr[
    js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
  ] = js.undefined
  
  /**
    * Items representing files that have already been uploaded.
    */
  var items: js.UndefOr[
    js.Array[typings.openui5.sapMUploadUploadSetItemMod.default] | typings.openui5.sapMUploadUploadSetItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * Maximum length of names of files to be uploaded.
    * If set to `null` or `0`, any files can be uploaded, regardless of their names length.
    */
  var maxFileNameLength: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  
  /**
    * Size limit in megabytes for files to be uploaded.
    * If set to `null` or `0`, files of any size can be uploaded.
    */
  var maxFileSize: js.UndefOr[
    float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * This event is fired in either of the following cases:
    * 	 - When a file that is selected to be uploaded fails to meet the media type restriction specified in
    *     the `mediaTypes` property.
    * 	 - When the media type restriction changes, and the file to be uploaded fails to meet the new restriction.
    */
  var mediaTypeMismatch: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$MediaTypeMismatchEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Allowed media types for files to be uploaded.
    * If this property is not set, any file can be uploaded.
    */
  var mediaTypes: js.UndefOr[
    js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * @since 1.100.0
    *
    * Defines the selection mode of the control (e.g. None, SingleSelect, MultiSelect, SingleSelectLeft, SingleSelectMaster).
    * Since the UploadSet reacts like a list for attachments, the API is close to the ListBase Interface. sap.m.ListMode.Delete
    * mode is not supported and will be automatically set to sap.m.ListMode.None. In addition, if instant upload
    * is set to false the mode sap.m.ListMode.MultiSelect is not supported and will be automatically set to
    * sap.m.ListMode.None.
    */
  var mode: js.UndefOr[
    ListMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String) | PropertyBindingInfo
  ] = js.undefined
  
  /**
    * Lets the user select multiple files from the same folder and then upload them.
    *
    * If multiple property is set to false, the control shows an error message if more than one file is chosen
    * for drag & drop.
    */
  var multiple: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * Defines custom text for the 'No data' description label.
    */
  var noDataDescription: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  
  /**
    * Defines custom text for the 'No data' text label.
    */
  var noDataText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  
  /**
    * @since 1.100.0
    *
    * Allows the user to use the same name for a file while editing the file name. 'Same name' refers to an
    * already existing file name in the list.
    */
  var sameFilenameAllowed: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * This event is fired simultaneously with the respective event in the inner {@link sap.m.List} control.
    */
  var selectionChanged: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$SelectionChangedEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Defines whether file icons should be displayed.
    */
  var showIcons: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * Defines whether it is allowed to terminate the upload process.
    */
  var terminationEnabled: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * Main toolbar of the `UploadSet` control.
    */
  var toolbar: js.UndefOr[typings.openui5.sapMOverflowToolbarMod.default] = js.undefined
  
  /**
    * @since 1.99.0
    *
    * If set to true, the button used for uploading files become invisible.
    */
  var uploadButtonInvisible: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * This event is fired right after the upload process is finished.
    */
  var uploadCompleted: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$UploadCompletedEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Defines whether the upload action is allowed.
    */
  var uploadEnabled: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * This event is fired right after the upload is terminated.
    */
  var uploadTerminated: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$UploadTerminatedEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * URL where the uploaded files will be stored.
    */
  var uploadUrl: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  
  /**
    * Defines the uploader to be used. If not specified, the default implementation is used.
    */
  var uploader: js.UndefOr[typings.openui5.sapMUploadUploaderMod.default] = js.undefined
}
object UploadSetSettings {
  
  inline def apply(): UploadSetSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSetSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadSetSettings] (val x: Self) extends AnyVal {
    
    inline def setAfterItemAdded(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$AfterItemAddedEventParameters] => Unit
    ): Self = StObject.set(x, "afterItemAdded", js.Any.fromFunction1(value))
    
    inline def setAfterItemAddedUndefined: Self = StObject.set(x, "afterItemAdded", js.undefined)
    
    inline def setAfterItemEdited(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$AfterItemEditedEventParameters] => Unit
    ): Self = StObject.set(x, "afterItemEdited", js.Any.fromFunction1(value))
    
    inline def setAfterItemEditedUndefined: Self = StObject.set(x, "afterItemEdited", js.undefined)
    
    inline def setAfterItemRemoved(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$AfterItemRemovedEventParameters] => Unit
    ): Self = StObject.set(x, "afterItemRemoved", js.Any.fromFunction1(value))
    
    inline def setAfterItemRemovedUndefined: Self = StObject.set(x, "afterItemRemoved", js.undefined)
    
    inline def setBeforeItemAdded(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$BeforeItemAddedEventParameters] => Unit
    ): Self = StObject.set(x, "beforeItemAdded", js.Any.fromFunction1(value))
    
    inline def setBeforeItemAddedUndefined: Self = StObject.set(x, "beforeItemAdded", js.undefined)
    
    inline def setBeforeItemEdited(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$BeforeItemEditedEventParameters] => Unit
    ): Self = StObject.set(x, "beforeItemEdited", js.Any.fromFunction1(value))
    
    inline def setBeforeItemEditedUndefined: Self = StObject.set(x, "beforeItemEdited", js.undefined)
    
    inline def setBeforeItemRemoved(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$BeforeItemRemovedEventParameters] => Unit
    ): Self = StObject.set(x, "beforeItemRemoved", js.Any.fromFunction1(value))
    
    inline def setBeforeItemRemovedUndefined: Self = StObject.set(x, "beforeItemRemoved", js.undefined)
    
    inline def setBeforeUploadStarts(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$BeforeUploadStartsEventParameters] => Unit
    ): Self = StObject.set(x, "beforeUploadStarts", js.Any.fromFunction1(value))
    
    inline def setBeforeUploadStartsUndefined: Self = StObject.set(x, "beforeUploadStarts", js.undefined)
    
    inline def setBeforeUploadTermination(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$BeforeUploadTerminationEventParameters] => Unit
    ): Self = StObject.set(x, "beforeUploadTermination", js.Any.fromFunction1(value))
    
    inline def setBeforeUploadTerminationUndefined: Self = StObject.set(x, "beforeUploadTermination", js.undefined)
    
    inline def setCloudFilePickerButtonText(value: String | PropertyBindingInfo): Self = StObject.set(x, "cloudFilePickerButtonText", value.asInstanceOf[js.Any])
    
    inline def setCloudFilePickerButtonTextUndefined: Self = StObject.set(x, "cloudFilePickerButtonText", js.undefined)
    
    inline def setCloudFilePickerEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "cloudFilePickerEnabled", value.asInstanceOf[js.Any])
    
    inline def setCloudFilePickerEnabledUndefined: Self = StObject.set(x, "cloudFilePickerEnabled", js.undefined)
    
    inline def setCloudFilePickerServiceUrl(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "cloudFilePickerServiceUrl", value.asInstanceOf[js.Any])
    
    inline def setCloudFilePickerServiceUrlUndefined: Self = StObject.set(x, "cloudFilePickerServiceUrl", js.undefined)
    
    inline def setDirectory(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
    
    inline def setDragDropDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "dragDropDescription", value.asInstanceOf[js.Any])
    
    inline def setDragDropDescriptionUndefined: Self = StObject.set(x, "dragDropDescription", js.undefined)
    
    inline def setDragDropText(value: String | PropertyBindingInfo): Self = StObject.set(x, "dragDropText", value.asInstanceOf[js.Any])
    
    inline def setDragDropTextUndefined: Self = StObject.set(x, "dragDropText", js.undefined)
    
    inline def setFileNameLengthExceeded(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$FileNameLengthExceededEventParameters] => Unit
    ): Self = StObject.set(x, "fileNameLengthExceeded", js.Any.fromFunction1(value))
    
    inline def setFileNameLengthExceededUndefined: Self = StObject.set(x, "fileNameLengthExceeded", js.undefined)
    
    inline def setFileRenamed(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$FileRenamedEventParameters] => Unit
    ): Self = StObject.set(x, "fileRenamed", js.Any.fromFunction1(value))
    
    inline def setFileRenamedUndefined: Self = StObject.set(x, "fileRenamed", js.undefined)
    
    inline def setFileSizeExceeded(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$FileSizeExceededEventParameters] => Unit
    ): Self = StObject.set(x, "fileSizeExceeded", js.Any.fromFunction1(value))
    
    inline def setFileSizeExceededUndefined: Self = StObject.set(x, "fileSizeExceeded", js.undefined)
    
    inline def setFileTypeMismatch(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$FileTypeMismatchEventParameters] => Unit
    ): Self = StObject.set(x, "fileTypeMismatch", js.Any.fromFunction1(value))
    
    inline def setFileTypeMismatchUndefined: Self = StObject.set(x, "fileTypeMismatch", js.undefined)
    
    inline def setFileTypes(
      value: js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
    ): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
    
    inline def setFileTypesUndefined: Self = StObject.set(x, "fileTypes", js.undefined)
    
    inline def setFileTypesVarargs(value: String*): Self = StObject.set(x, "fileTypes", js.Array(value*))
    
    inline def setHeaderFields(
      value: js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
    ): Self = StObject.set(x, "headerFields", value.asInstanceOf[js.Any])
    
    inline def setHeaderFieldsUndefined: Self = StObject.set(x, "headerFields", js.undefined)
    
    inline def setHeaderFieldsVarargs(value: typings.openui5.sapUiCoreItemMod.default*): Self = StObject.set(x, "headerFields", js.Array(value*))
    
    inline def setHttpRequestMethod(
      value: UploaderHttpRequestMethod | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
    ): Self = StObject.set(x, "httpRequestMethod", value.asInstanceOf[js.Any])
    
    inline def setHttpRequestMethodUndefined: Self = StObject.set(x, "httpRequestMethod", js.undefined)
    
    inline def setIncompleteItems(
      value: js.Array[typings.openui5.sapMUploadUploadSetItemMod.default] | typings.openui5.sapMUploadUploadSetItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
    ): Self = StObject.set(x, "incompleteItems", value.asInstanceOf[js.Any])
    
    inline def setIncompleteItemsUndefined: Self = StObject.set(x, "incompleteItems", js.undefined)
    
    inline def setIncompleteItemsVarargs(value: typings.openui5.sapMUploadUploadSetItemMod.default*): Self = StObject.set(x, "incompleteItems", js.Array(value*))
    
    inline def setInstantUpload(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "instantUpload", value.asInstanceOf[js.Any])
    
    inline def setInstantUploadUndefined: Self = StObject.set(x, "instantUpload", js.undefined)
    
    inline def setItemDragStart(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "itemDragStart", js.Any.fromFunction1(value))
    
    inline def setItemDragStartUndefined: Self = StObject.set(x, "itemDragStart", js.undefined)
    
    inline def setItemDrop(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "itemDrop", js.Any.fromFunction1(value))
    
    inline def setItemDropUndefined: Self = StObject.set(x, "itemDrop", js.undefined)
    
    inline def setItems(
      value: js.Array[typings.openui5.sapMUploadUploadSetItemMod.default] | typings.openui5.sapMUploadUploadSetItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: typings.openui5.sapMUploadUploadSetItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMaxFileNameLength(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxFileNameLength", value.asInstanceOf[js.Any])
    
    inline def setMaxFileNameLengthUndefined: Self = StObject.set(x, "maxFileNameLength", js.undefined)
    
    inline def setMaxFileSize(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
    
    inline def setMediaTypeMismatch(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$MediaTypeMismatchEventParameters] => Unit
    ): Self = StObject.set(x, "mediaTypeMismatch", js.Any.fromFunction1(value))
    
    inline def setMediaTypeMismatchUndefined: Self = StObject.set(x, "mediaTypeMismatch", js.undefined)
    
    inline def setMediaTypes(
      value: js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
    ): Self = StObject.set(x, "mediaTypes", value.asInstanceOf[js.Any])
    
    inline def setMediaTypesUndefined: Self = StObject.set(x, "mediaTypes", js.undefined)
    
    inline def setMediaTypesVarargs(value: String*): Self = StObject.set(x, "mediaTypes", js.Array(value*))
    
    inline def setMode(
      value: ListMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String) | PropertyBindingInfo
    ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMultiple(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setNoDataDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "noDataDescription", value.asInstanceOf[js.Any])
    
    inline def setNoDataDescriptionUndefined: Self = StObject.set(x, "noDataDescription", js.undefined)
    
    inline def setNoDataText(value: String | PropertyBindingInfo): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
    
    inline def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
    
    inline def setSameFilenameAllowed(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sameFilenameAllowed", value.asInstanceOf[js.Any])
    
    inline def setSameFilenameAllowedUndefined: Self = StObject.set(x, "sameFilenameAllowed", js.undefined)
    
    inline def setSelectionChanged(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$SelectionChangedEventParameters] => Unit
    ): Self = StObject.set(x, "selectionChanged", js.Any.fromFunction1(value))
    
    inline def setSelectionChangedUndefined: Self = StObject.set(x, "selectionChanged", js.undefined)
    
    inline def setShowIcons(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showIcons", value.asInstanceOf[js.Any])
    
    inline def setShowIconsUndefined: Self = StObject.set(x, "showIcons", js.undefined)
    
    inline def setTerminationEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "terminationEnabled", value.asInstanceOf[js.Any])
    
    inline def setTerminationEnabledUndefined: Self = StObject.set(x, "terminationEnabled", js.undefined)
    
    inline def setToolbar(value: typings.openui5.sapMOverflowToolbarMod.default): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setUploadButtonInvisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "uploadButtonInvisible", value.asInstanceOf[js.Any])
    
    inline def setUploadButtonInvisibleUndefined: Self = StObject.set(x, "uploadButtonInvisible", js.undefined)
    
    inline def setUploadCompleted(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$UploadCompletedEventParameters] => Unit
    ): Self = StObject.set(x, "uploadCompleted", js.Any.fromFunction1(value))
    
    inline def setUploadCompletedUndefined: Self = StObject.set(x, "uploadCompleted", js.undefined)
    
    inline def setUploadEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "uploadEnabled", value.asInstanceOf[js.Any])
    
    inline def setUploadEnabledUndefined: Self = StObject.set(x, "uploadEnabled", js.undefined)
    
    inline def setUploadTerminated(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadSet$UploadTerminatedEventParameters] => Unit
    ): Self = StObject.set(x, "uploadTerminated", js.Any.fromFunction1(value))
    
    inline def setUploadTerminatedUndefined: Self = StObject.set(x, "uploadTerminated", js.undefined)
    
    inline def setUploadUrl(value: String | PropertyBindingInfo): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    inline def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
    
    inline def setUploader(value: typings.openui5.sapMUploadUploaderMod.default): Self = StObject.set(x, "uploader", value.asInstanceOf[js.Any])
    
    inline def setUploaderUndefined: Self = StObject.set(x, "uploader", js.undefined)
  }
}
