package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiWebcMainLibraryMod.LinkDesign
import typings.openui5.sapUiWebcMainLibraryMod.WrappingType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainLinkMod {
  
  @JSImport("sap/ui/webc/main/Link", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Link`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Link {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: LinkSettings) = this()
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
    mSettings: LinkSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: LinkSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/Link", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.Link with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Link]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Link],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.Link.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait Link
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
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
      * Attaches event handler `fnFunction` to the {@link #event:click click} event of this `sap.ui.webc.main.Link`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Link` itself.
      *
      * Fired when the component is triggered either with a mouse/tap or by using the Enter key.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ LinkClickEvent, Unit]
    ): this.type = js.native
    def attachClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ LinkClickEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Link` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:click click} event of this `sap.ui.webc.main.Link`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Link` itself.
      *
      * Fired when the component is triggered either with a mouse/tap or by using the Enter key.
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
    fnFunction: js.Function1[/* p1 */ LinkClickEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ LinkClickEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Link` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:click click} event of this `sap.ui.webc.main.Link`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ LinkClickEvent, Unit]
    ): this.type = js.native
    def detachClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ LinkClickEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:click click} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireClick(): Boolean = js.native
    def fireClick(/**
      * Parameters to pass along with the event
      */
    mParameters: Link$ClickEventParameters): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getAccessibilityAttributes accessibilityAttributes}.
      *
      * An object of strings that defines several additional accessibility attribute values for customization
      * depending on the use case.
      *
      * It supports the following fields:
      *
      *
      * 	 - `expanded`: Indicates whether the anchor element, or another grouping element it controls, is currently
      *     expanded or collapsed. Accepts the following string values:
      * 	`true`
      * 	 - `false`
      * 	 - `hasPopup`: Indicates the availability and type of interactive popup element, such as menu or dialog,
      *     that can be triggered by the anchor element. Accepts the following string values:
      * 	`Dialog`
      * 	 - `Grid`
      * 	 - `ListBox`
      * 	 - `Menu`
      * 	 - `Tree`
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
      * Default value is `empty string`.
      *
      * @returns Value of property `accessibleName`
      */
    def getAccessibleName(): String = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getDesign design}.
      *
      * Defines the component design.
      *
      *  **Note:** Avaialble options are `Default`, `Subtle`, and `Emphasized`.
      *
      * Default value is `Default`.
      *
      * @returns Value of property `design`
      */
    def getDesign(): LinkDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkDesign * / any */ String) = js.native
    
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
      * Gets current value of property {@link #getHref href}.
      *
      * Defines the component href.
      *
      *  **Note:** Standard hyperlink behavior is supported.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `href`
      */
    def getHref(): String = js.native
    
    /**
      * Gets current value of property {@link #getTarget target}.
      *
      * Defines the component target.
      *
      *  **Notes:**
      *
      *
      * 	 - `_self`
      * 	 - `_top`
      * 	 - `_blank`
      * 	 - `_parent`
      * 	 - `_search`
      *
      * **This property must only be used when the `href` property is set.**
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `target`
      */
    def getTarget(): String = js.native
    
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
      * Gets current value of property {@link #getWrappingType wrappingType}.
      *
      * Defines how the text of a component will be displayed when there is not enough space. Available options
      * are:
      * 	 - `None` - The text will be truncated with an ellipsis.
      * 	 - `Normal` - The text will wrap. The words will not be broken based on hyphenation.
      *
      * Default value is `None`.
      *
      * @returns Value of property `wrappingType`
      */
    def getWrappingType(): WrappingType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String) = js.native
    
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
      * 	 - `expanded`: Indicates whether the anchor element, or another grouping element it controls, is currently
      *     expanded or collapsed. Accepts the following string values:
      * 	`true`
      * 	 - `false`
      * 	 - `hasPopup`: Indicates the availability and type of interactive popup element, such as menu or dialog,
      *     that can be triggered by the anchor element. Accepts the following string values:
      * 	`Dialog`
      * 	 - `Grid`
      * 	 - `ListBox`
      * 	 - `Menu`
      * 	 - `Tree`
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
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibleName(): this.type = js.native
    def setAccessibleName(/**
      * New value for property `accessibleName`
      */
    sAccessibleName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDesign design}.
      *
      * Defines the component design.
      *
      *  **Note:** Avaialble options are `Default`, `Subtle`, and `Emphasized`.
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
    sDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkDesign * / any */ String
    ): this.type = js.native
    def setDesign(/**
      * New value for property `design`
      */
    sDesign: LinkDesign): this.type = js.native
    
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
      * Sets a new value for property {@link #getHref href}.
      *
      * Defines the component href.
      *
      *  **Note:** Standard hyperlink behavior is supported.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHref(): this.type = js.native
    def setHref(/**
      * New value for property `href`
      */
    sHref: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTarget target}.
      *
      * Defines the component target.
      *
      *  **Notes:**
      *
      *
      * 	 - `_self`
      * 	 - `_top`
      * 	 - `_blank`
      * 	 - `_parent`
      * 	 - `_search`
      *
      * **This property must only be used when the `href` property is set.**
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTarget(): this.type = js.native
    def setTarget(/**
      * New value for property `target`
      */
    sTarget: String): this.type = js.native
    
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
    
    /**
      * Sets a new value for property {@link #getWrappingType wrappingType}.
      *
      * Defines how the text of a component will be displayed when there is not enough space. Available options
      * are:
      * 	 - `None` - The text will be truncated with an ellipsis.
      * 	 - `Normal` - The text will wrap. The words will not be broken based on hyphenation.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWrappingType(): this.type = js.native
    def setWrappingType(
      /**
      * New value for property `wrappingType`
      */
    sWrappingType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String
    ): this.type = js.native
    def setWrappingType(/**
      * New value for property `wrappingType`
      */
    sWrappingType: WrappingType): this.type = js.native
  }
  
  trait Link$ClickEventParameters extends StObject {
    
    /**
      * Returns whether the "ALT" key was pressed when the event was triggered.
      */
    var altKey: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Returns whether the "CTRL" key was pressed when the event was triggered.
      */
    var ctrlKey: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Returns whether the "META" key was pressed when the event was triggered.
      */
    var metaKey: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Returns whether the "SHIFT" key was pressed when the event was triggered.
      */
    var shiftKey: js.UndefOr[Boolean] = js.undefined
  }
  object Link$ClickEventParameters {
    
    inline def apply(): Link$ClickEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Link$ClickEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Link$ClickEventParameters] (val x: Self) extends AnyVal {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setMetaKeyUndefined: Self = StObject.set(x, "metaKey", js.undefined)
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      inline def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
    }
  }
  
  type LinkClickEvent = typings.openui5.sapUiBaseEventMod.default[Link$ClickEventParameters]
  
  type LinkClickEventParameters = Link$ClickEventParameters
  
  trait LinkSettings
    extends StObject
       with ControlSettings {
    
    /**
      * An object of strings that defines several additional accessibility attribute values for customization
      * depending on the use case.
      *
      * It supports the following fields:
      *
      *
      * 	 - `expanded`: Indicates whether the anchor element, or another grouping element it controls, is currently
      *     expanded or collapsed. Accepts the following string values:
      * 	`true`
      * 	 - `false`
      * 	 - `hasPopup`: Indicates the availability and type of interactive popup element, such as menu or dialog,
      *     that can be triggered by the anchor element. Accepts the following string values:
      * 	`Dialog`
      * 	 - `Grid`
      * 	 - `ListBox`
      * 	 - `Menu`
      * 	 - `Tree`
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
      * Fired when the component is triggered either with a mouse/tap or by using the Enter key.
      */
    var click: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Link$ClickEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Defines the component design.
      *
      *  **Note:** Avaialble options are `Default`, `Subtle`, and `Emphasized`.
      */
    var design: js.UndefOr[
        LinkDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the component href.
      *
      *  **Note:** Standard hyperlink behavior is supported.
      */
    var href: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the component target.
      *
      *  **Notes:**
      *
      *
      * 	 - `_self`
      * 	 - `_top`
      * 	 - `_blank`
      * 	 - `_parent`
      * 	 - `_search`
      *
      * **This property must only be used when the `href` property is set.**
      */
    var target: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the content of the control
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines how the text of a component will be displayed when there is not enough space. Available options
      * are:
      * 	 - `None` - The text will be truncated with an ellipsis.
      * 	 - `Normal` - The text will wrap. The words will not be broken based on hyphenation.
      */
    var wrappingType: js.UndefOr[
        WrappingType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object LinkSettings {
    
    inline def apply(): LinkSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkSettings] (val x: Self) extends AnyVal {
      
      inline def setAccessibilityAttributes(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "accessibilityAttributes", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityAttributesUndefined: Self = StObject.set(x, "accessibilityAttributes", js.undefined)
      
      inline def setAccessibleName(value: String | PropertyBindingInfo): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
      
      inline def setAccessibleNameUndefined: Self = StObject.set(x, "accessibleName", js.undefined)
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setClick(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Link$ClickEventParameters] => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setDesign(
        value: LinkDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "design", value.asInstanceOf[js.Any])
      
      inline def setDesignUndefined: Self = StObject.set(x, "design", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHref(value: String | PropertyBindingInfo): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setTarget(value: String | PropertyBindingInfo): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setWrappingType(
        value: WrappingType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "wrappingType", value.asInstanceOf[js.Any])
      
      inline def setWrappingTypeUndefined: Self = StObject.set(x, "wrappingType", js.undefined)
    }
  }
}
