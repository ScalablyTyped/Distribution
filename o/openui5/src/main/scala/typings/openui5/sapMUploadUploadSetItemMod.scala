package typings.openui5

import typings.openui5.anon.`33`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.UploadState
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Blob
import typings.std.File
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMUploadUploadSetItemMod {
  
  @JSImport("sap/m/upload/UploadSetItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new UploadSetItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends UploadSetItem {
    def this(/**
      * Initial settings for the new control.
      */
    mSettings: UploadSetItemSettings) = this()
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
      * Initial settings for the new control.
      */
    mSettings: UploadSetItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, will be generated automatically if no ID is provided.
      */
    sId: Unit,
      /**
      * Initial settings for the new control.
      */
    mSettings: UploadSetItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/upload/UploadSetItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.upload.UploadSetItem with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, UploadSetItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, UploadSetItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.upload.UploadSetItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait UploadSetItem
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
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
      * @SINCE 1.90
      *
      * Adds some headerField to the aggregation {@link #getHeaderFields headerFields}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addHeaderField(
      /**
      * The headerField to add; if empty, nothing is inserted
      */
    oHeaderField: typings.openui5.sapUiCoreItemMod.default
    ): this.type = js.native
    
    /**
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
      * Attaches event handler `fnFunction` to the {@link #event:openPressed openPressed} event of this `sap.m.upload.UploadSetItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSetItem` itself.
      *
      * This event is fired when an open action is invoked on an item.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpenPressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachOpenPressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSetItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:openPressed openPressed} event of this `sap.m.upload.UploadSetItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSetItem` itself.
      *
      * This event is fired when an open action is invoked on an item.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpenPressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachOpenPressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSetItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:removePressed removePressed} event of this `sap.m.upload.UploadSetItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSetItem` itself.
      *
      * This event is fired when a remove action is invoked on an item.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRemovePressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachRemovePressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSetItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:removePressed removePressed} event of this `sap.m.upload.UploadSetItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSetItem` itself.
      *
      * This event is fired when a remove action is invoked on an item.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRemovePressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachRemovePressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSetItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the attributes in the aggregation {@link #getAttributes attributes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAttributes(): this.type = js.native
    
    /**
      * @SINCE 1.90
      *
      * Destroys all the headerFields in the aggregation {@link #getHeaderFields headerFields}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeaderFields(): this.type = js.native
    
    /**
      * Destroys all the markers in the aggregation {@link #getMarkers markers}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMarkers(): this.type = js.native
    
    /**
      * Destroys all the statuses in the aggregation {@link #getStatuses statuses}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyStatuses(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:openPressed openPressed} event of this `sap.m.upload.UploadSetItem`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachOpenPressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachOpenPressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:removePressed removePressed} event of this
      * `sap.m.upload.UploadSetItem`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachRemovePressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachRemovePressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Downloads the item. Only possible when the item has a valid URL specified in the `url` property.
      *
      * @returns `true` if download is possible, `false` otherwise.
      */
    def download(
      /**
      * Whether to ask for a location where to download the file or not.
      */
    bAskForLocation: Boolean
    ): Boolean = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:openPressed openPressed} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireOpenPressed(): Boolean = js.native
    def fireOpenPressed(/**
      * Parameters to pass along with the event
      */
    mParameters: `33`): Boolean = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:removePressed removePressed} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireRemovePressed(): Boolean = js.native
    def fireRemovePressed(/**
      * Parameters to pass along with the event
      */
    mParameters: `33`): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getAttributes attributes}.
      *
      * Attributes of the item.
      */
    def getAttributes(): js.Array[typings.openui5.sapMObjectAttributeMod.default] = js.native
    
    /**
      * @SINCE 1.104.0
      *
      * Returns edit state of the item.
      *
      * @returns edit state of uploadSetItem
      */
    def getEditState(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnabledEdit enabledEdit}.
      *
      * Enables or disables the edit button.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabledEdit`
      */
    def getEnabledEdit(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnabledRemove enabledRemove}.
      *
      * Enables or disables the remove button.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabledRemove`
      */
    def getEnabledRemove(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFileName fileName}.
      *
      * Specifies the name of the uploaded file.
      *
      * @returns Value of property `fileName`
      */
    def getFileName(): String = js.native
    
    /**
      * Returns file object.
      *
      * @returns File object.
      */
    def getFileObject(): File | Blob = js.native
    
    /**
      * @SINCE 1.90
      *
      * Gets content of aggregation {@link #getHeaderFields headerFields}.
      *
      * Header fields to be included in the header section of an XMLHttpRequest (XHR) request
      */
    def getHeaderFields(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Returns list item.
      *
      * @returns List item.
      */
    def getListItem(): typings.openui5.sapMCustomListItemMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getMarkers markers}.
      *
      * Markers of the item.
      */
    def getMarkers(): js.Array[typings.openui5.sapMObjectMarkerMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getMediaType mediaType}.
      *
      * Specifies the MIME type of the file.
      *
      * @returns Value of property `mediaType`
      */
    def getMediaType(): String = js.native
    
    /**
      * @SINCE 1.100.0
      *
      * Gets current value of property {@link #getSelected selected}.
      *
      * Defines the selected state of the UploadSetItem.
      *
      * Default value is `false`.
      *
      * @returns Value of property `selected`
      */
    def getSelected(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getStatuses statuses}.
      *
      * Statuses of the item.
      */
    def getStatuses(): js.Array[typings.openui5.sapMObjectStatusMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getThumbnailUrl thumbnailUrl}.
      *
      * Specifies the URL where the thumbnail of the file is located. Can also be set to an SAPUI5 icon URL.
      *
      * @returns Value of property `thumbnailUrl`
      */
    def getThumbnailUrl(): String = js.native
    
    /**
      * Gets current value of property {@link #getUploadState uploadState}.
      *
      * State of the item relevant to its upload process.
      *
      * @returns Value of property `uploadState`
      */
    def getUploadState(): UploadState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UploadState * / any */ String) = js.native
    
    /**
      * @SINCE 1.90
      *
      * Gets current value of property {@link #getUploadUrl uploadUrl}.
      *
      * URL where the uploaded files will be stored. If empty, uploadUrl from the uploader is considered.
      *
      * @returns Value of property `uploadUrl`
      */
    def getUploadUrl(): String = js.native
    
    /**
      * Gets current value of property {@link #getUrl url}.
      *
      * Specifies the URL where the file is located.
      * If the application doesn't provide a value for this property, the icon and the file name are not clickable
      * in {@link sap.m.upload.UploadSet}.
      *
      * @returns Value of property `url`
      */
    def getUrl(): String = js.native
    
    /**
      * Gets current value of property {@link #getVisibleEdit visibleEdit}.
      *
      * Shows or hides the edit button.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visibleEdit`
      */
    def getVisibleEdit(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getVisibleRemove visibleRemove}.
      *
      * Shows or hides the remove button.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visibleRemove`
      */
    def getVisibleRemove(): Boolean = js.native
    
    /**
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
      * @SINCE 1.90
      *
      * Checks for the provided `sap.ui.core.Item` in the aggregation {@link #getHeaderFields headerFields}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfHeaderField(
      /**
      * The headerField whose index is looked for
      */
    oHeaderField: typings.openui5.sapUiCoreItemMod.default
    ): int = js.native
    
    /**
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
      * @SINCE 1.90
      *
      * Inserts a headerField into the aggregation {@link #getHeaderFields headerFields}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertHeaderField(
      /**
      * The headerField to insert; if empty, nothing is inserted
      */
    oHeaderField: typings.openui5.sapUiCoreItemMod.default,
      /**
      * The `0`-based index the headerField should be inserted at; for a negative value of `iIndex`, the headerField
      * is inserted at position 0; for a value greater than the current size of the aggregation, the headerField
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
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
      * @SINCE 1.98
      *
      * Validates if the item is restricted, which means that it is restricted for the file type, media type,
      * maximum file name length and maximum file size limit.
      *
      * @returns `true` if item is restricted, `false` otherwise.
      */
    def isRestricted(): Boolean = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getAttributes attributes}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAttributes(): js.Array[typings.openui5.sapMObjectAttributeMod.default] = js.native
    
    /**
      * @SINCE 1.90
      *
      * Removes all the controls from the aggregation {@link #getHeaderFields headerFields}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllHeaderFields(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getMarkers markers}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllMarkers(): js.Array[typings.openui5.sapMObjectMarkerMod.default] = js.native
    
    /**
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
    
    def removeHeaderField(/**
      * The headerField to remove or its index or id
      */
    vHeaderField: String): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    /**
      * @SINCE 1.90
      *
      * Removes a headerField from the aggregation {@link #getHeaderFields headerFields}.
      *
      * @returns The removed headerField or `null`
      */
    def removeHeaderField(/**
      * The headerField to remove or its index or id
      */
    vHeaderField: int): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    def removeHeaderField(
      /**
      * The headerField to remove or its index or id
      */
    vHeaderField: typings.openui5.sapUiCoreItemMod.default
    ): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    def removeMarker(/**
      * The marker to remove or its index or id
      */
    vMarker: String): typings.openui5.sapMObjectMarkerMod.default | Null = js.native
    /**
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
      * Sets a new value for property {@link #getEnabledEdit enabledEdit}.
      *
      * Enables or disables the edit button.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnabledEdit(): this.type = js.native
    def setEnabledEdit(/**
      * New value for property `enabledEdit`
      */
    bEnabledEdit: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabledRemove enabledRemove}.
      *
      * Enables or disables the remove button.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnabledRemove(): this.type = js.native
    def setEnabledRemove(/**
      * New value for property `enabledRemove`
      */
    bEnabledRemove: Boolean): this.type = js.native
    
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
      * Sets a new value for property {@link #getMediaType mediaType}.
      *
      * Specifies the MIME type of the file.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMediaType(): this.type = js.native
    def setMediaType(/**
      * New value for property `mediaType`
      */
    sMediaType: String): this.type = js.native
    
    /**
      * Set current progress.
      *
      * @returns Returns instance for chaining.
      */
    def setProgress(/**
      * Current progress.
      */
    iProgress: int): this.type = js.native
    
    /**
      * @SINCE 1.100.0
      *
      * Sets a new value for property {@link #getSelected selected}.
      *
      * Defines the selected state of the UploadSetItem.
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
      * Specifies the URL where the thumbnail of the file is located. Can also be set to an SAPUI5 icon URL.
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
      * Sets a new value for property {@link #getUploadState uploadState}.
      *
      * State of the item relevant to its upload process.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUploadState(): this.type = js.native
    def setUploadState(
      /**
      * New value for property `uploadState`
      */
    sUploadState: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UploadState * / any */ String
    ): this.type = js.native
    def setUploadState(/**
      * New value for property `uploadState`
      */
    sUploadState: UploadState): this.type = js.native
    
    /**
      * @SINCE 1.90
      *
      * Sets a new value for property {@link #getUploadUrl uploadUrl}.
      *
      * URL where the uploaded files will be stored. If empty, uploadUrl from the uploader is considered.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUploadUrl(): this.type = js.native
    def setUploadUrl(/**
      * New value for property `uploadUrl`
      */
    sUploadUrl: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUrl url}.
      *
      * Specifies the URL where the file is located.
      * If the application doesn't provide a value for this property, the icon and the file name are not clickable
      * in {@link sap.m.upload.UploadSet}.
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
      * Sets a new value for property {@link #getVisibleEdit visibleEdit}.
      *
      * Shows or hides the edit button.
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
      * Sets a new value for property {@link #getVisibleRemove visibleRemove}.
      *
      * Shows or hides the remove button.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleRemove(): this.type = js.native
    def setVisibleRemove(/**
      * New value for property `visibleRemove`
      */
    bVisibleRemove: Boolean): this.type = js.native
  }
  
  trait UploadSetItemSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Attributes of the item.
      */
    var attributes: js.UndefOr[
        js.Array[typings.openui5.sapMObjectAttributeMod.default] | typings.openui5.sapMObjectAttributeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Enables or disables the edit button.
      */
    var enabledEdit: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Enables or disables the remove button.
      */
    var enabledRemove: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the name of the uploaded file.
      */
    var fileName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.90
      *
      * Header fields to be included in the header section of an XMLHttpRequest (XHR) request
      */
    var headerFields: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Markers of the item.
      */
    var markers: js.UndefOr[
        js.Array[typings.openui5.sapMObjectMarkerMod.default] | typings.openui5.sapMObjectMarkerMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the MIME type of the file.
      */
    var mediaType: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * This event is fired when an open action is invoked on an item.
      */
    var openPressed: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This event is fired when a remove action is invoked on an item.
      */
    var removePressed: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.100.0
      *
      * Defines the selected state of the UploadSetItem.
      */
    var selected: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Statuses of the item.
      */
    var statuses: js.UndefOr[
        js.Array[typings.openui5.sapMObjectStatusMod.default] | typings.openui5.sapMObjectStatusMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the URL where the thumbnail of the file is located. Can also be set to an SAPUI5 icon URL.
      */
    var thumbnailUrl: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * State of the item relevant to its upload process.
      */
    var uploadState: js.UndefOr[
        UploadState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UploadState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.90
      *
      * URL where the uploaded files will be stored. If empty, uploadUrl from the uploader is considered.
      */
    var uploadUrl: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies the URL where the file is located.
      * If the application doesn't provide a value for this property, the icon and the file name are not clickable
      * in {@link sap.m.upload.UploadSet}.
      */
    var url: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Shows or hides the edit button.
      */
    var visibleEdit: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Shows or hides the remove button.
      */
    var visibleRemove: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object UploadSetItemSettings {
    
    inline def apply(): UploadSetItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadSetItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadSetItemSettings] (val x: Self) extends AnyVal {
      
      inline def setAttributes(
        value: js.Array[typings.openui5.sapMObjectAttributeMod.default] | typings.openui5.sapMObjectAttributeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: typings.openui5.sapMObjectAttributeMod.default*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setEnabledEdit(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabledEdit", value.asInstanceOf[js.Any])
      
      inline def setEnabledEditUndefined: Self = StObject.set(x, "enabledEdit", js.undefined)
      
      inline def setEnabledRemove(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabledRemove", value.asInstanceOf[js.Any])
      
      inline def setEnabledRemoveUndefined: Self = StObject.set(x, "enabledRemove", js.undefined)
      
      inline def setFileName(value: String | PropertyBindingInfo): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setHeaderFields(
        value: js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "headerFields", value.asInstanceOf[js.Any])
      
      inline def setHeaderFieldsUndefined: Self = StObject.set(x, "headerFields", js.undefined)
      
      inline def setHeaderFieldsVarargs(value: typings.openui5.sapUiCoreItemMod.default*): Self = StObject.set(x, "headerFields", js.Array(value*))
      
      inline def setMarkers(
        value: js.Array[typings.openui5.sapMObjectMarkerMod.default] | typings.openui5.sapMObjectMarkerMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
      
      inline def setMarkersVarargs(value: typings.openui5.sapMObjectMarkerMod.default*): Self = StObject.set(x, "markers", js.Array(value*))
      
      inline def setMediaType(value: String | PropertyBindingInfo): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setOpenPressed(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "openPressed", js.Any.fromFunction1(value))
      
      inline def setOpenPressedUndefined: Self = StObject.set(x, "openPressed", js.undefined)
      
      inline def setRemovePressed(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "removePressed", js.Any.fromFunction1(value))
      
      inline def setRemovePressedUndefined: Self = StObject.set(x, "removePressed", js.undefined)
      
      inline def setSelected(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setStatuses(
        value: js.Array[typings.openui5.sapMObjectStatusMod.default] | typings.openui5.sapMObjectStatusMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
      
      inline def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
      
      inline def setStatusesVarargs(value: typings.openui5.sapMObjectStatusMod.default*): Self = StObject.set(x, "statuses", js.Array(value*))
      
      inline def setThumbnailUrl(value: String | PropertyBindingInfo): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
      
      inline def setUploadState(
        value: UploadState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UploadState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "uploadState", value.asInstanceOf[js.Any])
      
      inline def setUploadStateUndefined: Self = StObject.set(x, "uploadState", js.undefined)
      
      inline def setUploadUrl(value: String | PropertyBindingInfo): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
      
      inline def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
      
      inline def setUrl(value: String | PropertyBindingInfo): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVisibleEdit(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleEdit", value.asInstanceOf[js.Any])
      
      inline def setVisibleEditUndefined: Self = StObject.set(x, "visibleEdit", js.undefined)
      
      inline def setVisibleRemove(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleRemove", value.asInstanceOf[js.Any])
      
      inline def setVisibleRemoveUndefined: Self = StObject.set(x, "visibleRemove", js.undefined)
    }
  }
}
