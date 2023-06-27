package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.EmptyIndicatorMode
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.openui5.sapUiCoreLibraryMod.TextAlign
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.openui5.sapUiCoreLibraryMod.ValueState
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMObjectNumberMod {
  
  @JSImport("sap/m/ObjectNumber", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ObjectNumber.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/object-display-elements/#-object-status Object Number}
    */
  open class default () extends ObjectNumber {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ObjectNumberSettings) = this()
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
    mSettings: ObjectNumberSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ObjectNumberSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ObjectNumber", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ObjectNumber with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, ObjectNumber]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectNumber],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ObjectNumber.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ObjectNumber
    extends typings.openui5.sapUiCoreControlMod.default
       with IFormContent {
    
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
      * @since 1.86
      *
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.ObjectNumber`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ObjectNumber` itself.
      *
      * Fires when the user clicks/taps on active `Object Number`.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ObjectNumber` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.86
      *
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.ObjectNumber`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ObjectNumber` itself.
      *
      * Fires when the user clicks/taps on active `Object Number`.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ObjectNumber` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.86
      *
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.m.ObjectNumber`.
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
      * @since 1.86
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
      * @since 1.86
      *
      * Gets current value of property {@link #getActive active}.
      *
      * Indicates if the `ObjectNumber` text and icon can be clicked/tapped by the user.
      *
      * **Note:** If you set this property to `true`, you have to set also the `number` or `unit` property.
      *
      * Default value is `false`.
      *
      * @returns Value of property `active`
      */
    def getActive(): Boolean = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getEmphasized emphasized}.
      *
      * Indicates if the object number should appear emphasized.
      *
      * Default value is `true`.
      *
      * @returns Value of property `emphasized`
      */
    def getEmphasized(): Boolean = js.native
    
    /**
      * @since 1.89
      *
      * Gets current value of property {@link #getEmptyIndicatorMode emptyIndicatorMode}.
      *
      * Specifies if an empty indicator should be displayed when there is no number.
      *
      * Default value is `Off`.
      *
      * @returns Value of property `emptyIndicatorMode`
      */
    def getEmptyIndicatorMode(): EmptyIndicatorMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EmptyIndicatorMode * / any */ String) = js.native
    
    /**
      * @since 1.86
      *
      * Gets current value of property {@link #getInverted inverted}.
      *
      * Determines whether the background color reflects the set `state` instead of the control's text.
      *
      * Default value is `false`.
      *
      * @returns Value of property `inverted`
      */
    def getInverted(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getNumber number}.
      *
      * Defines the number field.
      *
      * @returns Value of property `number`
      */
    def getNumber(): String = js.native
    
    /**
      * @deprecated (since 1.16.1) - replaced by `unit` property
      *
      * Gets current value of property {@link #getNumberUnit numberUnit}.
      *
      * Defines the number units qualifier.
      *
      * @returns Value of property `numberUnit`
      */
    def getNumberUnit(): String = js.native
    
    /**
      * Gets current value of property {@link #getState state}.
      *
      * Determines the object number's value state. Setting this state will cause the number to be rendered in
      * state-specific colors.
      *
      * Default value is `None`.
      *
      * @returns Value of property `state`
      */
    def getState(): ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getTextAlign textAlign}.
      *
      * Sets the horizontal alignment of the number and unit.
      *
      * Default value is `Begin`.
      *
      * @returns Value of property `textAlign`
      */
    def getTextAlign(): TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getTextDirection textDirection}.
      *
      * Available options for the number and unit text direction are LTR(left-to-right) and RTL(right-to-left).
      * By default, the control inherits the text direction from its parent control.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `textDirection`
      */
    def getTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * @since 1.16.1
      *
      * Gets current value of property {@link #getUnit unit}.
      *
      * Defines the number units qualifier. If numberUnit and unit are both set, the unit value is used.
      *
      * @returns Value of property `unit`
      */
    def getUnit(): String = js.native
    
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
    
    /**
      * @since 1.86
      *
      * Sets a new value for property {@link #getActive active}.
      *
      * Indicates if the `ObjectNumber` text and icon can be clicked/tapped by the user.
      *
      * **Note:** If you set this property to `true`, you have to set also the `number` or `unit` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setActive(): this.type = js.native
    def setActive(/**
      * New value for property `active`
      */
    bActive: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEmphasized emphasized}.
      *
      * Indicates if the object number should appear emphasized.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEmphasized(): this.type = js.native
    def setEmphasized(/**
      * New value for property `emphasized`
      */
    bEmphasized: Boolean): this.type = js.native
    
    /**
      * @since 1.89
      *
      * Sets a new value for property {@link #getEmptyIndicatorMode emptyIndicatorMode}.
      *
      * Specifies if an empty indicator should be displayed when there is no number.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Off`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEmptyIndicatorMode(): this.type = js.native
    def setEmptyIndicatorMode(
      /**
      * New value for property `emptyIndicatorMode`
      */
    sEmptyIndicatorMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EmptyIndicatorMode * / any */ String
    ): this.type = js.native
    def setEmptyIndicatorMode(/**
      * New value for property `emptyIndicatorMode`
      */
    sEmptyIndicatorMode: EmptyIndicatorMode): this.type = js.native
    
    /**
      * @since 1.86
      *
      * Sets a new value for property {@link #getInverted inverted}.
      *
      * Determines whether the background color reflects the set `state` instead of the control's text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInverted(): this.type = js.native
    def setInverted(/**
      * New value for property `inverted`
      */
    bInverted: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNumber number}.
      *
      * Defines the number field.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNumber(): this.type = js.native
    def setNumber(/**
      * New value for property `number`
      */
    sNumber: String): this.type = js.native
    
    /**
      * @deprecated (since 1.16.1) - replaced by `unit` property
      *
      * Sets a new value for property {@link #getNumberUnit numberUnit}.
      *
      * Defines the number units qualifier.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNumberUnit(): this.type = js.native
    def setNumberUnit(/**
      * New value for property `numberUnit`
      */
    sNumberUnit: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getState state}.
      *
      * Determines the object number's value state. Setting this state will cause the number to be rendered in
      * state-specific colors.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setState(): this.type = js.native
    def setState(
      /**
      * New value for property `state`
      */
    sState: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String
    ): this.type = js.native
    def setState(/**
      * New value for property `state`
      */
    sState: ValueState): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTextAlign textAlign}.
      *
      * Sets the horizontal alignment of the number and unit.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Begin`.
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
      * Available options for the number and unit text direction are LTR(left-to-right) and RTL(right-to-left).
      * By default, the control inherits the text direction from its parent control.
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
      * @since 1.16.1
      *
      * Sets a new value for property {@link #getUnit unit}.
      *
      * Defines the number units qualifier. If numberUnit and unit are both set, the unit value is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUnit(): this.type = js.native
    def setUnit(/**
      * New value for property `unit`
      */
    sUnit: String): this.type = js.native
  }
  
  trait ObjectNumber$PressEventParameters extends StObject
  
  type ObjectNumberPressEvent = typings.openui5.sapUiBaseEventMod.default[ObjectNumber$PressEventParameters]
  
  type ObjectNumberPressEventParameters = ObjectNumber$PressEventParameters
  
  trait ObjectNumberSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @since 1.86
      *
      * Indicates if the `ObjectNumber` text and icon can be clicked/tapped by the user.
      *
      * **Note:** If you set this property to `true`, you have to set also the `number` or `unit` property.
      */
    var active: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Association to controls / ids which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Indicates if the object number should appear emphasized.
      */
    var emphasized: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.89
      *
      * Specifies if an empty indicator should be displayed when there is no number.
      */
    var emptyIndicatorMode: js.UndefOr[
        EmptyIndicatorMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EmptyIndicatorMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.86
      *
      * Determines whether the background color reflects the set `state` instead of the control's text.
      */
    var inverted: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the number field.
      */
    var number: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @deprecated (since 1.16.1) - replaced by `unit` property
      *
      * Defines the number units qualifier.
      */
    var numberUnit: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.86
      *
      * Fires when the user clicks/taps on active `Object Number`.
      */
    var press: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Determines the object number's value state. Setting this state will cause the number to be rendered in
      * state-specific colors.
      */
    var state: js.UndefOr[
        ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Sets the horizontal alignment of the number and unit.
      */
    var textAlign: js.UndefOr[
        TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Available options for the number and unit text direction are LTR(left-to-right) and RTL(right-to-left).
      * By default, the control inherits the text direction from its parent control.
      */
    var textDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.16.1
      *
      * Defines the number units qualifier. If numberUnit and unit are both set, the unit value is used.
      */
    var unit: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object ObjectNumberSettings {
    
    inline def apply(): ObjectNumberSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectNumberSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectNumberSettings] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setEmphasized(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "emphasized", value.asInstanceOf[js.Any])
      
      inline def setEmphasizedUndefined: Self = StObject.set(x, "emphasized", js.undefined)
      
      inline def setEmptyIndicatorMode(
        value: EmptyIndicatorMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EmptyIndicatorMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "emptyIndicatorMode", value.asInstanceOf[js.Any])
      
      inline def setEmptyIndicatorModeUndefined: Self = StObject.set(x, "emptyIndicatorMode", js.undefined)
      
      inline def setInverted(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setNumber(value: String | PropertyBindingInfo): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setNumberUnit(value: String | PropertyBindingInfo): Self = StObject.set(x, "numberUnit", value.asInstanceOf[js.Any])
      
      inline def setNumberUnitUndefined: Self = StObject.set(x, "numberUnit", js.undefined)
      
      inline def setPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setState(
        value: ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTextAlign(
        value: TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
      
      inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
      
      inline def setUnit(value: String | PropertyBindingInfo): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
}
