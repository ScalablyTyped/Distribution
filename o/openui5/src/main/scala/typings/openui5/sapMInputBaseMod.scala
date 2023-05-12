package typings.openui5

import typings.openui5.anon.Value
import typings.openui5.jQuery.Event
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.FocusInfo
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.openui5.sapUiCoreLibraryMod.TextAlign
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.openui5.sapUiCoreLibraryMod.ValueState
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMInputBaseMod {
  
  @JSImport("sap/m/InputBase", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `sap.m.InputBase`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends InputBase {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: InputBaseSettings) = this()
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
    mSettings: InputBaseSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: InputBaseSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/InputBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.InputBase with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, InputBase]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, InputBase],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.InputBase.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait InputBase
    extends typings.openui5.sapUiCoreControlMod.default
       with IFormContent {
    
    def addAriaDescribedBy(
      /**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @SINCE 1.90
      *
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
      * @SINCE 1.27.0
      *
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Adds an icon to the beginning of the input
      * See:
      * 	sap.ui.core.IconPool.createControlByURI
      */
    def addBeginIcon(/**
      * settings for creating an icon
      */
    oIconSettings: js.Object): Null | typings.openui5.sapUiCoreIconMod.default = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Adds an icon to the end of the input
      * See:
      * 	sap.ui.core.IconPool.createControlByURI
      */
    def addEndIcon(
      /**
      * settings for creating an icon
      */
    oIconSettings: js.Object,
      /**
      * position to be inserted in the aggregation. If not provided, the icon gets inserted on last position.
      */
    iPosition: int
    ): Null | typings.openui5.sapUiCoreIconMod.default = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Applies the focus info. To be overwritten by subclasses.
      *
      * @returns Returns `this` to allow method chaining
      */
    def applyFocusInfo(/**
      * An object representing the serialized focus information.
      */
    oFocusInfo: FocusInfo): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.InputBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.InputBase` itself.
      *
      * Is fired when the text in the input field has changed and the focus leaves the input field or the enter
      * key is pressed.
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
      * Context object to call the event handler with. Defaults to this `sap.m.InputBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.InputBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.InputBase` itself.
      *
      * Is fired when the text in the input field has changed and the focus leaves the input field or the enter
      * key is pressed.
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
      * Context object to call the event handler with. Defaults to this `sap.m.InputBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Indicates whether the input field is in the rendering phase.
      */
    var bRenderingPhase: Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Use labels as placeholder configuration. It can be necessary for the subclasses to overwrite this when
      * native placeholder usage causes undesired input events or when placeholder attribute is not supported
      * for the specified type. https://html.spec.whatwg.org/multipage/forms.html#input-type-attr-summary
      * See:
      * 	sap.m.InputBase#oninput
      */
    var bShowLabelAsPlaceholder: Unit = js.native
    
    /**
      * Binds property {@link #getValue value} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindProperty ManagedObject.bindProperty} for a detailed description
      * of the possible properties of `oBindingInfo`
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindValue(/**
      * The binding information
      */
    oBindingInfo: PropertyBindingInfo): this.type = js.native
    
    /**
      * @SINCE 1.26
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Close value state message popup.
      */
    def closeValueStateMessage(): Unit = js.native
    
    /**
      * @SINCE 1.78
      * @EXPERIMENTAL (since 1.78) - This aggregation is experimental and provides only limited functionality.
      * Also the API might be changed in future.
      *
      * Destroys the formattedValueStateText in the aggregation {@link #getFormattedValueStateText formattedValueStateText}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFormattedValueStateText(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.m.InputBase`.
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
    mParameters: Value): this.type = js.native
    
    /**
      * @SINCE 1.22.1
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires the change event for the listeners
      */
    def fireChangeEvent(/**
      * value of the input.
      */
    sValue: String): Unit = js.native
    def fireChangeEvent(
      /**
      * value of the input.
      */
    sValue: String,
      /**
      * extra event parameters.
      */
    oParams: js.Object
    ): Unit = js.native
    
    /**
      * @SINCE 1.90
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy
      * ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.27.0
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.26
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Gets the DOM element reference where the message popup is attached.
      *
      * @returns The DOM element reference where the message popup is attached
      */
    def getDomRefForValueStateMessage(): Element = js.native
    
    /**
      * @SINCE 1.12.0
      *
      * Gets current value of property {@link #getEditable editable}.
      *
      * Defines whether the control can be modified by the user or not. **Note:** A user can tab to non-editable
      * control, highlight it, and copy the text from it.
      *
      * Default value is `true`.
      *
      * @returns Value of property `editable`
      */
    def getEditable(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Indicates whether the user can interact with the control or not. **Note:** Disabled controls cannot be
      * focused and they are out of the tab-chain.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * @SINCE 1.78
      * @EXPERIMENTAL (since 1.78) - This aggregation is experimental and provides only limited functionality.
      * Also the API might be changed in future.
      *
      * Gets content of aggregation {@link #getFormattedValueStateText formattedValueStateText}.
      *
      * Defines the formatted text that appears in the value state message pop-up. It can include links. If both
      * `valueStateText` and `formattedValueStateText` are set - the latter is shown.
      */
    def getFormattedValueStateText(): typings.openui5.sapMFormattedTextMod.default = js.native
    
    /**
      * @SINCE 1.48
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Gets the labels referencing this control.
      *
      * @returns Array of objects which are the current targets of the `ariaLabelledBy` association and the labels
      * referencing this control.
      */
    def getLabels(): js.Array[typings.openui5.sapMLabelMod.default] = js.native
    
    /**
      * @SINCE 1.78
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Gets the last value of the InputBase
      */
    def getLastValue(): String = js.native
    
    /**
      * Gets current value of property {@link #getName name}.
      *
      * The name to be used in the HTML code (for example, for HTML forms that send data to the server via submission).
      *
      * @returns Value of property `name`
      */
    def getName(): String = js.native
    
    /**
      * Gets current value of property {@link #getPlaceholder placeholder}.
      *
      * Defines a short hint intended to aid the user with data entry when the control has no value.
      *
      * @returns Value of property `placeholder`
      */
    def getPlaceholder(): String = js.native
    
    /**
      * @SINCE 1.38.4
      *
      * Gets current value of property {@link #getRequired required}.
      *
      * Indicates that user input is required. This property is only needed for accessibility purposes when a
      * single relationship between the field and a label (see aggregation `labelFor` of `sap.m.Label`) cannot
      * be established (e.g. one label should label multiple fields).
      *
      * Default value is `false`.
      *
      * @returns Value of property `required`
      */
    def getRequired(): Boolean = js.native
    
    /**
      * @SINCE 1.32
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Retrieves the selected text. Only supported for input control's type of Text, Url, Tel and Password.
      *
      * @returns The selected text.
      */
    def getSelectedText(): String = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Gets current value of property {@link #getShowValueStateMessage showValueStateMessage}.
      *
      * Indicates whether the value state message should be shown or not.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showValueStateMessage`
      */
    def getShowValueStateMessage(): Boolean = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Gets current value of property {@link #getTextAlign textAlign}.
      *
      * Defines the horizontal alignment of the text that is shown inside the input field.
      *
      * Default value is `Initial`.
      *
      * @returns Value of property `textAlign`
      */
    def getTextAlign(): TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Gets current value of property {@link #getTextDirection textDirection}.
      *
      * Defines the text directionality of the input field, e.g. `RTL`, `LTR`
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `textDirection`
      */
    def getTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * Defines the value of the control.
      *
      * @returns Value of property `value`
      */
    def getValue(): String = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Gets the value of the accessibility description info field.
      *
      * @returns The value of the accessibility description info
      */
    def getValueDescriptionInfo(): String = js.native
    
    /**
      * Gets current value of property {@link #getValueState valueState}.
      *
      * Visualizes the validation state of the control, e.g. `Error`, `Warning`, `Success`.
      *
      * Default value is `None`.
      *
      * @returns Value of property `valueState`
      */
    def getValueState(): ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Gets current value of property {@link #getValueStateText valueStateText}.
      *
      * Defines the text that appears in the value state message pop-up. If this is not specified, a default
      * text is shown from the resource bundle.
      *
      * @returns Value of property `valueStateText`
      */
    def getValueStateText(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control.
      *
      * **Note:** If the provided width is too small, the control gets stretched to its min width, which is needed
      * in order for the control to be usable and well aligned.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * indicating if a character is currently composing.
      *
      * @returns Whether or not a character is composing. True if after "compositionstart" event and before "compositionend"
      * event.
      */
    def isComposingCharacter(): Boolean = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Handles the change event.
      *
      * @returns true when change event is fired
      */
    def onChange(
      /**
      * The event
      */
    oEvent: Event,
      /**
      * Additional event parameters to be passed in to the change event handler if the value has changed
      */
    mParameters: js.Object,
      /**
      * Passed value on change
      */
    sNewValue: String
    ): js.UndefOr[Boolean] = js.native
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Handles the change event.
      *
      * @returns true when change event is fired
      */
    def onChange(/**
      * The event
      */
    oEvent: Event, /**
      * Passed value on change
      */
    sNewValue: String): js.UndefOr[Boolean] = js.native
    
    /**
      * @SINCE 1.26
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Hook method that gets called when the input value is reverted with hitting escape. It may require to
      * re-implement this method from sub classes for control specific behaviour.
      */
    def onValueRevertedByEscape(/**
      * Reverted value of the input.
      */
    sValue: String): Unit = js.native
    
    /**
      * @SINCE 1.26
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Open value state message popup.
      */
    def openValueStateMessage(): Unit = js.native
    
    /**
      * @SINCE 1.46
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Hook method to prevent the change event from being fired when the text input field loses focus.
      *
      * @returns Whether or not the change event should be prevented.
      */
    def preventChangeOnFocusLeave(): Boolean = js.native
    def preventChangeOnFocusLeave(/**
      * The event object.
      */
    oEvent: Event): Boolean = js.native
    
    /**
      * @SINCE 1.90
      *
      * Removes all the controls in the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.27.0
      *
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.90
      *
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
      * @SINCE 1.27.0
      *
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
    
    /**
      * @SINCE 1.22.1
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Selects the text within the input field between the specified start and end positions. Only supported
      * for input control's type of Text, Url, Tel and Password.
      *
      * @returns `this` to allow method chaining.
      */
    def selectText(
      /**
      * The index into the text at which the first selected character is located.
      */
    iSelectionStart: int,
      /**
      * The index into the text at which the last selected character is located.
      */
    iSelectionEnd: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.12.0
      *
      * Sets a new value for property {@link #getEditable editable}.
      *
      * Defines whether the control can be modified by the user or not. **Note:** A user can tab to non-editable
      * control, highlight it, and copy the text from it.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEditable(): this.type = js.native
    def setEditable(/**
      * New value for property `editable`
      */
    bEditable: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Indicates whether the user can interact with the control or not. **Note:** Disabled controls cannot be
      * focused and they are out of the tab-chain.
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
      * @SINCE 1.78
      * @EXPERIMENTAL (since 1.78) - This aggregation is experimental and provides only limited functionality.
      * Also the API might be changed in future.
      *
      * Sets the aggregated {@link #getFormattedValueStateText formattedValueStateText}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFormattedValueStateText(
      /**
      * The formattedValueStateText to set
      */
    oFormattedValueStateText: typings.openui5.sapMFormattedTextMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.78
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Sets the last value of the InputBase
      */
    def setLastValue(sValue: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getName name}.
      *
      * The name to be used in the HTML code (for example, for HTML forms that send data to the server via submission).
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
      * Defines a short hint intended to aid the user with data entry when the control has no value.
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
      * @SINCE 1.38.4
      *
      * Sets a new value for property {@link #getRequired required}.
      *
      * Indicates that user input is required. This property is only needed for accessibility purposes when a
      * single relationship between the field and a label (see aggregation `labelFor` of `sap.m.Label`) cannot
      * be established (e.g. one label should label multiple fields).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRequired(): this.type = js.native
    def setRequired(/**
      * New value for property `required`
      */
    bRequired: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Sets a new value for property {@link #getShowValueStateMessage showValueStateMessage}.
      *
      * Indicates whether the value state message should be shown or not.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowValueStateMessage(): this.type = js.native
    def setShowValueStateMessage(/**
      * New value for property `showValueStateMessage`
      */
    bShowValueStateMessage: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Sets a new value for property {@link #getTextAlign textAlign}.
      *
      * Defines the horizontal alignment of the text that is shown inside the input field.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Initial`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTextAlign(): this.type = js.native
    def setTextAlign(
      /**
      * New value for property `textAlign`
      */
    sTextAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String
    ): this.type = js.native
    def setTextAlign(/**
      * New value for property `textAlign`
      */
    sTextAlign: TextAlign): this.type = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Sets a new value for property {@link #getTextDirection textDirection}.
      *
      * Defines the text directionality of the input field, e.g. `RTL`, `LTR`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Inherit`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTextDirection(): this.type = js.native
    def setTextDirection(
      /**
      * New value for property `textDirection`
      */
    sTextDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String
    ): this.type = js.native
    def setTextDirection(/**
      * New value for property `textDirection`
      */
    sTextDirection: TextDirection): this.type = js.native
    
    /**
      * Setter for property `value`.
      *
      * Default value is empty/`undefined`.
      *
      * @returns `this` to allow method chaining.
      */
    def setValue(/**
      * New value for property `value`.
      */
    sValue: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValueState valueState}.
      *
      * Visualizes the validation state of the control, e.g. `Error`, `Warning`, `Success`.
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
      * @SINCE 1.26.0
      *
      * Sets a new value for property {@link #getValueStateText valueStateText}.
      *
      * Defines the text that appears in the value state message pop-up. If this is not specified, a default
      * text is shown from the resource bundle.
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
      * Defines the width of the control.
      *
      * **Note:** If the provided width is too small, the control gets stretched to its min width, which is needed
      * in order for the control to be usable and well aligned.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * Unbinds property {@link #getValue value} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindValue(): this.type = js.native
    
    /**
      * @SINCE 1.22
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Sets the DOM value of the input field and handles placeholder visibility.
      *
      * @returns `this` to allow method chaining.
      */
    def updateDomValue(/**
      * value of the input field.
      */
    sValue: String): this.type = js.native
  }
  
  trait InputBaseSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.90
      *
      * Association to controls / IDs that describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.27.0
      *
      * Association to controls / IDs that label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Is fired when the text in the input field has changed and the focus leaves the input field or the enter
      * key is pressed.
      */
    var change: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.12.0
      *
      * Defines whether the control can be modified by the user or not. **Note:** A user can tab to non-editable
      * control, highlight it, and copy the text from it.
      */
    var editable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Indicates whether the user can interact with the control or not. **Note:** Disabled controls cannot be
      * focused and they are out of the tab-chain.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.78
      * @EXPERIMENTAL (since 1.78) - This aggregation is experimental and provides only limited functionality.
      * Also the API might be changed in future.
      *
      * Defines the formatted text that appears in the value state message pop-up. It can include links. If both
      * `valueStateText` and `formattedValueStateText` are set - the latter is shown.
      */
    var formattedValueStateText: js.UndefOr[typings.openui5.sapMFormattedTextMod.default] = js.undefined
    
    /**
      * The name to be used in the HTML code (for example, for HTML forms that send data to the server via submission).
      */
    var name: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines a short hint intended to aid the user with data entry when the control has no value.
      */
    var placeholder: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.38.4
      *
      * Indicates that user input is required. This property is only needed for accessibility purposes when a
      * single relationship between the field and a label (see aggregation `labelFor` of `sap.m.Label`) cannot
      * be established (e.g. one label should label multiple fields).
      */
    var required: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.26.0
      *
      * Indicates whether the value state message should be shown or not.
      */
    var showValueStateMessage: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.26.0
      *
      * Defines the horizontal alignment of the text that is shown inside the input field.
      */
    var textAlign: js.UndefOr[
        TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.28.0
      *
      * Defines the text directionality of the input field, e.g. `RTL`, `LTR`
      */
    var textDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the value of the control.
      */
    var value: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Visualizes the validation state of the control, e.g. `Error`, `Warning`, `Success`.
      */
    var valueState: js.UndefOr[
        ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.26.0
      *
      * Defines the text that appears in the value state message pop-up. If this is not specified, a default
      * text is shown from the resource bundle.
      */
    var valueStateText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the width of the control.
      *
      * **Note:** If the provided width is too small, the control gets stretched to its min width, which is needed
      * in order for the control to be usable and well aligned.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object InputBaseSettings {
    
    inline def apply(): InputBaseSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputBaseSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputBaseSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setEditable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFormattedValueStateText(value: typings.openui5.sapMFormattedTextMod.default): Self = StObject.set(x, "formattedValueStateText", value.asInstanceOf[js.Any])
      
      inline def setFormattedValueStateTextUndefined: Self = StObject.set(x, "formattedValueStateText", js.undefined)
      
      inline def setName(value: String | PropertyBindingInfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPlaceholder(value: String | PropertyBindingInfo): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRequired(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setShowValueStateMessage(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showValueStateMessage", value.asInstanceOf[js.Any])
      
      inline def setShowValueStateMessageUndefined: Self = StObject.set(x, "showValueStateMessage", js.undefined)
      
      inline def setTextAlign(
        value: TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
      
      inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
      
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
    }
  }
}
