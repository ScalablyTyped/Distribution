package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the Microsoft.Live.API.Event object.
  */
@js.native
trait IEventAPI extends StObject {
  
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
  def subscribe(event: String, callback: js.Function): Unit = js.native
  
  /**
    * Removes a handler from an event.
    * @param event Required. The name of the event from which to remove a
    *   handler.
    * @param callback Optional. Removes the callback function from the
    *   event. If this parameter is omitted or is null, all callback
    *   functions that are registered to the event are removed. Removes the
    *   callback function from the specified event.
    */
  def unsubscribe(event: String): Unit = js.native
  def unsubscribe(event: String, callback: js.Function): Unit = js.native
}
