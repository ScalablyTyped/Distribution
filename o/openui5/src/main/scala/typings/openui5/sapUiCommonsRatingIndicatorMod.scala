package typings.openui5

import typings.openui5.anon.`0`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.RatingIndicatorVisualMode
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsRatingIndicatorMod {
  
  @JSImport("sap/ui/commons/RatingIndicator", JSImport.Default)
  @js.native
  /**
    * Constructor for a new RatingIndicator.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends RatingIndicator {
    def this(/**
      * Initial settings for the new control
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
      * Initial settings for the new control
      */
    mSettings: RatingIndicatorSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: RatingIndicatorSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/RatingIndicator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.RatingIndicator with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
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
      * Returns a metadata object for class sap.ui.commons.RatingIndicator.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait RatingIndicator
    extends typings.openui5.sapUiCoreControlMod.default {
    
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
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.commons.RatingIndicator`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.RatingIndicator` itself.
      *
      * The event is fired when the user has done a rating.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.RatingIndicator` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.commons.RatingIndicator`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.RatingIndicator` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.RatingIndicator` itself
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
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.ui.commons.RatingIndicator`.
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
      * Fires event {@link #event:change change} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireChange(): this.type = js.native
    def fireChange(/**
      * Parameters to pass along with the event
      */
    mParameters: `0`): this.type = js.native
    
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
      * Gets current value of property {@link #getAverageValue averageValue}.
      *
      * Determines the average value. This value is shown if no value is set. This can be used to display an
      * average Value before the user votes.
      *
      * Default value is `0`.
      *
      * @returns Value of property `averageValue`
      */
    def getAverageValue(): float = js.native
    
    /**
      * Gets current value of property {@link #getEditable editable}.
      *
      * Determines if the rating symbols can be edited.
      *
      * Default value is `true`.
      *
      * @returns Value of property `editable`
      */
    def getEditable(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIconHovered iconHovered}.
      *
      * The URI to the image which is displayed when the mouse hovers onto a rating symbol. If used, a requirement
      * is that all custom icons need to have the same size. Note that when this attribute is used also the other
      * icon attributes need to be set.
      *
      * @returns Value of property `iconHovered`
      */
    def getIconHovered(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconSelected iconSelected}.
      *
      * The URI to the image which shall be displayed for all selected rating symbols. Note that when this attribute
      * is used, also the other icon attributes need to be set.
      *
      * @returns Value of property `iconSelected`
      */
    def getIconSelected(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconUnselected iconUnselected}.
      *
      * The URI to the image which shall be displayed for all unselected rating symbols. If this attribute is
      * used, a requirement is that all custom icons need to have the same size. Note that when this attribute
      * is used also the other icon attributes need to be set.
      *
      * @returns Value of property `iconUnselected`
      */
    def getIconUnselected(): URI = js.native
    
    /**
      * Gets current value of property {@link #getMaxValue maxValue}.
      *
      * Determines the number of displayed rating symbols
      *
      * Default value is `5`.
      *
      * @returns Value of property `maxValue`
      */
    def getMaxValue(): int = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * Determines the currently selected value. If value is set to sap.ui.commons.RatingIndicator.NoValue, the
      * averageValue is shown.
      *
      * Default value is `0`.
      *
      * @returns Value of property `value`
      */
    def getValue(): float = js.native
    
    /**
      * Gets current value of property {@link #getVisualMode visualMode}.
      *
      * Defines how float values are visualized: Full, Half, Continuous (see enumeration RatingIndicatorVisualMode)
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
      * Sets a new value for property {@link #getAverageValue averageValue}.
      *
      * Determines the average value. This value is shown if no value is set. This can be used to display an
      * average Value before the user votes.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAverageValue(): this.type = js.native
    def setAverageValue(/**
      * New value for property `averageValue`
      */
    fAverageValue: float): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEditable editable}.
      *
      * Determines if the rating symbols can be edited.
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
      * Sets a new value for property {@link #getIconHovered iconHovered}.
      *
      * The URI to the image which is displayed when the mouse hovers onto a rating symbol. If used, a requirement
      * is that all custom icons need to have the same size. Note that when this attribute is used also the other
      * icon attributes need to be set.
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
      * The URI to the image which shall be displayed for all selected rating symbols. Note that when this attribute
      * is used, also the other icon attributes need to be set.
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
      * Sets a new value for property {@link #getIconUnselected iconUnselected}.
      *
      * The URI to the image which shall be displayed for all unselected rating symbols. If this attribute is
      * used, a requirement is that all custom icons need to have the same size. Note that when this attribute
      * is used also the other icon attributes need to be set.
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
      * Setter for property `maxValue`.
      *
      * Default value is `5` Minimum value is `1`
      *
      * @returns `this` to allow method chaining
      */
    def setMaxValue(/**
      * new value for property `maxValue`
      */
    iMaxValue: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValue value}.
      *
      * Determines the currently selected value. If value is set to sap.ui.commons.RatingIndicator.NoValue, the
      * averageValue is shown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue(): this.type = js.native
    def setValue(/**
      * New value for property `value`
      */
    fValue: float): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisualMode visualMode}.
      *
      * Defines how float values are visualized: Full, Half, Continuous (see enumeration RatingIndicatorVisualMode)
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
      * Determines the average value. This value is shown if no value is set. This can be used to display an
      * average Value before the user votes.
      */
    var averageValue: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The event is fired when the user has done a rating.
      */
    var change: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Determines if the rating symbols can be edited.
      */
    var editable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The URI to the image which is displayed when the mouse hovers onto a rating symbol. If used, a requirement
      * is that all custom icons need to have the same size. Note that when this attribute is used also the other
      * icon attributes need to be set.
      */
    var iconHovered: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The URI to the image which shall be displayed for all selected rating symbols. Note that when this attribute
      * is used, also the other icon attributes need to be set.
      */
    var iconSelected: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The URI to the image which shall be displayed for all unselected rating symbols. If this attribute is
      * used, a requirement is that all custom icons need to have the same size. Note that when this attribute
      * is used also the other icon attributes need to be set.
      */
    var iconUnselected: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines the number of displayed rating symbols
      */
    var maxValue: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines the currently selected value. If value is set to sap.ui.commons.RatingIndicator.NoValue, the
      * averageValue is shown.
      */
    var value: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines how float values are visualized: Full, Half, Continuous (see enumeration RatingIndicatorVisualMode)
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
    
    extension [Self <: RatingIndicatorSettings](x: Self) {
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setAverageValue(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "averageValue", value.asInstanceOf[js.Any])
      
      inline def setAverageValueUndefined: Self = StObject.set(x, "averageValue", js.undefined)
      
      inline def setChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setEditable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setIconHovered(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconHovered", value.asInstanceOf[js.Any])
      
      inline def setIconHoveredUndefined: Self = StObject.set(x, "iconHovered", js.undefined)
      
      inline def setIconSelected(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconSelected", value.asInstanceOf[js.Any])
      
      inline def setIconSelectedUndefined: Self = StObject.set(x, "iconSelected", js.undefined)
      
      inline def setIconUnselected(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconUnselected", value.asInstanceOf[js.Any])
      
      inline def setIconUnselectedUndefined: Self = StObject.set(x, "iconUnselected", js.undefined)
      
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
