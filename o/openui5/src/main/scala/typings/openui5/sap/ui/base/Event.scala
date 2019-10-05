package typings.openui5.sap.ui.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.base.Event")
@js.native
class Event protected () extends Object {
  /**
    * Creates an event with the given <code>sId</code>, linked to the provided <code>oSource</code> and
    * enriched with the <code>mParameters</code>.
    * @param sId The id of the event
    * @param oSource The source of the event
    * @param mParameters A map of parameters for this event
    */
  def this(sId: String, oSource: EventProvider, mParameters: js.Any) = this()
  /**
    * Cancel bubbling of the event.<b>Note:</b> This function only has an effect if the bubbling of the
    * event is supported by the event source.
    */
  def cancelBubble(): Unit = js.native
  /**
    * Returns the id of the event.
    * @returns The id of the event
    */
  def getId(): String = js.native
  /**
    * Returns the value of the parameter with the given sName.
    * @param sName The name of the parameter to return
    * @returns The value for the named parameter
    */
  def getParameter(sName: String): js.Any = js.native
  /**
    * Returns all parameter values of the event keyed by their names.
    * @returns All parameters of the event keyed by name
    */
  def getParameters(): js.Any = js.native
  /**
    * Returns the event provider on which the event was fired.
    * @returns The source of the event
    */
  def getSource(): EventProvider = js.native
  /**
    * Prevent the default action of this event.<b>Note:</b> This function only has an effect if preventing
    * the default action of the event is supported by the event source.
    */
  def preventDefault(): Unit = js.native
}

