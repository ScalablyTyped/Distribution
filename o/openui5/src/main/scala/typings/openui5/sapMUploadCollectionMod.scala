package typings.openui5

import typings.openui5.anon.AddHeaderParameter
import typings.openui5.anon.DocumentId
import typings.openui5.anon.DocumentIdFileName
import typings.openui5.anon.DocumentIdFileSize
import typings.openui5.anon.DocumentIdItem
import typings.openui5.anon.GetHeaderParameter
import typings.openui5.anon.MimeType
import typings.openui5.anon.Response
import typings.openui5.anon.SelectedSelectedItem
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.ListMode
import typings.openui5.sapMLibraryMod.ListSeparators
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMUploadCollectionMod {
  
  @JSImport("sap/m/UploadCollection", JSImport.Default)
  @js.native
  /**
    * Constructor for a new UploadCollection.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends UploadCollection {
    def this(/**
      * initial settings for the new control
      */
    mSettings: UploadCollectionSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: UploadCollectionSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: UploadCollectionSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/UploadCollection", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.UploadCollection with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, UploadCollection]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, UploadCollection],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.UploadCollection.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait UploadCollection
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some headerParameter to the aggregation {@link #getHeaderParameters headerParameters}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addHeaderParameter(
      /**
      * The headerParameter to add; if empty, nothing is inserted
      */
    oHeaderParameter: typings.openui5.sapMUploadCollectionParameterMod.default
    ): this.type = js.native
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapMUploadCollectionItemMod.default
    ): this.type = js.native
    
    /**
      * Adds some parameter to the aggregation {@link #getParameters parameters}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addParameter(
      /**
      * The parameter to add; if empty, nothing is inserted
      */
    oParameter: typings.openui5.sapMUploadCollectionParameterMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeUploadStarts beforeUploadStarts} event
      * of this `sap.m.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollection` itself.
      *
      * The event is triggered before the actual upload starts. An event is fired per file. All the necessary
      * header parameters should be set here.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeUploadStarts(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeUploadStarts(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeUploadStarts beforeUploadStarts} event
      * of this `sap.m.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollection` itself.
      *
      * The event is triggered before the actual upload starts. An event is fired per file. All the necessary
      * header parameters should be set here.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeUploadStarts(
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
    def attachBeforeUploadStarts(
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
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollection` itself.
      *
      * The event is triggered when files are selected in the FileUploader dialog. Applications can set parameters
      * and headerParameters which will be dispatched to the embedded FileUploader control. Restriction: parameters
      * and headerParameters are not supported by Internet Explorer 9.
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
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollection` itself.
      *
      * The event is triggered when files are selected in the FileUploader dialog. Applications can set parameters
      * and headerParameters which will be dispatched to the embedded FileUploader control. Restriction: parameters
      * and headerParameters are not supported by Internet Explorer 9.
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
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:fileDeleted fileDeleted} event of this `sap.m.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollection` itself.
      *
      * The event is triggered when an uploaded attachment is selected and the Delete button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFileDeleted(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachFileDeleted(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:fileDeleted fileDeleted} event of this `sap.m.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollection` itself.
      *
      * The event is triggered when an uploaded attachment is selected and the Delete button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFileDeleted(
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
    def attachFileDeleted(
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
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:fileRenamed fileRenamed} event of this `sap.m.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollection` itself.
      *
      * The event is triggered when the file name is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFileRenamed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachFileRenamed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:fileRenamed fileRenamed} event of this `sap.m.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollection` itself.
      *
      * The event is triggered when the file name is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFileRenamed(
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
    def attachFileRenamed(
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
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:fileSizeExceed fileSizeExceed} event of this
      * `sap.m.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollection` itself.
      *
      * The event is triggered when the file size of an uploaded file is exceeded (only if the maxFileSize property
      * was provided by the application). This event is not supported by Internet Explorer 9.
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
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:fileSizeExceed fileSizeExceed} event of this
      * `sap.m.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollection` itself.
      *
      * The event is triggered when the file size of an uploaded file is exceeded (only if the maxFileSize property
      * was provided by the application). This event is not supported by Internet Explorer 9.
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
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:filenameLengthExceed filenameLengthExceed} event
      * of this `sap.m.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollection` itself.
      *
      * The event is triggered when the name of a chosen file is longer than the value specified with the maximumFilenameLength
      * property (only if provided by the application).
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
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:filenameLengthExceed filenameLengthExceed} event
      * of this `sap.m.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollection` itself.
      *
      * The event is triggered when the name of a chosen file is longer than the value specified with the maximumFilenameLength
      * property (only if provided by the application).
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
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.36.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.m.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollection` itself.
      *
      * Fires when selection is changed via user interaction inside the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.36.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.m.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollection` itself.
      *
      * Fires when selection is changed via user interaction inside the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChange(
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
    def attachSelectionChange(
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
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:typeMissmatch typeMissmatch} event of this `sap.m.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollection` itself.
      *
      * The event is triggered when the file type or the MIME type don't match the permitted types (only if the
      * fileType property or the mimeType property are provided by the application).
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
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:typeMissmatch typeMissmatch} event of this `sap.m.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollection` itself.
      *
      * The event is triggered when the file type or the MIME type don't match the permitted types (only if the
      * fileType property or the mimeType property are provided by the application).
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
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:uploadComplete uploadComplete} event of this
      * `sap.m.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollection` itself.
      *
      * The event is triggered as soon as the upload request is completed.
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
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:uploadComplete uploadComplete} event of this
      * `sap.m.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollection` itself.
      *
      * The event is triggered as soon as the upload request is completed.
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
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:uploadTerminated uploadTerminated} event of
      * this `sap.m.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollection` itself.
      *
      * The event is triggered as soon as the upload request was terminated by the user.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUploadTerminated(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachUploadTerminated(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:uploadTerminated uploadTerminated} event of
      * this `sap.m.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.UploadCollection` itself.
      *
      * The event is triggered as soon as the upload request was terminated by the user.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUploadTerminated(
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
    def attachUploadTerminated(
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
      * Context object to call the event handler with. Defaults to this `sap.m.UploadCollection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getItems items} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindItems(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Destroys all the headerParameters in the aggregation {@link #getHeaderParameters headerParameters}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeaderParameters(): this.type = js.native
    
    /**
      * @SINCE 1.44.0
      *
      * Destroys the infoToolbar in the aggregation {@link #getInfoToolbar infoToolbar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyInfoToolbar(): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Destroys all the parameters in the aggregation {@link #getParameters parameters}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyParameters(): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Destroys the toolbar in the aggregation {@link #getToolbar toolbar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyToolbar(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:beforeUploadStarts beforeUploadStarts} event
      * of this `sap.m.UploadCollection`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeUploadStarts(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBeforeUploadStarts(
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
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.m.UploadCollection`.
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
      * Detaches event handler `fnFunction` from the {@link #event:fileDeleted fileDeleted} event of this `sap.m.UploadCollection`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFileDeleted(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachFileDeleted(
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
      * Detaches event handler `fnFunction` from the {@link #event:fileRenamed fileRenamed} event of this `sap.m.UploadCollection`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFileRenamed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachFileRenamed(
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
      * `sap.m.UploadCollection`.
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
      * Detaches event handler `fnFunction` from the {@link #event:filenameLengthExceed filenameLengthExceed}
      * event of this `sap.m.UploadCollection`.
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
      * @SINCE 1.36.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:selectionChange selectionChange} event of
      * this `sap.m.UploadCollection`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelectionChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSelectionChange(
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
      * `sap.m.UploadCollection`.
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
      * Detaches event handler `fnFunction` from the {@link #event:uploadComplete uploadComplete} event of this
      * `sap.m.UploadCollection`.
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
      * Detaches event handler `fnFunction` from the {@link #event:uploadTerminated uploadTerminated} event of
      * this `sap.m.UploadCollection`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachUploadTerminated(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachUploadTerminated(
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
      * @SINCE 1.36.0
      *
      * Downloads the given item. This function delegates to {@link sap.m.UploadCollectionItem#download uploadCollectionItem.download}.
      *
      * @returns True if the download has started successfully. False if the download couldn't be started.
      */
    def downloadItem(
      /**
      * The item to download. This parameter is mandatory.
      */
    uploadCollectionItem: typings.openui5.sapMUploadCollectionItemMod.default,
      /**
      * Decides whether to ask for a location to download or not.
      */
    askForLocation: Boolean
    ): Boolean = js.native
    
    /**
      * Fires event {@link #event:beforeUploadStarts beforeUploadStarts} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforeUploadStarts(): this.type = js.native
    def fireBeforeUploadStarts(/**
      * Parameters to pass along with the event
      */
    mParameters: AddHeaderParameter): this.type = js.native
    
    /**
      * Fires event {@link #event:change change} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireChange(): this.type = js.native
    def fireChange(/**
      * Parameters to pass along with the event
      */
    mParameters: DocumentId): this.type = js.native
    
    /**
      * Fires event {@link #event:fileDeleted fileDeleted} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFileDeleted(): this.type = js.native
    def fireFileDeleted(/**
      * Parameters to pass along with the event
      */
    mParameters: DocumentIdItem): this.type = js.native
    
    /**
      * Fires event {@link #event:fileRenamed fileRenamed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFileRenamed(): this.type = js.native
    def fireFileRenamed(/**
      * Parameters to pass along with the event
      */
    mParameters: DocumentIdFileName): this.type = js.native
    
    /**
      * Fires event {@link #event:fileSizeExceed fileSizeExceed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFileSizeExceed(): this.type = js.native
    def fireFileSizeExceed(/**
      * Parameters to pass along with the event
      */
    mParameters: DocumentIdFileSize): this.type = js.native
    
    /**
      * Fires event {@link #event:filenameLengthExceed filenameLengthExceed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFilenameLengthExceed(): this.type = js.native
    def fireFilenameLengthExceed(/**
      * Parameters to pass along with the event
      */
    mParameters: DocumentId): this.type = js.native
    
    /**
      * @SINCE 1.36.0
      *
      * Fires event {@link #event:selectionChange selectionChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelectionChange(): this.type = js.native
    def fireSelectionChange(/**
      * Parameters to pass along with the event
      */
    mParameters: SelectedSelectedItem): this.type = js.native
    
    /**
      * Fires event {@link #event:typeMissmatch typeMissmatch} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireTypeMissmatch(): this.type = js.native
    def fireTypeMissmatch(/**
      * Parameters to pass along with the event
      */
    mParameters: MimeType): this.type = js.native
    
    /**
      * Fires event {@link #event:uploadComplete uploadComplete} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireUploadComplete(): this.type = js.native
    def fireUploadComplete(/**
      * Parameters to pass along with the event
      */
    mParameters: Response): this.type = js.native
    
    /**
      * Fires event {@link #event:uploadTerminated uploadTerminated} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireUploadTerminated(): this.type = js.native
    def fireUploadTerminated(/**
      * Parameters to pass along with the event
      */
    mParameters: GetHeaderParameter): this.type = js.native
    
    /**
      * Gets current value of property {@link #getFileType fileType}.
      *
      * Defines the allowed file types for the upload. The chosen files will be checked against an array of file
      * types. If at least one file does not fit the file type requirements, the upload is prevented. Example:
      * ["jpg", "png", "bmp"].
      *
      * @returns Value of property `fileType`
      */
    def getFileType(): js.Array[String] = js.native
    
    /**
      * Gets content of aggregation {@link #getHeaderParameters headerParameters}.
      *
      * Specifies the header parameters for the FileUploader that are submitted only with XHR requests. Header
      * parameters are not supported by Internet Explorer 8 and 9.
      */
    def getHeaderParameters(): js.Array[typings.openui5.sapMUploadCollectionParameterMod.default] = js.native
    
    /**
      * @SINCE 1.44.0
      *
      * Gets content of aggregation {@link #getInfoToolbar infoToolbar}.
      *
      * Specifies the info toolbar for filtering information. Sorting information will not displayed.
      */
    def getInfoToolbar(): typings.openui5.sapMToolbarMod.default = js.native
    
    /**
      * @SINCE 1.30.0
      *
      * Gets current value of property {@link #getInstantUpload instantUpload}.
      *
      * If false, no upload is triggered when a file is selected. In addition, if a file was selected, a new
      * FileUploader instance is created to ensure that multiple files can be chosen.
      *
      * Default value is `true`.
      *
      * @returns Value of property `instantUpload`
      */
    def getInstantUpload(): Boolean = js.native
    
    /**
      * @SINCE 1.50.0
      *
      * Provides access to the internally used request headers to allow adding them to the "Access-Control-Allow-Headers"
      * header parameter if needed.
      *
      * @returns An array of request header strings
      */
    def getInternalRequestHeaderNames(): js.Array[String] = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Uploaded items.
      */
    def getItems(): js.Array[typings.openui5.sapMUploadCollectionItemMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getMaximumFileSize maximumFileSize}.
      *
      * Specifies a file size limit in megabytes that prevents the upload if at least one file exceeds the limit.
      * This property is not supported by Internet Explorer 8 and 9.
      *
      * @returns Value of property `maximumFileSize`
      */
    def getMaximumFileSize(): float = js.native
    
    /**
      * Gets current value of property {@link #getMaximumFilenameLength maximumFilenameLength}.
      *
      * Specifies the maximum length of a file name. If the maximum file name length is exceeded, the corresponding
      * event 'filenameLengthExceed' is triggered.
      *
      * @returns Value of property `maximumFilenameLength`
      */
    def getMaximumFilenameLength(): int = js.native
    
    /**
      * Gets current value of property {@link #getMimeType mimeType}.
      *
      * Defines the allowed MIME types of files to be uploaded. The chosen files will be checked against an array
      * of MIME types. If at least one file does not fit the MIME type requirements, the upload is prevented.
      * This property is not supported by Internet Explorer 8 and 9. Example: mimeType ["image/png", "image/jpeg"].
      *
      * @returns Value of property `mimeType`
      */
    def getMimeType(): js.Array[String] = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getMode mode}.
      *
      * Defines the selection mode of the control (e.g. None, SingleSelect, MultiSelect, SingleSelectLeft, SingleSelectMaster).
      * Since the UploadCollection reacts like a list for attachments, the API is close to the ListBase Interface.
      * sap.m.ListMode.Delete mode is not supported and will be automatically set to sap.m.ListMode.None. In
      * addition, if instant upload is set to false the mode sap.m.ListMode.MultiSelect is not supported and
      * will be automatically set to sap.m.ListMode.None.
      *
      * Default value is `"None"`.
      *
      * @returns Value of property `mode`
      */
    def getMode(): ListMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getMultiple multiple}.
      *
      * Lets the user select multiple files from the same folder and then upload them. Internet Explorer 8 and
      * 9 do not support this property. Please note that the various operating systems for mobile devices can
      * react differently to the property so that fewer upload functions may be available in some cases.
      *
      * If multiple property is set to false, the control shows an error message if more than one file is chosen
      * for drag & drop.
      *
      * Default value is `false`.
      *
      * @returns Value of property `multiple`
      */
    def getMultiple(): Boolean = js.native
    
    /**
      * @SINCE 1.46.0
      *
      * Gets current value of property {@link #getNoDataDescription noDataDescription}.
      *
      * Allows you to set your own text for the 'No data' description label.
      *
      * @returns Value of property `noDataDescription`
      */
    def getNoDataDescription(): String = js.native
    
    /**
      * Gets current value of property {@link #getNoDataText noDataText}.
      *
      * Allows you to set your own text for the 'No data' text label.
      *
      * @returns Value of property `noDataText`
      */
    def getNoDataText(): String = js.native
    
    /**
      * @SINCE 1.30.0
      *
      * Gets current value of property {@link #getNumberOfAttachmentsText numberOfAttachmentsText}.
      *
      * Sets the title text in the toolbar of the list of attachments. To show as well the number of attachments
      * in brackets like the default text does. The number of attachments could be retrieved via "getItems().length".
      * If a new title is set, the default is deactivated. The default value is set to language-dependent "Attachments
      * (n)".
      *
      * @returns Value of property `numberOfAttachmentsText`
      */
    def getNumberOfAttachmentsText(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getParameters parameters}.
      *
      * Specifies the parameters for the FileUploader that are rendered as a hidden input field.
      */
    def getParameters(): js.Array[typings.openui5.sapMUploadCollectionParameterMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getSameFilenameAllowed sameFilenameAllowed}.
      *
      * Allows the user to use the same name for a file when editing the file name. 'Same name' refers to an
      * already existing file name in the list.
      *
      * Default value is `false`.
      *
      * @returns Value of property `sameFilenameAllowed`
      */
    def getSameFilenameAllowed(): Boolean = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Retrieves the currently selected UploadCollectionItem.
      *
      * @returns The currently selected item or `null`
      */
    def getSelectedItem(): typings.openui5.sapMUploadCollectionItemMod.default | Null = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Returns an array containing the selected UploadCollectionItems.
      *
      * @returns Array of all selected items
      */
    def getSelectedItems(): js.Array[typings.openui5.sapMUploadCollectionItemMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getShowSeparators showSeparators}.
      *
      * Defines whether separators are shown between list items.
      *
      * Default value is `"All"`.
      *
      * @returns Value of property `showSeparators`
      */
    def getShowSeparators(): ListSeparators | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListSeparators * / any */ String) = js.native
    
    /**
      * @SINCE 1.42.0
      *
      * Gets current value of property {@link #getTerminationEnabled terminationEnabled}.
      *
      * If true, the button that is used to terminate the instant file upload gets visible. The button normally
      * appears when a file is being uploaded.
      *
      * Default value is `true`.
      *
      * @returns Value of property `terminationEnabled`
      */
    def getTerminationEnabled(): Boolean = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets content of aggregation {@link #getToolbar toolbar}.
      *
      * Specifies the toolbar.
      */
    def getToolbar(): typings.openui5.sapMOverflowToolbarMod.default = js.native
    
    /**
      * @SINCE 1.42.0
      *
      * Gets current value of property {@link #getUploadButtonInvisible uploadButtonInvisible}.
      *
      * If true, the button used for uploading files is invisible.
      *
      * Default value is `false`.
      *
      * @returns Value of property `uploadButtonInvisible`
      */
    def getUploadButtonInvisible(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getUploadEnabled uploadEnabled}.
      *
      * Enables the upload of a file. If property instantUpload is false it is not allowed to change uploadEnabled
      * at runtime.
      *
      * Default value is `true`.
      *
      * @returns Value of property `uploadEnabled`
      */
    def getUploadEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getUploadUrl uploadUrl}.
      *
      * Specifies the URL where the uploaded files have to be stored.
      *
      * Default value is `"../../../upload"`.
      *
      * @returns Value of property `uploadUrl`
      */
    def getUploadUrl(): String = js.native
    
    /**
      * Checks for the provided `sap.m.UploadCollectionParameter` in the aggregation {@link #getHeaderParameters
      * headerParameters}. and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfHeaderParameter(
      /**
      * The headerParameter whose index is looked for
      */
    oHeaderParameter: typings.openui5.sapMUploadCollectionParameterMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.m.UploadCollectionItem` in the aggregation {@link #getItems items}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(
      /**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapMUploadCollectionItemMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.m.UploadCollectionParameter` in the aggregation {@link #getParameters parameters}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfParameter(
      /**
      * The parameter whose index is looked for
      */
    oParameter: typings.openui5.sapMUploadCollectionParameterMod.default
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
    oHeaderParameter: typings.openui5.sapMUploadCollectionParameterMod.default,
      /**
      * The `0`-based index the headerParameter should be inserted at; for a negative value of `iIndex`, the
      * headerParameter is inserted at position 0; for a value greater than the current size of the aggregation,
      * the headerParameter is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapMUploadCollectionItemMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a parameter into the aggregation {@link #getParameters parameters}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertParameter(
      /**
      * The parameter to insert; if empty, nothing is inserted
      */
    oParameter: typings.openui5.sapMUploadCollectionParameterMod.default,
      /**
      * The `0`-based index the parameter should be inserted at; for a negative value of `iIndex`, the parameter
      * is inserted at position 0; for a value greater than the current size of the aggregation, the parameter
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Opens the FileUploader dialog. When an UploadCollectionItem is provided, this method can be used to update
      * a file with a new version. In this case, the upload progress can be sequenced using the events: beforeUploadStarts,
      * uploadComplete and uploadTerminated. For this use, multiple properties from the UploadCollection have
      * to be set to false. If no UploadCollectionItem is provided, only the dialog opens and no further configuration
      * of the UploadCollection is needed.
      *
      * @returns this to allow method chaining
      */
    def openFileDialog(
      /**
      * The item to update with a new version. This parameter is mandatory.
      */
    item: typings.openui5.sapMUploadCollectionItemMod.default
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getHeaderParameters headerParameters}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllHeaderParameters(): js.Array[typings.openui5.sapMUploadCollectionParameterMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typings.openui5.sapMUploadCollectionItemMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getParameters parameters}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllParameters(): js.Array[typings.openui5.sapMUploadCollectionParameterMod.default] = js.native
    
    def removeHeaderParameter(/**
      * The headerParameter to remove or its index or id
      */
    vHeaderParameter: String): typings.openui5.sapMUploadCollectionParameterMod.default | Null = js.native
    /**
      * Removes a headerParameter from the aggregation {@link #getHeaderParameters headerParameters}.
      *
      * @returns The removed headerParameter or `null`
      */
    def removeHeaderParameter(/**
      * The headerParameter to remove or its index or id
      */
    vHeaderParameter: int): typings.openui5.sapMUploadCollectionParameterMod.default | Null = js.native
    def removeHeaderParameter(
      /**
      * The headerParameter to remove or its index or id
      */
    vHeaderParameter: typings.openui5.sapMUploadCollectionParameterMod.default
    ): typings.openui5.sapMUploadCollectionParameterMod.default | Null = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapMUploadCollectionItemMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapMUploadCollectionItemMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapMUploadCollectionItemMod.default
    ): typings.openui5.sapMUploadCollectionItemMod.default | Null = js.native
    
    def removeParameter(/**
      * The parameter to remove or its index or id
      */
    vParameter: String): typings.openui5.sapMUploadCollectionParameterMod.default | Null = js.native
    /**
      * Removes a parameter from the aggregation {@link #getParameters parameters}.
      *
      * @returns The removed parameter or `null`
      */
    def removeParameter(/**
      * The parameter to remove or its index or id
      */
    vParameter: int): typings.openui5.sapMUploadCollectionParameterMod.default | Null = js.native
    def removeParameter(
      /**
      * The parameter to remove or its index or id
      */
    vParameter: typings.openui5.sapMUploadCollectionParameterMod.default
    ): typings.openui5.sapMUploadCollectionParameterMod.default | Null = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Select all items in "MultiSelection" mode.
      *
      * @returns this to allow method chaining
      */
    def selectAll(): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFileType fileType}.
      *
      * Defines the allowed file types for the upload. The chosen files will be checked against an array of file
      * types. If at least one file does not fit the file type requirements, the upload is prevented. Example:
      * ["jpg", "png", "bmp"].
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
      * @SINCE 1.44.0
      *
      * Sets the aggregated {@link #getInfoToolbar infoToolbar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInfoToolbar(/**
      * The infoToolbar to set
      */
    oInfoToolbar: typings.openui5.sapMToolbarMod.default): this.type = js.native
    
    /**
      * @SINCE 1.30.0
      *
      * Sets a new value for property {@link #getInstantUpload instantUpload}.
      *
      * If false, no upload is triggered when a file is selected. In addition, if a file was selected, a new
      * FileUploader instance is created to ensure that multiple files can be chosen.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInstantUpload(): this.type = js.native
    def setInstantUpload(/**
      * New value for property `instantUpload`
      */
    bInstantUpload: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaximumFileSize maximumFileSize}.
      *
      * Specifies a file size limit in megabytes that prevents the upload if at least one file exceeds the limit.
      * This property is not supported by Internet Explorer 8 and 9.
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
      * Sets a new value for property {@link #getMaximumFilenameLength maximumFilenameLength}.
      *
      * Specifies the maximum length of a file name. If the maximum file name length is exceeded, the corresponding
      * event 'filenameLengthExceed' is triggered.
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
      * Defines the allowed MIME types of files to be uploaded. The chosen files will be checked against an array
      * of MIME types. If at least one file does not fit the MIME type requirements, the upload is prevented.
      * This property is not supported by Internet Explorer 8 and 9. Example: mimeType ["image/png", "image/jpeg"].
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
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getMode mode}.
      *
      * Defines the selection mode of the control (e.g. None, SingleSelect, MultiSelect, SingleSelectLeft, SingleSelectMaster).
      * Since the UploadCollection reacts like a list for attachments, the API is close to the ListBase Interface.
      * sap.m.ListMode.Delete mode is not supported and will be automatically set to sap.m.ListMode.None. In
      * addition, if instant upload is set to false the mode sap.m.ListMode.MultiSelect is not supported and
      * will be automatically set to sap.m.ListMode.None.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"None"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMode(): this.type = js.native
    def setMode(
      /**
      * New value for property `mode`
      */
    sMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String
    ): this.type = js.native
    def setMode(/**
      * New value for property `mode`
      */
    sMode: ListMode): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMultiple multiple}.
      *
      * Lets the user select multiple files from the same folder and then upload them. Internet Explorer 8 and
      * 9 do not support this property. Please note that the various operating systems for mobile devices can
      * react differently to the property so that fewer upload functions may be available in some cases.
      *
      * If multiple property is set to false, the control shows an error message if more than one file is chosen
      * for drag & drop.
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
      * @SINCE 1.46.0
      *
      * Sets a new value for property {@link #getNoDataDescription noDataDescription}.
      *
      * Allows you to set your own text for the 'No data' description label.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNoDataDescription(): this.type = js.native
    def setNoDataDescription(/**
      * New value for property `noDataDescription`
      */
    sNoDataDescription: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNoDataText noDataText}.
      *
      * Allows you to set your own text for the 'No data' text label.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNoDataText(): this.type = js.native
    def setNoDataText(/**
      * New value for property `noDataText`
      */
    sNoDataText: String): this.type = js.native
    
    /**
      * @SINCE 1.30.0
      *
      * Sets a new value for property {@link #getNumberOfAttachmentsText numberOfAttachmentsText}.
      *
      * Sets the title text in the toolbar of the list of attachments. To show as well the number of attachments
      * in brackets like the default text does. The number of attachments could be retrieved via "getItems().length".
      * If a new title is set, the default is deactivated. The default value is set to language-dependent "Attachments
      * (n)".
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNumberOfAttachmentsText(): this.type = js.native
    def setNumberOfAttachmentsText(/**
      * New value for property `numberOfAttachmentsText`
      */
    sNumberOfAttachmentsText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSameFilenameAllowed sameFilenameAllowed}.
      *
      * Allows the user to use the same name for a file when editing the file name. 'Same name' refers to an
      * already existing file name in the list.
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
      * @SINCE 1.34.0
      *
      * Selects or deselects the given list item.
      *
      * @returns this to allow method chaining
      */
    def setSelectedItem(
      /**
      * The item whose selection is to be changed. This parameter is mandatory.
      */
    uploadCollectionItem: typings.openui5.sapMUploadCollectionItemMod.default
    ): this.type = js.native
    def setSelectedItem(
      /**
      * The item whose selection is to be changed. This parameter is mandatory.
      */
    uploadCollectionItem: typings.openui5.sapMUploadCollectionItemMod.default,
      /**
      * The selection state of the item.
      */
    select: Boolean
    ): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets an UploadCollectionItem to be selected by ID. In single selection mode, the method removes the previous
      * selection.
      *
      * @returns this to allow method chaining
      */
    def setSelectedItemById(/**
      * The ID of the item whose selection is to be changed.
      */
    id: String): this.type = js.native
    def setSelectedItemById(
      /**
      * The ID of the item whose selection is to be changed.
      */
    id: String,
      /**
      * The selection state of the item.
      */
    select: Boolean
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowSeparators showSeparators}.
      *
      * Defines whether separators are shown between list items.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"All"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSeparators(): this.type = js.native
    def setShowSeparators(
      /**
      * New value for property `showSeparators`
      */
    sShowSeparators: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListSeparators * / any */ String
    ): this.type = js.native
    def setShowSeparators(/**
      * New value for property `showSeparators`
      */
    sShowSeparators: ListSeparators): this.type = js.native
    
    /**
      * @SINCE 1.42.0
      *
      * Sets a new value for property {@link #getTerminationEnabled terminationEnabled}.
      *
      * If true, the button that is used to terminate the instant file upload gets visible. The button normally
      * appears when a file is being uploaded.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTerminationEnabled(): this.type = js.native
    def setTerminationEnabled(/**
      * New value for property `terminationEnabled`
      */
    bTerminationEnabled: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets the aggregated {@link #getToolbar toolbar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setToolbar(/**
      * The toolbar to set
      */
    oToolbar: typings.openui5.sapMOverflowToolbarMod.default): this.type = js.native
    
    /**
      * @SINCE 1.42.0
      *
      * Sets a new value for property {@link #getUploadButtonInvisible uploadButtonInvisible}.
      *
      * If true, the button used for uploading files is invisible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUploadButtonInvisible(): this.type = js.native
    def setUploadButtonInvisible(/**
      * New value for property `uploadButtonInvisible`
      */
    bUploadButtonInvisible: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUploadEnabled uploadEnabled}.
      *
      * Enables the upload of a file. If property instantUpload is false it is not allowed to change uploadEnabled
      * at runtime.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUploadEnabled(): this.type = js.native
    def setUploadEnabled(/**
      * New value for property `uploadEnabled`
      */
    bUploadEnabled: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUploadUrl uploadUrl}.
      *
      * Specifies the URL where the uploaded files have to be stored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"../../../upload"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUploadUrl(): this.type = js.native
    def setUploadUrl(/**
      * New value for property `uploadUrl`
      */
    sUploadUrl: String): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getItems items} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindItems(): this.type = js.native
    
    /**
      * @SINCE 1.30.0
      *
      * Starts the upload for all selected files.
      */
    def upload(): Unit = js.native
  }
  
  trait UploadCollectionSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The event is triggered before the actual upload starts. An event is fired per file. All the necessary
      * header parameters should be set here.
      */
    var beforeUploadStarts: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The event is triggered when files are selected in the FileUploader dialog. Applications can set parameters
      * and headerParameters which will be dispatched to the embedded FileUploader control. Restriction: parameters
      * and headerParameters are not supported by Internet Explorer 9.
      */
    var change: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The event is triggered when an uploaded attachment is selected and the Delete button is pressed.
      */
    var fileDeleted: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The event is triggered when the file name is changed.
      */
    var fileRenamed: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The event is triggered when the file size of an uploaded file is exceeded (only if the maxFileSize property
      * was provided by the application). This event is not supported by Internet Explorer 9.
      */
    var fileSizeExceed: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the allowed file types for the upload. The chosen files will be checked against an array of file
      * types. If at least one file does not fit the file type requirements, the upload is prevented. Example:
      * ["jpg", "png", "bmp"].
      */
    var fileType: js.UndefOr[
        js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The event is triggered when the name of a chosen file is longer than the value specified with the maximumFilenameLength
      * property (only if provided by the application).
      */
    var filenameLengthExceed: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Specifies the header parameters for the FileUploader that are submitted only with XHR requests. Header
      * parameters are not supported by Internet Explorer 8 and 9.
      */
    var headerParameters: js.UndefOr[
        js.Array[typings.openui5.sapMUploadCollectionParameterMod.default] | typings.openui5.sapMUploadCollectionParameterMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.44.0
      *
      * Specifies the info toolbar for filtering information. Sorting information will not displayed.
      */
    var infoToolbar: js.UndefOr[typings.openui5.sapMToolbarMod.default] = js.undefined
    
    /**
      * @SINCE 1.30.0
      *
      * If false, no upload is triggered when a file is selected. In addition, if a file was selected, a new
      * FileUploader instance is created to ensure that multiple files can be chosen.
      */
    var instantUpload: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Uploaded items.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapMUploadCollectionItemMod.default] | typings.openui5.sapMUploadCollectionItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies a file size limit in megabytes that prevents the upload if at least one file exceeds the limit.
      * This property is not supported by Internet Explorer 8 and 9.
      */
    var maximumFileSize: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the maximum length of a file name. If the maximum file name length is exceeded, the corresponding
      * event 'filenameLengthExceed' is triggered.
      */
    var maximumFilenameLength: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the allowed MIME types of files to be uploaded. The chosen files will be checked against an array
      * of MIME types. If at least one file does not fit the MIME type requirements, the upload is prevented.
      * This property is not supported by Internet Explorer 8 and 9. Example: mimeType ["image/png", "image/jpeg"].
      */
    var mimeType: js.UndefOr[
        js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * Defines the selection mode of the control (e.g. None, SingleSelect, MultiSelect, SingleSelectLeft, SingleSelectMaster).
      * Since the UploadCollection reacts like a list for attachments, the API is close to the ListBase Interface.
      * sap.m.ListMode.Delete mode is not supported and will be automatically set to sap.m.ListMode.None. In
      * addition, if instant upload is set to false the mode sap.m.ListMode.MultiSelect is not supported and
      * will be automatically set to sap.m.ListMode.None.
      */
    var mode: js.UndefOr[
        ListMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Lets the user select multiple files from the same folder and then upload them. Internet Explorer 8 and
      * 9 do not support this property. Please note that the various operating systems for mobile devices can
      * react differently to the property so that fewer upload functions may be available in some cases.
      *
      * If multiple property is set to false, the control shows an error message if more than one file is chosen
      * for drag & drop.
      */
    var multiple: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.46.0
      *
      * Allows you to set your own text for the 'No data' description label.
      */
    var noDataDescription: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Allows you to set your own text for the 'No data' text label.
      */
    var noDataText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.30.0
      *
      * Sets the title text in the toolbar of the list of attachments. To show as well the number of attachments
      * in brackets like the default text does. The number of attachments could be retrieved via "getItems().length".
      * If a new title is set, the default is deactivated. The default value is set to language-dependent "Attachments
      * (n)".
      */
    var numberOfAttachmentsText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies the parameters for the FileUploader that are rendered as a hidden input field.
      */
    var parameters: js.UndefOr[
        js.Array[typings.openui5.sapMUploadCollectionParameterMod.default] | typings.openui5.sapMUploadCollectionParameterMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Allows the user to use the same name for a file when editing the file name. 'Same name' refers to an
      * already existing file name in the list.
      */
    var sameFilenameAllowed: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.36.0
      *
      * Fires when selection is changed via user interaction inside the control.
      */
    var selectionChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines whether separators are shown between list items.
      */
    var showSeparators: js.UndefOr[
        ListSeparators | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListSeparators * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.42.0
      *
      * If true, the button that is used to terminate the instant file upload gets visible. The button normally
      * appears when a file is being uploaded.
      */
    var terminationEnabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * Specifies the toolbar.
      */
    var toolbar: js.UndefOr[typings.openui5.sapMOverflowToolbarMod.default] = js.undefined
    
    /**
      * The event is triggered when the file type or the MIME type don't match the permitted types (only if the
      * fileType property or the mimeType property are provided by the application).
      */
    var typeMissmatch: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.42.0
      *
      * If true, the button used for uploading files is invisible.
      */
    var uploadButtonInvisible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The event is triggered as soon as the upload request is completed.
      */
    var uploadComplete: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Enables the upload of a file. If property instantUpload is false it is not allowed to change uploadEnabled
      * at runtime.
      */
    var uploadEnabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The event is triggered as soon as the upload request was terminated by the user.
      */
    var uploadTerminated: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Specifies the URL where the uploaded files have to be stored.
      */
    var uploadUrl: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object UploadCollectionSettings {
    
    inline def apply(): UploadCollectionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadCollectionSettings]
    }
    
    extension [Self <: UploadCollectionSettings](x: Self) {
      
      inline def setBeforeUploadStarts(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeUploadStarts", js.Any.fromFunction1(value))
      
      inline def setBeforeUploadStartsUndefined: Self = StObject.set(x, "beforeUploadStarts", js.undefined)
      
      inline def setChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setFileDeleted(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "fileDeleted", js.Any.fromFunction1(value))
      
      inline def setFileDeletedUndefined: Self = StObject.set(x, "fileDeleted", js.undefined)
      
      inline def setFileRenamed(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "fileRenamed", js.Any.fromFunction1(value))
      
      inline def setFileRenamedUndefined: Self = StObject.set(x, "fileRenamed", js.undefined)
      
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
        value: js.Array[typings.openui5.sapMUploadCollectionParameterMod.default] | typings.openui5.sapMUploadCollectionParameterMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "headerParameters", value.asInstanceOf[js.Any])
      
      inline def setHeaderParametersUndefined: Self = StObject.set(x, "headerParameters", js.undefined)
      
      inline def setHeaderParametersVarargs(value: typings.openui5.sapMUploadCollectionParameterMod.default*): Self = StObject.set(x, "headerParameters", js.Array(value*))
      
      inline def setInfoToolbar(value: typings.openui5.sapMToolbarMod.default): Self = StObject.set(x, "infoToolbar", value.asInstanceOf[js.Any])
      
      inline def setInfoToolbarUndefined: Self = StObject.set(x, "infoToolbar", js.undefined)
      
      inline def setInstantUpload(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "instantUpload", value.asInstanceOf[js.Any])
      
      inline def setInstantUploadUndefined: Self = StObject.set(x, "instantUpload", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapMUploadCollectionItemMod.default] | typings.openui5.sapMUploadCollectionItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapMUploadCollectionItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMaximumFileSize(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maximumFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaximumFileSizeUndefined: Self = StObject.set(x, "maximumFileSize", js.undefined)
      
      inline def setMaximumFilenameLength(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maximumFilenameLength", value.asInstanceOf[js.Any])
      
      inline def setMaximumFilenameLengthUndefined: Self = StObject.set(x, "maximumFilenameLength", js.undefined)
      
      inline def setMimeType(
        value: js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setMimeTypeVarargs(value: String*): Self = StObject.set(x, "mimeType", js.Array(value*))
      
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
      
      inline def setNumberOfAttachmentsText(value: String | PropertyBindingInfo): Self = StObject.set(x, "numberOfAttachmentsText", value.asInstanceOf[js.Any])
      
      inline def setNumberOfAttachmentsTextUndefined: Self = StObject.set(x, "numberOfAttachmentsText", js.undefined)
      
      inline def setParameters(
        value: js.Array[typings.openui5.sapMUploadCollectionParameterMod.default] | typings.openui5.sapMUploadCollectionParameterMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(value: typings.openui5.sapMUploadCollectionParameterMod.default*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setSameFilenameAllowed(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sameFilenameAllowed", value.asInstanceOf[js.Any])
      
      inline def setSameFilenameAllowedUndefined: Self = StObject.set(x, "sameFilenameAllowed", js.undefined)
      
      inline def setSelectionChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      inline def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
      
      inline def setShowSeparators(
        value: ListSeparators | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListSeparators * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "showSeparators", value.asInstanceOf[js.Any])
      
      inline def setShowSeparatorsUndefined: Self = StObject.set(x, "showSeparators", js.undefined)
      
      inline def setTerminationEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "terminationEnabled", value.asInstanceOf[js.Any])
      
      inline def setTerminationEnabledUndefined: Self = StObject.set(x, "terminationEnabled", js.undefined)
      
      inline def setToolbar(value: typings.openui5.sapMOverflowToolbarMod.default): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
      
      inline def setTypeMissmatch(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "typeMissmatch", js.Any.fromFunction1(value))
      
      inline def setTypeMissmatchUndefined: Self = StObject.set(x, "typeMissmatch", js.undefined)
      
      inline def setUploadButtonInvisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "uploadButtonInvisible", value.asInstanceOf[js.Any])
      
      inline def setUploadButtonInvisibleUndefined: Self = StObject.set(x, "uploadButtonInvisible", js.undefined)
      
      inline def setUploadComplete(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "uploadComplete", js.Any.fromFunction1(value))
      
      inline def setUploadCompleteUndefined: Self = StObject.set(x, "uploadComplete", js.undefined)
      
      inline def setUploadEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "uploadEnabled", value.asInstanceOf[js.Any])
      
      inline def setUploadEnabledUndefined: Self = StObject.set(x, "uploadEnabled", js.undefined)
      
      inline def setUploadTerminated(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "uploadTerminated", js.Any.fromFunction1(value))
      
      inline def setUploadTerminatedUndefined: Self = StObject.set(x, "uploadTerminated", js.undefined)
      
      inline def setUploadUrl(value: String | PropertyBindingInfo): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
      
      inline def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
    }
  }
}
