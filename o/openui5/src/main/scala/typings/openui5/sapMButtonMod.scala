package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.ButtonType
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.IAccessKeySupport
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiCoreLibraryMod.aria.HasPopup
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMButtonMod {
  
  @JSImport("sap/m/Button", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Button`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/button/ Button}
    */
  open class default () extends Button {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ButtonSettings) = this()
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
    mSettings: ButtonSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ButtonSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IAccessKeySupport: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/Button", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Button with name `sClassName` and enriches it with the information
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
      * Returns a metadata object for class sap.m.Button.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Button
    extends typings.openui5.sapUiCoreControlMod.default
       with IFormContent
       with IAccessKeySupport {
    
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
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.Button`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Button` itself.
      *
      * Fired when the user clicks or taps on the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Button` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.Button`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Button` itself.
      *
      * Fired when the user clicks or taps on the control.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Button` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.20) - replaced by `press` event
      *
      * Attaches event handler `fnFunction` to the {@link #event:tap tap} event of this `sap.m.Button`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Button` itself.
      *
      * Fired when the user taps the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTap(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachTap(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Button` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @deprecated (since 1.20) - replaced by `press` event
      *
      * Attaches event handler `fnFunction` to the {@link #event:tap tap} event of this `sap.m.Button`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Button` itself.
      *
      * Fired when the user taps the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTap(
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
    def attachTap(
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
      * Context object to call the event handler with. Defaults to this `sap.m.Button` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.m.Button`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPress(
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
      * @deprecated (since 1.20) - replaced by `press` event
      *
      * Detaches event handler `fnFunction` from the {@link #event:tap tap} event of this `sap.m.Button`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachTap(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachTap(
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
      * @deprecated (since 1.20) - replaced by `press` event
      *
      * Fires event {@link #event:tap tap} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireTap(): this.type = js.native
    def fireTap(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getActiveIcon activeIcon}.
      *
      * The source property of an alternative icon for the active (depressed) state of the button. Both active
      * and default icon properties should be defined and have the same type: image or icon font. If the `icon`
      * property is not set or has a different type, the active icon is not displayed.
      *
      * @returns Value of property `activeIcon`
      */
    def getActiveIcon(): URI = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy
      * ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.84.0
      *
      * Gets current value of property {@link #getAriaHasPopup ariaHasPopup}.
      *
      * Specifies the value of the `aria-haspopup` attribute
      *
      * If the value is `None`, the attribute will not be rendered. Otherwise it will be rendered with the selected
      * value.
      *
      * NOTE: Use this property only when a button is related to a popover/popup. The value needs to be equal
      * to the main/root role of the popup - e.g. dialog, menu or list (examples: if you have dialog -> dialog,
      * if you have menu -> menu; if you have list -> list; if you have dialog containing a list -> dialog).
      * Do not use it, if you open a standard sap.m.Dialog, MessageBox or other type of dialogs displayed as
      * on overlay over the application.
      *
      * Default value is `None`.
      *
      * @returns Value of property `ariaHasPopup`
      */
    def getAriaHasPopup(): HasPopup | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String) = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Determines whether the `Button` is enabled (default is set to `true`). A disabled `Button` has different
      * colors depending on the {@link sap.m.ButtonType ButtonType}.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Defines the icon to be displayed as graphical element within the `Button`. It can be an image or an icon
      * from the icon font.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconDensityAware iconDensityAware}.
      *
      * By default, this is set to true but then one or more requests are sent trying to get the density perfect
      * version of image if this version of image doesn't exist on the server.
      *
      * If only one version of image is provided, set this value to false to avoid the attempt of fetching density
      * perfect image.
      *
      * Default value is `true`.
      *
      * @returns Value of property `iconDensityAware`
      */
    def getIconDensityAware(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIconFirst iconFirst}.
      *
      * Determines whether the icon is displayed before the text.
      *
      * Default value is `true`.
      *
      * @returns Value of property `iconFirst`
      */
    def getIconFirst(): Boolean = js.native
    
    /**
      * Defines to which DOM reference the Popup should be docked
      *
      * @returns the DOM reference that Popup should dock to
      */
    def getPopupAnchorDomRef(): Element = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Determines the text of the `Button`.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Gets current value of property {@link #getTextDirection textDirection}.
      *
      * Specifies the element's text directionality with enumerated options. By default, the control inherits
      * text direction from the DOM.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `textDirection`
      */
    def getTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * Defines the `Button` type.
      *
      * Default value is `Default`.
      *
      * @returns Value of property `type`
      */
    def getType(): ButtonType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonType * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the `Button` width.
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
      * Sets a new value for property {@link #getActiveIcon activeIcon}.
      *
      * The source property of an alternative icon for the active (depressed) state of the button. Both active
      * and default icon properties should be defined and have the same type: image or icon font. If the `icon`
      * property is not set or has a different type, the active icon is not displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setActiveIcon(): this.type = js.native
    def setActiveIcon(/**
      * New value for property `activeIcon`
      */
    sActiveIcon: URI): this.type = js.native
    
    /**
      * @SINCE 1.84.0
      *
      * Sets a new value for property {@link #getAriaHasPopup ariaHasPopup}.
      *
      * Specifies the value of the `aria-haspopup` attribute
      *
      * If the value is `None`, the attribute will not be rendered. Otherwise it will be rendered with the selected
      * value.
      *
      * NOTE: Use this property only when a button is related to a popover/popup. The value needs to be equal
      * to the main/root role of the popup - e.g. dialog, menu or list (examples: if you have dialog -> dialog,
      * if you have menu -> menu; if you have list -> list; if you have dialog containing a list -> dialog).
      * Do not use it, if you open a standard sap.m.Dialog, MessageBox or other type of dialogs displayed as
      * on overlay over the application.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAriaHasPopup(): this.type = js.native
    def setAriaHasPopup(
      /**
      * New value for property `ariaHasPopup`
      */
    sAriaHasPopup: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String
    ): this.type = js.native
    def setAriaHasPopup(/**
      * New value for property `ariaHasPopup`
      */
    sAriaHasPopup: HasPopup): this.type = js.native
    
    /**
      * Badge maximum value setter - called when someone wants to change the value above which the badge value
      * is displayed with + after the value (ex. 999+)
      *
      * @returns this to allow method chaining
      */
    def setBadgeMaxValue(
      /**
      * maximum visible value of the badge (not greater than maximum Badge value - 9999)
      */
    iMax: Double
    ): this.type = js.native
    
    /**
      * Badge minimum value setter - called when someone wants to change the value below which the badge is hidden.
      *
      * @returns this to allow method chaining
      */
    def setBadgeMinValue(
      /**
      * minimum visible value of the badge (not less than minimum Badge value - 1)
      */
    iMin: Double
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Determines whether the `Button` is enabled (default is set to `true`). A disabled `Button` has different
      * colors depending on the {@link sap.m.ButtonType ButtonType}.
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
      * Defines the icon to be displayed as graphical element within the `Button`. It can be an image or an icon
      * from the icon font.
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
      * Sets a new value for property {@link #getIconDensityAware iconDensityAware}.
      *
      * By default, this is set to true but then one or more requests are sent trying to get the density perfect
      * version of image if this version of image doesn't exist on the server.
      *
      * If only one version of image is provided, set this value to false to avoid the attempt of fetching density
      * perfect image.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconDensityAware(): this.type = js.native
    def setIconDensityAware(/**
      * New value for property `iconDensityAware`
      */
    bIconDensityAware: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIconFirst iconFirst}.
      *
      * Determines whether the icon is displayed before the text.
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
      * Sets a new value for property {@link #getText text}.
      *
      * Determines the text of the `Button`.
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
      * @SINCE 1.28.0
      *
      * Sets a new value for property {@link #getTextDirection textDirection}.
      *
      * Specifies the element's text directionality with enumerated options. By default, the control inherits
      * text direction from the DOM.
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
      * Sets a new value for property {@link #getType type}.
      *
      * Defines the `Button` type.
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
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonType * / any */ String
    ): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: ButtonType): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the `Button` width.
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
  
  trait ButtonSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The source property of an alternative icon for the active (depressed) state of the button. Both active
      * and default icon properties should be defined and have the same type: image or icon font. If the `icon`
      * property is not set or has a different type, the active icon is not displayed.
      */
    var activeIcon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Association to controls / ids which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.84.0
      *
      * Specifies the value of the `aria-haspopup` attribute
      *
      * If the value is `None`, the attribute will not be rendered. Otherwise it will be rendered with the selected
      * value.
      *
      * NOTE: Use this property only when a button is related to a popover/popup. The value needs to be equal
      * to the main/root role of the popup - e.g. dialog, menu or list (examples: if you have dialog -> dialog,
      * if you have menu -> menu; if you have list -> list; if you have dialog containing a list -> dialog).
      * Do not use it, if you open a standard sap.m.Dialog, MessageBox or other type of dialogs displayed as
      * on overlay over the application.
      */
    var ariaHasPopup: js.UndefOr[
        HasPopup | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Determines whether the `Button` is enabled (default is set to `true`). A disabled `Button` has different
      * colors depending on the {@link sap.m.ButtonType ButtonType}.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the icon to be displayed as graphical element within the `Button`. It can be an image or an icon
      * from the icon font.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * By default, this is set to true but then one or more requests are sent trying to get the density perfect
      * version of image if this version of image doesn't exist on the server.
      *
      * If only one version of image is provided, set this value to false to avoid the attempt of fetching density
      * perfect image.
      */
    var iconDensityAware: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the icon is displayed before the text.
      */
    var iconFirst: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the user clicks or taps on the control.
      */
    var press: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @deprecated (since 1.20) - replaced by `press` event
      *
      * Fired when the user taps the control.
      */
    var tap: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Determines the text of the `Button`.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.28.0
      *
      * Specifies the element's text directionality with enumerated options. By default, the control inherits
      * text direction from the DOM.
      */
    var textDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the `Button` type.
      */
    var `type`: js.UndefOr[
        ButtonType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the `Button` width.
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
    
    extension [Self <: ButtonSettings](x: Self) {
      
      inline def setActiveIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "activeIcon", value.asInstanceOf[js.Any])
      
      inline def setActiveIconUndefined: Self = StObject.set(x, "activeIcon", js.undefined)
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaHasPopup(
        value: HasPopup | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "ariaHasPopup", value.asInstanceOf[js.Any])
      
      inline def setAriaHasPopupUndefined: Self = StObject.set(x, "ariaHasPopup", js.undefined)
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconDensityAware(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconDensityAware", value.asInstanceOf[js.Any])
      
      inline def setIconDensityAwareUndefined: Self = StObject.set(x, "iconDensityAware", js.undefined)
      
      inline def setIconFirst(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconFirst", value.asInstanceOf[js.Any])
      
      inline def setIconFirstUndefined: Self = StObject.set(x, "iconFirst", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setTap(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "tap", js.Any.fromFunction1(value))
      
      inline def setTapUndefined: Self = StObject.set(x, "tap", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
      
      inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(
        value: ButtonType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
