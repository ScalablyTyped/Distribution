package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsSliderMod {
  
  @JSImport("sap/ui/commons/Slider", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Slider`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Slider {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: SliderSettings) = this()
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
    mSettings: SliderSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: SliderSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/Slider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.Slider with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, Slider]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Slider],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.Slider.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Slider
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
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.commons.Slider`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Slider` itself.
      *
      * Value was changed. This event is fired if the value has changed by a user action.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SliderChangeEvent, Unit]
    ): this.type = js.native
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SliderChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Slider` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.commons.Slider`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Slider` itself.
      *
      * Value was changed. This event is fired if the value has changed by a user action.
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
    fnFunction: js.Function1[/* p1 */ SliderChangeEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ SliderChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Slider` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.ui.commons.Slider`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Slider` itself.
      *
      * Value was changed. This event is fired during the mouse move. The normal change event is only fired by
      * mouseup.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SliderLiveChangeEvent, Unit]
    ): this.type = js.native
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SliderLiveChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Slider` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.ui.commons.Slider`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Slider` itself.
      *
      * Value was changed. This event is fired during the mouse move. The normal change event is only fired by
      * mouseup.
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
    fnFunction: js.Function1[/* p1 */ SliderLiveChangeEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ SliderLiveChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Slider` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.ui.commons.Slider`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SliderChangeEvent, Unit]
    ): this.type = js.native
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SliderChangeEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:liveChange liveChange} event of this `sap.ui.commons.Slider`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLiveChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SliderLiveChangeEvent, Unit]
    ): this.type = js.native
    def detachLiveChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SliderLiveChangeEvent, Unit],
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
    def fireChange(/**
      * Parameters to pass along with the event
      */
    mParameters: Slider$ChangeEventParameters): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:liveChange liveChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLiveChange(): this.type = js.native
    def fireLiveChange(/**
      * Parameters to pass along with the event
      */
    mParameters: Slider$LiveChangeEventParameters): this.type = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getEditable editable}.
      *
      * Using the slider interactively requires value "true".
      *
      * Default value is `true`.
      *
      * @returns Value of property `editable`
      */
    def getEditable(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Switches enabled state of the control. Disabled fields have different colors, and can not be focused.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * @since 1.7.1
      *
      * Gets current value of property {@link #getHeight height}.
      *
      * Height of the vertical slider.
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getLabels labels}.
      *
      * Labels to be displayed instead of numbers. Attribute totalUnits and label count should be the same
      *
      * **Note:** To show the labels `stepLabels` must be activated.
      *
      * @returns Value of property `labels`
      */
    def getLabels(): js.Array[String] = js.native
    
    /**
      * Gets current value of property {@link #getMax max}.
      *
      * Maximal value of the slider
      *
      * **Note:** If `min` is larger than `max` both values will be switched
      *
      * Default value is `100`.
      *
      * @returns Value of property `max`
      */
    def getMax(): float = js.native
    
    /**
      * Gets current value of property {@link #getMin min}.
      *
      * Minimal value of the slider.
      *
      * **Note:** If `min` is larger than `max` both values will be switched
      *
      * Default value is `0`.
      *
      * @returns Value of property `min`
      */
    def getMin(): float = js.native
    
    /**
      * Gets current value of property {@link #getSmallStepWidth smallStepWidth}.
      *
      * The grip can only be moved in steps of this width.
      *
      * @returns Value of property `smallStepWidth`
      */
    def getSmallStepWidth(): float = js.native
    
    /**
      * Gets current value of property {@link #getStepLabels stepLabels}.
      *
      * Display step numbers for the ticks on the slider.
      *
      * Default value is `false`.
      *
      * @returns Value of property `stepLabels`
      */
    def getStepLabels(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getTotalUnits totalUnits}.
      *
      * Number of units that are displayed by ticks. The PageUp and PageDown keys navigate according to these
      * units.
      *
      * @returns Value of property `totalUnits`
      */
    def getTotalUnits(): int = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * Current value of the slider. (Position of the grip.)
      *
      * **Note:** If the value is not in the valid range (between `min` and `max`) it will be changed to be in
      * the valid range.
      *
      * Default value is `50`.
      *
      * @returns Value of property `value`
      */
    def getValue(): float = js.native
    
    /**
      * @since 1.7.1
      *
      * Gets current value of property {@link #getVertical vertical}.
      *
      * Orientation of slider
      *
      * Default value is `false`.
      *
      * @returns Value of property `vertical`
      */
    def getVertical(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Width of the horizontal slider.
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
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
      * Sets a new value for property {@link #getEditable editable}.
      *
      * Using the slider interactively requires value "true".
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
      * Switches enabled state of the control. Disabled fields have different colors, and can not be focused.
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
      * @since 1.7.1
      *
      * Sets a new value for property {@link #getHeight height}.
      *
      * Height of the vertical slider.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLabels labels}.
      *
      * Labels to be displayed instead of numbers. Attribute totalUnits and label count should be the same
      *
      * **Note:** To show the labels `stepLabels` must be activated.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabels(): this.type = js.native
    def setLabels(/**
      * New value for property `labels`
      */
    sLabels: js.Array[String]): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMax max}.
      *
      * Maximal value of the slider
      *
      * **Note:** If `min` is larger than `max` both values will be switched
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `100`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMax(): this.type = js.native
    def setMax(/**
      * New value for property `max`
      */
    fMax: float): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMin min}.
      *
      * Minimal value of the slider.
      *
      * **Note:** If `min` is larger than `max` both values will be switched
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMin(): this.type = js.native
    def setMin(/**
      * New value for property `min`
      */
    fMin: float): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSmallStepWidth smallStepWidth}.
      *
      * The grip can only be moved in steps of this width.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSmallStepWidth(): this.type = js.native
    def setSmallStepWidth(/**
      * New value for property `smallStepWidth`
      */
    fSmallStepWidth: float): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getStepLabels stepLabels}.
      *
      * Display step numbers for the ticks on the slider.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStepLabels(): this.type = js.native
    def setStepLabels(/**
      * New value for property `stepLabels`
      */
    bStepLabels: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTotalUnits totalUnits}.
      *
      * Number of units that are displayed by ticks. The PageUp and PageDown keys navigate according to these
      * units.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTotalUnits(): this.type = js.native
    def setTotalUnits(/**
      * New value for property `totalUnits`
      */
    iTotalUnits: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValue value}.
      *
      * Current value of the slider. (Position of the grip.)
      *
      * **Note:** If the value is not in the valid range (between `min` and `max`) it will be changed to be in
      * the valid range.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `50`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue(): this.type = js.native
    def setValue(/**
      * New value for property `value`
      */
    fValue: float): this.type = js.native
    
    /**
      * @since 1.7.1
      *
      * Sets a new value for property {@link #getVertical vertical}.
      *
      * Orientation of slider
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVertical(): this.type = js.native
    def setVertical(/**
      * New value for property `vertical`
      */
    bVertical: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Width of the horizontal slider.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait Slider$ChangeEventParameters extends StObject {
    
    /**
      * Current value of the slider after a change.
      */
    var value: js.UndefOr[float] = js.undefined
  }
  object Slider$ChangeEventParameters {
    
    inline def apply(): Slider$ChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Slider$ChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Slider$ChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setValue(value: float): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Slider$LiveChangeEventParameters extends StObject {
    
    /**
      * Current value of the slider after a change.
      */
    var value: js.UndefOr[float] = js.undefined
  }
  object Slider$LiveChangeEventParameters {
    
    inline def apply(): Slider$LiveChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Slider$LiveChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Slider$LiveChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setValue(value: float): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type SliderChangeEvent = typings.openui5.sapUiBaseEventMod.default[Slider$ChangeEventParameters]
  
  type SliderChangeEventParameters = Slider$ChangeEventParameters
  
  type SliderLiveChangeEvent = typings.openui5.sapUiBaseEventMod.default[Slider$LiveChangeEventParameters]
  
  type SliderLiveChangeEventParameters = Slider$LiveChangeEventParameters
  
  trait SliderSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Association to controls / IDs which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Association to controls / IDs which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Value was changed. This event is fired if the value has changed by a user action.
      */
    var change: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Slider$ChangeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Using the slider interactively requires value "true".
      */
    var editable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Switches enabled state of the control. Disabled fields have different colors, and can not be focused.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.7.1
      *
      * Height of the vertical slider.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Labels to be displayed instead of numbers. Attribute totalUnits and label count should be the same
      *
      * **Note:** To show the labels `stepLabels` must be activated.
      */
    var labels: js.UndefOr[
        js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Value was changed. This event is fired during the mouse move. The normal change event is only fired by
      * mouseup.
      */
    var liveChange: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Slider$LiveChangeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Maximal value of the slider
      *
      * **Note:** If `min` is larger than `max` both values will be switched
      */
    var max: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Minimal value of the slider.
      *
      * **Note:** If `min` is larger than `max` both values will be switched
      */
    var min: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The grip can only be moved in steps of this width.
      */
    var smallStepWidth: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Display step numbers for the ticks on the slider.
      */
    var stepLabels: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Number of units that are displayed by ticks. The PageUp and PageDown keys navigate according to these
      * units.
      */
    var totalUnits: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Current value of the slider. (Position of the grip.)
      *
      * **Note:** If the value is not in the valid range (between `min` and `max`) it will be changed to be in
      * the valid range.
      */
    var value: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.7.1
      *
      * Orientation of slider
      */
    var vertical: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Width of the horizontal slider.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object SliderSettings {
    
    inline def apply(): SliderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SliderSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setChange(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Slider$ChangeEventParameters] => Unit
      ): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setEditable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLabels(
        value: js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
      
      inline def setLiveChange(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Slider$LiveChangeEventParameters] => Unit
      ): Self = StObject.set(x, "liveChange", js.Any.fromFunction1(value))
      
      inline def setLiveChangeUndefined: Self = StObject.set(x, "liveChange", js.undefined)
      
      inline def setMax(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setSmallStepWidth(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "smallStepWidth", value.asInstanceOf[js.Any])
      
      inline def setSmallStepWidthUndefined: Self = StObject.set(x, "smallStepWidth", js.undefined)
      
      inline def setStepLabels(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "stepLabels", value.asInstanceOf[js.Any])
      
      inline def setStepLabelsUndefined: Self = StObject.set(x, "stepLabels", js.undefined)
      
      inline def setTotalUnits(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "totalUnits", value.asInstanceOf[js.Any])
      
      inline def setTotalUnitsUndefined: Self = StObject.set(x, "totalUnits", js.undefined)
      
      inline def setValue(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVertical(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
