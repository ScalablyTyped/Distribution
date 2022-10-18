package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.ButtonType
import typings.openui5.sapMLibraryMod.MenuButtonMode
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiCorePopupMod.Dock
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMMenuButtonMod {
  
  @JSImport("sap/m/MenuButton", JSImport.Default)
  @js.native
  /**
    * Constructor for a new MenuButton.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/menu-button/ Menu Button}
    */
  open class default () extends MenuButton {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: MenuButtonSettings) = this()
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
    mSettings: MenuButtonSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: MenuButtonSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/MenuButton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.MenuButton with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, MenuButton]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MenuButton],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.MenuButton.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MenuButton
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
      * @SINCE 1.94.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:beforeMenuOpen beforeMenuOpen} event of this
      * `sap.m.MenuButton`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MenuButton` itself.
      *
      * Fired before menu opening when the `buttonMode` is set to `Split` and the user presses the arrow button.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeMenuOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeMenuOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.MenuButton` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.94.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:beforeMenuOpen beforeMenuOpen} event of this
      * `sap.m.MenuButton`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MenuButton` itself.
      *
      * Fired before menu opening when the `buttonMode` is set to `Split` and the user presses the arrow button.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeMenuOpen(
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
    def attachBeforeMenuOpen(
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
      * Context object to call the event handler with. Defaults to this `sap.m.MenuButton` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:defaultAction defaultAction} event of this `sap.m.MenuButton`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MenuButton` itself.
      *
      * Fired when the `buttonMode` is set to `Split` and the user presses the main button unless `useDefaultActionOnly`
      * is set to `false` and another action from the menu has been selected previously.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDefaultAction(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachDefaultAction(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.MenuButton` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:defaultAction defaultAction} event of this `sap.m.MenuButton`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MenuButton` itself.
      *
      * Fired when the `buttonMode` is set to `Split` and the user presses the main button unless `useDefaultActionOnly`
      * is set to `false` and another action from the menu has been selected previously.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDefaultAction(
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
    def attachDefaultAction(
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
      * Context object to call the event handler with. Defaults to this `sap.m.MenuButton` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the menu in the aggregation {@link #getMenu menu}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMenu(): this.type = js.native
    
    /**
      * @SINCE 1.94.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:beforeMenuOpen beforeMenuOpen} event of this
      * `sap.m.MenuButton`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeMenuOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBeforeMenuOpen(
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
      * Detaches event handler `fnFunction` from the {@link #event:defaultAction defaultAction} event of this
      * `sap.m.MenuButton`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDefaultAction(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachDefaultAction(
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
      * @SINCE 1.94.0
      *
      * Fires event {@link #event:beforeMenuOpen beforeMenuOpen} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforeMenuOpen(): this.type = js.native
    def fireBeforeMenuOpen(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:defaultAction defaultAction} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireDefaultAction(): this.type = js.native
    def fireDefaultAction(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getActiveIcon activeIcon}.
      *
      * The source property of an alternative icon for the active (pressed) state of the button. Both active
      * and default icon properties should be defined and of the same type - image or icon font. If the `icon`
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
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getButtonMode buttonMode}.
      *
      * Defines whether the `MenuButton` is set to `Regular` or `Split` mode.
      *
      * Default value is `Regular`.
      *
      * @returns Value of property `buttonMode`
      */
    def getButtonMode(): MenuButtonMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MenuButtonMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Boolean property to enable the control (default is `true`).
      * **Note:** Depending on custom settings, the buttons that are disabled have other colors than the enabled
      * ones.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Defines the icon to be displayed as a graphical element within the button. It can be an image or an icon
      * from the icon font.
      *
      * Note: If only an icon (without text) is provided when `buttonMode` is set to `Split`, please provide
      * icons for all menu items. Otherwise the action button will be displayed with no icon or text after item
      * selection since there is not enough space for a text.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconDensityAware iconDensityAware}.
      *
      * When set to `true` (default), one or more requests are sent trying to get the density perfect version
      * of image if this version of image doesn't exist on the server. If only one version of image is provided,
      * set this value to `false` to avoid the attempt of fetching density perfect image.
      *
      * Default value is `true`.
      *
      * @returns Value of property `iconDensityAware`
      */
    def getIconDensityAware(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getMenu menu}.
      *
      * Defines the menu that opens for this button.
      */
    def getMenu(): typings.openui5.sapMMenuMod.default = js.native
    
    /**
      * @SINCE 1.56.0
      *
      * Gets current value of property {@link #getMenuPosition menuPosition}.
      *
      * Specifies the position of the popup menu with enumerated options. By default, the control opens the menu
      * at its bottom left side.
      *
      * **Note:** In the case that the menu has no space to show itself in the view port of the current window
      * it tries to open itself to the inverted direction.
      *
      * Default value is `BeginBottom`.
      *
      * @returns Value of property `menuPosition`
      */
    def getMenuPosition(): Dock = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines the text of the `MenuButton`.
      * **Note:** In `Split` `buttonMode` with `useDefaultActionOnly` set to `false`, the text is changed to
      * display the last selected item's text, while in `Regular` `buttonMode` the text stays unchanged.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
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
      * Defines the type of the `MenuButton` (for example, Default, Accept, Reject, Back, etc.)
      *
      * **Note:** Not all existing types are valid for the control. See {@link sap.m.ButtonType} documentation.
      *
      * Default value is `Default`.
      *
      * @returns Value of property `type`
      */
    def getType(): ButtonType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonType * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getUseDefaultActionOnly useDefaultActionOnly}.
      *
      * Controls whether the default action handler is invoked always or it is invoked only until a menu item
      * is selected. Usable only if `buttonMode` is set to `Split`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `useDefaultActionOnly`
      */
    def getUseDefaultActionOnly(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the `MenuButton`.
      * **Note:**As per visual design this width can be maximum of 12rem (192px).
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
      * The source property of an alternative icon for the active (pressed) state of the button. Both active
      * and default icon properties should be defined and of the same type - image or icon font. If the `icon`
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
    
    def setButtonMode(
      /**
      * The new button mode
      */
    sMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MenuButtonMode * / any */ String
    ): this.type = js.native
    /**
      * Sets the `buttonMode` of the control.
      *
      * @returns This instance
      */
    def setButtonMode(/**
      * The new button mode
      */
    sMode: MenuButtonMode): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Boolean property to enable the control (default is `true`).
      * **Note:** Depending on custom settings, the buttons that are disabled have other colors than the enabled
      * ones.
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
      * Defines the icon to be displayed as a graphical element within the button. It can be an image or an icon
      * from the icon font.
      *
      * Note: If only an icon (without text) is provided when `buttonMode` is set to `Split`, please provide
      * icons for all menu items. Otherwise the action button will be displayed with no icon or text after item
      * selection since there is not enough space for a text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
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
      * When set to `true` (default), one or more requests are sent trying to get the density perfect version
      * of image if this version of image doesn't exist on the server. If only one version of image is provided,
      * set this value to `false` to avoid the attempt of fetching density perfect image.
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
      * Sets the aggregated {@link #getMenu menu}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMenu(/**
      * The menu to set
      */
    oMenu: typings.openui5.sapMMenuMod.default): this.type = js.native
    
    /**
      * @SINCE 1.56.0
      *
      * Sets a new value for property {@link #getMenuPosition menuPosition}.
      *
      * Specifies the position of the popup menu with enumerated options. By default, the control opens the menu
      * at its bottom left side.
      *
      * **Note:** In the case that the menu has no space to show itself in the view port of the current window
      * it tries to open itself to the inverted direction.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `BeginBottom`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMenuPosition(): this.type = js.native
    def setMenuPosition(/**
      * New value for property `menuPosition`
      */
    sMenuPosition: Dock): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Defines the text of the `MenuButton`.
      * **Note:** In `Split` `buttonMode` with `useDefaultActionOnly` set to `false`, the text is changed to
      * display the last selected item's text, while in `Regular` `buttonMode` the text stays unchanged.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(): this.type = js.native
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
    
    /**
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
      * Defines the type of the `MenuButton` (for example, Default, Accept, Reject, Back, etc.)
      *
      * **Note:** Not all existing types are valid for the control. See {@link sap.m.ButtonType} documentation.
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
      * Sets a new value for property {@link #getUseDefaultActionOnly useDefaultActionOnly}.
      *
      * Controls whether the default action handler is invoked always or it is invoked only until a menu item
      * is selected. Usable only if `buttonMode` is set to `Split`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUseDefaultActionOnly(): this.type = js.native
    def setUseDefaultActionOnly(/**
      * New value for property `useDefaultActionOnly`
      */
    bUseDefaultActionOnly: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the `MenuButton`.
      * **Note:**As per visual design this width can be maximum of 12rem (192px).
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
  
  trait MenuButtonSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The source property of an alternative icon for the active (pressed) state of the button. Both active
      * and default icon properties should be defined and of the same type - image or icon font. If the `icon`
      * property is not set or has a different type, the active icon is not displayed.
      */
    var activeIcon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Association to controls / ids which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.94.0
      *
      * Fired before menu opening when the `buttonMode` is set to `Split` and the user presses the arrow button.
      */
    var beforeMenuOpen: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines whether the `MenuButton` is set to `Regular` or `Split` mode.
      */
    var buttonMode: js.UndefOr[
        MenuButtonMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MenuButtonMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Fired when the `buttonMode` is set to `Split` and the user presses the main button unless `useDefaultActionOnly`
      * is set to `false` and another action from the menu has been selected previously.
      */
    var defaultAction: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Boolean property to enable the control (default is `true`).
      * **Note:** Depending on custom settings, the buttons that are disabled have other colors than the enabled
      * ones.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the icon to be displayed as a graphical element within the button. It can be an image or an icon
      * from the icon font.
      *
      * Note: If only an icon (without text) is provided when `buttonMode` is set to `Split`, please provide
      * icons for all menu items. Otherwise the action button will be displayed with no icon or text after item
      * selection since there is not enough space for a text.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * When set to `true` (default), one or more requests are sent trying to get the density perfect version
      * of image if this version of image doesn't exist on the server. If only one version of image is provided,
      * set this value to `false` to avoid the attempt of fetching density perfect image.
      */
    var iconDensityAware: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the menu that opens for this button.
      */
    var menu: js.UndefOr[typings.openui5.sapMMenuMod.default] = js.undefined
    
    /**
      * @SINCE 1.56.0
      *
      * Specifies the position of the popup menu with enumerated options. By default, the control opens the menu
      * at its bottom left side.
      *
      * **Note:** In the case that the menu has no space to show itself in the view port of the current window
      * it tries to open itself to the inverted direction.
      */
    var menuPosition: js.UndefOr[Dock | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the text of the `MenuButton`.
      * **Note:** In `Split` `buttonMode` with `useDefaultActionOnly` set to `false`, the text is changed to
      * display the last selected item's text, while in `Regular` `buttonMode` the text stays unchanged.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies the element's text directionality with enumerated options. By default, the control inherits
      * text direction from the DOM.
      */
    var textDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the type of the `MenuButton` (for example, Default, Accept, Reject, Back, etc.)
      *
      * **Note:** Not all existing types are valid for the control. See {@link sap.m.ButtonType} documentation.
      */
    var `type`: js.UndefOr[
        ButtonType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Controls whether the default action handler is invoked always or it is invoked only until a menu item
      * is selected. Usable only if `buttonMode` is set to `Split`.
      */
    var useDefaultActionOnly: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the width of the `MenuButton`.
      * **Note:**As per visual design this width can be maximum of 12rem (192px).
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object MenuButtonSettings {
    
    inline def apply(): MenuButtonSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuButtonSettings]
    }
    
    extension [Self <: MenuButtonSettings](x: Self) {
      
      inline def setActiveIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "activeIcon", value.asInstanceOf[js.Any])
      
      inline def setActiveIconUndefined: Self = StObject.set(x, "activeIcon", js.undefined)
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setBeforeMenuOpen(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeMenuOpen", js.Any.fromFunction1(value))
      
      inline def setBeforeMenuOpenUndefined: Self = StObject.set(x, "beforeMenuOpen", js.undefined)
      
      inline def setButtonMode(
        value: MenuButtonMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MenuButtonMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "buttonMode", value.asInstanceOf[js.Any])
      
      inline def setButtonModeUndefined: Self = StObject.set(x, "buttonMode", js.undefined)
      
      inline def setDefaultAction(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "defaultAction", js.Any.fromFunction1(value))
      
      inline def setDefaultActionUndefined: Self = StObject.set(x, "defaultAction", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconDensityAware(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconDensityAware", value.asInstanceOf[js.Any])
      
      inline def setIconDensityAwareUndefined: Self = StObject.set(x, "iconDensityAware", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMenu(value: typings.openui5.sapMMenuMod.default): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuPosition(value: Dock | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "menuPosition", value.asInstanceOf[js.Any])
      
      inline def setMenuPositionUndefined: Self = StObject.set(x, "menuPosition", js.undefined)
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
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
      
      inline def setUseDefaultActionOnly(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "useDefaultActionOnly", value.asInstanceOf[js.Any])
      
      inline def setUseDefaultActionOnlyUndefined: Self = StObject.set(x, "useDefaultActionOnly", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
