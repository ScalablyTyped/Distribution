package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcFioriLibraryMod.IUploadCollectionItem
import typings.openui5.sapUiWebcFioriLibraryMod.UploadState
import typings.std.File
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcFioriUploadCollectionItemMod {
  
  @JSImport("sap/ui/webc/fiori/UploadCollectionItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `UploadCollectionItem`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends UploadCollectionItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: UploadCollectionItemSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: UploadCollectionItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: UploadCollectionItemSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_webc_fiori_IUploadCollectionItem: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/fiori/UploadCollectionItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.fiori.UploadCollectionItem with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.webc.common.WebComponent.extend}.
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
      * Returns a metadata object for class sap.ui.webc.fiori.UploadCollectionItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait UploadCollectionItem
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default
       with IUploadCollectionItem {
    
    /**
      * Adds some content to the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:fileNameClick fileNameClick} event of this `sap.ui.webc.fiori.UploadCollectionItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.UploadCollectionItem` itself.
      *
      * Fired when the file name is clicked.
      *
      *  **Note:** This event is only available when `fileNameClickable` property is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFileNameClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachFileNameClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.UploadCollectionItem`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:fileNameClick fileNameClick} event of this `sap.ui.webc.fiori.UploadCollectionItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.UploadCollectionItem` itself.
      *
      * Fired when the file name is clicked.
      *
      *  **Note:** This event is only available when `fileNameClickable` property is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFileNameClick(
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
    def attachFileNameClick(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.UploadCollectionItem`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:rename rename} event of this `sap.ui.webc.fiori.UploadCollectionItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.UploadCollectionItem` itself.
      *
      * Fired when the `fileName` property gets changed.
      *
      *  **Note:** An edit button is displayed on each item, when the `sap.ui.webc.fiori.UploadCollectionItem`
      * `type` property is set to `Detail`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRename(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachRename(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.UploadCollectionItem`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:rename rename} event of this `sap.ui.webc.fiori.UploadCollectionItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.UploadCollectionItem` itself.
      *
      * Fired when the `fileName` property gets changed.
      *
      *  **Note:** An edit button is displayed on each item, when the `sap.ui.webc.fiori.UploadCollectionItem`
      * `type` property is set to `Detail`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRename(
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
    def attachRename(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.UploadCollectionItem`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:retry retry} event of this `sap.ui.webc.fiori.UploadCollectionItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.UploadCollectionItem` itself.
      *
      * Fired when the retry button is pressed.
      *
      *  **Note:** Retry button is displayed when `uploadState` property is set to `Error`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRetry(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachRetry(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.UploadCollectionItem`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:retry retry} event of this `sap.ui.webc.fiori.UploadCollectionItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.UploadCollectionItem` itself.
      *
      * Fired when the retry button is pressed.
      *
      *  **Note:** Retry button is displayed when `uploadState` property is set to `Error`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRetry(
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
    def attachRetry(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.UploadCollectionItem`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:terminate terminate} event of this `sap.ui.webc.fiori.UploadCollectionItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.UploadCollectionItem` itself.
      *
      * Fired when the terminate button is pressed.
      *
      *  **Note:** Terminate button is displayed when `uploadState` property is set to `Uploading`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTerminate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachTerminate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.UploadCollectionItem`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:terminate terminate} event of this `sap.ui.webc.fiori.UploadCollectionItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.UploadCollectionItem` itself.
      *
      * Fired when the terminate button is pressed.
      *
      *  **Note:** Terminate button is displayed when `uploadState` property is set to `Uploading`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTerminate(
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
    def attachTerminate(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.UploadCollectionItem`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Destroys the thumbnail in the aggregation {@link #getThumbnail thumbnail}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyThumbnail(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:fileNameClick fileNameClick} event of this
      * `sap.ui.webc.fiori.UploadCollectionItem`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFileNameClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachFileNameClick(
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
      * Detaches event handler `fnFunction` from the {@link #event:rename rename} event of this `sap.ui.webc.fiori.UploadCollectionItem`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachRename(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachRename(
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
      * Detaches event handler `fnFunction` from the {@link #event:retry retry} event of this `sap.ui.webc.fiori.UploadCollectionItem`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachRetry(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachRetry(
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
      * Detaches event handler `fnFunction` from the {@link #event:terminate terminate} event of this `sap.ui.webc.fiori.UploadCollectionItem`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachTerminate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachTerminate(
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:fileNameClick fileNameClick} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFileNameClick(): this.type = js.native
    def fireFileNameClick(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:rename rename} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireRename(): this.type = js.native
    def fireRename(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:retry retry} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireRetry(): this.type = js.native
    def fireRetry(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:terminate terminate} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireTerminate(): this.type = js.native
    def fireTerminate(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Hold the description of the `sap.ui.webc.fiori.UploadCollectionItem`. Will be shown below the file name.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getDisableDeleteButton disableDeleteButton}.
      *
      * Disables the delete button.
      *
      * Default value is `false`.
      *
      * @returns Value of property `disableDeleteButton`
      */
    def getDisableDeleteButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFile file}.
      *
      * Holds an instance of File associated with this item.
      *
      * @returns Value of property `file`
      */
    def getFile(): File = js.native
    
    /**
      * Gets current value of property {@link #getFileName fileName}.
      *
      * The name of the file.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `fileName`
      */
    def getFileName(): String = js.native
    
    /**
      * Gets current value of property {@link #getFileNameClickable fileNameClickable}.
      *
      * If set to `true` the file name will be clickable and it will fire `file-name-click` event upon click.
      *
      * Default value is `false`.
      *
      * @returns Value of property `fileNameClickable`
      */
    def getFileNameClickable(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHideRetryButton hideRetryButton}.
      *
      * Hides the retry button when `uploadState` property is `Error`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideRetryButton`
      */
    def getHideRetryButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHideTerminateButton hideTerminateButton}.
      *
      * Hides the terminate button when `uploadState` property is `Uploading`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideTerminateButton`
      */
    def getHideTerminateButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getProgress progress}.
      *
      * The upload progress in percentage.
      *
      *  **Note:** Expected values are in the interval [0, 100].
      *
      * Default value is `0`.
      *
      * @returns Value of property `progress`
      */
    def getProgress(): int = js.native
    
    /**
      * Gets content of aggregation {@link #getThumbnail thumbnail}.
      *
      * A thumbnail, which will be shown in the beginning of the `sap.ui.webc.fiori.UploadCollectionItem`.
      *
      *  **Note:** Use `sap.ui.webc.main.Icon` or `img` for the intended design.
      */
    def getThumbnail(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getUploadState uploadState}.
      *
      * If set to `Uploading` or `Error`, a progress indicator showing the `progress` is displayed. Also if set
      * to `Error`, a refresh button is shown. When this icon is pressed `retry` event is fired. If set to `Uploading`,
      * a terminate button is shown. When this icon is pressed `terminate` event is fired.
      *
      * Default value is `Ready`.
      *
      * @returns Value of property `uploadState`
      */
    def getUploadState(): UploadState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UploadState * / any */ String) = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContent content}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a content into the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContent(
      /**
      * The content to insert; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getDisableDeleteButton disableDeleteButton}.
      *
      * Disables the delete button.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisableDeleteButton(): this.type = js.native
    def setDisableDeleteButton(/**
      * New value for property `disableDeleteButton`
      */
    bDisableDeleteButton: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #setFile file}.
      *
      * Holds an instance of File associated with this item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFile(): this.type = js.native
    def setFile(/**
      * New value for property `file`
      */
    oFile: File): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFileName fileName}.
      *
      * The name of the file.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFileName(): this.type = js.native
    def setFileName(/**
      * New value for property `fileName`
      */
    sFileName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFileNameClickable fileNameClickable}.
      *
      * If set to `true` the file name will be clickable and it will fire `file-name-click` event upon click.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFileNameClickable(): this.type = js.native
    def setFileNameClickable(/**
      * New value for property `fileNameClickable`
      */
    bFileNameClickable: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHideRetryButton hideRetryButton}.
      *
      * Hides the retry button when `uploadState` property is `Error`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHideRetryButton(): this.type = js.native
    def setHideRetryButton(/**
      * New value for property `hideRetryButton`
      */
    bHideRetryButton: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHideTerminateButton hideTerminateButton}.
      *
      * Hides the terminate button when `uploadState` property is `Uploading`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHideTerminateButton(): this.type = js.native
    def setHideTerminateButton(/**
      * New value for property `hideTerminateButton`
      */
    bHideTerminateButton: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getProgress progress}.
      *
      * The upload progress in percentage.
      *
      *  **Note:** Expected values are in the interval [0, 100].
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setProgress(): this.type = js.native
    def setProgress(/**
      * New value for property `progress`
      */
    iProgress: int): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getThumbnail thumbnail}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setThumbnail(/**
      * The thumbnail to set
      */
    oThumbnail: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUploadState uploadState}.
      *
      * If set to `Uploading` or `Error`, a progress indicator showing the `progress` is displayed. Also if set
      * to `Error`, a refresh button is shown. When this icon is pressed `retry` event is fired. If set to `Uploading`,
      * a terminate button is shown. When this icon is pressed `terminate` event is fired.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Ready`.
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
  }
  
  trait UploadCollectionItemSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Hold the description of the `sap.ui.webc.fiori.UploadCollectionItem`. Will be shown below the file name.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Disables the delete button.
      */
    var disableDeleteButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Holds an instance of `File` associated with this item.
      */
    var file: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The name of the file.
      */
    var fileName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fired when the file name is clicked.
      *
      *  **Note:** This event is only available when `fileNameClickable` property is `true`.
      */
    var fileNameClick: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * If set to `true` the file name will be clickable and it will fire `file-name-click` event upon click.
      */
    var fileNameClickable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Hides the retry button when `uploadState` property is `Error`.
      */
    var hideRetryButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Hides the terminate button when `uploadState` property is `Uploading`.
      */
    var hideTerminateButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The upload progress in percentage.
      *
      *  **Note:** Expected values are in the interval [0, 100].
      */
    var progress: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Fired when the `fileName` property gets changed.
      *
      *  **Note:** An edit button is displayed on each item, when the `sap.ui.webc.fiori.UploadCollectionItem`
      * `type` property is set to `Detail`.
      */
    var rename: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when the retry button is pressed.
      *
      *  **Note:** Retry button is displayed when `uploadState` property is set to `Error`.
      */
    var retry: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when the terminate button is pressed.
      *
      *  **Note:** Terminate button is displayed when `uploadState` property is set to `Uploading`.
      */
    var terminate: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * A thumbnail, which will be shown in the beginning of the `sap.ui.webc.fiori.UploadCollectionItem`.
      *
      *  **Note:** Use `sap.ui.webc.main.Icon` or `img` for the intended design.
      */
    var thumbnail: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * If set to `Uploading` or `Error`, a progress indicator showing the `progress` is displayed. Also if set
      * to `Error`, a refresh button is shown. When this icon is pressed `retry` event is fired. If set to `Uploading`,
      * a terminate button is shown. When this icon is pressed `terminate` event is fired.
      */
    var uploadState: js.UndefOr[
        UploadState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UploadState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object UploadCollectionItemSettings {
    
    inline def apply(): UploadCollectionItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadCollectionItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadCollectionItemSettings] (val x: Self) extends AnyVal {
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setDisableDeleteButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "disableDeleteButton", value.asInstanceOf[js.Any])
      
      inline def setDisableDeleteButtonUndefined: Self = StObject.set(x, "disableDeleteButton", js.undefined)
      
      inline def setFile(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String | PropertyBindingInfo): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameClick(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "fileNameClick", js.Any.fromFunction1(value))
      
      inline def setFileNameClickUndefined: Self = StObject.set(x, "fileNameClick", js.undefined)
      
      inline def setFileNameClickable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fileNameClickable", value.asInstanceOf[js.Any])
      
      inline def setFileNameClickableUndefined: Self = StObject.set(x, "fileNameClickable", js.undefined)
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setHideRetryButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideRetryButton", value.asInstanceOf[js.Any])
      
      inline def setHideRetryButtonUndefined: Self = StObject.set(x, "hideRetryButton", js.undefined)
      
      inline def setHideTerminateButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideTerminateButton", value.asInstanceOf[js.Any])
      
      inline def setHideTerminateButtonUndefined: Self = StObject.set(x, "hideTerminateButton", js.undefined)
      
      inline def setProgress(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setRename(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "rename", js.Any.fromFunction1(value))
      
      inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
      
      inline def setRetry(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "retry", js.Any.fromFunction1(value))
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setTerminate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "terminate", js.Any.fromFunction1(value))
      
      inline def setTerminateUndefined: Self = StObject.set(x, "terminate", js.undefined)
      
      inline def setThumbnail(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
      
      inline def setUploadState(
        value: UploadState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UploadState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "uploadState", value.asInstanceOf[js.Any])
      
      inline def setUploadStateUndefined: Self = StObject.set(x, "uploadState", js.undefined)
    }
  }
}
