package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcFioriLibraryMod.IShellBarItem
import typings.openui5.sapUiWebcMainLibraryMod.IAvatar
import typings.openui5.sapUiWebcMainLibraryMod.IButton
import typings.openui5.sapUiWebcMainLibraryMod.IInput
import typings.openui5.sapUiWebcMainLibraryMod.IListItem
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcFioriShellBarMod {
  
  @JSImport("sap/ui/webc/fiori/ShellBar", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ShellBar`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ShellBar {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ShellBarSettings) = this()
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
    mSettings: ShellBarSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ShellBarSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/fiori/ShellBar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.fiori.ShellBar with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ShellBar]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ShellBar],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.fiori.ShellBar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait ShellBar
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(/**
      * The item to add; if empty, nothing is inserted
      */
    oItem: IShellBarItem): this.type = js.native
    
    /**
      * Adds some menuItem to the aggregation {@link #getMenuItems menuItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addMenuItem(/**
      * The menuItem to add; if empty, nothing is inserted
      */
    oMenuItem: IListItem): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:coPilotClick coPilotClick} event of this `sap.ui.webc.fiori.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ShellBar` itself.
      *
      * Fired, when the co pilot is activated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCoPilotClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarCoPilotClickEvent, Unit]
    ): this.type = js.native
    def attachCoPilotClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarCoPilotClickEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:coPilotClick coPilotClick} event of this `sap.ui.webc.fiori.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ShellBar` itself.
      *
      * Fired, when the co pilot is activated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCoPilotClick(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarCoPilotClickEvent, Unit]
    ): this.type = js.native
    def attachCoPilotClick(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarCoPilotClickEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:logoClick logoClick} event of this `sap.ui.webc.fiori.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ShellBar` itself.
      *
      * Fired, when the logo is activated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLogoClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarLogoClickEvent, Unit]
    ): this.type = js.native
    def attachLogoClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarLogoClickEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:logoClick logoClick} event of this `sap.ui.webc.fiori.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ShellBar` itself.
      *
      * Fired, when the logo is activated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLogoClick(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarLogoClickEvent, Unit]
    ): this.type = js.native
    def attachLogoClick(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarLogoClickEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:menuItemClick menuItemClick} event of this `sap.ui.webc.fiori.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ShellBar` itself.
      *
      * Fired, when a menu item is activated **Note:** You can prevent closing of overflow popover by calling
      * `event.preventDefault()`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMenuItemClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarMenuItemClickEvent, Unit]
    ): this.type = js.native
    def attachMenuItemClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarMenuItemClickEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:menuItemClick menuItemClick} event of this `sap.ui.webc.fiori.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ShellBar` itself.
      *
      * Fired, when a menu item is activated **Note:** You can prevent closing of overflow popover by calling
      * `event.preventDefault()`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMenuItemClick(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarMenuItemClickEvent, Unit]
    ): this.type = js.native
    def attachMenuItemClick(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarMenuItemClickEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:notificationsClick notificationsClick} event
      * of this `sap.ui.webc.fiori.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ShellBar` itself.
      *
      * Fired, when the notification icon is activated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNotificationsClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarNotificationsClickEvent, Unit]
    ): this.type = js.native
    def attachNotificationsClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarNotificationsClickEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:notificationsClick notificationsClick} event
      * of this `sap.ui.webc.fiori.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ShellBar` itself.
      *
      * Fired, when the notification icon is activated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNotificationsClick(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarNotificationsClickEvent, Unit]
    ): this.type = js.native
    def attachNotificationsClick(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarNotificationsClickEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:productSwitchClick productSwitchClick} event
      * of this `sap.ui.webc.fiori.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ShellBar` itself.
      *
      * Fired, when the product switch icon is activated. **Note:** You can prevent closing of overflow popover
      * by calling `event.preventDefault()`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachProductSwitchClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarProductSwitchClickEvent, Unit]
    ): this.type = js.native
    def attachProductSwitchClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarProductSwitchClickEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:productSwitchClick productSwitchClick} event
      * of this `sap.ui.webc.fiori.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ShellBar` itself.
      *
      * Fired, when the product switch icon is activated. **Note:** You can prevent closing of overflow popover
      * by calling `event.preventDefault()`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachProductSwitchClick(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarProductSwitchClickEvent, Unit]
    ): this.type = js.native
    def attachProductSwitchClick(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarProductSwitchClickEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:profileClick profileClick} event of this `sap.ui.webc.fiori.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ShellBar` itself.
      *
      * Fired, when the profile slot is present.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachProfileClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarProfileClickEvent, Unit]
    ): this.type = js.native
    def attachProfileClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarProfileClickEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:profileClick profileClick} event of this `sap.ui.webc.fiori.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ShellBar` itself.
      *
      * Fired, when the profile slot is present.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachProfileClick(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarProfileClickEvent, Unit]
    ): this.type = js.native
    def attachProfileClick(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarProfileClickEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes the overflow area. Useful to manually close the overflow after having suppressed automatic closing
      * with preventDefault() of ShellbarItem's press event
      */
    def closeOverflow(): Unit = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Destroys the logo in the aggregation {@link #getLogo logo}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLogo(): this.type = js.native
    
    /**
      * Destroys all the menuItems in the aggregation {@link #getMenuItems menuItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMenuItems(): this.type = js.native
    
    /**
      * Destroys the profile in the aggregation {@link #getProfile profile}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyProfile(): this.type = js.native
    
    /**
      * Destroys the searchField in the aggregation {@link #getSearchField searchField}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySearchField(): this.type = js.native
    
    /**
      * Destroys the startButton in the aggregation {@link #getStartButton startButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyStartButton(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:coPilotClick coPilotClick} event of this `sap.ui.webc.fiori.ShellBar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachCoPilotClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarCoPilotClickEvent, Unit]
    ): this.type = js.native
    def detachCoPilotClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarCoPilotClickEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:logoClick logoClick} event of this `sap.ui.webc.fiori.ShellBar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLogoClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarLogoClickEvent, Unit]
    ): this.type = js.native
    def detachLogoClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarLogoClickEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:menuItemClick menuItemClick} event of this
      * `sap.ui.webc.fiori.ShellBar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachMenuItemClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarMenuItemClickEvent, Unit]
    ): this.type = js.native
    def detachMenuItemClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarMenuItemClickEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:notificationsClick notificationsClick} event
      * of this `sap.ui.webc.fiori.ShellBar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachNotificationsClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarNotificationsClickEvent, Unit]
    ): this.type = js.native
    def detachNotificationsClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarNotificationsClickEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:productSwitchClick productSwitchClick} event
      * of this `sap.ui.webc.fiori.ShellBar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachProductSwitchClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarProductSwitchClickEvent, Unit]
    ): this.type = js.native
    def detachProductSwitchClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarProductSwitchClickEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:profileClick profileClick} event of this `sap.ui.webc.fiori.ShellBar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachProfileClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarProfileClickEvent, Unit]
    ): this.type = js.native
    def detachProfileClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarProfileClickEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:coPilotClick coPilotClick} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireCoPilotClick(): this.type = js.native
    def fireCoPilotClick(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ShellBar$CoPilotClickEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:logoClick logoClick} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLogoClick(): this.type = js.native
    def fireLogoClick(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ShellBar$LogoClickEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:menuItemClick menuItemClick} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireMenuItemClick(): this.type = js.native
    def fireMenuItemClick(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ShellBar$MenuItemClickEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:notificationsClick notificationsClick} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireNotificationsClick(): Boolean = js.native
    def fireNotificationsClick(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ShellBar$NotificationsClickEventParameters
    ): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:productSwitchClick productSwitchClick} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireProductSwitchClick(): Boolean = js.native
    def fireProductSwitchClick(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ShellBar$ProductSwitchClickEventParameters
    ): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:profileClick profileClick} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireProfileClick(): this.type = js.native
    def fireProfileClick(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ShellBar$ProfileClickEventParameters
    ): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAccessibilityTexts accessibilityTexts}.
      *
      * An object of strings that defines several additional accessibility texts for even further customization.
      *
      * It supports the following fields: - `profileButtonTitle`: defines the tooltip for the profile button
      * - `logoTitle`: defines the tooltip for the logo
      *
      * Default value is `{}`.
      *
      * @returns Value of property `accessibilityTexts`
      */
    def getAccessibilityTexts(): js.Object = js.native
    
    /**
      * Returns the `copilot` DOM ref.
      */
    def getCopilotDomRef(): Unit = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Defines the `sap.ui.webc.fiori.ShellBar` aditional items.
      *
      *  **Note:** You can use the <ui5-shellbar-item></ui5-shellbar-item>.
      */
    def getItems(): js.Array[IShellBarItem] = js.native
    
    /**
      * Gets content of aggregation {@link #getLogo logo}.
      *
      * Defines the logo of the `sap.ui.webc.fiori.ShellBar`. For example, you can use `sap.ui.webc.main.Avatar`
      * or `img` elements as logo.
      */
    def getLogo(): IAvatar = js.native
    
    /**
      * Returns the `logo` DOM ref.
      */
    def getLogoDomRef(): Unit = js.native
    
    /**
      * Gets content of aggregation {@link #getMenuItems menuItems}.
      *
      * Defines the items displayed in menu after a click on the primary title.
      *
      *  **Note:** You can use the <ui5-li></ui5-li> and its ancestors.
      */
    def getMenuItems(): js.Array[IListItem] = js.native
    
    /**
      * Gets current value of property {@link #getNotificationsCount notificationsCount}.
      *
      * Defines the `notificationsCount`, displayed in the notification icon top-right corner.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `notificationsCount`
      */
    def getNotificationsCount(): String = js.native
    
    /**
      * Returns the `notifications` icon DOM ref.
      */
    def getNotificationsDomRef(): Unit = js.native
    
    /**
      * Returns the `overflow` icon DOM ref.
      */
    def getOverflowDomRef(): Unit = js.native
    
    /**
      * Gets current value of property {@link #getPrimaryTitle primaryTitle}.
      *
      * Defines the `primaryTitle`.
      *
      *  **Note:** The `primaryTitle` would be hidden on S screen size (less than approx. 700px).
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `primaryTitle`
      */
    def getPrimaryTitle(): String = js.native
    
    /**
      * Returns the `product-switch` icon DOM ref.
      */
    def getProductSwitchDomRef(): Unit = js.native
    
    /**
      * Gets content of aggregation {@link #getProfile profile}.
      *
      * You can pass `sap.ui.webc.main.Avatar` to set the profile image/icon. If no profile slot is set - profile
      * will be excluded from actions.
      *
      * Note: We recommend not using the `size` attribute of `sap.ui.webc.main.Avatar` because it should have
      * specific size by design in the context of `sap.ui.webc.fiori.ShellBar` profile.
      */
    def getProfile(): IAvatar = js.native
    
    /**
      * Returns the `profile` icon DOM ref.
      */
    def getProfileDomRef(): Unit = js.native
    
    /**
      * Gets content of aggregation {@link #getSearchField searchField}.
      *
      * Defines the `sap.ui.webc.main.Input`, that will be used as a search field.
      */
    def getSearchField(): IInput = js.native
    
    /**
      * Gets current value of property {@link #getSecondaryTitle secondaryTitle}.
      *
      * Defines the `secondaryTitle`.
      *
      *  **Note:** The `secondaryTitle` would be hidden on S and M screen sizes (less than approx. 1300px).
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `secondaryTitle`
      */
    def getSecondaryTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getShowCoPilot showCoPilot}.
      *
      * Defines, if the product CoPilot icon would be displayed.
      *  **Note:** By default the co-pilot is displayed as static SVG. If you need an animated co-pilot, you
      * can import the `"@ui5/webcomponents-fiori/dist/features/CoPilotAnimation.js"` module as add-on feature.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showCoPilot`
      */
    def getShowCoPilot(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowNotifications showNotifications}.
      *
      * Defines, if the notification icon would be displayed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showNotifications`
      */
    def getShowNotifications(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowProductSwitch showProductSwitch}.
      *
      * Defines, if the product switch icon would be displayed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showProductSwitch`
      */
    def getShowProductSwitch(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getStartButton startButton}.
      *
      * Defines a `sap.ui.webc.main.Button` in the bar that will be placed in the beginning. We encourage this
      * slot to be used for a back or home button. It gets overstyled to match ShellBar's styling.
      */
    def getStartButton(): IButton = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.fiori.IShellBarItem` in the aggregation {@link #getItems items}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(/**
      * The item whose index is looked for
      */
    oItem: IShellBarItem): int = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.main.IListItem` in the aggregation {@link #getMenuItems menuItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfMenuItem(/**
      * The menuItem whose index is looked for
      */
    oMenuItem: IListItem): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: IShellBarItem,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a menuItem into the aggregation {@link #getMenuItems menuItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertMenuItem(
      /**
      * The menuItem to insert; if empty, nothing is inserted
      */
    oMenuItem: IListItem,
      /**
      * The `0`-based index the menuItem should be inserted at; for a negative value of `iIndex`, the menuItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the menuItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[IShellBarItem] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getMenuItems menuItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllMenuItems(): js.Array[IListItem] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): IShellBarItem | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): IShellBarItem | Null = js.native
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: IShellBarItem): IShellBarItem | Null = js.native
    
    def removeMenuItem(/**
      * The menuItem to remove or its index or id
      */
    vMenuItem: String): IListItem | Null = js.native
    /**
      * Removes a menuItem from the aggregation {@link #getMenuItems menuItems}.
      *
      * @returns The removed menuItem or `null`
      */
    def removeMenuItem(/**
      * The menuItem to remove or its index or id
      */
    vMenuItem: int): IListItem | Null = js.native
    def removeMenuItem(/**
      * The menuItem to remove or its index or id
      */
    vMenuItem: IListItem): IListItem | Null = js.native
    
    /**
      * Sets a new value for property {@link #getAccessibilityTexts accessibilityTexts}.
      *
      * An object of strings that defines several additional accessibility texts for even further customization.
      *
      * It supports the following fields: - `profileButtonTitle`: defines the tooltip for the profile button
      * - `logoTitle`: defines the tooltip for the logo
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `{}`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibilityTexts(): this.type = js.native
    def setAccessibilityTexts(/**
      * New value for property `accessibilityTexts`
      */
    oAccessibilityTexts: js.Object): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getLogo logo}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLogo(/**
      * The logo to set
      */
    oLogo: IAvatar): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNotificationsCount notificationsCount}.
      *
      * Defines the `notificationsCount`, displayed in the notification icon top-right corner.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNotificationsCount(): this.type = js.native
    def setNotificationsCount(/**
      * New value for property `notificationsCount`
      */
    sNotificationsCount: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPrimaryTitle primaryTitle}.
      *
      * Defines the `primaryTitle`.
      *
      *  **Note:** The `primaryTitle` would be hidden on S screen size (less than approx. 700px).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPrimaryTitle(): this.type = js.native
    def setPrimaryTitle(/**
      * New value for property `primaryTitle`
      */
    sPrimaryTitle: String): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getProfile profile}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setProfile(/**
      * The profile to set
      */
    oProfile: IAvatar): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getSearchField searchField}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSearchField(/**
      * The searchField to set
      */
    oSearchField: IInput): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSecondaryTitle secondaryTitle}.
      *
      * Defines the `secondaryTitle`.
      *
      *  **Note:** The `secondaryTitle` would be hidden on S and M screen sizes (less than approx. 1300px).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSecondaryTitle(): this.type = js.native
    def setSecondaryTitle(/**
      * New value for property `secondaryTitle`
      */
    sSecondaryTitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowCoPilot showCoPilot}.
      *
      * Defines, if the product CoPilot icon would be displayed.
      *  **Note:** By default the co-pilot is displayed as static SVG. If you need an animated co-pilot, you
      * can import the `"@ui5/webcomponents-fiori/dist/features/CoPilotAnimation.js"` module as add-on feature.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowCoPilot(): this.type = js.native
    def setShowCoPilot(/**
      * New value for property `showCoPilot`
      */
    bShowCoPilot: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowNotifications showNotifications}.
      *
      * Defines, if the notification icon would be displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowNotifications(): this.type = js.native
    def setShowNotifications(/**
      * New value for property `showNotifications`
      */
    bShowNotifications: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowProductSwitch showProductSwitch}.
      *
      * Defines, if the product switch icon would be displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowProductSwitch(): this.type = js.native
    def setShowProductSwitch(/**
      * New value for property `showProductSwitch`
      */
    bShowProductSwitch: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getStartButton startButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStartButton(/**
      * The startButton to set
      */
    oStartButton: IButton): this.type = js.native
  }
  
  trait ShellBar$CoPilotClickEventParameters extends StObject {
    
    /**
      * dom ref of the activated element
      */
    var targetRef: js.UndefOr[HTMLElement] = js.undefined
  }
  object ShellBar$CoPilotClickEventParameters {
    
    inline def apply(): ShellBar$CoPilotClickEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellBar$CoPilotClickEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellBar$CoPilotClickEventParameters] (val x: Self) extends AnyVal {
      
      inline def setTargetRef(value: HTMLElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
    }
  }
  
  trait ShellBar$LogoClickEventParameters extends StObject {
    
    /**
      * dom ref of the activated element
      */
    var targetRef: js.UndefOr[HTMLElement] = js.undefined
  }
  object ShellBar$LogoClickEventParameters {
    
    inline def apply(): ShellBar$LogoClickEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellBar$LogoClickEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellBar$LogoClickEventParameters] (val x: Self) extends AnyVal {
      
      inline def setTargetRef(value: HTMLElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
    }
  }
  
  trait ShellBar$MenuItemClickEventParameters extends StObject {
    
    /**
      * DOM ref of the activated list item
      */
    var item: js.UndefOr[HTMLElement] = js.undefined
  }
  object ShellBar$MenuItemClickEventParameters {
    
    inline def apply(): ShellBar$MenuItemClickEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellBar$MenuItemClickEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellBar$MenuItemClickEventParameters] (val x: Self) extends AnyVal {
      
      inline def setItem(value: HTMLElement): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    }
  }
  
  trait ShellBar$NotificationsClickEventParameters extends StObject {
    
    /**
      * dom ref of the activated element
      */
    var targetRef: js.UndefOr[HTMLElement] = js.undefined
  }
  object ShellBar$NotificationsClickEventParameters {
    
    inline def apply(): ShellBar$NotificationsClickEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellBar$NotificationsClickEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellBar$NotificationsClickEventParameters] (val x: Self) extends AnyVal {
      
      inline def setTargetRef(value: HTMLElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
    }
  }
  
  trait ShellBar$ProductSwitchClickEventParameters extends StObject {
    
    /**
      * dom ref of the activated element
      */
    var targetRef: js.UndefOr[HTMLElement] = js.undefined
  }
  object ShellBar$ProductSwitchClickEventParameters {
    
    inline def apply(): ShellBar$ProductSwitchClickEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellBar$ProductSwitchClickEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellBar$ProductSwitchClickEventParameters] (val x: Self) extends AnyVal {
      
      inline def setTargetRef(value: HTMLElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
    }
  }
  
  trait ShellBar$ProfileClickEventParameters extends StObject {
    
    /**
      * dom ref of the activated element
      */
    var targetRef: js.UndefOr[HTMLElement] = js.undefined
  }
  object ShellBar$ProfileClickEventParameters {
    
    inline def apply(): ShellBar$ProfileClickEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellBar$ProfileClickEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellBar$ProfileClickEventParameters] (val x: Self) extends AnyVal {
      
      inline def setTargetRef(value: HTMLElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
    }
  }
  
  type ShellBarCoPilotClickEvent = typings.openui5.sapUiBaseEventMod.default[ShellBar$CoPilotClickEventParameters]
  
  type ShellBarCoPilotClickEventParameters = ShellBar$CoPilotClickEventParameters
  
  type ShellBarLogoClickEvent = typings.openui5.sapUiBaseEventMod.default[ShellBar$LogoClickEventParameters]
  
  type ShellBarLogoClickEventParameters = ShellBar$LogoClickEventParameters
  
  type ShellBarMenuItemClickEvent = typings.openui5.sapUiBaseEventMod.default[ShellBar$MenuItemClickEventParameters]
  
  type ShellBarMenuItemClickEventParameters = ShellBar$MenuItemClickEventParameters
  
  type ShellBarNotificationsClickEvent = typings.openui5.sapUiBaseEventMod.default[ShellBar$NotificationsClickEventParameters]
  
  type ShellBarNotificationsClickEventParameters = ShellBar$NotificationsClickEventParameters
  
  type ShellBarProductSwitchClickEvent = typings.openui5.sapUiBaseEventMod.default[ShellBar$ProductSwitchClickEventParameters]
  
  type ShellBarProductSwitchClickEventParameters = ShellBar$ProductSwitchClickEventParameters
  
  type ShellBarProfileClickEvent = typings.openui5.sapUiBaseEventMod.default[ShellBar$ProfileClickEventParameters]
  
  type ShellBarProfileClickEventParameters = ShellBar$ProfileClickEventParameters
  
  trait ShellBarSettings
    extends StObject
       with ControlSettings {
    
    /**
      * An object of strings that defines several additional accessibility texts for even further customization.
      *
      * It supports the following fields: - `profileButtonTitle`: defines the tooltip for the profile button
      * - `logoTitle`: defines the tooltip for the logo
      */
    var accessibilityTexts: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired, when the co pilot is activated.
      */
    var coPilotClick: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$CoPilotClickEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Defines the `sap.ui.webc.fiori.ShellBar` aditional items.
      *
      *  **Note:** You can use the <ui5-shellbar-item></ui5-shellbar-item>.
      */
    var items: js.UndefOr[
        js.Array[IShellBarItem] | IShellBarItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the logo of the `sap.ui.webc.fiori.ShellBar`. For example, you can use `sap.ui.webc.main.Avatar`
      * or `img` elements as logo.
      */
    var logo: js.UndefOr[IAvatar] = js.undefined
    
    /**
      * Fired, when the logo is activated.
      */
    var logoClick: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$LogoClickEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Fired, when a menu item is activated **Note:** You can prevent closing of overflow popover by calling
      * `event.preventDefault()`.
      */
    var menuItemClick: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$MenuItemClickEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Defines the items displayed in menu after a click on the primary title.
      *
      *  **Note:** You can use the <ui5-li></ui5-li> and its ancestors.
      */
    var menuItems: js.UndefOr[
        js.Array[IListItem] | IListItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired, when the notification icon is activated.
      */
    var notificationsClick: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$NotificationsClickEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Defines the `notificationsCount`, displayed in the notification icon top-right corner.
      */
    var notificationsCount: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the `primaryTitle`.
      *
      *  **Note:** The `primaryTitle` would be hidden on S screen size (less than approx. 700px).
      */
    var primaryTitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fired, when the product switch icon is activated. **Note:** You can prevent closing of overflow popover
      * by calling `event.preventDefault()`.
      */
    var productSwitchClick: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$ProductSwitchClickEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * You can pass `sap.ui.webc.main.Avatar` to set the profile image/icon. If no profile slot is set - profile
      * will be excluded from actions.
      *
      * Note: We recommend not using the `size` attribute of `sap.ui.webc.main.Avatar` because it should have
      * specific size by design in the context of `sap.ui.webc.fiori.ShellBar` profile.
      */
    var profile: js.UndefOr[IAvatar] = js.undefined
    
    /**
      * Fired, when the profile slot is present.
      */
    var profileClick: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$ProfileClickEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Defines the `sap.ui.webc.main.Input`, that will be used as a search field.
      */
    var searchField: js.UndefOr[IInput] = js.undefined
    
    /**
      * Defines the `secondaryTitle`.
      *
      *  **Note:** The `secondaryTitle` would be hidden on S and M screen sizes (less than approx. 1300px).
      */
    var secondaryTitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines, if the product CoPilot icon would be displayed.
      *  **Note:** By default the co-pilot is displayed as static SVG. If you need an animated co-pilot, you
      * can import the `"@ui5/webcomponents-fiori/dist/features/CoPilotAnimation.js"` module as add-on feature.
      */
    var showCoPilot: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines, if the notification icon would be displayed.
      */
    var showNotifications: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines, if the product switch icon would be displayed.
      */
    var showProductSwitch: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines a `sap.ui.webc.main.Button` in the bar that will be placed in the beginning. We encourage this
      * slot to be used for a back or home button. It gets overstyled to match ShellBar's styling.
      */
    var startButton: js.UndefOr[IButton] = js.undefined
  }
  object ShellBarSettings {
    
    inline def apply(): ShellBarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellBarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellBarSettings] (val x: Self) extends AnyVal {
      
      inline def setAccessibilityTexts(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "accessibilityTexts", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityTextsUndefined: Self = StObject.set(x, "accessibilityTexts", js.undefined)
      
      inline def setCoPilotClick(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$CoPilotClickEventParameters] => Unit
      ): Self = StObject.set(x, "coPilotClick", js.Any.fromFunction1(value))
      
      inline def setCoPilotClickUndefined: Self = StObject.set(x, "coPilotClick", js.undefined)
      
      inline def setItems(
        value: js.Array[IShellBarItem] | IShellBarItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: IShellBarItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLogo(value: IAvatar): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setLogoClick(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$LogoClickEventParameters] => Unit
      ): Self = StObject.set(x, "logoClick", js.Any.fromFunction1(value))
      
      inline def setLogoClickUndefined: Self = StObject.set(x, "logoClick", js.undefined)
      
      inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      inline def setMenuItemClick(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$MenuItemClickEventParameters] => Unit
      ): Self = StObject.set(x, "menuItemClick", js.Any.fromFunction1(value))
      
      inline def setMenuItemClickUndefined: Self = StObject.set(x, "menuItemClick", js.undefined)
      
      inline def setMenuItems(
        value: js.Array[IListItem] | IListItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
      
      inline def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
      
      inline def setMenuItemsVarargs(value: IListItem*): Self = StObject.set(x, "menuItems", js.Array(value*))
      
      inline def setNotificationsClick(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$NotificationsClickEventParameters] => Unit
      ): Self = StObject.set(x, "notificationsClick", js.Any.fromFunction1(value))
      
      inline def setNotificationsClickUndefined: Self = StObject.set(x, "notificationsClick", js.undefined)
      
      inline def setNotificationsCount(value: String | PropertyBindingInfo): Self = StObject.set(x, "notificationsCount", value.asInstanceOf[js.Any])
      
      inline def setNotificationsCountUndefined: Self = StObject.set(x, "notificationsCount", js.undefined)
      
      inline def setPrimaryTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "primaryTitle", value.asInstanceOf[js.Any])
      
      inline def setPrimaryTitleUndefined: Self = StObject.set(x, "primaryTitle", js.undefined)
      
      inline def setProductSwitchClick(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$ProductSwitchClickEventParameters] => Unit
      ): Self = StObject.set(x, "productSwitchClick", js.Any.fromFunction1(value))
      
      inline def setProductSwitchClickUndefined: Self = StObject.set(x, "productSwitchClick", js.undefined)
      
      inline def setProfile(value: IAvatar): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileClick(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$ProfileClickEventParameters] => Unit
      ): Self = StObject.set(x, "profileClick", js.Any.fromFunction1(value))
      
      inline def setProfileClickUndefined: Self = StObject.set(x, "profileClick", js.undefined)
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setSearchField(value: IInput): Self = StObject.set(x, "searchField", value.asInstanceOf[js.Any])
      
      inline def setSearchFieldUndefined: Self = StObject.set(x, "searchField", js.undefined)
      
      inline def setSecondaryTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "secondaryTitle", value.asInstanceOf[js.Any])
      
      inline def setSecondaryTitleUndefined: Self = StObject.set(x, "secondaryTitle", js.undefined)
      
      inline def setShowCoPilot(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showCoPilot", value.asInstanceOf[js.Any])
      
      inline def setShowCoPilotUndefined: Self = StObject.set(x, "showCoPilot", js.undefined)
      
      inline def setShowNotifications(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showNotifications", value.asInstanceOf[js.Any])
      
      inline def setShowNotificationsUndefined: Self = StObject.set(x, "showNotifications", js.undefined)
      
      inline def setShowProductSwitch(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showProductSwitch", value.asInstanceOf[js.Any])
      
      inline def setShowProductSwitchUndefined: Self = StObject.set(x, "showProductSwitch", js.undefined)
      
      inline def setStartButton(value: IButton): Self = StObject.set(x, "startButton", value.asInstanceOf[js.Any])
      
      inline def setStartButtonUndefined: Self = StObject.set(x, "startButton", js.undefined)
    }
  }
}
