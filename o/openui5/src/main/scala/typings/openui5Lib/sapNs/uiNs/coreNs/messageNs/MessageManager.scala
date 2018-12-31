package typings
package openui5Lib.sapNs.uiNs.coreNs.messageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.message.MessageManager")
@js.native
/**
  * Constructor for a new MessageManager.
  */
class MessageManager ()
  extends openui5Lib.sapNs.uiNs.baseNs.EventProvider {
  def addMessages(vMessages: js.Array[Message]): scala.Unit = js.native
  /**
    * Add messages to MessageManager
    * @param vMessages Array of sap.ui.core.message.Message or single sap.ui.core.message.Message
    */
  def addMessages(vMessages: Message): scala.Unit = js.native
  /**
    * Get the MessageModel
    * @returns oMessageModel The Message Model
    */
  def getMessageModel(): js.Any = js.native
  /**
    * Register MessageProcessor
    * @param oProcessor The MessageProcessor
    */
  def registerMessageProcessor(oProcessor: MessageProcessor): scala.Unit = js.native
  /**
    * Register ManagedObject: Validation and Parse errors are handled by the MessageManager for this
    * object
    * @param oObject The sap.ui.base.ManageObject
    * @param bHandleValidation Handle validation for this object. If set to true validation/parse events
    * creates Messages and cancel event.					If set to false only the event will be canceled, but no
    * messages will be created
    */
  def registerObject(oObject: openui5Lib.sapNs.uiNs.baseNs.ManagedObject, bHandleValidation: scala.Boolean): scala.Unit = js.native
  /**
    * Remove all messages
    */
  def removeAllMessages(): scala.Unit = js.native
  def removeMessages(vMessages: js.Array[Message]): scala.Unit = js.native
  /**
    * Remove given Messages
    * @param vMessages The message(s) to be removed.
    */
  def removeMessages(vMessages: Message): scala.Unit = js.native
  /**
    * Deregister MessageProcessor
    * @param oProcessor The MessageProcessor
    */
  def unregisterMessageProcessor(oProcessor: MessageProcessor): scala.Unit = js.native
  /**
    * Unregister ManagedObject
    * @param oObject The sap.ui.base.ManageObject
    */
  def unregisterObject(oObject: openui5Lib.sapNs.uiNs.baseNs.ManagedObject): scala.Unit = js.native
}

