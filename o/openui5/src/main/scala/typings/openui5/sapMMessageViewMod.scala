package typings.openui5

import typings.openui5.anon.AsyncDescriptionHandler
import typings.openui5.anon.MessageTypeFilter
import typings.openui5.anon.OpenBy
import typings.openui5.anon.`18`
import typings.openui5.anon.`19`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMMessageViewMod {
  
  @JSImport("sap/m/MessageView", JSImport.Default)
  @js.native
  /**
    * Constructor for a new MessageView
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/message-view/ Message View}
    */
  open class default () extends MessageView {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: MessageViewSettings) = this()
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
    mSettings: MessageViewSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: MessageViewSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/MessageView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.MessageView with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, MessageView]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MessageView],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.MessageView.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Setter for default description and URL validation callbacks across all instances of MessageView
      */
    inline def setDefaultHandlers(/**
      * An object setting default callbacks
      */
    mDefaultHandlers: AsyncDescriptionHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultHandlers")(mDefaultHandlers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @js.native
  trait MessageView
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapMMessageItemMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.58
      *
      * Attaches event handler `fnFunction` to the {@link #event:activeTitlePress activeTitlePress} event of
      * this `sap.m.MessageView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MessageView` itself.
      *
      * Event fired when an activeTitle of a MessageItem is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachActiveTitlePress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachActiveTitlePress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.MessageView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.58
      *
      * Attaches event handler `fnFunction` to the {@link #event:activeTitlePress activeTitlePress} event of
      * this `sap.m.MessageView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MessageView` itself.
      *
      * Event fired when an activeTitle of a MessageItem is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachActiveTitlePress(
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
    def attachActiveTitlePress(
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
      * Context object to call the event handler with. Defaults to this `sap.m.MessageView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.72) - Use the appropriate event from the wrapper control, instead.
      *
      * Attaches event handler `fnFunction` to the {@link #event:afterOpen afterOpen} event of this `sap.m.MessageView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MessageView` itself.
      *
      * Event fired after the popover is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.MessageView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @deprecated (since 1.72) - Use the appropriate event from the wrapper control, instead.
      *
      * Attaches event handler `fnFunction` to the {@link #event:afterOpen afterOpen} event of this `sap.m.MessageView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MessageView` itself.
      *
      * Event fired after the popover is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterOpen(
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
    def attachAfterOpen(
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
      * Context object to call the event handler with. Defaults to this `sap.m.MessageView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemSelect itemSelect} event of this `sap.m.MessageView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MessageView` itself.
      *
      * Event fired when description is shown.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachItemSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.MessageView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemSelect itemSelect} event of this `sap.m.MessageView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MessageView` itself.
      *
      * Event fired when description is shown.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemSelect(
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
    def attachItemSelect(
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
      * Context object to call the event handler with. Defaults to this `sap.m.MessageView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:listSelect listSelect} event of this `sap.m.MessageView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MessageView` itself.
      *
      * Event fired when one of the lists is shown when (not) filtered by type.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachListSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachListSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.MessageView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:listSelect listSelect} event of this `sap.m.MessageView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MessageView` itself.
      *
      * Event fired when one of the lists is shown when (not) filtered by type.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachListSelect(
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
    def attachListSelect(
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
      * Context object to call the event handler with. Defaults to this `sap.m.MessageView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:longtextLoaded longtextLoaded} event of this
      * `sap.m.MessageView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MessageView` itself.
      *
      * Event fired when the long text description data from a remote URL is loaded.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLongtextLoaded(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLongtextLoaded(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.MessageView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:longtextLoaded longtextLoaded} event of this
      * `sap.m.MessageView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MessageView` itself.
      *
      * Event fired when the long text description data from a remote URL is loaded.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLongtextLoaded(
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
    def attachLongtextLoaded(
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
      * Context object to call the event handler with. Defaults to this `sap.m.MessageView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:urlValidated urlValidated} event of this `sap.m.MessageView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MessageView` itself.
      *
      * Event fired when a validation of a URL from long text description is ready.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUrlValidated(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachUrlValidated(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.MessageView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:urlValidated urlValidated} event of this `sap.m.MessageView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MessageView` itself.
      *
      * Event fired when a validation of a URL from long text description is ready.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUrlValidated(
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
    def attachUrlValidated(
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
      * Context object to call the event handler with. Defaults to this `sap.m.MessageView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the headerButton in the aggregation {@link #getHeaderButton headerButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeaderButton(): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * @SINCE 1.58
      *
      * Detaches event handler `fnFunction` from the {@link #event:activeTitlePress activeTitlePress} event of
      * this `sap.m.MessageView`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachActiveTitlePress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachActiveTitlePress(
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
      * @deprecated (since 1.72) - Use the appropriate event from the wrapper control, instead.
      *
      * Detaches event handler `fnFunction` from the {@link #event:afterOpen afterOpen} event of this `sap.m.MessageView`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAfterOpen(
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
      * Detaches event handler `fnFunction` from the {@link #event:itemSelect itemSelect} event of this `sap.m.MessageView`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachItemSelect(
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
      * Detaches event handler `fnFunction` from the {@link #event:listSelect listSelect} event of this `sap.m.MessageView`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachListSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachListSelect(
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
      * Detaches event handler `fnFunction` from the {@link #event:longtextLoaded longtextLoaded} event of this
      * `sap.m.MessageView`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLongtextLoaded(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachLongtextLoaded(
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
      * Detaches event handler `fnFunction` from the {@link #event:urlValidated urlValidated} event of this `sap.m.MessageView`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachUrlValidated(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachUrlValidated(
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
      * @SINCE 1.58
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:activeTitlePress activeTitlePress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireActiveTitlePress(): this.type = js.native
    def fireActiveTitlePress(/**
      * Parameters to pass along with the event
      */
    mParameters: `18`): this.type = js.native
    
    /**
      * @deprecated (since 1.72) - Use the appropriate event from the wrapper control, instead.
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:afterOpen afterOpen} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterOpen(): this.type = js.native
    def fireAfterOpen(/**
      * Parameters to pass along with the event
      */
    mParameters: OpenBy): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:itemSelect itemSelect} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireItemSelect(): this.type = js.native
    def fireItemSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: MessageTypeFilter): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:listSelect listSelect} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireListSelect(): this.type = js.native
    def fireListSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: `19`): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:longtextLoaded longtextLoaded} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLongtextLoaded(): this.type = js.native
    def fireLongtextLoaded(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:urlValidated urlValidated} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireUrlValidated(): this.type = js.native
    def fireUrlValidated(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAsyncDescriptionHandler asyncDescriptionHandler}.
      *
      * Callback function for resolving a promise after description has been asynchronously loaded inside this
      * function.
      *
      * @returns Value of property `asyncDescriptionHandler`
      */
    def getAsyncDescriptionHandler(): js.Function = js.native
    
    /**
      * Gets current value of property {@link #getAsyncURLHandler asyncURLHandler}.
      *
      * Callback function for resolving a promise after a link has been asynchronously validated inside this
      * function.
      *
      * @returns Value of property `asyncURLHandler`
      */
    def getAsyncURLHandler(): js.Function = js.native
    
    /**
      * Gets current value of property {@link #getGroupItems groupItems}.
      *
      * Defines whether the MessageItems are grouped or not.
      *
      * Default value is `false`.
      *
      * @returns Value of property `groupItems`
      */
    def getGroupItems(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getHeaderButton headerButton}.
      *
      * Sets a custom header button.
      */
    def getHeaderButton(): typings.openui5.sapMButtonMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * A list with message items. If only one item is provided, the initial page will be the details page for
      * the item.
      */
    def getItems(): js.Array[typings.openui5.sapMMessageItemMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getShowDetailsPageHeader showDetailsPageHeader}.
      *
      * Defines whether the header of details page will be shown.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showDetailsPageHeader`
      */
    def getShowDetailsPageHeader(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.m.MessageItem` in the aggregation {@link #getItems items}. and returns its
      * index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(/**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapMMessageItemMod.default): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapMMessageItemMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Navigates back to the list page
      */
    def navigateBack(): Unit = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typings.openui5.sapMMessageItemMod.default] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapMMessageItemMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapMMessageItemMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapMMessageItemMod.default
    ): typings.openui5.sapMMessageItemMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getAsyncDescriptionHandler asyncDescriptionHandler}.
      *
      * Callback function for resolving a promise after description has been asynchronously loaded inside this
      * function.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAsyncDescriptionHandler(): this.type = js.native
    def setAsyncDescriptionHandler(
      /**
      * New value for property `asyncDescriptionHandler`
      */
    fnAsyncDescriptionHandler: js.Function
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAsyncURLHandler asyncURLHandler}.
      *
      * Callback function for resolving a promise after a link has been asynchronously validated inside this
      * function.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAsyncURLHandler(): this.type = js.native
    def setAsyncURLHandler(/**
      * New value for property `asyncURLHandler`
      */
    fnAsyncURLHandler: js.Function): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGroupItems groupItems}.
      *
      * Defines whether the MessageItems are grouped or not.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGroupItems(): this.type = js.native
    def setGroupItems(/**
      * New value for property `groupItems`
      */
    bGroupItems: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getHeaderButton headerButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderButton(/**
      * The headerButton to set
      */
    oHeaderButton: typings.openui5.sapMButtonMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowDetailsPageHeader showDetailsPageHeader}.
      *
      * Defines whether the header of details page will be shown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowDetailsPageHeader(): this.type = js.native
    def setShowDetailsPageHeader(/**
      * New value for property `showDetailsPageHeader`
      */
    bShowDetailsPageHeader: Boolean): this.type = js.native
  }
  
  trait MessageViewSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.58
      *
      * Event fired when an activeTitle of a MessageItem is pressed.
      */
    var activeTitlePress: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @deprecated (since 1.72) - Use the appropriate event from the wrapper control, instead.
      *
      * Event fired after the popover is opened.
      */
    var afterOpen: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Callback function for resolving a promise after description has been asynchronously loaded inside this
      * function.
      */
    var asyncDescriptionHandler: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Callback function for resolving a promise after a link has been asynchronously validated inside this
      * function.
      */
    var asyncURLHandler: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the MessageItems are grouped or not.
      */
    var groupItems: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets a custom header button.
      */
    var headerButton: js.UndefOr[typings.openui5.sapMButtonMod.default] = js.undefined
    
    /**
      * Event fired when description is shown.
      */
    var itemSelect: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * A list with message items. If only one item is provided, the initial page will be the details page for
      * the item.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapMMessageItemMod.default] | typings.openui5.sapMMessageItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event fired when one of the lists is shown when (not) filtered by type.
      */
    var listSelect: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Event fired when the long text description data from a remote URL is loaded.
      */
    var longtextLoaded: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines whether the header of details page will be shown.
      */
    var showDetailsPageHeader: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event fired when a validation of a URL from long text description is ready.
      */
    var urlValidated: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object MessageViewSettings {
    
    inline def apply(): MessageViewSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageViewSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageViewSettings] (val x: Self) extends AnyVal {
      
      inline def setActiveTitlePress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "activeTitlePress", js.Any.fromFunction1(value))
      
      inline def setActiveTitlePressUndefined: Self = StObject.set(x, "activeTitlePress", js.undefined)
      
      inline def setAfterOpen(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterOpen", js.Any.fromFunction1(value))
      
      inline def setAfterOpenUndefined: Self = StObject.set(x, "afterOpen", js.undefined)
      
      inline def setAsyncDescriptionHandler(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "asyncDescriptionHandler", value.asInstanceOf[js.Any])
      
      inline def setAsyncDescriptionHandlerUndefined: Self = StObject.set(x, "asyncDescriptionHandler", js.undefined)
      
      inline def setAsyncURLHandler(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "asyncURLHandler", value.asInstanceOf[js.Any])
      
      inline def setAsyncURLHandlerUndefined: Self = StObject.set(x, "asyncURLHandler", js.undefined)
      
      inline def setGroupItems(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "groupItems", value.asInstanceOf[js.Any])
      
      inline def setGroupItemsUndefined: Self = StObject.set(x, "groupItems", js.undefined)
      
      inline def setHeaderButton(value: typings.openui5.sapMButtonMod.default): Self = StObject.set(x, "headerButton", value.asInstanceOf[js.Any])
      
      inline def setHeaderButtonUndefined: Self = StObject.set(x, "headerButton", js.undefined)
      
      inline def setItemSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemSelect", js.Any.fromFunction1(value))
      
      inline def setItemSelectUndefined: Self = StObject.set(x, "itemSelect", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapMMessageItemMod.default] | typings.openui5.sapMMessageItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapMMessageItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setListSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "listSelect", js.Any.fromFunction1(value))
      
      inline def setListSelectUndefined: Self = StObject.set(x, "listSelect", js.undefined)
      
      inline def setLongtextLoaded(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "longtextLoaded", js.Any.fromFunction1(value))
      
      inline def setLongtextLoadedUndefined: Self = StObject.set(x, "longtextLoaded", js.undefined)
      
      inline def setShowDetailsPageHeader(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showDetailsPageHeader", value.asInstanceOf[js.Any])
      
      inline def setShowDetailsPageHeaderUndefined: Self = StObject.set(x, "showDetailsPageHeader", js.undefined)
      
      inline def setUrlValidated(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "urlValidated", js.Any.fromFunction1(value))
      
      inline def setUrlValidatedUndefined: Self = StObject.set(x, "urlValidated", js.undefined)
    }
  }
}
