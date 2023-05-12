package typings.openui5

import typings.openui5.anon.Loaded
import typings.openui5.anon.ResponseXHR
import typings.openui5.anon.`31`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMUploadUploaderHttpRequestMethodMod.UploaderHttpRequestMethod
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Blob
import typings.std.File
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMUploadUploaderMod {
  
  @JSImport("sap/m/upload/Uploader", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Uploader.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Uploader
  /* static members */
  object default {
    
    @JSImport("sap/m/upload/Uploader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.upload.Uploader with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Uploader]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Uploader],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.upload.Uploader.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
    
    inline def uploadFile(
      /**
      * File or Blob object to be uploaded.
      */
    oFile: Blob,
      /**
      * Upload Url.
      */
    sUrl: String
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadFile")(oFile.asInstanceOf[js.Any], sUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def uploadFile(
      /**
      * File or Blob object to be uploaded.
      */
    oFile: Blob,
      /**
      * Upload Url.
      */
    sUrl: String,
      /**
      * Collection of request header fields to be send along.
      */
    aHeaderFields: js.Array[typings.openui5.sapUiCoreItemMod.default]
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadFile")(oFile.asInstanceOf[js.Any], sUrl.asInstanceOf[js.Any], aHeaderFields.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    /**
      * Starts function for uploading one file object to given url. Returns promise that resolves when the upload
      * is finished or rejects when the upload fails.
      *
      * @returns Promise that resolves when the upload is finished or rejects when the upload fails.
      */
    inline def uploadFile(
      /**
      * File or Blob object to be uploaded.
      */
    oFile: File,
      /**
      * Upload Url.
      */
    sUrl: String
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadFile")(oFile.asInstanceOf[js.Any], sUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def uploadFile(
      /**
      * File or Blob object to be uploaded.
      */
    oFile: File,
      /**
      * Upload Url.
      */
    sUrl: String,
      /**
      * Collection of request header fields to be send along.
      */
    aHeaderFields: js.Array[typings.openui5.sapUiCoreItemMod.default]
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadFile")(oFile.asInstanceOf[js.Any], sUrl.asInstanceOf[js.Any], aHeaderFields.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  }
  
  @js.native
  trait Uploader
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:uploadAborted uploadAborted} event of this `sap.m.upload.Uploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.Uploader` itself.
      *
      * The event is fired when an XHR request reports its abortion.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUploadAborted(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachUploadAborted(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.Uploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:uploadAborted uploadAborted} event of this `sap.m.upload.Uploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.Uploader` itself.
      *
      * The event is fired when an XHR request reports its abortion.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUploadAborted(
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
    def attachUploadAborted(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.Uploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:uploadCompleted uploadCompleted} event of this
      * `sap.m.upload.Uploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.Uploader` itself.
      *
      * The event is fired when an XHR request reports successful completion of upload process.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUploadCompleted(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachUploadCompleted(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.Uploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:uploadCompleted uploadCompleted} event of this
      * `sap.m.upload.Uploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.Uploader` itself.
      *
      * The event is fired when an XHR request reports successful completion of upload process.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUploadCompleted(
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
    def attachUploadCompleted(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.Uploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:uploadProgressed uploadProgressed} event of
      * this `sap.m.upload.Uploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.Uploader` itself.
      *
      * The event is fired every time an XHR request reports progress in uploading.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUploadProgressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachUploadProgressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.Uploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:uploadProgressed uploadProgressed} event of
      * this `sap.m.upload.Uploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.Uploader` itself.
      *
      * The event is fired every time an XHR request reports progress in uploading.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUploadProgressed(
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
    def attachUploadProgressed(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.Uploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:uploadStarted uploadStarted} event of this `sap.m.upload.Uploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.Uploader` itself.
      *
      * The event is fired just after the POST request was sent.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUploadStarted(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachUploadStarted(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.Uploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:uploadStarted uploadStarted} event of this `sap.m.upload.Uploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.Uploader` itself.
      *
      * The event is fired just after the POST request was sent.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUploadStarted(
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
    def attachUploadStarted(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.Uploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:uploadAborted uploadAborted} event of this
      * `sap.m.upload.Uploader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachUploadAborted(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachUploadAborted(
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
      * Detaches event handler `fnFunction` from the {@link #event:uploadCompleted uploadCompleted} event of
      * this `sap.m.upload.Uploader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachUploadCompleted(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachUploadCompleted(
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
      * Detaches event handler `fnFunction` from the {@link #event:uploadProgressed uploadProgressed} event of
      * this `sap.m.upload.Uploader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachUploadProgressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachUploadProgressed(
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
      * Detaches event handler `fnFunction` from the {@link #event:uploadStarted uploadStarted} event of this
      * `sap.m.upload.Uploader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachUploadStarted(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachUploadStarted(
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
      * Starts the process of downloading a file.
      *
      * @returns True if the download process successfully
      */
    def downloadItem(
      /**
      * Item representing the file to be downloaded.
      */
    oItem: typings.openui5.sapMUploadUploadSetItemMod.default,
      /**
      * List of header fields to be added to the GET request.
      */
    aHeaderFields: js.Array[typings.openui5.sapUiCoreItemMod.default],
      /**
      * True if the location to where download the file should be first queried by a browser dialog.
      */
    bAskForLocation: Boolean
    ): Boolean = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:uploadAborted uploadAborted} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireUploadAborted(): this.type = js.native
    def fireUploadAborted(/**
      * Parameters to pass along with the event
      */
    mParameters: `31`): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:uploadCompleted uploadCompleted} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireUploadCompleted(): this.type = js.native
    def fireUploadCompleted(/**
      * Parameters to pass along with the event
      */
    mParameters: ResponseXHR): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:uploadProgressed uploadProgressed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireUploadProgressed(): this.type = js.native
    def fireUploadProgressed(/**
      * Parameters to pass along with the event
      */
    mParameters: Loaded): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:uploadStarted uploadStarted} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireUploadStarted(): this.type = js.native
    def fireUploadStarted(/**
      * Parameters to pass along with the event
      */
    mParameters: `31`): this.type = js.native
    
    /**
      * Gets current value of property {@link #getDownloadUrl downloadUrl}.
      *
      * URL where the next file is going to be download from.
      *
      * @returns Value of property `downloadUrl`
      */
    def getDownloadUrl(): String = js.native
    
    /**
      * @SINCE 1.90
      *
      * Gets current value of property {@link #getHttpRequestMethod httpRequestMethod}.
      *
      * HTTP request method chosen for file upload.
      *
      * Default value is `Post`.
      *
      * @returns Value of property `httpRequestMethod`
      */
    def getHttpRequestMethod(): UploaderHttpRequestMethod = js.native
    
    /**
      * Gets current value of property {@link #getUploadUrl uploadUrl}.
      *
      * URL where the next file is going to be uploaded to.
      *
      * @returns Value of property `uploadUrl`
      */
    def getUploadUrl(): String = js.native
    
    /**
      * @SINCE 1.92
      *
      * Gets current value of property {@link #getUseMultipart useMultipart}.
      *
      * This property decides the type of request. If set to "true", the request gets sent as a multipart/form-data
      * request instead of file only request.
      *
      * Default value is `false`.
      *
      * @returns Value of property `useMultipart`
      */
    def getUseMultipart(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getDownloadUrl downloadUrl}.
      *
      * URL where the next file is going to be download from.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDownloadUrl(): this.type = js.native
    def setDownloadUrl(/**
      * New value for property `downloadUrl`
      */
    sDownloadUrl: String): this.type = js.native
    
    /**
      * @SINCE 1.90
      *
      * Sets a new value for property {@link #getHttpRequestMethod httpRequestMethod}.
      *
      * HTTP request method chosen for file upload.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Post`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHttpRequestMethod(): this.type = js.native
    def setHttpRequestMethod(
      /**
      * New value for property `httpRequestMethod`
      */
    sHttpRequestMethod: UploaderHttpRequestMethod
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUploadUrl uploadUrl}.
      *
      * URL where the next file is going to be uploaded to.
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
      * @SINCE 1.92
      *
      * Sets a new value for property {@link #getUseMultipart useMultipart}.
      *
      * This property decides the type of request. If set to "true", the request gets sent as a multipart/form-data
      * request instead of file only request.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUseMultipart(): this.type = js.native
    def setUseMultipart(/**
      * New value for property `useMultipart`
      */
    bUseMultipart: Boolean): this.type = js.native
    
    /**
      * Attempts to terminate the process of uploading the specified file.
      */
    def terminateItem(
      /**
      * Item representing the file whose ongoing upload process is to be terminated.
      */
    oItem: typings.openui5.sapMUploadUploadSetItemMod.default
    ): Unit = js.native
    
    /**
      * Starts the process of uploading the specified file.
      */
    def uploadItem(
      /**
      * Item representing the file to be uploaded.
      */
    oItem: typings.openui5.sapMUploadUploadSetItemMod.default
    ): Unit = js.native
    def uploadItem(
      /**
      * Item representing the file to be uploaded.
      */
    oItem: typings.openui5.sapMUploadUploadSetItemMod.default,
      /**
      * Collection of request header fields to be send along.
      */
    aHeaderFields: js.Array[typings.openui5.sapUiCoreItemMod.default]
    ): Unit = js.native
  }
  
  trait UploaderSettings
    extends StObject
       with ElementSettings {
    
    /**
      * URL where the next file is going to be download from.
      */
    var downloadUrl: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.90
      *
      * HTTP request method chosen for file upload.
      */
    var httpRequestMethod: js.UndefOr[
        UploaderHttpRequestMethod | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The event is fired when an XHR request reports its abortion.
      */
    var uploadAborted: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The event is fired when an XHR request reports successful completion of upload process.
      */
    var uploadCompleted: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The event is fired every time an XHR request reports progress in uploading.
      */
    var uploadProgressed: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The event is fired just after the POST request was sent.
      */
    var uploadStarted: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * URL where the next file is going to be uploaded to.
      */
    var uploadUrl: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.92
      *
      * This property decides the type of request. If set to "true", the request gets sent as a multipart/form-data
      * request instead of file only request.
      */
    var useMultipart: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object UploaderSettings {
    
    inline def apply(): UploaderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploaderSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploaderSettings] (val x: Self) extends AnyVal {
      
      inline def setDownloadUrl(value: String | PropertyBindingInfo): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
      
      inline def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
      
      inline def setHttpRequestMethod(
        value: UploaderHttpRequestMethod | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "httpRequestMethod", value.asInstanceOf[js.Any])
      
      inline def setHttpRequestMethodUndefined: Self = StObject.set(x, "httpRequestMethod", js.undefined)
      
      inline def setUploadAborted(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "uploadAborted", js.Any.fromFunction1(value))
      
      inline def setUploadAbortedUndefined: Self = StObject.set(x, "uploadAborted", js.undefined)
      
      inline def setUploadCompleted(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "uploadCompleted", js.Any.fromFunction1(value))
      
      inline def setUploadCompletedUndefined: Self = StObject.set(x, "uploadCompleted", js.undefined)
      
      inline def setUploadProgressed(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "uploadProgressed", js.Any.fromFunction1(value))
      
      inline def setUploadProgressedUndefined: Self = StObject.set(x, "uploadProgressed", js.undefined)
      
      inline def setUploadStarted(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "uploadStarted", js.Any.fromFunction1(value))
      
      inline def setUploadStartedUndefined: Self = StObject.set(x, "uploadStarted", js.undefined)
      
      inline def setUploadUrl(value: String | PropertyBindingInfo): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
      
      inline def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
      
      inline def setUseMultipart(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "useMultipart", value.asInstanceOf[js.Any])
      
      inline def setUseMultipartUndefined: Self = StObject.set(x, "useMultipart", js.undefined)
    }
  }
}
