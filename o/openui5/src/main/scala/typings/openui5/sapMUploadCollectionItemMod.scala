package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMUploadCollectionItemMod {
  
  @JSImport("sap/m/UploadCollectionItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new UploadCollectionItem
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends UploadCollectionItem {
    def this(/**
      * initial settings for the new control
      */
    mSettings: UploadCollectionItemSettings) = this()
    def this(/**
      * ID for the new control, will be generated automatically if no ID is provided.
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, will be generated automatically if no ID is provided.
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: UploadCollectionItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, will be generated automatically if no ID is provided.
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: UploadCollectionItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/UploadCollectionItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.UploadCollectionItem with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, UploadCollectionItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, UploadCollectionItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.UploadCollectionItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait UploadCollectionItem
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * @since 1.30.0
      *
      * Adds some attribute to the aggregation {@link #getAttributes attributes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAttribute(
      /**
      * The attribute to add; if empty, nothing is inserted
      */
    oAttribute: typings.openui5.sapMObjectAttributeMod.default
    ): this.type = js.native
    
    /**
      * @since 1.40.0
      *
      * Adds some marker to the aggregation {@link #getMarkers markers}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addMarker(
      /**
      * The marker to add; if empty, nothing is inserted
      */
    oMarker: typings.openui5.sapMObjectMarkerMod.default
    ): this.type = js.native
    
    /**
      * @since 1.30.0
      *
      * Adds some status to the aggregation {@link #getStatuses statuses}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addStatus(
      /**
      * The status to add; if empty, nothing is inserted
      */
    oStatus: typings.openui5.sapMObjectStatusMod.default
    ): this.type = js.native
    
    /**
      * @since 1.50.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:deletePress deletePress} event of this `sap.m.UploadCollectionItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollectionItem` itself.
      *
      * When a deletePress event handler is attached to the item and the user presses the delete button, this
      * event is triggered. If this event is triggered, it overwrites the default delete behavior of UploadCollection
      * and the fileDeleted event of UploadCollection is not triggered.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDeletePress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachDeletePress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollectionItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.50.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:deletePress deletePress} event of this `sap.m.UploadCollectionItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollectionItem` itself.
      *
      * When a deletePress event handler is attached to the item and the user presses the delete button, this
      * event is triggered. If this event is triggered, it overwrites the default delete behavior of UploadCollection
      * and the fileDeleted event of UploadCollection is not triggered.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDeletePress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachDeletePress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollectionItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.50.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.UploadCollectionItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollectionItem` itself.
      *
      * This event is triggered when the user presses the filename link. If this event is provided, it overwrites
      * the default behavior of opening the file.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollectionItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.50.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.UploadCollectionItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollectionItem` itself.
      *
      * This event is triggered when the user presses the filename link. If this event is provided, it overwrites
      * the default behavior of opening the file.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollectionItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.30.0
      *
      * Binds aggregation {@link #getAttributes attributes} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindAttributes(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * @since 1.40.0
      *
      * Binds aggregation {@link #getMarkers markers} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindMarkers(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * @since 1.30.0
      *
      * Binds aggregation {@link #getStatuses statuses} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindStatuses(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * @since 1.30.0
      *
      * Destroys all the attributes in the aggregation {@link #getAttributes attributes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAttributes(): this.type = js.native
    
    /**
      * @since 1.40.0
      *
      * Destroys all the markers in the aggregation {@link #getMarkers markers}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMarkers(): this.type = js.native
    
    /**
      * @since 1.30.0
      *
      * Destroys all the statuses in the aggregation {@link #getStatuses statuses}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyStatuses(): this.type = js.native
    
    /**
      * @since 1.50.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:deletePress deletePress} event of this `sap.m.UploadCollectionItem`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDeletePress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachDeletePress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.50.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.m.UploadCollectionItem`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.36.0
      *
      * Downloads the item. The sap.ui.core.util.File method is used here. For further details on this method,
      * see {sap.ui.core.util.File.save}.
      *
      * @returns `true` if download is possible, otherwise `false`
      */
    def download(/**
      * Decides whether to ask for a location to download or not.
      */
    askForLocation: Boolean): Boolean = js.native
    
    /**
      * @since 1.50.0
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:deletePress deletePress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireDeletePress(): this.type = js.native
    def fireDeletePress(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @since 1.50.0
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:press press} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePress(): this.type = js.native
    def firePress(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @since 1.30.0
      *
      * Gets current value of property {@link #getAriaLabelForPicture ariaLabelForPicture}.
      *
      * Aria label for the icon (or for the image).
      *
      * @returns Value of property `ariaLabelForPicture`
      */
    def getAriaLabelForPicture(): String = js.native
    
    /**
      * @since 1.30.0
      *
      * Gets content of aggregation {@link #getAttributes attributes}.
      *
      * Attributes of an uploaded item, for example, 'Uploaded By', 'Uploaded On', 'File Size' attributes are
      * displayed after an item has been uploaded. Additionally, the Active property of sap.m.ObjectAttribute
      * is supported.
      *  Note that if one of the deprecated properties contributor, fileSize or UploadedDate is filled in addition
      * to this attribute, two attributes with the same title are displayed as these properties get displayed
      * as an attribute. Example: An application passes the property ‘contributor’ with the value ‘A’ and the
      * aggregation attributes ‘contributor’: ‘B’. As a result, the attributes ‘contributor’:’A’ and ‘contributor’:’B’
      * are displayed. To make sure the title does not appear twice, check if one of the properties is filled.
      */
    def getAttributes(): js.Array[typings.openui5.sapMObjectAttributeMod.default] = js.native
    
    /**
      * @deprecated (since 1.30) - This property is deprecated; use the aggregation attributes instead. However,
      * if the property is filled, it is displayed as an attribute. To make sure the title does not appear twice,
      * do not use the property.
      *
      * Gets current value of property {@link #getContributor contributor}.
      *
      * Specifies the name of the user who uploaded the file.
      *
      * @returns Value of property `contributor`
      */
    def getContributor(): String = js.native
    
    /**
      * Gets current value of property {@link #getDocumentId documentId}.
      *
      * Specifies a unique identifier of the file (created by the application).
      *
      * @returns Value of property `documentId`
      */
    def getDocumentId(): String = js.native
    
    /**
      * Gets current value of property {@link #getEnableDelete enableDelete}.
      *
      * Enables/Disables the Delete button. If the value is true, the Delete button is enabled and the delete
      * function can be used. If the value is false, the delete function is not available.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enableDelete`
      */
    def getEnableDelete(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnableEdit enableEdit}.
      *
      * Enables/Disables the Edit button. If the value is true, the Edit button is enabled and the edit function
      * can be used. If the value is false, the edit function is not available.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enableEdit`
      */
    def getEnableEdit(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFileName fileName}.
      *
      * Specifies the name of the uploaded file.
      *
      * @returns Value of property `fileName`
      */
    def getFileName(): String = js.native
    
    /**
      * @deprecated (since 1.30) - This property is deprecated; use the aggregation attributes instead.
      *
      * Gets current value of property {@link #getFileSize fileSize}.
      *
      * Specifies the size of the uploaded file (in megabytes).
      *
      * @returns Value of property `fileSize`
      */
    def getFileSize(): float = js.native
    
    /**
      * @since 1.30.0
      *
      * ID of the element which is the current target of the association {@link #getFileUploader fileUploader},
      * or `null`.
      */
    def getFileUploader(): ID = js.native
    
    /**
      * @since 1.40.0
      *
      * Gets content of aggregation {@link #getMarkers markers}.
      *
      * Markers of an uploaded item Markers will be displayed after an item has been uploaded But not in Edit
      * mode
      */
    def getMarkers(): js.Array[typings.openui5.sapMObjectMarkerMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getMimeType mimeType}.
      *
      * Specifies the MIME type of the file.
      *
      * @returns Value of property `mimeType`
      */
    def getMimeType(): String = js.native
    
    /**
      * @since 1.34.0
      *
      * Gets current value of property {@link #getSelected selected}.
      *
      * Defines the selected state of the UploadCollectionItem.
      *
      * Default value is `false`.
      *
      * @returns Value of property `selected`
      */
    def getSelected(): Boolean = js.native
    
    /**
      * @since 1.30.0
      *
      * Gets content of aggregation {@link #getStatuses statuses}.
      *
      * Statuses of an uploaded item Statuses will be displayed after an item has been uploaded
      */
    def getStatuses(): js.Array[typings.openui5.sapMObjectStatusMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getThumbnailUrl thumbnailUrl}.
      *
      * Specifies the URL where the thumbnail of the file is located. This can also be an SAPUI5 icon URL.
      *
      * @returns Value of property `thumbnailUrl`
      */
    def getThumbnailUrl(): String = js.native
    
    /**
      * @deprecated (since 1.30) - This property is deprecated; use the aggregation attributes instead.
      *
      * Gets current value of property {@link #getUploadedDate uploadedDate}.
      *
      * Specifies the date on which the file was uploaded. The application has to define the date format.
      *
      * @returns Value of property `uploadedDate`
      */
    def getUploadedDate(): String = js.native
    
    /**
      * Gets current value of property {@link #getUrl url}.
      *
      * Specifies the URL where the file is located. If the application doesn't provide a value for this property,
      * the icon and the file name of the UploadCollectionItem are not clickable.
      *
      * @returns Value of property `url`
      */
    def getUrl(): String = js.native
    
    /**
      * Gets current value of property {@link #getVisibleDelete visibleDelete}.
      *
      * Show/Hide the Delete button. If the value is true, the Delete button is visible. If the value is false,
      * the Delete button is not visible.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visibleDelete`
      */
    def getVisibleDelete(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getVisibleEdit visibleEdit}.
      *
      * Show/Hide the Edit button. If the value is true, the Edit button is visible. If the value is false, the
      * Edit button is not visible.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visibleEdit`
      */
    def getVisibleEdit(): Boolean = js.native
    
    /**
      * @since 1.30.0
      *
      * Checks for the provided `sap.m.ObjectAttribute` in the aggregation {@link #getAttributes attributes}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAttribute(
      /**
      * The attribute whose index is looked for
      */
    oAttribute: typings.openui5.sapMObjectAttributeMod.default
    ): int = js.native
    
    /**
      * @since 1.40.0
      *
      * Checks for the provided `sap.m.ObjectMarker` in the aggregation {@link #getMarkers markers}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfMarker(
      /**
      * The marker whose index is looked for
      */
    oMarker: typings.openui5.sapMObjectMarkerMod.default
    ): int = js.native
    
    /**
      * @since 1.30.0
      *
      * Checks for the provided `sap.m.ObjectStatus` in the aggregation {@link #getStatuses statuses}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfStatus(
      /**
      * The status whose index is looked for
      */
    oStatus: typings.openui5.sapMObjectStatusMod.default
    ): int = js.native
    
    /**
      * @since 1.30.0
      *
      * Inserts a attribute into the aggregation {@link #getAttributes attributes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAttribute(
      /**
      * The attribute to insert; if empty, nothing is inserted
      */
    oAttribute: typings.openui5.sapMObjectAttributeMod.default,
      /**
      * The `0`-based index the attribute should be inserted at; for a negative value of `iIndex`, the attribute
      * is inserted at position 0; for a value greater than the current size of the aggregation, the attribute
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @since 1.40.0
      *
      * Inserts a marker into the aggregation {@link #getMarkers markers}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertMarker(
      /**
      * The marker to insert; if empty, nothing is inserted
      */
    oMarker: typings.openui5.sapMObjectMarkerMod.default,
      /**
      * The `0`-based index the marker should be inserted at; for a negative value of `iIndex`, the marker is
      * inserted at position 0; for a value greater than the current size of the aggregation, the marker is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @since 1.30.0
      *
      * Inserts a status into the aggregation {@link #getStatuses statuses}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertStatus(
      /**
      * The status to insert; if empty, nothing is inserted
      */
    oStatus: typings.openui5.sapMObjectStatusMod.default,
      /**
      * The `0`-based index the status should be inserted at; for a negative value of `iIndex`, the status is
      * inserted at position 0; for a value greater than the current size of the aggregation, the status is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @since 1.30.0
      *
      * Removes all the controls from the aggregation {@link #getAttributes attributes}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAttributes(): js.Array[typings.openui5.sapMObjectAttributeMod.default] = js.native
    
    /**
      * @since 1.40.0
      *
      * Removes all the controls from the aggregation {@link #getMarkers markers}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllMarkers(): js.Array[typings.openui5.sapMObjectMarkerMod.default] = js.native
    
    /**
      * @since 1.30.0
      *
      * Removes all the controls from the aggregation {@link #getStatuses statuses}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllStatuses(): js.Array[typings.openui5.sapMObjectStatusMod.default] = js.native
    
    def removeAttribute(/**
      * The attribute to remove or its index or id
      */
    vAttribute: String): typings.openui5.sapMObjectAttributeMod.default | Null = js.native
    /**
      * @since 1.30.0
      *
      * Removes a attribute from the aggregation {@link #getAttributes attributes}.
      *
      * @returns The removed attribute or `null`
      */
    def removeAttribute(/**
      * The attribute to remove or its index or id
      */
    vAttribute: int): typings.openui5.sapMObjectAttributeMod.default | Null = js.native
    def removeAttribute(
      /**
      * The attribute to remove or its index or id
      */
    vAttribute: typings.openui5.sapMObjectAttributeMod.default
    ): typings.openui5.sapMObjectAttributeMod.default | Null = js.native
    
    def removeMarker(/**
      * The marker to remove or its index or id
      */
    vMarker: String): typings.openui5.sapMObjectMarkerMod.default | Null = js.native
    /**
      * @since 1.40.0
      *
      * Removes a marker from the aggregation {@link #getMarkers markers}.
      *
      * @returns The removed marker or `null`
      */
    def removeMarker(/**
      * The marker to remove or its index or id
      */
    vMarker: int): typings.openui5.sapMObjectMarkerMod.default | Null = js.native
    def removeMarker(
      /**
      * The marker to remove or its index or id
      */
    vMarker: typings.openui5.sapMObjectMarkerMod.default
    ): typings.openui5.sapMObjectMarkerMod.default | Null = js.native
    
    def removeStatus(/**
      * The status to remove or its index or id
      */
    vStatus: String): typings.openui5.sapMObjectStatusMod.default | Null = js.native
    /**
      * @since 1.30.0
      *
      * Removes a status from the aggregation {@link #getStatuses statuses}.
      *
      * @returns The removed status or `null`
      */
    def removeStatus(/**
      * The status to remove or its index or id
      */
    vStatus: int): typings.openui5.sapMObjectStatusMod.default | Null = js.native
    def removeStatus(
      /**
      * The status to remove or its index or id
      */
    vStatus: typings.openui5.sapMObjectStatusMod.default
    ): typings.openui5.sapMObjectStatusMod.default | Null = js.native
    
    /**
      * @since 1.30.0
      *
      * Sets a new value for property {@link #getAriaLabelForPicture ariaLabelForPicture}.
      *
      * Aria label for the icon (or for the image).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAriaLabelForPicture(): this.type = js.native
    def setAriaLabelForPicture(/**
      * New value for property `ariaLabelForPicture`
      */
    sAriaLabelForPicture: String): this.type = js.native
    
    /**
      * @deprecated (since 1.30) - This property is deprecated; use the aggregation attributes instead. However,
      * if the property is filled, it is displayed as an attribute. To make sure the title does not appear twice,
      * do not use the property.
      *
      * Sets a new value for property {@link #getContributor contributor}.
      *
      * Specifies the name of the user who uploaded the file.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContributor(): this.type = js.native
    def setContributor(/**
      * New value for property `contributor`
      */
    sContributor: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDocumentId documentId}.
      *
      * Specifies a unique identifier of the file (created by the application).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDocumentId(): this.type = js.native
    def setDocumentId(/**
      * New value for property `documentId`
      */
    sDocumentId: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnableDelete enableDelete}.
      *
      * Enables/Disables the Delete button. If the value is true, the Delete button is enabled and the delete
      * function can be used. If the value is false, the delete function is not available.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableDelete(): this.type = js.native
    def setEnableDelete(/**
      * New value for property `enableDelete`
      */
    bEnableDelete: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnableEdit enableEdit}.
      *
      * Enables/Disables the Edit button. If the value is true, the Edit button is enabled and the edit function
      * can be used. If the value is false, the edit function is not available.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableEdit(): this.type = js.native
    def setEnableEdit(/**
      * New value for property `enableEdit`
      */
    bEnableEdit: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFileName fileName}.
      *
      * Specifies the name of the uploaded file.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFileName(): this.type = js.native
    def setFileName(/**
      * New value for property `fileName`
      */
    sFileName: String): this.type = js.native
    
    /**
      * @deprecated (since 1.30) - This property is deprecated; use the aggregation attributes instead.
      *
      * Sets a new value for property {@link #getFileSize fileSize}.
      *
      * Specifies the size of the uploaded file (in megabytes).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFileSize(): this.type = js.native
    def setFileSize(/**
      * New value for property `fileSize`
      */
    fFileSize: float): this.type = js.native
    
    /**
      * @since 1.30.0
      *
      * Sets the associated {@link #getFileUploader fileUploader}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFileUploader(
      /**
      * ID of an element which becomes the new target of this fileUploader association; alternatively, an element
      * instance may be given
      */
    oFileUploader: ID
    ): this.type = js.native
    def setFileUploader(
      /**
      * ID of an element which becomes the new target of this fileUploader association; alternatively, an element
      * instance may be given
      */
    oFileUploader: typings.openui5.sapUiUnifiedFileUploaderMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMimeType mimeType}.
      *
      * Specifies the MIME type of the file.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMimeType(): this.type = js.native
    def setMimeType(/**
      * New value for property `mimeType`
      */
    sMimeType: String): this.type = js.native
    
    /**
      * @since 1.34.0
      *
      * Sets a new value for property {@link #getSelected selected}.
      *
      * Defines the selected state of the UploadCollectionItem.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelected(): this.type = js.native
    def setSelected(/**
      * New value for property `selected`
      */
    bSelected: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getThumbnailUrl thumbnailUrl}.
      *
      * Specifies the URL where the thumbnail of the file is located. This can also be an SAPUI5 icon URL.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setThumbnailUrl(): this.type = js.native
    def setThumbnailUrl(/**
      * New value for property `thumbnailUrl`
      */
    sThumbnailUrl: String): this.type = js.native
    
    /**
      * @deprecated (since 1.30) - This property is deprecated; use the aggregation attributes instead.
      *
      * Sets a new value for property {@link #getUploadedDate uploadedDate}.
      *
      * Specifies the date on which the file was uploaded. The application has to define the date format.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUploadedDate(): this.type = js.native
    def setUploadedDate(/**
      * New value for property `uploadedDate`
      */
    sUploadedDate: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUrl url}.
      *
      * Specifies the URL where the file is located. If the application doesn't provide a value for this property,
      * the icon and the file name of the UploadCollectionItem are not clickable.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUrl(): this.type = js.native
    def setUrl(/**
      * New value for property `url`
      */
    sUrl: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisibleDelete visibleDelete}.
      *
      * Show/Hide the Delete button. If the value is true, the Delete button is visible. If the value is false,
      * the Delete button is not visible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleDelete(): this.type = js.native
    def setVisibleDelete(/**
      * New value for property `visibleDelete`
      */
    bVisibleDelete: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisibleEdit visibleEdit}.
      *
      * Show/Hide the Edit button. If the value is true, the Edit button is visible. If the value is false, the
      * Edit button is not visible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleEdit(): this.type = js.native
    def setVisibleEdit(/**
      * New value for property `visibleEdit`
      */
    bVisibleEdit: Boolean): this.type = js.native
    
    /**
      * @since 1.30.0
      *
      * Unbinds aggregation {@link #getAttributes attributes} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindAttributes(): this.type = js.native
    
    /**
      * @since 1.40.0
      *
      * Unbinds aggregation {@link #getMarkers markers} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindMarkers(): this.type = js.native
    
    /**
      * @since 1.30.0
      *
      * Unbinds aggregation {@link #getStatuses statuses} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindStatuses(): this.type = js.native
  }
  
  trait UploadCollectionItem$DeletePressEventParameters extends StObject
  
  trait UploadCollectionItem$PressEventParameters extends StObject
  
  type UploadCollectionItemDeletePressEvent = typings.openui5.sapUiBaseEventMod.default[UploadCollectionItem$DeletePressEventParameters]
  
  type UploadCollectionItemDeletePressEventParameters = UploadCollectionItem$DeletePressEventParameters
  
  type UploadCollectionItemPressEvent = typings.openui5.sapUiBaseEventMod.default[UploadCollectionItem$PressEventParameters]
  
  type UploadCollectionItemPressEventParameters = UploadCollectionItem$PressEventParameters
  
  trait UploadCollectionItemSettings
    extends StObject
       with ElementSettings {
    
    /**
      * @since 1.30.0
      *
      * Aria label for the icon (or for the image).
      */
    var ariaLabelForPicture: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.30.0
      *
      * Attributes of an uploaded item, for example, 'Uploaded By', 'Uploaded On', 'File Size' attributes are
      * displayed after an item has been uploaded. Additionally, the Active property of sap.m.ObjectAttribute
      * is supported.
      *  Note that if one of the deprecated properties contributor, fileSize or UploadedDate is filled in addition
      * to this attribute, two attributes with the same title are displayed as these properties get displayed
      * as an attribute. Example: An application passes the property ‘contributor’ with the value ‘A’ and the
      * aggregation attributes ‘contributor’: ‘B’. As a result, the attributes ‘contributor’:’A’ and ‘contributor’:’B’
      * are displayed. To make sure the title does not appear twice, check if one of the properties is filled.
      */
    var attributes: js.UndefOr[
        js.Array[typings.openui5.sapMObjectAttributeMod.default] | typings.openui5.sapMObjectAttributeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.30) - This property is deprecated; use the aggregation attributes instead. However,
      * if the property is filled, it is displayed as an attribute. To make sure the title does not appear twice,
      * do not use the property.
      *
      * Specifies the name of the user who uploaded the file.
      */
    var contributor: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.50.0
      *
      * When a deletePress event handler is attached to the item and the user presses the delete button, this
      * event is triggered. If this event is triggered, it overwrites the default delete behavior of UploadCollection
      * and the fileDeleted event of UploadCollection is not triggered.
      */
    var deletePress: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Specifies a unique identifier of the file (created by the application).
      */
    var documentId: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Enables/Disables the Delete button. If the value is true, the Delete button is enabled and the delete
      * function can be used. If the value is false, the delete function is not available.
      */
    var enableDelete: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Enables/Disables the Edit button. If the value is true, the Edit button is enabled and the edit function
      * can be used. If the value is false, the edit function is not available.
      */
    var enableEdit: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the name of the uploaded file.
      */
    var fileName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @deprecated (since 1.30) - This property is deprecated; use the aggregation attributes instead.
      *
      * Specifies the size of the uploaded file (in megabytes).
      */
    var fileSize: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.30.0
      *
      * ID of the FileUploader instance
      */
    var fileUploader: js.UndefOr[typings.openui5.sapUiUnifiedFileUploaderMod.default | String] = js.undefined
    
    /**
      * @since 1.40.0
      *
      * Markers of an uploaded item Markers will be displayed after an item has been uploaded But not in Edit
      * mode
      */
    var markers: js.UndefOr[
        js.Array[typings.openui5.sapMObjectMarkerMod.default] | typings.openui5.sapMObjectMarkerMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the MIME type of the file.
      */
    var mimeType: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.50.0
      *
      * This event is triggered when the user presses the filename link. If this event is provided, it overwrites
      * the default behavior of opening the file.
      */
    var press: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * @since 1.34.0
      *
      * Defines the selected state of the UploadCollectionItem.
      */
    var selected: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.30.0
      *
      * Statuses of an uploaded item Statuses will be displayed after an item has been uploaded
      */
    var statuses: js.UndefOr[
        js.Array[typings.openui5.sapMObjectStatusMod.default] | typings.openui5.sapMObjectStatusMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the URL where the thumbnail of the file is located. This can also be an SAPUI5 icon URL.
      */
    var thumbnailUrl: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @deprecated (since 1.30) - This property is deprecated; use the aggregation attributes instead.
      *
      * Specifies the date on which the file was uploaded. The application has to define the date format.
      */
    var uploadedDate: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies the URL where the file is located. If the application doesn't provide a value for this property,
      * the icon and the file name of the UploadCollectionItem are not clickable.
      */
    var url: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Show/Hide the Delete button. If the value is true, the Delete button is visible. If the value is false,
      * the Delete button is not visible.
      */
    var visibleDelete: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Show/Hide the Edit button. If the value is true, the Edit button is visible. If the value is false, the
      * Edit button is not visible.
      */
    var visibleEdit: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object UploadCollectionItemSettings {
    
    inline def apply(): UploadCollectionItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadCollectionItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadCollectionItemSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaLabelForPicture(value: String | PropertyBindingInfo): Self = StObject.set(x, "ariaLabelForPicture", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelForPictureUndefined: Self = StObject.set(x, "ariaLabelForPicture", js.undefined)
      
      inline def setAttributes(
        value: js.Array[typings.openui5.sapMObjectAttributeMod.default] | typings.openui5.sapMObjectAttributeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: typings.openui5.sapMObjectAttributeMod.default*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setContributor(value: String | PropertyBindingInfo): Self = StObject.set(x, "contributor", value.asInstanceOf[js.Any])
      
      inline def setContributorUndefined: Self = StObject.set(x, "contributor", js.undefined)
      
      inline def setDeletePress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "deletePress", js.Any.fromFunction1(value))
      
      inline def setDeletePressUndefined: Self = StObject.set(x, "deletePress", js.undefined)
      
      inline def setDocumentId(value: String | PropertyBindingInfo): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
      
      inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
      
      inline def setEnableDelete(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableDelete", value.asInstanceOf[js.Any])
      
      inline def setEnableDeleteUndefined: Self = StObject.set(x, "enableDelete", js.undefined)
      
      inline def setEnableEdit(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableEdit", value.asInstanceOf[js.Any])
      
      inline def setEnableEditUndefined: Self = StObject.set(x, "enableEdit", js.undefined)
      
      inline def setFileName(value: String | PropertyBindingInfo): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setFileSize(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
      
      inline def setFileUploader(value: typings.openui5.sapUiUnifiedFileUploaderMod.default | String): Self = StObject.set(x, "fileUploader", value.asInstanceOf[js.Any])
      
      inline def setFileUploaderUndefined: Self = StObject.set(x, "fileUploader", js.undefined)
      
      inline def setMarkers(
        value: js.Array[typings.openui5.sapMObjectMarkerMod.default] | typings.openui5.sapMObjectMarkerMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
      
      inline def setMarkersVarargs(value: typings.openui5.sapMObjectMarkerMod.default*): Self = StObject.set(x, "markers", js.Array(value*))
      
      inline def setMimeType(value: String | PropertyBindingInfo): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setSelected(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setStatuses(
        value: js.Array[typings.openui5.sapMObjectStatusMod.default] | typings.openui5.sapMObjectStatusMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
      
      inline def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
      
      inline def setStatusesVarargs(value: typings.openui5.sapMObjectStatusMod.default*): Self = StObject.set(x, "statuses", js.Array(value*))
      
      inline def setThumbnailUrl(value: String | PropertyBindingInfo): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
      
      inline def setUploadedDate(value: String | PropertyBindingInfo): Self = StObject.set(x, "uploadedDate", value.asInstanceOf[js.Any])
      
      inline def setUploadedDateUndefined: Self = StObject.set(x, "uploadedDate", js.undefined)
      
      inline def setUrl(value: String | PropertyBindingInfo): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVisibleDelete(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleDelete", value.asInstanceOf[js.Any])
      
      inline def setVisibleDeleteUndefined: Self = StObject.set(x, "visibleDelete", js.undefined)
      
      inline def setVisibleEdit(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleEdit", value.asInstanceOf[js.Any])
      
      inline def setVisibleEditUndefined: Self = StObject.set(x, "visibleEdit", js.undefined)
    }
  }
}
