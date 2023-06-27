package typings.openui5

import typings.openui5.sap.ClassInfo
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

object sapUiCoreIconMod {
  
  @JSImport("sap/ui/core/Icon", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Icon.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Icon {
    def this(/**
      * initial settings for the new control
      */
    mSettings: IconSettings) = this()
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
    mSettings: IconSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: IconSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/Icon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.Icon with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Icon]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Icon],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.Icon.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Icon
    extends typings.openui5.sapUiCoreControlMod.default
       with IFormContent {
    
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
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.ui.core.Icon`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.Icon` itself.
      *
      * This event is fired when icon is pressed/activated by the user. When a handler is attached to this event,
      * the Icon gets tab stop. If you want to disable this behavior, set the noTabStop property to true.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.core.Icon` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.ui.core.Icon`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.Icon` itself.
      *
      * This event is fired when icon is pressed/activated by the user. When a handler is attached to this event,
      * the Icon gets tab stop. If you want to disable this behavior, set the noTabStop property to true.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.core.Icon` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.ui.core.Icon`.
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
      * Gets current value of property {@link #getActiveBackgroundColor activeBackgroundColor}.
      *
      * Background color for Icon in active state.
      *
      * The property can be set with {@link sap.ui.core.CSSColor CSS Color} or {@link sap.ui.core.IconColor Semantic Icon Color}.
      *
      * @returns Value of property `activeBackgroundColor`
      */
    def getActiveBackgroundColor(): String = js.native
    
    /**
      * Gets current value of property {@link #getActiveColor activeColor}.
      *
      * This color is shown when icon is pressed/activated by the user.
      *
      * The property can be set with {@link sap.ui.core.CSSColor CSS Color} or {@link sap.ui.core.IconColor Semantic Icon Color}.
      *
      * @returns Value of property `activeColor`
      */
    def getActiveColor(): String = js.native
    
    /**
      * @since 1.30.0
      *
      * Gets current value of property {@link #getAlt alt}.
      *
      * This defines the alternative text which is used for outputting the aria-label attribute on the DOM.
      *
      * @returns Value of property `alt`
      */
    def getAlt(): String = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getBackgroundColor backgroundColor}.
      *
      * Background color of the Icon in normal state.
      *
      * The property can be set with {@link sap.ui.core.CSSColor CSS Color} or {@link sap.ui.core.IconColor Semantic Icon Color}.
      *
      * @returns Value of property `backgroundColor`
      */
    def getBackgroundColor(): String = js.native
    
    /**
      * Gets current value of property {@link #getColor color}.
      *
      * The color of the Icon. If color is not defined here, the Icon inherits the color from its DOM parent.
      *
      * The property can be set with {@link sap.ui.core.CSSColor CSS Color} or {@link sap.ui.core.IconColor Semantic Icon Color}.
      *
      * @returns Value of property `color`
      */
    def getColor(): String = js.native
    
    /**
      * @since 1.16.4
      *
      * Gets current value of property {@link #getDecorative decorative}.
      *
      * A decorative icon is included for design reasons. Accessibility tools will ignore decorative icons. Tab
      * stop isn't affected by this property anymore and it's now controlled by the existence of press event
      * handler and the noTabStop property.
      *
      * Default value is `true`.
      *
      * @returns Value of property `decorative`
      */
    def getDecorative(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * This is the height of the DOM element which contains the Icon. Setting this property doesn't affect the
      * size of the font. If you want to make the font bigger, increase the size property.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getHoverBackgroundColor hoverBackgroundColor}.
      *
      * Background color for Icon in hover state. This property has no visual effect when run on mobile device.
      *
      * The property can be set with {@link sap.ui.core.CSSColor CSS Color} or {@link sap.ui.core.IconColor Semantic Icon Color}.
      *
      * @returns Value of property `hoverBackgroundColor`
      */
    def getHoverBackgroundColor(): String = js.native
    
    /**
      * Gets current value of property {@link #getHoverColor hoverColor}.
      *
      * This color is shown when icon is hovered. This property has no visual effect when run on mobile device.
      *
      * The property can be set with {@link sap.ui.core.CSSColor CSS Color} or {@link sap.ui.core.IconColor Semantic Icon Color}.
      *
      * @returns Value of property `hoverColor`
      */
    def getHoverColor(): String = js.native
    
    /**
      * @since 1.30.1
      *
      * Gets current value of property {@link #getNoTabStop noTabStop}.
      *
      * Defines whether the tab stop of icon is controlled by the existence of press event handler. When it's
      * set to false, Icon control has tab stop when press event handler is attached. If it's set to true, Icon
      * control never has tab stop no matter whether press event handler exists or not.
      *
      * Default value is `false`.
      *
      * @returns Value of property `noTabStop`
      */
    def getNoTabStop(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSize size}.
      *
      * Since Icon uses font, this property will be applied to the css font-size property on the rendered DOM
      * element.
      *
      * @returns Value of property `size`
      */
    def getSize(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getSrc src}.
      *
      * This property can be set by following options:
      *
      * **Option 1:**
      *  The value has to be matched by following pattern `sap-icon://collection-name/icon-name` where `collection-name`
      * and `icon-name` have to be replaced by the desired values. In case the default UI5 icons are used the
      * `collection-name` can be omited.
      *  Example: `sap-icon://accept`
      *
      * **Option 2:** The value is determined by using {@link sap.ui.core.IconPool.getIconURI} with an Icon name
      * parameter and an optional collection parameter which is required when using application extended Icons.
      *  Example: `IconPool.getIconURI("accept")`
      *
      * @returns Value of property `src`
      */
    def getSrc(): URI = js.native
    
    /**
      * @since 1.30.0
      *
      * Gets current value of property {@link #getUseIconTooltip useIconTooltip}.
      *
      * Decides whether a default Icon tooltip should be used if no tooltip is set.
      *
      * Default value is `true`.
      *
      * @returns Value of property `useIconTooltip`
      */
    def getUseIconTooltip(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * This is the width of the DOM element which contains the Icon. Setting this property doesn't affect the
      * size of the font. If you want to make the font bigger, increase the size property.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
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
      * Sets a new value for property {@link #getActiveBackgroundColor activeBackgroundColor}.
      *
      * Background color for Icon in active state.
      *
      * The property can be set with {@link sap.ui.core.CSSColor CSS Color} or {@link sap.ui.core.IconColor Semantic Icon Color}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setActiveBackgroundColor(): this.type = js.native
    def setActiveBackgroundColor(/**
      * New value for property `activeBackgroundColor`
      */
    sActiveBackgroundColor: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getActiveColor activeColor}.
      *
      * This color is shown when icon is pressed/activated by the user.
      *
      * The property can be set with {@link sap.ui.core.CSSColor CSS Color} or {@link sap.ui.core.IconColor Semantic Icon Color}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setActiveColor(): this.type = js.native
    def setActiveColor(/**
      * New value for property `activeColor`
      */
    sActiveColor: String): this.type = js.native
    
    /**
      * @since 1.30.0
      *
      * Sets a new value for property {@link #getAlt alt}.
      *
      * This defines the alternative text which is used for outputting the aria-label attribute on the DOM.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAlt(): this.type = js.native
    def setAlt(/**
      * New value for property `alt`
      */
    sAlt: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getBackgroundColor backgroundColor}.
      *
      * Background color of the Icon in normal state.
      *
      * The property can be set with {@link sap.ui.core.CSSColor CSS Color} or {@link sap.ui.core.IconColor Semantic Icon Color}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundColor(): this.type = js.native
    def setBackgroundColor(/**
      * New value for property `backgroundColor`
      */
    sBackgroundColor: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getColor color}.
      *
      * The color of the Icon. If color is not defined here, the Icon inherits the color from its DOM parent.
      *
      * The property can be set with {@link sap.ui.core.CSSColor CSS Color} or {@link sap.ui.core.IconColor Semantic Icon Color}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColor(): this.type = js.native
    def setColor(/**
      * New value for property `color`
      */
    sColor: String): this.type = js.native
    
    /**
      * @since 1.16.4
      *
      * Sets a new value for property {@link #getDecorative decorative}.
      *
      * A decorative icon is included for design reasons. Accessibility tools will ignore decorative icons. Tab
      * stop isn't affected by this property anymore and it's now controlled by the existence of press event
      * handler and the noTabStop property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDecorative(): this.type = js.native
    def setDecorative(/**
      * New value for property `decorative`
      */
    bDecorative: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * This is the height of the DOM element which contains the Icon. Setting this property doesn't affect the
      * size of the font. If you want to make the font bigger, increase the size property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHoverBackgroundColor hoverBackgroundColor}.
      *
      * Background color for Icon in hover state. This property has no visual effect when run on mobile device.
      *
      * The property can be set with {@link sap.ui.core.CSSColor CSS Color} or {@link sap.ui.core.IconColor Semantic Icon Color}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHoverBackgroundColor(): this.type = js.native
    def setHoverBackgroundColor(/**
      * New value for property `hoverBackgroundColor`
      */
    sHoverBackgroundColor: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHoverColor hoverColor}.
      *
      * This color is shown when icon is hovered. This property has no visual effect when run on mobile device.
      *
      * The property can be set with {@link sap.ui.core.CSSColor CSS Color} or {@link sap.ui.core.IconColor Semantic Icon Color}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHoverColor(): this.type = js.native
    def setHoverColor(/**
      * New value for property `hoverColor`
      */
    sHoverColor: String): this.type = js.native
    
    /**
      * @since 1.30.1
      *
      * Sets a new value for property {@link #getNoTabStop noTabStop}.
      *
      * Defines whether the tab stop of icon is controlled by the existence of press event handler. When it's
      * set to false, Icon control has tab stop when press event handler is attached. If it's set to true, Icon
      * control never has tab stop no matter whether press event handler exists or not.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNoTabStop(): this.type = js.native
    def setNoTabStop(/**
      * New value for property `noTabStop`
      */
    bNoTabStop: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSize size}.
      *
      * Since Icon uses font, this property will be applied to the css font-size property on the rendered DOM
      * element.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSize(): this.type = js.native
    def setSize(/**
      * New value for property `size`
      */
    sSize: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSrc src}.
      *
      * This property can be set by following options:
      *
      * **Option 1:**
      *  The value has to be matched by following pattern `sap-icon://collection-name/icon-name` where `collection-name`
      * and `icon-name` have to be replaced by the desired values. In case the default UI5 icons are used the
      * `collection-name` can be omited.
      *  Example: `sap-icon://accept`
      *
      * **Option 2:** The value is determined by using {@link sap.ui.core.IconPool.getIconURI} with an Icon name
      * parameter and an optional collection parameter which is required when using application extended Icons.
      *  Example: `IconPool.getIconURI("accept")`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSrc(): this.type = js.native
    def setSrc(/**
      * New value for property `src`
      */
    sSrc: URI): this.type = js.native
    
    /**
      * @since 1.30.0
      *
      * Sets a new value for property {@link #getUseIconTooltip useIconTooltip}.
      *
      * Decides whether a default Icon tooltip should be used if no tooltip is set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUseIconTooltip(): this.type = js.native
    def setUseIconTooltip(/**
      * New value for property `useIconTooltip`
      */
    bUseIconTooltip: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * This is the width of the DOM element which contains the Icon. Setting this property doesn't affect the
      * size of the font. If you want to make the font bigger, increase the size property.
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
  }
  
  trait Icon$PressEventParameters extends StObject
  
  type IconPressEvent = typings.openui5.sapUiBaseEventMod.default[Icon$PressEventParameters]
  
  type IconPressEventParameters = Icon$PressEventParameters
  
  trait IconSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Background color for Icon in active state.
      *
      * The property can be set with {@link sap.ui.core.CSSColor CSS Color} or {@link sap.ui.core.IconColor Semantic Icon Color}.
      */
    var activeBackgroundColor: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * This color is shown when icon is pressed/activated by the user.
      *
      * The property can be set with {@link sap.ui.core.CSSColor CSS Color} or {@link sap.ui.core.IconColor Semantic Icon Color}.
      */
    var activeColor: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.30.0
      *
      * This defines the alternative text which is used for outputting the aria-label attribute on the DOM.
      */
    var alt: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Background color of the Icon in normal state.
      *
      * The property can be set with {@link sap.ui.core.CSSColor CSS Color} or {@link sap.ui.core.IconColor Semantic Icon Color}.
      */
    var backgroundColor: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The color of the Icon. If color is not defined here, the Icon inherits the color from its DOM parent.
      *
      * The property can be set with {@link sap.ui.core.CSSColor CSS Color} or {@link sap.ui.core.IconColor Semantic Icon Color}.
      */
    var color: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.16.4
      *
      * A decorative icon is included for design reasons. Accessibility tools will ignore decorative icons. Tab
      * stop isn't affected by this property anymore and it's now controlled by the existence of press event
      * handler and the noTabStop property.
      */
    var decorative: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This is the height of the DOM element which contains the Icon. Setting this property doesn't affect the
      * size of the font. If you want to make the font bigger, increase the size property.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Background color for Icon in hover state. This property has no visual effect when run on mobile device.
      *
      * The property can be set with {@link sap.ui.core.CSSColor CSS Color} or {@link sap.ui.core.IconColor Semantic Icon Color}.
      */
    var hoverBackgroundColor: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * This color is shown when icon is hovered. This property has no visual effect when run on mobile device.
      *
      * The property can be set with {@link sap.ui.core.CSSColor CSS Color} or {@link sap.ui.core.IconColor Semantic Icon Color}.
      */
    var hoverColor: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.30.1
      *
      * Defines whether the tab stop of icon is controlled by the existence of press event handler. When it's
      * set to false, Icon control has tab stop when press event handler is attached. If it's set to true, Icon
      * control never has tab stop no matter whether press event handler exists or not.
      */
    var noTabStop: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This event is fired when icon is pressed/activated by the user. When a handler is attached to this event,
      * the Icon gets tab stop. If you want to disable this behavior, set the noTabStop property to true.
      */
    var press: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Since Icon uses font, this property will be applied to the css font-size property on the rendered DOM
      * element.
      */
    var size: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This property can be set by following options:
      *
      * **Option 1:**
      *  The value has to be matched by following pattern `sap-icon://collection-name/icon-name` where `collection-name`
      * and `icon-name` have to be replaced by the desired values. In case the default UI5 icons are used the
      * `collection-name` can be omited.
      *  Example: `sap-icon://accept`
      *
      * **Option 2:** The value is determined by using {@link sap.ui.core.IconPool.getIconURI} with an Icon name
      * parameter and an optional collection parameter which is required when using application extended Icons.
      *  Example: `IconPool.getIconURI("accept")`
      */
    var src: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @since 1.30.0
      *
      * Decides whether a default Icon tooltip should be used if no tooltip is set.
      */
    var useIconTooltip: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This is the width of the DOM element which contains the Icon. Setting this property doesn't affect the
      * size of the font. If you want to make the font bigger, increase the size property.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object IconSettings {
    
    inline def apply(): IconSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconSettings] (val x: Self) extends AnyVal {
      
      inline def setActiveBackgroundColor(value: String | PropertyBindingInfo): Self = StObject.set(x, "activeBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setActiveBackgroundColorUndefined: Self = StObject.set(x, "activeBackgroundColor", js.undefined)
      
      inline def setActiveColor(value: String | PropertyBindingInfo): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
      
      inline def setActiveColorUndefined: Self = StObject.set(x, "activeColor", js.undefined)
      
      inline def setAlt(value: String | PropertyBindingInfo): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setBackgroundColor(value: String | PropertyBindingInfo): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setColor(value: String | PropertyBindingInfo): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDecorative(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "decorative", value.asInstanceOf[js.Any])
      
      inline def setDecorativeUndefined: Self = StObject.set(x, "decorative", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHoverBackgroundColor(value: String | PropertyBindingInfo): Self = StObject.set(x, "hoverBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setHoverBackgroundColorUndefined: Self = StObject.set(x, "hoverBackgroundColor", js.undefined)
      
      inline def setHoverColor(value: String | PropertyBindingInfo): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
      
      inline def setHoverColorUndefined: Self = StObject.set(x, "hoverColor", js.undefined)
      
      inline def setNoTabStop(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "noTabStop", value.asInstanceOf[js.Any])
      
      inline def setNoTabStopUndefined: Self = StObject.set(x, "noTabStop", js.undefined)
      
      inline def setPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setSize(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSrc(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setUseIconTooltip(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "useIconTooltip", value.asInstanceOf[js.Any])
      
      inline def setUseIconTooltipUndefined: Self = StObject.set(x, "useIconTooltip", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
