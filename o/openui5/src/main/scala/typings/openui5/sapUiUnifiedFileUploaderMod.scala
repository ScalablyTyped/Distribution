package typings.openui5

import typings.openui5.anon.FileName
import typings.openui5.anon.FileSize
import typings.openui5.anon.FileType
import typings.openui5.anon.Files
import typings.openui5.anon.LengthComputable
import typings.openui5.anon.ReadyStateXHR
import typings.openui5.anon.RequestHeaders
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiCoreLibraryMod.ValueState
import typings.openui5.sapUiUnifiedFileUploaderHttpRequestMethodMod.FileUploaderHttpRequestMethod
import typings.openui5.sapUiUnifiedLibraryMod.IProcessableBlobs
import typings.std.Blob
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedFileUploaderMod {
  
  @JSImport("sap/ui/unified/FileUploader", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `FileUploader`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/upload-collection/ Upload Collection}
    */
  open class default () extends FileUploader {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: FileUploaderSettings) = this()
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
    mSettings: FileUploaderSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: FileUploaderSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_unified_IProcessableBlobs: Boolean = js.native
    
    /**
      * @SINCE 1.52
      *
      * Allows to process Blobs before they get uploaded. This API can be used to create custom Blobs and upload
      * these custom Blobs instead of the received/initials Blobs in the parameter `aBlobs`. One use case could
      * be to create and upload zip archives based on the passed Blobs. The default implementation of this API
      * should simply resolve with the received Blobs (parameter `aBlobs`).
      *
      * @returns A Promise that resolves with an array of Blobs which is used for the final uploading.
      */
    /* CompleteClass */
    override def getProcessedBlobsFromArray(
      /**
      * The initial Blobs which can be used to determine a new array of Blobs for further processing.
      */
    aBlobs: js.Array[Blob]
    ): js.Promise[js.Array[Blob]] = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/FileUploader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.FileUploader with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
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
    oClassInfo: ClassInfo[T, FileUploader]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FileUploader],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.FileUploader.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FileUploader
    extends typings.openui5.sapUiCoreControlMod.default
       with IFormContent
       with IProcessableBlobs {
    
    /**
      * @SINCE 1.24.0
      *
      * Aborts the currently running upload.
      */
    def abort(
      /**
      * The name of the parameter within the `headerParameters` aggregation to be checked.
      *
      * **Note:** aborts the request, sent with a header parameter with the provided name. The parameter is taken
      * into account if the sHeaderParameterValue parameter is provided too.
      */
    sHeaderParameterName: String,
      /**
      * The value of the parameter within the `headerParameters` aggregation to be checked.
      *
      * **Note:** aborts the request, sent with a header parameter with the provided value. The parameter is
      * taken into account if the sHeaderParameterName parameter is provided too.
      */
    sHeaderParameterValue: String
    ): Unit = js.native
    
    def addAriaDescribedBy(
      /**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaDescribedBy into the association {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaDescribedBy(/**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: ID): this.type = js.native
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * Adds some headerParameter to the aggregation {@link #getHeaderParameters headerParameters}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addHeaderParameter(
      /**
      * The headerParameter to add; if empty, nothing is inserted
      */
    oHeaderParameter: typings.openui5.sapUiUnifiedFileUploaderParameterMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.12.2
      *
      * Adds some parameter to the aggregation {@link #getParameters parameters}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addParameter(
      /**
      * The parameter to add; if empty, nothing is inserted
      */
    oParameter: typings.openui5.sapUiUnifiedFileUploaderParameterMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.102.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:afterDialogClose afterDialogClose} event of
      * this `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Fired after select file dialog closes.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterDialogClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterDialogClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.102.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:afterDialogClose afterDialogClose} event of
      * this `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Fired after select file dialog closes.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterDialogClose(
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
    def attachAfterDialogClose(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.102.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:beforeDialogOpen beforeDialogOpen} event of
      * this `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Fired before select file dialog opens.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeDialogOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeDialogOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.102.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:beforeDialogOpen beforeDialogOpen} event of
      * this `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Fired before select file dialog opens.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeDialogOpen(
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
    def attachBeforeDialogOpen(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Event is fired when the value of the file path has been changed.
      *
      * **Note:** Keep in mind that because of the HTML input element of type file, the event is also fired in
      * Chrome browser when the Cancel button of the uploads window is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Event is fired when the value of the file path has been changed.
      *
      * **Note:** Keep in mind that because of the HTML input element of type file, the event is also fired in
      * Chrome browser when the Cancel button of the uploads window is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
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
    def attachChange(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:fileAllowed fileAllowed} event of this `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Event is fired when the file is allowed for upload on client side.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFileAllowed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachFileAllowed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:fileAllowed fileAllowed} event of this `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Event is fired when the file is allowed for upload on client side.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFileAllowed(
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
    def attachFileAllowed(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:fileEmpty fileEmpty} event of this `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Event is fired when the size of the file is 0
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFileEmpty(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachFileEmpty(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:fileEmpty fileEmpty} event of this `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Event is fired when the size of the file is 0
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFileEmpty(
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
    def attachFileEmpty(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:fileSizeExceed fileSizeExceed} event of this
      * `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Event is fired when the size of a file is above the `maximumFileSize` property. This event is not supported
      * by Internet Explorer 9 (same restriction as for the property `maximumFileSize`).
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFileSizeExceed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachFileSizeExceed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:fileSizeExceed fileSizeExceed} event of this
      * `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Event is fired when the size of a file is above the `maximumFileSize` property. This event is not supported
      * by Internet Explorer 9 (same restriction as for the property `maximumFileSize`).
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFileSizeExceed(
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
    def attachFileSizeExceed(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.24.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:filenameLengthExceed filenameLengthExceed} event
      * of this `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Event is fired, if the filename of a chosen file is longer than the value specified with the `maximumFilenameLength`
      * property.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFilenameLengthExceed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachFilenameLengthExceed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.24.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:filenameLengthExceed filenameLengthExceed} event
      * of this `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Event is fired, if the filename of a chosen file is longer than the value specified with the `maximumFilenameLength`
      * property.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFilenameLengthExceed(
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
    def attachFilenameLengthExceed(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:typeMissmatch typeMissmatch} event of this `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Event is fired when the type of a file does not match the `mimeType` or `fileType` property.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTypeMissmatch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachTypeMissmatch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:typeMissmatch typeMissmatch} event of this `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Event is fired when the type of a file does not match the `mimeType` or `fileType` property.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTypeMissmatch(
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
    def attachTypeMissmatch(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.24.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:uploadAborted uploadAborted} event of this `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Event is fired after the current upload has been aborted.
      *
      * This event is only supported with property `sendXHR` set to true, i.e. the event is not supported in
      * Internet Explorer 9.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.24.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:uploadAborted uploadAborted} event of this `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Event is fired after the current upload has been aborted.
      *
      * This event is only supported with property `sendXHR` set to true, i.e. the event is not supported in
      * Internet Explorer 9.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:uploadComplete uploadComplete} event of this
      * `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Event is fired as soon as the upload request is completed (either successful or unsuccessful).
      *
      * To see if the upload request was successful, check the `status` parameter for a value 2xx. The actual
      * progress of the upload can be monitored by listening to the `uploadProgress` event. However, this covers
      * only the client side of the upload process and does not give any success status from the server.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUploadComplete(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachUploadComplete(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:uploadComplete uploadComplete} event of this
      * `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Event is fired as soon as the upload request is completed (either successful or unsuccessful).
      *
      * To see if the upload request was successful, check the `status` parameter for a value 2xx. The actual
      * progress of the upload can be monitored by listening to the `uploadProgress` event. However, this covers
      * only the client side of the upload process and does not give any success status from the server.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUploadComplete(
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
    def attachUploadComplete(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.24.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:uploadProgress uploadProgress} event of this
      * `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Event is fired after the upload has started and before the upload is completed.
      *
      * It contains progress information related to the running upload. Depending on file size, band width and
      * used browser the event is fired once or multiple times.
      *
      * This event is only supported with property `sendXHR` set to true, i.e. the event is not supported in
      * Internet Explorer 9.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUploadProgress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachUploadProgress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.24.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:uploadProgress uploadProgress} event of this
      * `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Event is fired after the upload has started and before the upload is completed.
      *
      * It contains progress information related to the running upload. Depending on file size, band width and
      * used browser the event is fired once or multiple times.
      *
      * This event is only supported with property `sendXHR` set to true, i.e. the event is not supported in
      * Internet Explorer 9.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUploadProgress(
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
    def attachUploadProgress(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.30.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:uploadStart uploadStart} event of this `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Event is fired before an upload is started.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUploadStart(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachUploadStart(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.30.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:uploadStart uploadStart} event of this `sap.ui.unified.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.FileUploader` itself.
      *
      * Event is fired before an upload is started.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUploadStart(
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
    def attachUploadStart(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Checks if the chosen file is readable.
      *
      * @returns A promise that resolves successfully if the chosen file can be read and fails with an error
      * message if it cannot
      */
    def checkFileReadable(): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.25.0
      *
      * Clears the content of the `FileUploader`.
      *
      * **Note:** The attached additional data however is retained.
      *
      * @returns Reference to `this` for method chaining
      */
    def clear(): this.type = js.native
    
    /**
      * Destroys all the headerParameters in the aggregation {@link #getHeaderParameters headerParameters}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeaderParameters(): this.type = js.native
    
    /**
      * @SINCE 1.12.2
      *
      * Destroys all the parameters in the aggregation {@link #getParameters parameters}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyParameters(): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Destroys the xhrSettings in the aggregation {@link #getXhrSettings xhrSettings}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyXhrSettings(): this.type = js.native
    
    /**
      * @SINCE 1.102.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:afterDialogClose afterDialogClose} event of
      * this `sap.ui.unified.FileUploader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterDialogClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAfterDialogClose(
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
      * @SINCE 1.102.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:beforeDialogOpen beforeDialogOpen} event of
      * this `sap.ui.unified.FileUploader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeDialogOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBeforeDialogOpen(
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
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.ui.unified.FileUploader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachChange(
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
      * Detaches event handler `fnFunction` from the {@link #event:fileAllowed fileAllowed} event of this `sap.ui.unified.FileUploader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFileAllowed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachFileAllowed(
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
      * Detaches event handler `fnFunction` from the {@link #event:fileEmpty fileEmpty} event of this `sap.ui.unified.FileUploader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFileEmpty(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachFileEmpty(
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
      * Detaches event handler `fnFunction` from the {@link #event:fileSizeExceed fileSizeExceed} event of this
      * `sap.ui.unified.FileUploader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFileSizeExceed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachFileSizeExceed(
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
      * @SINCE 1.24.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:filenameLengthExceed filenameLengthExceed}
      * event of this `sap.ui.unified.FileUploader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFilenameLengthExceed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachFilenameLengthExceed(
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
      * Detaches event handler `fnFunction` from the {@link #event:typeMissmatch typeMissmatch} event of this
      * `sap.ui.unified.FileUploader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachTypeMissmatch(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachTypeMissmatch(
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
      * @SINCE 1.24.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:uploadAborted uploadAborted} event of this
      * `sap.ui.unified.FileUploader`.
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
      * Detaches event handler `fnFunction` from the {@link #event:uploadComplete uploadComplete} event of this
      * `sap.ui.unified.FileUploader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachUploadComplete(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachUploadComplete(
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
      * @SINCE 1.24.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:uploadProgress uploadProgress} event of this
      * `sap.ui.unified.FileUploader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachUploadProgress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachUploadProgress(
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
      * @SINCE 1.30.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:uploadStart uploadStart} event of this `sap.ui.unified.FileUploader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachUploadStart(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachUploadStart(
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
      * @SINCE 1.102.0
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:afterDialogClose afterDialogClose} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterDialogClose(): this.type = js.native
    def fireAfterDialogClose(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.102.0
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:beforeDialogOpen beforeDialogOpen} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforeDialogOpen(): this.type = js.native
    def fireBeforeDialogOpen(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:change change} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireChange(): this.type = js.native
    def fireChange(/**
      * Parameters to pass along with the event
      */
    mParameters: Files): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:fileAllowed fileAllowed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFileAllowed(): this.type = js.native
    def fireFileAllowed(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:fileEmpty fileEmpty} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFileEmpty(): this.type = js.native
    def fireFileEmpty(/**
      * Parameters to pass along with the event
      */
    mParameters: FileName): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:fileSizeExceed fileSizeExceed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFileSizeExceed(): this.type = js.native
    def fireFileSizeExceed(/**
      * Parameters to pass along with the event
      */
    mParameters: FileSize): this.type = js.native
    
    /**
      * @SINCE 1.24.0
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:filenameLengthExceed filenameLengthExceed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFilenameLengthExceed(): this.type = js.native
    def fireFilenameLengthExceed(/**
      * Parameters to pass along with the event
      */
    mParameters: FileName): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:typeMissmatch typeMissmatch} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireTypeMissmatch(): this.type = js.native
    def fireTypeMissmatch(/**
      * Parameters to pass along with the event
      */
    mParameters: FileType): this.type = js.native
    
    /**
      * @SINCE 1.24.0
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
    mParameters: RequestHeaders): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:uploadComplete uploadComplete} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireUploadComplete(): this.type = js.native
    def fireUploadComplete(/**
      * Parameters to pass along with the event
      */
    mParameters: ReadyStateXHR): this.type = js.native
    
    /**
      * @SINCE 1.24.0
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:uploadProgress uploadProgress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireUploadProgress(): this.type = js.native
    def fireUploadProgress(/**
      * Parameters to pass along with the event
      */
    mParameters: LengthComputable): this.type = js.native
    
    /**
      * @SINCE 1.30.0
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:uploadStart uploadStart} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireUploadStart(): this.type = js.native
    def fireUploadStart(/**
      * Parameters to pass along with the event
      */
    mParameters: RequestHeaders): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAdditionalData additionalData}.
      *
      * Additional data that is sent to the back end service.
      *
      * Data will be transmitted as value of a hidden input where the name is derived from the `name` property
      * with suffix "-data".
      *
      * @returns Value of property `additionalData`
      */
    def getAdditionalData(): String = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy
      * ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getButtonOnly buttonOnly}.
      *
      * If set to "true", the `FileUploader` will be rendered as Button only, without showing the input field.
      *
      * Default value is `false`.
      *
      * @returns Value of property `buttonOnly`
      */
    def getButtonOnly(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getButtonText buttonText}.
      *
      * The button's text can be overwritten using this property.
      *
      * @returns Value of property `buttonText`
      */
    def getButtonText(): String = js.native
    
    /**
      * @SINCE 1.105.0
      *
      * Gets current value of property {@link #getDirectory directory}.
      *
      * Allows users to upload all files from a given directory and its corresponding subdirectories.
      *
      * Default value is `false`.
      *
      * @returns Value of property `directory`
      */
    def getDirectory(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Disabled controls have different colors, depending on customer settings.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFileType fileType}.
      *
      * The chosen files will be checked against an array of file types.
      *
      * If at least one file does not fit the file type restriction, the upload is prevented. **Note:** This
      * property is not supported by Microsoft Edge.
      *
      * Example: `["jpg", "png", "bmp"]`.
      *
      * @returns Value of property `fileType`
      */
    def getFileType(): js.Array[String] = js.native
    
    /**
      * Gets content of aggregation {@link #getHeaderParameters headerParameters}.
      *
      * The header parameters for the `FileUploader` which are only submitted with XHR requests. Header parameters
      * are not supported by Internet Explorer 9.
      */
    def getHeaderParameters(): js.Array[typings.openui5.sapUiUnifiedFileUploaderParameterMod.default] = js.native
    
    /**
      * @SINCE 1.81.0
      *
      * Gets current value of property {@link #getHttpRequestMethod httpRequestMethod}.
      *
      * Chosen HTTP request method for file upload.
      *
      * Default value is `Post`.
      *
      * @returns Value of property `httpRequestMethod`
      */
    def getHttpRequestMethod(): FileUploaderHttpRequestMethod = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Gets current value of property {@link #getIcon icon}.
      *
      * Icon to be displayed as graphical element within the button.
      *
      * This can be a URI to an image or an icon font URI.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Gets current value of property {@link #getIconFirst iconFirst}.
      *
      * If set to true (default), the display sequence is 1. icon 2. control text.
      *
      * Default value is `true`.
      *
      * @returns Value of property `iconFirst`
      */
    def getIconFirst(): Boolean = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Gets current value of property {@link #getIconHovered iconHovered}.
      *
      * Icon to be displayed as graphical element within the button when it is hovered (only if also a base icon
      * was specified).
      *
      * If not specified, the base icon is used. If an icon font icon is used, this property is ignored.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `iconHovered`
      */
    def getIconHovered(): URI = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Gets current value of property {@link #getIconOnly iconOnly}.
      *
      * If set to true, the button is displayed without any text.
      *
      * Default value is `false`.
      *
      * @returns Value of property `iconOnly`
      */
    def getIconOnly(): Boolean = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Gets current value of property {@link #getIconSelected iconSelected}.
      *
      * Icon to be displayed as graphical element within the button when it is selected (only if also a base
      * icon was specified).
      *
      * If not specified, the base or hovered icon is used. If an icon font icon is used, this property is ignored.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `iconSelected`
      */
    def getIconSelected(): URI = js.native
    
    /**
      * Gets current value of property {@link #getMaximumFileSize maximumFileSize}.
      *
      * A file size limit in megabytes which prevents the upload if at least one file exceeds it.
      *
      * This property is not supported by Internet Explorer 9.
      *
      * @returns Value of property `maximumFileSize`
      */
    def getMaximumFileSize(): float = js.native
    
    /**
      * @SINCE 1.24.0
      *
      * Gets current value of property {@link #getMaximumFilenameLength maximumFilenameLength}.
      *
      * The maximum length of a filename which the `FileUploader` will accept.
      *
      * If the maximum filename length is exceeded, the corresponding event `filenameLengthExceed` is fired.
      *
      * @returns Value of property `maximumFilenameLength`
      */
    def getMaximumFilenameLength(): int = js.native
    
    /**
      * Gets current value of property {@link #getMimeType mimeType}.
      *
      * The chosen files will be checked against an array of MIME types defined in this property.
      *
      * If at least one file does not fit the MIME type restriction, the upload is prevented.
      *
      * **Note:** This property is not supported by Internet Explorer. It is only reliable for common file types
      * like images, audio, video, plain text and HTML documents. File types that are not recognized by the browser
      * result in `file.type` to be returned as an empty string. In this case the verification could not be performed.
      * The file upload is not prevented and the validation based on file type is left to the receiving backend
      * side.
      *
      * Example: `["image/png", "image/jpeg"]`.
      *
      * @returns Value of property `mimeType`
      */
    def getMimeType(): js.Array[String] = js.native
    
    /**
      * Gets current value of property {@link #getMultiple multiple}.
      *
      * Allows multiple files to be chosen and uploaded from the same folder.
      *
      * This property is not supported by Internet Explorer 9.
      *
      * **Note:** Keep in mind that the various operating systems for mobile devices can react differently to
      * the property so that fewer upload functions may be available in some cases.
      *
      * Default value is `false`.
      *
      * @returns Value of property `multiple`
      */
    def getMultiple(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getName name}.
      *
      * Unique control name for identification on the server side after sending data to the server.
      *
      * @returns Value of property `name`
      */
    def getName(): String = js.native
    
    /**
      * @SINCE 1.12.2
      *
      * Gets content of aggregation {@link #getParameters parameters}.
      *
      * The parameters for the `FileUploader` which are rendered as a hidden input field.
      */
    def getParameters(): js.Array[typings.openui5.sapUiUnifiedFileUploaderParameterMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getPlaceholder placeholder}.
      *
      * Placeholder for the text field.
      *
      * @returns Value of property `placeholder`
      */
    def getPlaceholder(): String = js.native
    
    /**
      * Gets current value of property {@link #getSameFilenameAllowed sameFilenameAllowed}.
      *
      * If the FileUploader is configured to upload the file directly after the file is selected, it is not allowed
      * to upload a file with the same name again. If a user should be allowed to upload a file with the same
      * name again this parameter has to be "true".
      *
      * A typical use case would be if the files have different paths.
      *
      * Default value is `false`.
      *
      * @returns Value of property `sameFilenameAllowed`
      */
    def getSameFilenameAllowed(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSendXHR sendXHR}.
      *
      * If set to "true", the request will be sent as XHR request instead of a form submit.
      *
      * This property is not supported by Internet Explorer 9.
      *
      * Default value is `false`.
      *
      * @returns Value of property `sendXHR`
      */
    def getSendXHR(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getStyle style}.
      *
      * Style of the button.
      *
      * Values "Transparent, "Accept", "Reject", or "Emphasized" are allowed.
      *
      * @returns Value of property `style`
      */
    def getStyle(): String = js.native
    
    /**
      * Gets current value of property {@link #getUploadOnChange uploadOnChange}.
      *
      * If set to "true", the upload immediately starts after file selection. With the default setting, the upload
      * needs to be explicitly triggered.
      *
      * Default value is `false`.
      *
      * @returns Value of property `uploadOnChange`
      */
    def getUploadOnChange(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getUploadUrl uploadUrl}.
      *
      * Used when URL address is on a remote server.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `uploadUrl`
      */
    def getUploadUrl(): URI = js.native
    
    /**
      * Gets current value of property {@link #getUseMultipart useMultipart}.
      *
      * If set to "false", the request will be sent as file only request instead of a multipart/form-data request.
      *
      * Only one file could be uploaded using this type of request. Required for sending such a request is to
      * set the property `sendXHR` to "true". This property is not supported by Internet Explorer 9.
      *
      * Default value is `true`.
      *
      * @returns Value of property `useMultipart`
      */
    def getUseMultipart(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * Value of the path for file upload.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `value`
      */
    def getValue(): String = js.native
    
    /**
      * @SINCE 1.24.0
      *
      * Gets current value of property {@link #getValueState valueState}.
      *
      * Visualizes warnings or errors related to the text field.
      *
      * Possible values: Warning, Error, Success, None.
      *
      * Default value is `None`.
      *
      * @returns Value of property `valueState`
      */
    def getValueState(): ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) = js.native
    
    /**
      * @SINCE 1.52
      *
      * Gets current value of property {@link #getValueStateText valueStateText}.
      *
      * Custom text for the value state message pop-up.
      *
      * **Note:** If not specified, a default text, based on the value state type, will be used instead.
      *
      * @returns Value of property `valueStateText`
      */
    def getValueStateText(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Specifies the displayed control width.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * @SINCE 1.52
      *
      * Gets content of aggregation {@link #getXhrSettings xhrSettings}.
      *
      * Settings for the `XMLHttpRequest` object. **Note:** This aggregation is only used when the `sendXHR`
      * property is set to `true`.
      */
    def getXhrSettings(): typings.openui5.sapUiUnifiedFileUploaderXHRSettingsMod.default = js.native
    
    /**
      * Checks for the provided `sap.ui.unified.FileUploaderParameter` in the aggregation {@link #getHeaderParameters
      * headerParameters}. and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfHeaderParameter(
      /**
      * The headerParameter whose index is looked for
      */
    oHeaderParameter: typings.openui5.sapUiUnifiedFileUploaderParameterMod.default
    ): int = js.native
    
    /**
      * @SINCE 1.12.2
      *
      * Checks for the provided `sap.ui.unified.FileUploaderParameter` in the aggregation {@link #getParameters
      * parameters}. and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfParameter(
      /**
      * The parameter whose index is looked for
      */
    oParameter: typings.openui5.sapUiUnifiedFileUploaderParameterMod.default
    ): int = js.native
    
    /**
      * Inserts a headerParameter into the aggregation {@link #getHeaderParameters headerParameters}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertHeaderParameter(
      /**
      * The headerParameter to insert; if empty, nothing is inserted
      */
    oHeaderParameter: typings.openui5.sapUiUnifiedFileUploaderParameterMod.default,
      /**
      * The `0`-based index the headerParameter should be inserted at; for a negative value of `iIndex`, the
      * headerParameter is inserted at position 0; for a value greater than the current size of the aggregation,
      * the headerParameter is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.12.2
      *
      * Inserts a parameter into the aggregation {@link #getParameters parameters}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertParameter(
      /**
      * The parameter to insert; if empty, nothing is inserted
      */
    oParameter: typings.openui5.sapUiUnifiedFileUploaderParameterMod.default,
      /**
      * The `0`-based index the parameter should be inserted at; for a negative value of `iIndex`, the parameter
      * is inserted at position 0; for a value greater than the current size of the aggregation, the parameter
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getHeaderParameters headerParameters}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllHeaderParameters(): js.Array[typings.openui5.sapUiUnifiedFileUploaderParameterMod.default] = js.native
    
    /**
      * @SINCE 1.12.2
      *
      * Removes all the controls from the aggregation {@link #getParameters parameters}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllParameters(): js.Array[typings.openui5.sapUiUnifiedFileUploaderParameterMod.default] = js.native
    
    /**
      * Removes an ariaDescribedBy from the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns The removed ariaDescribedBy or `null`
      */
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: int): ID | Null = js.native
    def removeAriaDescribedBy(
      /**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: ID): ID | Null = js.native
    
    /**
      * Removes an ariaLabelledBy from the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns The removed ariaLabelledBy or `null`
      */
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: int): ID | Null = js.native
    def removeAriaLabelledBy(
      /**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: ID): ID | Null = js.native
    
    def removeHeaderParameter(/**
      * The headerParameter to remove or its index or id
      */
    vHeaderParameter: String): typings.openui5.sapUiUnifiedFileUploaderParameterMod.default | Null = js.native
    /**
      * Removes a headerParameter from the aggregation {@link #getHeaderParameters headerParameters}.
      *
      * @returns The removed headerParameter or `null`
      */
    def removeHeaderParameter(/**
      * The headerParameter to remove or its index or id
      */
    vHeaderParameter: int): typings.openui5.sapUiUnifiedFileUploaderParameterMod.default | Null = js.native
    def removeHeaderParameter(
      /**
      * The headerParameter to remove or its index or id
      */
    vHeaderParameter: typings.openui5.sapUiUnifiedFileUploaderParameterMod.default
    ): typings.openui5.sapUiUnifiedFileUploaderParameterMod.default | Null = js.native
    
    def removeParameter(/**
      * The parameter to remove or its index or id
      */
    vParameter: String): typings.openui5.sapUiUnifiedFileUploaderParameterMod.default | Null = js.native
    /**
      * @SINCE 1.12.2
      *
      * Removes a parameter from the aggregation {@link #getParameters parameters}.
      *
      * @returns The removed parameter or `null`
      */
    def removeParameter(/**
      * The parameter to remove or its index or id
      */
    vParameter: int): typings.openui5.sapUiUnifiedFileUploaderParameterMod.default | Null = js.native
    def removeParameter(
      /**
      * The parameter to remove or its index or id
      */
    vParameter: typings.openui5.sapUiUnifiedFileUploaderParameterMod.default
    ): typings.openui5.sapUiUnifiedFileUploaderParameterMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getAdditionalData additionalData}.
      *
      * Additional data that is sent to the back end service.
      *
      * Data will be transmitted as value of a hidden input where the name is derived from the `name` property
      * with suffix "-data".
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAdditionalData(): this.type = js.native
    def setAdditionalData(/**
      * New value for property `additionalData`
      */
    sAdditionalData: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getButtonOnly buttonOnly}.
      *
      * If set to "true", the `FileUploader` will be rendered as Button only, without showing the input field.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setButtonOnly(): this.type = js.native
    def setButtonOnly(/**
      * New value for property `buttonOnly`
      */
    bButtonOnly: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getButtonText buttonText}.
      *
      * The button's text can be overwritten using this property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setButtonText(): this.type = js.native
    def setButtonText(/**
      * New value for property `buttonText`
      */
    sButtonText: String): this.type = js.native
    
    /**
      * @SINCE 1.105.0
      *
      * Sets a new value for property {@link #getDirectory directory}.
      *
      * Allows users to upload all files from a given directory and its corresponding subdirectories.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDirectory(): this.type = js.native
    def setDirectory(/**
      * New value for property `directory`
      */
    bDirectory: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Disabled controls have different colors, depending on customer settings.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnabled(): this.type = js.native
    def setEnabled(/**
      * New value for property `enabled`
      */
    bEnabled: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFileType fileType}.
      *
      * The chosen files will be checked against an array of file types.
      *
      * If at least one file does not fit the file type restriction, the upload is prevented. **Note:** This
      * property is not supported by Microsoft Edge.
      *
      * Example: `["jpg", "png", "bmp"]`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFileType(): this.type = js.native
    def setFileType(/**
      * New value for property `fileType`
      */
    sFileType: js.Array[String]): this.type = js.native
    
    /**
      * @SINCE 1.81.0
      *
      * Sets a new value for property {@link #getHttpRequestMethod httpRequestMethod}.
      *
      * Chosen HTTP request method for file upload.
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
    sHttpRequestMethod: FileUploaderHttpRequestMethod
    ): this.type = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Icon to be displayed as graphical element within the button.
      *
      * This can be a URI to an image or an icon font URI.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: URI): this.type = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Sets a new value for property {@link #getIconFirst iconFirst}.
      *
      * If set to true (default), the display sequence is 1. icon 2. control text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconFirst(): this.type = js.native
    def setIconFirst(/**
      * New value for property `iconFirst`
      */
    bIconFirst: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Sets a new value for property {@link #getIconHovered iconHovered}.
      *
      * Icon to be displayed as graphical element within the button when it is hovered (only if also a base icon
      * was specified).
      *
      * If not specified, the base icon is used. If an icon font icon is used, this property is ignored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconHovered(): this.type = js.native
    def setIconHovered(/**
      * New value for property `iconHovered`
      */
    sIconHovered: URI): this.type = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Sets a new value for property {@link #getIconOnly iconOnly}.
      *
      * If set to true, the button is displayed without any text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconOnly(): this.type = js.native
    def setIconOnly(/**
      * New value for property `iconOnly`
      */
    bIconOnly: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Sets a new value for property {@link #getIconSelected iconSelected}.
      *
      * Icon to be displayed as graphical element within the button when it is selected (only if also a base
      * icon was specified).
      *
      * If not specified, the base or hovered icon is used. If an icon font icon is used, this property is ignored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconSelected(): this.type = js.native
    def setIconSelected(/**
      * New value for property `iconSelected`
      */
    sIconSelected: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaximumFileSize maximumFileSize}.
      *
      * A file size limit in megabytes which prevents the upload if at least one file exceeds it.
      *
      * This property is not supported by Internet Explorer 9.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaximumFileSize(): this.type = js.native
    def setMaximumFileSize(/**
      * New value for property `maximumFileSize`
      */
    fMaximumFileSize: float): this.type = js.native
    
    /**
      * @SINCE 1.24.0
      *
      * Sets a new value for property {@link #getMaximumFilenameLength maximumFilenameLength}.
      *
      * The maximum length of a filename which the `FileUploader` will accept.
      *
      * If the maximum filename length is exceeded, the corresponding event `filenameLengthExceed` is fired.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaximumFilenameLength(): this.type = js.native
    def setMaximumFilenameLength(/**
      * New value for property `maximumFilenameLength`
      */
    iMaximumFilenameLength: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMimeType mimeType}.
      *
      * The chosen files will be checked against an array of MIME types defined in this property.
      *
      * If at least one file does not fit the MIME type restriction, the upload is prevented.
      *
      * **Note:** This property is not supported by Internet Explorer. It is only reliable for common file types
      * like images, audio, video, plain text and HTML documents. File types that are not recognized by the browser
      * result in `file.type` to be returned as an empty string. In this case the verification could not be performed.
      * The file upload is not prevented and the validation based on file type is left to the receiving backend
      * side.
      *
      * Example: `["image/png", "image/jpeg"]`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMimeType(): this.type = js.native
    def setMimeType(/**
      * New value for property `mimeType`
      */
    sMimeType: js.Array[String]): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMultiple multiple}.
      *
      * Allows multiple files to be chosen and uploaded from the same folder.
      *
      * This property is not supported by Internet Explorer 9.
      *
      * **Note:** Keep in mind that the various operating systems for mobile devices can react differently to
      * the property so that fewer upload functions may be available in some cases.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMultiple(): this.type = js.native
    def setMultiple(/**
      * New value for property `multiple`
      */
    bMultiple: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getName name}.
      *
      * Unique control name for identification on the server side after sending data to the server.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setName(): this.type = js.native
    def setName(/**
      * New value for property `name`
      */
    sName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPlaceholder placeholder}.
      *
      * Placeholder for the text field.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPlaceholder(): this.type = js.native
    def setPlaceholder(/**
      * New value for property `placeholder`
      */
    sPlaceholder: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSameFilenameAllowed sameFilenameAllowed}.
      *
      * If the FileUploader is configured to upload the file directly after the file is selected, it is not allowed
      * to upload a file with the same name again. If a user should be allowed to upload a file with the same
      * name again this parameter has to be "true".
      *
      * A typical use case would be if the files have different paths.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSameFilenameAllowed(): this.type = js.native
    def setSameFilenameAllowed(/**
      * New value for property `sameFilenameAllowed`
      */
    bSameFilenameAllowed: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSendXHR sendXHR}.
      *
      * If set to "true", the request will be sent as XHR request instead of a form submit.
      *
      * This property is not supported by Internet Explorer 9.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSendXHR(): this.type = js.native
    def setSendXHR(/**
      * New value for property `sendXHR`
      */
    bSendXHR: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getStyle style}.
      *
      * Style of the button.
      *
      * Values "Transparent, "Accept", "Reject", or "Emphasized" are allowed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStyle(): this.type = js.native
    def setStyle(/**
      * New value for property `style`
      */
    sStyle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUploadOnChange uploadOnChange}.
      *
      * If set to "true", the upload immediately starts after file selection. With the default setting, the upload
      * needs to be explicitly triggered.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUploadOnChange(): this.type = js.native
    def setUploadOnChange(/**
      * New value for property `uploadOnChange`
      */
    bUploadOnChange: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUploadUrl uploadUrl}.
      *
      * Used when URL address is on a remote server.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUploadUrl(): this.type = js.native
    def setUploadUrl(/**
      * New value for property `uploadUrl`
      */
    sUploadUrl: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUseMultipart useMultipart}.
      *
      * If set to "false", the request will be sent as file only request instead of a multipart/form-data request.
      *
      * Only one file could be uploaded using this type of request. Required for sending such a request is to
      * set the property `sendXHR` to "true". This property is not supported by Internet Explorer 9.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUseMultipart(): this.type = js.native
    def setUseMultipart(/**
      * New value for property `useMultipart`
      */
    bUseMultipart: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValue value}.
      *
      * Value of the path for file upload.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue(): this.type = js.native
    def setValue(/**
      * New value for property `value`
      */
    sValue: String): this.type = js.native
    
    /**
      * @SINCE 1.24.0
      *
      * Sets a new value for property {@link #getValueState valueState}.
      *
      * Visualizes warnings or errors related to the text field.
      *
      * Possible values: Warning, Error, Success, None.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueState(): this.type = js.native
    def setValueState(
      /**
      * New value for property `valueState`
      */
    sValueState: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String
    ): this.type = js.native
    def setValueState(/**
      * New value for property `valueState`
      */
    sValueState: ValueState): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Sets a new value for property {@link #getValueStateText valueStateText}.
      *
      * Custom text for the value state message pop-up.
      *
      * **Note:** If not specified, a default text, based on the value state type, will be used instead.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueStateText(): this.type = js.native
    def setValueStateText(/**
      * New value for property `valueStateText`
      */
    sValueStateText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Specifies the displayed control width.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Sets the aggregated {@link #getXhrSettings xhrSettings}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setXhrSettings(
      /**
      * The xhrSettings to set
      */
    oXhrSettings: typings.openui5.sapUiUnifiedFileUploaderXHRSettingsMod.default
    ): this.type = js.native
    
    /**
      * Starts the upload (as defined by uploadUrl).
      */
    def upload(): Unit = js.native
    def upload(
      /**
      * Set to `true` to allow pre-processing of the files before sending the request. As a result, the `upload`
      * method becomes asynchronous. See {@link sap.ui.unified.IProcessableBlobs} for more information. **Note:**
      * This parameter is only taken into account when `sendXHR` is set to `true`.
      */
    bPreProcessFiles: Boolean
    ): Unit = js.native
  }
  
  trait FileUploaderSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Additional data that is sent to the back end service.
      *
      * Data will be transmitted as value of a hidden input where the name is derived from the `name` property
      * with suffix "-data".
      */
    var additionalData: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.102.0
      *
      * Fired after select file dialog closes.
      */
    var afterDialogClose: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Association to controls / IDs which describe this control (see WAI-ARIA attribute `aria-describedby`).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Association to controls / IDs which label this control (see WAI-ARIA attribute `aria-labelledby`).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.102.0
      *
      * Fired before select file dialog opens.
      */
    var beforeDialogOpen: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * If set to "true", the `FileUploader` will be rendered as Button only, without showing the input field.
      */
    var buttonOnly: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The button's text can be overwritten using this property.
      */
    var buttonText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Event is fired when the value of the file path has been changed.
      *
      * **Note:** Keep in mind that because of the HTML input element of type file, the event is also fired in
      * Chrome browser when the Cancel button of the uploads window is pressed.
      */
    var change: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.105.0
      *
      * Allows users to upload all files from a given directory and its corresponding subdirectories.
      */
    var directory: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Disabled controls have different colors, depending on customer settings.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event is fired when the file is allowed for upload on client side.
      */
    var fileAllowed: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Event is fired when the size of the file is 0
      */
    var fileEmpty: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Event is fired when the size of a file is above the `maximumFileSize` property. This event is not supported
      * by Internet Explorer 9 (same restriction as for the property `maximumFileSize`).
      */
    var fileSizeExceed: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The chosen files will be checked against an array of file types.
      *
      * If at least one file does not fit the file type restriction, the upload is prevented. **Note:** This
      * property is not supported by Microsoft Edge.
      *
      * Example: `["jpg", "png", "bmp"]`.
      */
    var fileType: js.UndefOr[
        js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.24.0
      *
      * Event is fired, if the filename of a chosen file is longer than the value specified with the `maximumFilenameLength`
      * property.
      */
    var filenameLengthExceed: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The header parameters for the `FileUploader` which are only submitted with XHR requests. Header parameters
      * are not supported by Internet Explorer 9.
      */
    var headerParameters: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedFileUploaderParameterMod.default] | typings.openui5.sapUiUnifiedFileUploaderParameterMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.81.0
      *
      * Chosen HTTP request method for file upload.
      */
    var httpRequestMethod: js.UndefOr[
        FileUploaderHttpRequestMethod | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.26.0
      *
      * Icon to be displayed as graphical element within the button.
      *
      * This can be a URI to an image or an icon font URI.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.26.0
      *
      * If set to true (default), the display sequence is 1. icon 2. control text.
      */
    var iconFirst: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.26.0
      *
      * Icon to be displayed as graphical element within the button when it is hovered (only if also a base icon
      * was specified).
      *
      * If not specified, the base icon is used. If an icon font icon is used, this property is ignored.
      */
    var iconHovered: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.26.0
      *
      * If set to true, the button is displayed without any text.
      */
    var iconOnly: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.26.0
      *
      * Icon to be displayed as graphical element within the button when it is selected (only if also a base
      * icon was specified).
      *
      * If not specified, the base or hovered icon is used. If an icon font icon is used, this property is ignored.
      */
    var iconSelected: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * A file size limit in megabytes which prevents the upload if at least one file exceeds it.
      *
      * This property is not supported by Internet Explorer 9.
      */
    var maximumFileSize: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.24.0
      *
      * The maximum length of a filename which the `FileUploader` will accept.
      *
      * If the maximum filename length is exceeded, the corresponding event `filenameLengthExceed` is fired.
      */
    var maximumFilenameLength: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The chosen files will be checked against an array of MIME types defined in this property.
      *
      * If at least one file does not fit the MIME type restriction, the upload is prevented.
      *
      * **Note:** This property is not supported by Internet Explorer. It is only reliable for common file types
      * like images, audio, video, plain text and HTML documents. File types that are not recognized by the browser
      * result in `file.type` to be returned as an empty string. In this case the verification could not be performed.
      * The file upload is not prevented and the validation based on file type is left to the receiving backend
      * side.
      *
      * Example: `["image/png", "image/jpeg"]`.
      */
    var mimeType: js.UndefOr[
        js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Allows multiple files to be chosen and uploaded from the same folder.
      *
      * This property is not supported by Internet Explorer 9.
      *
      * **Note:** Keep in mind that the various operating systems for mobile devices can react differently to
      * the property so that fewer upload functions may be available in some cases.
      */
    var multiple: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Unique control name for identification on the server side after sending data to the server.
      */
    var name: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.12.2
      *
      * The parameters for the `FileUploader` which are rendered as a hidden input field.
      */
    var parameters: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedFileUploaderParameterMod.default] | typings.openui5.sapUiUnifiedFileUploaderParameterMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Placeholder for the text field.
      */
    var placeholder: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * If the FileUploader is configured to upload the file directly after the file is selected, it is not allowed
      * to upload a file with the same name again. If a user should be allowed to upload a file with the same
      * name again this parameter has to be "true".
      *
      * A typical use case would be if the files have different paths.
      */
    var sameFilenameAllowed: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If set to "true", the request will be sent as XHR request instead of a form submit.
      *
      * This property is not supported by Internet Explorer 9.
      */
    var sendXHR: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Style of the button.
      *
      * Values "Transparent, "Accept", "Reject", or "Emphasized" are allowed.
      */
    var style: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Event is fired when the type of a file does not match the `mimeType` or `fileType` property.
      */
    var typeMissmatch: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.24.0
      *
      * Event is fired after the current upload has been aborted.
      *
      * This event is only supported with property `sendXHR` set to true, i.e. the event is not supported in
      * Internet Explorer 9.
      */
    var uploadAborted: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Event is fired as soon as the upload request is completed (either successful or unsuccessful).
      *
      * To see if the upload request was successful, check the `status` parameter for a value 2xx. The actual
      * progress of the upload can be monitored by listening to the `uploadProgress` event. However, this covers
      * only the client side of the upload process and does not give any success status from the server.
      */
    var uploadComplete: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * If set to "true", the upload immediately starts after file selection. With the default setting, the upload
      * needs to be explicitly triggered.
      */
    var uploadOnChange: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.24.0
      *
      * Event is fired after the upload has started and before the upload is completed.
      *
      * It contains progress information related to the running upload. Depending on file size, band width and
      * used browser the event is fired once or multiple times.
      *
      * This event is only supported with property `sendXHR` set to true, i.e. the event is not supported in
      * Internet Explorer 9.
      */
    var uploadProgress: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.30.0
      *
      * Event is fired before an upload is started.
      */
    var uploadStart: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Used when URL address is on a remote server.
      */
    var uploadUrl: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * If set to "false", the request will be sent as file only request instead of a multipart/form-data request.
      *
      * Only one file could be uploaded using this type of request. Required for sending such a request is to
      * set the property `sendXHR` to "true". This property is not supported by Internet Explorer 9.
      */
    var useMultipart: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Value of the path for file upload.
      */
    var value: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.24.0
      *
      * Visualizes warnings or errors related to the text field.
      *
      * Possible values: Warning, Error, Success, None.
      */
    var valueState: js.UndefOr[
        ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.52
      *
      * Custom text for the value state message pop-up.
      *
      * **Note:** If not specified, a default text, based on the value state type, will be used instead.
      */
    var valueStateText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies the displayed control width.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.52
      *
      * Settings for the `XMLHttpRequest` object. **Note:** This aggregation is only used when the `sendXHR`
      * property is set to `true`.
      */
    var xhrSettings: js.UndefOr[typings.openui5.sapUiUnifiedFileUploaderXHRSettingsMod.default] = js.undefined
  }
  object FileUploaderSettings {
    
    inline def apply(): FileUploaderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileUploaderSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileUploaderSettings] (val x: Self) extends AnyVal {
      
      inline def setAdditionalData(value: String | PropertyBindingInfo): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
      
      inline def setAdditionalDataUndefined: Self = StObject.set(x, "additionalData", js.undefined)
      
      inline def setAfterDialogClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterDialogClose", js.Any.fromFunction1(value))
      
      inline def setAfterDialogCloseUndefined: Self = StObject.set(x, "afterDialogClose", js.undefined)
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setBeforeDialogOpen(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeDialogOpen", js.Any.fromFunction1(value))
      
      inline def setBeforeDialogOpenUndefined: Self = StObject.set(x, "beforeDialogOpen", js.undefined)
      
      inline def setButtonOnly(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "buttonOnly", value.asInstanceOf[js.Any])
      
      inline def setButtonOnlyUndefined: Self = StObject.set(x, "buttonOnly", js.undefined)
      
      inline def setButtonText(value: String | PropertyBindingInfo): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setDirectory(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFileAllowed(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "fileAllowed", js.Any.fromFunction1(value))
      
      inline def setFileAllowedUndefined: Self = StObject.set(x, "fileAllowed", js.undefined)
      
      inline def setFileEmpty(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "fileEmpty", js.Any.fromFunction1(value))
      
      inline def setFileEmptyUndefined: Self = StObject.set(x, "fileEmpty", js.undefined)
      
      inline def setFileSizeExceed(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "fileSizeExceed", js.Any.fromFunction1(value))
      
      inline def setFileSizeExceedUndefined: Self = StObject.set(x, "fileSizeExceed", js.undefined)
      
      inline def setFileType(
        value: js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
      
      inline def setFileTypeVarargs(value: String*): Self = StObject.set(x, "fileType", js.Array(value*))
      
      inline def setFilenameLengthExceed(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "filenameLengthExceed", js.Any.fromFunction1(value))
      
      inline def setFilenameLengthExceedUndefined: Self = StObject.set(x, "filenameLengthExceed", js.undefined)
      
      inline def setHeaderParameters(
        value: js.Array[typings.openui5.sapUiUnifiedFileUploaderParameterMod.default] | typings.openui5.sapUiUnifiedFileUploaderParameterMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "headerParameters", value.asInstanceOf[js.Any])
      
      inline def setHeaderParametersUndefined: Self = StObject.set(x, "headerParameters", js.undefined)
      
      inline def setHeaderParametersVarargs(value: typings.openui5.sapUiUnifiedFileUploaderParameterMod.default*): Self = StObject.set(x, "headerParameters", js.Array(value*))
      
      inline def setHttpRequestMethod(
        value: FileUploaderHttpRequestMethod | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "httpRequestMethod", value.asInstanceOf[js.Any])
      
      inline def setHttpRequestMethodUndefined: Self = StObject.set(x, "httpRequestMethod", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFirst(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconFirst", value.asInstanceOf[js.Any])
      
      inline def setIconFirstUndefined: Self = StObject.set(x, "iconFirst", js.undefined)
      
      inline def setIconHovered(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconHovered", value.asInstanceOf[js.Any])
      
      inline def setIconHoveredUndefined: Self = StObject.set(x, "iconHovered", js.undefined)
      
      inline def setIconOnly(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconOnly", value.asInstanceOf[js.Any])
      
      inline def setIconOnlyUndefined: Self = StObject.set(x, "iconOnly", js.undefined)
      
      inline def setIconSelected(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconSelected", value.asInstanceOf[js.Any])
      
      inline def setIconSelectedUndefined: Self = StObject.set(x, "iconSelected", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMaximumFileSize(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maximumFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaximumFileSizeUndefined: Self = StObject.set(x, "maximumFileSize", js.undefined)
      
      inline def setMaximumFilenameLength(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maximumFilenameLength", value.asInstanceOf[js.Any])
      
      inline def setMaximumFilenameLengthUndefined: Self = StObject.set(x, "maximumFilenameLength", js.undefined)
      
      inline def setMimeType(
        value: js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setMimeTypeVarargs(value: String*): Self = StObject.set(x, "mimeType", js.Array(value*))
      
      inline def setMultiple(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setName(value: String | PropertyBindingInfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParameters(
        value: js.Array[typings.openui5.sapUiUnifiedFileUploaderParameterMod.default] | typings.openui5.sapUiUnifiedFileUploaderParameterMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(value: typings.openui5.sapUiUnifiedFileUploaderParameterMod.default*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setPlaceholder(value: String | PropertyBindingInfo): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setSameFilenameAllowed(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sameFilenameAllowed", value.asInstanceOf[js.Any])
      
      inline def setSameFilenameAllowedUndefined: Self = StObject.set(x, "sameFilenameAllowed", js.undefined)
      
      inline def setSendXHR(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sendXHR", value.asInstanceOf[js.Any])
      
      inline def setSendXHRUndefined: Self = StObject.set(x, "sendXHR", js.undefined)
      
      inline def setStyle(value: String | PropertyBindingInfo): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTypeMissmatch(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "typeMissmatch", js.Any.fromFunction1(value))
      
      inline def setTypeMissmatchUndefined: Self = StObject.set(x, "typeMissmatch", js.undefined)
      
      inline def setUploadAborted(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "uploadAborted", js.Any.fromFunction1(value))
      
      inline def setUploadAbortedUndefined: Self = StObject.set(x, "uploadAborted", js.undefined)
      
      inline def setUploadComplete(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "uploadComplete", js.Any.fromFunction1(value))
      
      inline def setUploadCompleteUndefined: Self = StObject.set(x, "uploadComplete", js.undefined)
      
      inline def setUploadOnChange(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "uploadOnChange", value.asInstanceOf[js.Any])
      
      inline def setUploadOnChangeUndefined: Self = StObject.set(x, "uploadOnChange", js.undefined)
      
      inline def setUploadProgress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "uploadProgress", js.Any.fromFunction1(value))
      
      inline def setUploadProgressUndefined: Self = StObject.set(x, "uploadProgress", js.undefined)
      
      inline def setUploadStart(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "uploadStart", js.Any.fromFunction1(value))
      
      inline def setUploadStartUndefined: Self = StObject.set(x, "uploadStart", js.undefined)
      
      inline def setUploadUrl(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
      
      inline def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
      
      inline def setUseMultipart(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "useMultipart", value.asInstanceOf[js.Any])
      
      inline def setUseMultipartUndefined: Self = StObject.set(x, "useMultipart", js.undefined)
      
      inline def setValue(value: String | PropertyBindingInfo): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueState(
        value: ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "valueState", value.asInstanceOf[js.Any])
      
      inline def setValueStateText(value: String | PropertyBindingInfo): Self = StObject.set(x, "valueStateText", value.asInstanceOf[js.Any])
      
      inline def setValueStateTextUndefined: Self = StObject.set(x, "valueStateText", js.undefined)
      
      inline def setValueStateUndefined: Self = StObject.set(x, "valueState", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setXhrSettings(value: typings.openui5.sapUiUnifiedFileUploaderXHRSettingsMod.default): Self = StObject.set(x, "xhrSettings", value.asInstanceOf[js.Any])
      
      inline def setXhrSettingsUndefined: Self = StObject.set(x, "xhrSettings", js.undefined)
    }
  }
}
