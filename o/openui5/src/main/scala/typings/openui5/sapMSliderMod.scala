package typings.openui5

import typings.openui5.anon.`1`
import typings.openui5.jQuery.Event
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.IScale
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSliderMod {
  
  @JSImport("sap/m/Slider", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Slider`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/slider/ Slider}
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
    
    @JSImport("sap/m/Slider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Slider with name `sClassName` and enriches it with the information
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
      * Returns a metadata object for class sap.m.Slider.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Slider
    extends typings.openui5.sapUiCoreControlMod.default
       with IFormContent {
    
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
      * @SINCE 1.56
      *
      * Adds some customTooltip to the aggregation {@link #getCustomTooltips customTooltips}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addCustomTooltip(
      /**
      * The customTooltip to add; if empty, nothing is inserted
      */
    oCustomTooltip: typings.openui5.sapMSliderTooltipBaseMod.default
    ): this.type = js.native
    
    /**
      * Creates default tooltips, if needed, and forwards properties to them
      */
    def assignDefaultTooltips(): Unit = js.native
    def assignDefaultTooltips(/**
      * Array of strings for ID generation
      */
    aTooltipIds: js.Array[Any]): Unit = js.native
    
    /**
      * Creates custom tooltips, if needed, and forwards properties to them
      */
    def associateCustomTooltips(): Unit = js.native
    def associateCustomTooltips(/**
      * Count of the tooltips
      */
    iTooltipCount: Double): Unit = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.Slider`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Slider` itself.
      *
      * This event is triggered after the end user finishes interacting, if there is any change.
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
      * Context object to call the event handler with. Defaults to this `sap.m.Slider` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.Slider`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Slider` itself.
      *
      * This event is triggered after the end user finishes interacting, if there is any change.
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
      * Context object to call the event handler with. Defaults to this `sap.m.Slider` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.Slider`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Slider` itself.
      *
      * This event is triggered during the dragging period, each time the slider value changes.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Slider` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.Slider`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Slider` itself.
      *
      * This event is triggered during the dragging period, each time the slider value changes.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Slider` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.56
      *
      * Destroys all the customTooltips in the aggregation {@link #getCustomTooltips customTooltips}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCustomTooltips(): this.type = js.native
    
    /**
      * @SINCE 1.46
      *
      * Destroys the scale in the aggregation {@link #getScale scale}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyScale(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.m.Slider`.
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
      * Detaches event handler `fnFunction` from the {@link #event:liveChange liveChange} event of this `sap.m.Slider`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLiveChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachLiveChange(
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
      * Fires event {@link #event:change change} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireChange(): this.type = js.native
    def fireChange(/**
      * Parameters to pass along with the event
      */
    mParameters: `1`): this.type = js.native
    
    /**
      * Fires event {@link #event:liveChange liveChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLiveChange(): this.type = js.native
    def fireLiveChange(/**
      * Parameters to pass along with the event
      */
    mParameters: `1`): this.type = js.native
    
    /**
      * Forwards properties to a given control
      */
    def forwardProperties(): Unit = js.native
    def forwardProperties(/**
      * Array of properties to forward
      */
    aProperties: js.Array[Any]): Unit = js.native
    def forwardProperties(
      /**
      * Array of properties to forward
      */
    aProperties: js.Array[Any],
      /**
      * Control to which should be forward
      */
    oControl: typings.openui5.sapUiCoreElementMod.default
    ): Unit = js.native
    def forwardProperties(
      /**
      * Array of properties to forward
      */
    aProperties: Unit,
      /**
      * Control to which should be forward
      */
    oControl: typings.openui5.sapUiCoreElementMod.default
    ): Unit = js.native
    
    /**
      * Forwards properties to default tooltips
      */
    def forwardPropertiesToDefaultTooltips(): Unit = js.native
    def forwardPropertiesToDefaultTooltips(/**
      * Count of the tooltips
      */
    iTooltipCount: Double): Unit = js.native
    
    /**
      * @SINCE 1.27.0
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.56
      *
      * Gets content of aggregation {@link #getCustomTooltips customTooltips}.
      *
      * Aggregation for user-defined tooltips. **Note:** In case of Slider, only the first tooltip of the aggregation
      * is used. In the RangeSlider case - the first two. If no custom tooltips are provided, the default are
      * used
      */
    def getCustomTooltips(): js.Array[typings.openui5.sapMSliderTooltipBaseMod.default] = js.native
    
    /**
      * @SINCE 1.44
      *
      * Gets current value of property {@link #getEnableTickmarks enableTickmarks}.
      *
      * Enables tickmarks visualisation
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableTickmarks`
      */
    def getEnableTickmarks(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Indicates whether the user can change the value.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * @SINCE 1.42
      *
      * Gets current value of property {@link #getInputsAsTooltips inputsAsTooltips}.
      *
      * Indicates whether input fields should be used as tooltips for the handles. **Note:** Setting this option
      * to `true` will only work if `showAdvancedTooltip` is set to `true`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `inputsAsTooltips`
      */
    def getInputsAsTooltips(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getMax max}.
      *
      * The maximum value.
      *
      * Default value is `100`.
      *
      * @returns Value of property `max`
      */
    def getMax(): float = js.native
    
    /**
      * Gets current value of property {@link #getMin min}.
      *
      * The minimum value.
      *
      * Default value is `0`.
      *
      * @returns Value of property `min`
      */
    def getMin(): float = js.native
    
    /**
      * Gets current value of property {@link #getName name}.
      *
      * The name property to be used in the HTML code for the slider (e.g. for HTML forms that send data to the
      * server via submit).
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `name`
      */
    def getName(): String = js.native
    
    /**
      * Gets current value of property {@link #getProgress progress}.
      *
      * Indicate whether a progress bar indicator is shown.
      *
      * Default value is `true`.
      *
      * @returns Value of property `progress`
      */
    def getProgress(): Boolean = js.native
    
    /**
      * @SINCE 1.46
      *
      * Gets content of aggregation {@link #getScale scale}.
      *
      * Scale for visualisation of tickmarks and labels
      */
    def getScale(): IScale = js.native
    
    /**
      * @SINCE 1.42
      *
      * Gets current value of property {@link #getShowAdvancedTooltip showAdvancedTooltip}.
      *
      * Indicate whether the handle's advanced tooltip is shown. **Note:** Setting this option to `true` will
      * ignore the value set in `showHandleTooltip`. This will cause only the advanced tooltip to be shown.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showAdvancedTooltip`
      */
    def getShowAdvancedTooltip(): Boolean = js.native
    
    /**
      * @SINCE 1.31
      *
      * Gets current value of property {@link #getShowHandleTooltip showHandleTooltip}.
      *
      * Indicate whether the handle tooltip is shown.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showHandleTooltip`
      */
    def getShowHandleTooltip(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getStep step}.
      *
      * Define the amount of units to change the slider when adjusting by drag and drop.
      *
      * Defines the size of the slider's selection intervals. (e.g. min = 0, max = 10, step = 5 would result
      * in possible selection of the values 0, 5, 10).
      *
      * The step must be positive, if a negative number is provided, the default value will be used instead.
      * If the width of the slider converted to pixels is less than the range (max - min), the value will be
      * rounded to multiples of the step size.
      *
      * Default value is `1`.
      *
      * @returns Value of property `step`
      */
    def getStep(): float = js.native
    
    /**
      * Gets the tooltips that should be shown. Returns custom tooltips if provided. Otherwise - default tooltips
      *
      * @returns SliderTooltipBase instances.
      */
    def getUsedTooltips(): js.Array[typings.openui5.sapMSliderTooltipBaseMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * Define the value.
      *
      * If the value is lower/higher than the allowed minimum/maximum, the value of the properties `min`/`max`
      * are used instead.
      *
      * Default value is `0`.
      *
      * @returns Value of property `value`
      */
    def getValue(): float = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control.
      *
      * Default value is `"100%"`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Handles change of Tooltip's inputs.
      */
    def handleTooltipChange(oEvent: Event): Unit = js.native
    
    /**
      * @SINCE 1.56
      *
      * Checks for the provided `sap.m.SliderTooltipBase` in the aggregation {@link #getCustomTooltips customTooltips}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfCustomTooltip(
      /**
      * The customTooltip whose index is looked for
      */
    oCustomTooltip: typings.openui5.sapMSliderTooltipBaseMod.default
    ): int = js.native
    
    /**
      * Assigns tooltips and forwards properties to them
      */
    def initAndSyncTooltips(): Unit = js.native
    def initAndSyncTooltips(/**
      * Array of strings for ID generation
      */
    aTooltipIds: js.Array[Any]): Unit = js.native
    
    /**
      * Creates a default SliderTooltip instance and adds it as an aggregation
      */
    def initDefaultTooltip(): Unit = js.native
    def initDefaultTooltip(/**
      * The tooltip ID
      */
    sId: String): Unit = js.native
    
    /**
      * Creates a SliderTooltipContainer
      */
    def initTooltipContainer(): Unit = js.native
    
    /**
      * @SINCE 1.56
      *
      * Inserts a customTooltip into the aggregation {@link #getCustomTooltips customTooltips}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertCustomTooltip(
      /**
      * The customTooltip to insert; if empty, nothing is inserted
      */
    oCustomTooltip: typings.openui5.sapMSliderTooltipBaseMod.default,
      /**
      * The `0`-based index the customTooltip should be inserted at; for a negative value of `iIndex`, the customTooltip
      * is inserted at position 0; for a value greater than the current size of the aggregation, the customTooltip
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.27.0
      *
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.56
      *
      * Removes all the controls from the aggregation {@link #getCustomTooltips customTooltips}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllCustomTooltips(): js.Array[typings.openui5.sapMSliderTooltipBaseMod.default] = js.native
    
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
    
    def removeCustomTooltip(/**
      * The customTooltip to remove or its index or id
      */
    vCustomTooltip: String): typings.openui5.sapMSliderTooltipBaseMod.default | Null = js.native
    /**
      * @SINCE 1.56
      *
      * Removes a customTooltip from the aggregation {@link #getCustomTooltips customTooltips}.
      *
      * @returns The removed customTooltip or `null`
      */
    def removeCustomTooltip(/**
      * The customTooltip to remove or its index or id
      */
    vCustomTooltip: int): typings.openui5.sapMSliderTooltipBaseMod.default | Null = js.native
    def removeCustomTooltip(
      /**
      * The customTooltip to remove or its index or id
      */
    vCustomTooltip: typings.openui5.sapMSliderTooltipBaseMod.default
    ): typings.openui5.sapMSliderTooltipBaseMod.default | Null = js.native
    
    /**
      * @SINCE 1.44
      *
      * Sets a new value for property {@link #getEnableTickmarks enableTickmarks}.
      *
      * Enables tickmarks visualisation
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableTickmarks(): this.type = js.native
    def setEnableTickmarks(/**
      * New value for property `enableTickmarks`
      */
    bEnableTickmarks: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Indicates whether the user can change the value.
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
      * @SINCE 1.42
      *
      * Sets a new value for property {@link #getInputsAsTooltips inputsAsTooltips}.
      *
      * Indicates whether input fields should be used as tooltips for the handles. **Note:** Setting this option
      * to `true` will only work if `showAdvancedTooltip` is set to `true`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInputsAsTooltips(): this.type = js.native
    def setInputsAsTooltips(/**
      * New value for property `inputsAsTooltips`
      */
    bInputsAsTooltips: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMax max}.
      *
      * The maximum value.
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
      * The minimum value.
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
      * Sets a new value for property {@link #getName name}.
      *
      * The name property to be used in the HTML code for the slider (e.g. for HTML forms that send data to the
      * server via submit).
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
      * Sets a new value for property {@link #getProgress progress}.
      *
      * Indicate whether a progress bar indicator is shown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setProgress(): this.type = js.native
    def setProgress(/**
      * New value for property `progress`
      */
    bProgress: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.46
      *
      * Sets the aggregated {@link #getScale scale}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setScale(/**
      * The scale to set
      */
    oScale: IScale): this.type = js.native
    
    /**
      * @SINCE 1.42
      *
      * Sets a new value for property {@link #getShowAdvancedTooltip showAdvancedTooltip}.
      *
      * Indicate whether the handle's advanced tooltip is shown. **Note:** Setting this option to `true` will
      * ignore the value set in `showHandleTooltip`. This will cause only the advanced tooltip to be shown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowAdvancedTooltip(): this.type = js.native
    def setShowAdvancedTooltip(/**
      * New value for property `showAdvancedTooltip`
      */
    bShowAdvancedTooltip: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.31
      *
      * Sets a new value for property {@link #getShowHandleTooltip showHandleTooltip}.
      *
      * Indicate whether the handle tooltip is shown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowHandleTooltip(): this.type = js.native
    def setShowHandleTooltip(/**
      * New value for property `showHandleTooltip`
      */
    bShowHandleTooltip: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getStep step}.
      *
      * Define the amount of units to change the slider when adjusting by drag and drop.
      *
      * Defines the size of the slider's selection intervals. (e.g. min = 0, max = 10, step = 5 would result
      * in possible selection of the values 0, 5, 10).
      *
      * The step must be positive, if a negative number is provided, the default value will be used instead.
      * If the width of the slider converted to pixels is less than the range (max - min), the value will be
      * rounded to multiples of the step size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStep(): this.type = js.native
    def setStep(/**
      * New value for property `step`
      */
    fStep: float): this.type = js.native
    
    /**
      * Sets the property `value`.
      *
      * Default value is `0`.
      *
      * @returns `this` to allow method chaining.
      */
    def setValue(
      /**
      * new value for property `value`.
      */
    fNewValue: float,
      /**
      * The options object
      */
    mOptions: js.Object
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"100%"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * Decrements the value by multiplying the step the `step` with the given parameter.
      *
      * @returns `this` to allow method chaining.
      */
    def stepDown(): this.type = js.native
    def stepDown(/**
      * The number of steps the slider goes down.
      */
    iStep: int): this.type = js.native
    
    /**
      * Increments the value by multiplying the `step` with the given parameter.
      *
      * @returns `this` to allow method chaining.
      */
    def stepUp(): this.type = js.native
    def stepUp(/**
      * The number of steps the slider goes up.
      */
    iStep: int): this.type = js.native
    
    /**
      * Updates value of the advanced tooltip.
      */
    def updateAdvancedTooltipDom(/**
      * The new value
      */
    sNewValue: String): Unit = js.native
  }
  
  trait SliderSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.27.0
      *
      * Association to controls / IDs which label this control (see WAI-ARIA attribute `aria-labelledby`).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * This event is triggered after the end user finishes interacting, if there is any change.
      */
    var change: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.56
      *
      * Aggregation for user-defined tooltips. **Note:** In case of Slider, only the first tooltip of the aggregation
      * is used. In the RangeSlider case - the first two. If no custom tooltips are provided, the default are
      * used
      */
    var customTooltips: js.UndefOr[
        js.Array[typings.openui5.sapMSliderTooltipBaseMod.default] | typings.openui5.sapMSliderTooltipBaseMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.44
      *
      * Enables tickmarks visualisation
      */
    var enableTickmarks: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Indicates whether the user can change the value.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.42
      *
      * Indicates whether input fields should be used as tooltips for the handles. **Note:** Setting this option
      * to `true` will only work if `showAdvancedTooltip` is set to `true`.
      */
    var inputsAsTooltips: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This event is triggered during the dragging period, each time the slider value changes.
      */
    var liveChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The maximum value.
      */
    var max: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The minimum value.
      */
    var min: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The name property to be used in the HTML code for the slider (e.g. for HTML forms that send data to the
      * server via submit).
      */
    var name: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Indicate whether a progress bar indicator is shown.
      */
    var progress: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.46
      *
      * Scale for visualisation of tickmarks and labels
      */
    var scale: js.UndefOr[IScale] = js.undefined
    
    /**
      * @SINCE 1.42
      *
      * Indicate whether the handle's advanced tooltip is shown. **Note:** Setting this option to `true` will
      * ignore the value set in `showHandleTooltip`. This will cause only the advanced tooltip to be shown.
      */
    var showAdvancedTooltip: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.31
      *
      * Indicate whether the handle tooltip is shown.
      */
    var showHandleTooltip: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Define the amount of units to change the slider when adjusting by drag and drop.
      *
      * Defines the size of the slider's selection intervals. (e.g. min = 0, max = 10, step = 5 would result
      * in possible selection of the values 0, 5, 10).
      *
      * The step must be positive, if a negative number is provided, the default value will be used instead.
      * If the width of the slider converted to pixels is less than the range (max - min), the value will be
      * rounded to multiples of the step size.
      */
    var step: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Define the value.
      *
      * If the value is lower/higher than the allowed minimum/maximum, the value of the properties `min`/`max`
      * are used instead.
      */
    var value: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the width of the control.
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
    
    extension [Self <: SliderSettings](x: Self) {
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setCustomTooltips(
        value: js.Array[typings.openui5.sapMSliderTooltipBaseMod.default] | typings.openui5.sapMSliderTooltipBaseMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "customTooltips", value.asInstanceOf[js.Any])
      
      inline def setCustomTooltipsUndefined: Self = StObject.set(x, "customTooltips", js.undefined)
      
      inline def setCustomTooltipsVarargs(value: typings.openui5.sapMSliderTooltipBaseMod.default*): Self = StObject.set(x, "customTooltips", js.Array(value*))
      
      inline def setEnableTickmarks(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableTickmarks", value.asInstanceOf[js.Any])
      
      inline def setEnableTickmarksUndefined: Self = StObject.set(x, "enableTickmarks", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setInputsAsTooltips(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "inputsAsTooltips", value.asInstanceOf[js.Any])
      
      inline def setInputsAsTooltipsUndefined: Self = StObject.set(x, "inputsAsTooltips", js.undefined)
      
      inline def setLiveChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "liveChange", js.Any.fromFunction1(value))
      
      inline def setLiveChangeUndefined: Self = StObject.set(x, "liveChange", js.undefined)
      
      inline def setMax(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setName(value: String | PropertyBindingInfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProgress(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setScale(value: IScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setShowAdvancedTooltip(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showAdvancedTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowAdvancedTooltipUndefined: Self = StObject.set(x, "showAdvancedTooltip", js.undefined)
      
      inline def setShowHandleTooltip(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showHandleTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowHandleTooltipUndefined: Self = StObject.set(x, "showHandleTooltip", js.undefined)
      
      inline def setStep(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setValue(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
