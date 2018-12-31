package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the Microsoft.Live.API.Event object.
  */
@js.native
trait IEventAPI extends js.Object {
  /**
    * Adds a handler to an event.
    * @param event Required. The name of the event to which to add a
    *   handler.
    * @param callback Required. Specifies the name of the callback function
    *   to handle the event.
    * @returns This function can return the following errors:
    *   WL.Event.subscribe: The input parameter/property 'callback' must be
    *   included.
    *   WL.Event.subscribe: The input value for parameter/property 'event'
    *   is not valid.
    */
  def subscribe(event: java.lang.String, callback: js.Function): scala.Unit = js.native
  /**
    * Removes a handler from an event.
    * @param event Required. The name of the event from which to remove a
    *   handler.
    * @param callback Optional. Removes the callback function from the
    *   event. If this parameter is omitted or is null, all callback
    *   functions that are registered to the event are removed. Removes the
    *   callback function from the specified event.
    */
  def unsubscribe(event: java.lang.String): scala.Unit = js.native
  def unsubscribe(event: java.lang.String, callback: js.Function): scala.Unit = js.native
}

