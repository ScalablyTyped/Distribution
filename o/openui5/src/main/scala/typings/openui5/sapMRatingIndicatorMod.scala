package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.RatingIndicatorVisualMode
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMRatingIndicatorMod {
  
  @JSImport("sap/m/RatingIndicator", JSImport.Default)
  @js.native
  /**
    * Constructor for a new RatingIndicator.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/rating-indicator/ Rating Indicator}
    */
  open class default () extends RatingIndicator {
    def this(/**
      * Initial settings for the new control Enables users to rate an item on a numeric scale.
      */
    mSettings: RatingIndicatorSettings) = this()
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
      * Initial settings for the new control Enables users to rate an item on a numeric scale.
      */
    mSettings: RatingIndicatorSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control Enables users to rate an item on a numeric scale.
      */
    mSettings: RatingIndicatorSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/RatingIndicator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.RatingIndicator with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, RatingIndicator]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, RatingIndicator],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.RatingIndicator.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait RatingIndicator
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
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.RatingIndicator`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.RatingIndicator` itself.
      *
      * The event is fired when the user has done a rating.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ RatingIndicatorChangeEvent, Unit]
    ): this.type = js.native
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ RatingIndicatorChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.RatingIndicator` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.RatingIndicator`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.RatingIndicator` itself.
      *
      * The event is fired when the user has done a rating.
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
    fnFunction: js.Function1[/* p1 */ RatingIndicatorChangeEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ RatingIndicatorChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.RatingIndicator` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.RatingIndicator`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.RatingIndicator` itself.
      *
      * This event is triggered during the dragging period, each time the rating value changes.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ RatingIndicatorLiveChangeEvent, Unit]
    ): this.type = js.native
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ RatingIndicatorLiveChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.RatingIndicator` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.RatingIndicator`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.RatingIndicator` itself.
      *
      * This event is triggered during the dragging period, each time the rating value changes.
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
    fnFunction: js.Function1[/* p1 */ RatingIndicatorLiveChangeEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ RatingIndicatorLiveChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.RatingIndicator` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
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
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.m.RatingIndicator`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ RatingIndicatorChangeEvent, Unit]
    ): this.type = js.native
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ RatingIndicatorChangeEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:liveChange liveChange} event of this `sap.m.RatingIndicator`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLiveChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ RatingIndicatorLiveChangeEvent, Unit]
    ): this.type = js.native
    def detachLiveChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ RatingIndicatorLiveChangeEvent, Unit],
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
    mParameters: RatingIndicator$ChangeEventParameters
    ): this.type = js.native
    
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
    mParameters: RatingIndicator$LiveChangeEventParameters
    ): this.type = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @since 1.50.0
      *
      * Gets current value of property {@link #getDisplayOnly displayOnly}.
      *
      * The RatingIndicator in displayOnly mode is not interactive, not editable, not focusable, and not in the
      * tab chain. This setting is used for forms in review mode.
      *
      * Default value is `false`.
      *
      * @returns Value of property `displayOnly`
      */
    def getDisplayOnly(): Boolean = js.native
    
    /**
      * @since 1.52.0
      *
      * Gets current value of property {@link #getEditable editable}.
      *
      * Defines whether the user is allowed to edit the RatingIndicator. If editable is false the control is
      * focusable, and in the tab chain but not interactive.
      *
      * Default value is `true`.
      *
      * @returns Value of property `editable`
      */
    def getEditable(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Value "true" is required to let the user rate with this control. It is recommended to set this parameter
      * to "false" for the "Small" size which is meant for indicating a value only
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIconHovered iconHovered}.
      *
      * The URI to the icon font icon or image that will be displayed for hovered rating symbols. A star icon
      * will be used if the property is not set
      *
      * @returns Value of property `iconHovered`
      */
    def getIconHovered(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconSelected iconSelected}.
      *
      * The URI to the icon font icon or image that will be displayed for selected rating symbols. A star icon
      * will be used if the property is not set
      *
      * @returns Value of property `iconSelected`
      */
    def getIconSelected(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconSize iconSize}.
      *
      * The Size of the image or icon to be displayed. The default value depends on the theme. Please be sure
      * that the size is corresponding to a full pixel value as some browsers don't support subpixel calculations.
      * Recommended size is 1.375rem (22px) for normal, 1rem (16px) for small, and 2rem (32px) for large icons
      * correspondingly.
      *
      * @returns Value of property `iconSize`
      */
    def getIconSize(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getIconUnselected iconUnselected}.
      *
      * The URI to the icon font icon or image that will be displayed for all unselected rating symbols. A star
      * icon will be used if the property is not set
      *
      * @returns Value of property `iconUnselected`
      */
    def getIconUnselected(): URI = js.native
    
    /**
      * Gets current value of property {@link #getMaxValue maxValue}.
      *
      * The number of displayed rating symbols
      *
      * Default value is `5`.
      *
      * @returns Value of property `maxValue`
      */
    def getMaxValue(): int = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * The indicated value of the rating
      *
      * Default value is `0`.
      *
      * @returns Value of property `value`
      */
    def getValue(): float = js.native
    
    /**
      * Gets current value of property {@link #getVisualMode visualMode}.
      *
      * Defines how float values are visualized: Full, Half (see enumeration RatingIndicatorVisualMode)
      *
      * Default value is `Half`.
      *
      * @returns Value of property `visualMode`
      */
    def getVisualMode(): RatingIndicatorVisualMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RatingIndicatorVisualMode * / any */ String) = js.native
    
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
      * @since 1.50.0
      *
      * Sets a new value for property {@link #getDisplayOnly displayOnly}.
      *
      * The RatingIndicator in displayOnly mode is not interactive, not editable, not focusable, and not in the
      * tab chain. This setting is used for forms in review mode.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayOnly(): this.type = js.native
    def setDisplayOnly(/**
      * New value for property `displayOnly`
      */
    bDisplayOnly: Boolean): this.type = js.native
    
    /**
      * @since 1.52.0
      *
      * Sets a new value for property {@link #getEditable editable}.
      *
      * Defines whether the user is allowed to edit the RatingIndicator. If editable is false the control is
      * focusable, and in the tab chain but not interactive.
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
      * Value "true" is required to let the user rate with this control. It is recommended to set this parameter
      * to "false" for the "Small" size which is meant for indicating a value only
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
      * Sets a new value for property {@link #getIconHovered iconHovered}.
      *
      * The URI to the icon font icon or image that will be displayed for hovered rating symbols. A star icon
      * will be used if the property is not set
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconHovered(): this.type = js.native
    def setIconHovered(/**
      * New value for property `iconHovered`
      */
    sIconHovered: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIconSelected iconSelected}.
      *
      * The URI to the icon font icon or image that will be displayed for selected rating symbols. A star icon
      * will be used if the property is not set
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconSelected(): this.type = js.native
    def setIconSelected(/**
      * New value for property `iconSelected`
      */
    sIconSelected: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIconSize iconSize}.
      *
      * The Size of the image or icon to be displayed. The default value depends on the theme. Please be sure
      * that the size is corresponding to a full pixel value as some browsers don't support subpixel calculations.
      * Recommended size is 1.375rem (22px) for normal, 1rem (16px) for small, and 2rem (32px) for large icons
      * correspondingly.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconSize(): this.type = js.native
    def setIconSize(/**
      * New value for property `iconSize`
      */
    sIconSize: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIconUnselected iconUnselected}.
      *
      * The URI to the icon font icon or image that will be displayed for all unselected rating symbols. A star
      * icon will be used if the property is not set
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconUnselected(): this.type = js.native
    def setIconUnselected(/**
      * New value for property `iconUnselected`
      */
    sIconUnselected: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxValue maxValue}.
      *
      * The number of displayed rating symbols
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `5`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxValue(): this.type = js.native
    def setMaxValue(/**
      * New value for property `maxValue`
      */
    iMaxValue: int): this.type = js.native
    
    def setValue(/**
      * The rating value to be set.
      */
    vValue: String): this.type = js.native
    /**
      * Sets the rating value. The method is automatically checking whether the value is in the valid range of
      * 0-{@link #getMaxValue maxValue} and if it is a valid number. Calling the setter with null or undefined
      * will reset the value to it's default.
      *
      * @returns Returns `this` to facilitate method chaining.
      */
    def setValue(/**
      * The rating value to be set.
      */
    vValue: float): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisualMode visualMode}.
      *
      * Defines how float values are visualized: Full, Half (see enumeration RatingIndicatorVisualMode)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Half`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisualMode(): this.type = js.native
    def setVisualMode(
      /**
      * New value for property `visualMode`
      */
    sVisualMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RatingIndicatorVisualMode * / any */ String
    ): this.type = js.native
    def setVisualMode(/**
      * New value for property `visualMode`
      */
    sVisualMode: RatingIndicatorVisualMode): this.type = js.native
    
    /**
      * Unbinds property {@link #getValue value} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindValue(): this.type = js.native
  }
  
  trait RatingIndicator$ChangeEventParameters extends StObject {
    
    /**
      * The rated value
      */
    var value: js.UndefOr[int] = js.undefined
  }
  object RatingIndicator$ChangeEventParameters {
    
    inline def apply(): RatingIndicator$ChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatingIndicator$ChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RatingIndicator$ChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setValue(value: int): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RatingIndicator$LiveChangeEventParameters extends StObject {
    
    /**
      * The current value of the rating after a live change event.
      */
    var value: js.UndefOr[float] = js.undefined
  }
  object RatingIndicator$LiveChangeEventParameters {
    
    inline def apply(): RatingIndicator$LiveChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatingIndicator$LiveChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RatingIndicator$LiveChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setValue(value: float): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type RatingIndicatorChangeEvent = typings.openui5.sapUiBaseEventMod.default[RatingIndicator$ChangeEventParameters]
  
  type RatingIndicatorChangeEventParameters = RatingIndicator$ChangeEventParameters
  
  type RatingIndicatorLiveChangeEvent = typings.openui5.sapUiBaseEventMod.default[RatingIndicator$LiveChangeEventParameters]
  
  type RatingIndicatorLiveChangeEventParameters = RatingIndicator$LiveChangeEventParameters
  
  trait RatingIndicatorSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Association to controls / ids which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * The event is fired when the user has done a rating.
      */
    var change: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[RatingIndicator$ChangeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.50.0
      *
      * The RatingIndicator in displayOnly mode is not interactive, not editable, not focusable, and not in the
      * tab chain. This setting is used for forms in review mode.
      */
    var displayOnly: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.52.0
      *
      * Defines whether the user is allowed to edit the RatingIndicator. If editable is false the control is
      * focusable, and in the tab chain but not interactive.
      */
    var editable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Value "true" is required to let the user rate with this control. It is recommended to set this parameter
      * to "false" for the "Small" size which is meant for indicating a value only
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The URI to the icon font icon or image that will be displayed for hovered rating symbols. A star icon
      * will be used if the property is not set
      */
    var iconHovered: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The URI to the icon font icon or image that will be displayed for selected rating symbols. A star icon
      * will be used if the property is not set
      */
    var iconSelected: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The Size of the image or icon to be displayed. The default value depends on the theme. Please be sure
      * that the size is corresponding to a full pixel value as some browsers don't support subpixel calculations.
      * Recommended size is 1.375rem (22px) for normal, 1rem (16px) for small, and 2rem (32px) for large icons
      * correspondingly.
      */
    var iconSize: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The URI to the icon font icon or image that will be displayed for all unselected rating symbols. A star
      * icon will be used if the property is not set
      */
    var iconUnselected: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * This event is triggered during the dragging period, each time the rating value changes.
      */
    var liveChange: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[RatingIndicator$LiveChangeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The number of displayed rating symbols
      */
    var maxValue: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The indicated value of the rating
      */
    var value: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines how float values are visualized: Full, Half (see enumeration RatingIndicatorVisualMode)
      */
    var visualMode: js.UndefOr[
        RatingIndicatorVisualMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RatingIndicatorVisualMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object RatingIndicatorSettings {
    
    inline def apply(): RatingIndicatorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatingIndicatorSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RatingIndicatorSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setChange(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[RatingIndicator$ChangeEventParameters] => Unit
      ): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setDisplayOnly(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "displayOnly", value.asInstanceOf[js.Any])
      
      inline def setDisplayOnlyUndefined: Self = StObject.set(x, "displayOnly", js.undefined)
      
      inline def setEditable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setIconHovered(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconHovered", value.asInstanceOf[js.Any])
      
      inline def setIconHoveredUndefined: Self = StObject.set(x, "iconHovered", js.undefined)
      
      inline def setIconSelected(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconSelected", value.asInstanceOf[js.Any])
      
      inline def setIconSelectedUndefined: Self = StObject.set(x, "iconSelected", js.undefined)
      
      inline def setIconSize(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
      
      inline def setIconUnselected(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconUnselected", value.asInstanceOf[js.Any])
      
      inline def setIconUnselectedUndefined: Self = StObject.set(x, "iconUnselected", js.undefined)
      
      inline def setLiveChange(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[RatingIndicator$LiveChangeEventParameters] => Unit
      ): Self = StObject.set(x, "liveChange", js.Any.fromFunction1(value))
      
      inline def setLiveChangeUndefined: Self = StObject.set(x, "liveChange", js.undefined)
      
      inline def setMaxValue(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setValue(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVisualMode(
        value: RatingIndicatorVisualMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RatingIndicatorVisualMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "visualMode", value.asInstanceOf[js.Any])
      
      inline def setVisualModeUndefined: Self = StObject.set(x, "visualMode", js.undefined)
    }
  }
}
