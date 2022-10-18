package typings.openui5

import typings.openui5.anon.State
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.IOverflowToolbarContent
import typings.openui5.sapMLibraryMod.SwitchType
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSwitchMod {
  
  @JSImport("sap/m/Switch", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Switch.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/switch/ Switch}
    */
  open class default () extends Switch {
    def this(/**
      * initial settings for the new control
      */
    mSettings: SwitchSettings) = this()
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
    mSettings: SwitchSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: SwitchSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_m_IOverflowToolbarContent: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/Switch", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Switch with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Switch]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Switch],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Switch.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Switch
    extends typings.openui5.sapUiCoreControlMod.default
       with IFormContent
       with IOverflowToolbarContent {
    
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
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.Switch`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Switch` itself.
      *
      * Triggered when a switch changes the state.
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
      * Context object to call the event handler with. Defaults to this `sap.m.Switch` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.Switch`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Switch` itself.
      *
      * Triggered when a switch changes the state.
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
      * Context object to call the event handler with. Defaults to this `sap.m.Switch` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.m.Switch`.
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
    mParameters: State): this.type = js.native
    
    /**
      * @SINCE 1.27.0
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getCustomTextOff customTextOff}.
      *
      * Custom text for the "OFF" state.
      *
      * "OFF" translated to the current language is the default value. Beware that the given text will be cut
      * off if available space is exceeded.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `customTextOff`
      */
    def getCustomTextOff(): String = js.native
    
    /**
      * Gets current value of property {@link #getCustomTextOn customTextOn}.
      *
      * Custom text for the "ON" state.
      *
      * "ON" translated to the current language is the default value. Beware that the given text will be cut
      * off if available space is exceeded.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `customTextOn`
      */
    def getCustomTextOn(): String = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Whether the switch is enabled.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getName name}.
      *
      * The name to be used in the HTML code for the switch (e.g. for HTML forms that send data to the server
      * via submit).
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `name`
      */
    def getName(): String = js.native
    
    /**
      * Gets current value of property {@link #getState state}.
      *
      * A boolean value indicating whether the switch is on or off.
      *
      * Default value is `false`.
      *
      * @returns Value of property `state`
      */
    def getState(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * Type of a Switch. Possibles values "Default", "AcceptReject".
      *
      * Default value is `Default`.
      *
      * @returns Value of property `type`
      */
    def getType(): SwitchType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SwitchType * / any */ String) = js.native
    
    /**
      * @SINCE 1.27.0
      *
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
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
      * Sets a new value for property {@link #getCustomTextOff customTextOff}.
      *
      * Custom text for the "OFF" state.
      *
      * "OFF" translated to the current language is the default value. Beware that the given text will be cut
      * off if available space is exceeded.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCustomTextOff(): this.type = js.native
    def setCustomTextOff(/**
      * New value for property `customTextOff`
      */
    sCustomTextOff: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCustomTextOn customTextOn}.
      *
      * Custom text for the "ON" state.
      *
      * "ON" translated to the current language is the default value. Beware that the given text will be cut
      * off if available space is exceeded.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCustomTextOn(): this.type = js.native
    def setCustomTextOn(/**
      * New value for property `customTextOn`
      */
    sCustomTextOn: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Whether the switch is enabled.
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
      * Sets a new value for property {@link #getName name}.
      *
      * The name to be used in the HTML code for the switch (e.g. for HTML forms that send data to the server
      * via submit).
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
      * Sets a new value for property {@link #getState state}.
      *
      * A boolean value indicating whether the switch is on or off.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setState(): this.type = js.native
    def setState(/**
      * New value for property `state`
      */
    bState: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * Type of a Switch. Possibles values "Default", "AcceptReject".
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Default`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(
      /**
      * New value for property `type`
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SwitchType * / any */ String
    ): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: SwitchType): this.type = js.native
  }
  
  trait SwitchSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.27.0
      *
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Triggered when a switch changes the state.
      */
    var change: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Custom text for the "OFF" state.
      *
      * "OFF" translated to the current language is the default value. Beware that the given text will be cut
      * off if available space is exceeded.
      */
    var customTextOff: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Custom text for the "ON" state.
      *
      * "ON" translated to the current language is the default value. Beware that the given text will be cut
      * off if available space is exceeded.
      */
    var customTextOn: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Whether the switch is enabled.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The name to be used in the HTML code for the switch (e.g. for HTML forms that send data to the server
      * via submit).
      */
    var name: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * A boolean value indicating whether the switch is on or off.
      */
    var state: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Type of a Switch. Possibles values "Default", "AcceptReject".
      */
    var `type`: js.UndefOr[
        SwitchType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SwitchType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object SwitchSettings {
    
    inline def apply(): SwitchSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchSettings]
    }
    
    extension [Self <: SwitchSettings](x: Self) {
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setCustomTextOff(value: String | PropertyBindingInfo): Self = StObject.set(x, "customTextOff", value.asInstanceOf[js.Any])
      
      inline def setCustomTextOffUndefined: Self = StObject.set(x, "customTextOff", js.undefined)
      
      inline def setCustomTextOn(value: String | PropertyBindingInfo): Self = StObject.set(x, "customTextOn", value.asInstanceOf[js.Any])
      
      inline def setCustomTextOnUndefined: Self = StObject.set(x, "customTextOn", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setName(value: String | PropertyBindingInfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setState(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setType(
        value: SwitchType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SwitchType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
