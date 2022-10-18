package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiWebcMainLibraryMod.ButtonDesign
import typings.openui5.sapUiWebcMainLibraryMod.ISegmentedButtonItem
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainSegmentedButtonItemMod {
  
  @JSImport("sap/ui/webc/main/SegmentedButtonItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `SegmentedButtonItem`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends SegmentedButtonItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: SegmentedButtonItemSettings) = this()
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
    mSettings: SegmentedButtonItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: SegmentedButtonItemSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_webc_main_ISegmentedButtonItem: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/SegmentedButtonItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.SegmentedButtonItem with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, SegmentedButtonItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SegmentedButtonItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.SegmentedButtonItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait SegmentedButtonItem
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default
       with ISegmentedButtonItem {
    
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
      * Attaches event handler `fnFunction` to the {@link #event:click click} event of this `sap.ui.webc.main.SegmentedButtonItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.SegmentedButtonItem` itself.
      *
      * Fired when the component is activated either with a mouse/tap or by using the Enter or Space key.
      *
      *  **Note:** The event will not be fired if the `disabled` property is set to `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.SegmentedButtonItem`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:click click} event of this `sap.ui.webc.main.SegmentedButtonItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.SegmentedButtonItem` itself.
      *
      * Fired when the component is activated either with a mouse/tap or by using the Enter or Space key.
      *
      *  **Note:** The event will not be fired if the `disabled` property is set to `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClick(
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
    def attachClick(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.SegmentedButtonItem`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:click click} event of this `sap.ui.webc.main.SegmentedButtonItem`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachClick(
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
      * Fires event {@link #event:click click} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireClick(): this.type = js.native
    def fireClick(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAccessibilityAttributes accessibilityAttributes}.
      *
      * An object of strings that defines several additional accessibility attribute values for customization
      * depending on the use case.
      *
      * It supports the following fields:
      *
      *
      * 	 - `expanded`: Indicates whether the button, or another grouping element it controls, is currently expanded
      * 			or collapsed. Accepts the following string values:
      * 	`true`
      * 	 - `false`
      * 	 - `hasPopup`: Indicates the availability and type of interactive popup element, such as menu or dialog,
      * 			that can be triggered by the button. Accepts the following string values:
      * 	`Dialog`
      * 	 - `Grid`
      * 	 - `ListBox`
      * 	 - `Menu`
      * 	 - `Tree`
      * 	 - `controls`: Identifies the element (or elements) whose contents or presence are controlled by the
      * 			button element. Accepts a string value.
      *
      * Default value is `{}`.
      *
      * @returns Value of property `accessibilityAttributes`
      */
    def getAccessibilityAttributes(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getAccessibleName accessibleName}.
      *
      * Defines the accessible aria name of the component.
      *
      * @returns Value of property `accessibleName`
      */
    def getAccessibleName(): String = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getDesign design}.
      *
      * **Note:** The property is inherited and not supported. If set, it won't take any effect.
      *
      * Default value is `Default`.
      *
      * @returns Value of property `design`
      */
    def getDesign(): ButtonDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonDesign * / any */ String) = js.native
    
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
      * Gets current value of property {@link #getIcon icon}.
      *
      * Defines the icon, displayed as graphical element within the component. The SAP-icons font provides numerous
      * options.
      *
      *  Example:
      *
      * See all the available icons within the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html Icon
      * Explorer}.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): String = js.native
    
    /**
      * Gets current value of property {@link #getIconEnd iconEnd}.
      *
      * **Note:** The property is inherited and not supported. If set, it won't take any effect.
      *
      * Default value is `false`.
      *
      * @returns Value of property `iconEnd`
      */
    def getIconEnd(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getPressed pressed}.
      *
      * Determines whether the component is displayed as pressed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `pressed`
      */
    def getPressed(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSubmits submits}.
      *
      * **Note:** The property is inherited and not supported. If set, it won't take any effect.
      *
      * Default value is `false`.
      *
      * @returns Value of property `submits`
      */
    def getSubmits(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines the content of the control
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
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
      * Sets a new value for property {@link #getAccessibilityAttributes accessibilityAttributes}.
      *
      * An object of strings that defines several additional accessibility attribute values for customization
      * depending on the use case.
      *
      * It supports the following fields:
      *
      *
      * 	 - `expanded`: Indicates whether the button, or another grouping element it controls, is currently expanded
      * 			or collapsed. Accepts the following string values:
      * 	`true`
      * 	 - `false`
      * 	 - `hasPopup`: Indicates the availability and type of interactive popup element, such as menu or dialog,
      * 			that can be triggered by the button. Accepts the following string values:
      * 	`Dialog`
      * 	 - `Grid`
      * 	 - `ListBox`
      * 	 - `Menu`
      * 	 - `Tree`
      * 	 - `controls`: Identifies the element (or elements) whose contents or presence are controlled by the
      * 			button element. Accepts a string value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `{}`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibilityAttributes(): this.type = js.native
    def setAccessibilityAttributes(/**
      * New value for property `accessibilityAttributes`
      */
    oAccessibilityAttributes: js.Object): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAccessibleName accessibleName}.
      *
      * Defines the accessible aria name of the component.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibleName(/**
      * New value for property `accessibleName`
      */
    sAccessibleName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDesign design}.
      *
      * **Note:** The property is inherited and not supported. If set, it won't take any effect.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Default`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDesign(): this.type = js.native
    def setDesign(
      /**
      * New value for property `design`
      */
    sDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonDesign * / any */ String
    ): this.type = js.native
    def setDesign(/**
      * New value for property `design`
      */
    sDesign: ButtonDesign): this.type = js.native
    
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
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Defines the icon, displayed as graphical element within the component. The SAP-icons font provides numerous
      * options.
      *
      *  Example:
      *
      * See all the available icons within the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html Icon
      * Explorer}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIconEnd iconEnd}.
      *
      * **Note:** The property is inherited and not supported. If set, it won't take any effect.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconEnd(): this.type = js.native
    def setIconEnd(/**
      * New value for property `iconEnd`
      */
    bIconEnd: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPressed pressed}.
      *
      * Determines whether the component is displayed as pressed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPressed(): this.type = js.native
    def setPressed(/**
      * New value for property `pressed`
      */
    bPressed: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSubmits submits}.
      *
      * **Note:** The property is inherited and not supported. If set, it won't take any effect.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubmits(): this.type = js.native
    def setSubmits(/**
      * New value for property `submits`
      */
    bSubmits: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Defines the content of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(): this.type = js.native
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
  }
  
  trait SegmentedButtonItemSettings
    extends StObject
       with ControlSettings {
    
    /**
      * An object of strings that defines several additional accessibility attribute values for customization
      * depending on the use case.
      *
      * It supports the following fields:
      *
      *
      * 	 - `expanded`: Indicates whether the button, or another grouping element it controls, is currently expanded
      * 			or collapsed. Accepts the following string values:
      * 	`true`
      * 	 - `false`
      * 	 - `hasPopup`: Indicates the availability and type of interactive popup element, such as menu or dialog,
      * 			that can be triggered by the button. Accepts the following string values:
      * 	`Dialog`
      * 	 - `Grid`
      * 	 - `ListBox`
      * 	 - `Menu`
      * 	 - `Tree`
      * 	 - `controls`: Identifies the element (or elements) whose contents or presence are controlled by the
      * 			button element. Accepts a string value.
      */
    var accessibilityAttributes: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the accessible aria name of the component.
      */
    var accessibleName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Receives id(or many ids) of the controls that label this control.
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Fired when the component is activated either with a mouse/tap or by using the Enter or Space key.
      *
      *  **Note:** The event will not be fired if the `disabled` property is set to `true`.
      */
    var click: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * **Note:** The property is inherited and not supported. If set, it won't take any effect.
      */
    var design: js.UndefOr[
        ButtonDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the icon, displayed as graphical element within the component. The SAP-icons font provides numerous
      * options.
      *
      *  Example:
      *
      * See all the available icons within the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html Icon
      * Explorer}.
      */
    var icon: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * **Note:** The property is inherited and not supported. If set, it won't take any effect.
      */
    var iconEnd: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the component is displayed as pressed.
      */
    var pressed: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * **Note:** The property is inherited and not supported. If set, it won't take any effect.
      */
    var submits: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the content of the control
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object SegmentedButtonItemSettings {
    
    inline def apply(): SegmentedButtonItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentedButtonItemSettings]
    }
    
    extension [Self <: SegmentedButtonItemSettings](x: Self) {
      
      inline def setAccessibilityAttributes(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "accessibilityAttributes", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityAttributesUndefined: Self = StObject.set(x, "accessibilityAttributes", js.undefined)
      
      inline def setAccessibleName(value: String | PropertyBindingInfo): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
      
      inline def setAccessibleNameUndefined: Self = StObject.set(x, "accessibleName", js.undefined)
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setClick(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setDesign(
        value: ButtonDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "design", value.asInstanceOf[js.Any])
      
      inline def setDesignUndefined: Self = StObject.set(x, "design", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setIcon(value: String | PropertyBindingInfo): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconEnd(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconEnd", value.asInstanceOf[js.Any])
      
      inline def setIconEndUndefined: Self = StObject.set(x, "iconEnd", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setPressed(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
      
      inline def setPressedUndefined: Self = StObject.set(x, "pressed", js.undefined)
      
      inline def setSubmits(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "submits", value.asInstanceOf[js.Any])
      
      inline def setSubmitsUndefined: Self = StObject.set(x, "submits", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
