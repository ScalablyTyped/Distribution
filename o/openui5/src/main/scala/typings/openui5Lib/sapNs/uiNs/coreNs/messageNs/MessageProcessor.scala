package typings
package openui5Lib.sapNs.uiNs.coreNs.messageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.message.MessageProcessor")
@js.native
/**
  * Constructor for a new MessageProcessor
  */
abstract class MessageProcessor ()
  extends openui5Lib.sapNs.uiNs.baseNs.EventProvider {
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
  def checkMessage(): openui5Lib.sapNs.uiNs.modelNs.ListBinding = js.native
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
  def getId(): java.lang.String = js.native
  /**
    * Implement in inheriting classes
    * @param vMessages map of messages: {'target': [array of messages],...}
    */
  def setMessages(vMessages: js.Any): scala.Unit = js.native
}

