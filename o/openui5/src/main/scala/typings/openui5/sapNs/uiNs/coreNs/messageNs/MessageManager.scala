package typings.openui5.sapNs.uiNs.coreNs.messageNs

import typings.openui5.sapNs.uiNs.baseNs.EventProvider
import typings.openui5.sapNs.uiNs.baseNs.ManagedObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.message.MessageManager")
@js.native
/**
  * Constructor for a new MessageManager.
  */
class MessageManager () extends EventProvider {
  def addMessages(vMessages: js.Array[typings.openui5.sapNs.uiNs.coreNs.messageNs.Message]): Unit = js.native
  /**
    * Add messages to MessageManager
    * @param vMessages Array of sap.ui.core.message.Message or single sap.ui.core.message.Message
    */
  def addMessages(vMessages: typings.openui5.sapNs.uiNs.coreNs.messageNs.Message): Unit = js.native
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
  def removeMessages(vMessages: js.Array[typings.openui5.sapNs.uiNs.coreNs.messageNs.Message]): Unit = js.native
  /**
    * Remove given Messages
    * @param vMessages The message(s) to be removed.
    */
  def removeMessages(vMessages: typings.openui5.sapNs.uiNs.coreNs.messageNs.Message): Unit = js.native
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

