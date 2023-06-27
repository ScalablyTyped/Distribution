package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.ButtonStyle
import typings.openui5.sapUiCommonsLibraryMod.ToolbarItem
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsButtonMod {
  
  @JSImport("sap/ui/commons/Button", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Button.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Button {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ButtonSettings) = this()
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
    mSettings: ButtonSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ButtonSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_commons_ToolbarItem: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/Button", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.Button with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, Button]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Button],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.Button.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Button
    extends typings.openui5.sapUiCoreControlMod.default
       with ToolbarItem
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
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.ui.commons.Button`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Button` itself.
      *
      * Event is fired when the user presses the control.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Button` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.ui.commons.Button`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Button` itself.
      *
      * Event is fired when the user presses the control.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Button` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.ui.commons.Button`.
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
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Boolean property to enable the control (default is true). Buttons that are disabled have other colors
      * than enabled ones, depending on custom settings.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Specifies the button height. If this property is set, the height which is specified by the underlying
      * theme is not used any longer.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getHelpId helpId}.
      *
      * Unique identifier used for help service
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `helpId`
      */
    def getHelpId(): String = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Icon to be displayed as graphical element within the button. This can be a URI to an image or an icon
      * font URI.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconFirst iconFirst}.
      *
      * If set to true (default), the display sequence is 1. icon 2. control text .
      *
      * Default value is `true`.
      *
      * @returns Value of property `iconFirst`
      */
    def getIconFirst(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIconHovered iconHovered}.
      *
      * Icon to be displayed as graphical element within the button when it is hovered (only if also a base icon
      * was specified). If not specified the base icon is used. If an icon font icon is used, this property is
      * ignored.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `iconHovered`
      */
    def getIconHovered(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconSelected iconSelected}.
      *
      * Icon to be displayed as graphical element within the button when it is selected (only if also a base
      * icon was specified). If not specified the base or hovered icon is used. If an icon font icon is used,
      * this property is ignored.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `iconSelected`
      */
    def getIconSelected(): URI = js.native
    
    /**
      * Gets current value of property {@link #getLite lite}.
      *
      * The button is rendered as lite button.
      *
      * Default value is `false`.
      *
      * @returns Value of property `lite`
      */
    def getLite(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getStyle style}.
      *
      * Style of the button. (e.g. emphasized)
      *
      * Default value is `Default`.
      *
      * @returns Value of property `style`
      */
    def getStyle(): ButtonStyle | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonStyle * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getStyled styled}.
      *
      * Indicates if the button is styled. If not it is rendered as native HTML-button. In this case a custom
      * styling can be added usig addStyleClass.
      *
      * Default value is `true`.
      *
      * @returns Value of property `styled`
      */
    def getStyled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Button text displayed at runtime.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Control width as common CSS-size (px or % as unit, for example)
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
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Boolean property to enable the control (default is true). Buttons that are disabled have other colors
      * than enabled ones, depending on custom settings.
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
      * Sets a new value for property {@link #getHeight height}.
      *
      * Specifies the button height. If this property is set, the height which is specified by the underlying
      * theme is not used any longer.
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
      * Sets a new value for property {@link #getHelpId helpId}.
      *
      * Unique identifier used for help service
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHelpId(): this.type = js.native
    def setHelpId(/**
      * New value for property `helpId`
      */
    sHelpId: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Icon to be displayed as graphical element within the button. This can be a URI to an image or an icon
      * font URI.
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
    sIcon: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIconFirst iconFirst}.
      *
      * If set to true (default), the display sequence is 1. icon 2. control text .
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconFirst(): this.type = js.native
    def setIconFirst(/**
      * New value for property `iconFirst`
      */
    bIconFirst: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIconHovered iconHovered}.
      *
      * Icon to be displayed as graphical element within the button when it is hovered (only if also a base icon
      * was specified). If not specified the base icon is used. If an icon font icon is used, this property is
      * ignored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
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
      * Icon to be displayed as graphical element within the button when it is selected (only if also a base
      * icon was specified). If not specified the base or hovered icon is used. If an icon font icon is used,
      * this property is ignored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconSelected(): this.type = js.native
    def setIconSelected(/**
      * New value for property `iconSelected`
      */
    sIconSelected: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLite lite}.
      *
      * The button is rendered as lite button.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLite(): this.type = js.native
    def setLite(/**
      * New value for property `lite`
      */
    bLite: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getStyle style}.
      *
      * Style of the button. (e.g. emphasized)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Default`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStyle(): this.type = js.native
    def setStyle(
      /**
      * New value for property `style`
      */
    sStyle: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonStyle * / any */ String
    ): this.type = js.native
    def setStyle(/**
      * New value for property `style`
      */
    sStyle: ButtonStyle): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getStyled styled}.
      *
      * Indicates if the button is styled. If not it is rendered as native HTML-button. In this case a custom
      * styling can be added usig addStyleClass.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStyled(): this.type = js.native
    def setStyled(/**
      * New value for property `styled`
      */
    bStyled: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Button text displayed at runtime.
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
      * Sets a new value for property {@link #getWidth width}.
      *
      * Control width as common CSS-size (px or % as unit, for example)
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
  
  trait Button$PressEventParameters extends StObject
  
  type ButtonPressEvent = typings.openui5.sapUiBaseEventMod.default[Button$PressEventParameters]
  
  type ButtonPressEventParameters = Button$PressEventParameters
  
  trait ButtonSettings
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
      * Boolean property to enable the control (default is true). Buttons that are disabled have other colors
      * than enabled ones, depending on custom settings.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the button height. If this property is set, the height which is specified by the underlying
      * theme is not used any longer.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Unique identifier used for help service
      */
    var helpId: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Icon to be displayed as graphical element within the button. This can be a URI to an image or an icon
      * font URI.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * If set to true (default), the display sequence is 1. icon 2. control text .
      */
    var iconFirst: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Icon to be displayed as graphical element within the button when it is hovered (only if also a base icon
      * was specified). If not specified the base icon is used. If an icon font icon is used, this property is
      * ignored.
      */
    var iconHovered: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Icon to be displayed as graphical element within the button when it is selected (only if also a base
      * icon was specified). If not specified the base or hovered icon is used. If an icon font icon is used,
      * this property is ignored.
      */
    var iconSelected: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The button is rendered as lite button.
      */
    var lite: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event is fired when the user presses the control.
      */
    var press: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Style of the button. (e.g. emphasized)
      */
    var style: js.UndefOr[
        ButtonStyle | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonStyle * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Indicates if the button is styled. If not it is rendered as native HTML-button. In this case a custom
      * styling can be added usig addStyleClass.
      */
    var styled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Button text displayed at runtime.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Control width as common CSS-size (px or % as unit, for example)
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ButtonSettings {
    
    inline def apply(): ButtonSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHelpId(value: String | PropertyBindingInfo): Self = StObject.set(x, "helpId", value.asInstanceOf[js.Any])
      
      inline def setHelpIdUndefined: Self = StObject.set(x, "helpId", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFirst(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconFirst", value.asInstanceOf[js.Any])
      
      inline def setIconFirstUndefined: Self = StObject.set(x, "iconFirst", js.undefined)
      
      inline def setIconHovered(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconHovered", value.asInstanceOf[js.Any])
      
      inline def setIconHoveredUndefined: Self = StObject.set(x, "iconHovered", js.undefined)
      
      inline def setIconSelected(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconSelected", value.asInstanceOf[js.Any])
      
      inline def setIconSelectedUndefined: Self = StObject.set(x, "iconSelected", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLite(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "lite", value.asInstanceOf[js.Any])
      
      inline def setLiteUndefined: Self = StObject.set(x, "lite", js.undefined)
      
      inline def setPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setStyle(
        value: ButtonStyle | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonStyle * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "styled", value.asInstanceOf[js.Any])
      
      inline def setStyledUndefined: Self = StObject.set(x, "styled", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
