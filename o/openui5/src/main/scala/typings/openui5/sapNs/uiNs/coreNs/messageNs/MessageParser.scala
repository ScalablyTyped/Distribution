package typings.openui5.sapNs.uiNs.coreNs.messageNs

import typings.openui5.sapNs.uiNs.baseNs.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.message.MessageParser")
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

