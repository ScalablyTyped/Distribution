package typings.openui5

import typings.openui5.anon.Message
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3NotifierMod {
  
  @JSImport("sap/ui/ux3/Notifier", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Notifier.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Notifier {
    def this(/**
      * initial settings for the new control
      */
    mSettings: NotifierSettings) = this()
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
    mSettings: NotifierSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: NotifierSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/Notifier", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.Notifier with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, Notifier]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Notifier],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.Notifier.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Notifier
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Adds some message to the aggregation {@link #getMessages messages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addMessage(
      /**
      * The message to add; if empty, nothing is inserted
      */
    oMessage: typings.openui5.sapUiCoreMessageMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:messageSelected messageSelected} event of this
      * `sap.ui.ux3.Notifier`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Notifier` itself.
      *
      * Event is fired when a message of the notifiers was selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMessageSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachMessageSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Notifier` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:messageSelected messageSelected} event of this
      * `sap.ui.ux3.Notifier`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Notifier` itself.
      *
      * Event is fired when a message of the notifiers was selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMessageSelected(
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
    def attachMessageSelected(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Notifier` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the messages in the aggregation {@link #getMessages messages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMessages(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:messageSelected messageSelected} event of
      * this `sap.ui.ux3.Notifier`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachMessageSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachMessageSelected(
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:messageSelected messageSelected} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireMessageSelected(): this.type = js.native
    def fireMessageSelected(/**
      * Parameters to pass along with the event
      */
    mParameters: Message): this.type = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Icon of the control that should be displayed within the corresponding bar
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets content of aggregation {@link #getMessages messages}.
      *
      * Messages of this notifier.
      */
    def getMessages(): js.Array[typings.openui5.sapUiCoreMessageMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Defines the title that should be displayed within the opening popup
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * This method checks if the notifier has any items.
      */
    def hasItems(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Message` in the aggregation {@link #getMessages messages}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfMessage(
      /**
      * The message whose index is looked for
      */
    oMessage: typings.openui5.sapUiCoreMessageMod.default
    ): int = js.native
    
    /**
      * Inserts a message into the aggregation {@link #getMessages messages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertMessage(
      /**
      * The message to insert; if empty, nothing is inserted
      */
    oMessage: typings.openui5.sapUiCoreMessageMod.default,
      /**
      * The `0`-based index the message should be inserted at; for a negative value of `iIndex`, the message
      * is inserted at position 0; for a value greater than the current size of the aggregation, the message
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getMessages messages}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllMessages(): js.Array[typings.openui5.sapUiCoreMessageMod.default] = js.native
    
    def removeMessage(/**
      * The message to remove or its index or id
      */
    vMessage: String): typings.openui5.sapUiCoreMessageMod.default | Null = js.native
    /**
      * Removes a message from the aggregation {@link #getMessages messages}.
      *
      * @returns The removed message or `null`
      */
    def removeMessage(/**
      * The message to remove or its index or id
      */
    vMessage: int): typings.openui5.sapUiCoreMessageMod.default | Null = js.native
    def removeMessage(
      /**
      * The message to remove or its index or id
      */
    vMessage: typings.openui5.sapUiCoreMessageMod.default
    ): typings.openui5.sapUiCoreMessageMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Icon of the control that should be displayed within the corresponding bar
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
      * Sets a new value for property {@link #getTitle title}.
      *
      * Defines the title that should be displayed within the opening popup
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
  }
  
  trait NotifierSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Icon of the control that should be displayed within the corresponding bar
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Event is fired when a message of the notifiers was selected.
      */
    var messageSelected: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Messages of this notifier.
      */
    var messages: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreMessageMod.default] | typings.openui5.sapUiCoreMessageMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the title that should be displayed within the opening popup
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object NotifierSettings {
    
    inline def apply(): NotifierSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotifierSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotifierSettings] (val x: Self) extends AnyVal {
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMessageSelected(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "messageSelected", js.Any.fromFunction1(value))
      
      inline def setMessageSelectedUndefined: Self = StObject.set(x, "messageSelected", js.undefined)
      
      inline def setMessages(
        value: js.Array[typings.openui5.sapUiCoreMessageMod.default] | typings.openui5.sapUiCoreMessageMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMessagesVarargs(value: typings.openui5.sapUiCoreMessageMod.default*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
