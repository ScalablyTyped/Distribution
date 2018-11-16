package typings
package openui5Lib.sapNs.uiNs.coreNs.messageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.message.MessageParser")
@js.native
abstract class MessageParser ()
  extends openui5Lib.sapNs.uiNs.baseNs.Object {
  /**
             * Returns the registered processor on which the events for message handling can be fired
             * @returns The currently set MessageProcessor or null if none is set
            */
  def getProcessor(): js.Any = js.native
  /**
             * Abstract parse method must be implemented in the inheriting class.
            */
  def parse(): scala.Unit = js.native
  /**
             * Abstract parse method must be implemented in the inheriting class.
            */
  def parse(oResponse: js.Any): scala.Unit = js.native
  /**
             * Abstract parse method must be implemented in the inheriting class.
            */
  def parse(oResponse: js.Any, oRequest: js.Any): scala.Unit = js.native
  /**
             * Abstract parse method must be implemented in the inheriting class.
            */
  def parse(oResponse: js.Any, oRequest: js.Any, mGetEntities: js.Any): scala.Unit = js.native
  /**
             * Abstract parse method must be implemented in the inheriting class.
            */
  def parse(oResponse: js.Any, oRequest: js.Any, mGetEntities: js.Any, mChangeEntities: js.Any): scala.Unit = js.native
  /**
             * This method is used by the model to register itself as MessageProcessor for this parser
             * @param oProcessor The MessageProcessor that can be used to fire events
             * @returns Instance reference for method chaining
            */
  def setProcessor(oProcessor: js.Any): js.Any = js.native
}

