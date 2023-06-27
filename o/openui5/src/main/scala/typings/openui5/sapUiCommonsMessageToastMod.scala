package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsMessageToastMod {
  
  @JSImport("sap/ui/commons/MessageToast", JSImport.Default)
  @js.native
  /**
    * Constructor for a new MessageToast.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends MessageToast {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: MessageToastSettings) = this()
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
    mSettings: MessageToastSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: MessageToastSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/MessageToast", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.MessageToast with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, MessageToast]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MessageToast],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.MessageToast.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MessageToast
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:next next} event of this `sap.ui.commons.MessageToast`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.MessageToast` itself.
      *
      * Fired once the `toast()` method is over, so that the MessageBar can "toast" another message if needed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNext(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachNext(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.MessageToast` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:next next} event of this `sap.ui.commons.MessageToast`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.MessageToast` itself.
      *
      * Fired once the `toast()` method is over, so that the MessageBar can "toast" another message if needed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNext(
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
    def attachNext(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.MessageToast` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:next next} event of this `sap.ui.commons.MessageToast`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachNext(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachNext(
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
      * Fires event {@link #event:next next} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireNext(): this.type = js.native
    def fireNext(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAnchorId anchorId}.
      *
      * ID of the anchor on top of which the MessageToast is to render.
      *
      * @returns Value of property `anchorId`
      */
    def getAnchorId(): String = js.native
    
    /**
      * Returns the idle state of the control. Returns true if no message is being toasted.
      */
    def isIdle(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getAnchorId anchorId}.
      *
      * ID of the anchor on top of which the MessageToast is to render.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAnchorId(): this.type = js.native
    def setAnchorId(/**
      * New value for property `anchorId`
      */
    sAnchorId: String): this.type = js.native
    
    /**
      * Triggers the toasting of a message, on top of the MessageBar. If no message is supplied, displays the
      * "Multiple new messages..." message.
      *
      * Receives the list of Messages to be displayed, and re-renders this Control if it is visible.
      */
    def toast(
      /**
      * The Message to be toasted.
      */
    oMessage: typings.openui5.sapUiCommonsMessageMod.default,
      /**
      * DOM ID of the anchor against which the Toast Arrow should align for a given Toast.
      */
    sAnchorId: String
    ): Unit = js.native
  }
  
  trait MessageToast$NextEventParameters extends StObject
  
  type MessageToastNextEvent = typings.openui5.sapUiBaseEventMod.default[MessageToast$NextEventParameters]
  
  type MessageToastNextEventParameters = MessageToast$NextEventParameters
  
  trait MessageToastSettings
    extends StObject
       with ControlSettings {
    
    /**
      * ID of the anchor on top of which the MessageToast is to render.
      */
    var anchorId: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fired once the `toast()` method is over, so that the MessageBar can "toast" another message if needed.
      */
    var next: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
  }
  object MessageToastSettings {
    
    inline def apply(): MessageToastSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageToastSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageToastSettings] (val x: Self) extends AnyVal {
      
      inline def setAnchorId(value: String | PropertyBindingInfo): Self = StObject.set(x, "anchorId", value.asInstanceOf[js.Any])
      
      inline def setAnchorIdUndefined: Self = StObject.set(x, "anchorId", js.undefined)
      
      inline def setNext(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
}
