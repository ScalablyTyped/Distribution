package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.IOverflowToolbarContent
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.openui5.sapUiCoreLibraryMod.ISemanticFormContent
import typings.openui5.sapUiCoreLibraryMod.Label
import typings.openui5.sapUiCoreLibraryMod.TextAlign
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.openui5.sapUiCoreLibraryMod.ValueState
import typings.openui5.sapUiMdcControlMod.ControlSettings
import typings.openui5.sapUiMdcEnumsBaseTypeMod.BaseType
import typings.openui5.sapUiMdcEnumsFieldDisplayMod.FieldDisplay
import typings.openui5.sapUiMdcEnumsFieldEditModeMod.FieldEditMode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcFieldFieldBaseMod {
  
  @JSImport("sap/ui/mdc/field/FieldBase", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `FieldBase`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FieldBase {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: FieldBaseSettings) = this()
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
    mSettings: FieldBaseSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: FieldBaseSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_m_IOverflowToolbarContent: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_ISemanticFormContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/field/FieldBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.field.FieldBase with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.mdc.Control.extend}.
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
    oClassInfo: ClassInfo[T, FieldBase]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FieldBase],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.field.FieldBase.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FieldBase
    extends typings.openui5.sapUiMdcControlMod.default
       with IFormContent
       with ISemanticFormContent
       with IOverflowToolbarContent {
    
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
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.ui.mdc.field.FieldBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.field.FieldBase` itself.
      *
      * This event is fired when the value of the field is changed, for example, each time a key is pressed.
      *
      * **Note** This event is only triggered if the used content control has a `liveChange` event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FieldBaseLiveChangeEvent, Unit]
    ): this.type = js.native
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FieldBaseLiveChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.field.FieldBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.ui.mdc.field.FieldBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.field.FieldBase` itself.
      *
      * This event is fired when the value of the field is changed, for example, each time a key is pressed.
      *
      * **Note** This event is only triggered if the used content control has a `liveChange` event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLiveChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FieldBaseLiveChangeEvent, Unit]
    ): this.type = js.native
    def attachLiveChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FieldBaseLiveChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.field.FieldBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.ui.mdc.field.FieldBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.field.FieldBase` itself.
      *
      * This event is fired if the inner control has a press event and this is fired.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.field.FieldBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.ui.mdc.field.FieldBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.field.FieldBase` itself.
      *
      * This event is fired if the inner control has a press event and this is fired.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.field.FieldBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.82.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:submit submit} event of this `sap.ui.mdc.field.FieldBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.field.FieldBase` itself.
      *
      * This event is fired when the user presses Enter. It allows the application to implement some
      * submit logic.
      *
      * **Note** This event is only triggered if the field is editable.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSubmit(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FieldBaseSubmitEvent, Unit]
    ): this.type = js.native
    def attachSubmit(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FieldBaseSubmitEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.field.FieldBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.82.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:submit submit} event of this `sap.ui.mdc.field.FieldBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.field.FieldBase` itself.
      *
      * This event is fired when the user presses Enter. It allows the application to implement some
      * submit logic.
      *
      * **Note** This event is only triggered if the field is editable.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSubmit(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FieldBaseSubmitEvent, Unit]
    ): this.type = js.native
    def attachSubmit(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FieldBaseSubmitEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.field.FieldBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds property {@link #getConditions conditions} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindProperty ManagedObject.bindProperty} for a detailed description
      * of the possible properties of `oBindingInfo`
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindConditions(/**
      * The binding information
      */
    oBindingInfo: PropertyBindingInfo): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Checks if all needed information is provided to create the internal content control. If possible create
      * internal controls.
      */
    def checkCreateInternalContent(): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * If the value is the initial value of the type (String types) and the field does not show tokens or operators,
      * no condition must be set as the field is then empty.
      *
      * @returns true if value is initial
      */
    def checkValueInitial(/**
      * Value to be checked
      */
    vValue: Any): Boolean = js.native
    
    /**
      * @since 1.62.0
      *
      * Assigns a `Label` control to the {@link sap.ui.mdc.Field Field}, {@link sap.ui.mdc.MultiValueField MultiValueField},
      * or {@link sap.ui.mdc.FilterField FilterField} controls.
      *
      * The text of the label is taken from the {@link sap.ui.mdc.Field Field}, {@link sap.ui.mdc.MultiValueField MultiValueField},
      * or {@link sap.ui.mdc.FilterField FilterField} controls. The `labelFor` association is set to the {@link sap.ui.mdc.Field Field},
      * {@link sap.ui.mdc.MultiValueField MultiValueField}, or {@link sap.ui.mdc.FilterField FilterField} control.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def connectLabel(/**
      * Label control
      */
    oLabel: Label): this.type = js.native
    
    /**
      * Destroys the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * @since 1.61.0
      *
      * Destroys the contentDisplay in the aggregation {@link #getContentDisplay contentDisplay}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContentDisplay(): this.type = js.native
    
    /**
      * @since 1.61.0
      *
      * Destroys the contentEdit in the aggregation {@link #getContentEdit contentEdit}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContentEdit(): this.type = js.native
    
    /**
      * Destroys the fieldInfo in the aggregation {@link #getFieldInfo fieldInfo}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFieldInfo(): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Destroys the internal content controls.
      */
    def destroyInternalContent(): Unit = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:liveChange liveChange} event of this `sap.ui.mdc.field.FieldBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLiveChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FieldBaseLiveChangeEvent, Unit]
    ): this.type = js.native
    def detachLiveChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FieldBaseLiveChangeEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.ui.mdc.field.FieldBase`.
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
      * @since 1.82.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:submit submit} event of this `sap.ui.mdc.field.FieldBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSubmit(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FieldBaseSubmitEvent, Unit]
    ): this.type = js.native
    def detachSubmit(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FieldBaseSubmitEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Here inheriting controls need to fire the control-specific change event.
      */
    def fireChangeEvent(): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:liveChange liveChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLiveChange(): this.type = js.native
    def fireLiveChange(
      /**
      * Parameters to pass along with the event
      */
    mParameters: FieldBase$LiveChangeEventParameters
    ): this.type = js.native
    
    /**
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
      * @since 1.82.0
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:submit submit} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSubmit(): this.type = js.native
    def fireSubmit(/**
      * Parameters to pass along with the event
      */
    mParameters: FieldBase$SubmitEventParameters): this.type = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Determines the `BaseType` of the currently used data type.
      *
      * @returns BaseType
      */
    def getBaseType(): BaseType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BaseType * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getConditions conditions}.
      *
      * Sets the conditions that represent the values of the field.
      *
      * These should be bound to a {@link sap.ui.mdc.condition.ConditionModel ConditionModel} using the corresponding
      * `fieldPath`.
      *
      * **Note:** For {@link sap.ui.mdc.FilterField FilterField} controls, the `conditions` property must be
      * used to bind {@link sap.ui.mdc.FilterField FilterField} to a {@link sap.ui.mdc.condition.ConditionModel ConditionModel}.
      *  For example, for a {@link sap.ui.mdc.FilterField FilterField} control inside a {@link sap.ui.mdc.FilterBar FilterBar }
      * control, the binding looks like this:
      *  `conditions="{$filters>/conditions/propertyPath}"` with the following data:
      * 	 - `$filters` as the name of the condition model
      * 	 - `/conditions/` as a required static part of the binding
      * 	 - `propertyPath` as the property name
      *
      * **Note:** A condition must have the structure of {@link sap.ui.mdc.condition.ConditionObject ConditionObject}.
      *
      * Default value is `[]`.
      *
      * @returns Value of property `conditions`
      */
    def getConditions(): js.Array[js.Object] = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Optional content that can be rendered.
      *
      * Per default, depending on `editMode`, `multipleLines` and the used data type, a content control is rendered.
      * For simple string types, a {@link sap.m.Text Text} control is rendered in display mode and a {@link sap.m.Input Input }
      * control in edit mode. If a control is assigned in the `content` aggregation, this will be rendered instead.
      *
      * **Note:** Bind the value-holding property of the control to `'$field>/conditions'` using {@link sap.ui.mdc.field.ConditionsType ConditionsType }
      * as type.
      *
      * If the control needs to show multiple conditions, bind its aggregation to '$field>/conditions'.
      * Bind the item controls value-holding property using {@link sap.ui.mdc.field.ConditionType ConditionType }
      * as type.
      *
      * **Warning:** Only controls allowed in a {@link sap.ui.layout.form.Form Form} are allowed to be used for
      * this optional content. Other controls might break the layout. This means the {@link sap.ui.core.IFormContent IFormContent }
      * interface needs to be implemented by these controls.
      */
    def getContent(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * @since 1.61.0
      *
      * Gets content of aggregation {@link #getContentDisplay contentDisplay}.
      *
      * Optional content to be rendered if the `editMode` property is set to `Display`.
      *
      * Per default, depending on `multipleLines` and the used data type, a content control is rendered in display
      * mode. For simple string types, a {@link sap.m.Text Text} control is rendered in display mode. If a control
      * is assigned in the `contentDisplay` aggregation, this will be rendered instead.
      *
      * **Note:** If a control is assigned to the `content` aggregation, this one is ignored.
      *
      * **Note:** Bind the value-holding property of the control to `'$field>/conditions'` using {@link sap.ui.mdc.field.ConditionsType ConditionsType }
      * as type.
      *
      * If the control needs to show multiple conditions, bind its aggregation to '$field>/conditions'.
      * Bind the item controls value-holding property using {@link sap.ui.mdc.field.ConditionType ConditionType }
      * as type.
      *
      * **Warning:** Only controls allowed in a {@link sap.ui.layout.form.Form Form} are allowed to be used for
      * this optional content. Other controls might break the layout. This means the {@link sap.ui.core.IFormContent IFormContent }
      * interface needs to be implemented by these controls.
      */
    def getContentDisplay(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * @since 1.61.0
      *
      * Gets content of aggregation {@link #getContentEdit contentEdit}.
      *
      * Optional content to be rendered if the `editMode` property is not set to `Display`.
      *
      * Per default, depending on `multipleLines` and the used data type, a content control is rendered in edit
      * mode. For simple string types, an {@link sap.m.Input Input} control is rendered in edit mode. If a control
      * is assigned in the `contentEdit` aggregation, this will be rendered instead.
      *
      * **Note:** If a control is assigned to the `content` aggregation, this one is ignored.
      *
      * **Note:** Bind the value-holding property of the control to `'$field>/conditions'` using {@link sap.ui.mdc.field.ConditionsType ConditionsType }
      * as type.
      *
      * If the control needs to show multiple conditions, bind its aggregation to '$field>/conditions'.
      * Bind the item controls value-holding property using {@link sap.ui.mdc.field.ConditionType ConditionType }
      * as type.
      *
      * **Warning:** Only controls allowed in a {@link sap.ui.layout.form.Form Form} are allowed to be used for
      * this optional content. Other controls might break the layout. This means the {@link sap.ui.core.IFormContent IFormContent }
      * interface needs to be implemented by these controls.
      */
    def getContentEdit(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      *
      * @returns oContentFactory the ContentFactory of the Field
      */
    def getContentFactory(): Any = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets the currently used content controls.
      *
      * @returns Array of content controls
      */
    def getCurrentContent(): js.Array[/* was: sap.ui.core.Conterol */ Any] = js.native
    
    /**
      * Gets current value of property {@link #getDataType dataType}.
      *
      * The type of data handled by the field. This type is used to parse, format, and validate the value.
      *
      * Default value is `'sap.ui.model.type.String'`.
      *
      * @returns Value of property `dataType`
      */
    def getDataType(): String = js.native
    
    /**
      * Gets current value of property {@link #getDataTypeConstraints dataTypeConstraints}.
      *
      * The constraints of the type specified in `dataType`.
      *
      * @returns Value of property `dataTypeConstraints`
      */
    def getDataTypeConstraints(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getDataTypeFormatOptions dataTypeFormatOptions}.
      *
      * The format options of the type specified in `dataType`.
      *
      * @returns Value of property `dataTypeFormatOptions`
      */
    def getDataTypeFormatOptions(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getDisplay display}.
      *
      * Defines whether the value and/or description of the field is shown and in which order.
      *
      * Default value is `Value`.
      *
      * @returns Value of property `display`
      */
    def getDisplay(): FieldDisplay | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldDisplay * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getEditMode editMode}.
      *
      * Determines whether the field is editable, read-only, or disabled.
      *
      * Default value is `Editable`.
      *
      * @returns Value of property `editMode`
      */
    def getEditMode(): FieldEditMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldEditMode * / any */ String) = js.native
    
    /**
      * @deprecated (since 1.114.0) - replaced by {@link #setValueHelp valueHelp} association
      *
      * ID of the element which is the current target of the association {@link #getFieldHelp fieldHelp}, or
      * `null`.
      */
    def getFieldHelp(): ID = js.native
    
    /**
      * Gets content of aggregation {@link #getFieldInfo fieldInfo}.
      *
      * Optional `FieldInfo` used for detail information. This is only active in display mode. Especially {@link sap.ui.mdc.Link }
      * can be used to activate link features.
      *
      * **Note:** If a special data type is defined or a content control is set, this is ignored.
      */
    def getFieldInfo(): typings.openui5.sapUiMdcFieldFieldInfoBaseMod.default = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Provides some internals of the field to be used in {@link sap.ui.mdc.field.ConditionsType ConditionsType }
      * for format and parse the conditions.
      *
      * @returns formatOptions of the field (see {@link sap.ui.mdc.field.ConditionsType ConditionsType})
      */
    def getFormatOptions(): js.Object = js.native
    
    /**
      * @since 1.62.0
      *
      * Gets current value of property {@link #getLabel label}.
      *
      * Defines the label text for the field.
      *
      * This can be used by {@link sap.ui.mdc.FilterBar FilterBar} or {@link sap.ui.layout.form.Form Form} controls
      * to create a {@link sap.m.Label Label} control for the field.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `label`
      */
    def getLabel(): String = js.native
    
    /**
      * Gets current value of property {@link #getMaxConditions maxConditions}.
      *
      * Sets the maximum number of conditions that are allowed for this field.
      *
      * The default value of -1 indicates that an unlimited number of conditions can be defined.
      *
      * **Note** If the data type used doesn't support multiple conditions, an error is thrown.
      *
      * Default value is `-1`.
      *
      * @returns Value of property `maxConditions`
      */
    def getMaxConditions(): int = js.native
    
    /**
      * Gets current value of property {@link #getMultipleLines multipleLines}.
      *
      * If set, the `Field` is rendered using a multi-line control.
      *
      * This property only affects types that support multiple lines.
      *
      * This property is only used for single-value fields.
      *
      * **Note** If the data type used doesn't support multiple lines, an error is thrown.
      *
      * Default value is `false`.
      *
      * @returns Value of property `multipleLines`
      */
    def getMultipleLines(): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Required by the {@link sap.m.IOverflowToolbarContent} interface. Registers invalidations event that is
      * fired when width of the control is changed.
      *
      * @returns Configuration information for the `sap.m.IOverflowToolbarContent` interface.
      */
    def getOverflowToolbarConfig(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getPlaceholder placeholder}.
      *
      * Defines a short hint intended to help the user with the data entry when the control has no value. If
      * the value is `null`, no placeholder is shown.
      *
      * **Note:** If the rendered control doesn't support this feature, this property is ignored.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `placeholder`
      */
    def getPlaceholder(): String = js.native
    
    /**
      * Gets current value of property {@link #getRequired required}.
      *
      * Indicates that user input is required.
      *
      * Default value is `false`.
      *
      * @returns Value of property `required`
      */
    def getRequired(): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Determines, based on conditions, the value returned by the `change` event.
      *
      * @returns control-dependent value for `change` event
      */
    def getResultForChangePromise(
      /**
      * Array of conditions
      */
    aConditions: js.Array[typings.openui5.sapUiMdcFieldConditionTypeMod.default]
    ): Any = js.native
    
    /**
      * @since 1.85.0
      *
      * Gets current value of property {@link #getShowEmptyIndicator showEmptyIndicator}.
      *
      * If set, an empty `Field` renders an empty indicator in display mode.
      *
      * This property only takes effect if `editMode` is set to `Display`.
      *
      * **Note** Empty means the `Field` holds no value. If an empty string is a valid value, the `Field` might
      * show nothing, depending on the `display` settings and assigned description or `FieldHelp`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showEmptyIndicator`
      */
    def getShowEmptyIndicator(): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the supported operators.
      *
      * Needs to be overwritten by {@link sap.ui.mdc.Field Field}, {@link sap.ui.mdc.MultiValueField MultiValueField }
      * and {@link sap.ui.mdc.FilterField FilterField}
      *
      * @returns Array of operator names
      */
    def getSupportedOperators(): js.Array[String] = js.native
    
    /**
      * Gets current value of property {@link #getTextAlign textAlign}.
      *
      * Defines the horizontal alignment of the text that is shown inside the input field.
      *
      * **Note:** If the rendered control doesn't support this feature, this property is ignored.
      *
      * Default value is `Initial`.
      *
      * @returns Value of property `textAlign`
      */
    def getTextAlign(): TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getTextDirection textDirection}.
      *
      * Defines the text directionality of the input field, for example, `RTL` or `LTR`.
      *
      * **Note:** If the rendered control doesn't support this feature, this property is ignored.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `textDirection`
      */
    def getTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Provides some internals of the unit part of the field to be used in {@link sap.ui.mdc.field.ConditionsType ConditionsType }
      * for format and parse the conditions.
      *
      * @returns formatOptions of the field (see {@link sap.ui.mdc.field.ConditionsType ConditionsType})
      */
    def getUnitFormatOptions(): js.Object = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getValueHelp valueHelp}, or
      * `null`.
      */
    def getValueHelp(): ID = js.native
    
    /**
      * Gets current value of property {@link #getValueState valueState}.
      *
      * Visualizes the validation state of the control, for example, `Error`, `Warning` or `Success`.
      *
      * **Note:** The visualization of the `ValueState` property is handled by the inner rendered control. If
      * a control is set (using `content`, `contentEdit`, or `contentDisplay`), this control needs to support
      * the `valueState` behavior, otherwise `valueState` is not visualized.
      *
      * Default value is `None`.
      *
      * @returns Value of property `valueState`
      */
    def getValueState(): ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getValueStateText valueStateText}.
      *
      * Defines the text that appears in the value state message pop-up. If this has not been specified, a default
      * text from the resource bundle is shown.
      *
      * @returns Value of property `valueStateText`
      */
    def getValueStateText(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Handler of the `ModelContextChange` event.
      */
    def handleModelContextChange(/**
      * event
      */
    oEvent: js.Object): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Initializes internal data-types and dependent objects.
      */
    def initDataType(): Unit = js.native
    
    /**
      * @since 1.115.0
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Checks if the field is already destoyed or destruction has started.
      *
      * In this casse creation of internal content or binding must be prevented.
      *
      * @returns True if destroyed or destruction has been started
      */
    def isFieldDestroyed(): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns whether the given property value is initial and has not been explicitly set or no binding exist.
      * Even after setting the default value or setting null/undefined (which also causes the default value to
      * be set), the property is no longer initial. A property can be reset to initial state by calling `resetProperty(sPropertyName)`.
      *
      * @returns true if the property is initial
      */
    def isFieldPropertyInitial(/**
      * the name of the property
      */
    sPropertyName: String): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Checks if there is invalid input.
      *
      * @returns True if there is invalid input
      */
    def isInvalidInput(): Boolean = js.native
    
    /**
      * @since 1.115.0
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Checks if the field is configured to be a `SearchField`
      *
      * Needs to be overwritten by {@link sap.ui.mdc.Field Field}, {@link sap.ui.mdc.MultiValueField MultiValueField},
      * and {@link sap.ui.mdc.FilterField FilterField}
      *
      * @returns True if configures as search field
      */
    def isSearchField(): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Observes changes.
      *
      * To be enhanced by {@link sap.ui.mdc.Field Field}, {@link sap.ui.mdc.MultiValueField MultiValueField},
      * {@link sap.ui.mdc.FilterField FilterField}, or other inherited controls.
      */
    def observeChanges(/**
      * Changes
      */
    oChanges: js.Object): Unit = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
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
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Resets invalid input information.
      *
      * Might be called if Binding changes or field is initialized.
      */
    def resetInvalidInput(): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getConditions conditions}.
      *
      * Sets the conditions that represent the values of the field.
      *
      * These should be bound to a {@link sap.ui.mdc.condition.ConditionModel ConditionModel} using the corresponding
      * `fieldPath`.
      *
      * **Note:** For {@link sap.ui.mdc.FilterField FilterField} controls, the `conditions` property must be
      * used to bind {@link sap.ui.mdc.FilterField FilterField} to a {@link sap.ui.mdc.condition.ConditionModel ConditionModel}.
      *  For example, for a {@link sap.ui.mdc.FilterField FilterField} control inside a {@link sap.ui.mdc.FilterBar FilterBar }
      * control, the binding looks like this:
      *  `conditions="{$filters>/conditions/propertyPath}"` with the following data:
      * 	 - `$filters` as the name of the condition model
      * 	 - `/conditions/` as a required static part of the binding
      * 	 - `propertyPath` as the property name
      *
      * **Note:** A condition must have the structure of {@link sap.ui.mdc.condition.ConditionObject ConditionObject}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `[]`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setConditions(): this.type = js.native
    def setConditions(/**
      * New value for property `conditions`
      */
    sConditions: js.Array[js.Object]): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContent(/**
      * The content to set
      */
    oContent: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * @since 1.61.0
      *
      * Sets the aggregated {@link #getContentDisplay contentDisplay}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContentDisplay(
      /**
      * The contentDisplay to set
      */
    oContentDisplay: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * @since 1.61.0
      *
      * Sets the aggregated {@link #getContentEdit contentEdit}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContentEdit(/**
      * The contentEdit to set
      */
    oContentEdit: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDataType dataType}.
      *
      * The type of data handled by the field. This type is used to parse, format, and validate the value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'sap.ui.model.type.String'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDataType(): this.type = js.native
    def setDataType(/**
      * New value for property `dataType`
      */
    sDataType: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDataTypeConstraints dataTypeConstraints}.
      *
      * The constraints of the type specified in `dataType`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDataTypeConstraints(): this.type = js.native
    def setDataTypeConstraints(/**
      * New value for property `dataTypeConstraints`
      */
    oDataTypeConstraints: js.Object): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDataTypeFormatOptions dataTypeFormatOptions}.
      *
      * The format options of the type specified in `dataType`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDataTypeFormatOptions(): this.type = js.native
    def setDataTypeFormatOptions(/**
      * New value for property `dataTypeFormatOptions`
      */
    oDataTypeFormatOptions: js.Object): this.type = js.native
    
    /**
      * @since 1.72.0
      * @experimental
      *
      * Sets a new value for property {@link #getDelegate delegate}.
      *
      * Path to `FieldBaseDelegate` module that provides the required APIs to execute model-specific logic.
      *  **Note:** Ensure that the related file can be requested (any required library has to be loaded before
      * that).
      *  Do not bind or modify the module. Once the required module is associated, this property might not be
      * needed any longer.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `...see text or source`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDelegate(): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDisplay display}.
      *
      * Defines whether the value and/or description of the field is shown and in which order.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Value`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplay(): this.type = js.native
    def setDisplay(
      /**
      * New value for property `display`
      */
    sDisplay: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldDisplay * / any */ String
    ): this.type = js.native
    def setDisplay(/**
      * New value for property `display`
      */
    sDisplay: FieldDisplay): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEditMode editMode}.
      *
      * Determines whether the field is editable, read-only, or disabled.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Editable`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEditMode(): this.type = js.native
    def setEditMode(
      /**
      * New value for property `editMode`
      */
    sEditMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldEditMode * / any */ String
    ): this.type = js.native
    def setEditMode(/**
      * New value for property `editMode`
      */
    sEditMode: FieldEditMode): this.type = js.native
    
    /**
      * @deprecated (since 1.114.0) - replaced by {@link #setValueHelp valueHelp} association
      *
      * Sets the associated {@link #getFieldHelp fieldHelp}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFieldHelp(
      /**
      * ID of an element which becomes the new target of this fieldHelp association; alternatively, an element
      * instance may be given
      */
    oFieldHelp: ID
    ): this.type = js.native
    def setFieldHelp(
      /**
      * ID of an element which becomes the new target of this fieldHelp association; alternatively, an element
      * instance may be given
      */
    oFieldHelp: typings.openui5.sapUiMdcValueHelpMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getFieldInfo fieldInfo}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFieldInfo(
      /**
      * The fieldInfo to set
      */
    oFieldInfo: typings.openui5.sapUiMdcFieldFieldInfoBaseMod.default
    ): this.type = js.native
    
    /**
      * @since 1.62.0
      *
      * Sets a new value for property {@link #getLabel label}.
      *
      * Defines the label text for the field.
      *
      * This can be used by {@link sap.ui.mdc.FilterBar FilterBar} or {@link sap.ui.layout.form.Form Form} controls
      * to create a {@link sap.m.Label Label} control for the field.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabel(): this.type = js.native
    def setLabel(/**
      * New value for property `label`
      */
    sLabel: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxConditions maxConditions}.
      *
      * Sets the maximum number of conditions that are allowed for this field.
      *
      * The default value of -1 indicates that an unlimited number of conditions can be defined.
      *
      * **Note** If the data type used doesn't support multiple conditions, an error is thrown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `-1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxConditions(): this.type = js.native
    def setMaxConditions(/**
      * New value for property `maxConditions`
      */
    iMaxConditions: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMultipleLines multipleLines}.
      *
      * If set, the `Field` is rendered using a multi-line control.
      *
      * This property only affects types that support multiple lines.
      *
      * This property is only used for single-value fields.
      *
      * **Note** If the data type used doesn't support multiple lines, an error is thrown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMultipleLines(): this.type = js.native
    def setMultipleLines(/**
      * New value for property `multipleLines`
      */
    bMultipleLines: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPlaceholder placeholder}.
      *
      * Defines a short hint intended to help the user with the data entry when the control has no value. If
      * the value is `null`, no placeholder is shown.
      *
      * **Note:** If the rendered control doesn't support this feature, this property is ignored.
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
      * Sets a new value for property {@link #getRequired required}.
      *
      * Indicates that user input is required.
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
      * @since 1.85.0
      *
      * Sets a new value for property {@link #getShowEmptyIndicator showEmptyIndicator}.
      *
      * If set, an empty `Field` renders an empty indicator in display mode.
      *
      * This property only takes effect if `editMode` is set to `Display`.
      *
      * **Note** Empty means the `Field` holds no value. If an empty string is a valid value, the `Field` might
      * show nothing, depending on the `display` settings and assigned description or `FieldHelp`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowEmptyIndicator(): this.type = js.native
    def setShowEmptyIndicator(/**
      * New value for property `showEmptyIndicator`
      */
    bShowEmptyIndicator: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTextAlign textAlign}.
      *
      * Defines the horizontal alignment of the text that is shown inside the input field.
      *
      * **Note:** If the rendered control doesn't support this feature, this property is ignored.
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
      * Sets a new value for property {@link #getTextDirection textDirection}.
      *
      * Defines the text directionality of the input field, for example, `RTL` or `LTR`.
      *
      * **Note:** If the rendered control doesn't support this feature, this property is ignored.
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
      * Sets the associated {@link #getValueHelp valueHelp}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueHelp(
      /**
      * ID of an element which becomes the new target of this valueHelp association; alternatively, an element
      * instance may be given
      */
    oValueHelp: ID
    ): this.type = js.native
    def setValueHelp(
      /**
      * ID of an element which becomes the new target of this valueHelp association; alternatively, an element
      * instance may be given
      */
    oValueHelp: typings.openui5.sapUiMdcValueHelpMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValueState valueState}.
      *
      * Visualizes the validation state of the control, for example, `Error`, `Warning` or `Success`.
      *
      * **Note:** The visualization of the `ValueState` property is handled by the inner rendered control. If
      * a control is set (using `content`, `contentEdit`, or `contentDisplay`), this control needs to support
      * the `valueState` behavior, otherwise `valueState` is not visualized.
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
      * Sets a new value for property {@link #getValueStateText valueStateText}.
      *
      * Defines the text that appears in the value state message pop-up. If this has not been specified, a default
      * text from the resource bundle is shown.
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
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Triggers a check if all relevant properties are set to create the internal content control.
      *
      * To be sure that the check is not called multiple times, it needs to be checked if there is a pending
      * check. Multiple calls might happen if properties are changed often or the check is triggered during a
      * `BindingContext` update (which is often called in propagation).
      */
    def triggerCheckCreateInternalContent(): Unit = js.native
    
    /**
      * Unbinds property {@link #getConditions conditions} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindConditions(): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Triggers an update of the internal content controls.
      *
      * Should be called if properties are changed that might influence the content control.
      */
    def updateInternalContent(): Unit = js.native
  }
  
  trait FieldBase$LiveChangeEventParameters extends StObject {
    
    /**
      * Indicates that the ESC key triggered the event
      */
    var escPressed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The value of the input before pressing ESC key
      */
    var previousValue: js.UndefOr[String] = js.undefined
    
    /**
      * The new value of the input
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object FieldBase$LiveChangeEventParameters {
    
    inline def apply(): FieldBase$LiveChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldBase$LiveChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldBase$LiveChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setEscPressed(value: Boolean): Self = StObject.set(x, "escPressed", value.asInstanceOf[js.Any])
      
      inline def setEscPressedUndefined: Self = StObject.set(x, "escPressed", js.undefined)
      
      inline def setPreviousValue(value: String): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
      
      inline def setPreviousValueUndefined: Self = StObject.set(x, "previousValue", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait FieldBase$PressEventParameters extends StObject
  
  trait FieldBase$SubmitEventParameters extends StObject {
    
    /**
      * Returns a `Promise` for the change. The `Promise` returns the value if it is resolved. If the last `change`
      * event is synchronous, the `Promise` has already been resolved. If it is asynchronous, it will be resolved
      * after the value has been updated.
      */
    var promise: js.UndefOr[js.Promise[Any]] = js.undefined
  }
  object FieldBase$SubmitEventParameters {
    
    inline def apply(): FieldBase$SubmitEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldBase$SubmitEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldBase$SubmitEventParameters] (val x: Self) extends AnyVal {
      
      inline def setPromise(value: js.Promise[Any]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
    }
  }
  
  type FieldBaseLiveChangeEvent = typings.openui5.sapUiBaseEventMod.default[FieldBase$LiveChangeEventParameters]
  
  type FieldBaseLiveChangeEventParameters = FieldBase$LiveChangeEventParameters
  
  type FieldBasePressEvent = typings.openui5.sapUiBaseEventMod.default[FieldBase$PressEventParameters]
  
  type FieldBasePressEventParameters = FieldBase$PressEventParameters
  
  trait FieldBaseSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Association to controls / IDs that label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Sets the conditions that represent the values of the field.
      *
      * These should be bound to a {@link sap.ui.mdc.condition.ConditionModel ConditionModel} using the corresponding
      * `fieldPath`.
      *
      * **Note:** For {@link sap.ui.mdc.FilterField FilterField} controls, the `conditions` property must be
      * used to bind {@link sap.ui.mdc.FilterField FilterField} to a {@link sap.ui.mdc.condition.ConditionModel ConditionModel}.
      *  For example, for a {@link sap.ui.mdc.FilterField FilterField} control inside a {@link sap.ui.mdc.FilterBar FilterBar }
      * control, the binding looks like this:
      *  `conditions="{$filters>/conditions/propertyPath}"` with the following data:
      * 	 - `$filters` as the name of the condition model
      * 	 - `/conditions/` as a required static part of the binding
      * 	 - `propertyPath` as the property name
      *
      * **Note:** A condition must have the structure of {@link sap.ui.mdc.condition.ConditionObject ConditionObject}.
      */
    var conditions: js.UndefOr[
        js.Array[js.Object] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Optional content that can be rendered.
      *
      * Per default, depending on `editMode`, `multipleLines` and the used data type, a content control is rendered.
      * For simple string types, a {@link sap.m.Text Text} control is rendered in display mode and a {@link sap.m.Input Input }
      * control in edit mode. If a control is assigned in the `content` aggregation, this will be rendered instead.
      *
      * **Note:** Bind the value-holding property of the control to `'$field>/conditions'` using {@link sap.ui.mdc.field.ConditionsType ConditionsType }
      * as type.
      *
      * If the control needs to show multiple conditions, bind its aggregation to '$field>/conditions'.
      * Bind the item controls value-holding property using {@link sap.ui.mdc.field.ConditionType ConditionType }
      * as type.
      *
      * **Warning:** Only controls allowed in a {@link sap.ui.layout.form.Form Form} are allowed to be used for
      * this optional content. Other controls might break the layout. This means the {@link sap.ui.core.IFormContent IFormContent }
      * interface needs to be implemented by these controls.
      */
    var content: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * @since 1.61.0
      *
      * Optional content to be rendered if the `editMode` property is set to `Display`.
      *
      * Per default, depending on `multipleLines` and the used data type, a content control is rendered in display
      * mode. For simple string types, a {@link sap.m.Text Text} control is rendered in display mode. If a control
      * is assigned in the `contentDisplay` aggregation, this will be rendered instead.
      *
      * **Note:** If a control is assigned to the `content` aggregation, this one is ignored.
      *
      * **Note:** Bind the value-holding property of the control to `'$field>/conditions'` using {@link sap.ui.mdc.field.ConditionsType ConditionsType }
      * as type.
      *
      * If the control needs to show multiple conditions, bind its aggregation to '$field>/conditions'.
      * Bind the item controls value-holding property using {@link sap.ui.mdc.field.ConditionType ConditionType }
      * as type.
      *
      * **Warning:** Only controls allowed in a {@link sap.ui.layout.form.Form Form} are allowed to be used for
      * this optional content. Other controls might break the layout. This means the {@link sap.ui.core.IFormContent IFormContent }
      * interface needs to be implemented by these controls.
      */
    var contentDisplay: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * @since 1.61.0
      *
      * Optional content to be rendered if the `editMode` property is not set to `Display`.
      *
      * Per default, depending on `multipleLines` and the used data type, a content control is rendered in edit
      * mode. For simple string types, an {@link sap.m.Input Input} control is rendered in edit mode. If a control
      * is assigned in the `contentEdit` aggregation, this will be rendered instead.
      *
      * **Note:** If a control is assigned to the `content` aggregation, this one is ignored.
      *
      * **Note:** Bind the value-holding property of the control to `'$field>/conditions'` using {@link sap.ui.mdc.field.ConditionsType ConditionsType }
      * as type.
      *
      * If the control needs to show multiple conditions, bind its aggregation to '$field>/conditions'.
      * Bind the item controls value-holding property using {@link sap.ui.mdc.field.ConditionType ConditionType }
      * as type.
      *
      * **Warning:** Only controls allowed in a {@link sap.ui.layout.form.Form Form} are allowed to be used for
      * this optional content. Other controls might break the layout. This means the {@link sap.ui.core.IFormContent IFormContent }
      * interface needs to be implemented by these controls.
      */
    var contentEdit: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * The type of data handled by the field. This type is used to parse, format, and validate the value.
      */
    var dataType: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The constraints of the type specified in `dataType`.
      */
    var dataTypeConstraints: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The format options of the type specified in `dataType`.
      */
    var dataTypeFormatOptions: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the value and/or description of the field is shown and in which order.
      */
    var display: js.UndefOr[
        FieldDisplay | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldDisplay * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines whether the field is editable, read-only, or disabled.
      */
    var editMode: js.UndefOr[
        FieldEditMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldEditMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @deprecated (since 1.114.0) - replaced by {@link #setValueHelp valueHelp} association
      *
      * Optional `FieldHelp`.
      *
      * This is an association that allows the usage of one `ValueHelp` instance for multiple fields.
      *
      * **Note:** If the field is inside of a table, do not set the `ValueHelp` instance as `dependent` to the
      * field. If you do, every field instance in every table row gets a clone of it. Put the `ValueHelp` instance
      * e.g. as dependent on the table or page. The `FieldHelp` instance must be somewhere in the control tree,
      * otherwise there might be rendering or update issues.
      *
      * **Note:** For `Boolean` fields, no `ValueHelp` should be added, but a default `ValueHelp` used instead.
      */
    var fieldHelp: js.UndefOr[typings.openui5.sapUiMdcValueHelpMod.default | String] = js.undefined
    
    /**
      * Optional `FieldInfo` used for detail information. This is only active in display mode. Especially {@link sap.ui.mdc.Link }
      * can be used to activate link features.
      *
      * **Note:** If a special data type is defined or a content control is set, this is ignored.
      */
    var fieldInfo: js.UndefOr[typings.openui5.sapUiMdcFieldFieldInfoBaseMod.default] = js.undefined
    
    /**
      * @since 1.62.0
      *
      * Defines the label text for the field.
      *
      * This can be used by {@link sap.ui.mdc.FilterBar FilterBar} or {@link sap.ui.layout.form.Form Form} controls
      * to create a {@link sap.m.Label Label} control for the field.
      */
    var label: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * This event is fired when the value of the field is changed, for example, each time a key is pressed.
      *
      * **Note** This event is only triggered if the used content control has a `liveChange` event.
      */
    var liveChange: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[FieldBase$LiveChangeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Sets the maximum number of conditions that are allowed for this field.
      *
      * The default value of -1 indicates that an unlimited number of conditions can be defined.
      *
      * **Note** If the data type used doesn't support multiple conditions, an error is thrown.
      */
    var maxConditions: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * If set, the `Field` is rendered using a multi-line control.
      *
      * This property only affects types that support multiple lines.
      *
      * This property is only used for single-value fields.
      *
      * **Note** If the data type used doesn't support multiple lines, an error is thrown.
      */
    var multipleLines: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines a short hint intended to help the user with the data entry when the control has no value. If
      * the value is `null`, no placeholder is shown.
      *
      * **Note:** If the rendered control doesn't support this feature, this property is ignored.
      */
    var placeholder: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * This event is fired if the inner control has a press event and this is fired.
      */
    var press: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Indicates that user input is required.
      */
    var required: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.85.0
      *
      * If set, an empty `Field` renders an empty indicator in display mode.
      *
      * This property only takes effect if `editMode` is set to `Display`.
      *
      * **Note** Empty means the `Field` holds no value. If an empty string is a valid value, the `Field` might
      * show nothing, depending on the `display` settings and assigned description or `FieldHelp`.
      */
    var showEmptyIndicator: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.82.0
      *
      * This event is fired when the user presses Enter. It allows the application to implement some
      * submit logic.
      *
      * **Note** This event is only triggered if the field is editable.
      */
    var submit: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[FieldBase$SubmitEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Defines the horizontal alignment of the text that is shown inside the input field.
      *
      * **Note:** If the rendered control doesn't support this feature, this property is ignored.
      */
    var textAlign: js.UndefOr[
        TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the text directionality of the input field, for example, `RTL` or `LTR`.
      *
      * **Note:** If the rendered control doesn't support this feature, this property is ignored.
      */
    var textDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Optional `ValueHelp`.
      *
      * This is an association that allows the usage of one `ValueHelp` instance for multiple fields.
      *
      * **Note:** If the field is inside of a table, do not set the `ValueHelp` instance as `dependent` to the
      * field. If you do, every field instance in every table row gets a clone of it. Put the `ValueHelp` instance
      * e.g. as dependent on the table or page. The `ValueHelp` instance must be somewhere in the control tree,
      * otherwise there might be rendering or update issues.
      *
      * **Note:** For `Boolean` fields, no `ValueHelp` should be added, but a default `ValueHelp` used instead.
      */
    var valueHelp: js.UndefOr[typings.openui5.sapUiMdcValueHelpMod.default | String] = js.undefined
    
    /**
      * Visualizes the validation state of the control, for example, `Error`, `Warning` or `Success`.
      *
      * **Note:** The visualization of the `ValueState` property is handled by the inner rendered control. If
      * a control is set (using `content`, `contentEdit`, or `contentDisplay`), this control needs to support
      * the `valueState` behavior, otherwise `valueState` is not visualized.
      */
    var valueState: js.UndefOr[
        ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the text that appears in the value state message pop-up. If this has not been specified, a default
      * text from the resource bundle is shown.
      */
    var valueStateText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the width of the control.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object FieldBaseSettings {
    
    inline def apply(): FieldBaseSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldBaseSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldBaseSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setConditions(
        value: js.Array[js.Object] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setConditionsVarargs(value: js.Object*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setContent(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentDisplay(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "contentDisplay", value.asInstanceOf[js.Any])
      
      inline def setContentDisplayUndefined: Self = StObject.set(x, "contentDisplay", js.undefined)
      
      inline def setContentEdit(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "contentEdit", value.asInstanceOf[js.Any])
      
      inline def setContentEditUndefined: Self = StObject.set(x, "contentEdit", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDataType(value: String | PropertyBindingInfo): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setDataTypeConstraints(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "dataTypeConstraints", value.asInstanceOf[js.Any])
      
      inline def setDataTypeConstraintsUndefined: Self = StObject.set(x, "dataTypeConstraints", js.undefined)
      
      inline def setDataTypeFormatOptions(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "dataTypeFormatOptions", value.asInstanceOf[js.Any])
      
      inline def setDataTypeFormatOptionsUndefined: Self = StObject.set(x, "dataTypeFormatOptions", js.undefined)
      
      inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      inline def setDisplay(
        value: FieldDisplay | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldDisplay * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setEditMode(
        value: FieldEditMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldEditMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "editMode", value.asInstanceOf[js.Any])
      
      inline def setEditModeUndefined: Self = StObject.set(x, "editMode", js.undefined)
      
      inline def setFieldHelp(value: typings.openui5.sapUiMdcValueHelpMod.default | String): Self = StObject.set(x, "fieldHelp", value.asInstanceOf[js.Any])
      
      inline def setFieldHelpUndefined: Self = StObject.set(x, "fieldHelp", js.undefined)
      
      inline def setFieldInfo(value: typings.openui5.sapUiMdcFieldFieldInfoBaseMod.default): Self = StObject.set(x, "fieldInfo", value.asInstanceOf[js.Any])
      
      inline def setFieldInfoUndefined: Self = StObject.set(x, "fieldInfo", js.undefined)
      
      inline def setLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLiveChange(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[FieldBase$LiveChangeEventParameters] => Unit
      ): Self = StObject.set(x, "liveChange", js.Any.fromFunction1(value))
      
      inline def setLiveChangeUndefined: Self = StObject.set(x, "liveChange", js.undefined)
      
      inline def setMaxConditions(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxConditions", value.asInstanceOf[js.Any])
      
      inline def setMaxConditionsUndefined: Self = StObject.set(x, "maxConditions", js.undefined)
      
      inline def setMultipleLines(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "multipleLines", value.asInstanceOf[js.Any])
      
      inline def setMultipleLinesUndefined: Self = StObject.set(x, "multipleLines", js.undefined)
      
      inline def setPlaceholder(value: String | PropertyBindingInfo): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setRequired(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setShowEmptyIndicator(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showEmptyIndicator", value.asInstanceOf[js.Any])
      
      inline def setShowEmptyIndicatorUndefined: Self = StObject.set(x, "showEmptyIndicator", js.undefined)
      
      inline def setSubmit(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[FieldBase$SubmitEventParameters] => Unit
      ): Self = StObject.set(x, "submit", js.Any.fromFunction1(value))
      
      inline def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
      
      inline def setTextAlign(
        value: TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
      
      inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
      
      inline def setValueHelp(value: typings.openui5.sapUiMdcValueHelpMod.default | String): Self = StObject.set(x, "valueHelp", value.asInstanceOf[js.Any])
      
      inline def setValueHelpUndefined: Self = StObject.set(x, "valueHelp", js.undefined)
      
      inline def setValueState(
        value: ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "valueState", value.asInstanceOf[js.Any])
      
      inline def setValueStateText(value: String | PropertyBindingInfo): Self = StObject.set(x, "valueStateText", value.asInstanceOf[js.Any])
      
      inline def setValueStateTextUndefined: Self = StObject.set(x, "valueStateText", js.undefined)
      
      inline def setValueStateUndefined: Self = StObject.set(x, "valueState", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type FieldBaseSubmitEvent = typings.openui5.sapUiBaseEventMod.default[FieldBase$SubmitEventParameters]
  
  type FieldBaseSubmitEventParameters = FieldBase$SubmitEventParameters
}
