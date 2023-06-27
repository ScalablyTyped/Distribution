package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.openui5.sapUiCoreLibraryMod.ValueState
import typings.std.FileList
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainFileUploaderMod {
  
  @JSImport("sap/ui/webc/main/FileUploader", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `FileUploader`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
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
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/FileUploader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.FileUploader with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
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
      * Returns a metadata object for class sap.ui.webc.main.FileUploader.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait FileUploader
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default
       with IFormContent {
    
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
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.webc.main.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.FileUploader` itself.
      *
      * Event is fired when the value of the file path has been changed. **Note:** Keep in mind that because
      * of the HTML input element of type file, the event is also fired in Chrome browser when the Cancel button
      * of the uploads window is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FileUploaderChangeEvent, Unit]
    ): this.type = js.native
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FileUploaderChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.FileUploader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.webc.main.FileUploader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.FileUploader` itself.
      *
      * Event is fired when the value of the file path has been changed. **Note:** Keep in mind that because
      * of the HTML input element of type file, the event is also fired in Chrome browser when the Cancel button
      * of the uploads window is pressed.
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
    fnFunction: js.Function1[/* p1 */ FileUploaderChangeEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ FileUploaderChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.FileUploader` itself
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
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.ui.webc.main.FileUploader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FileUploaderChangeEvent, Unit]
    ): this.type = js.native
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FileUploaderChangeEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:change change} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireChange(): this.type = js.native
    def fireChange(
      /**
      * Parameters to pass along with the event
      */
    mParameters: FileUploader$ChangeEventParameters
    ): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAccept accept}.
      *
      * Comma-separated list of file types that the component should accept.
      *
      *  **Note:** Please make sure you are adding the `.` in front on the file type, e.g. `.png` in case you
      * want to accept png's only.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `accept`
      */
    def getAccept(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * By default the component contains a single input field. With this slot you can pass any content that
      * you wish to add. See the samples for more information.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Returns the fileList of all selected files.
      */
    def getFiles(): Unit = js.native
    
    /**
      * Gets current value of property {@link #getHideInput hideInput}.
      *
      * If set to "true", the input field of component will not be rendered. Only the default slot that is passed
      * will be rendered.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideInput`
      */
    def getHideInput(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getMultiple multiple}.
      *
      * Allows multiple files to be chosen.
      *
      * Default value is `false`.
      *
      * @returns Value of property `multiple`
      */
    def getMultiple(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getName name}.
      *
      * Determines the name with which the component will be submitted in an HTML form.
      *
      *
      *
      *  **Note:** When set, a native `input` HTML element will be created inside the component so that it can
      * be submitted as part of an HTML form. Do not use this property unless you need to submit a form.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `name`
      */
    def getName(): String = js.native
    
    /**
      * Gets current value of property {@link #getPlaceholder placeholder}.
      *
      * Defines a short hint intended to aid the user with data entry when the component has no value.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `placeholder`
      */
    def getPlaceholder(): String = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * Defines the name/names of the file/files to upload.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `value`
      */
    def getValue(): String = js.native
    
    /**
      * Gets current value of property {@link #getValueState valueState}.
      *
      * Defines the value state of the component.
      *
      *  Available options are:
      * 	 - `None`
      * 	 - `Error`
      * 	 - `Warning`
      * 	 - `Success`
      * 	 - `Information`
      *
      * Default value is `None`.
      *
      * @returns Value of property `valueState`
      */
    def getValueState(): ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getValueStateMessage valueStateMessage}.
      *
      * Defines the value state message that will be displayed as pop up under the contorl.
      *
      *
      *
      * **Note:** If not specified, a default text (in the respective language) will be displayed.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `valueStateMessage`
      */
    def getValueStateMessage(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
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
      * Sets a new value for property {@link #getAccept accept}.
      *
      * Comma-separated list of file types that the component should accept.
      *
      *  **Note:** Please make sure you are adding the `.` in front on the file type, e.g. `.png` in case you
      * want to accept png's only.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccept(): this.type = js.native
    def setAccept(/**
      * New value for property `accept`
      */
    sAccept: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
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
      * Sets a new value for property {@link #getHideInput hideInput}.
      *
      * If set to "true", the input field of component will not be rendered. Only the default slot that is passed
      * will be rendered.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHideInput(): this.type = js.native
    def setHideInput(/**
      * New value for property `hideInput`
      */
    bHideInput: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMultiple multiple}.
      *
      * Allows multiple files to be chosen.
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
      * Determines the name with which the component will be submitted in an HTML form.
      *
      *
      *
      *  **Note:** When set, a native `input` HTML element will be created inside the component so that it can
      * be submitted as part of an HTML form. Do not use this property unless you need to submit a form.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
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
      * Defines a short hint intended to aid the user with data entry when the component has no value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPlaceholder(): this.type = js.native
    def setPlaceholder(/**
      * New value for property `placeholder`
      */
    sPlaceholder: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValue value}.
      *
      * Defines the name/names of the file/files to upload.
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
      * Sets a new value for property {@link #getValueState valueState}.
      *
      * Defines the value state of the component.
      *
      *  Available options are:
      * 	 - `None`
      * 	 - `Error`
      * 	 - `Warning`
      * 	 - `Success`
      * 	 - `Information`
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
      * Sets a new value for property {@link #getValueStateMessage valueStateMessage}.
      *
      * Defines the value state message that will be displayed as pop up under the contorl.
      *
      *
      *
      * **Note:** If not specified, a default text (in the respective language) will be displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueStateMessage(): this.type = js.native
    def setValueStateMessage(/**
      * New value for property `valueStateMessage`
      */
    sValueStateMessage: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait FileUploader$ChangeEventParameters extends StObject {
    
    /**
      * The current files.
      */
    var files: js.UndefOr[FileList] = js.undefined
  }
  object FileUploader$ChangeEventParameters {
    
    inline def apply(): FileUploader$ChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileUploader$ChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileUploader$ChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setFiles(value: FileList): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    }
  }
  
  type FileUploaderChangeEvent = typings.openui5.sapUiBaseEventMod.default[FileUploader$ChangeEventParameters]
  
  type FileUploaderChangeEventParameters = FileUploader$ChangeEventParameters
  
  trait FileUploaderSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Comma-separated list of file types that the component should accept.
      *
      *  **Note:** Please make sure you are adding the `.` in front on the file type, e.g. `.png` in case you
      * want to accept png's only.
      */
    var accept: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Event is fired when the value of the file path has been changed. **Note:** Keep in mind that because
      * of the HTML input element of type file, the event is also fired in Chrome browser when the Cancel button
      * of the uploads window is pressed.
      */
    var change: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[FileUploader$ChangeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * By default the component contains a single input field. With this slot you can pass any content that
      * you wish to add. See the samples for more information.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If set to "true", the input field of component will not be rendered. Only the default slot that is passed
      * will be rendered.
      */
    var hideInput: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Allows multiple files to be chosen.
      */
    var multiple: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the name with which the component will be submitted in an HTML form.
      *
      *
      *
      *  **Note:** When set, a native `input` HTML element will be created inside the component so that it can
      * be submitted as part of an HTML form. Do not use this property unless you need to submit a form.
      */
    var name: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines a short hint intended to aid the user with data entry when the component has no value.
      */
    var placeholder: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the name/names of the file/files to upload.
      */
    var value: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the value state of the component.
      *
      *  Available options are:
      * 	 - `None`
      * 	 - `Error`
      * 	 - `Warning`
      * 	 - `Success`
      * 	 - `Information`
      */
    var valueState: js.UndefOr[
        ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the value state message that will be displayed as pop up under the contorl.
      *
      *
      *
      * **Note:** If not specified, a default text (in the respective language) will be displayed.
      */
    var valueStateMessage: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the width of the control
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object FileUploaderSettings {
    
    inline def apply(): FileUploaderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileUploaderSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileUploaderSettings] (val x: Self) extends AnyVal {
      
      inline def setAccept(value: String | PropertyBindingInfo): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setChange(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[FileUploader$ChangeEventParameters] => Unit
      ): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHideInput(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideInput", value.asInstanceOf[js.Any])
      
      inline def setHideInputUndefined: Self = StObject.set(x, "hideInput", js.undefined)
      
      inline def setMultiple(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setName(value: String | PropertyBindingInfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPlaceholder(value: String | PropertyBindingInfo): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setValue(value: String | PropertyBindingInfo): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueState(
        value: ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "valueState", value.asInstanceOf[js.Any])
      
      inline def setValueStateMessage(value: String | PropertyBindingInfo): Self = StObject.set(x, "valueStateMessage", value.asInstanceOf[js.Any])
      
      inline def setValueStateMessageUndefined: Self = StObject.set(x, "valueStateMessage", js.undefined)
      
      inline def setValueStateUndefined: Self = StObject.set(x, "valueState", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
