package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreEventBusMod {
  
  @JSImport("sap/ui/core/EventBus", JSImport.Default)
  @js.native
  /**
    * Creates an instance of EventBus.
    */
  open class default () extends EventBus
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/EventBus", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.EventBus with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.Object.extend}.
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
    oClassInfo: ClassInfo[T, EventBus]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, EventBus],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.EventBus.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait EventBus
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    /**
      * Fires an event using the specified settings and notifies all attached event handlers.
      */
    def publish(
      /**
      * The channel of the event to fire. If not given, the default channel is used. The channel `"sap.ui"` is
      * reserved by the UI5 framework. An application might listen to events on this channel but is not allowed
      * to publish its own events there.
      */
    sChannelId: String,
      /**
      * The identifier of the event to fire
      */
    sEventId: String
    ): Unit = js.native
    def publish(
      /**
      * The channel of the event to fire. If not given, the default channel is used. The channel `"sap.ui"` is
      * reserved by the UI5 framework. An application might listen to events on this channel but is not allowed
      * to publish its own events there.
      */
    sChannelId: String,
      /**
      * The identifier of the event to fire
      */
    sEventId: String,
      /**
      * The parameters which should be carried by the event
      */
    oData: js.Object
    ): Unit = js.native
    /**
      * Fires an event using the specified settings and notifies all attached event handlers.
      */
    def publish(/**
      * The identifier of the event to fire
      */
    sEventId: String): Unit = js.native
    def publish(
      /**
      * The identifier of the event to fire
      */
    sEventId: String,
      /**
      * The parameters which should be carried by the event
      */
    oData: js.Object
    ): Unit = js.native
    
    /**
      * Attaches an event handler to the event with the given identifier on the given event channel.
      *
      * @returns Returns `this` to allow method chaining
      */
    def subscribe(
      /**
      * The channel of the event to subscribe to. If not given, the default channel is used. The channel `"sap.ui"`
      * is reserved by the UI5 framework. An application might listen to events on this channel but is not allowed
      * to publish its own events there.
      */
    sChannelId: String,
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the event bus instance. The channel is provided as first argument
      * of the handler, and the event identifier is provided as the second argument. The parameter map carried
      * by the event is provided as the third argument (if present). Handlers must not change the content of
      * this map.
      */
    fnFunction: js.Function
    ): this.type = js.native
    def subscribe(
      /**
      * The channel of the event to subscribe to. If not given, the default channel is used. The channel `"sap.ui"`
      * is reserved by the UI5 framework. An application might listen to events on this channel but is not allowed
      * to publish its own events there.
      */
    sChannelId: String,
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the event bus instance. The channel is provided as first argument
      * of the handler, and the event identifier is provided as the second argument. The parameter map carried
      * by the event is provided as the third argument (if present). Handlers must not change the content of
      * this map.
      */
    fnFunction: js.Function,
      /**
      * The object that wants to be notified when the event occurs (`this` context within the handler function).
      * If it is not specified, the handler function is called in the context of the event bus.
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches an event handler to the event with the given identifier on the given event channel.
      *
      * @returns Returns `this` to allow method chaining
      */
    def subscribe(
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the event bus instance. The channel is provided as first argument
      * of the handler, and the event identifier is provided as the second argument. The parameter map carried
      * by the event is provided as the third argument (if present). Handlers must not change the content of
      * this map.
      */
    fnFunction: js.Function
    ): this.type = js.native
    def subscribe(
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the event bus instance. The channel is provided as first argument
      * of the handler, and the event identifier is provided as the second argument. The parameter map carried
      * by the event is provided as the third argument (if present). Handlers must not change the content of
      * this map.
      */
    fnFunction: js.Function,
      /**
      * The object that wants to be notified when the event occurs (`this` context within the handler function).
      * If it is not specified, the handler function is called in the context of the event bus.
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.32.0
      *
      * Attaches an event handler, called one time only, to the event with the given identifier on the given
      * event channel.
      *
      * When the event occurs, the handler function is called and the handler registration is automatically removed
      * afterwards.
      *
      * @returns Returns `this` to allow method chaining
      */
    def subscribeOnce(
      /**
      * The channel of the event to subscribe to. If not given, the default channel is used. The channel `"sap.ui"`
      * is reserved by the UI5 framework. An application might listen to events on this channel but is not allowed
      * to publish its own events there.
      */
    sChannelId: String,
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the event bus instance. The channel is provided as first argument
      * of the handler, and the event identifier is provided as the second argument. The parameter map carried
      * by the event is provided as the third argument (if present). Handlers must not change the content of
      * this map.
      */
    fnFunction: js.Function
    ): this.type = js.native
    def subscribeOnce(
      /**
      * The channel of the event to subscribe to. If not given, the default channel is used. The channel `"sap.ui"`
      * is reserved by the UI5 framework. An application might listen to events on this channel but is not allowed
      * to publish its own events there.
      */
    sChannelId: String,
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the event bus instance. The channel is provided as first argument
      * of the handler, and the event identifier is provided as the second argument. The parameter map carried
      * by the event is provided as the third argument (if present). Handlers must not change the content of
      * this map.
      */
    fnFunction: js.Function,
      /**
      * The object that wants to be notified when the event occurs (`this` context within the handler function).
      * If it is not specified, the handler function is called in the context of the event bus.
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.32.0
      *
      * Attaches an event handler, called one time only, to the event with the given identifier on the given
      * event channel.
      *
      * When the event occurs, the handler function is called and the handler registration is automatically removed
      * afterwards.
      *
      * @returns Returns `this` to allow method chaining
      */
    def subscribeOnce(
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the event bus instance. The channel is provided as first argument
      * of the handler, and the event identifier is provided as the second argument. The parameter map carried
      * by the event is provided as the third argument (if present). Handlers must not change the content of
      * this map.
      */
    fnFunction: js.Function
    ): this.type = js.native
    def subscribeOnce(
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the event bus instance. The channel is provided as first argument
      * of the handler, and the event identifier is provided as the second argument. The parameter map carried
      * by the event is provided as the third argument (if present). Handlers must not change the content of
      * this map.
      */
    fnFunction: js.Function,
      /**
      * The object that wants to be notified when the event occurs (`this` context within the handler function).
      * If it is not specified, the handler function is called in the context of the event bus.
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Removes a previously subscribed event handler from the event with the given identifier on the given event
      * channel.
      *
      * The passed parameters must match those used for registration with {@link #subscribe } beforehand!
      *
      * @returns Returns `this` to allow method chaining
      */
    def unsubscribe(
      /**
      * The channel of the event to unsubscribe from. If not given, the default channel is used.
      */
    sChannelId: String,
      /**
      * The identifier of the event to unsubscribe from
      */
    sEventId: String,
      /**
      * The handler function to unsubscribe from the event
      */
    fnFunction: js.Function
    ): this.type = js.native
    def unsubscribe(
      /**
      * The channel of the event to unsubscribe from. If not given, the default channel is used.
      */
    sChannelId: String,
      /**
      * The identifier of the event to unsubscribe from
      */
    sEventId: String,
      /**
      * The handler function to unsubscribe from the event
      */
    fnFunction: js.Function,
      /**
      * The object that wanted to be notified when the event occurred
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Removes a previously subscribed event handler from the event with the given identifier on the given event
      * channel.
      *
      * The passed parameters must match those used for registration with {@link #subscribe } beforehand!
      *
      * @returns Returns `this` to allow method chaining
      */
    def unsubscribe(
      /**
      * The identifier of the event to unsubscribe from
      */
    sEventId: String,
      /**
      * The handler function to unsubscribe from the event
      */
    fnFunction: js.Function
    ): this.type = js.native
    def unsubscribe(
      /**
      * The identifier of the event to unsubscribe from
      */
    sEventId: String,
      /**
      * The handler function to unsubscribe from the event
      */
    fnFunction: js.Function,
      /**
      * The object that wanted to be notified when the event occurred
      */
    oListener: js.Object
    ): this.type = js.native
  }
}
