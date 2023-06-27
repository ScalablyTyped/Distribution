package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiUx3LibraryMod.ShellDesignType
import typings.openui5.sapUiUx3LibraryMod.ShellHeaderType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3ShellMod {
  
  @JSImport("sap/ui/ux3/Shell", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Shell.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Shell {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ShellSettings) = this()
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
    mSettings: ShellSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ShellSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/Shell", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.Shell with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Shell]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Shell],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.Shell.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Shell
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some content to the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some headerItem to the aggregation {@link #getHeaderItems headerItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addHeaderItem(
      /**
      * The headerItem to add; if empty, nothing is inserted
      */
    oHeaderItem: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some paneBarItem to the aggregation {@link #getPaneBarItems paneBarItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addPaneBarItem(
      /**
      * The paneBarItem to add; if empty, nothing is inserted
      */
    oPaneBarItem: typings.openui5.sapUiCoreItemMod.default
    ): this.type = js.native
    
    /**
      * Adds some paneContent to the aggregation {@link #getPaneContent paneContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addPaneContent(
      /**
      * The paneContent to add; if empty, nothing is inserted
      */
    oPaneContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some toolPopup to the aggregation {@link #getToolPopups toolPopups}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addToolPopup(
      /**
      * The toolPopup to add; if empty, nothing is inserted
      */
    oToolPopup: typings.openui5.sapUiUx3ToolPopupMod.default
    ): this.type = js.native
    
    /**
      * Adds some worksetItem to the aggregation {@link #getWorksetItems worksetItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addWorksetItem(
      /**
      * The worksetItem to add; if empty, nothing is inserted
      */
    oWorksetItem: typings.openui5.sapUiUx3NavigationItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:feedSubmit feedSubmit} event of this `sap.ui.ux3.Shell`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Shell` itself.
      *
      * Fired when a new feed entry is submitted.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFeedSubmit(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachFeedSubmit(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Shell` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:feedSubmit feedSubmit} event of this `sap.ui.ux3.Shell`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Shell` itself.
      *
      * Fired when a new feed entry is submitted.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFeedSubmit(
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
    def attachFeedSubmit(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Shell` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:logout logout} event of this `sap.ui.ux3.Shell`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Shell` itself.
      *
      * Fired when the user clicks the "Log-off" button
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLogout(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachLogout(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Shell` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:logout logout} event of this `sap.ui.ux3.Shell`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Shell` itself.
      *
      * Fired when the user clicks the "Log-off" button
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLogout(
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
    def attachLogout(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Shell` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:paneBarItemSelected paneBarItemSelected} event
      * of this `sap.ui.ux3.Shell`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Shell` itself.
      *
      * An item in the right-hand-side pane bar has been selected, the pane is now visible and can be filled
      * with UI elements.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPaneBarItemSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellPaneBarItemSelectedEvent, Unit]
    ): this.type = js.native
    def attachPaneBarItemSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellPaneBarItemSelectedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Shell` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:paneBarItemSelected paneBarItemSelected} event
      * of this `sap.ui.ux3.Shell`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Shell` itself.
      *
      * An item in the right-hand-side pane bar has been selected, the pane is now visible and can be filled
      * with UI elements.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPaneBarItemSelected(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellPaneBarItemSelectedEvent, Unit]
    ): this.type = js.native
    def attachPaneBarItemSelected(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellPaneBarItemSelectedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Shell` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.12.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:paneClosed paneClosed} event of this `sap.ui.ux3.Shell`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Shell` itself.
      *
      * Fired after a side pane of the shell is closed. It is also fired, when an open pane is closed by calling
      * setShowPane(false), if and only if the pane was opened before.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPaneClosed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellPaneClosedEvent, Unit]
    ): this.type = js.native
    def attachPaneClosed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellPaneClosedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Shell` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.12.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:paneClosed paneClosed} event of this `sap.ui.ux3.Shell`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Shell` itself.
      *
      * Fired after a side pane of the shell is closed. It is also fired, when an open pane is closed by calling
      * setShowPane(false), if and only if the pane was opened before.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPaneClosed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellPaneClosedEvent, Unit]
    ): this.type = js.native
    def attachPaneClosed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellPaneClosedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Shell` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.ui.ux3.Shell`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Shell` itself.
      *
      * Fired when search has been triggered.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSearch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachSearch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Shell` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.ui.ux3.Shell`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Shell` itself.
      *
      * Fired when search has been triggered.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSearch(
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
    def attachSearch(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Shell` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:worksetItemSelected worksetItemSelected} event
      * of this `sap.ui.ux3.Shell`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Shell` itself.
      *
      * Fired when a workset item was selected by the user. The application may populate the sub-items of the
      * given workset item in the event handler, but this must happen synchronously. If this is done, the application
      * is responsible for displaying the correct content for the selected one of the newly created sub-items.
      * The Shell will currently always mark the first sub-item as selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachWorksetItemSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellWorksetItemSelectedEvent, Unit]
    ): this.type = js.native
    def attachWorksetItemSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellWorksetItemSelectedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Shell` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:worksetItemSelected worksetItemSelected} event
      * of this `sap.ui.ux3.Shell`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Shell` itself.
      *
      * Fired when a workset item was selected by the user. The application may populate the sub-items of the
      * given workset item in the event handler, but this must happen synchronously. If this is done, the application
      * is responsible for displaying the correct content for the selected one of the newly created sub-items.
      * The Shell will currently always mark the first sub-item as selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachWorksetItemSelected(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellWorksetItemSelectedEvent, Unit]
    ): this.type = js.native
    def attachWorksetItemSelected(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellWorksetItemSelectedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Shell` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes the side Pane (if open).
      *
      * Returns 'this' to allow method chaining.
      */
    def closePane(): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Destroys all the headerItems in the aggregation {@link #getHeaderItems headerItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeaderItems(): this.type = js.native
    
    /**
      * @since 1.7.0
      *
      * Destroys the notificationBar in the aggregation {@link #getNotificationBar notificationBar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyNotificationBar(): this.type = js.native
    
    /**
      * Destroys all the paneBarItems in the aggregation {@link #getPaneBarItems paneBarItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyPaneBarItems(): this.type = js.native
    
    /**
      * Destroys all the paneContent in the aggregation {@link #getPaneContent paneContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyPaneContent(): this.type = js.native
    
    /**
      * Destroys all the toolPopups in the aggregation {@link #getToolPopups toolPopups}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyToolPopups(): this.type = js.native
    
    /**
      * Destroys all the worksetItems in the aggregation {@link #getWorksetItems worksetItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyWorksetItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:feedSubmit feedSubmit} event of this `sap.ui.ux3.Shell`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFeedSubmit(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachFeedSubmit(
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
      * Detaches event handler `fnFunction` from the {@link #event:logout logout} event of this `sap.ui.ux3.Shell`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLogout(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachLogout(
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
      * Detaches event handler `fnFunction` from the {@link #event:paneBarItemSelected paneBarItemSelected} event
      * of this `sap.ui.ux3.Shell`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPaneBarItemSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellPaneBarItemSelectedEvent, Unit]
    ): this.type = js.native
    def detachPaneBarItemSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellPaneBarItemSelectedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.12.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:paneClosed paneClosed} event of this `sap.ui.ux3.Shell`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPaneClosed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellPaneClosedEvent, Unit]
    ): this.type = js.native
    def detachPaneClosed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellPaneClosedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:search search} event of this `sap.ui.ux3.Shell`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSearch(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachSearch(
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
      * Detaches event handler `fnFunction` from the {@link #event:worksetItemSelected worksetItemSelected} event
      * of this `sap.ui.ux3.Shell`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachWorksetItemSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellWorksetItemSelectedEvent, Unit]
    ): this.type = js.native
    def detachWorksetItemSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellWorksetItemSelectedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:feedSubmit feedSubmit} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFeedSubmit(): this.type = js.native
    def fireFeedSubmit(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:logout logout} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLogout(): this.type = js.native
    def fireLogout(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:paneBarItemSelected paneBarItemSelected} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePaneBarItemSelected(): this.type = js.native
    def firePaneBarItemSelected(
      /**
      * Parameters to pass along with the event
      */
    mParameters: Shell$PaneBarItemSelectedEventParameters
    ): this.type = js.native
    
    /**
      * @since 1.12.0
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:paneClosed paneClosed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePaneClosed(): this.type = js.native
    def firePaneClosed(/**
      * Parameters to pass along with the event
      */
    mParameters: Shell$PaneClosedEventParameters): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:search search} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSearch(): this.type = js.native
    def fireSearch(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:worksetItemSelected worksetItemSelected} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireWorksetItemSelected(): Boolean = js.native
    def fireWorksetItemSelected(
      /**
      * Parameters to pass along with the event
      */
    mParameters: Shell$WorksetItemSelectedEventParameters
    ): Boolean = js.native
    
    /**
      * @since 1.14.0
      *
      * Gets current value of property {@link #getAllowOverlayHeaderAccess allowOverlayHeaderAccess}.
      *
      * Whether the Shell header (Title Area + Header Items) can be accessed when an Overlay, OverlayContainer
      * or ThingInspector is open.
      *
      * Default value is `false`.
      *
      * @returns Value of property `allowOverlayHeaderAccess`
      */
    def getAllowOverlayHeaderAccess(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getAppIcon appIcon}.
      *
      * The URL of the image to appear in the left part of the header, usually a branding image containing a
      * logo and/or product name. appIcon and appTitle are both optional and can both be set; in this case the
      * icon appears first. If the appIcon is set, for accessibility reasons the appIconTooltip must also be
      * set.
      *
      * @returns Value of property `appIcon`
      */
    def getAppIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getAppIconTooltip appIconTooltip}.
      *
      * The tooltip of the application icon in the header
      *
      * @returns Value of property `appIconTooltip`
      */
    def getAppIconTooltip(): String = js.native
    
    /**
      * Gets current value of property {@link #getAppTitle appTitle}.
      *
      * The application title to appear in the left part of the header, usually a company and/or product name.
      * appIcon and appTitle are both optional and can both be set; in this case the icon appears first.
      *
      * @returns Value of property `appTitle`
      */
    def getAppTitle(): String = js.native
    
    /**
      * @since 1.9.0
      *
      * Gets current value of property {@link #getApplyContentPadding applyContentPadding}.
      *
      * Whether the Shell content area should have a theme-dependent padding or not.
      *
      * Default value is `true`.
      *
      * @returns Value of property `applyContentPadding`
      */
    def getApplyContentPadding(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * The content to appear in the main canvas. Each modification of this aggregation leads to a re-rendering
      * of the content area - but not to a re-rendering of the complete Shell.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @since 1.12.0
      *
      * Gets current value of property {@link #getDesignType designType}.
      *
      * Defines which design type is to be used.
      *
      * Default value is `Standard`.
      *
      * @returns Value of property `designType`
      */
    def getDesignType(): ShellDesignType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShellDesignType * / any */ String) = js.native
    
    /**
      * @since 1.9.0
      *
      * Gets current value of property {@link #getFullHeightContent fullHeightContent}.
      *
      * If set to true, the content area has a defined height. This means that any content put inside can use
      * "100%" height in CSS and will then consume all available space. However, if content is larger, scrollbars
      * will appear at the content area of the Shell and not on window level.
      *
      * Default value is `false`.
      *
      * @returns Value of property `fullHeightContent`
      */
    def getFullHeightContent(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getHeaderItems headerItems}.
      *
      * Controls to appear in the header next to the logout button. It is recommended to only use controls of
      * type Button, MenuButton and TextView. The respective UI guidelines need to be enforced on a higher level.
      */
    def getHeaderItems(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getHeaderType headerType}.
      *
      * Defines which header type to be used. Depending on the header type some other functionality might be
      * obsolete.
      *
      * Default value is `Standard`.
      *
      * @returns Value of property `headerType`
      */
    def getHeaderType(): ShellHeaderType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShellHeaderType * / any */ String) = js.native
    
    /**
      * @since 1.9.0
      *
      * Gets current value of property {@link #getLogoutButtonTooltip logoutButtonTooltip}.
      *
      * The tooltip to be displayed for the Logout Button of the Shell. If not set, a text meaning "Logout" in
      * the current language will be displayed.
      *
      * @returns Value of property `logoutButtonTooltip`
      */
    def getLogoutButtonTooltip(): String = js.native
    
    /**
      * @since 1.7.0
      *
      * Gets content of aggregation {@link #getNotificationBar notificationBar}.
      *
      * The NotificationBar which should be integrated into the Shell.
      */
    def getNotificationBar(): typings.openui5.sapUiUx3NotificationBarMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getPaneBarItems paneBarItems}.
      *
      * The items to appear in the PaneBar.
      */
    def getPaneBarItems(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getPaneContent paneContent}.
      *
      * The content to appear in the pane area.
      */
    def getPaneContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getPaneWidth paneWidth}.
      *
      * The width of the right-hand side pane in pixels. The value must be a non-negative integer. The Shell
      * reserves the right to define a minimum width (currently 50px).
      *
      * Default value is `250`.
      *
      * @returns Value of property `paneWidth`
      */
    def getPaneWidth(): int = js.native
    
    /**
      * Returns the SearchField control which is used in the Search Tool.
      */
    def getSearchField(): typings.openui5.sapUiCommonsSearchFieldMod.default = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getSelectedWorksetItem selectedWorksetItem},
      * or `null`.
      */
    def getSelectedWorksetItem(): ID = js.native
    
    /**
      * Gets current value of property {@link #getShowFeederTool showFeederTool}.
      *
      * Whether the "Feeder" tool should be displayed or not.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showFeederTool`
      */
    def getShowFeederTool(): Boolean = js.native
    
    /**
      * @deprecated (since 1.7.2) - According to the current Ux designs, the ThingInspector should NOT be opened
      * like this from the Tool Pane. And technically, the ThingInspector is not a ToolPopup. Instead trigger
      * it from the respective elements in the Shell content.
      *
      * Gets current value of property {@link #getShowInspectorTool showInspectorTool}.
      *
      * Whether the "Inspector" tool should be displayed or not.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showInspectorTool`
      */
    def getShowInspectorTool(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowLogoutButton showLogoutButton}.
      *
      * Whether the Logoff button in the header should be displayed or not.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showLogoutButton`
      */
    def getShowLogoutButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowPane showPane}.
      *
      * Whether the pane bar should be displayed at all or not.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showPane`
      */
    def getShowPane(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowSearchTool showSearchTool}.
      *
      * Whether the "Global Search" tool should be displayed or not.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showSearchTool`
      */
    def getShowSearchTool(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowTools showTools}.
      *
      * Whether the tool area should be displayed at all or not.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showTools`
      */
    def getShowTools(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getToolPopups toolPopups}.
      *
      * The items which appear in the ToolPalette and are opened as popup when clicked.
      */
    def getToolPopups(): js.Array[typings.openui5.sapUiUx3ToolPopupMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getWorksetItems worksetItems}.
      *
      * The workset items.
      */
    def getWorksetItems(): js.Array[typings.openui5.sapUiUx3NavigationItemMod.default] = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContent content}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getHeaderItems headerItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfHeaderItem(
      /**
      * The headerItem whose index is looked for
      */
    oHeaderItem: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Item` in the aggregation {@link #getPaneBarItems paneBarItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfPaneBarItem(
      /**
      * The paneBarItem whose index is looked for
      */
    oPaneBarItem: typings.openui5.sapUiCoreItemMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getPaneContent paneContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfPaneContent(
      /**
      * The paneContent whose index is looked for
      */
    oPaneContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.ux3.ToolPopup` in the aggregation {@link #getToolPopups toolPopups}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfToolPopup(
      /**
      * The toolPopup whose index is looked for
      */
    oToolPopup: typings.openui5.sapUiUx3ToolPopupMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.ux3.NavigationItem` in the aggregation {@link #getWorksetItems worksetItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfWorksetItem(
      /**
      * The worksetItem whose index is looked for
      */
    oWorksetItem: typings.openui5.sapUiUx3NavigationItemMod.default
    ): int = js.native
    
    /**
      * Experimental method! Do not use!
      *
      * Makes Shell personalization available and injects the given personalization settings. This should be
      * called before the user can do any adaptations per drag&drop or using the personalization dialog. Otherwise
      * it may override the user's new settings.
      */
    def initializePersonalization(/**
      * Personalization settings object
      */
    oSettings: js.Object): Unit = js.native
    
    /**
      * Inserts a content into the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContent(
      /**
      * The content to insert; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a headerItem into the aggregation {@link #getHeaderItems headerItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertHeaderItem(
      /**
      * The headerItem to insert; if empty, nothing is inserted
      */
    oHeaderItem: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the headerItem should be inserted at; for a negative value of `iIndex`, the headerItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the headerItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a paneBarItem into the aggregation {@link #getPaneBarItems paneBarItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertPaneBarItem(
      /**
      * The paneBarItem to insert; if empty, nothing is inserted
      */
    oPaneBarItem: typings.openui5.sapUiCoreItemMod.default,
      /**
      * The `0`-based index the paneBarItem should be inserted at; for a negative value of `iIndex`, the paneBarItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the paneBarItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a paneContent into the aggregation {@link #getPaneContent paneContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertPaneContent(
      /**
      * The paneContent to insert; if empty, nothing is inserted
      */
    oPaneContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the paneContent should be inserted at; for a negative value of `iIndex`, the paneContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the paneContent
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a toolPopup into the aggregation {@link #getToolPopups toolPopups}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertToolPopup(
      /**
      * The toolPopup to insert; if empty, nothing is inserted
      */
    oToolPopup: typings.openui5.sapUiUx3ToolPopupMod.default,
      /**
      * The `0`-based index the toolPopup should be inserted at; for a negative value of `iIndex`, the toolPopup
      * is inserted at position 0; for a value greater than the current size of the aggregation, the toolPopup
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a worksetItem into the aggregation {@link #getWorksetItems worksetItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertWorksetItem(
      /**
      * The worksetItem to insert; if empty, nothing is inserted
      */
    oWorksetItem: typings.openui5.sapUiUx3NavigationItemMod.default,
      /**
      * The `0`-based index the worksetItem should be inserted at; for a negative value of `iIndex`, the worksetItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the worksetItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Returns 'true' if the side Pane is currently open.
      */
    def isPaneOpen(): Boolean = js.native
    
    /**
      * Opens the side Pane.
      *
      * A valid ID of a paneBarItem must be given, so this item can be marked as selected. A "paneBarItemSelected"
      * event is then fired as if the opening was triggered by the user by a click on the respective PaneBarItem.
      * This method can be called (with different IDs) even when the Pane is already open. It has then the same
      * effect as if the user switches between PaneBarItems.
      *
      * Returns 'this' to allow method chaining.
      */
    def openPane(/**
      * The ID of the PaneBarItem which should be marked as selected.
      */
    sPaneBarItemId: String): this.type = js.native
    
    /**
      * Experimental method! Do not use!
      */
    def openPersonalizationDialog(): Unit = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getHeaderItems headerItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllHeaderItems(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getPaneBarItems paneBarItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllPaneBarItems(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getPaneContent paneContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllPaneContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getToolPopups toolPopups}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllToolPopups(): js.Array[typings.openui5.sapUiUx3ToolPopupMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getWorksetItems worksetItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllWorksetItems(): js.Array[typings.openui5.sapUiUx3NavigationItemMod.default] = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeHeaderItem(/**
      * The headerItem to remove or its index or id
      */
    vHeaderItem: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a headerItem from the aggregation {@link #getHeaderItems headerItems}.
      *
      * @returns The removed headerItem or `null`
      */
    def removeHeaderItem(/**
      * The headerItem to remove or its index or id
      */
    vHeaderItem: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeHeaderItem(
      /**
      * The headerItem to remove or its index or id
      */
    vHeaderItem: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removePaneBarItem(/**
      * The paneBarItem to remove or its index or id
      */
    vPaneBarItem: String): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    /**
      * Removes a paneBarItem from the aggregation {@link #getPaneBarItems paneBarItems}.
      *
      * @returns The removed paneBarItem or `null`
      */
    def removePaneBarItem(/**
      * The paneBarItem to remove or its index or id
      */
    vPaneBarItem: int): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    def removePaneBarItem(
      /**
      * The paneBarItem to remove or its index or id
      */
    vPaneBarItem: typings.openui5.sapUiCoreItemMod.default
    ): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    def removePaneContent(/**
      * The paneContent to remove or its index or id
      */
    vPaneContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a paneContent from the aggregation {@link #getPaneContent paneContent}.
      *
      * @returns The removed paneContent or `null`
      */
    def removePaneContent(/**
      * The paneContent to remove or its index or id
      */
    vPaneContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removePaneContent(
      /**
      * The paneContent to remove or its index or id
      */
    vPaneContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeToolPopup(/**
      * The toolPopup to remove or its index or id
      */
    vToolPopup: String): typings.openui5.sapUiUx3ToolPopupMod.default | Null = js.native
    /**
      * Removes a toolPopup from the aggregation {@link #getToolPopups toolPopups}.
      *
      * @returns The removed toolPopup or `null`
      */
    def removeToolPopup(/**
      * The toolPopup to remove or its index or id
      */
    vToolPopup: int): typings.openui5.sapUiUx3ToolPopupMod.default | Null = js.native
    def removeToolPopup(
      /**
      * The toolPopup to remove or its index or id
      */
    vToolPopup: typings.openui5.sapUiUx3ToolPopupMod.default
    ): typings.openui5.sapUiUx3ToolPopupMod.default | Null = js.native
    
    def removeWorksetItem(/**
      * The worksetItem to remove or its index or id
      */
    vWorksetItem: String): typings.openui5.sapUiUx3NavigationItemMod.default | Null = js.native
    /**
      * Removes a worksetItem from the aggregation {@link #getWorksetItems worksetItems}.
      *
      * @returns The removed worksetItem or `null`
      */
    def removeWorksetItem(/**
      * The worksetItem to remove or its index or id
      */
    vWorksetItem: int): typings.openui5.sapUiUx3NavigationItemMod.default | Null = js.native
    def removeWorksetItem(
      /**
      * The worksetItem to remove or its index or id
      */
    vWorksetItem: typings.openui5.sapUiUx3NavigationItemMod.default
    ): typings.openui5.sapUiUx3NavigationItemMod.default | Null = js.native
    
    /**
      * @since 1.14.0
      *
      * Sets a new value for property {@link #getAllowOverlayHeaderAccess allowOverlayHeaderAccess}.
      *
      * Whether the Shell header (Title Area + Header Items) can be accessed when an Overlay, OverlayContainer
      * or ThingInspector is open.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAllowOverlayHeaderAccess(): this.type = js.native
    def setAllowOverlayHeaderAccess(/**
      * New value for property `allowOverlayHeaderAccess`
      */
    bAllowOverlayHeaderAccess: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAppIcon appIcon}.
      *
      * The URL of the image to appear in the left part of the header, usually a branding image containing a
      * logo and/or product name. appIcon and appTitle are both optional and can both be set; in this case the
      * icon appears first. If the appIcon is set, for accessibility reasons the appIconTooltip must also be
      * set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAppIcon(): this.type = js.native
    def setAppIcon(/**
      * New value for property `appIcon`
      */
    sAppIcon: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAppIconTooltip appIconTooltip}.
      *
      * The tooltip of the application icon in the header
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAppIconTooltip(): this.type = js.native
    def setAppIconTooltip(/**
      * New value for property `appIconTooltip`
      */
    sAppIconTooltip: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAppTitle appTitle}.
      *
      * The application title to appear in the left part of the header, usually a company and/or product name.
      * appIcon and appTitle are both optional and can both be set; in this case the icon appears first.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAppTitle(): this.type = js.native
    def setAppTitle(/**
      * New value for property `appTitle`
      */
    sAppTitle: String): this.type = js.native
    
    /**
      * @since 1.9.0
      *
      * Sets a new value for property {@link #getApplyContentPadding applyContentPadding}.
      *
      * Whether the Shell content area should have a theme-dependent padding or not.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setApplyContentPadding(): this.type = js.native
    def setApplyContentPadding(/**
      * New value for property `applyContentPadding`
      */
    bApplyContentPadding: Boolean): this.type = js.native
    
    /**
      * Replaces the existing Shell content with the given Control(-Tree). Only leads to a re-rendering of the
      * content area (not the complete Shell). This method may be more convenient than a series of calls to "removeContent"
      * and "addContent", which each lead to a re-rendering of the content area (but again not of the complete
      * Shell).
      *
      * By default the old content is not destroyed and is returned by this method in an array for further usage.
      * To avoid memory leaks, the old content should be destroyed (if not needed later), by setting the "destroyOldContent"
      * flag or by destroying it manually later on. If "destroyOldContent" is set, an empty array is returned.
      */
    def setContent(
      /**
      * The new Content. In this method it must be exactly one control (-tree). Use addContent() to add more
      * control (-trees) to the main content area of the Shell.
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * If set, the controls previously contained in the Shell will be destroyed, to avoid memory leaks.
      */
    bDestroyOldContent: Boolean
    ): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @since 1.12.0
      *
      * Sets a new value for property {@link #getDesignType designType}.
      *
      * Defines which design type is to be used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Standard`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDesignType(): this.type = js.native
    def setDesignType(
      /**
      * New value for property `designType`
      */
    sDesignType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShellDesignType * / any */ String
    ): this.type = js.native
    def setDesignType(/**
      * New value for property `designType`
      */
    sDesignType: ShellDesignType): this.type = js.native
    
    /**
      * @since 1.9.0
      *
      * Sets a new value for property {@link #getFullHeightContent fullHeightContent}.
      *
      * If set to true, the content area has a defined height. This means that any content put inside can use
      * "100%" height in CSS and will then consume all available space. However, if content is larger, scrollbars
      * will appear at the content area of the Shell and not on window level.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFullHeightContent(): this.type = js.native
    def setFullHeightContent(/**
      * New value for property `fullHeightContent`
      */
    bFullHeightContent: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeaderType headerType}.
      *
      * Defines which header type to be used. Depending on the header type some other functionality might be
      * obsolete.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Standard`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderType(): this.type = js.native
    def setHeaderType(
      /**
      * New value for property `headerType`
      */
    sHeaderType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShellHeaderType * / any */ String
    ): this.type = js.native
    def setHeaderType(/**
      * New value for property `headerType`
      */
    sHeaderType: ShellHeaderType): this.type = js.native
    
    /**
      * @since 1.9.0
      *
      * Sets a new value for property {@link #getLogoutButtonTooltip logoutButtonTooltip}.
      *
      * The tooltip to be displayed for the Logout Button of the Shell. If not set, a text meaning "Logout" in
      * the current language will be displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLogoutButtonTooltip(): this.type = js.native
    def setLogoutButtonTooltip(/**
      * New value for property `logoutButtonTooltip`
      */
    sLogoutButtonTooltip: String): this.type = js.native
    
    /**
      * @since 1.7.0
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Moves the complete Shell away from the right window border by the given number of pixels (left border
      * in RTL case).
      *
      * So there is space for a sidebar or so outside the Shell. The CSS class 'sapUiUx3ShellOuterSideBar' provides
      * the basic position capabilities for the sidebar DOM element.
      *
      * This feature is not public. The usage is only granted to special groups on request.
      */
    def setOffsetRight(/**
      * how many pixels of free space should be next to the Shell (between 0 and 600)
      */
    px: int): Unit = js.native
    def setOffsetRight(
      /**
      * how many pixels of free space should be next to the Shell (between 0 and 600)
      */
    px: int,
      /**
      * optional callback function to call after the animation
      */
    complete: js.Function
    ): Unit = js.native
    def setOffsetRight(
      /**
      * how many pixels of free space should be next to the Shell (between 0 and 600)
      */
    px: int,
      /**
      * optional callback function to call after the animation
      */
    complete: js.Function,
      /**
      * optional id of the content representing the outside sidebar. If specified the width of the content is
      * animated.
      */
    outerId: String
    ): Unit = js.native
    def setOffsetRight(
      /**
      * how many pixels of free space should be next to the Shell (between 0 and 600)
      */
    px: int,
      /**
      * optional callback function to call after the animation
      */
    complete: Unit,
      /**
      * optional id of the content representing the outside sidebar. If specified the width of the content is
      * animated.
      */
    outerId: String
    ): Unit = js.native
    
    /**
      * Replaces the existing side pane content with the given Control(-Tree). This method is optimized to only
      * re-render the pane content (and not the shell) which is faster and smoother than any other way of changing
      * the "paneContent" aggregation.
      *
      * By default, the old pane content is not destroyed and is returned by this method in an array for further
      * usage. To avoid memory leaks, the old content should be destroyed (if not needed later), by setting the
      * "destroyOldContent" flag or by destroying it manually later on. If "destroyOldContent" is set, an empty
      * array is returned.
      */
    def setPaneContent(
      /**
      * The new Pane content. In this method it must be exactly one control (-tree). This could likely be a layout
      * or a specific ux3 Pane control. Use addPaneContent() to add more control (-trees) to the Pane.
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * If set, the controls previously contained in the pane will be destroyed, to avoid memory leaks.
      */
    bDestroyOldContent: Boolean
    ): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Sets a new value for property {@link #getPaneWidth paneWidth}.
      *
      * The width of the right-hand side pane in pixels. The value must be a non-negative integer. The Shell
      * reserves the right to define a minimum width (currently 50px).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `250`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPaneWidth(): this.type = js.native
    def setPaneWidth(/**
      * New value for property `paneWidth`
      */
    iPaneWidth: int): this.type = js.native
    
    /**
      * Sets the associated {@link #getSelectedWorksetItem selectedWorksetItem}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelectedWorksetItem(
      /**
      * ID of an element which becomes the new target of this selectedWorksetItem association; alternatively,
      * an element instance may be given
      */
    oSelectedWorksetItem: ID
    ): this.type = js.native
    def setSelectedWorksetItem(
      /**
      * ID of an element which becomes the new target of this selectedWorksetItem association; alternatively,
      * an element instance may be given
      */
    oSelectedWorksetItem: typings.openui5.sapUiUx3NavigationItemMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowFeederTool showFeederTool}.
      *
      * Whether the "Feeder" tool should be displayed or not.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowFeederTool(): this.type = js.native
    def setShowFeederTool(/**
      * New value for property `showFeederTool`
      */
    bShowFeederTool: Boolean): this.type = js.native
    
    /**
      * @deprecated (since 1.7.2) - According to the current Ux designs, the ThingInspector should NOT be opened
      * like this from the Tool Pane. And technically, the ThingInspector is not a ToolPopup. Instead trigger
      * it from the respective elements in the Shell content.
      *
      * Sets a new value for property {@link #getShowInspectorTool showInspectorTool}.
      *
      * Whether the "Inspector" tool should be displayed or not.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowInspectorTool(): this.type = js.native
    def setShowInspectorTool(/**
      * New value for property `showInspectorTool`
      */
    bShowInspectorTool: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowLogoutButton showLogoutButton}.
      *
      * Whether the Logoff button in the header should be displayed or not.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowLogoutButton(): this.type = js.native
    def setShowLogoutButton(/**
      * New value for property `showLogoutButton`
      */
    bShowLogoutButton: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowPane showPane}.
      *
      * Whether the pane bar should be displayed at all or not.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowPane(): this.type = js.native
    def setShowPane(/**
      * New value for property `showPane`
      */
    bShowPane: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowSearchTool showSearchTool}.
      *
      * Whether the "Global Search" tool should be displayed or not.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSearchTool(): this.type = js.native
    def setShowSearchTool(/**
      * New value for property `showSearchTool`
      */
    bShowSearchTool: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowTools showTools}.
      *
      * Whether the tool area should be displayed at all or not.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowTools(): this.type = js.native
    def setShowTools(/**
      * New value for property `showTools`
      */
    bShowTools: Boolean): this.type = js.native
  }
  
  trait Shell$FeedSubmitEventParameters extends StObject
  
  trait Shell$LogoutEventParameters extends StObject
  
  trait Shell$PaneBarItemSelectedEventParameters extends StObject {
    
    /**
      * The ID of the selected PaneBarItem.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * The selected Item
      */
    var item: js.UndefOr[typings.openui5.sapUiCoreItemMod.default] = js.undefined
    
    /**
      * The key of the selected Item (or null if there is no key)
      */
    var key: js.UndefOr[String] = js.undefined
  }
  object Shell$PaneBarItemSelectedEventParameters {
    
    inline def apply(): Shell$PaneBarItemSelectedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Shell$PaneBarItemSelectedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Shell$PaneBarItemSelectedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItem(value: typings.openui5.sapUiCoreItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait Shell$PaneClosedEventParameters extends StObject {
    
    /**
      * The id of the PaneBarItem to which the closed pane belonged.
      */
    var id: js.UndefOr[String] = js.undefined
  }
  object Shell$PaneClosedEventParameters {
    
    inline def apply(): Shell$PaneClosedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Shell$PaneClosedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Shell$PaneClosedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  trait Shell$SearchEventParameters extends StObject
  
  trait Shell$WorksetItemSelectedEventParameters extends StObject {
    
    /**
      * The id of the workset item that has been newly selected by the user. If a top-level item has been clicked
      * which has sub-items, the ID of the currently active sub-item (/leaf) is given.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * The selected NavigationItem
      */
    var item: js.UndefOr[typings.openui5.sapUiUx3NavigationItemMod.default] = js.undefined
    
    /**
      * The key of the selected NavigationItem (or null if there is no key)
      */
    var key: js.UndefOr[String] = js.undefined
  }
  object Shell$WorksetItemSelectedEventParameters {
    
    inline def apply(): Shell$WorksetItemSelectedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Shell$WorksetItemSelectedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Shell$WorksetItemSelectedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItem(value: typings.openui5.sapUiUx3NavigationItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  type ShellFeedSubmitEvent = typings.openui5.sapUiBaseEventMod.default[Shell$FeedSubmitEventParameters]
  
  type ShellFeedSubmitEventParameters = Shell$FeedSubmitEventParameters
  
  type ShellLogoutEvent = typings.openui5.sapUiBaseEventMod.default[Shell$LogoutEventParameters]
  
  type ShellLogoutEventParameters = Shell$LogoutEventParameters
  
  type ShellPaneBarItemSelectedEvent = typings.openui5.sapUiBaseEventMod.default[Shell$PaneBarItemSelectedEventParameters]
  
  type ShellPaneBarItemSelectedEventParameters = Shell$PaneBarItemSelectedEventParameters
  
  type ShellPaneClosedEvent = typings.openui5.sapUiBaseEventMod.default[Shell$PaneClosedEventParameters]
  
  type ShellPaneClosedEventParameters = Shell$PaneClosedEventParameters
  
  type ShellSearchEvent = typings.openui5.sapUiBaseEventMod.default[Shell$SearchEventParameters]
  
  type ShellSearchEventParameters = Shell$SearchEventParameters
  
  trait ShellSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @since 1.14.0
      *
      * Whether the Shell header (Title Area + Header Items) can be accessed when an Overlay, OverlayContainer
      * or ThingInspector is open.
      */
    var allowOverlayHeaderAccess: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The URL of the image to appear in the left part of the header, usually a branding image containing a
      * logo and/or product name. appIcon and appTitle are both optional and can both be set; in this case the
      * icon appears first. If the appIcon is set, for accessibility reasons the appIconTooltip must also be
      * set.
      */
    var appIcon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The tooltip of the application icon in the header
      */
    var appIconTooltip: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The application title to appear in the left part of the header, usually a company and/or product name.
      * appIcon and appTitle are both optional and can both be set; in this case the icon appears first.
      */
    var appTitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.9.0
      *
      * Whether the Shell content area should have a theme-dependent padding or not.
      */
    var applyContentPadding: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The content to appear in the main canvas. Each modification of this aggregation leads to a re-rendering
      * of the content area - but not to a re-rendering of the complete Shell.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.12.0
      *
      * Defines which design type is to be used.
      */
    var designType: js.UndefOr[
        ShellDesignType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShellDesignType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Fired when a new feed entry is submitted.
      */
    var feedSubmit: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * @since 1.9.0
      *
      * If set to true, the content area has a defined height. This means that any content put inside can use
      * "100%" height in CSS and will then consume all available space. However, if content is larger, scrollbars
      * will appear at the content area of the Shell and not on window level.
      */
    var fullHeightContent: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Controls to appear in the header next to the logout button. It is recommended to only use controls of
      * type Button, MenuButton and TextView. The respective UI guidelines need to be enforced on a higher level.
      */
    var headerItems: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines which header type to be used. Depending on the header type some other functionality might be
      * obsolete.
      */
    var headerType: js.UndefOr[
        ShellHeaderType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShellHeaderType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Fired when the user clicks the "Log-off" button
      */
    var logout: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * @since 1.9.0
      *
      * The tooltip to be displayed for the Logout Button of the Shell. If not set, a text meaning "Logout" in
      * the current language will be displayed.
      */
    var logoutButtonTooltip: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.7.0
      *
      * The NotificationBar which should be integrated into the Shell.
      */
    var notificationBar: js.UndefOr[typings.openui5.sapUiUx3NotificationBarMod.default] = js.undefined
    
    /**
      * An item in the right-hand-side pane bar has been selected, the pane is now visible and can be filled
      * with UI elements.
      */
    var paneBarItemSelected: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Shell$PaneBarItemSelectedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The items to appear in the PaneBar.
      */
    var paneBarItems: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.12.0
      *
      * Fired after a side pane of the shell is closed. It is also fired, when an open pane is closed by calling
      * setShowPane(false), if and only if the pane was opened before.
      */
    var paneClosed: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Shell$PaneClosedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The content to appear in the pane area.
      */
    var paneContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The width of the right-hand side pane in pixels. The value must be a non-negative integer. The Shell
      * reserves the right to define a minimum width (currently 50px).
      */
    var paneWidth: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Fired when search has been triggered.
      */
    var search: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * The ID of the Item that is currently selected. When setting, the NavigationItem itself can be given instead
      * of its ID. There will not be a worksetItemSelected event, the application is responsible to show the
      * proper content according to the newly selected WorksetItem. If the set WorksetItem does not exist in
      * this Shell, the first item (and first sub-item) will be selected after the call. When getting, always
      * the ID is returned, by which the NavigationItem instance can be retrieved.
      */
    var selectedWorksetItem: js.UndefOr[typings.openui5.sapUiUx3NavigationItemMod.default | String] = js.undefined
    
    /**
      * Whether the "Feeder" tool should be displayed or not.
      */
    var showFeederTool: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.7.2) - According to the current Ux designs, the ThingInspector should NOT be opened
      * like this from the Tool Pane. And technically, the ThingInspector is not a ToolPopup. Instead trigger
      * it from the respective elements in the Shell content.
      *
      * Whether the "Inspector" tool should be displayed or not.
      */
    var showInspectorTool: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Whether the Logoff button in the header should be displayed or not.
      */
    var showLogoutButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Whether the pane bar should be displayed at all or not.
      */
    var showPane: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Whether the "Global Search" tool should be displayed or not.
      */
    var showSearchTool: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Whether the tool area should be displayed at all or not.
      */
    var showTools: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The items which appear in the ToolPalette and are opened as popup when clicked.
      */
    var toolPopups: js.UndefOr[
        js.Array[typings.openui5.sapUiUx3ToolPopupMod.default] | typings.openui5.sapUiUx3ToolPopupMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when a workset item was selected by the user. The application may populate the sub-items of the
      * given workset item in the event handler, but this must happen synchronously. If this is done, the application
      * is responsible for displaying the correct content for the selected one of the newly created sub-items.
      * The Shell will currently always mark the first sub-item as selected.
      */
    var worksetItemSelected: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Shell$WorksetItemSelectedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The workset items.
      */
    var worksetItems: js.UndefOr[
        js.Array[typings.openui5.sapUiUx3NavigationItemMod.default] | typings.openui5.sapUiUx3NavigationItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ShellSettings {
    
    inline def apply(): ShellSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellSettings] (val x: Self) extends AnyVal {
      
      inline def setAllowOverlayHeaderAccess(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "allowOverlayHeaderAccess", value.asInstanceOf[js.Any])
      
      inline def setAllowOverlayHeaderAccessUndefined: Self = StObject.set(x, "allowOverlayHeaderAccess", js.undefined)
      
      inline def setAppIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "appIcon", value.asInstanceOf[js.Any])
      
      inline def setAppIconTooltip(value: String | PropertyBindingInfo): Self = StObject.set(x, "appIconTooltip", value.asInstanceOf[js.Any])
      
      inline def setAppIconTooltipUndefined: Self = StObject.set(x, "appIconTooltip", js.undefined)
      
      inline def setAppIconUndefined: Self = StObject.set(x, "appIcon", js.undefined)
      
      inline def setAppTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "appTitle", value.asInstanceOf[js.Any])
      
      inline def setAppTitleUndefined: Self = StObject.set(x, "appTitle", js.undefined)
      
      inline def setApplyContentPadding(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "applyContentPadding", value.asInstanceOf[js.Any])
      
      inline def setApplyContentPaddingUndefined: Self = StObject.set(x, "applyContentPadding", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setDesignType(
        value: ShellDesignType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShellDesignType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "designType", value.asInstanceOf[js.Any])
      
      inline def setDesignTypeUndefined: Self = StObject.set(x, "designType", js.undefined)
      
      inline def setFeedSubmit(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "feedSubmit", js.Any.fromFunction1(value))
      
      inline def setFeedSubmitUndefined: Self = StObject.set(x, "feedSubmit", js.undefined)
      
      inline def setFullHeightContent(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fullHeightContent", value.asInstanceOf[js.Any])
      
      inline def setFullHeightContentUndefined: Self = StObject.set(x, "fullHeightContent", js.undefined)
      
      inline def setHeaderItems(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "headerItems", value.asInstanceOf[js.Any])
      
      inline def setHeaderItemsUndefined: Self = StObject.set(x, "headerItems", js.undefined)
      
      inline def setHeaderItemsVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "headerItems", js.Array(value*))
      
      inline def setHeaderType(
        value: ShellHeaderType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShellHeaderType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "headerType", value.asInstanceOf[js.Any])
      
      inline def setHeaderTypeUndefined: Self = StObject.set(x, "headerType", js.undefined)
      
      inline def setLogout(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "logout", js.Any.fromFunction1(value))
      
      inline def setLogoutButtonTooltip(value: String | PropertyBindingInfo): Self = StObject.set(x, "logoutButtonTooltip", value.asInstanceOf[js.Any])
      
      inline def setLogoutButtonTooltipUndefined: Self = StObject.set(x, "logoutButtonTooltip", js.undefined)
      
      inline def setLogoutUndefined: Self = StObject.set(x, "logout", js.undefined)
      
      inline def setNotificationBar(value: typings.openui5.sapUiUx3NotificationBarMod.default): Self = StObject.set(x, "notificationBar", value.asInstanceOf[js.Any])
      
      inline def setNotificationBarUndefined: Self = StObject.set(x, "notificationBar", js.undefined)
      
      inline def setPaneBarItemSelected(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Shell$PaneBarItemSelectedEventParameters] => Unit
      ): Self = StObject.set(x, "paneBarItemSelected", js.Any.fromFunction1(value))
      
      inline def setPaneBarItemSelectedUndefined: Self = StObject.set(x, "paneBarItemSelected", js.undefined)
      
      inline def setPaneBarItems(
        value: js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "paneBarItems", value.asInstanceOf[js.Any])
      
      inline def setPaneBarItemsUndefined: Self = StObject.set(x, "paneBarItems", js.undefined)
      
      inline def setPaneBarItemsVarargs(value: typings.openui5.sapUiCoreItemMod.default*): Self = StObject.set(x, "paneBarItems", js.Array(value*))
      
      inline def setPaneClosed(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Shell$PaneClosedEventParameters] => Unit
      ): Self = StObject.set(x, "paneClosed", js.Any.fromFunction1(value))
      
      inline def setPaneClosedUndefined: Self = StObject.set(x, "paneClosed", js.undefined)
      
      inline def setPaneContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "paneContent", value.asInstanceOf[js.Any])
      
      inline def setPaneContentUndefined: Self = StObject.set(x, "paneContent", js.undefined)
      
      inline def setPaneContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "paneContent", js.Array(value*))
      
      inline def setPaneWidth(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "paneWidth", value.asInstanceOf[js.Any])
      
      inline def setPaneWidthUndefined: Self = StObject.set(x, "paneWidth", js.undefined)
      
      inline def setSearch(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSelectedWorksetItem(value: typings.openui5.sapUiUx3NavigationItemMod.default | String): Self = StObject.set(x, "selectedWorksetItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedWorksetItemUndefined: Self = StObject.set(x, "selectedWorksetItem", js.undefined)
      
      inline def setShowFeederTool(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showFeederTool", value.asInstanceOf[js.Any])
      
      inline def setShowFeederToolUndefined: Self = StObject.set(x, "showFeederTool", js.undefined)
      
      inline def setShowInspectorTool(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showInspectorTool", value.asInstanceOf[js.Any])
      
      inline def setShowInspectorToolUndefined: Self = StObject.set(x, "showInspectorTool", js.undefined)
      
      inline def setShowLogoutButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showLogoutButton", value.asInstanceOf[js.Any])
      
      inline def setShowLogoutButtonUndefined: Self = StObject.set(x, "showLogoutButton", js.undefined)
      
      inline def setShowPane(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showPane", value.asInstanceOf[js.Any])
      
      inline def setShowPaneUndefined: Self = StObject.set(x, "showPane", js.undefined)
      
      inline def setShowSearchTool(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSearchTool", value.asInstanceOf[js.Any])
      
      inline def setShowSearchToolUndefined: Self = StObject.set(x, "showSearchTool", js.undefined)
      
      inline def setShowTools(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showTools", value.asInstanceOf[js.Any])
      
      inline def setShowToolsUndefined: Self = StObject.set(x, "showTools", js.undefined)
      
      inline def setToolPopups(
        value: js.Array[typings.openui5.sapUiUx3ToolPopupMod.default] | typings.openui5.sapUiUx3ToolPopupMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "toolPopups", value.asInstanceOf[js.Any])
      
      inline def setToolPopupsUndefined: Self = StObject.set(x, "toolPopups", js.undefined)
      
      inline def setToolPopupsVarargs(value: typings.openui5.sapUiUx3ToolPopupMod.default*): Self = StObject.set(x, "toolPopups", js.Array(value*))
      
      inline def setWorksetItemSelected(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Shell$WorksetItemSelectedEventParameters] => Unit
      ): Self = StObject.set(x, "worksetItemSelected", js.Any.fromFunction1(value))
      
      inline def setWorksetItemSelectedUndefined: Self = StObject.set(x, "worksetItemSelected", js.undefined)
      
      inline def setWorksetItems(
        value: js.Array[typings.openui5.sapUiUx3NavigationItemMod.default] | typings.openui5.sapUiUx3NavigationItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "worksetItems", value.asInstanceOf[js.Any])
      
      inline def setWorksetItemsUndefined: Self = StObject.set(x, "worksetItems", js.undefined)
      
      inline def setWorksetItemsVarargs(value: typings.openui5.sapUiUx3NavigationItemMod.default*): Self = StObject.set(x, "worksetItems", js.Array(value*))
    }
  }
  
  type ShellWorksetItemSelectedEvent = typings.openui5.sapUiBaseEventMod.default[Shell$WorksetItemSelectedEventParameters]
  
  type ShellWorksetItemSelectedEventParameters = Shell$WorksetItemSelectedEventParameters
}
