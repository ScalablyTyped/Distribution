package typings.openui5.sap.ui.core

import typings.openui5.sap.ui.base.EventProvider
import typings.openui5.sap.ui.base.ManagedObject
import typings.openui5.sap.ui.base.Object
import typings.openui5.sap.ui.model.ListBinding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.core.message")
@js.native
object message extends js.Object {
  
  @js.native
  trait ControlMessageProcessor extends MessageProcessor {
    
    /**
      * Check Messages and update controls with messages
      */
    def checkMessages(): Unit = js.native
  }
  
  @js.native
  trait Message extends Object
  
  @js.native
  trait MessageManager extends EventProvider {
    
    def addMessages(vMessages: js.Array[Message]): Unit = js.native
    /**
      * Add messages to MessageManager
      * @param vMessages Array of sap.ui.core.message.Message or single sap.ui.core.message.Message
      */
    def addMessages(vMessages: Message): Unit = js.native
    
    /**
      * Get the MessageModel
      * @returns oMessageModel The Message Model
      */
    def getMessageModel(): js.Any = js.native
    
    /**
      * Register MessageProcessor
      * @param oProcessor The MessageProcessor
      */
    def registerMessageProcessor(oProcessor: MessageProcessor): Unit = js.native
    
    /**
      * Register ManagedObject: Validation and Parse errors are handled by the MessageManager for this
      * object
      * @param oObject The sap.ui.base.ManageObject
      * @param bHandleValidation Handle validation for this object. If set to true validation/parse events
      * creates Messages and cancel event.                    If set to false only the event will be canceled, but no
      * messages will be created
      */
    def registerObject(oObject: ManagedObject, bHandleValidation: Boolean): Unit = js.native
    
    /**
      * Remove all messages
      */
    def removeAllMessages(): Unit = js.native
    
    def removeMessages(vMessages: js.Array[Message]): Unit = js.native
    /**
      * Remove given Messages
      * @param vMessages The message(s) to be removed.
      */
    def removeMessages(vMessages: Message): Unit = js.native
    
    /**
      * Deregister MessageProcessor
      * @param oProcessor The MessageProcessor
      */
    def unregisterMessageProcessor(oProcessor: MessageProcessor): Unit = js.native
    
    /**
      * Unregister ManagedObject
      * @param oObject The sap.ui.base.ManageObject
      */
    def unregisterObject(oObject: ManagedObject): Unit = js.native
  }
  
  @js.native
  trait MessageParser extends Object {
    
    /**
      * Returns the registered processor on which the events for message handling can be fired
      * @returns The currently set MessageProcessor or null if none is set
      */
    def getProcessor(): js.Any = js.native
    
    /**
      * Abstract parse method must be implemented in the inheriting class.
      */
    def parse(): Unit = js.native
    def parse(
      oResponse: js.UndefOr[scala.Nothing],
      oRequest: js.UndefOr[scala.Nothing],
      mGetEntities: js.UndefOr[scala.Nothing],
      mChangeEntities: js.Any
    ): Unit = js.native
    def parse(oResponse: js.UndefOr[scala.Nothing], oRequest: js.UndefOr[scala.Nothing], mGetEntities: js.Any): Unit = js.native
    def parse(
      oResponse: js.UndefOr[scala.Nothing],
      oRequest: js.UndefOr[scala.Nothing],
      mGetEntities: js.Any,
      mChangeEntities: js.Any
    ): Unit = js.native
    def parse(oResponse: js.UndefOr[scala.Nothing], oRequest: js.Any): Unit = js.native
    def parse(
      oResponse: js.UndefOr[scala.Nothing],
      oRequest: js.Any,
      mGetEntities: js.UndefOr[scala.Nothing],
      mChangeEntities: js.Any
    ): Unit = js.native
    def parse(oResponse: js.UndefOr[scala.Nothing], oRequest: js.Any, mGetEntities: js.Any): Unit = js.native
    def parse(
      oResponse: js.UndefOr[scala.Nothing],
      oRequest: js.Any,
      mGetEntities: js.Any,
      mChangeEntities: js.Any
    ): Unit = js.native
    def parse(oResponse: js.Any): Unit = js.native
    def parse(
      oResponse: js.Any,
      oRequest: js.UndefOr[scala.Nothing],
      mGetEntities: js.UndefOr[scala.Nothing],
      mChangeEntities: js.Any
    ): Unit = js.native
    def parse(oResponse: js.Any, oRequest: js.UndefOr[scala.Nothing], mGetEntities: js.Any): Unit = js.native
    def parse(
      oResponse: js.Any,
      oRequest: js.UndefOr[scala.Nothing],
      mGetEntities: js.Any,
      mChangeEntities: js.Any
    ): Unit = js.native
    def parse(oResponse: js.Any, oRequest: js.Any): Unit = js.native
    def parse(
      oResponse: js.Any,
      oRequest: js.Any,
      mGetEntities: js.UndefOr[scala.Nothing],
      mChangeEntities: js.Any
    ): Unit = js.native
    def parse(oResponse: js.Any, oRequest: js.Any, mGetEntities: js.Any): Unit = js.native
    def parse(oResponse: js.Any, oRequest: js.Any, mGetEntities: js.Any, mChangeEntities: js.Any): Unit = js.native
    
    /**
      * This method is used by the model to register itself as MessageProcessor for this parser
      * @param oProcessor The MessageProcessor that can be used to fire events
      * @returns Instance reference for method chaining
      */
    def setProcessor(oProcessor: js.Any): js.Any = js.native
  }
  
  @js.native
  trait MessageProcessor extends EventProvider {
    
    /**
      * Attach event-handler <code>fnFunction</code> to the 'messageChange' event of this
      * <code>sap.ui.core.message.MessageProcessor</code>.<br/>
      * @param oData The object, that should be passed along with the event-object when firing the event.
      * @param fnFunction The function to call, when the event occurs. This function will be called on the  
      *         oListener-instance (if present) or in a 'static way'.
      * @param oListener Object on which to call the given function. If empty, this MessageProcessor is
      * used.
      * @returns <code>this</code> to allow method chaining
      */
    def attachMessageChange(oData: js.Any, fnFunction: js.Any): MessageProcessor = js.native
    def attachMessageChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MessageProcessor = js.native
    
    /**
      * Implement in inheriting classes
      */
    def checkMessage(): ListBinding = js.native
    
    /**
      * Detach event-handler <code>fnFunction</code> from the 'sap.ui.core.message.MessageProcessor' event
      * of this <code>sap.ui.core.message.MessageProcessor</code>.<br/>The passed function and listener
      * object must match the ones previously used for event registration.
      * @param fnFunction The function to call, when the event occurs.
      * @param oListener Object on which the given function had to be called.
      * @returns <code>this</code> to allow method chaining
      */
    def detachMessageChange(fnFunction: js.Any, oListener: js.Any): MessageProcessor = js.native
    
    /**
      * Fire event messageChange to attached listeners.
      * @param mArguments the arguments to pass along with the event.
      * @returns <code>this</code> to allow method chaining
      */
    def fireMessageChange(mArguments: js.Any): MessageProcessor = js.native
    
    /**
      * Returns the ID of the MessageProcessor instance
      * @returns sId The MessageProcessor ID
      */
    def getId(): String = js.native
    
    /**
      * Implement in inheriting classes
      * @param vMessages map of messages: {'target': [array of messages],...}
      */
    def setMessages(vMessages: js.Any): Unit = js.native
  }
}
