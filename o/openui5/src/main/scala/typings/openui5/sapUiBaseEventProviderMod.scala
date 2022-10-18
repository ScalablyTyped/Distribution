package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiBaseEventProviderMod {
  
  @JSImport("sap/ui/base/EventProvider", JSImport.Default)
  @js.native
  /**
    * Creates an instance of EventProvider.
    */
  open class default () extends EventProvider
  /* static members */
  object default {
    
    @JSImport("sap/ui/base/EventProvider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.base.EventProvider with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, EventProvider]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, EventProvider],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.base.EventProvider.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait EventProvider
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    /**
      * Attaches an event handler to the event with the given identifier.
      *
      * @returns Returns `this` to allow method chaining
      */
    def attachEvent(
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the event provider instance. The event object ({@link sap.ui.base.Event})
      * is provided as first argument of the handler. Handlers must not change the content of the event. The
      * second argument is the specified `oData` instance (if present).
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachEvent(
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the event provider instance. The event object ({@link sap.ui.base.Event})
      * is provided as first argument of the handler. Handlers must not change the content of the event. The
      * second argument is the specified `oData` instance (if present).
      */
    fnFunction: js.Function,
      /**
      * The object that wants to be notified when the event occurs (`this` context within the handler function).
      * If it is not specified, the handler function is called in the context of the event provider.
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches an event handler to the event with the given identifier.
      *
      * @returns Returns `this` to allow method chaining
      */
    def attachEvent(
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      /**
      * An object that will be passed to the handler along with the event object when the event is fired
      */
    oData: js.Object,
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the event provider instance. The event object ({@link sap.ui.base.Event})
      * is provided as first argument of the handler. Handlers must not change the content of the event. The
      * second argument is the specified `oData` instance (if present).
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachEvent(
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      /**
      * An object that will be passed to the handler along with the event object when the event is fired
      */
    oData: js.Object,
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the event provider instance. The event object ({@link sap.ui.base.Event})
      * is provided as first argument of the handler. Handlers must not change the content of the event. The
      * second argument is the specified `oData` instance (if present).
      */
    fnFunction: js.Function,
      /**
      * The object that wants to be notified when the event occurs (`this` context within the handler function).
      * If it is not specified, the handler function is called in the context of the event provider.
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches an event handler, called one time only, to the event with the given identifier.
      *
      * When the event occurs, the handler function is called and the handler registration is automatically removed
      * afterwards.
      *
      * @returns Returns `this` to allow method chaining
      */
    def attachEventOnce(
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the event provider instance. The event object ({@link sap.ui.base.Event})
      * is provided as first argument of the handler. Handlers must not change the content of the event. The
      * second argument is the specified `oData` instance (if present).
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachEventOnce(
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the event provider instance. The event object ({@link sap.ui.base.Event})
      * is provided as first argument of the handler. Handlers must not change the content of the event. The
      * second argument is the specified `oData` instance (if present).
      */
    fnFunction: js.Function,
      /**
      * The object that wants to be notified when the event occurs (`this` context within the handler function).
      * If it is not specified, the handler function is called in the context of the event provider.
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches an event handler, called one time only, to the event with the given identifier.
      *
      * When the event occurs, the handler function is called and the handler registration is automatically removed
      * afterwards.
      *
      * @returns Returns `this` to allow method chaining
      */
    def attachEventOnce(
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      /**
      * An object that will be passed to the handler along with the event object when the event is fired
      */
    oData: js.Object,
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the event provider instance. The event object ({@link sap.ui.base.Event})
      * is provided as first argument of the handler. Handlers must not change the content of the event. The
      * second argument is the specified `oData` instance (if present).
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachEventOnce(
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      /**
      * An object that will be passed to the handler along with the event object when the event is fired
      */
    oData: js.Object,
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the event provider instance. The event object ({@link sap.ui.base.Event})
      * is provided as first argument of the handler. Handlers must not change the content of the event. The
      * second argument is the specified `oData` instance (if present).
      */
    fnFunction: js.Function,
      /**
      * The object that wants to be notified when the event occurs (`this` context within the handler function).
      * If it is not specified, the handler function is called in the context of the event provider.
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Removes a previously attached event handler from the event with the given identifier.
      *
      * The passed parameters must match those used for registration with {@link #attachEvent} beforehand.
      *
      * @returns Returns `this` to allow method chaining
      */
    def detachEvent(
      /**
      * The identifier of the event to detach from
      */
    sEventId: String,
      /**
      * The handler function to detach from the event
      */
    fnFunction: js.Function
    ): this.type = js.native
    def detachEvent(
      /**
      * The identifier of the event to detach from
      */
    sEventId: String,
      /**
      * The handler function to detach from the event
      */
    fnFunction: js.Function,
      /**
      * The object that wanted to be notified when the event occurred
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Fires an {@link sap.ui.base.Event event} with the given settings and notifies all attached event handlers.
      *
      * @returns Returns `this` to allow method chaining. When `preventDefault` is supported on the fired event
      * the function returns `true` if the default action should be executed, `false` otherwise.
      */
    def fireEvent(/**
      * The identifier of the event to fire
      */
    sEventId: String): this.type | Boolean = js.native
    def fireEvent(
      /**
      * The identifier of the event to fire
      */
    sEventId: String,
      /**
      * Parameters which should be carried by the event
      */
    oParameters: js.Object
    ): this.type | Boolean = js.native
    def fireEvent(
      /**
      * The identifier of the event to fire
      */
    sEventId: String,
      /**
      * Parameters which should be carried by the event
      */
    oParameters: js.Object,
      /**
      * Defines whether function `preventDefault` is supported on the fired event
      */
    bAllowPreventDefault: Boolean
    ): this.type | Boolean = js.native
    def fireEvent(
      /**
      * The identifier of the event to fire
      */
    sEventId: String,
      /**
      * Parameters which should be carried by the event
      */
    oParameters: js.Object,
      /**
      * Defines whether function `preventDefault` is supported on the fired event
      */
    bAllowPreventDefault: Boolean,
      /**
      * Defines whether event bubbling is enabled on the fired event. Set to `true` the event is also forwarded
      * to the parent(s) of the event provider ({@link #getEventingParent}) until the bubbling of the event is
      * stopped or no parent is available anymore.
      */
    bEnableEventBubbling: Boolean
    ): this.type | Boolean = js.native
    def fireEvent(
      /**
      * The identifier of the event to fire
      */
    sEventId: String,
      /**
      * Parameters which should be carried by the event
      */
    oParameters: js.Object,
      /**
      * Defines whether function `preventDefault` is supported on the fired event
      */
    bAllowPreventDefault: Unit,
      /**
      * Defines whether event bubbling is enabled on the fired event. Set to `true` the event is also forwarded
      * to the parent(s) of the event provider ({@link #getEventingParent}) until the bubbling of the event is
      * stopped or no parent is available anymore.
      */
    bEnableEventBubbling: Boolean
    ): this.type | Boolean = js.native
    def fireEvent(
      /**
      * The identifier of the event to fire
      */
    sEventId: String,
      /**
      * Parameters which should be carried by the event
      */
    oParameters: Unit,
      /**
      * Defines whether function `preventDefault` is supported on the fired event
      */
    bAllowPreventDefault: Boolean
    ): this.type | Boolean = js.native
    def fireEvent(
      /**
      * The identifier of the event to fire
      */
    sEventId: String,
      /**
      * Parameters which should be carried by the event
      */
    oParameters: Unit,
      /**
      * Defines whether function `preventDefault` is supported on the fired event
      */
    bAllowPreventDefault: Boolean,
      /**
      * Defines whether event bubbling is enabled on the fired event. Set to `true` the event is also forwarded
      * to the parent(s) of the event provider ({@link #getEventingParent}) until the bubbling of the event is
      * stopped or no parent is available anymore.
      */
    bEnableEventBubbling: Boolean
    ): this.type | Boolean = js.native
    def fireEvent(
      /**
      * The identifier of the event to fire
      */
    sEventId: String,
      /**
      * Parameters which should be carried by the event
      */
    oParameters: Unit,
      /**
      * Defines whether function `preventDefault` is supported on the fired event
      */
    bAllowPreventDefault: Unit,
      /**
      * Defines whether event bubbling is enabled on the fired event. Set to `true` the event is also forwarded
      * to the parent(s) of the event provider ({@link #getEventingParent}) until the bubbling of the event is
      * stopped or no parent is available anymore.
      */
    bEnableEventBubbling: Boolean
    ): this.type | Boolean = js.native
    
    /**
      * Returns the parent in the eventing hierarchy of this object.
      *
      * Per default this returns null, but if eventing is used in objects, which are hierarchically structured,
      * this can be overwritten to make the object hierarchy visible to the eventing and enables the use of event
      * bubbling within this object hierarchy.
      *
      * @returns The parent event provider
      */
    def getEventingParent(): EventProvider | Null = js.native
    
    /**
      * Returns whether there are any registered event handlers for the event with the given identifier.
      *
      * @returns Whether there are any registered event handlers
      */
    def hasListeners(/**
      * The identifier of the event
      */
    sEventId: String): Boolean = js.native
  }
}
