package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapFLibraryMod.IShellBar
import typings.openui5.sapMBarInPageEnablerMod.BarContexts
import typings.openui5.sapMLibraryMod.IBar
import typings.openui5.sapTntLibraryMod.IToolHeader
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFShellBarMod {
  
  @JSImport("sap/f/ShellBar", JSImport.Default)
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
    
    /* CompleteClass */
    var __implements__sap_f_IShellBar: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_m_IBar: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_tnt_IToolHeader: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/ShellBar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.ShellBar with name `sClassName` and enriches it with the information
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
      * Returns a metadata object for class sap.f.ShellBar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ShellBar
    extends typings.openui5.sapUiCoreControlMod.default
       with IShellBar
       with IBar
       with IToolHeader {
    
    /**
      * @since 1.65
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets classes according to the context of the page. Possible contexts are header, footer, and subheader.
      *
      * @returns `this` for chaining
      */
    def _applyContextClassFor(): IBar = js.native
    
    /**
      * @since 1.65
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets the HTML tag according to the context of the page. Possible contexts are header, footer, and subheader.
      *
      * @returns `this` for chaining
      */
    def _applyTag(): IBar = js.native
    
    /**
      * Adds some additionalContent to the aggregation {@link #getAdditionalContent additionalContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAdditionalContent(
      /**
      * The additionalContent to add; if empty, nothing is inserted
      */
    oAdditionalContent: IShellBar
    ): this.type = js.native
    
    /**
      * @since 1.65
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets classes and HTML tag according to the context of the page. Possible contexts are header, footer,
      * and subheader
      *
      * @returns `this` for chaining
      */
    def applyTagAndContextClassFor(): IBar = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:avatarPressed avatarPressed} event of this `sap.f.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.ShellBar` itself.
      *
      * Fired when the profile avatar is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAvatarPressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarAvatarPressedEvent, Unit]
    ): this.type = js.native
    def attachAvatarPressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarAvatarPressedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:avatarPressed avatarPressed} event of this `sap.f.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.ShellBar` itself.
      *
      * Fired when the profile avatar is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAvatarPressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarAvatarPressedEvent, Unit]
    ): this.type = js.native
    def attachAvatarPressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarAvatarPressedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:copilotPressed copilotPressed} event of this
      * `sap.f.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.ShellBar` itself.
      *
      * Fired when the SAP CoPilot icon is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCopilotPressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarCopilotPressedEvent, Unit]
    ): this.type = js.native
    def attachCopilotPressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarCopilotPressedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:copilotPressed copilotPressed} event of this
      * `sap.f.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.ShellBar` itself.
      *
      * Fired when the SAP CoPilot icon is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCopilotPressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarCopilotPressedEvent, Unit]
    ): this.type = js.native
    def attachCopilotPressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarCopilotPressedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:homeIconPressed homeIconPressed} event of this
      * `sap.f.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.ShellBar` itself.
      *
      * Fired when the `homeIcon` is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachHomeIconPressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarHomeIconPressedEvent, Unit]
    ): this.type = js.native
    def attachHomeIconPressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarHomeIconPressedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:homeIconPressed homeIconPressed} event of this
      * `sap.f.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.ShellBar` itself.
      *
      * Fired when the `homeIcon` is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachHomeIconPressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarHomeIconPressedEvent, Unit]
    ): this.type = js.native
    def attachHomeIconPressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarHomeIconPressedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:menuButtonPressed menuButtonPressed} event of
      * this `sap.f.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.ShellBar` itself.
      *
      * Fired when the alternative menu button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMenuButtonPressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarMenuButtonPressedEvent, Unit]
    ): this.type = js.native
    def attachMenuButtonPressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarMenuButtonPressedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:menuButtonPressed menuButtonPressed} event of
      * this `sap.f.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.ShellBar` itself.
      *
      * Fired when the alternative menu button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMenuButtonPressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarMenuButtonPressedEvent, Unit]
    ): this.type = js.native
    def attachMenuButtonPressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarMenuButtonPressedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:navButtonPressed navButtonPressed} event of
      * this `sap.f.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.ShellBar` itself.
      *
      * Fired when the navigation/back button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavButtonPressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarNavButtonPressedEvent, Unit]
    ): this.type = js.native
    def attachNavButtonPressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarNavButtonPressedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:navButtonPressed navButtonPressed} event of
      * this `sap.f.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.ShellBar` itself.
      *
      * Fired when the navigation/back button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavButtonPressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarNavButtonPressedEvent, Unit]
    ): this.type = js.native
    def attachNavButtonPressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarNavButtonPressedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:notificationsPressed notificationsPressed} event
      * of this `sap.f.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.ShellBar` itself.
      *
      * Fired when the notifications button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNotificationsPressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarNotificationsPressedEvent, Unit]
    ): this.type = js.native
    def attachNotificationsPressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarNotificationsPressedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:notificationsPressed notificationsPressed} event
      * of this `sap.f.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.ShellBar` itself.
      *
      * Fired when the notifications button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNotificationsPressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarNotificationsPressedEvent, Unit]
    ): this.type = js.native
    def attachNotificationsPressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarNotificationsPressedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:productSwitcherPressed productSwitcherPressed }
      * event of this `sap.f.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.ShellBar` itself.
      *
      * Fired when the product switcher button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachProductSwitcherPressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarProductSwitcherPressedEvent, Unit]
    ): this.type = js.native
    def attachProductSwitcherPressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarProductSwitcherPressedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:productSwitcherPressed productSwitcherPressed }
      * event of this `sap.f.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.ShellBar` itself.
      *
      * Fired when the product switcher button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachProductSwitcherPressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarProductSwitcherPressedEvent, Unit]
    ): this.type = js.native
    def attachProductSwitcherPressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarProductSwitcherPressedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:searchButtonPressed searchButtonPressed} event
      * of this `sap.f.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.ShellBar` itself.
      *
      * Fired when the search button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSearchButtonPressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarSearchButtonPressedEvent, Unit]
    ): this.type = js.native
    def attachSearchButtonPressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarSearchButtonPressedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:searchButtonPressed searchButtonPressed} event
      * of this `sap.f.ShellBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.ShellBar` itself.
      *
      * Fired when the search button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSearchButtonPressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarSearchButtonPressedEvent, Unit]
    ): this.type = js.native
    def attachSearchButtonPressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarSearchButtonPressedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.ShellBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the additionalContent in the aggregation {@link #getAdditionalContent additionalContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAdditionalContent(): this.type = js.native
    
    /**
      * Destroys the menu in the aggregation {@link #getMenu menu}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMenu(): this.type = js.native
    
    /**
      * Destroys the profile in the aggregation {@link #getProfile profile}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyProfile(): this.type = js.native
    
    /**
      * @since 1.67
      *
      * Destroys the searchManager in the aggregation {@link #getSearchManager searchManager}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySearchManager(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:avatarPressed avatarPressed} event of this
      * `sap.f.ShellBar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAvatarPressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarAvatarPressedEvent, Unit]
    ): this.type = js.native
    def detachAvatarPressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarAvatarPressedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:copilotPressed copilotPressed} event of this
      * `sap.f.ShellBar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachCopilotPressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarCopilotPressedEvent, Unit]
    ): this.type = js.native
    def detachCopilotPressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarCopilotPressedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:homeIconPressed homeIconPressed} event of
      * this `sap.f.ShellBar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachHomeIconPressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarHomeIconPressedEvent, Unit]
    ): this.type = js.native
    def detachHomeIconPressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarHomeIconPressedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:menuButtonPressed menuButtonPressed} event
      * of this `sap.f.ShellBar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachMenuButtonPressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarMenuButtonPressedEvent, Unit]
    ): this.type = js.native
    def detachMenuButtonPressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarMenuButtonPressedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:navButtonPressed navButtonPressed} event of
      * this `sap.f.ShellBar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachNavButtonPressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarNavButtonPressedEvent, Unit]
    ): this.type = js.native
    def detachNavButtonPressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarNavButtonPressedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:notificationsPressed notificationsPressed }
      * event of this `sap.f.ShellBar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachNotificationsPressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarNotificationsPressedEvent, Unit]
    ): this.type = js.native
    def detachNotificationsPressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarNotificationsPressedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:productSwitcherPressed productSwitcherPressed }
      * event of this `sap.f.ShellBar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachProductSwitcherPressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarProductSwitcherPressedEvent, Unit]
    ): this.type = js.native
    def detachProductSwitcherPressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarProductSwitcherPressedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:searchButtonPressed searchButtonPressed} event
      * of this `sap.f.ShellBar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSearchButtonPressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarSearchButtonPressedEvent, Unit]
    ): this.type = js.native
    def detachSearchButtonPressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarSearchButtonPressedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:avatarPressed avatarPressed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAvatarPressed(): this.type = js.native
    def fireAvatarPressed(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ShellBar$AvatarPressedEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:copilotPressed copilotPressed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireCopilotPressed(): this.type = js.native
    def fireCopilotPressed(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ShellBar$CopilotPressedEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:homeIconPressed homeIconPressed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireHomeIconPressed(): this.type = js.native
    def fireHomeIconPressed(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ShellBar$HomeIconPressedEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:menuButtonPressed menuButtonPressed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireMenuButtonPressed(): this.type = js.native
    def fireMenuButtonPressed(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ShellBar$MenuButtonPressedEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:navButtonPressed navButtonPressed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireNavButtonPressed(): this.type = js.native
    def fireNavButtonPressed(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ShellBar$NavButtonPressedEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:notificationsPressed notificationsPressed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireNotificationsPressed(): this.type = js.native
    def fireNotificationsPressed(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ShellBar$NotificationsPressedEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:productSwitcherPressed productSwitcherPressed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireProductSwitcherPressed(): this.type = js.native
    def fireProductSwitcherPressed(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ShellBar$ProductSwitcherPressedEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:searchButtonPressed searchButtonPressed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSearchButtonPressed(): this.type = js.native
    def fireSearchButtonPressed(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ShellBar$SearchButtonPressedEventParameters
    ): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getAdditionalContent additionalContent}.
      *
      * Additional content to be displayed in the control.
      *
      * **Note:** Only controls implementing the `{@link sap.f.IShellBar}` interface are allowed.
      */
    def getAdditionalContent(): js.Array[IShellBar] = js.native
    
    /**
      * @since 1.65
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets the available Bar contexts.
      *
      * @returns with all available contexts
      */
    def getContext(): BarContexts = js.native
    
    /**
      * @since 1.65
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets the HTML tag of the root DOM Reference.
      *
      * @returns the HTML-tag
      */
    def getHTMLTag(): String = js.native
    
    /**
      * Gets current value of property {@link #getHomeIcon homeIcon}.
      *
      * Defines the URI to the home icon, such as company or product logo.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `homeIcon`
      */
    def getHomeIcon(): URI = js.native
    
    /**
      * @since 1.67
      *
      * Gets current value of property {@link #getHomeIconTooltip homeIconTooltip}.
      *
      * Defines a custom tooltip for the home icon. If not set, a default tooltip is used.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `homeIconTooltip`
      */
    def getHomeIconTooltip(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getMenu menu}.
      *
      * The menu attached to the main title.
      */
    def getMenu(): typings.openui5.sapMMenuMod.default = js.native
    
    /**
      * @since 1.64
      *
      * Gets current value of property {@link #getNotificationsNumber notificationsNumber}.
      *
      * Defines the displayed number of upcoming notifications.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `notificationsNumber`
      */
    def getNotificationsNumber(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getProfile profile}.
      *
      * The profile avatar.
      */
    def getProfile(): typings.openui5.sapMAvatarMod.default = js.native
    
    /**
      * @since 1.67
      *
      * Gets content of aggregation {@link #getSearchManager searchManager}.
      *
      * Configurable search.
      *
      * **Note:** If `showSearch` is set to `true`, two search buttons appear.
      */
    def getSearchManager(): typings.openui5.sapFSearchManagerMod.default = js.native
    
    /**
      * Gets current value of property {@link #getSecondTitle secondTitle}.
      *
      * Defines the secondary title of the control.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `secondTitle`
      */
    def getSecondTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getShowCopilot showCopilot}.
      *
      * Determines whether the SAP CoPilot icon is displayed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showCopilot`
      */
    def getShowCopilot(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowMenuButton showMenuButton}.
      *
      * Determines whether a hamburger menu button is displayed (as an alternative if the `menu` aggregation
      * is not used).
      *
      * Default value is `false`.
      *
      * @returns Value of property `showMenuButton`
      */
    def getShowMenuButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowNavButton showNavButton}.
      *
      * Determines whether a back navigation button is displayed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showNavButton`
      */
    def getShowNavButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowNotifications showNotifications}.
      *
      * Determines whether the notifications button is displayed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showNotifications`
      */
    def getShowNotifications(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowProductSwitcher showProductSwitcher}.
      *
      * Determines whether the product switcher button is displayed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showProductSwitcher`
      */
    def getShowProductSwitcher(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowSearch showSearch}.
      *
      * Determines whether the search button is displayed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showSearch`
      */
    def getShowSearch(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Defines the main title of the control.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Checks for the provided `sap.f.IShellBar` in the aggregation {@link #getAdditionalContent additionalContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAdditionalContent(/**
      * The additionalContent whose index is looked for
      */
    oAdditionalContent: IShellBar): int = js.native
    
    /**
      * Inserts a additionalContent into the aggregation {@link #getAdditionalContent additionalContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAdditionalContent(
      /**
      * The additionalContent to insert; if empty, nothing is inserted
      */
    oAdditionalContent: IShellBar,
      /**
      * The `0`-based index the additionalContent should be inserted at; for a negative value of `iIndex`, the
      * additionalContent is inserted at position 0; for a value greater than the current size of the aggregation,
      * the additionalContent is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @since 1.65
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns if the bar is sensitive to the container context. Implementation of the IBar interface
      *
      * @returns isContextSensitive
      */
    def isContextSensitive(): Boolean = js.native
    
    def removeAdditionalContent(/**
      * The additionalContent to remove or its index or id
      */
    vAdditionalContent: String): IShellBar | Null = js.native
    /**
      * Removes a additionalContent from the aggregation {@link #getAdditionalContent additionalContent}.
      *
      * @returns The removed additionalContent or `null`
      */
    def removeAdditionalContent(/**
      * The additionalContent to remove or its index or id
      */
    vAdditionalContent: int): IShellBar | Null = js.native
    def removeAdditionalContent(/**
      * The additionalContent to remove or its index or id
      */
    vAdditionalContent: IShellBar): IShellBar | Null = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getAdditionalContent additionalContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAdditionalContent(): js.Array[IShellBar] = js.native
    
    /**
      * @since 1.65
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets the HTML tag of the root DOM Reference.
      *
      * @returns this for chaining
      */
    def setHTMLTag(sTag: String): IBar = js.native
    
    /**
      * Sets a new value for property {@link #getHomeIcon homeIcon}.
      *
      * Defines the URI to the home icon, such as company or product logo.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHomeIcon(): this.type = js.native
    def setHomeIcon(/**
      * New value for property `homeIcon`
      */
    sHomeIcon: URI): this.type = js.native
    
    /**
      * @since 1.67
      *
      * Sets a new value for property {@link #getHomeIconTooltip homeIconTooltip}.
      *
      * Defines a custom tooltip for the home icon. If not set, a default tooltip is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHomeIconTooltip(): this.type = js.native
    def setHomeIconTooltip(/**
      * New value for property `homeIconTooltip`
      */
    sHomeIconTooltip: String): this.type = js.native
    
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
      * Sets the aggregated {@link #getProfile profile}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setProfile(/**
      * The profile to set
      */
    oProfile: typings.openui5.sapMAvatarMod.default): this.type = js.native
    
    /**
      * @since 1.67
      *
      * Sets the aggregated {@link #getSearchManager searchManager}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSearchManager(/**
      * The searchManager to set
      */
    oSearchManager: typings.openui5.sapFSearchManagerMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSecondTitle secondTitle}.
      *
      * Defines the secondary title of the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSecondTitle(): this.type = js.native
    def setSecondTitle(/**
      * New value for property `secondTitle`
      */
    sSecondTitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowCopilot showCopilot}.
      *
      * Determines whether the SAP CoPilot icon is displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowCopilot(): this.type = js.native
    def setShowCopilot(/**
      * New value for property `showCopilot`
      */
    bShowCopilot: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowMenuButton showMenuButton}.
      *
      * Determines whether a hamburger menu button is displayed (as an alternative if the `menu` aggregation
      * is not used).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowMenuButton(): this.type = js.native
    def setShowMenuButton(/**
      * New value for property `showMenuButton`
      */
    bShowMenuButton: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowNavButton showNavButton}.
      *
      * Determines whether a back navigation button is displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowNavButton(): this.type = js.native
    def setShowNavButton(/**
      * New value for property `showNavButton`
      */
    bShowNavButton: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowNotifications showNotifications}.
      *
      * Determines whether the notifications button is displayed.
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
      * Sets a new value for property {@link #getShowProductSwitcher showProductSwitcher}.
      *
      * Determines whether the product switcher button is displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowProductSwitcher(): this.type = js.native
    def setShowProductSwitcher(/**
      * New value for property `showProductSwitcher`
      */
    bShowProductSwitcher: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowSearch showSearch}.
      *
      * Determines whether the search button is displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSearch(): this.type = js.native
    def setShowSearch(/**
      * New value for property `showSearch`
      */
    bShowSearch: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Defines the main title of the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
  }
  
  trait ShellBar$AvatarPressedEventParameters extends StObject {
    
    /**
      * Reference to the button that has been pressed
      */
    var avatar: js.UndefOr[typings.openui5.sapMAvatarMod.default] = js.undefined
  }
  object ShellBar$AvatarPressedEventParameters {
    
    inline def apply(): ShellBar$AvatarPressedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellBar$AvatarPressedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellBar$AvatarPressedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setAvatar(value: typings.openui5.sapMAvatarMod.default): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    }
  }
  
  trait ShellBar$CopilotPressedEventParameters extends StObject {
    
    /**
      * Reference to the button that has been pressed
      */
    var image: js.UndefOr[typings.openui5.sapMImageMod.default] = js.undefined
  }
  object ShellBar$CopilotPressedEventParameters {
    
    inline def apply(): ShellBar$CopilotPressedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellBar$CopilotPressedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellBar$CopilotPressedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setImage(value: typings.openui5.sapMImageMod.default): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    }
  }
  
  trait ShellBar$HomeIconPressedEventParameters extends StObject {
    
    /**
      * Reference to the image that has been pressed
      */
    var icon: js.UndefOr[typings.openui5.sapMImageMod.default] = js.undefined
  }
  object ShellBar$HomeIconPressedEventParameters {
    
    inline def apply(): ShellBar$HomeIconPressedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellBar$HomeIconPressedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellBar$HomeIconPressedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setIcon(value: typings.openui5.sapMImageMod.default): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    }
  }
  
  trait ShellBar$MenuButtonPressedEventParameters extends StObject {
    
    /**
      * Reference to the button that has been pressed
      */
    var button: js.UndefOr[typings.openui5.sapMButtonMod.default] = js.undefined
  }
  object ShellBar$MenuButtonPressedEventParameters {
    
    inline def apply(): ShellBar$MenuButtonPressedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellBar$MenuButtonPressedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellBar$MenuButtonPressedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setButton(value: typings.openui5.sapMButtonMod.default): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    }
  }
  
  trait ShellBar$NavButtonPressedEventParameters extends StObject {
    
    /**
      * Reference to the button that has been pressed
      */
    var button: js.UndefOr[typings.openui5.sapMButtonMod.default] = js.undefined
  }
  object ShellBar$NavButtonPressedEventParameters {
    
    inline def apply(): ShellBar$NavButtonPressedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellBar$NavButtonPressedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellBar$NavButtonPressedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setButton(value: typings.openui5.sapMButtonMod.default): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    }
  }
  
  trait ShellBar$NotificationsPressedEventParameters extends StObject {
    
    /**
      * Reference to the button that has been pressed
      */
    var button: js.UndefOr[typings.openui5.sapMButtonMod.default] = js.undefined
  }
  object ShellBar$NotificationsPressedEventParameters {
    
    inline def apply(): ShellBar$NotificationsPressedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellBar$NotificationsPressedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellBar$NotificationsPressedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setButton(value: typings.openui5.sapMButtonMod.default): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    }
  }
  
  trait ShellBar$ProductSwitcherPressedEventParameters extends StObject {
    
    /**
      * Reference to the button that has been pressed
      */
    var button: js.UndefOr[typings.openui5.sapMButtonMod.default] = js.undefined
  }
  object ShellBar$ProductSwitcherPressedEventParameters {
    
    inline def apply(): ShellBar$ProductSwitcherPressedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellBar$ProductSwitcherPressedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellBar$ProductSwitcherPressedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setButton(value: typings.openui5.sapMButtonMod.default): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    }
  }
  
  trait ShellBar$SearchButtonPressedEventParameters extends StObject {
    
    /**
      * Reference to the button that has been pressed
      */
    var button: js.UndefOr[typings.openui5.sapMButtonMod.default] = js.undefined
  }
  object ShellBar$SearchButtonPressedEventParameters {
    
    inline def apply(): ShellBar$SearchButtonPressedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellBar$SearchButtonPressedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellBar$SearchButtonPressedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setButton(value: typings.openui5.sapMButtonMod.default): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    }
  }
  
  type ShellBarAvatarPressedEvent = typings.openui5.sapUiBaseEventMod.default[ShellBar$AvatarPressedEventParameters]
  
  type ShellBarAvatarPressedEventParameters = ShellBar$AvatarPressedEventParameters
  
  type ShellBarCopilotPressedEvent = typings.openui5.sapUiBaseEventMod.default[ShellBar$CopilotPressedEventParameters]
  
  type ShellBarCopilotPressedEventParameters = ShellBar$CopilotPressedEventParameters
  
  type ShellBarHomeIconPressedEvent = typings.openui5.sapUiBaseEventMod.default[ShellBar$HomeIconPressedEventParameters]
  
  type ShellBarHomeIconPressedEventParameters = ShellBar$HomeIconPressedEventParameters
  
  type ShellBarMenuButtonPressedEvent = typings.openui5.sapUiBaseEventMod.default[ShellBar$MenuButtonPressedEventParameters]
  
  type ShellBarMenuButtonPressedEventParameters = ShellBar$MenuButtonPressedEventParameters
  
  type ShellBarNavButtonPressedEvent = typings.openui5.sapUiBaseEventMod.default[ShellBar$NavButtonPressedEventParameters]
  
  type ShellBarNavButtonPressedEventParameters = ShellBar$NavButtonPressedEventParameters
  
  type ShellBarNotificationsPressedEvent = typings.openui5.sapUiBaseEventMod.default[ShellBar$NotificationsPressedEventParameters]
  
  type ShellBarNotificationsPressedEventParameters = ShellBar$NotificationsPressedEventParameters
  
  type ShellBarProductSwitcherPressedEvent = typings.openui5.sapUiBaseEventMod.default[ShellBar$ProductSwitcherPressedEventParameters]
  
  type ShellBarProductSwitcherPressedEventParameters = ShellBar$ProductSwitcherPressedEventParameters
  
  type ShellBarSearchButtonPressedEvent = typings.openui5.sapUiBaseEventMod.default[ShellBar$SearchButtonPressedEventParameters]
  
  type ShellBarSearchButtonPressedEventParameters = ShellBar$SearchButtonPressedEventParameters
  
  trait ShellBarSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Additional content to be displayed in the control.
      *
      * **Note:** Only controls implementing the `{@link sap.f.IShellBar}` interface are allowed.
      */
    var additionalContent: js.UndefOr[
        js.Array[IShellBar] | IShellBar | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the profile avatar is pressed.
      */
    var avatarPressed: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$AvatarPressedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Fired when the SAP CoPilot icon is pressed.
      */
    var copilotPressed: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$CopilotPressedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Defines the URI to the home icon, such as company or product logo.
      */
    var homeIcon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Fired when the `homeIcon` is pressed.
      */
    var homeIconPressed: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$HomeIconPressedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.67
      *
      * Defines a custom tooltip for the home icon. If not set, a default tooltip is used.
      */
    var homeIconTooltip: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The menu attached to the main title.
      */
    var menu: js.UndefOr[typings.openui5.sapMMenuMod.default] = js.undefined
    
    /**
      * Fired when the alternative menu button is pressed.
      */
    var menuButtonPressed: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$MenuButtonPressedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Fired when the navigation/back button is pressed.
      */
    var navButtonPressed: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$NavButtonPressedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.64
      *
      * Defines the displayed number of upcoming notifications.
      */
    var notificationsNumber: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fired when the notifications button is pressed.
      */
    var notificationsPressed: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$NotificationsPressedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Fired when the product switcher button is pressed.
      */
    var productSwitcherPressed: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$ProductSwitcherPressedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The profile avatar.
      */
    var profile: js.UndefOr[typings.openui5.sapMAvatarMod.default] = js.undefined
    
    /**
      * Fired when the search button is pressed.
      */
    var searchButtonPressed: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$SearchButtonPressedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.67
      *
      * Configurable search.
      *
      * **Note:** If `showSearch` is set to `true`, two search buttons appear.
      */
    var searchManager: js.UndefOr[typings.openui5.sapFSearchManagerMod.default] = js.undefined
    
    /**
      * Defines the secondary title of the control.
      */
    var secondTitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines whether the SAP CoPilot icon is displayed.
      */
    var showCopilot: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether a hamburger menu button is displayed (as an alternative if the `menu` aggregation
      * is not used).
      */
    var showMenuButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether a back navigation button is displayed.
      */
    var showNavButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the notifications button is displayed.
      */
    var showNotifications: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the product switcher button is displayed.
      */
    var showProductSwitcher: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the search button is displayed.
      */
    var showSearch: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the main title of the control.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object ShellBarSettings {
    
    inline def apply(): ShellBarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellBarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellBarSettings] (val x: Self) extends AnyVal {
      
      inline def setAdditionalContent(
        value: js.Array[IShellBar] | IShellBar | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "additionalContent", value.asInstanceOf[js.Any])
      
      inline def setAdditionalContentUndefined: Self = StObject.set(x, "additionalContent", js.undefined)
      
      inline def setAdditionalContentVarargs(value: IShellBar*): Self = StObject.set(x, "additionalContent", js.Array(value*))
      
      inline def setAvatarPressed(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$AvatarPressedEventParameters] => Unit
      ): Self = StObject.set(x, "avatarPressed", js.Any.fromFunction1(value))
      
      inline def setAvatarPressedUndefined: Self = StObject.set(x, "avatarPressed", js.undefined)
      
      inline def setCopilotPressed(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$CopilotPressedEventParameters] => Unit
      ): Self = StObject.set(x, "copilotPressed", js.Any.fromFunction1(value))
      
      inline def setCopilotPressedUndefined: Self = StObject.set(x, "copilotPressed", js.undefined)
      
      inline def setHomeIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "homeIcon", value.asInstanceOf[js.Any])
      
      inline def setHomeIconPressed(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$HomeIconPressedEventParameters] => Unit
      ): Self = StObject.set(x, "homeIconPressed", js.Any.fromFunction1(value))
      
      inline def setHomeIconPressedUndefined: Self = StObject.set(x, "homeIconPressed", js.undefined)
      
      inline def setHomeIconTooltip(value: String | PropertyBindingInfo): Self = StObject.set(x, "homeIconTooltip", value.asInstanceOf[js.Any])
      
      inline def setHomeIconTooltipUndefined: Self = StObject.set(x, "homeIconTooltip", js.undefined)
      
      inline def setHomeIconUndefined: Self = StObject.set(x, "homeIcon", js.undefined)
      
      inline def setMenu(value: typings.openui5.sapMMenuMod.default): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuButtonPressed(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$MenuButtonPressedEventParameters] => Unit
      ): Self = StObject.set(x, "menuButtonPressed", js.Any.fromFunction1(value))
      
      inline def setMenuButtonPressedUndefined: Self = StObject.set(x, "menuButtonPressed", js.undefined)
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setNavButtonPressed(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$NavButtonPressedEventParameters] => Unit
      ): Self = StObject.set(x, "navButtonPressed", js.Any.fromFunction1(value))
      
      inline def setNavButtonPressedUndefined: Self = StObject.set(x, "navButtonPressed", js.undefined)
      
      inline def setNotificationsNumber(value: String | PropertyBindingInfo): Self = StObject.set(x, "notificationsNumber", value.asInstanceOf[js.Any])
      
      inline def setNotificationsNumberUndefined: Self = StObject.set(x, "notificationsNumber", js.undefined)
      
      inline def setNotificationsPressed(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$NotificationsPressedEventParameters] => Unit
      ): Self = StObject.set(x, "notificationsPressed", js.Any.fromFunction1(value))
      
      inline def setNotificationsPressedUndefined: Self = StObject.set(x, "notificationsPressed", js.undefined)
      
      inline def setProductSwitcherPressed(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$ProductSwitcherPressedEventParameters] => Unit
      ): Self = StObject.set(x, "productSwitcherPressed", js.Any.fromFunction1(value))
      
      inline def setProductSwitcherPressedUndefined: Self = StObject.set(x, "productSwitcherPressed", js.undefined)
      
      inline def setProfile(value: typings.openui5.sapMAvatarMod.default): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setSearchButtonPressed(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBar$SearchButtonPressedEventParameters] => Unit
      ): Self = StObject.set(x, "searchButtonPressed", js.Any.fromFunction1(value))
      
      inline def setSearchButtonPressedUndefined: Self = StObject.set(x, "searchButtonPressed", js.undefined)
      
      inline def setSearchManager(value: typings.openui5.sapFSearchManagerMod.default): Self = StObject.set(x, "searchManager", value.asInstanceOf[js.Any])
      
      inline def setSearchManagerUndefined: Self = StObject.set(x, "searchManager", js.undefined)
      
      inline def setSecondTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "secondTitle", value.asInstanceOf[js.Any])
      
      inline def setSecondTitleUndefined: Self = StObject.set(x, "secondTitle", js.undefined)
      
      inline def setShowCopilot(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showCopilot", value.asInstanceOf[js.Any])
      
      inline def setShowCopilotUndefined: Self = StObject.set(x, "showCopilot", js.undefined)
      
      inline def setShowMenuButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showMenuButton", value.asInstanceOf[js.Any])
      
      inline def setShowMenuButtonUndefined: Self = StObject.set(x, "showMenuButton", js.undefined)
      
      inline def setShowNavButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showNavButton", value.asInstanceOf[js.Any])
      
      inline def setShowNavButtonUndefined: Self = StObject.set(x, "showNavButton", js.undefined)
      
      inline def setShowNotifications(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showNotifications", value.asInstanceOf[js.Any])
      
      inline def setShowNotificationsUndefined: Self = StObject.set(x, "showNotifications", js.undefined)
      
      inline def setShowProductSwitcher(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showProductSwitcher", value.asInstanceOf[js.Any])
      
      inline def setShowProductSwitcherUndefined: Self = StObject.set(x, "showProductSwitcher", js.undefined)
      
      inline def setShowSearch(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
      
      inline def setShowSearchUndefined: Self = StObject.set(x, "showSearch", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
