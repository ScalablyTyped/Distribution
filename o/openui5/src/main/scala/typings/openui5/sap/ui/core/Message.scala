package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.Instantiable2
import typings.openui5.sap.ui.base.EventProvider
import typings.openui5.sap.ui.base.ManagedObject
import typings.openui5.sap.ui.base.Object
import typings.openui5.sap.ui.model.ListBinding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.Message")
@js.native
class Message protected () extends Element {
  /**
    * Constructor for a new Message.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Compares two given messages with each other.The types of {@link sap.ui.core.MessageType} are ordered
    * from "Error" > "Warning" > "Success" >"Information" > "None".
    * @param oMessage1 first message to compare
    * @param oMessage2 second message to compare
    * @returns returns <code>0</code> if both messages are at        the same level. <code>-1</code> if
    * <code>this</code>        message has a lower level. <code>1</code> if <code>this</code>       
    * message has a higher level.
    */
  def compareByType(
    oMessage1: Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Message],
    oMessage2: Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Message]
  ): Double = js.native
  /**
    * Compares the given message with <code>this</code> message. The types of{@link
    * sap.ui.core.MessageType} are ordered from "Error" > "Warning" > "Success" >"Information" >
    * "None".See  {@link sap.ui.core.Message.compareByType}
    * @param oOther message to compare with this one
    * @returns returns <code>0</code> if both messages are at        the same level. <code>-1</code> if
    * <code>this</code>        message has a lower level. <code>1</code> if <code>this</code>       
    * message has a higher level.
    */
  def compareByType(oOther: Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Message]): Double = js.native
  /**
    * Returns the icon's default URI depending on given size.There are default icons for messages
    * available that can be used this way. If noparameter is given, the size will be 16x16 per default. If
    * larger icons are needed,the parameter "32x32" might be given.
    * @param sSize If parameter is not set the default icon's size will be 16x16. If parameter        is
    * set to "32x32" the icon size will be 32x32.
    * @returns URI of the default icon.
    */
  def getDefaultIcon(sSize: String): js.Any = js.native
  /**
    * Gets current value of property <code>icon</code>.A possible icon URI of the message
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  /**
    * Gets current value of property <code>level</code>.Setting the message's level.Default value is
    * <code>None</code>.
    * @returns Value of property <code>level</code>
    */
  def getLevel(): MessageType = js.native
  /**
    * Gets current value of property <code>readOnly</code>.Determines whether the message should be read
    * only. This helps the application to handle a message a different way if the application
    * differentiates between read-only and common messages.Default value is <code>false</code>.
    * @since 1.19.0
    * @returns Value of property <code>readOnly</code>
    */
  def getReadOnly(): Boolean = js.native
  /**
    * Gets current value of property <code>text</code>.Message text
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  /**
    * Gets current value of property <code>timestamp</code>.Message's timestamp. It is just a simple
    * String that will be used without any transformation. So the application that uses messages needs to
    * format the timestamp to its own needs.
    * @returns Value of property <code>timestamp</code>
    */
  def getTimestamp(): String = js.native
  /**
    * Sets a new value for property <code>icon</code>.A possible icon URI of the messageWhen called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Message] = js.native
  /**
    * Sets a new value for property <code>level</code>.Setting the message's level.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>None</code>.
    * @param sLevel New value for property <code>level</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLevel(sLevel: MessageType): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Message] = js.native
  /**
    * Sets a new value for property <code>readOnly</code>.Determines whether the message should be read
    * only. This helps the application to handle a message a different way if the application
    * differentiates between read-only and common messages.When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @since 1.19.0
    * @param bReadOnly New value for property <code>readOnly</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setReadOnly(bReadOnly: Boolean): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Message] = js.native
  /**
    * Sets a new value for property <code>text</code>.Message textWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: String): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Message] = js.native
  /**
    * Sets a new value for property <code>timestamp</code>.Message's timestamp. It is just a simple String
    * that will be used without any transformation. So the application that uses messages needs to format
    * the timestamp to its own needs.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sTimestamp New value for property <code>timestamp</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTimestamp(sTimestamp: String): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Message] = js.native
}

@JSGlobal("sap.ui.core.message")
@js.native
object message extends js.Object {
  @js.native
  /**
    * Constructor for a new ControlMessageProcessor
    */
  class ControlMessageProcessor () extends MessageProcessor {
    /**
      * Check Messages and update controls with messages
      */
    def checkMessages(): Unit = js.native
  }
  
  @js.native
  class Message protected () extends Object {
    /**
      * Constructor for a new Message.
      * @param mParameters (optional) a map which contains the following parameter properties:
      */
    def this(mParameters: js.Any) = this()
  }
  
  @js.native
  /**
    * Constructor for a new MessageManager.
    */
  class MessageManager () extends EventProvider {
    def addMessages(vMessages: js.Array[typings.openui5.sap.ui.core.message.Message]): Unit = js.native
    /**
      * Add messages to MessageManager
      * @param vMessages Array of sap.ui.core.message.Message or single sap.ui.core.message.Message
      */
    def addMessages(vMessages: typings.openui5.sap.ui.core.message.Message): Unit = js.native
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
      * creates Messages and cancel event.					If set to false only the event will be canceled, but no
      * messages will be created
      */
    def registerObject(oObject: ManagedObject, bHandleValidation: Boolean): Unit = js.native
    /**
      * Remove all messages
      */
    def removeAllMessages(): Unit = js.native
    def removeMessages(vMessages: js.Array[typings.openui5.sap.ui.core.message.Message]): Unit = js.native
    /**
      * Remove given Messages
      * @param vMessages The message(s) to be removed.
      */
    def removeMessages(vMessages: typings.openui5.sap.ui.core.message.Message): Unit = js.native
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
  /**
    * Abstract MessageParser class to be inherited in back-end specific implementations.
    */
  abstract class MessageParser () extends Object {
    /**
      * Returns the registered processor on which the events for message handling can be fired
      * @returns The currently set MessageProcessor or null if none is set
      */
    def getProcessor(): js.Any = js.native
    /**
      * Abstract parse method must be implemented in the inheriting class.
      */
    def parse(): Unit = js.native
    def parse(oResponse: js.Any): Unit = js.native
    def parse(oResponse: js.Any, oRequest: js.Any): Unit = js.native
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
  /**
    * Constructor for a new MessageProcessor
    */
  abstract class MessageProcessor () extends EventProvider {
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

